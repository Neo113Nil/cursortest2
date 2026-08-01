package com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc extends gm {
    private final Context gm;
    private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc oo;
    protected List<String> pcc;

    public byte gm() {
        return (byte) 2;
    }

    public byte oo() {
        return (byte) 0;
    }

    public pcc(Context context, com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar) {
        super(context);
        this.pcc = new ArrayList();
        this.gm = context;
        this.oo = pccVar;
        if (pccVar == null) {
            this.oo = com.bytedance.sdk.component.wh.pcc.oo.sf.pcc.gm();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r0 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r0 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int pcc() {
        Cursor cursor = null;
        int i = 0;
        try {
            cursor = com.bytedance.sdk.component.wh.pcc.pcc.pcc.gm.pcc(vj(), sf(), new String[]{"count(1)"}, null, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                i = cursor.getInt(0);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
        return i;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.gm
    public String sf() {
        com.bytedance.sdk.component.wh.pcc.pcc.vj gm = com.bytedance.sdk.component.wh.pcc.qf.wh().gm();
        if (gm != null) {
            return gm.sf();
        }
        return null;
    }

    public List<com.bytedance.sdk.component.wh.pcc.oo.pcc> pcc(int i, String str) {
        String str2;
        String[] strArr;
        byte b;
        String str3;
        Cursor pcc;
        long pcc2 = com.bytedance.sdk.component.wh.pcc.sf.pcc.pcc(i, vj());
        sf();
        if (pcc2 <= 0) {
            pcc2 = 1;
        } else if (pcc2 > 100) {
            pcc2 = 100;
        }
        String str4 = str + " DESC limit " + pcc2;
        ArrayList arrayList = new ArrayList();
        this.pcc.clear();
        long dax = com.bytedance.sdk.component.wh.pcc.qf.wh().dax();
        if (dax > 0) {
            strArr = new String[]{String.valueOf(System.currentTimeMillis() - dax)};
            str2 = "gen_time>?";
        } else {
            str2 = null;
            strArr = null;
        }
        if (com.bytedance.sdk.component.wh.pcc.gm.pcc.oo() && oo() == 3) {
            b = 3;
            pcc = com.bytedance.sdk.component.wh.pcc.pcc.pcc.gm.pcc(vj(), sf(), new String[]{"id", "value", "encrypt", "channel"}, str2, strArr, null, null, str4);
            str3 = "id";
        } else {
            b = 3;
            str3 = "id";
            pcc = com.bytedance.sdk.component.wh.pcc.pcc.pcc.gm.pcc(vj(), sf(), new String[]{"id", "value", "encrypt"}, str2, strArr, null, null, str4);
        }
        if (pcc != null) {
            try {
                com.bytedance.sdk.component.wh.pcc.vj jr = com.bytedance.sdk.component.wh.pcc.qf.wh().jr();
                while (pcc.moveToNext()) {
                    try {
                        String string = pcc.getString(pcc.getColumnIndex(str3));
                        String string2 = pcc.getString(pcc.getColumnIndex("value"));
                        int i2 = pcc.getInt(pcc.getColumnIndex("encrypt"));
                        int i3 = (com.bytedance.sdk.component.wh.pcc.gm.pcc.oo() && oo() == b) ? pcc.getInt(pcc.getColumnIndex("channel")) : 0;
                        if (i2 == 1) {
                            try {
                                string2 = jr.pcc(string2);
                            } catch (Throwable th) {
                                th = th;
                                th.getMessage();
                            }
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.pcc.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(string2);
                            com.bytedance.sdk.component.wh.pcc.oo.pcc.pcc pccVar = new com.bytedance.sdk.component.wh.pcc.oo.pcc.pcc(string, jSONObject);
                            pccVar.sf(oo());
                            pccVar.gm(gm());
                            if (com.bytedance.sdk.component.wh.pcc.gm.pcc.oo() && oo() == b) {
                                pccVar.pcc(i3);
                            }
                            com.bytedance.sdk.component.wh.pcc.gm.pcc.pcc(jSONObject, pccVar);
                            arrayList.add(pccVar);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (pcc != null) {
                    try {
                        pcc.close();
                        if (!this.pcc.isEmpty()) {
                            pcc(this.pcc);
                            this.pcc.clear();
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th3) {
                if (pcc != null) {
                    try {
                        pcc.close();
                        if (!this.pcc.isEmpty()) {
                            pcc(this.pcc);
                            this.pcc.clear();
                        }
                    } catch (Exception unused2) {
                    }
                }
                throw th3;
            }
        }
        sf();
        arrayList.size();
        return arrayList;
    }

    public List<com.bytedance.sdk.component.wh.pcc.oo.pcc> pcc(String str) {
        com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar = this.oo;
        if (pccVar == null) {
            return new ArrayList();
        }
        return pcc(pccVar.sf(), str);
    }

    protected void pcc(List<String> list) {
        sf();
        list.size();
        com.bytedance.sdk.component.wh.pcc.pcc.pcc.gm.pcc(vj(), "DELETE FROM " + sf() + " WHERE " + pcc("id", list, 1000, true));
        com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.hoh(), list.size());
        gm(list);
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
        if (j > 0 || i > 0) {
            com.bytedance.sdk.component.wh.pcc.pcc.pcc.gm.pcc(vj(), sf(), "gen_time <? OR retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j), String.valueOf(i)});
            sf();
        }
    }

    public boolean pcc(int i) {
        if (this.oo == null) {
            return false;
        }
        int pcc = pcc();
        int pcc2 = this.oo.pcc();
        sf();
        return (com.bytedance.sdk.component.wh.pcc.gm.pcc.gm() && (i == 1 || i == 2)) ? pcc > 0 : pcc >= pcc2;
    }

    public static String sf(String str) {
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
