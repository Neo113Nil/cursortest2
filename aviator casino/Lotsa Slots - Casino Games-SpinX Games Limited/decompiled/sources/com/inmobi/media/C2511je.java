package com.inmobi.media;

/* renamed from: com.inmobi.media.je, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2511je {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5277a;
    public final java.lang.String b;
    public final com.inmobi.media.ads.nativeAd.InMobiNativeImage c;
    public final java.lang.String d;
    public final org.json.JSONObject e;
    public final java.lang.String f;
    public final java.lang.Float g;
    public final boolean h;
    public final com.inmobi.media.ads.nativeAd.MediaView i;
    public final android.view.View j;

    public C2511je(java.lang.String str, java.lang.String str2, com.inmobi.media.ads.nativeAd.InMobiNativeImage iconImage, java.lang.String str3, org.json.JSONObject extras, java.lang.String str4, java.lang.Float f, boolean z, com.inmobi.media.ads.nativeAd.MediaView mediaView, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iconImage, "iconImage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
        this.f5277a = str;
        this.b = str2;
        this.c = iconImage;
        this.d = str3;
        this.e = extras;
        this.f = str4;
        this.g = f;
        this.h = z;
        this.i = mediaView;
        this.j = view;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.C2511je)) {
            return false;
        }
        com.inmobi.media.C2511je c2511je = (com.inmobi.media.C2511je) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5277a, c2511je.f5277a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c2511je.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c2511je.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, c2511je.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, c2511je.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, c2511je.f) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.g, (java.lang.Object) c2511je.g) && this.h == c2511je.h && kotlin.jvm.internal.Intrinsics.areEqual(this.i, c2511je.i) && kotlin.jvm.internal.Intrinsics.areEqual(this.j, c2511je.j);
    }

    public final int hashCode() {
        java.lang.String str = this.f5277a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        java.lang.String str3 = this.d;
        int hashCode3 = (this.e.hashCode() + ((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        java.lang.String str4 = this.f;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.Float f = this.g;
        int m = (kotlin.UByte$$ExternalSyntheticBackport0.m(this.h) + ((hashCode4 + (f == null ? 0 : f.hashCode())) * 31)) * 31;
        com.inmobi.media.ads.nativeAd.MediaView mediaView = this.i;
        int hashCode5 = (m + (mediaView == null ? 0 : mediaView.hashCode())) * 31;
        android.view.View view = this.j;
        return hashCode5 + (view != null ? view.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "NativePubData(title=" + this.f5277a + ", description=" + this.b + ", iconImage=" + this.c + ", ctaText=" + this.d + ", extras=" + this.e + ", sponsored=" + this.f + ", adRating=" + this.g + ", isVideo=" + this.h + ", mediaView=" + this.i + ", adChoiceIcon=" + this.j + ")";
    }
}
