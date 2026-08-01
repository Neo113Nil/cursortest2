package com.bytedance.sdk.openadsdk.oo;

import com.bytedance.sdk.openadsdk.oo.gm.pcc;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class sf {
    public static final String pcc = pcc.InterfaceC0192pcc.pcc;
    public static final String sf = pcc.InterfaceC0192pcc.sf;
    public static final String gm = pcc.InterfaceC0192pcc.gm;
    public static final String oo = pcc.InterfaceC0192pcc.oo;
    public static final String vj = pcc.InterfaceC0192pcc.vj;
    public static final String wh = pcc.InterfaceC0192pcc.wh;
    public static final Set<String> qf = new HashSet(Arrays.asList("click", "show", "insight_log"));

    public static class pcc {
        public static String gm = "direct";
        public static String oo = "saLandingPageLinks";
        public static String pcc = "openDetailPage";
        public static String sf = "openAdLandPageLinks";
    }

    /* renamed from: com.bytedance.sdk.openadsdk.oo.sf$sf, reason: collision with other inner class name */
    public static class C0198sf {
        public static int gm = 100;
        public static int pcc = 1;
        public static int sf = 2;
    }

    public static boolean pcc(String str) {
        return "embeded_ad".equals(str) || "banner_ad".equals(str) || "interaction".equals(str) || "slide_banner_ad".equals(str);
    }
}
