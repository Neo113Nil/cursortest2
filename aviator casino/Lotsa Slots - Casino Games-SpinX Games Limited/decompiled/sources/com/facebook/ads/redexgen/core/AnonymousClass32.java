package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.32, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class AnonymousClass32 {
    public static byte[] A09;
    public static java.lang.String[] A0A = {"x4YClL2ZysfVPCFZjhpW4oP0jWiK4Q3l", "qTcDzMP2wLEx15nCuEUhgp4TY7vV", "SIpQOLlqDgpshhwjhc8D2jgDkVzbvCX7", "J0RaUpvVzbbvSqSgIYK8O25JdvitlZZ4", "cm5jE18fh6qtcHu4S6QHstxeiM", com.ironsource.B5.q, "LQDJUPwAzqbXUo9Li69tSY6YDGIQDwU", "wUCT9e8FTOqtQKr8s0xzb6XHsL6fqF1p"};
    public final android.net.Uri A00;
    public final com.facebook.ads.redexgen.core.C03912t A01;
    public final com.facebook.ads.redexgen.core.C03962y A02;
    public final java.lang.Object A03;
    public final java.lang.String A04;
    public final java.lang.String A05;
    public final java.util.List<com.facebook.ads.androidx.media3.common.StreamKey> A06;
    public final java.util.List<com.facebook.ads.androidx.media3.common.MediaItem.SubtitleConfiguration> A07;

    @java.lang.Deprecated
    public final java.util.List<com.facebook.ads.androidx.media3.common.MediaItem.Subtitle> A08;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{com.google.common.base.Ascii.SO, com.google.common.base.Ascii.EM, 5, 0, 8, 57, com.google.common.base.Ascii.FS, 3, 2, 113, 120, 106, 113, 90, 118, 125, 124};
    }

    static {
        A01();
    }

    public AnonymousClass32(android.net.Uri uri, java.lang.String str, com.facebook.ads.redexgen.core.C03962y c03962y, com.facebook.ads.redexgen.core.C03912t c03912t, java.util.List<com.facebook.ads.androidx.media3.common.StreamKey> streamKeys, java.lang.String str2, java.util.List<com.facebook.ads.androidx.media3.common.MediaItem.SubtitleConfiguration> subtitleConfigurations, java.lang.Object obj) {
        this.A00 = uri;
        this.A05 = str;
        this.A02 = c03962y;
        this.A01 = c03912t;
        this.A06 = streamKeys;
        this.A04 = str2;
        this.A07 = subtitleConfigurations;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (0 < subtitleConfigurations.size()) {
            subtitleConfigurations.get(0);
            throw new java.lang.NullPointerException(A00(0, 9, 35));
        }
        java.util.List<com.facebook.ads.androidx.media3.common.MediaItem.Subtitle> subtitles = new java.util.ArrayList<>(linkedList);
        this.A08 = subtitles;
        this.A03 = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.facebook.ads.redexgen.core.AnonymousClass32)) {
            return false;
        }
        com.facebook.ads.redexgen.core.AnonymousClass32 anonymousClass32 = (com.facebook.ads.redexgen.core.AnonymousClass32) obj;
        if (this.A00.equals(anonymousClass32.A00) && com.facebook.ads.redexgen.core.C5C.A1E(this.A05, anonymousClass32.A05) && com.facebook.ads.redexgen.core.C5C.A1E(this.A02, anonymousClass32.A02)) {
            if (A0A[7].charAt(13) == 'I') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0A;
            strArr[3] = "SNoZAEbl0aNlH2coBrY7ADFEuEiuIdsk";
            strArr[0] = "hNPU4lA8QZuNoOME96TtOhTBwniZIKf2";
            if (com.facebook.ads.redexgen.core.C5C.A1E(null, null) && this.A06.equals(anonymousClass32.A06) && com.facebook.ads.redexgen.core.C5C.A1E(this.A04, anonymousClass32.A04) && this.A07.equals(anonymousClass32.A07) && com.facebook.ads.redexgen.core.C5C.A1E(this.A03, anonymousClass32.A03)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A00.hashCode();
        int i = result * 31;
        int result2 = this.A05 == null ? 0 : this.A05.hashCode();
        int result3 = (((i + result2) * 31) + (this.A02 == null ? 0 : this.A02.hashCode())) * 31;
        if (0 == 0) {
            int result4 = (((result3 + 0) * 31) + this.A06.hashCode()) * 31;
            int result5 = this.A04 == null ? 0 : this.A04.hashCode();
            return ((((result4 + result5) * 31) + this.A07.hashCode()) * 31) + (this.A03 != null ? this.A03.hashCode() : 0);
        }
        throw new java.lang.NullPointerException(A00(9, 8, 86));
    }
}
