package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.pR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2144pR implements com.facebook.ads.redexgen.core.AnonymousClass24 {
    public final long A00;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Oculus does not work well with Google Guava")
    public final java.util.List<com.facebook.ads.redexgen.core.C2146pT> A01;
    public static final com.facebook.ads.redexgen.core.C2144pR A03 = new com.facebook.ads.redexgen.core.C2144pR(com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A01(), 0);
    public static final java.lang.String A04 = com.facebook.ads.redexgen.core.C5C.A0h(0);
    public static final java.lang.String A05 = com.facebook.ads.redexgen.core.C5C.A0h(1);
    public static final com.facebook.ads.redexgen.core.AnonymousClass23<com.facebook.ads.redexgen.core.C2144pR> A02 = new com.facebook.ads.redexgen.core.AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pS
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final com.facebook.ads.redexgen.core.AnonymousClass24 A6f(android.os.Bundle bundle) {
            com.facebook.ads.redexgen.core.C2144pR A00;
            A00 = com.facebook.ads.redexgen.core.C2144pR.A00(bundle);
            return A00;
        }
    };

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Oculus does not work well with Google Guava")
    public C2144pR(java.util.List<com.facebook.ads.redexgen.core.C2146pT> list, long j) {
        this.A01 = com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A03((com.facebook.ads.redexgen.core.C2146pT[]) list.toArray(new com.facebook.ads.redexgen.core.C2146pT[0]));
        this.A00 = j;
    }

    public static final com.facebook.ads.redexgen.core.C2144pR A00(android.os.Bundle bundle) {
        java.util.List A01;
        java.util.List<com.facebook.ads.androidx.media3.common.text.Cue> cues = bundle.getParcelableArrayList(A04);
        if (cues == null) {
            A01 = com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A01();
        } else {
            A01 = com.facebook.ads.redexgen.core.AnonymousClass44.A01(com.facebook.ads.redexgen.core.C2146pT.A0I, cues);
        }
        return new com.facebook.ads.redexgen.core.C2144pR(A01, bundle.getLong(A05));
    }
}
