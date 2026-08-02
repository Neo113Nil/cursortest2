package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0018\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\\\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0010R\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0013R\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b(\u0010\u0013R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u0016R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/UpdateMoneyboxInput;", "", "", "id", "name", "Lcom/apollographql/apollo/api/Optional;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;", "targetAmount", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxType;", "type", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory;", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxType;Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/apollographql/apollo/api/Optional;", "component4", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxType;", "component6", "()Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxType;Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory;)Lcom/paypal/oslo/api/graphql/schema/type/UpdateMoneyboxInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "Lcom/apollographql/apollo/api/Optional;", "getDescription", "getTargetAmount", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxType;", "getType", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory;", "getCategory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdateMoneyboxInput {
    private final com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory category;
    private final com.apollographql.apollo.api.Optional<java.lang.String> description;
    private final java.lang.String id;
    private final java.lang.String name;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> targetAmount;
    private final com.paypal.oslo.api.graphql.schema.type.MoneyboxType type;

    public UpdateMoneyboxInput(java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional<java.lang.String> optional, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional2, com.paypal.oslo.api.graphql.schema.type.MoneyboxType moneyboxType, com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory moneyboxCategory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxCategory, "");
        this.id = str;
        this.name = str2;
        this.description = optional;
        this.targetAmount = optional2;
        this.type = moneyboxType;
        this.category = moneyboxCategory;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public /* synthetic */ UpdateMoneyboxInput(java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.paypal.oslo.api.graphql.schema.type.MoneyboxType moneyboxType, com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory moneyboxCategory, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, moneyboxType, moneyboxCategory);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getDescription() {
        return this.description;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> getTargetAmount() {
        return this.targetAmount;
    }

    public final com.paypal.oslo.api.graphql.schema.type.MoneyboxType getType() {
        return this.type;
    }

    public final com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory getCategory() {
        return this.category;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.name;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.description;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional2 = this.targetAmount;
        com.paypal.oslo.api.graphql.schema.type.MoneyboxType moneyboxType = this.type;
        com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory moneyboxCategory = this.category;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateMoneyboxInput(id=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(optional);
        sb.append(", targetAmount=");
        sb.append(optional2);
        sb.append(", type=");
        sb.append(moneyboxType);
        sb.append(", category=");
        sb.append(moneyboxCategory);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.targetAmount.hashCode()) * 31) + this.type.hashCode()) * 31) + this.category.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxInput updateMoneyboxInput = (com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, updateMoneyboxInput.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, updateMoneyboxInput.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, updateMoneyboxInput.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetAmount, updateMoneyboxInput.targetAmount) && this.type == updateMoneyboxInput.type && this.category == updateMoneyboxInput.category;
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxInput copy(java.lang.String id, java.lang.String name2, com.apollographql.apollo.api.Optional<java.lang.String> description, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> targetAmount, com.paypal.oslo.api.graphql.schema.type.MoneyboxType type, com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory category) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(category, "");
        return new com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxInput(id, name2, description, targetAmount, type, category);
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory getCategory() {
        return this.category;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.MoneyboxType getType() {
        return this.type;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> component4() {
        return this.targetAmount;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component3() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxInput copy$default(com.paypal.oslo.api.graphql.schema.type.UpdateMoneyboxInput updateMoneyboxInput, java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.paypal.oslo.api.graphql.schema.type.MoneyboxType moneyboxType, com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory moneyboxCategory, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = updateMoneyboxInput.id;
        }
        if ((i & 2) != 0) {
            str2 = updateMoneyboxInput.name;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            optional = updateMoneyboxInput.description;
        }
        com.apollographql.apollo.api.Optional optional3 = optional;
        if ((i & 8) != 0) {
            optional2 = updateMoneyboxInput.targetAmount;
        }
        com.apollographql.apollo.api.Optional optional4 = optional2;
        if ((i & 16) != 0) {
            moneyboxType = updateMoneyboxInput.type;
        }
        com.paypal.oslo.api.graphql.schema.type.MoneyboxType moneyboxType2 = moneyboxType;
        if ((i & 32) != 0) {
            moneyboxCategory = updateMoneyboxInput.category;
        }
        return updateMoneyboxInput.copy(str, str3, optional3, optional4, moneyboxType2, moneyboxCategory);
    }
}
