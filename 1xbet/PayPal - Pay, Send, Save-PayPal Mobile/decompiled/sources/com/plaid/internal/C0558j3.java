package com.plaid.internal;

/* renamed from: com.plaid.internal.j3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0558j3 implements dagger.internal.Factory<com.plaid.internal.L4> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider<com.plaid.internal.workflow.persistence.database.WorkflowDatabase> f6450a;

    public C0558j3(com.plaid.internal.C0504d3 c0504d3, javax.inject.Provider<com.plaid.internal.workflow.persistence.database.WorkflowDatabase> provider) {
        this.f6450a = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.workflow.persistence.database.WorkflowDatabase workflowDatabase = this.f6450a.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workflowDatabase, "");
        return (com.plaid.internal.L4) dagger.internal.Preconditions.checkNotNullFromProvides(new com.plaid.internal.C0626r0(workflowDatabase));
    }
}
