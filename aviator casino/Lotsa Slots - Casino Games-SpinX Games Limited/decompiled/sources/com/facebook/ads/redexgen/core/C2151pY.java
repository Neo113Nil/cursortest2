package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.pY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2151pY implements com.facebook.ads.redexgen.core.AnonymousClass24 {

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Remove Immutable List for Oculus")
    public final java.util.List<com.facebook.ads.redexgen.core.C2152pZ> A00;
    public static java.lang.String[] A01 = {"0eRTZm", "wsJdmo7HTY", "VHUY43wJh5fnSZ3wEvYR5lxV3yQqNNMU", "k8", "kUjTCgoRRteoZ0", "6rJamNQt6U89KJOuF", "xAstRHAahUkfHwQSYEnj0qzfqp", "GuXFY9846UfmIsqOXXuGkg4YoPfa8R1b"};
    public static final com.facebook.ads.redexgen.core.C2151pY A03 = new com.facebook.ads.redexgen.core.C2151pY(new java.util.ArrayList());
    public static final java.lang.String A04 = com.facebook.ads.redexgen.core.C5C.A0h(0);
    public static final com.facebook.ads.redexgen.core.AnonymousClass23<com.facebook.ads.redexgen.core.C2151pY> A02 = new com.facebook.ads.redexgen.core.AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pb
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final com.facebook.ads.redexgen.core.AnonymousClass24 A6f(android.os.Bundle bundle) {
            return com.facebook.ads.redexgen.core.C2151pY.A00(bundle);
        }
    };

    public C2151pY(java.util.List<com.facebook.ads.redexgen.core.C2152pZ> list) {
        this.A00 = com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A03((com.facebook.ads.redexgen.core.C2152pZ[]) list.toArray(new com.facebook.ads.redexgen.core.C2152pZ[0]));
    }

    public static /* synthetic */ com.facebook.ads.redexgen.core.C2151pY A00(android.os.Bundle bundle) {
        java.util.List<com.facebook.ads.androidx.media3.common.Tracks.Group> groups;
        java.util.List<com.facebook.ads.androidx.media3.common.Tracks.Group> groups2 = bundle.getParcelableArrayList(A04);
        if (groups2 == null) {
            groups = java.util.Collections.emptyList();
        } else {
            groups = com.facebook.ads.redexgen.core.AnonymousClass44.A01(com.facebook.ads.redexgen.core.C2152pZ.A05, groups2);
        }
        return new com.facebook.ads.redexgen.core.C2151pY(groups);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.A00.equals(((com.facebook.ads.redexgen.core.C2151pY) obj).A00);
        }
        java.lang.String[] strArr = A01;
        if (strArr[2].charAt(26) == strArr[7].charAt(26)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A01;
        strArr2[0] = "oFMxQz";
        strArr2[3] = "4E";
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
