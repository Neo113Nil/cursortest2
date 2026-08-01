package com.bytedance.sdk.openadsdk.lu;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.sdk.component.kj.pcc.wh;
import com.bytedance.sdk.openadsdk.BusMonitorDependWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class pcc {
    private static Context oo;
    private Boolean kj;
    private com.bytedance.sdk.openadsdk.lu.gm.pcc qf;
    private sf wh;
    public static final long pcc = com.bytedance.sdk.openadsdk.lu.oo.pcc.pcc();
    private static final String[] sf = {"_id", "sdk_version", "scene", "start_count", "success_count", "fail_count", "rit", "tag", "label", "timestamp", "mediation", "is_init", "extra"};
    private static final long gm = System.currentTimeMillis();
    private final ArrayList<oo> vj = new ArrayList<>();
    private final Runnable vy = new Runnable() { // from class: com.bytedance.sdk.openadsdk.lu.pcc.1
        @Override // java.lang.Runnable
        public void run() {
            if (!pcc.this.oo() || pcc.this.vj.isEmpty()) {
                return;
            }
            pcc pccVar = pcc.this;
            pccVar.pcc(pccVar.vj);
            pcc.this.vj.clear();
        }
    };
    private int ork = 0;
    private final Runnable vh = new Runnable() { // from class: com.bytedance.sdk.openadsdk.lu.pcc.4
        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            try {
                SQLiteDatabase sf2 = com.bytedance.sdk.openadsdk.lu.pcc.pcc.sf();
                if (sf2 != null) {
                    String[] strArr = {String.valueOf(pcc.this.wh.getOnceLogInterval() < 86400000 ? pcc.gm : pcc.pcc)};
                    int max = Math.max(10, pcc.this.wh.getOnceLogCount());
                    int i7 = max > 100 ? 10 : max;
                    Cursor query = sf2.query("monitor_table", pcc.sf, "timestamp < ?", strArr, null, null, null, String.valueOf(i7));
                    if (query != null) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex = query.getColumnIndex("_id");
                        int columnIndex2 = query.getColumnIndex("sdk_version");
                        int columnIndex3 = query.getColumnIndex("scene");
                        int columnIndex4 = query.getColumnIndex("start_count");
                        int columnIndex5 = query.getColumnIndex("success_count");
                        int columnIndex6 = query.getColumnIndex("fail_count");
                        int columnIndex7 = query.getColumnIndex("rit");
                        int columnIndex8 = query.getColumnIndex("tag");
                        int columnIndex9 = query.getColumnIndex("label");
                        int columnIndex10 = query.getColumnIndex("timestamp");
                        int columnIndex11 = query.getColumnIndex("mediation");
                        int i8 = i7;
                        int columnIndex12 = query.getColumnIndex("is_init");
                        try {
                            int columnIndex13 = query.getColumnIndex("extra");
                            while (query.moveToNext()) {
                                ArrayList arrayList3 = arrayList;
                                com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                                if (columnIndex >= 0) {
                                    i = columnIndex11;
                                    i2 = columnIndex10;
                                    long j = query.getLong(columnIndex);
                                    pccVar.pcc(j);
                                    arrayList2.add(String.valueOf(j));
                                } else {
                                    i = columnIndex11;
                                    i2 = columnIndex10;
                                }
                                if (columnIndex2 >= 0) {
                                    pccVar.pcc(query.getString(columnIndex2));
                                }
                                if (columnIndex3 >= 0) {
                                    pccVar.sf(query.getString(columnIndex3));
                                }
                                if (columnIndex4 >= 0) {
                                    pccVar.pcc(query.getInt(columnIndex4));
                                }
                                if (columnIndex5 >= 0) {
                                    pccVar.sf(query.getInt(columnIndex5));
                                }
                                if (columnIndex6 >= 0) {
                                    pccVar.gm(query.getInt(columnIndex6));
                                }
                                if (columnIndex7 >= 0) {
                                    pccVar.gm(query.getString(columnIndex7));
                                }
                                if (columnIndex8 >= 0) {
                                    pccVar.oo(query.getString(columnIndex8));
                                }
                                if (columnIndex9 >= 0) {
                                    pccVar.vj(query.getString(columnIndex9));
                                }
                                if (i2 >= 0) {
                                    i3 = columnIndex;
                                    i4 = i2;
                                    i5 = columnIndex2;
                                    pccVar.sf(query.getLong(i4));
                                } else {
                                    i3 = columnIndex;
                                    i4 = i2;
                                    i5 = columnIndex2;
                                }
                                if (i >= 0) {
                                    i6 = i;
                                    pccVar.wh(query.getString(i6));
                                } else {
                                    i6 = i;
                                }
                                if (columnIndex12 >= 0) {
                                    pccVar.oo(query.getInt(columnIndex12));
                                }
                                if (columnIndex13 >= 0) {
                                    pccVar.qf(query.getString(columnIndex13));
                                }
                                arrayList3.add(pccVar);
                                arrayList = arrayList3;
                                columnIndex2 = i5;
                                int i9 = i4;
                                columnIndex11 = i6;
                                columnIndex = i3;
                                columnIndex10 = i9;
                            }
                            ArrayList arrayList4 = arrayList;
                            query.close();
                            if (arrayList4.isEmpty()) {
                                return;
                            }
                            pcc.this.wh.onMonitorUpload(arrayList4);
                            SQLiteDatabase pcc2 = com.bytedance.sdk.openadsdk.lu.pcc.pcc.pcc();
                            if (pcc2 != null && pcc2.isOpen()) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("_id IN (");
                                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                                    sb.append("?");
                                    if (i10 < arrayList2.size() - 1) {
                                        sb.append(",");
                                    }
                                }
                                sb.append(")");
                                pcc2.delete("monitor_table", sb.toString(), (String[]) arrayList2.toArray(new String[0]));
                                if (pcc.this.qf != null) {
                                    pcc.this.qf.pcc(pcc.gm);
                                }
                            }
                            if (arrayList4.size() < i8 || pcc.this.ork > 1000) {
                                return;
                            }
                            pcc.this.pcc(false);
                        } catch (Throwable unused) {
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    };

    static /* synthetic */ int oo(pcc pccVar) {
        int i = pccVar.ork;
        pccVar.ork = i + 1;
        return i;
    }

    private pcc(sf sfVar) {
        try {
            this.wh = new BusMonitorDependWrapper(sfVar);
            this.qf = new com.bytedance.sdk.openadsdk.lu.gm.pcc(sfVar.getContext());
            oo = sfVar.getContext();
        } catch (Throwable unused) {
        }
    }

    public static pcc pcc(sf sfVar) {
        return new pcc(sfVar);
    }

    public static Context pcc() {
        Context context = oo;
        return context != null ? context : BusMonitorDependWrapper.getReflectContext();
    }

    public void pcc(final oo ooVar) {
        if (ooVar == null || !oo()) {
            return;
        }
        final wh handler = this.wh.getHandler();
        handler.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lu.pcc.2
            @Override // java.lang.Runnable
            public void run() {
                pcc.this.vj.add(ooVar);
                if (pcc.this.vj.size() >= 10) {
                    handler.sf(pcc.this.vy);
                    pcc pccVar = pcc.this;
                    pccVar.pcc(pccVar.vj);
                    pcc.this.vj.clear();
                }
            }
        });
        handler.sf(this.vy);
        handler.pcc(this.vy, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean oo() {
        if (this.kj == null) {
            sf sfVar = this.wh;
            this.kj = Boolean.valueOf((sfVar == null || sfVar.getContext() == null || !this.wh.isMonitorOpen() || this.wh.getHandler() == null) ? false : true);
        }
        return this.kj.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(List<oo> list) {
        com.bytedance.sdk.openadsdk.lu.sf.pcc pcc2;
        if (list == null || list.isEmpty()) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase pcc3 = com.bytedance.sdk.openadsdk.lu.pcc.pcc.pcc();
            if (pcc3 != null) {
                try {
                    pcc3.beginTransaction();
                    for (int i = 0; i < list.size(); i++) {
                        oo ooVar = list.get(i);
                        if (ooVar != null && (pcc2 = ooVar.pcc()) != null) {
                            Cursor query = pcc3.query("monitor_table", sf, "sdk_version = ? AND scene = ? AND rit = ? AND tag = ? AND label = ? AND mediation = ? AND is_init = ? AND timestamp = ? AND extra = ?", new String[]{pcc2.sf(), pcc2.gm(), pcc2.qf(), pcc2.kj(), pcc2.vy(), pcc2.vh(), String.valueOf(pcc2.tmg()), String.valueOf(pcc2.ork()), pcc2.hc()}, null, null, null);
                            if (query != null) {
                                if (query.moveToNext()) {
                                    int columnIndex = query.getColumnIndex("_id");
                                    if (columnIndex >= 0) {
                                        pcc2.pcc(query.getLong(columnIndex));
                                    }
                                    int columnIndex2 = query.getColumnIndex("start_count");
                                    if (columnIndex2 >= 0) {
                                        pcc2.pcc(query.getInt(columnIndex2) + pcc2.oo());
                                    }
                                    int columnIndex3 = query.getColumnIndex("success_count");
                                    if (columnIndex3 >= 0) {
                                        pcc2.sf(query.getInt(columnIndex3) + pcc2.vj());
                                    }
                                    int columnIndex4 = query.getColumnIndex("fail_count");
                                    if (columnIndex4 >= 0) {
                                        pcc2.gm(query.getInt(columnIndex4) + pcc2.wh());
                                    }
                                }
                                query.close();
                            }
                            ContentValues contentValues = new ContentValues();
                            if (pcc2.pcc() > 0) {
                                contentValues.put("_id", Long.valueOf(pcc2.pcc()));
                            }
                            contentValues.put("sdk_version", pcc2.sf());
                            contentValues.put("scene", pcc2.gm());
                            contentValues.put("start_count", Integer.valueOf(pcc2.oo()));
                            contentValues.put("success_count", Integer.valueOf(pcc2.vj()));
                            contentValues.put("fail_count", Integer.valueOf(pcc2.wh()));
                            contentValues.put("rit", pcc2.qf());
                            contentValues.put("tag", pcc2.kj());
                            contentValues.put("label", pcc2.vy());
                            contentValues.put("timestamp", Long.valueOf(pcc2.ork()));
                            contentValues.put("mediation", pcc2.vh());
                            contentValues.put("is_init", Integer.valueOf(pcc2.tmg()));
                            contentValues.put("extra", pcc2.hc());
                            pcc3.insertWithOnConflict("monitor_table", null, contentValues, 5);
                        }
                    }
                    pcc3.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase = pcc3;
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                            return;
                        } catch (Throwable unused2) {
                            return;
                        }
                    }
                    return;
                }
            }
            if (pcc3 != null) {
                try {
                    pcc3.endTransaction();
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public void pcc(final boolean z) {
        final wh handler = this.wh.getHandler();
        sf sfVar = this.wh;
        if (sfVar == null || handler == null || sfVar.getContext() == null || this.qf == null || !oo()) {
            return;
        }
        handler.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lu.pcc.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    pcc.oo(pcc.this);
                    if (z) {
                        long pcc2 = pcc.this.qf.pcc();
                        if (pcc2 == 0) {
                            pcc.this.qf.pcc(System.currentTimeMillis());
                            return;
                        } else if (com.bytedance.sdk.openadsdk.lu.oo.pcc.pcc(pcc2) && System.currentTimeMillis() - pcc2 < pcc.this.wh.getUploadIntervalTime()) {
                            return;
                        }
                    }
                    handler.pcc(pcc.this.vh);
                } catch (Throwable unused) {
                }
            }
        }, Math.max(this.wh.getOnceLogInterval(), 10000));
    }
}
