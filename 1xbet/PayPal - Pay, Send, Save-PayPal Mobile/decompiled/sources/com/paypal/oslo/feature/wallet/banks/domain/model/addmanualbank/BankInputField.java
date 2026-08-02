package com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0012J\u0010\u0010\u001b\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJt\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b)\u0010\u0015R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0018R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b,\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b-\u0010\u0012R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BankInputField;", "", "", "name", "group", "", "maximumLength", "minimumLength", "", "prepopulatedValues", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/PrepopulatedValue;", "prepopulatedOptions", "regex", "", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_RESIDENT_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/util/List;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/util/List;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BankInputField;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getName", "getGroup", com.visa.cbp.getEncExpo.warmup, "getMaximumLength", "getMinimumLength", "Ljava/util/List;", "getPrepopulatedValues", "getPrepopulatedOptions", "getRegex", "Z", "getRequired"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BankInputField {
    public static final int $stable = 8;
    private final java.lang.String group;
    private final int maximumLength;
    private final int minimumLength;
    private final java.lang.String name;
    private final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.PrepopulatedValue> prepopulatedOptions;
    private final java.util.List<java.lang.String> prepopulatedValues;
    private final java.lang.String regex;
    private final boolean required;

    public BankInputField(java.lang.String str, java.lang.String str2, int i, int i2, java.util.List<java.lang.String> list, java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.PrepopulatedValue> list2, java.lang.String str3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        this.group = str2;
        this.maximumLength = i;
        this.minimumLength = i2;
        this.prepopulatedValues = list;
        this.prepopulatedOptions = list2;
        this.regex = str3;
        this.required = z;
    }

    public /* synthetic */ BankInputField(java.lang.String str, java.lang.String str2, int i, int i2, java.util.List list, java.util.List list2, java.lang.String str3, boolean z, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, i2, list, (i3 & 32) != 0 ? null : list2, str3, z);
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getGroup() {
        return this.group;
    }

    public final int getMaximumLength() {
        return this.maximumLength;
    }

    public final int getMinimumLength() {
        return this.minimumLength;
    }

    public final java.util.List<java.lang.String> getPrepopulatedValues() {
        return this.prepopulatedValues;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.PrepopulatedValue> getPrepopulatedOptions() {
        return this.prepopulatedOptions;
    }

    public final java.lang.String getRegex() {
        return this.regex;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.group;
        int i = this.maximumLength;
        int i2 = this.minimumLength;
        java.util.List<java.lang.String> list = this.prepopulatedValues;
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.PrepopulatedValue> list2 = this.prepopulatedOptions;
        java.lang.String str3 = this.regex;
        boolean z = this.required;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BankInputField(name=");
        sb.append(str);
        sb.append(", group=");
        sb.append(str2);
        sb.append(", maximumLength=");
        sb.append(i);
        sb.append(", minimumLength=");
        sb.append(i2);
        sb.append(", prepopulatedValues=");
        sb.append(list);
        sb.append(", prepopulatedOptions=");
        sb.append(list2);
        sb.append(", regex=");
        sb.append(str3);
        sb.append(", required=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        java.lang.String str = this.group;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = java.lang.Integer.hashCode(this.maximumLength);
        int hashCode4 = java.lang.Integer.hashCode(this.minimumLength);
        java.util.List<java.lang.String> list = this.prepopulatedValues;
        int hashCode5 = list == null ? 0 : list.hashCode();
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.PrepopulatedValue> list2 = this.prepopulatedOptions;
        int hashCode6 = list2 == null ? 0 : list2.hashCode();
        java.lang.String str2 = this.regex;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.required);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankInputField)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankInputField bankInputField = (com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankInputField) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, bankInputField.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.group, bankInputField.group) && this.maximumLength == bankInputField.maximumLength && this.minimumLength == bankInputField.minimumLength && kotlin.jvm.internal.Intrinsics.areEqual(this.prepopulatedValues, bankInputField.prepopulatedValues) && kotlin.jvm.internal.Intrinsics.areEqual(this.prepopulatedOptions, bankInputField.prepopulatedOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.regex, bankInputField.regex) && this.required == bankInputField.required;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankInputField copy(java.lang.String name2, java.lang.String group, int maximumLength, int minimumLength, java.util.List<java.lang.String> prepopulatedValues, java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.PrepopulatedValue> prepopulatedOptions, java.lang.String regex, boolean required) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankInputField(name2, group, maximumLength, minimumLength, prepopulatedValues, prepopulatedOptions, regex, required);
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getRegex() {
        return this.regex;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.PrepopulatedValue> component6() {
        return this.prepopulatedOptions;
    }

    public final java.util.List<java.lang.String> component5() {
        return this.prepopulatedValues;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMinimumLength() {
        return this.minimumLength;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaximumLength() {
        return this.maximumLength;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getGroup() {
        return this.group;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }
}
