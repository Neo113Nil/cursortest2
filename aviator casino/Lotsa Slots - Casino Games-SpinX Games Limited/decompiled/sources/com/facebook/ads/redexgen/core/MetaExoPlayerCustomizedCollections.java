package com.facebook.ads.redexgen.core;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00060\b\"\u0002H\u0006H\u0007¢\u0006\u0002\u0010\tJ-\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00060\b\"\u0002H\u0006H\u0007¢\u0006\u0002\u0010\tJ-\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00060\f\"\u0004\b\u0000\u0010\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00060\b\"\u0002H\u0006H\u0007¢\u0006\u0002\u0010\rJ6\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u00110\u000f\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0011\u0018\u00010\u000fH\u0007J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u0006H\u0007¨\u0006\u0014"}, d2 = {"Lcom/facebook/video/heroplayer/exocustom/MetaExoPlayerCustomizedCollections;", "", "<init>", "()V", "immutableListOf", "", "T", "elements", "", "([Ljava/lang/Object;)Ljava/util/List;", "immutableListCopyOf", "immutableSetOf", "", "([Ljava/lang/Object;)Ljava/util/Set;", "immutableMapCopyOf", "", "K", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "mapToCopy", "emptyList", "fbandroid.java.com.facebook.video.heroplayer.exocustom.exocustom"}, k = 1, mv = {2, 1, 0}, xi = 48)
@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("On VRShell, Google Guava dependencies do not behave well. This is still under investigation but for now we are replacing those calls with vanilla java calls")
/* renamed from: com.facebook.ads.redexgen.X.jW, reason: from Kotlin metadata */
/* loaded from: assets/audience_network/classes2.dex */
public final class MetaExoPlayerCustomizedCollections {
    public static byte[] A00;
    public static final com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections A01;

    static {
        A06();
        A01 = new com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 122);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{Byte.MAX_VALUE, 118, Byte.MAX_VALUE, 119, Byte.MAX_VALUE, 116, 110, 105};
    }

    @kotlin.jvm.JvmStatic
    public static final <T> java.util.List<T> A01() {
        return com.facebook.ads.redexgen.core.AbstractC0569Af.A06();
    }

    @kotlin.jvm.JvmStatic
    public static final <T> java.util.List<T> A02(T... tArr) {
        com.facebook.ads.redexgen.core.C2210qY.A09(tArr, A00(0, 8, 96));
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(tArr, tArr.length);
        return new java.util.ArrayList(com.facebook.ads.redexgen.core.AbstractC0569Af.A07(java.util.Arrays.copyOf(copyOf, copyOf.length)));
    }

    @kotlin.jvm.JvmStatic
    public static final <T> java.util.List<T> A03(T... tArr) {
        com.facebook.ads.redexgen.core.C2210qY.A09(tArr, A00(0, 8, 96));
        return new java.util.ArrayList(com.facebook.ads.redexgen.core.AbstractC0569Af.A07(java.util.Arrays.copyOf(tArr, tArr.length)));
    }

    @kotlin.jvm.JvmStatic
    public static final <K, V> java.util.Map<K, V> A04(java.util.Map<K, ? extends V> map) {
        return new java.util.HashMap(map);
    }

    @kotlin.jvm.JvmStatic
    public static final <T> java.util.Set<T> A05(T... tArr) {
        com.facebook.ads.redexgen.core.C2210qY.A09(tArr, A00(0, 8, 96));
        return new java.util.HashSet(com.facebook.ads.redexgen.core.AbstractC0569Af.A07(java.util.Arrays.copyOf(tArr, tArr.length)));
    }
}
