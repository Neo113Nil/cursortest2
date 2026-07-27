package io.appmetrica.analytics.impl;

import e2.AbstractC0290e;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;

/* renamed from: io.appmetrica.analytics.impl.m5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0666m5 implements IExecutionPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final IExecutionPolicy[] f7840a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7841b;

    public C0666m5(IExecutionPolicy... iExecutionPolicyArr) {
        this.f7840a = iExecutionPolicyArr;
        this.f7841b = "Composite of {" + AbstractC0290e.W(iExecutionPolicyArr, ", ", C0640l5.f7734a) + '}';
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        IExecutionPolicy iExecutionPolicy;
        IExecutionPolicy[] iExecutionPolicyArr = this.f7840a;
        if (iExecutionPolicyArr.length == 0) {
            return false;
        }
        int length = iExecutionPolicyArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                iExecutionPolicy = null;
                break;
            }
            iExecutionPolicy = iExecutionPolicyArr[i3];
            if (!iExecutionPolicy.canBeExecuted()) {
                break;
            }
            i3++;
        }
        return iExecutionPolicy == null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final String description() {
        return this.f7841b;
    }
}
