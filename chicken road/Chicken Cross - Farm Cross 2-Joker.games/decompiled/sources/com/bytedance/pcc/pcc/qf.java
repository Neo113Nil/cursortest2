package com.bytedance.pcc.pcc;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteStatement;
import android.os.SystemClock;
import com.bytedance.pcc.gm;
import com.bytedance.pcc.pcc;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class qf<T extends com.bytedance.pcc.pcc<?>> {
    private volatile boolean gbb;
    private final sf gm;
    private volatile long hc;
    private final com.bytedance.pcc.sf<T> oo;
    private com.bytedance.pcc.pcc.pcc.pcc ork;
    private volatile long tmg;
    private SQLiteStatement vh;
    private final ArrayList<T> sf = new ArrayList<>();
    private final HashSet<String> vj = new HashSet<>();
    private final HashSet<String> wh = new HashSet<>();
    private final HashSet<String> qf = new HashSet<>();
    private final HashSet<String> kj = new HashSet<>();
    private final AtomicInteger vy = new AtomicInteger(0);
    volatile AtomicInteger pcc = new AtomicInteger(0);

    public qf(sf sfVar, com.bytedance.pcc.sf<T> sfVar2) {
        gm.InterfaceC0115gm qf;
        this.gm = sfVar;
        this.oo = sfVar2;
        if (sfVar2.wh() && (qf = sfVar2.qf()) != null) {
            this.ork = new com.bytedance.pcc.pcc.pcc.pcc(sfVar, kj(), qf);
        }
        if (sfVar.gm().qf() >= sfVar2.pcc()) {
            new StringBuilder("processUploadResultDelayTimeMs should be less than uploadIntervalTimeMs, ").append(sfVar2);
        }
    }

    public com.bytedance.pcc.sf<T> pcc() {
        return this.oo;
    }

    public void pcc(gm gmVar) {
        com.bytedance.pcc.pcc.pcc.pcc pccVar;
        long vj = this.oo.vj();
        if (vj <= 0) {
            return;
        }
        try {
            int delete = gmVar.getWritableDatabase().delete(this.oo.oo(), "create_time < ?", new String[]{String.valueOf(System.currentTimeMillis() - vj)});
            if (delete <= 0 || (pccVar = this.ork) == null) {
                return;
            }
            pccVar.pcc(4, delete);
        } catch (Throwable unused) {
            com.bytedance.pcc.pcc.pcc.pcc pccVar2 = this.ork;
            if (pccVar2 != null) {
                pccVar2.pcc(GamesActivityResultCodes.RESULT_LICENSE_FAILED);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0120, code lost:
    
        if (r0.inTransaction() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00ff, code lost:
    
        r0.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00fd, code lost:
    
        if (r0.inTransaction() != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean pcc(gm.vj vjVar, gm gmVar) {
        ArrayList arrayList;
        com.bytedance.pcc.pcc pccVar;
        byte[] oo;
        synchronized (this.sf) {
            arrayList = new ArrayList(this.sf);
        }
        boolean z = false;
        if (arrayList.isEmpty()) {
            return false;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                try {
                    sQLiteDatabase = gmVar.getWritableDatabase();
                    sQLiteDatabase.beginTransaction();
                    if (this.vh == null) {
                        this.vh = sQLiteDatabase.compileStatement("INSERT OR REPLACE INTO " + this.oo.oo() + "(data_id,data,priority,upload_retry_count,create_time) VALUES (?,?,?,?,?)");
                    }
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        try {
                            pccVar = (com.bytedance.pcc.pcc) arrayList.get(i);
                            oo = pccVar.oo();
                        } catch (Exception unused) {
                            com.bytedance.pcc.pcc.pcc.pcc pccVar2 = this.ork;
                            if (pccVar2 != null) {
                                pccVar2.pcc(12);
                            }
                        }
                        if (oo != null && oo.length != 0) {
                            gm.pcc oo2 = vjVar.oo();
                            if (oo2 != null) {
                                byte[] pcc = oo2.pcc(oo);
                                if (pcc != null) {
                                    com.bytedance.pcc.pcc.pcc.pcc pccVar3 = this.ork;
                                    if (pccVar3 != null) {
                                        pccVar3.pcc(5);
                                    }
                                    oo = pcc;
                                } else {
                                    com.bytedance.pcc.pcc.pcc.pcc pccVar4 = this.ork;
                                    if (pccVar4 != null) {
                                        pccVar4.pcc(6);
                                    }
                                }
                            }
                            this.vh.clearBindings();
                            this.vh.bindString(1, pccVar.wh());
                            this.vh.bindBlob(2, oo);
                            this.vh.bindLong(3, pccVar.sf());
                            this.vh.bindLong(4, pccVar.vj());
                            this.vh.bindLong(5, pccVar.pcc());
                            this.vh.executeInsert();
                        }
                        new StringBuilder("saveEventsToDisk: ignore empty data event ").append(pccVar);
                        com.bytedance.pcc.pcc.pcc.pcc pccVar5 = this.ork;
                        if (pccVar5 != null) {
                            pccVar5.pcc(9);
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    new StringBuilder("saveEventsToDisk: saved ").append(arrayList.size());
                    if (sQLiteDatabase != null) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Exception unused2) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Exception unused3) {
                        }
                    }
                    throw th;
                }
            } catch (SQLiteFullException unused4) {
                new StringBuilder("saveEventsToDisk: database is full, ignore ").append(arrayList.size());
                com.bytedance.pcc.pcc.pcc.pcc pccVar6 = this.ork;
                if (pccVar6 != null) {
                    pccVar6.pcc(GamesActivityResultCodes.RESULT_NETWORK_FAILURE);
                }
                if (sQLiteDatabase != null) {
                }
            } catch (Throwable unused5) {
                com.bytedance.pcc.pcc.pcc.pcc pccVar7 = this.ork;
                if (pccVar7 != null) {
                    pccVar7.pcc(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED);
                }
                if (sQLiteDatabase != null) {
                }
            }
        } catch (Exception unused6) {
        }
        if (z) {
            this.hc = SystemClock.elapsedRealtime();
            this.vy.addAndGet(arrayList.size());
            synchronized (this.sf) {
                this.sf.removeAll(arrayList);
                new StringBuilder("saveEventsToDisk: removed ").append(arrayList.size()).append(" events from memory after saved to disk, deleteSuccess = ");
            }
            qf(gmVar);
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void sf(gm gmVar) {
        ArrayList arrayList = new ArrayList(this.sf.size());
        synchronized (this.sf) {
            int size = this.sf.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(this.sf.get(i));
            }
        }
        synchronized (this.vj) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.bytedance.pcc.pcc pccVar = (com.bytedance.pcc.pcc) it.next();
                if (this.vj.contains(pccVar.wh())) {
                    new StringBuilder("uploadEventFromMemory: ignore uploading event ").append(pccVar);
                    it.remove();
                } else {
                    this.vj.add(pccVar.wh());
                }
            }
        }
        arrayList.size();
        if (arrayList.isEmpty()) {
            return;
        }
        pcc(arrayList, gmVar, false, new gm.sf<T>() { // from class: com.bytedance.pcc.pcc.qf.1
            @Override // com.bytedance.pcc.gm.sf
            public void pcc(ArrayList<T> arrayList2, boolean z) {
                com.bytedance.pcc.sf unused = qf.this.oo;
                arrayList2.size();
                if (z) {
                    synchronized (qf.this.sf) {
                        qf.this.sf.removeAll(arrayList2);
                    }
                }
            }
        });
    }

    public final void pcc(gm gmVar, int i) {
        Cursor cursor;
        String str;
        String[] strArr;
        ArrayList<T> arrayList;
        this.vy.set(0);
        try {
            SQLiteDatabase readableDatabase = gmVar.getReadableDatabase();
            int wh = wh();
            if (this.vj.isEmpty()) {
                str = null;
                strArr = null;
            } else {
                StringBuilder sb = new StringBuilder("data_id NOT IN (");
                ArrayList arrayList2 = new ArrayList();
                synchronized (this.vj) {
                    Iterator<String> it = this.vj.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        if (!arrayList2.isEmpty()) {
                            sb.append(",");
                        }
                        sb.append("?");
                        arrayList2.add(next);
                        if (arrayList2.size() >= wh) {
                            break;
                        }
                    }
                }
                String sb2 = sb.append(")").toString();
                String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
                new StringBuilder("uploadDBEventsToServer: sqlSelection = ").append(sb2).append(", sqlSectionArgs = ");
                Arrays.toString(strArr2);
                str = sb2;
                strArr = strArr2;
            }
            Cursor query = readableDatabase.query(this.oo.oo(), null, str, strArr, null, null, "priority DESC, create_time DESC", String.valueOf(wh * i * 2));
            if (query != null) {
                try {
                    if (!query.moveToFirst()) {
                        new StringBuilder("uploadDBEventsToServer: cursor is empty, ").append(this);
                        if (query != null) {
                            try {
                                query.close();
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                    }
                    int columnIndexOrThrow = query.getColumnIndexOrThrow("data");
                    int columnIndexOrThrow2 = query.getColumnIndexOrThrow("data_id");
                    int columnIndexOrThrow3 = query.getColumnIndexOrThrow(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
                    int columnIndexOrThrow4 = query.getColumnIndexOrThrow("upload_retry_count");
                    ArrayList<T> arrayList3 = new ArrayList<>();
                    int i2 = 0;
                    while (true) {
                        try {
                            String string = query.getString(columnIndexOrThrow2);
                            synchronized (this.vj) {
                                if (!this.vj.contains(string)) {
                                    this.vj.add(string);
                                    byte[] blob = query.getBlob(columnIndexOrThrow);
                                    gm.pcc oo = this.gm.gm().oo();
                                    if (oo != null) {
                                        blob = oo.sf(blob);
                                        com.bytedance.pcc.pcc.pcc.pcc pccVar = this.ork;
                                        if (pccVar != null) {
                                            pccVar.pcc(blob != null ? 7 : 8);
                                        }
                                    }
                                    T pcc = this.oo.pcc(string, blob, query.getInt(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4));
                                    if (pcc == null) {
                                        new StringBuilder("uploadEventsToServer: create event from db failed, data is  ").append(blob);
                                        synchronized (this.vj) {
                                            this.vj.remove(string);
                                        }
                                    } else {
                                        arrayList3.add(pcc);
                                        if (arrayList3.size() >= wh) {
                                            pcc(arrayList3, gmVar, true, null);
                                            i2++;
                                            arrayList = new ArrayList<>();
                                            if (i2 >= i) {
                                                break;
                                            } else {
                                                arrayList3 = arrayList;
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Exception unused2) {
                            com.bytedance.pcc.pcc.pcc.pcc pccVar2 = this.ork;
                            if (pccVar2 != null) {
                                pccVar2.pcc(11);
                            }
                        }
                        if (!query.moveToNext()) {
                            arrayList = arrayList3;
                            break;
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        pcc(arrayList, gmVar, false, null);
                    }
                } catch (Throwable unused3) {
                    cursor = query;
                    try {
                        com.bytedance.pcc.pcc.pcc.pcc pccVar3 = this.ork;
                        if (pccVar3 != null) {
                            pccVar3.pcc(10005);
                        }
                        if (cursor != null) {
                            try {
                                cursor.close();
                                return;
                            } catch (Exception unused4) {
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th) {
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Exception unused5) {
                            }
                        }
                        throw th;
                    }
                }
            }
            if (query != null) {
                try {
                    query.close();
                } catch (Exception unused6) {
                }
            }
        } catch (Throwable unused7) {
            cursor = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void pcc(ArrayList<T> arrayList, gm gmVar, final boolean z, final gm.sf<T> sfVar) {
        new StringBuilder("performUploadEvent: start upload ").append(arrayList.size()).append(" events, ").append(this);
        this.tmg = SystemClock.elapsedRealtime();
        this.oo.pcc(arrayList, new gm.sf<T>() { // from class: com.bytedance.pcc.pcc.qf.2
            @Override // com.bytedance.pcc.gm.sf
            public void pcc(ArrayList<T> arrayList2, boolean z2) {
                qf.this.gbb = z2;
                int size = arrayList2.size();
                com.bytedance.pcc.sf unused = qf.this.oo;
                boolean z3 = z || qf.this.hc > qf.this.tmg;
                if (z2) {
                    boolean z4 = qf.this.pcc.get() > 0;
                    qf.this.pcc.set(0);
                    qf.this.pcc(arrayList2);
                    qf.this.gm.pcc(qf.this, z3, true, z4);
                } else {
                    qf.this.pcc.getAndAdd(1);
                    qf.this.sf(arrayList2);
                    qf.this.gm.pcc(qf.this, z3, false, false);
                }
                gm.sf sfVar2 = sfVar;
                if (sfVar2 != null) {
                    sfVar2.pcc(arrayList2, z2);
                }
                if (!z2 || qf.this.ork == null) {
                    return;
                }
                qf.this.ork.pcc(2, size);
            }
        });
    }

    private void qf(gm gmVar) {
        HashSet hashSet;
        SQLiteDatabase sQLiteDatabase;
        if (this.wh.isEmpty()) {
            return;
        }
        synchronized (this.wh) {
            hashSet = new HashSet(this.wh);
            this.wh.clear();
        }
        try {
            sQLiteDatabase = gmVar.getWritableDatabase();
        } catch (Throwable unused) {
            sQLiteDatabase = null;
        }
        try {
            sQLiteDatabase.beginTransaction();
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (sQLiteDatabase.delete(this.oo.oo(), "data_id = ?", new String[]{str}) == 0) {
                    hashSet2.add(str);
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
            new StringBuilder("retryDeleteEvents: finish deleted ").append(hashSet.size()).append(" , failed ");
            hashSet2.size();
            if (sQLiteDatabase != null) {
                try {
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                } catch (Exception unused2) {
                }
            }
        } catch (Throwable unused3) {
            try {
                com.bytedance.pcc.pcc.pcc.pcc pccVar = this.ork;
                if (pccVar != null) {
                    pccVar.pcc(10002);
                }
                if (sQLiteDatabase != null) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception unused4) {
                    }
                }
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception unused5) {
                    }
                }
                throw th;
            }
        }
    }

    private void pcc(gm gmVar, ArrayList<String> arrayList, boolean z) {
        SQLiteDatabase sQLiteDatabase;
        boolean z2 = false;
        try {
            sQLiteDatabase = gmVar.getWritableDatabase();
        } catch (Throwable unused) {
            sQLiteDatabase = null;
        }
        try {
            sQLiteDatabase.beginTransaction();
            HashSet hashSet = new HashSet();
            StringBuilder sb = new StringBuilder("(");
            String[] strArr = new String[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                strArr[i] = arrayList.get(i);
                if (i > 0) {
                    sb.append(",");
                }
                sb.append("?");
            }
            sb.append(")");
            if (sQLiteDatabase.delete(this.oo.oo(), "data_id in ".concat(String.valueOf(sb)), strArr) == 0) {
                hashSet.addAll(arrayList);
            } else {
                z2 = true;
            }
            sQLiteDatabase.setTransactionSuccessful();
            new StringBuilder("deleteDBEvents: finish deleted ").append(arrayList.size() - hashSet.size()).append(" , failed ");
            hashSet.size();
            if (z && !hashSet.isEmpty()) {
                synchronized (this.wh) {
                    this.wh.addAll(hashSet);
                }
            }
            if (sQLiteDatabase != null) {
                try {
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                } catch (Exception unused2) {
                }
            }
        } catch (Throwable unused3) {
            if (z && !z2) {
                try {
                    synchronized (this.wh) {
                        this.wh.addAll(arrayList);
                    }
                } catch (Throwable th) {
                    if (sQLiteDatabase != null) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Exception unused4) {
                        }
                    }
                    throw th;
                }
            }
            com.bytedance.pcc.pcc.pcc.pcc pccVar = this.ork;
            if (pccVar != null) {
                pccVar.pcc(10001);
            }
            if (sQLiteDatabase != null) {
                try {
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                } catch (Exception unused5) {
                }
            }
        }
    }

    private void pcc(gm gmVar, ArrayList<String> arrayList) {
        try {
            SQLiteDatabase writableDatabase = gmVar.getWritableDatabase();
            StringBuilder sb = new StringBuilder("(");
            String[] strArr = new String[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                strArr[i] = arrayList.get(i);
                if (i > 0) {
                    sb.append(",");
                }
                sb.append("?");
            }
            sb.append(")");
            writableDatabase.execSQL("UPDATE " + this.oo.oo() + " SET upload_retry_count = upload_retry_count+1 WHERE data_id IN " + ((Object) sb), strArr);
            new StringBuilder("updateUploadedFailedEventStatsByEventIds: updated ").append(arrayList.size());
        } catch (Throwable unused) {
            com.bytedance.pcc.pcc.pcc.pcc pccVar = this.ork;
            if (pccVar != null) {
                pccVar.pcc(10000);
            }
        }
    }

    public int pcc(T t) {
        int size;
        synchronized (this.sf) {
            this.sf.add(t);
            size = this.sf.size();
        }
        if (t.sf() == 1) {
            return 6;
        }
        return size > sf() ? 2 : 1;
    }

    public int sf() {
        int vy = (int) (this.oo.vy() * vj.pcc(true));
        if (vy <= 0) {
            return 1;
        }
        return vy;
    }

    public int gm() {
        return this.sf.size();
    }

    public com.bytedance.pcc.pcc.pcc.pcc oo() {
        return this.ork;
    }

    public final long vj() {
        long pcc = (long) (this.oo.pcc() * vj.pcc(false));
        if (pcc <= 0 || pcc > 600000) {
            pcc = 15000;
        }
        if (this.pcc.get() < 2) {
            return pcc;
        }
        long min = (long) Math.min(600000.0d, Math.pow(2.0d, this.pcc.get()) * pcc);
        this.pcc.get();
        return min;
    }

    public final int wh() {
        int sf = (int) (this.oo.sf() * vj.pcc(true));
        if (sf <= 0) {
            return 100;
        }
        return sf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x003d, code lost:
    
        if (r10 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        if (r10 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        r10.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int gm(gm gmVar) {
        Cursor cursor;
        try {
            cursor = gmVar.getReadableDatabase().query(this.oo.oo(), new String[]{"count(*)"}, null, null, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        int i = cursor.getInt(0);
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Exception unused) {
                            }
                        }
                        return i;
                    }
                } catch (Throwable unused2) {
                    try {
                        com.bytedance.pcc.pcc.pcc.pcc pccVar = this.ork;
                        if (pccVar != null) {
                            pccVar.pcc(10007);
                        }
                    } catch (Throwable th) {
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Exception unused3) {
                            }
                        }
                        throw th;
                    }
                }
            }
        } catch (Throwable unused4) {
            cursor = null;
        }
        return 0;
    }

    public String qf() {
        return this.oo.gm();
    }

    public String kj() {
        return this.oo.oo();
    }

    public boolean vy() {
        return !this.vj.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(ArrayList<T> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        synchronized (this.qf) {
            for (int i = 0; i < arrayList.size(); i++) {
                this.qf.add(arrayList.get(i).wh());
            }
        }
        this.gm.pcc(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(ArrayList<T> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        synchronized (this.kj) {
            for (int i = 0; i < arrayList.size(); i++) {
                this.kj.add(arrayList.get(i).wh());
            }
        }
        this.gm.sf(this);
    }

    public void oo(gm gmVar) {
        ArrayList<String> arrayList;
        synchronized (this.qf) {
            arrayList = new ArrayList<>(this.qf);
            this.qf.clear();
        }
        pcc(gmVar, arrayList, false);
        synchronized (this.vj) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                this.vj.remove(it.next());
            }
        }
    }

    public void vj(gm gmVar) {
        ArrayList<String> arrayList;
        synchronized (this.kj) {
            arrayList = new ArrayList<>(this.kj);
            this.kj.clear();
        }
        pcc(gmVar, arrayList);
        synchronized (this.vj) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                this.vj.remove(it.next());
            }
        }
    }

    public boolean ork() {
        return this.gbb && this.vy.get() >= this.oo.kj();
    }

    public long vh() {
        long ork = (long) (this.oo.ork() * vj.pcc(true));
        if (ork <= 0) {
            return 100L;
        }
        return ork;
    }

    public void wh(final gm gmVar) {
        this.vy.set(0);
        int wh = wh();
        int gm = gm(gmVar);
        int ceil = (int) Math.ceil((gm * 1.0f) / wh);
        new StringBuilder("try to upload: dbDataCount = ").append(gm).append(", maxCountOnceUpload = ").append(wh).append(", uploadTaskCount = ").append(ceil).append(", eventProcessor = ").append(this.oo);
        for (int i = 0; i < ceil; i++) {
            final int i2 = i * wh;
            try {
                gm.oo sf = this.gm.gm().sf();
                ExecutorService sf2 = sf != null ? sf.sf() : null;
                if (sf2 == null) {
                    sf2 = com.bytedance.pcc.pcc.sf.pcc.pcc();
                }
                sf2.submit(new com.bytedance.pcc.pcc.sf.sf() { // from class: com.bytedance.pcc.pcc.qf.3
                    @Override // com.bytedance.pcc.pcc.sf.sf
                    public void pcc(long j) {
                        com.bytedance.pcc.sf unused = qf.this.oo;
                        qf.this.sf(gmVar, i2);
                    }
                });
            } catch (Exception unused) {
                com.bytedance.pcc.pcc.pcc.pcc pccVar = this.ork;
                if (pccVar != null) {
                    pccVar.pcc(10);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00dd, code lost:
    
        r15.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00db, code lost:
    
        if (r15 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00eb, code lost:
    
        if (r15 != null) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sf(gm gmVar, int i) {
        Cursor cursor;
        ArrayList<T> arrayList = new ArrayList<>();
        boolean z = true;
        try {
            SQLiteDatabase readableDatabase = gmVar.getReadableDatabase();
            int wh = wh();
            cursor = readableDatabase.query(this.oo.oo(), null, null, null, null, null, "priority DESC, create_time DESC", i + "," + wh);
            if (cursor != null) {
                try {
                    if (!cursor.moveToFirst()) {
                        new StringBuilder("uploadDBEventsToServerFromOffset: cursor is empty, ").append(this);
                        if (cursor != null) {
                            try {
                                cursor.close();
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                    }
                    if (cursor.getCount() < wh) {
                        z = false;
                    }
                    int columnIndexOrThrow = cursor.getColumnIndexOrThrow("data");
                    int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("data_id");
                    int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
                    int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("upload_retry_count");
                    do {
                        String string = cursor.getString(columnIndexOrThrow2);
                        synchronized (this.vj) {
                            if (!this.vj.contains(string)) {
                                this.vj.add(string);
                                byte[] blob = cursor.getBlob(columnIndexOrThrow);
                                gm.pcc oo = this.gm.gm().oo();
                                if (oo != null) {
                                    blob = oo.sf(blob);
                                    com.bytedance.pcc.pcc.pcc.pcc pccVar = this.ork;
                                    if (pccVar != null) {
                                        pccVar.pcc(blob != null ? 7 : 8);
                                    }
                                }
                                T pcc = this.oo.pcc(string, blob, cursor.getInt(columnIndexOrThrow3), cursor.getInt(columnIndexOrThrow4));
                                if (pcc == null) {
                                    new StringBuilder("uploadDBEventsToServerFromOffset: create event from db failed, data is  ").append(blob);
                                    synchronized (this.vj) {
                                        this.vj.remove(string);
                                    }
                                } else {
                                    arrayList.add(pcc);
                                }
                            }
                        }
                    } while (cursor.moveToNext());
                } catch (Throwable unused2) {
                    try {
                        com.bytedance.pcc.pcc.pcc.pcc pccVar2 = this.ork;
                        if (pccVar2 != null) {
                            pccVar2.pcc(10005);
                        }
                    } catch (Throwable th) {
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Exception unused3) {
                            }
                        }
                        throw th;
                    }
                }
            }
        } catch (Throwable unused4) {
            cursor = null;
        }
        if (!arrayList.isEmpty()) {
            pcc(arrayList, gmVar, z, null);
        } else {
            new StringBuilder("uploadDBEventsToServerFromOffset: event list is empty, ").append(this);
        }
    }
}
