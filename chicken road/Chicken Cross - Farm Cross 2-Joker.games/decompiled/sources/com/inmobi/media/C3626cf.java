package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.MediaView;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.cf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3626cf {

    /* renamed from: a, reason: collision with root package name */
    public final String f7047a;
    public final String b;
    public final InMobiNativeImage c;
    public final String d;
    public final JSONObject e;
    public final String f;
    public final Float g;
    public final boolean h;
    public final MediaView i;
    public final View j;

    public C3626cf(String str, String str2, InMobiNativeImage iconImage, String str3, JSONObject extras, String str4, Float f, boolean z, MediaView mediaView, View view) {
        Intrinsics.checkNotNullParameter(iconImage, "iconImage");
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f7047a = str;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3626cf)) {
            return false;
        }
        C3626cf c3626cf = (C3626cf) obj;
        return Intrinsics.areEqual(this.f7047a, c3626cf.f7047a) && Intrinsics.areEqual(this.b, c3626cf.b) && Intrinsics.areEqual(this.c, c3626cf.c) && Intrinsics.areEqual(this.d, c3626cf.d) && Intrinsics.areEqual(this.e, c3626cf.e) && Intrinsics.areEqual(this.f, c3626cf.f) && Intrinsics.areEqual((Object) this.g, (Object) c3626cf.g) && this.h == c3626cf.h && Intrinsics.areEqual(this.i, c3626cf.i) && Intrinsics.areEqual(this.j, c3626cf.j);
    }

    public final int hashCode() {
        String str = this.f7047a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.d;
        int hashCode3 = (this.e.hashCode() + ((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.f;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f = this.g;
        int hashCode5 = (Boolean.hashCode(this.h) + ((hashCode4 + (f == null ? 0 : f.hashCode())) * 31)) * 31;
        MediaView mediaView = this.i;
        int hashCode6 = (hashCode5 + (mediaView == null ? 0 : mediaView.hashCode())) * 31;
        View view = this.j;
        return hashCode6 + (view != null ? view.hashCode() : 0);
    }

    public final String toString() {
        return "NativePubData(title=" + this.f7047a + ", description=" + this.b + ", iconImage=" + this.c + ", ctaText=" + this.d + ", extras=" + this.e + ", sponsored=" + this.f + ", adRating=" + this.g + ", isVideo=" + this.h + ", mediaView=" + this.i + ", adChoiceIcon=" + this.j + ")";
    }
}
