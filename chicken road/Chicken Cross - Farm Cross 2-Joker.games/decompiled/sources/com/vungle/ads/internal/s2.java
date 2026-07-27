package com.vungle.ads.internal;

import com.vungle.ads.SdkNotInitialized;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class s2 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v2 f12116a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(v2 v2Var) {
        super(0);
        this.f12116a = v2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f12116a.a(new SdkNotInitialized("Network permissions not granted").logError$vungle_ads_release());
        return Unit.INSTANCE;
    }
}
