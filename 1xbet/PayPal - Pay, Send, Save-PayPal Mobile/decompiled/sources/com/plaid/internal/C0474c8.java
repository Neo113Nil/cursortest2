package com.plaid.internal;

/* renamed from: com.plaid.internal.c8, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0474c8 extends androidx.room.SharedSQLiteStatement {
    public C0474c8(com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl workflowDatabase_Impl) {
        super(workflowDatabase_Impl);
    }

    @Override // androidx.room.SharedSQLiteStatement
    public final java.lang.String createQuery() {
        return "DELETE FROM workflow_analytics WHERE workflow_id=?";
    }
}
