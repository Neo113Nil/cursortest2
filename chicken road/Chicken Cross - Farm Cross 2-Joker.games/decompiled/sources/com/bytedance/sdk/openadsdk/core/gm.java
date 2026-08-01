package com.bytedance.sdk.openadsdk.core;

/* loaded from: classes4.dex */
public class gm {
    private static volatile gm pcc;

    private gm() {
    }

    public static gm pcc() {
        if (pcc == null) {
            synchronized (gm.class) {
                if (pcc == null) {
                    pcc = new gm();
                }
            }
        }
        return pcc;
    }

    public void pcc(String str, String str2) {
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("ttopenadsdk", str, str2);
    }

    public String sf(String str, String str2) {
        return com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf("ttopenadsdk", str, str2);
    }

    public void pcc(String str, int i) {
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("ttopenadsdk", str, Integer.valueOf(i));
    }

    public int sf(String str, int i) {
        return com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("ttopenadsdk", str, i);
    }

    public void pcc(String str, long j) {
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("ttopenadsdk", str, Long.valueOf(j));
    }

    public Long sf(String str, long j) {
        return Long.valueOf(com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("ttopenadsdk", str, j));
    }

    public void pcc(String str) {
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("ttopenadsdk", str);
    }
}
