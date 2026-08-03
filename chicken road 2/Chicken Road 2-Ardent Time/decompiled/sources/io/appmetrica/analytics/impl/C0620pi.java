package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.pi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0620pi implements io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController f6658a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f6659b = "data restriction based";

    public C0620pi(io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController dataSendingRestrictionController) {
        this.f6658a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        return !this.f6658a.isRestrictedForSdk();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final java.lang.String description() {
        return this.f6659b;
    }
}
