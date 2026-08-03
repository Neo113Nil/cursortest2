package com.facebook.ads.redexgen.core;

@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Exo version is final but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
/* renamed from: com.facebook.ads.redexgen.X.89, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass89 implements com.facebook.ads.redexgen.core.InterfaceC1851kS {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"jtWHdC1JS00IQCACyTEvOJEMPrvoo3Ob", "eCCt1HwS4IToKXyi1WzLFL1R4PlgsDM4", "yXgy4dLxj37Ni2Ba12KifyhgeRBIXCXp", "5p7nRT0g4n3u8StY", "28aCkGMBHBRgMUJ0i4knnGO", "XAmyqmpuCXa4X38XkweYk7F1knbiAlXr", "krkFdswQPRExlipS29WIEjh8hbH7SBjj", com.ironsource.Va.u};

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public long A00;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public final long A01;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public final java.util.TreeSet<com.facebook.ads.redexgen.core.MZ> A02 = new java.util.TreeSet<>(new java.util.Comparator() { // from class: com.facebook.ads.redexgen.X.Mn
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return com.facebook.ads.redexgen.core.AnonymousClass89.A00((com.facebook.ads.redexgen.core.MZ) obj, (com.facebook.ads.redexgen.core.MZ) obj2);
        }
    });

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 28);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{46, kotlin.io.encoding.Base64.padSymbol, 34, 40, 63, 8, 42, 40, 35, 46};
    }

    static {
        A02();
    }

    public AnonymousClass89(long j) {
        this.A01 = j;
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public static int A00(com.facebook.ads.redexgen.core.MZ mz, com.facebook.ads.redexgen.core.MZ mz2) {
        if (mz.A00 - mz2.A00 == 0) {
            return mz.compareTo(mz2);
        }
        return mz.A00 < mz2.A00 ? -1 : 1;
    }

    private void A03(com.facebook.ads.redexgen.core.MP mp, long j) {
        com.facebook.ads.redexgen.core.AnonymousClass54.A02(A01(0, 10, 87));
        while (this.A00 + j > this.A01 && !this.A02.isEmpty()) {
            com.facebook.ads.redexgen.core.MZ first = this.A02.first();
            if (A04[1].charAt(10) != 'T') {
                throw new java.lang.RuntimeException();
            }
            A04[4] = "DjrmhsDHxGC2SVigK1e7Rl2";
            mp.AIV(first);
        }
        com.facebook.ads.redexgen.core.AnonymousClass54.A00();
    }

    @Override // com.facebook.ads.redexgen.core.MO
    public final void AG2(com.facebook.ads.redexgen.core.MP mp, com.facebook.ads.redexgen.core.MZ mz) {
        this.A02.add(mz);
        this.A00 += mz.A01;
        A03(mp, 0L);
    }

    @Override // com.facebook.ads.redexgen.core.MO
    public final void AG3(com.facebook.ads.redexgen.core.MP mp, com.facebook.ads.redexgen.core.MZ mz) {
        this.A02.remove(mz);
        this.A00 -= mz.A01;
    }

    @Override // com.facebook.ads.redexgen.core.MO
    public final void AG4(com.facebook.ads.redexgen.core.MP mp, com.facebook.ads.redexgen.core.MZ mz, com.facebook.ads.redexgen.core.MZ mz2) {
        AG3(mp, mz);
        AG2(mp, mz2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1851kS
    public final void AG5(com.facebook.ads.redexgen.core.MP mp, java.lang.String str, long j, long j2) {
        if (j2 != -1) {
            A03(mp, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1851kS
    public final boolean AIj() {
        return true;
    }
}
