package com.plaid.internal;

/* loaded from: classes16.dex */
public final class g8 implements com.plaid.internal.Y7 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl f6422a;
    public final com.plaid.internal.C0454a8 b;
    public final com.plaid.internal.C0464b8 c;

    public g8(com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl workflowDatabase_Impl) {
        this.f6422a = workflowDatabase_Impl;
        this.b = new com.plaid.internal.C0454a8(workflowDatabase_Impl);
        this.c = new com.plaid.internal.C0464b8(workflowDatabase_Impl);
        new com.plaid.internal.C0474c8(workflowDatabase_Impl);
        new com.plaid.internal.d8(workflowDatabase_Impl);
    }

    @Override // com.plaid.internal.Y7
    public final java.lang.Object a(java.util.ArrayList arrayList, com.plaid.internal.C0656u3 c0656u3) {
        return androidx.room.CoroutinesRoom.execute(this.f6422a, true, new com.plaid.internal.e8(this, arrayList), c0656u3);
    }

    @Override // com.plaid.internal.Y7
    public final java.lang.Object a(java.lang.String str, java.lang.String str2, byte[] bArr, com.plaid.internal.C0674w3.a aVar) {
        return androidx.room.CoroutinesRoom.execute(this.f6422a, true, new com.plaid.internal.f8(this, str, str2, bArr), aVar);
    }

    @Override // com.plaid.internal.Y7
    public final java.lang.Object a(com.plaid.internal.C0692y3 c0692y3) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM workflow_analytics", 0);
        return androidx.room.CoroutinesRoom.execute(this.f6422a, false, androidx.room.util.DBUtil.createCancellationSignal(), new com.plaid.internal.Z7(this, acquire), c0692y3);
    }
}
