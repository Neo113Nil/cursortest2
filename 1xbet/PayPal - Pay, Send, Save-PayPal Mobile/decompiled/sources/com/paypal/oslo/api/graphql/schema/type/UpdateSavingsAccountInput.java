package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0018\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0018\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011Jb\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0011R\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\"\u0010\u0011R\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b#\u0010\u0011R\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b$\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/UpdateSavingsAccountInput;", "", "", "id", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountStatus;", "accountStatus", "Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountLifecycleStatus;", "lifecycleStatus", "", "e1099OptIn", "backupWithholdingEnabled", "<init>", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/UpdateSavingsAccountInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/apollographql/apollo/api/Optional;", "getAccountStatus", "getLifecycleStatus", "getE1099OptIn", "getBackupWithholdingEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdateSavingsAccountInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus> accountStatus;
    private final com.apollographql.apollo.api.Optional<java.lang.Boolean> backupWithholdingEnabled;
    private final com.apollographql.apollo.api.Optional<java.lang.Boolean> e1099OptIn;
    private final java.lang.String id;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SavingsAccountLifecycleStatus> lifecycleStatus;

    /* JADX WARN: Multi-variable type inference failed */
    public UpdateSavingsAccountInput(java.lang.String str, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus> optional, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.SavingsAccountLifecycleStatus> optional2, com.apollographql.apollo.api.Optional<java.lang.Boolean> optional3, com.apollographql.apollo.api.Optional<java.lang.Boolean> optional4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional4, "");
        this.id = str;
        this.accountStatus = optional;
        this.lifecycleStatus = optional2;
        this.e1099OptIn = optional3;
        this.backupWithholdingEnabled = optional4;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public /* synthetic */ UpdateSavingsAccountInput(java.lang.String str, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.apollographql.apollo.api.Optional.Absent absent3, com.apollographql.apollo.api.Optional.Absent absent4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3, (i & 16) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent4);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus> getAccountStatus() {
        return this.accountStatus;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SavingsAccountLifecycleStatus> getLifecycleStatus() {
        return this.lifecycleStatus;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> getE1099OptIn() {
        return this.e1099OptIn;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> getBackupWithholdingEnabled() {
        return this.backupWithholdingEnabled;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus> optional = this.accountStatus;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SavingsAccountLifecycleStatus> optional2 = this.lifecycleStatus;
        com.apollographql.apollo.api.Optional<java.lang.Boolean> optional3 = this.e1099OptIn;
        com.apollographql.apollo.api.Optional<java.lang.Boolean> optional4 = this.backupWithholdingEnabled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateSavingsAccountInput(id=");
        sb.append(str);
        sb.append(", accountStatus=");
        sb.append(optional);
        sb.append(", lifecycleStatus=");
        sb.append(optional2);
        sb.append(", e1099OptIn=");
        sb.append(optional3);
        sb.append(", backupWithholdingEnabled=");
        sb.append(optional4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.accountStatus.hashCode()) * 31) + this.lifecycleStatus.hashCode()) * 31) + this.e1099OptIn.hashCode()) * 31) + this.backupWithholdingEnabled.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.UpdateSavingsAccountInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.UpdateSavingsAccountInput updateSavingsAccountInput = (com.paypal.oslo.api.graphql.schema.type.UpdateSavingsAccountInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, updateSavingsAccountInput.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountStatus, updateSavingsAccountInput.accountStatus) && kotlin.jvm.internal.Intrinsics.areEqual(this.lifecycleStatus, updateSavingsAccountInput.lifecycleStatus) && kotlin.jvm.internal.Intrinsics.areEqual(this.e1099OptIn, updateSavingsAccountInput.e1099OptIn) && kotlin.jvm.internal.Intrinsics.areEqual(this.backupWithholdingEnabled, updateSavingsAccountInput.backupWithholdingEnabled);
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdateSavingsAccountInput copy(java.lang.String id, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus> accountStatus, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.SavingsAccountLifecycleStatus> lifecycleStatus, com.apollographql.apollo.api.Optional<java.lang.Boolean> e1099OptIn, com.apollographql.apollo.api.Optional<java.lang.Boolean> backupWithholdingEnabled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e1099OptIn, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backupWithholdingEnabled, "");
        return new com.paypal.oslo.api.graphql.schema.type.UpdateSavingsAccountInput(id, accountStatus, lifecycleStatus, e1099OptIn, backupWithholdingEnabled);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> component5() {
        return this.backupWithholdingEnabled;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> component4() {
        return this.e1099OptIn;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SavingsAccountLifecycleStatus> component3() {
        return this.lifecycleStatus;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus> component2() {
        return this.accountStatus;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.UpdateSavingsAccountInput copy$default(com.paypal.oslo.api.graphql.schema.type.UpdateSavingsAccountInput updateSavingsAccountInput, java.lang.String str, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, com.apollographql.apollo.api.Optional optional4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = updateSavingsAccountInput.id;
        }
        if ((i & 2) != 0) {
            optional = updateSavingsAccountInput.accountStatus;
        }
        com.apollographql.apollo.api.Optional optional5 = optional;
        if ((i & 4) != 0) {
            optional2 = updateSavingsAccountInput.lifecycleStatus;
        }
        com.apollographql.apollo.api.Optional optional6 = optional2;
        if ((i & 8) != 0) {
            optional3 = updateSavingsAccountInput.e1099OptIn;
        }
        com.apollographql.apollo.api.Optional optional7 = optional3;
        if ((i & 16) != 0) {
            optional4 = updateSavingsAccountInput.backupWithholdingEnabled;
        }
        return updateSavingsAccountInput.copy(str, optional5, optional6, optional7, optional4);
    }
}
