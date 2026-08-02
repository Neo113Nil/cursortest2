package com.plaid.internal;

/* loaded from: classes16.dex */
public final class P3 implements com.plaid.internal.I3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl f5878a;
    public final com.plaid.internal.J3 b;
    public final com.plaid.internal.L3 c;

    public P3(com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl workflowDatabase_Impl) {
        this.f5878a = workflowDatabase_Impl;
        this.b = new com.plaid.internal.J3(workflowDatabase_Impl);
        new com.plaid.internal.K3(workflowDatabase_Impl);
        this.c = new com.plaid.internal.L3(workflowDatabase_Impl);
    }

    @Override // com.plaid.internal.I3
    public final java.lang.Object a(java.lang.String str, java.lang.String str2, java.lang.String str3, com.plaid.internal.R3 r3) {
        return androidx.room.CoroutinesRoom.execute(this.f5878a, true, new com.plaid.internal.M3(this, str, str2, str3), r3);
    }

    @Override // com.plaid.internal.I3
    public final java.lang.Object a(java.lang.String str, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        return androidx.room.CoroutinesRoom.execute(this.f5878a, true, new com.plaid.internal.N3(this, str), continuationImpl);
    }

    @Override // com.plaid.internal.I3
    public final java.lang.Object a(java.lang.String str, java.lang.String str2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT string FROM workflow_local_key_values WHERE pane_id=? AND `key`=?", 2);
        acquire.bindString(1, str);
        acquire.bindString(2, str2);
        return androidx.room.CoroutinesRoom.execute(this.f5878a, false, androidx.room.util.DBUtil.createCancellationSignal(), new com.plaid.internal.O3(this, acquire), continuationImpl);
    }
}
