package com.paypal.oslo.feature.contacts.ui.contacts.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJF\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b!\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/model/CountryUi;", "", "", "id", "name", "dialCode", "", "flagResId", "flagUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/paypal/oslo/feature/contacts/ui/contacts/model/CountryUi;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "getDialCode", "Ljava/lang/Integer;", "getFlagResId", "getFlagUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CountryUi {
    public static final int $stable = 0;
    private final java.lang.String dialCode;
    private final java.lang.Integer flagResId;
    private final java.lang.String flagUrl;
    private final java.lang.String id;
    private final java.lang.String name;

    public CountryUi(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.id = str;
        this.name = str2;
        this.dialCode = str3;
        this.flagResId = num;
        this.flagUrl = str4;
    }

    public /* synthetic */ CountryUi(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getDialCode() {
        return this.dialCode;
    }

    public final java.lang.Integer getFlagResId() {
        return this.flagResId;
    }

    public final java.lang.String getFlagUrl() {
        return this.flagUrl;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.name;
        java.lang.String str3 = this.dialCode;
        java.lang.Integer num = this.flagResId;
        java.lang.String str4 = this.flagUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CountryUi(id=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append(", dialCode=");
        sb.append(str3);
        sb.append(", flagResId=");
        sb.append(num);
        sb.append(", flagUrl=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.name.hashCode();
        int hashCode3 = this.dialCode.hashCode();
        java.lang.Integer num = this.flagResId;
        int hashCode4 = num == null ? 0 : num.hashCode();
        java.lang.String str = this.flagUrl;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi)) {
            return false;
        }
        com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi countryUi = (com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, countryUi.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, countryUi.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.dialCode, countryUi.dialCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.flagResId, countryUi.flagResId) && kotlin.jvm.internal.Intrinsics.areEqual(this.flagUrl, countryUi.flagUrl);
    }

    public final com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi copy(java.lang.String id, java.lang.String name2, java.lang.String dialCode, java.lang.Integer flagResId, java.lang.String flagUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialCode, "");
        return new com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi(id, name2, dialCode, flagResId, flagUrl);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getFlagUrl() {
        return this.flagUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Integer getFlagResId() {
        return this.flagResId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDialCode() {
        return this.dialCode;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi copy$default(com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi countryUi, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = countryUi.id;
        }
        if ((i & 2) != 0) {
            str2 = countryUi.name;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = countryUi.dialCode;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            num = countryUi.flagResId;
        }
        java.lang.Integer num2 = num;
        if ((i & 16) != 0) {
            str4 = countryUi.flagUrl;
        }
        return countryUi.copy(str, str5, str6, num2, str4);
    }
}
