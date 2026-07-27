package com.inmobi.media;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Yp implements InterfaceC3609bq {

    /* renamed from: a, reason: collision with root package name */
    public final Xp f6982a;
    public final Mk b;

    public Yp(Xp visibilityConfig, Mk simpleViewHolder) {
        Intrinsics.checkNotNullParameter(visibilityConfig, "visibilityConfig");
        Intrinsics.checkNotNullParameter(simpleViewHolder, "simpleViewHolder");
        this.f6982a = visibilityConfig;
        this.b = simpleViewHolder;
    }

    @Override // com.inmobi.media.InterfaceC3609bq
    public final EnumC3580aq a() {
        I5 i5 = this.b.f6722a;
        Rect rect = new Rect();
        if (!i5.getGlobalVisibleRect(rect)) {
            return EnumC3580aq.f7019a;
        }
        Xp xp = this.f6982a;
        return (AbstractC3805iq.a(i5, rect, xp.f6959a, xp.b) && AbstractC3805iq.a(i5, rect, this.f6982a.f6959a, this.b.b)) ? EnumC3580aq.b : EnumC3580aq.f7019a;
    }
}
