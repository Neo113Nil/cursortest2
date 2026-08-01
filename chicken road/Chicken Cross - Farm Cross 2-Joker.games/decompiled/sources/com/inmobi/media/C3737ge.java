package com.inmobi.media;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.ads.nativeAd.MediaView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ge, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3737ge implements InterfaceC3609bq {

    /* renamed from: a, reason: collision with root package name */
    public final Xp f7121a;
    public final Cf b;

    public C3737ge(Xp viewableConfig, Cf nativeViewabilityViewHolder) {
        Intrinsics.checkNotNullParameter(viewableConfig, "viewableConfig");
        Intrinsics.checkNotNullParameter(nativeViewabilityViewHolder, "nativeViewabilityViewHolder");
        this.f7121a = viewableConfig;
        this.b = nativeViewabilityViewHolder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:
    
        if (((r2 == null || !r4.b) ? false : com.inmobi.media.AbstractC3805iq.a(r2, r4.c)) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005a, code lost:
    
        if (r6 != false) goto L32;
     */
    @Override // com.inmobi.media.InterfaceC3609bq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EnumC3580aq a() {
        ViewGroup viewGroup = this.b.f6494a;
        Rect rect = new Rect();
        if (!viewGroup.getGlobalVisibleRect(rect)) {
            return EnumC3580aq.f7019a;
        }
        Cf cf = this.b;
        Gf gf = cf.e;
        if (gf.b.f6681a || gf.f6584a.f6681a) {
            Kp kp = gf.f6584a;
            ImageView imageView = cf.b;
            boolean z = false;
            if (kp.f6681a) {
            }
            Kp kp2 = gf.b;
            MediaView mediaView = this.b.c;
            if (kp2.f6681a) {
                if ((mediaView == null || !kp2.b) ? false : AbstractC3805iq.a(mediaView, kp2.c)) {
                    z = true;
                }
            }
        }
        Xp xp = this.f7121a;
        if (AbstractC3805iq.a(viewGroup, rect, xp.f6959a, xp.b) && AbstractC3805iq.a(viewGroup, rect, this.f7121a.f6959a, this.b.d)) {
            return EnumC3580aq.b;
        }
        return EnumC3580aq.f7019a;
    }
}
