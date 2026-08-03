package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Vh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1104Vh implements java.lang.Runnable {
    public static byte[] A03;
    public final /* synthetic */ com.facebook.ads.redexgen.core.T8 A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1107Vk A01;
    public final /* synthetic */ java.lang.String A02;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 28);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-66, -58, -72, -6, -5, 5, 6, 1, 4, com.google.common.base.Ascii.VT, 3, -10, 1, 0, 3, 5, -6, -1, -8, -38, -51, -39, -35, -51, -37, -36, -57, -47, -52};
    }

    public RunnableC1104Vh(com.facebook.ads.redexgen.core.C1107Vk c1107Vk, java.lang.String str, com.facebook.ads.redexgen.core.T8 t8) {
        this.A01 = c1107Vk;
        this.A02 = str;
        this.A00 = t8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List list;
        java.util.List list2;
        java.util.ArrayList arrayList;
        java.util.List list3;
        int i;
        int i2;
        int i3;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            com.facebook.ads.redexgen.core.C1049Te nvl = new com.facebook.ads.redexgen.core.C1049Te(A00(0, 3, 84));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONObject.put(A00(3, 7, 118), jSONArray);
            jSONObject.put(A00(19, 10, 76), this.A02);
            list = this.A01.A0D;
            synchronized (list) {
                list2 = this.A01.A0D;
                arrayList = new java.util.ArrayList(list2);
                list3 = this.A01.A0D;
                list3.clear();
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.facebook.ads.redexgen.core.C1106Vj c1106Vj = (com.facebook.ads.redexgen.core.C1106Vj) it.next();
                java.lang.StringBuilder append = new java.lang.StringBuilder().append(A00(0, 0, 23));
                i = c1106Vj.A00;
                java.lang.StringBuilder append2 = append.append(i).append(';');
                i2 = c1106Vj.A02;
                java.lang.StringBuilder append3 = append2.append(i2).append(';');
                i3 = c1106Vj.A01;
                jSONArray.put(append3.append(i3).toString());
            }
            nvl.A07(jSONObject);
            nvl.A05(1);
            this.A00.A08().ABD(A00(10, 9, 117), com.facebook.ads.redexgen.core.AbstractC1048Td.A2R, nvl);
        } catch (org.json.JSONException unused) {
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
