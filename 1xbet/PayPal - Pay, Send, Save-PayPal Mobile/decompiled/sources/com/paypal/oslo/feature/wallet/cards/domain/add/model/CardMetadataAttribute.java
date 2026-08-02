package com.paypal.oslo.feature.wallet.cards.domain.add.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rJ\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u0006\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u0007\u0010\u0010R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardMetadataAttribute;", "", "", "minimumLength", "maximumLength", "", "isRequired", "isEditable", "", "regex", "<init>", "(IIZZLjava/lang/String;)V", "component1", "()I", "component2", "component3", "()Z", "component4", "component5", "()Ljava/lang/String;", "copy", "(IIZZLjava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardMetadataAttribute;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getMinimumLength", "getMaximumLength", "Z", "Ljava/lang/String;", "getRegex"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CardMetadataAttribute {
    public static final int $stable = 0;
    private final boolean isEditable;
    private final boolean isRequired;
    private final int maximumLength;
    private final int minimumLength;
    private final java.lang.String regex;

    public CardMetadataAttribute(int i, int i2, boolean z, boolean z2, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.minimumLength = i;
        this.maximumLength = i2;
        this.isRequired = z;
        this.isEditable = z2;
        this.regex = str;
    }

    public final int getMinimumLength() {
        return this.minimumLength;
    }

    public final int getMaximumLength() {
        return this.maximumLength;
    }

    public final boolean isRequired() {
        return this.isRequired;
    }

    public final boolean isEditable() {
        return this.isEditable;
    }

    public final java.lang.String getRegex() {
        return this.regex;
    }

    public final java.lang.String toString() {
        int i = this.minimumLength;
        int i2 = this.maximumLength;
        boolean z = this.isRequired;
        boolean z2 = this.isEditable;
        java.lang.String str = this.regex;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardMetadataAttribute(minimumLength=");
        sb.append(i);
        sb.append(", maximumLength=");
        sb.append(i2);
        sb.append(", isRequired=");
        sb.append(z);
        sb.append(", isEditable=");
        sb.append(z2);
        sb.append(", regex=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.minimumLength) * 31) + java.lang.Integer.hashCode(this.maximumLength)) * 31) + java.lang.Boolean.hashCode(this.isRequired)) * 31) + java.lang.Boolean.hashCode(this.isEditable)) * 31) + this.regex.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute cardMetadataAttribute = (com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute) other;
        return this.minimumLength == cardMetadataAttribute.minimumLength && this.maximumLength == cardMetadataAttribute.maximumLength && this.isRequired == cardMetadataAttribute.isRequired && this.isEditable == cardMetadataAttribute.isEditable && kotlin.jvm.internal.Intrinsics.areEqual(this.regex, cardMetadataAttribute.regex);
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute copy(int minimumLength, int maximumLength, boolean isRequired, boolean isEditable, java.lang.String regex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(regex, "");
        return new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute(minimumLength, maximumLength, isRequired, isEditable, regex);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getRegex() {
        return this.regex;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsEditable() {
        return this.isEditable;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaximumLength() {
        return this.maximumLength;
    }

    /* renamed from: component1, reason: from getter */
    public final int getMinimumLength() {
        return this.minimumLength;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute copy$default(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardMetadataAttribute cardMetadataAttribute, int i, int i2, boolean z, boolean z2, java.lang.String str, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = cardMetadataAttribute.minimumLength;
        }
        if ((i3 & 2) != 0) {
            i2 = cardMetadataAttribute.maximumLength;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            z = cardMetadataAttribute.isRequired;
        }
        boolean z3 = z;
        if ((i3 & 8) != 0) {
            z2 = cardMetadataAttribute.isEditable;
        }
        boolean z4 = z2;
        if ((i3 & 16) != 0) {
            str = cardMetadataAttribute.regex;
        }
        return cardMetadataAttribute.copy(i, i4, z3, z4, str);
    }
}
