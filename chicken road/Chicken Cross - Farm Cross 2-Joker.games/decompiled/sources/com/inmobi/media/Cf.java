package com.inmobi.media;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.ads.nativeAd.MediaView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Cf {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f6494a;
    public final ImageView b;
    public final MediaView c;
    public final List d;
    public final Gf e;

    public Cf(ViewGroup parentView, ImageView imageView, MediaView mediaView, List friendlyViews, Gf nativeVisibilitySpec) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(friendlyViews, "friendlyViews");
        Intrinsics.checkNotNullParameter(nativeVisibilitySpec, "nativeVisibilitySpec");
        this.f6494a = parentView;
        this.b = imageView;
        this.c = mediaView;
        this.d = friendlyViews;
        this.e = nativeVisibilitySpec;
    }
}
