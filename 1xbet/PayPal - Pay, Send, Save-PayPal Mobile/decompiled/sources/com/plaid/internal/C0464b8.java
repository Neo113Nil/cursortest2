package com.plaid.internal;

/* renamed from: com.plaid.internal.b8, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0464b8 extends androidx.room.SharedSQLiteStatement {
    public C0464b8(com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl workflowDatabase_Impl) {
        super(workflowDatabase_Impl);
    }

    @Override // androidx.room.SharedSQLiteStatement
    public final java.lang.String createQuery() {
        return "REPLACE INTO workflow_analytics (workflow_id, id, analytics_model) VALUES (?, ?, ?)";
    }
}
