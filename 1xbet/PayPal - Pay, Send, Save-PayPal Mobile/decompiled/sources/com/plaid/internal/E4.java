package com.plaid.internal;

/* loaded from: classes16.dex */
public final class E4 extends androidx.room.SharedSQLiteStatement {
    public E4(com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl workflowDatabase_Impl) {
        super(workflowDatabase_Impl);
    }

    @Override // androidx.room.SharedSQLiteStatement
    public final java.lang.String createQuery() {
        return "DELETE FROM workflow_pane";
    }
}
