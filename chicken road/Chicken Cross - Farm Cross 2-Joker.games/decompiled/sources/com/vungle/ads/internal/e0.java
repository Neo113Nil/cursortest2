package com.vungle.ads.internal;

import com.vungle.ads.BaseAdListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class e0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f11909a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(i0 i0Var) {
        super(0);
        this.f11909a = i0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BaseAdListener adListener = this.f11909a.getAdListener();
        if (adListener != null) {
            adListener.onAdLeftApplication(this.f11909a);
        }
        return Unit.INSTANCE;
    }
}
