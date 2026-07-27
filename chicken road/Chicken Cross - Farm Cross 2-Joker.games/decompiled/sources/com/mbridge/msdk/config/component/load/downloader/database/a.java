package com.mbridge.msdk.config.component.load.downloader.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.load.downloader.database.c;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.tools.q0;
import java.net.URL;

/* compiled from: DatabaseHelper.java */
/* loaded from: classes6.dex */
public class a implements com.mbridge.msdk.config.component.load.downloader.database.c {

    /* renamed from: a, reason: collision with root package name */
    private final d f9012a;
    private final Handler b;
    private final String c = com.mbridge.msdk.config.component.database.c.TABLE_FILE_DB;
    private volatile SQLiteDatabase d;

    /* compiled from: DatabaseHelper.java */
    /* renamed from: com.mbridge.msdk.config.component.load.downloader.database.a$a, reason: collision with other inner class name */
    class RunnableC1359a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f9013a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        RunnableC1359a(c.a aVar, String str, String str2) {
            this.f9013a = aVar;
            this.b = str;
            this.c = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00cb A[Catch: all -> 0x00db, TRY_LEAVE, TryCatch #1 {all -> 0x00db, blocks: (B:30:0x00c7, B:32:0x00cb), top: B:29:0x00c7 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            Cursor cursor;
            c.a aVar;
            c.a aVar2;
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.d)) {
                a aVar3 = a.this;
                aVar3.d = aVar3.f9012a.getWritableDatabase();
            }
            com.mbridge.msdk.config.component.load.downloader.database.b bVar = null;
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.d) || !a.this.d.isOpen()) {
                if (com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f9013a)) {
                    this.f9013a.a(null);
                    return;
                }
                return;
            }
            try {
                String str = this.b;
                if (TextUtils.isEmpty(str)) {
                    try {
                        URL url = new URL(this.c);
                        str = url.getProtocol() + "://" + url.getHost() + url.getPath();
                    } catch (Throwable th) {
                        q0.b(IDatabaseHelper.TAG, th.getMessage());
                    }
                }
                Cursor rawQuery = a.this.d.rawQuery("SELECT * FROM " + a.this.c + " WHERE cacheKey = ? AND status = 1 LIMIT 1", new String[]{str});
                if (rawQuery != null) {
                    try {
                        if (rawQuery.moveToFirst()) {
                            bVar = com.mbridge.msdk.config.component.load.downloader.database.b.a(rawQuery);
                        }
                    } catch (Exception e) {
                        cursor = rawQuery;
                        e = e;
                        try {
                            if (MBridgeConstans.DEBUG) {
                            }
                            if (cursor != null) {
                            }
                            aVar2 = this.f9013a;
                            if (aVar2 == null) {
                            }
                            aVar2.a(bVar);
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            aVar = this.f9013a;
                            if (aVar != null) {
                                aVar.a(null);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        cursor = rawQuery;
                        th = th3;
                        if (cursor != null) {
                        }
                        aVar = this.f9013a;
                        if (aVar != null) {
                        }
                        throw th;
                    }
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                aVar2 = this.f9013a;
                if (aVar2 == null) {
                    return;
                }
            } catch (Exception e2) {
                e = e2;
                cursor = null;
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
                if (cursor != null) {
                    cursor.close();
                }
                aVar2 = this.f9013a;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a(bVar);
            } catch (Throwable th4) {
                th = th4;
                cursor = null;
                if (cursor != null) {
                }
                aVar = this.f9013a;
                if (aVar != null) {
                }
                throw th;
            }
            aVar2.a(bVar);
        }
    }

    /* compiled from: DatabaseHelper.java */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.b f9014a;

        b(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
            this.f9014a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.d)) {
                a aVar = a.this;
                aVar.d = aVar.f9012a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.d) || !a.this.d.isOpen()) {
                return;
            }
            try {
                try {
                    a.this.d.beginTransaction();
                    a.this.d.insertWithOnConflict(a.this.c, null, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f9014a), 4);
                    a.this.d.setTransactionSuccessful();
                    try {
                        if (a.this.d.inTransaction()) {
                            a.this.d.endTransaction();
                        }
                    } catch (Throwable th) {
                        q0.b(IDatabaseHelper.TAG, th.getMessage());
                    }
                } catch (Exception e) {
                    q0.b(IDatabaseHelper.TAG, e.getMessage());
                    try {
                        if (a.this.d.inTransaction()) {
                            a.this.d.endTransaction();
                        }
                    } catch (Throwable th2) {
                        q0.b(IDatabaseHelper.TAG, th2.getMessage());
                    }
                }
            } catch (Throwable th3) {
                try {
                    if (a.this.d.inTransaction()) {
                        a.this.d.endTransaction();
                    }
                } catch (Throwable th4) {
                    q0.b(IDatabaseHelper.TAG, th4.getMessage());
                }
                throw th3;
            }
        }
    }

    /* compiled from: DatabaseHelper.java */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.b f9015a;

        c(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
            this.f9015a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.d)) {
                a aVar = a.this;
                aVar.d = aVar.f9012a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.d) || !a.this.d.isOpen()) {
                return;
            }
            try {
                if (!TextUtils.isEmpty(this.f9015a.b())) {
                    a.this.d.update(a.this.c, com.mbridge.msdk.config.component.load.downloader.database.b.b(this.f9015a), "cacheKey = ? ", new String[]{this.f9015a.b()});
                } else if (!TextUtils.isEmpty(this.f9015a.f())) {
                    a.this.d.update(a.this.c, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f9015a), "originalURL = ? ", new String[]{this.f9015a.f()});
                }
            } catch (Exception e) {
                q0.b(IDatabaseHelper.TAG, e.getMessage());
            }
        }
    }

    public a(Handler handler, d dVar) {
        this.b = handler;
        this.f9012a = dVar;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(String str, String str2, c.a aVar) {
        this.b.post(new RunnableC1359a(aVar, str2, str));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
        this.b.postAtFrontOfQueue(new b(bVar));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar, String str) {
        this.b.post(new c(bVar));
    }
}
