package io.appmetrica.analytics.coreutils.impl;

import io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.j implements InterfaceC1430a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UtilityServiceProvider f6232a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(UtilityServiceProvider utilityServiceProvider) {
        super(0);
        this.f6232a = utilityServiceProvider;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        return new FirstExecutionConditionServiceImpl(this.f6232a);
    }
}
