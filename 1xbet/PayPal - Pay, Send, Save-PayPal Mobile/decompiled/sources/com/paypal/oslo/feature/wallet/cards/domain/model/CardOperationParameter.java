package com.paypal.oslo.feature.wallet.cards.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJ`\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b%\u0010\u000fR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b(\u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b)\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperationParameter;", "", "", "name", "", "minimumLength", "maximumLength", "regex", "", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_RESIDENT_KEY, "labelKey", "group", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "()Z", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/model/CardOperationParameter;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "Ljava/lang/Integer;", "getMinimumLength", "getMaximumLength", "getRegex", "Z", "getRequired", "getLabelKey", "getGroup"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CardOperationParameter {
    public static final int $stable = 0;
    private final java.lang.String group;
    private final java.lang.String labelKey;
    private final java.lang.Integer maximumLength;
    private final java.lang.Integer minimumLength;
    private final java.lang.String name;
    private final java.lang.String regex;
    private final boolean required;

    public CardOperationParameter(java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        this.minimumLength = num;
        this.maximumLength = num2;
        this.regex = str2;
        this.required = z;
        this.labelKey = str3;
        this.group = str4;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.Integer getMinimumLength() {
        return this.minimumLength;
    }

    public final java.lang.Integer getMaximumLength() {
        return this.maximumLength;
    }

    public final java.lang.String getRegex() {
        return this.regex;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final java.lang.String getLabelKey() {
        return this.labelKey;
    }

    public final java.lang.String getGroup() {
        return this.group;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.Integer num = this.minimumLength;
        java.lang.Integer num2 = this.maximumLength;
        java.lang.String str2 = this.regex;
        boolean z = this.required;
        java.lang.String str3 = this.labelKey;
        java.lang.String str4 = this.group;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardOperationParameter(name=");
        sb.append(str);
        sb.append(", minimumLength=");
        sb.append(num);
        sb.append(", maximumLength=");
        sb.append(num2);
        sb.append(", regex=");
        sb.append(str2);
        sb.append(", required=");
        sb.append(z);
        sb.append(", labelKey=");
        sb.append(str3);
        sb.append(", group=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        java.lang.Integer num = this.minimumLength;
        int hashCode2 = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.maximumLength;
        int hashCode3 = num2 == null ? 0 : num2.hashCode();
        java.lang.String str = this.regex;
        int hashCode4 = str == null ? 0 : str.hashCode();
        int hashCode5 = java.lang.Boolean.hashCode(this.required);
        java.lang.String str2 = this.labelKey;
        int hashCode6 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.group;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter cardOperationParameter = (com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, cardOperationParameter.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.minimumLength, cardOperationParameter.minimumLength) && kotlin.jvm.internal.Intrinsics.areEqual(this.maximumLength, cardOperationParameter.maximumLength) && kotlin.jvm.internal.Intrinsics.areEqual(this.regex, cardOperationParameter.regex) && this.required == cardOperationParameter.required && kotlin.jvm.internal.Intrinsics.areEqual(this.labelKey, cardOperationParameter.labelKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.group, cardOperationParameter.group);
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter copy(java.lang.String name2, java.lang.Integer minimumLength, java.lang.Integer maximumLength, java.lang.String regex, boolean required, java.lang.String labelKey, java.lang.String group) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter(name2, minimumLength, maximumLength, regex, required, labelKey, group);
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getGroup() {
        return this.group;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getLabelKey() {
        return this.labelKey;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getRegex() {
        return this.regex;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Integer getMaximumLength() {
        return this.maximumLength;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Integer getMinimumLength() {
        return this.minimumLength;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter copy$default(com.paypal.oslo.feature.wallet.cards.domain.model.CardOperationParameter cardOperationParameter, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cardOperationParameter.name;
        }
        if ((i & 2) != 0) {
            num = cardOperationParameter.minimumLength;
        }
        java.lang.Integer num3 = num;
        if ((i & 4) != 0) {
            num2 = cardOperationParameter.maximumLength;
        }
        java.lang.Integer num4 = num2;
        if ((i & 8) != 0) {
            str2 = cardOperationParameter.regex;
        }
        java.lang.String str5 = str2;
        if ((i & 16) != 0) {
            z = cardOperationParameter.required;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str3 = cardOperationParameter.labelKey;
        }
        java.lang.String str6 = str3;
        if ((i & 64) != 0) {
            str4 = cardOperationParameter.group;
        }
        return cardOperationParameter.copy(str, num3, num4, str5, z2, str6, str4);
    }
}
