package com.inmobi.media;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.ads.nativeAd.MediaView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ge implements InterfaceC3609bq {

    /* renamed from: a, reason: collision with root package name */
    public final Xp f6583a;
    public final Cf b;

    public Ge(Xp viewableConfig, Cf nativeViewabilityViewHolder) {
        Intrinsics.checkNotNullParameter(viewableConfig, "viewableConfig");
        Intrinsics.checkNotNullParameter(nativeViewabilityViewHolder, "nativeViewabilityViewHolder");
        this.f6583a = viewableConfig;
        this.b = nativeViewabilityViewHolder;
    }

    @Override // com.inmobi.media.InterfaceC3609bq
    public final EnumC3580aq a() {
        boolean z;
        ViewGroup viewGroup = this.b.f6494a;
        Rect rect = new Rect();
        if (!viewGroup.getGlobalVisibleRect(rect)) {
            return EnumC3580aq.f7019a;
        }
        Cf cf = this.b;
        Gf gf = cf.e;
        Kp kp = gf.b;
        boolean z2 = false;
        if (kp.f6681a) {
            MediaView mediaView = cf.c;
            if (mediaView != null && kp.b) {
                z = AbstractC3805iq.a(mediaView, kp.c);
            }
            z = false;
        } else {
            Kp kp2 = gf.f6584a;
            if (kp2.f6681a) {
                ImageView imageView = cf.b;
                if (imageView != null && kp2.b) {
                    z = AbstractC3805iq.a(imageView, kp2.c);
                }
                z = false;
            } else {
                z = true;
            }
        }
        if (z) {
            Xp xp = this.f6583a;
            if (AbstractC3805iq.a(viewGroup, rect, xp.f6959a, xp.b) && AbstractC3805iq.a(viewGroup, rect, this.f6583a.f6959a, this.b.d)) {
                z2 = true;
            }
        }
        return z2 ? EnumC3580aq.b : EnumC3580aq.f7019a;
    }
}
