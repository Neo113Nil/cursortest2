package com.vungle.ads.internal;

import com.vungle.ads.BaseAdListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class b0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f11887a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(i0 i0Var) {
        super(0);
        this.f11887a = i0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BaseAdListener adListener = this.f11887a.getAdListener();
        if (adListener != null) {
            adListener.onAdClicked(this.f11887a);
        }
        return Unit.INSTANCE;
    }
}
