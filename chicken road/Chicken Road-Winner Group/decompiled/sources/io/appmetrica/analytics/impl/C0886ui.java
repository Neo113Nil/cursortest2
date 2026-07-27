package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;

/* renamed from: io.appmetrica.analytics.impl.ui, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0886ui implements IExecutionPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final DataSendingRestrictionController f8459a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8460b = "data restriction based";

    public C0886ui(DataSendingRestrictionController dataSendingRestrictionController) {
        this.f8459a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        return !this.f8459a.isRestrictedForSdk();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final String description() {
        return this.f8460b;
    }
}
