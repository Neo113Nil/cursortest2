package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.3h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C04033h {
    public static byte[] A0R;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public java.util.HashMap<com.facebook.ads.redexgen.core.C2159pg, com.facebook.ads.redexgen.core.C2157pe> A0G;
    public java.util.HashSet<java.lang.Integer> A0H;
    public java.util.List<java.lang.String> A0I;
    public java.util.List<java.lang.String> A0J;
    public java.util.List<java.lang.String> A0K;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public java.util.List<java.lang.String> A0L;
    public java.util.List<java.lang.String> A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;

    static {
        A0P();
    }

    public static java.lang.String A0H(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0R, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 34);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0P() {
        A0R = new byte[]{63, kotlin.io.encoding.Base64.padSymbol, 44, 40, 53, 51, 50, 53, 50, 59};
    }

    @java.lang.Deprecated
    public C04033h() {
        this.A06 = Integer.MAX_VALUE;
        this.A05 = Integer.MAX_VALUE;
        this.A04 = Integer.MAX_VALUE;
        this.A03 = Integer.MAX_VALUE;
        this.A0F = Integer.MAX_VALUE;
        this.A0E = Integer.MAX_VALUE;
        this.A0Q = true;
        this.A0M = com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A01();
        this.A0D = 0;
        this.A0L = com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A01();
        this.A0I = com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A01();
        this.A0B = 0;
        this.A02 = Integer.MAX_VALUE;
        this.A01 = Integer.MAX_VALUE;
        this.A0J = com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A01();
        this.A0K = com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A01();
        this.A0C = 0;
        this.A00 = 0;
        this.A0P = false;
        this.A0O = false;
        this.A0N = false;
        this.A0G = new java.util.HashMap<>();
        this.A0H = new java.util.HashSet<>();
    }

    public C04033h(android.content.Context context) {
        this();
        A0n(context);
        A0o(context, true);
    }

    public C04033h(android.os.Bundle bundle) {
        java.util.List A01;
        this.A06 = bundle.getInt(com.facebook.ads.redexgen.core.C2155pc.A0e, com.facebook.ads.redexgen.core.C2155pc.A0U.A06);
        this.A05 = bundle.getInt(com.facebook.ads.redexgen.core.C2155pc.A0d, com.facebook.ads.redexgen.core.C2155pc.A0U.A05);
        this.A04 = bundle.getInt(com.facebook.ads.redexgen.core.C2155pc.A0c, com.facebook.ads.redexgen.core.C2155pc.A0U.A04);
        this.A03 = bundle.getInt(com.facebook.ads.redexgen.core.C2155pc.A0b, com.facebook.ads.redexgen.core.C2155pc.A0U.A03);
        this.A0A = bundle.getInt(com.facebook.ads.redexgen.core.C2155pc.A0i, com.facebook.ads.redexgen.core.C2155pc.A0U.A0A);
        this.A09 = bundle.getInt(com.facebook.ads.redexgen.core.C2155pc.A0h, com.facebook.ads.redexgen.core.C2155pc.A0U.A09);
        this.A08 = bundle.getInt(com.facebook.ads.redexgen.core.C2155pc.A0n(), com.facebook.ads.redexgen.core.C2155pc.A0U.A08);
        this.A07 = bundle.getInt(com.facebook.ads.redexgen.core.C2155pc.A0f, com.facebook.ads.redexgen.core.C2155pc.A0U.A07);
        this.A0F = bundle.getInt(com.facebook.ads.redexgen.core.C2155pc.A0v, com.facebook.ads.redexgen.core.C2155pc.A0U.A0F);
        this.A0E = bundle.getInt(com.facebook.ads.redexgen.core.C2155pc.A0t, com.facebook.ads.redexgen.core.C2155pc.A0U.A0E);
        this.A0Q = bundle.getBoolean(com.facebook.ads.redexgen.core.C2155pc.A0u, com.facebook.ads.redexgen.core.C2155pc.A0U.A0Q);
        this.A0M = com.facebook.ads.redexgen.core.BP.A07((java.lang.String[]) com.facebook.ads.redexgen.core.AbstractC1859ka.A00(bundle.getStringArray(com.facebook.ads.redexgen.core.C2155pc.A0p), new java.lang.String[0]));
        this.A0D = bundle.getInt(com.facebook.ads.redexgen.core.C2155pc.A0q, com.facebook.ads.redexgen.core.C2155pc.A0U.A0D);
        java.lang.String[] preferredVideoLanguages1 = (java.lang.String[]) com.facebook.ads.redexgen.core.AbstractC1859ka.A00(bundle.getStringArray(com.facebook.ads.redexgen.core.C2155pc.A0o), new java.lang.String[0]);
        this.A0L = A0G(preferredVideoLanguages1);
        java.lang.String[] preferredVideoLanguages12 = new java.lang.String[0];
        this.A0I = A0G((java.lang.String[]) com.facebook.ads.redexgen.core.AbstractC1859ka.A00(bundle.getStringArray(com.facebook.ads.redexgen.core.C2155pc.A0j), preferredVideoLanguages12));
        this.A0B = bundle.getInt(com.facebook.ads.redexgen.core.C2155pc.A0l, com.facebook.ads.redexgen.core.C2155pc.A0U.A0B);
        this.A02 = bundle.getInt(com.facebook.ads.redexgen.core.C2155pc.A0a, com.facebook.ads.redexgen.core.C2155pc.A0U.A02);
        this.A01 = bundle.getInt(com.facebook.ads.redexgen.core.C2155pc.A0Z, com.facebook.ads.redexgen.core.C2155pc.A0U.A01);
        java.lang.String[] preferredVideoLanguages13 = new java.lang.String[0];
        this.A0J = com.facebook.ads.redexgen.core.BP.A07((java.lang.String[]) com.facebook.ads.redexgen.core.AbstractC1859ka.A00(bundle.getStringArray(com.facebook.ads.redexgen.core.C2155pc.A0k), preferredVideoLanguages13));
        java.lang.String[] preferredVideoLanguages14 = new java.lang.String[0];
        this.A0K = A0G((java.lang.String[]) com.facebook.ads.redexgen.core.AbstractC1859ka.A00(bundle.getStringArray(com.facebook.ads.redexgen.core.C2155pc.A0m), preferredVideoLanguages14));
        this.A0C = bundle.getInt(com.facebook.ads.redexgen.core.C2155pc.A0n, com.facebook.ads.redexgen.core.C2155pc.A0U.A0C);
        this.A00 = bundle.getInt(com.facebook.ads.redexgen.core.C2155pc.A0e(), com.facebook.ads.redexgen.core.C2155pc.A0U.A00);
        this.A0P = bundle.getBoolean(com.facebook.ads.redexgen.core.C2155pc.A0s, com.facebook.ads.redexgen.core.C2155pc.A0U.A0P);
        this.A0O = bundle.getBoolean(com.facebook.ads.redexgen.core.C2155pc.A0X, com.facebook.ads.redexgen.core.C2155pc.A0U.A0O);
        this.A0N = bundle.getBoolean(com.facebook.ads.redexgen.core.C2155pc.A0W, com.facebook.ads.redexgen.core.C2155pc.A0U.A0N);
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(com.facebook.ads.redexgen.core.C2155pc.A0r);
        if (parcelableArrayList == null) {
            A01 = com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A01();
        } else {
            A01 = com.facebook.ads.redexgen.core.AnonymousClass44.A01(com.facebook.ads.redexgen.core.C2157pe.A02, parcelableArrayList);
        }
        this.A0G = new java.util.HashMap<>();
        for (int i = 0; i < A01.size(); i++) {
            com.facebook.ads.redexgen.core.C2157pe c2157pe = (com.facebook.ads.redexgen.core.C2157pe) A01.get(i);
            this.A0G.put(c2157pe.A00, c2157pe);
        }
        int[] iArr = (int[]) com.facebook.ads.redexgen.core.AbstractC1859ka.A00(bundle.getIntArray(com.facebook.ads.redexgen.core.C2155pc.A0V), new int[0]);
        this.A0H = new java.util.HashSet<>();
        for (int i2 : iArr) {
            this.A0H.add(java.lang.Integer.valueOf(i2));
        }
    }

    public C04033h(com.facebook.ads.redexgen.core.C2155pc c2155pc) {
        A0R(c2155pc);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<java.lang.String> */
    public static com.facebook.ads.redexgen.core.BP<java.lang.String> A0G(java.lang.String[] strArr) {
        com.facebook.ads.redexgen.core.C2K A01 = com.facebook.ads.redexgen.core.BP.A01();
        for (java.lang.String str : (java.lang.String[]) com.facebook.ads.redexgen.core.AbstractC04203y.A01(strArr)) {
            A01.A04(com.facebook.ads.redexgen.core.C5C.A0k((java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(str)));
        }
        return A01.A05();
    }

    private void A0Q(android.content.Context context) {
        android.view.accessibility.CaptioningManager captioningManager;
        if ((com.facebook.ads.redexgen.core.C5C.A02 < 23 && android.os.Looper.myLooper() == null) || (captioningManager = (android.view.accessibility.CaptioningManager) context.getSystemService(A0H(0, 10, 126))) == null || !captioningManager.isEnabled()) {
            return;
        }
        this.A0C = 1088;
        java.util.Locale locale = captioningManager.getLocale();
        if (locale != null) {
            this.A0K = com.facebook.ads.redexgen.core.BP.A04(com.facebook.ads.redexgen.core.C5C.A0o(locale));
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioLanguages", "preferredAudioMimeTypes", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
    private void A0R(com.facebook.ads.redexgen.core.C2155pc c2155pc) {
        this.A06 = c2155pc.A06;
        this.A05 = c2155pc.A05;
        this.A04 = c2155pc.A04;
        this.A03 = c2155pc.A03;
        this.A0A = c2155pc.A0A;
        this.A09 = c2155pc.A09;
        this.A08 = c2155pc.A08;
        this.A07 = c2155pc.A07;
        this.A0F = c2155pc.A0F;
        this.A0E = c2155pc.A0E;
        this.A0Q = c2155pc.A0Q;
        this.A0M = c2155pc.A0M;
        this.A0D = c2155pc.A0D;
        this.A0L = c2155pc.A0L;
        this.A0I = c2155pc.A0I;
        this.A0B = c2155pc.A0B;
        this.A02 = c2155pc.A02;
        this.A01 = c2155pc.A01;
        this.A0J = c2155pc.A0J;
        this.A0K = c2155pc.A0K;
        this.A0C = c2155pc.A0C;
        this.A00 = c2155pc.A00;
        this.A0P = c2155pc.A0P;
        this.A0O = c2155pc.A0O;
        this.A0N = c2155pc.A0N;
        this.A0H = new java.util.HashSet<>(c2155pc.A0H);
        this.A0G = new java.util.HashMap<>(c2155pc.A0G);
    }

    public com.facebook.ads.redexgen.core.C04033h A0W(com.facebook.ads.redexgen.core.C2155pc c2155pc) {
        A0R(c2155pc);
        return this;
    }

    public com.facebook.ads.redexgen.core.C04033h A0m(int i, int i2, boolean z) {
        this.A0F = i;
        this.A0E = i2;
        this.A0Q = z;
        return this;
    }

    public com.facebook.ads.redexgen.core.C04033h A0n(android.content.Context context) {
        if (com.facebook.ads.redexgen.core.C5C.A02 >= 19) {
            A0Q(context);
        }
        return this;
    }

    public com.facebook.ads.redexgen.core.C04033h A0o(android.content.Context context, boolean z) {
        android.graphics.Point viewportSize = com.facebook.ads.redexgen.core.C5C.A0W(context);
        return A0m(viewportSize.x, viewportSize.y, z);
    }

    public com.facebook.ads.redexgen.core.C2155pc A0p() {
        return new com.facebook.ads.redexgen.core.C2155pc(this);
    }
}
