package com.plaid.internal;

/* renamed from: com.plaid.internal.a8, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0454a8 extends androidx.room.EntityDeletionOrUpdateAdapter<com.plaid.internal.h8> {
    public C0454a8(com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl workflowDatabase_Impl) {
        super(workflowDatabase_Impl);
    }

    @Override // androidx.room.EntityDeletionOrUpdateAdapter
    public final void bind(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, com.plaid.internal.h8 h8Var) {
        com.plaid.internal.h8 h8Var2 = h8Var;
        supportSQLiteStatement.bindString(1, h8Var2.f6433a);
        supportSQLiteStatement.bindString(2, h8Var2.b);
    }

    @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
    public final java.lang.String createQuery() {
        return "DELETE FROM `workflow_analytics` WHERE `workflow_id` = ? AND `id` = ?";
    }
}
