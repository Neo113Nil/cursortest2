package com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class qf extends gm {
    private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc gm;
    protected List<String> pcc;

    public byte gm() {
        return (byte) 2;
    }

    public byte pcc() {
        return (byte) 1;
    }

    public qf(Context context, com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar) {
        super(context);
        this.pcc = new ArrayList();
        this.gm = pccVar;
        if (pccVar == null) {
            this.gm = com.bytedance.sdk.component.wh.pcc.oo.sf.pcc.gm();
        }
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.gm
    protected long wh() {
        return com.bytedance.sdk.component.wh.pcc.qf.pcc.sf();
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.gm
    public String sf() {
        return com.bytedance.sdk.component.wh.pcc.qf.wh().gm().oo();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (r1 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r1 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int oo() {
        Cursor cursor;
        int i = 0;
        try {
            cursor = com.bytedance.sdk.component.wh.pcc.pcc.pcc.gm.pcc(vj(), sf(), new String[]{"count(1)"}, null, null, null, null, null);
            if (cursor != null) {
                try {
                    cursor.moveToFirst();
                    i = cursor.getInt(0);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        return i;
    }

    public List<com.bytedance.sdk.component.wh.pcc.oo.pcc> pcc(int i, String str) {
        long pcc = com.bytedance.sdk.component.wh.pcc.sf.pcc.pcc(i, vj());
        if (pcc <= 0) {
            pcc = 1;
        } else if (pcc > 100) {
            pcc = 100;
        }
        ArrayList arrayList = new ArrayList();
        this.pcc.clear();
        Cursor pcc2 = com.bytedance.sdk.component.wh.pcc.pcc.pcc.gm.pcc(vj(), sf(), new String[]{"id", "value", "encrypt"}, null, null, null, null, str + " DESC limit " + pcc);
        if (pcc2 != null) {
            while (pcc2.moveToNext()) {
                try {
                    try {
                        String string = pcc2.getString(pcc2.getColumnIndex("id"));
                        String string2 = pcc2.getString(pcc2.getColumnIndex("value"));
                        if (pcc2.getInt(pcc2.getColumnIndex("encrypt")) == 1) {
                            string2 = com.bytedance.sdk.component.wh.pcc.qf.wh().jr().pcc(string2);
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.pcc.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            com.bytedance.sdk.component.wh.pcc.oo.pcc.pcc pccVar = new com.bytedance.sdk.component.wh.pcc.oo.pcc.pcc(string, new JSONObject(string2));
                            pccVar.gm(gm());
                            pccVar.sf(pcc());
                            arrayList.add(pccVar);
                        }
                    } catch (Throwable unused) {
                    }
                } catch (Throwable th) {
                    if (pcc2 != null) {
                        try {
                            pcc2.close();
                            if (!this.pcc.isEmpty()) {
                                pcc(this.pcc);
                                this.pcc.clear();
                            }
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
            }
            if (pcc2 != null) {
                try {
                    pcc2.close();
                    if (!this.pcc.isEmpty()) {
                        pcc(this.pcc);
                        this.pcc.clear();
                    }
                } catch (Exception unused3) {
                }
            }
        }
        return arrayList;
    }

    protected void pcc(List<String> list) {
        sf();
        list.size();
        com.bytedance.sdk.component.wh.pcc.pcc.pcc.gm.pcc(vj(), "DELETE FROM " + sf() + " WHERE " + pcc("id", list, 1000, true));
        com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.hoh(), list.size());
        gm(list);
    }

    public List<com.bytedance.sdk.component.wh.pcc.oo.pcc> sf(String str) {
        com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar = this.gm;
        if (pccVar == null) {
            return new ArrayList();
        }
        return pcc(pccVar.sf(), str);
    }

    public void sf(List<com.bytedance.sdk.component.wh.pcc.oo.pcc> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar : list) {
            linkedList.add(pccVar.gm());
            com.bytedance.sdk.component.wh.pcc.gm.pcc.ork(pccVar);
        }
        sf();
        linkedList.size();
        com.bytedance.sdk.component.wh.pcc.pcc.pcc.gm.pcc(vj(), "DELETE FROM " + sf() + " WHERE " + pcc("id", linkedList, 1000, true));
        gm(linkedList);
    }

    public void pcc(int i, long j) {
        sf(i, j);
    }

    private void sf(int i, long j) {
        com.bytedance.sdk.component.wh.pcc.pcc.pcc.gm.pcc(vj(), sf(), "gen_time <? AND retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j), String.valueOf(i)});
    }

    public boolean pcc(int i) {
        return this.gm != null && oo() >= this.gm.pcc();
    }

    public static String gm(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    private static String pcc(String str, List<?> list, int i, boolean z) {
        int i2;
        String str2 = z ? " IN " : " NOT IN ";
        String str3 = z ? " OR " : " AND ";
        int min = Math.min(i, 1000);
        int size = list.size();
        if (size % min == 0) {
            i2 = size / min;
        } else {
            i2 = (size / min) + 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * min;
            String pcc = pcc(TextUtils.join("','", list.subList(i4, Math.min(i4 + min, size))), "");
            if (i3 != 0) {
                sb.append(str3);
            }
            sb.append(str).append(str2).append("('").append(pcc).append("')");
        }
        return pcc(sb.toString(), str + str2 + "('')");
    }

    private static String pcc(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
