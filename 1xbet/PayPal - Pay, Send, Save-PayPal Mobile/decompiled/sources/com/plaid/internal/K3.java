package com.plaid.internal;

/* loaded from: classes16.dex */
public final class K3 extends androidx.room.SharedSQLiteStatement {
    public K3(com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl workflowDatabase_Impl) {
        super(workflowDatabase_Impl);
    }

    @Override // androidx.room.SharedSQLiteStatement
    public final java.lang.String createQuery() {
        return "REPLACE INTO workflow_local_key_values (pane_id, `key`, byte_array) VALUES (?, ?, ?)";
    }
}
