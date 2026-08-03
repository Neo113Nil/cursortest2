package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.nR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2021nR implements com.facebook.ads.redexgen.core.InterfaceC0675Em {
    public static java.lang.String[] A0B = {"ziZaTeBfSFNnIBcgtlZExnB4uOVj2q5B", "5IZt5NWgPCitKNTqtiA", "aLHVXVzU6ljMUMq9dZgrDfQ8JzHl8MF", "mvLcqO7QF6VGSUKAdCZC8bhhp8aLucng", "FQUZNhR4lN6thgMMBkcdaTgoY6ZzypcM", "72R8UBsha86AOqtb805OpiOBiH7oe8El", "AjNBccUrYW9zDFgtuo7TyJwkSvkBJU7y", "GkSBWsvGG5dBFRJxqtw9GV4lDtiTWOM"};
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final com.facebook.ads.redexgen.core.AnonymousClass45 A08;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("This is no longer set in the constructor")
    public final com.facebook.ads.redexgen.core.F6 A09;
    public final int A0A;

    public C2021nR() {
        this(10000, 25000, 25000, 0.75f);
    }

    public C2021nR(int i, int i2, int i3, float f) {
        this(null, -1, i, i2, i3, 1279, 719, f, 0.75f, 2000L, com.facebook.ads.redexgen.core.AnonymousClass45.A00);
    }

    public C2021nR(com.facebook.ads.redexgen.core.F6 f6) {
        this(f6, -1, 10000, 25000, 25000, 1279, 719, 0.75f, 0.75f, 2000L, com.facebook.ads.redexgen.core.AnonymousClass45.A00);
    }

    public C2021nR(@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("No longer set through factory") com.facebook.ads.redexgen.core.F6 f6, @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Non standard variable; used in oculus") int i, @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Removed from upstream") int i2, int i3, int i4, int i5, int i6, float f, float f2, long j, com.facebook.ads.redexgen.core.AnonymousClass45 anonymousClass45) {
        this.A09 = f6;
        this.A0A = i;
        this.A05 = i2;
        this.A02 = i3;
        this.A06 = i4;
        this.A04 = i5;
        this.A03 = i6;
        this.A00 = f;
        this.A01 = f2;
        this.A07 = j;
        this.A08 = anonymousClass45;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    private final com.facebook.ads.redexgen.core.C03481a A00(com.facebook.ads.redexgen.core.C2159pg c2159pg, int[] iArr, int i, com.facebook.ads.redexgen.core.F6 f6, com.facebook.ads.redexgen.core.BP<com.facebook.ads.redexgen.core.EU> bp) {
        return new com.facebook.ads.redexgen.core.C03481a(c2159pg, iArr, i, f6, this.A0A, this.A05, this.A02, this.A06, this.A04, this.A03, this.A00, this.A01, this.A07, bp, this.A08);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0675Em
    public final com.facebook.ads.redexgen.core.InterfaceC2008nE[] A5b(com.facebook.ads.redexgen.core.C0674El[] c0674ElArr, com.facebook.ads.redexgen.core.F6 f6, com.facebook.ads.redexgen.core.C2044no c2044no, com.facebook.ads.androidx.media3.common.Timeline timeline) {
        com.facebook.ads.redexgen.core.BP A00;
        com.facebook.ads.redexgen.core.InterfaceC2008nE A002;
        A00 = com.facebook.ads.redexgen.core.C03481a.A00(c0674ElArr);
        com.facebook.ads.redexgen.core.InterfaceC2008nE[] interfaceC2008nEArr = new com.facebook.ads.redexgen.core.InterfaceC2008nE[c0674ElArr.length];
        for (int i = 0; i < c0674ElArr.length; i++) {
            com.facebook.ads.redexgen.core.C0674El c0674El = c0674ElArr[i];
            if (c0674El != null && c0674El.A02.length != 0) {
                int length = c0674El.A02.length;
                if (A0B[3].length() != 32) {
                    throw new java.lang.RuntimeException();
                }
                A0B[1] = "4JDRhnBkti3";
                if (length == 1) {
                    A002 = new com.facebook.ads.redexgen.core.C1Z(c0674El.A01, c0674El.A02[0], c0674El.A00);
                } else {
                    A002 = A00(c0674El.A01, c0674El.A02, c0674El.A00, f6, (com.facebook.ads.redexgen.core.BP) A00.get(i));
                }
                interfaceC2008nEArr[i] = A002;
            }
        }
        return interfaceC2008nEArr;
    }
}
