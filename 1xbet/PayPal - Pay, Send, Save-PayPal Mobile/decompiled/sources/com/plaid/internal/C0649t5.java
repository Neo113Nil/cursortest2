package com.plaid.internal;

/* renamed from: com.plaid.internal.t5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0649t5 implements dagger.internal.Factory<com.plaid.internal.workflow.persistence.database.WorkflowDatabase> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.Factory f6581a;

    public C0649t5(com.plaid.internal.C0623q5 c0623q5, dagger.internal.Factory factory) {
        this.f6581a = factory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        android.app.Application application = (android.app.Application) this.f6581a.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        return (com.plaid.internal.workflow.persistence.database.WorkflowDatabase) dagger.internal.Preconditions.checkNotNullFromProvides((com.plaid.internal.workflow.persistence.database.WorkflowDatabase) androidx.room.Room.databaseBuilder(application, com.plaid.internal.workflow.persistence.database.WorkflowDatabase.class, "plaid_workflow_database").fallbackToDestructiveMigration().build());
    }
}
