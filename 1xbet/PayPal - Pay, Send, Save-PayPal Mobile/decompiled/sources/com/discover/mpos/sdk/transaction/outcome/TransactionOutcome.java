package com.discover.mpos.sdk.transaction.outcome;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\f"}, d2 = {"Lcom/discover/mpos/sdk/transaction/outcome/TransactionOutcome;", "Lcom/discover/mpos/sdk/core/emv/Clearable;", "Lcom/discover/mpos/sdk/transaction/outcome/OutcomeType;", "type", "Lcom/discover/mpos/sdk/transaction/outcome/OutcomeParameters;", "params", "<init>", "(Lcom/discover/mpos/sdk/transaction/outcome/OutcomeType;Lcom/discover/mpos/sdk/transaction/outcome/OutcomeParameters;)V", "", "clear", "()V", "component1", "()Lcom/discover/mpos/sdk/transaction/outcome/OutcomeType;", "component2", "()Lcom/discover/mpos/sdk/transaction/outcome/OutcomeParameters;", "copy", "(Lcom/discover/mpos/sdk/transaction/outcome/OutcomeType;Lcom/discover/mpos/sdk/transaction/outcome/OutcomeParameters;)Lcom/discover/mpos/sdk/transaction/outcome/TransactionOutcome;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/discover/mpos/sdk/transaction/outcome/OutcomeParameters;", "getParams", "Lcom/discover/mpos/sdk/transaction/outcome/OutcomeType;", "getType"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final /* data */ class TransactionOutcome implements com.discover.mpos.sdk.core.emv.Clearable {
    private final com.discover.mpos.sdk.transaction.outcome.OutcomeParameters params;
    private final com.discover.mpos.sdk.transaction.outcome.OutcomeType type;

    public TransactionOutcome(com.discover.mpos.sdk.transaction.outcome.OutcomeType outcomeType, com.discover.mpos.sdk.transaction.outcome.OutcomeParameters outcomeParameters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcomeType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcomeParameters, "");
        this.type = outcomeType;
        this.params = outcomeParameters;
    }

    public final com.discover.mpos.sdk.transaction.outcome.OutcomeType getType() {
        return this.type;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ TransactionOutcome(com.discover.mpos.sdk.transaction.outcome.OutcomeType r18, com.discover.mpos.sdk.transaction.outcome.OutcomeParameters r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r17 = this;
            r0 = r20 & 2
            if (r0 == 0) goto L20
            com.discover.mpos.sdk.transaction.outcome.OutcomeParameters r0 = new com.discover.mpos.sdk.transaction.outcome.OutcomeParameters
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 4095(0xfff, float:5.738E-42)
            r16 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
            r1 = r17
            r2 = r18
            goto L26
        L20:
            r1 = r17
            r2 = r18
            r0 = r19
        L26:
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discover.mpos.sdk.transaction.outcome.TransactionOutcome.<init>(com.discover.mpos.sdk.transaction.outcome.OutcomeType, com.discover.mpos.sdk.transaction.outcome.OutcomeParameters, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final com.discover.mpos.sdk.transaction.outcome.OutcomeParameters getParams() {
        return this.params;
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        this.params.clear();
    }

    public final java.lang.String toString() {
        return com.discover.mpos.sdk.core.extensions.StringExtensionsKt.toJSONString(this);
    }

    public final int hashCode() {
        com.discover.mpos.sdk.transaction.outcome.OutcomeType outcomeType = this.type;
        int hashCode = outcomeType != null ? outcomeType.hashCode() : 0;
        com.discover.mpos.sdk.transaction.outcome.OutcomeParameters outcomeParameters = this.params;
        return (hashCode * 31) + (outcomeParameters != null ? outcomeParameters.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.transaction.outcome.TransactionOutcome)) {
            return false;
        }
        com.discover.mpos.sdk.transaction.outcome.TransactionOutcome transactionOutcome = (com.discover.mpos.sdk.transaction.outcome.TransactionOutcome) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, transactionOutcome.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.params, transactionOutcome.params);
    }

    public final com.discover.mpos.sdk.transaction.outcome.TransactionOutcome copy(com.discover.mpos.sdk.transaction.outcome.OutcomeType type, com.discover.mpos.sdk.transaction.outcome.OutcomeParameters params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
        return new com.discover.mpos.sdk.transaction.outcome.TransactionOutcome(type, params);
    }

    /* renamed from: component2, reason: from getter */
    public final com.discover.mpos.sdk.transaction.outcome.OutcomeParameters getParams() {
        return this.params;
    }

    /* renamed from: component1, reason: from getter */
    public final com.discover.mpos.sdk.transaction.outcome.OutcomeType getType() {
        return this.type;
    }

    public static /* synthetic */ com.discover.mpos.sdk.transaction.outcome.TransactionOutcome copy$default(com.discover.mpos.sdk.transaction.outcome.TransactionOutcome transactionOutcome, com.discover.mpos.sdk.transaction.outcome.OutcomeType outcomeType, com.discover.mpos.sdk.transaction.outcome.OutcomeParameters outcomeParameters, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            outcomeType = transactionOutcome.type;
        }
        if ((i & 2) != 0) {
            outcomeParameters = transactionOutcome.params;
        }
        return transactionOutcome.copy(outcomeType, outcomeParameters);
    }
}
