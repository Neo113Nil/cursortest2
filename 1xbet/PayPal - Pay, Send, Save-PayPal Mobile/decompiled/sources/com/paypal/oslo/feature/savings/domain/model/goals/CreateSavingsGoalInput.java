package com.paypal.oslo.feature.savings.domain.model.goals;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ`\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b\n\u0010\u0018R\"\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/goals/CreateSavingsGoalInput;", "", "", "name", "type", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "category", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/Money;", "targetAmount", "", "isInsured", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferSettingsInput;", "Lcom/paypal/oslo/feature/savings/graphql/type/MoneyboxTransferSettingsInput;", "transferSettings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/Money;ZLcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferSettingsInput;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/savings/domain/model/transfers/Money;", "component6", "()Z", "component7", "()Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferSettingsInput;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/Money;ZLcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferSettingsInput;)Lcom/paypal/oslo/feature/savings/domain/model/goals/CreateSavingsGoalInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getType", "getDescription", "getCategory", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/Money;", "getTargetAmount", "Z", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxTransferSettingsInput;", "getTransferSettings"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CreateSavingsGoalInput {
    public static final int $stable = 8;
    private final java.lang.String category;
    private final java.lang.String description;
    private final boolean isInsured;
    private final java.lang.String name;
    private final com.paypal.oslo.feature.savings.domain.model.transfers.Money targetAmount;
    private final com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsInput transferSettings;
    private final java.lang.String type;

    public CreateSavingsGoalInput(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.savings.domain.model.transfers.Money money, boolean z, com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsInput moneyboxTransferSettingsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        this.name = str;
        this.type = str2;
        this.description = str3;
        this.category = str4;
        this.targetAmount = money;
        this.isInsured = z;
        this.transferSettings = moneyboxTransferSettingsInput;
    }

    public /* synthetic */ CreateSavingsGoalInput(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.savings.domain.model.transfers.Money money, boolean z, com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsInput moneyboxTransferSettingsInput, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, str4, money, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : moneyboxTransferSettingsInput);
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String getCategory() {
        return this.category;
    }

    public final com.paypal.oslo.feature.savings.domain.model.transfers.Money getTargetAmount() {
        return this.targetAmount;
    }

    public final boolean isInsured() {
        return this.isInsured;
    }

    public final com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsInput getTransferSettings() {
        return this.transferSettings;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.type;
        java.lang.String str3 = this.description;
        java.lang.String str4 = this.category;
        com.paypal.oslo.feature.savings.domain.model.transfers.Money money = this.targetAmount;
        boolean z = this.isInsured;
        com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsInput moneyboxTransferSettingsInput = this.transferSettings;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateSavingsGoalInput(name=");
        sb.append(str);
        sb.append(", type=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        sb.append(", category=");
        sb.append(str4);
        sb.append(", targetAmount=");
        sb.append(money);
        sb.append(", isInsured=");
        sb.append(z);
        sb.append(", transferSettings=");
        sb.append(moneyboxTransferSettingsInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = this.type.hashCode();
        java.lang.String str = this.description;
        int hashCode3 = str == null ? 0 : str.hashCode();
        int hashCode4 = this.category.hashCode();
        int hashCode5 = this.targetAmount.hashCode();
        int hashCode6 = java.lang.Boolean.hashCode(this.isInsured);
        com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsInput moneyboxTransferSettingsInput = this.transferSettings;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (moneyboxTransferSettingsInput != null ? moneyboxTransferSettingsInput.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.goals.CreateSavingsGoalInput)) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.model.goals.CreateSavingsGoalInput createSavingsGoalInput = (com.paypal.oslo.feature.savings.domain.model.goals.CreateSavingsGoalInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, createSavingsGoalInput.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, createSavingsGoalInput.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, createSavingsGoalInput.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.category, createSavingsGoalInput.category) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetAmount, createSavingsGoalInput.targetAmount) && this.isInsured == createSavingsGoalInput.isInsured && kotlin.jvm.internal.Intrinsics.areEqual(this.transferSettings, createSavingsGoalInput.transferSettings);
    }

    public final com.paypal.oslo.feature.savings.domain.model.goals.CreateSavingsGoalInput copy(java.lang.String name2, java.lang.String type, java.lang.String description, java.lang.String category, com.paypal.oslo.feature.savings.domain.model.transfers.Money targetAmount, boolean isInsured, com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsInput transferSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(category, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetAmount, "");
        return new com.paypal.oslo.feature.savings.domain.model.goals.CreateSavingsGoalInput(name2, type, description, category, targetAmount, isInsured, transferSettings);
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsInput getTransferSettings() {
        return this.transferSettings;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsInsured() {
        return this.isInsured;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.transfers.Money getTargetAmount() {
        return this.targetAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCategory() {
        return this.category;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.goals.CreateSavingsGoalInput copy$default(com.paypal.oslo.feature.savings.domain.model.goals.CreateSavingsGoalInput createSavingsGoalInput, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.savings.domain.model.transfers.Money money, boolean z, com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsInput moneyboxTransferSettingsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = createSavingsGoalInput.name;
        }
        if ((i & 2) != 0) {
            str2 = createSavingsGoalInput.type;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = createSavingsGoalInput.description;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = createSavingsGoalInput.category;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            money = createSavingsGoalInput.targetAmount;
        }
        com.paypal.oslo.feature.savings.domain.model.transfers.Money money2 = money;
        if ((i & 32) != 0) {
            z = createSavingsGoalInput.isInsured;
        }
        boolean z2 = z;
        if ((i & 64) != 0) {
            moneyboxTransferSettingsInput = createSavingsGoalInput.transferSettings;
        }
        return createSavingsGoalInput.copy(str, str5, str6, str7, money2, z2, moneyboxTransferSettingsInput);
    }
}
