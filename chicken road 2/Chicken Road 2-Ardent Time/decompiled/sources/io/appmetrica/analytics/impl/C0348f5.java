package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.f5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0348f5 implements io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy[] f5872a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f5873b;

    public C0348f5(io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy... iExecutionPolicyArr) {
        this.f5872a = iExecutionPolicyArr;
        this.f5873b = "Composite of {" + i1.AbstractC0189h.P(iExecutionPolicyArr, ", ", "", "", -1, "...", io.appmetrica.analytics.impl.C0322e5.f5773a) + '}';
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy iExecutionPolicy;
        io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy[] iExecutionPolicyArr = this.f5872a;
        if (iExecutionPolicyArr.length == 0) {
            return false;
        }
        int length = iExecutionPolicyArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                iExecutionPolicy = null;
                break;
            }
            iExecutionPolicy = iExecutionPolicyArr[i2];
            if (!iExecutionPolicy.canBeExecuted()) {
                break;
            }
            i2++;
        }
        return iExecutionPolicy == null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final java.lang.String description() {
        return this.f5873b;
    }
}
