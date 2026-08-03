package io.appmetrica.analytics.coreutils.impl;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.j implements s1.InterfaceC0991a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider f3729a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider utilityServiceProvider) {
        super(0);
        this.f3729a = utilityServiceProvider;
    }

    @Override // s1.InterfaceC0991a
    public final java.lang.Object invoke() {
        return new io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl(this.f3729a);
    }
}
