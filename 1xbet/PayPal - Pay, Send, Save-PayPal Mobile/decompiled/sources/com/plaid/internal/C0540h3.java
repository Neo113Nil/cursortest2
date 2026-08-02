package com.plaid.internal;

/* renamed from: com.plaid.internal.h3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0540h3 implements dagger.internal.Factory<com.plaid.internal.T3> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider<com.plaid.internal.workflow.persistence.database.WorkflowDatabase> f6427a;

    public C0540h3(com.plaid.internal.C0504d3 c0504d3, javax.inject.Provider<com.plaid.internal.workflow.persistence.database.WorkflowDatabase> provider) {
        this.f6427a = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.workflow.persistence.database.WorkflowDatabase workflowDatabase = this.f6427a.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workflowDatabase, "");
        return (com.plaid.internal.T3) dagger.internal.Preconditions.checkNotNullFromProvides(new com.plaid.internal.S3(workflowDatabase));
    }
}
