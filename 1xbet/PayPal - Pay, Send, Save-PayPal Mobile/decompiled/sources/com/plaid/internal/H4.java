package com.plaid.internal;

/* loaded from: classes16.dex */
public final class H4 implements com.plaid.internal.C4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl f5799a;
    public final com.plaid.internal.D4 b;

    public H4(com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl workflowDatabase_Impl) {
        this.f5799a = workflowDatabase_Impl;
        this.b = new com.plaid.internal.D4(workflowDatabase_Impl);
        new com.plaid.internal.E4(workflowDatabase_Impl);
    }

    @Override // com.plaid.internal.C4
    public final java.lang.Object a(java.lang.String str, java.lang.String str2, byte[] bArr, com.plaid.internal.S2 s2) {
        return androidx.room.CoroutinesRoom.execute(this.f5799a, true, new com.plaid.internal.F4(this, str, str2, bArr), s2);
    }

    @Override // com.plaid.internal.C4
    public final java.lang.Object a(java.lang.String str, java.lang.String str2, com.plaid.internal.C0618q0 c0618q0) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM workflow_pane WHERE workflow_id=? AND id=?", 2);
        acquire.bindString(1, str);
        acquire.bindString(2, str2);
        return androidx.room.CoroutinesRoom.execute(this.f5799a, false, androidx.room.util.DBUtil.createCancellationSignal(), new com.plaid.internal.G4(this, acquire), c0618q0);
    }
}
