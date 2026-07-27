package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;

/* renamed from: io.appmetrica.analytics.impl.ui, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1035ui implements IExecutionPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final DataSendingRestrictionController f9412a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9413b = "data restriction based";

    public C1035ui(DataSendingRestrictionController dataSendingRestrictionController) {
        this.f9412a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        return !this.f9412a.isRestrictedForSdk();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final String description() {
        return this.f9413b;
    }
}
