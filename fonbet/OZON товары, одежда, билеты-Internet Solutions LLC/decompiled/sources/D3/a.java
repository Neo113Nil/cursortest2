package D3;

import D3.p;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import j3.C7251G;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m3.N;
import o3.C8634a;
import o3.InterfaceC8635b;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static final String f5611d = i(3, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f5612e = {"id", "mime_type", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8635b f5613a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f5614b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private boolean f5615c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D3.a$a, reason: collision with other inner class name */
    static final class C0129a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final Cursor f5616a;

        C0129a(Cursor cursor) {
            this.f5616a = cursor;
        }

        @Override // D3.d
        public final c V() {
            return a.f(this.f5616a);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f5616a.close();
        }

        public final int getPosition() {
            return this.f5616a.getPosition();
        }

        public final boolean moveToPosition(int i11) {
            return this.f5616a.moveToPosition(i11);
        }
    }

    public a(InterfaceC8635b interfaceC8635b) {
        this.f5613a = interfaceC8635b;
    }

    private static ArrayList b(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            int i11 = N.f74289a;
            for (String str2 : str.split(",", -1)) {
                String[] split = str2.split("\\.", -1);
                G10.a.h(split.length == 3);
                arrayList.add(new C7251G(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2])));
            }
        }
        return arrayList;
    }

    private void c() throws C8634a {
        synchronized (this.f5614b) {
            if (this.f5615c) {
                return;
            }
            try {
                int a11 = o3.d.a(this.f5613a.getReadableDatabase(), 0, "");
                if (a11 != 3) {
                    SQLiteDatabase writableDatabase = this.f5613a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        o3.d.b(writableDatabase, 0, "", 3);
                        ArrayList j11 = a11 == 2 ? j(writableDatabase) : new ArrayList();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS ExoPlayerDownloads");
                        writableDatabase.execSQL("CREATE TABLE ExoPlayerDownloads (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        Iterator it = j11.iterator();
                        while (it.hasNext()) {
                            l((c) it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                this.f5615c = true;
            } catch (SQLException e11) {
                throw new C8634a(e11);
            }
        }
    }

    private Cursor d(String str, String[] strArr) throws C8634a {
        try {
            return this.f5613a.getReadableDatabase().query("ExoPlayerDownloads", f5612e, str, strArr, null, null, "start_time_ms ASC");
        } catch (SQLiteException e11) {
            throw new C8634a(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c f(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        p.b bVar = new p.b(Uri.parse(string2), string);
        bVar.e(cursor.getString(1));
        bVar.f(b(cursor.getString(3)));
        if (blob.length <= 0) {
            blob = null;
        }
        bVar.d(blob);
        bVar.b(cursor.getString(4));
        bVar.c(cursor.getBlob(5));
        p a11 = bVar.a();
        o oVar = new o();
        oVar.f5700a = cursor.getLong(13);
        oVar.f5701b = cursor.getFloat(12);
        int i11 = cursor.getInt(6);
        return new c(a11, i11, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i11 == 4 ? cursor.getInt(11) : 0, oVar);
    }

    private static c g(Cursor cursor) {
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        p.b bVar = new p.b(Uri.parse(string2), string);
        String string3 = cursor.getString(1);
        bVar.e("dash".equals(string3) ? "application/dash+xml" : "hls".equals(string3) ? "application/x-mpegURL" : "ss".equals(string3) ? "application/vnd.ms-sstr+xml" : "video/x-unknown");
        bVar.f(b(cursor.getString(3)));
        bVar.b(cursor.getString(4));
        bVar.c(cursor.getBlob(5));
        p a11 = bVar.a();
        o oVar = new o();
        oVar.f5700a = cursor.getLong(13);
        oVar.f5701b = cursor.getFloat(12);
        int i11 = cursor.getInt(6);
        return new c(a11, i11, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i11 == 4 ? cursor.getInt(11) : 0, oVar);
    }

    private static String i(int... iArr) {
        if (iArr.length == 0) {
            return "1";
        }
        StringBuilder sb2 = new StringBuilder("state IN (");
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (i11 > 0) {
                sb2.append(',');
            }
            sb2.append(iArr[i11]);
        }
        sb2.append(')');
        return sb2.toString();
    }

    private ArrayList j(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!N.e0(sQLiteDatabase, "ExoPlayerDownloads")) {
            return arrayList;
        }
        Cursor query = sQLiteDatabase.query("ExoPlayerDownloads", new String[]{"id", SelectionItemFormDTO.TITLE_FIELD_NAME, "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(g(query));
            } finally {
            }
        }
        query.close();
        return arrayList;
    }

    private void l(c cVar, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = cVar.f5620a.f5706e;
        if (bArr == null) {
            bArr = N.f74291c;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", cVar.f5620a.f5702a);
        contentValues.put("mime_type", cVar.f5620a.f5704c);
        contentValues.put("uri", cVar.f5620a.f5703b.toString());
        List<C7251G> list = cVar.f5620a.f5705d;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            C7251G c7251g = list.get(i11);
            sb2.append(c7251g.f68934a);
            sb2.append('.');
            sb2.append(c7251g.f68935b);
            sb2.append('.');
            sb2.append(c7251g.f68936c);
            sb2.append(',');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        contentValues.put("stream_keys", sb2.toString());
        contentValues.put("custom_cache_key", cVar.f5620a.f5707f);
        contentValues.put("data", cVar.f5620a.f5708g);
        contentValues.put("state", Integer.valueOf(cVar.f5621b));
        contentValues.put("start_time_ms", Long.valueOf(cVar.f5622c));
        contentValues.put("update_time_ms", Long.valueOf(cVar.f5623d));
        contentValues.put("content_length", Long.valueOf(cVar.f5624e));
        contentValues.put("stop_reason", Integer.valueOf(cVar.f5625f));
        contentValues.put("failure_reason", Integer.valueOf(cVar.f5626g));
        contentValues.put("percent_downloaded", Float.valueOf(cVar.f5627h.f5701b));
        contentValues.put("bytes_downloaded", Long.valueOf(cVar.f5627h.f5700a));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow("ExoPlayerDownloads", null, contentValues);
    }

    public final c e(String str) throws C8634a {
        c();
        try {
            Cursor d11 = d("id = ?", new String[]{str});
            try {
                if (d11.getCount() == 0) {
                    d11.close();
                    return null;
                }
                d11.moveToNext();
                c f7 = f(d11);
                d11.close();
                return f7;
            } finally {
            }
        } catch (SQLiteException e11) {
            throw new C8634a(e11);
        }
    }

    public final d h(int... iArr) throws C8634a {
        c();
        return new C0129a(d(i(iArr), null));
    }

    public final void k(c cVar) throws C8634a {
        c();
        try {
            l(cVar, this.f5613a.getWritableDatabase());
        } catch (SQLiteException e11) {
            throw new C8634a(e11);
        }
    }

    public final void m(String str) throws C8634a {
        c();
        try {
            this.f5613a.getWritableDatabase().delete("ExoPlayerDownloads", "id = ?", new String[]{str});
        } catch (SQLiteException e11) {
            throw new C8634a(e11);
        }
    }

    public final void n() throws C8634a {
        c();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.f5613a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, "state = 2", null);
        } catch (SQLException e11) {
            throw new C8634a(e11);
        }
    }

    public final void o() throws C8634a {
        c();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.f5613a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, null, null);
        } catch (SQLException e11) {
            throw new C8634a(e11);
        }
    }

    public final void p(int i11) throws C8634a {
        c();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i11));
            this.f5613a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, f5611d, null);
        } catch (SQLException e11) {
            throw new C8634a(e11);
        }
    }

    public final void q(int i11, String str) throws C8634a {
        c();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i11));
            this.f5613a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, f5611d + " AND id = ?", new String[]{str});
        } catch (SQLException e11) {
            throw new C8634a(e11);
        }
    }
}
