package com.paypal.oslo.feature.identity.phoneconfirmation.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\bR\u0011\u0010\u0018\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\bR\u0011\u0010\u001a\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\bR\u0011\u0010\u001b\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneContact;", "", "", "number", "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneContact;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNumber", "getCountryCode", "getFullNumber", "fullNumber", "getMaskedNumber", "maskedNumber", "isValid", "()Z", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PhoneContact {
    public static final int $stable = 0;
    private final java.lang.String countryCode;
    private final java.lang.String number;

    public PhoneContact(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.number = str;
        this.countryCode = str2;
    }

    public final java.lang.String getNumber() {
        return this.number;
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public final java.lang.String getFullNumber() {
        java.lang.String str = this.countryCode;
        java.lang.String str2 = this.number;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("+");
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public final java.lang.String getMaskedNumber() {
        java.lang.String concat = "+".concat(java.lang.String.valueOf(this.countryCode));
        if (this.number.length() < 4) {
            java.lang.String str = this.number;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(concat);
            sb.append(" ");
            sb.append(str);
            return sb.toString();
        }
        java.lang.String takeLast = kotlin.text.StringsKt.takeLast(this.number, 4);
        java.lang.String repeat = kotlin.text.StringsKt.repeat("•", this.number.length() - 4);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(concat);
        sb2.append(" ");
        sb2.append(repeat);
        sb2.append(takeLast);
        return sb2.toString();
    }

    public final boolean isValid() {
        if (this.number.length() > 0 && this.countryCode.length() > 0 && kotlin.jvm.internal.Intrinsics.areEqual(kotlin.text.StringsKt.trim(this.number).toString(), this.number) && kotlin.jvm.internal.Intrinsics.areEqual(kotlin.text.StringsKt.trim(this.countryCode).toString(), this.countryCode)) {
            java.lang.String str = this.number;
            int i = 0;
            while (true) {
                if (i < str.length()) {
                    if (!java.lang.Character.isDigit(str.charAt(i))) {
                        break;
                    }
                    i++;
                } else {
                    java.lang.String str2 = this.countryCode;
                    int i2 = 0;
                    while (true) {
                        if (i2 < str2.length()) {
                            if (!java.lang.Character.isDigit(str2.charAt(i2))) {
                                break;
                            }
                            i2++;
                        } else {
                            int length = this.number.length();
                            int length2 = this.countryCode.length();
                            if (7 > length || length >= 16 || length2 <= 0 || length2 >= 4) {
                                break;
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.number;
        java.lang.String str2 = this.countryCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PhoneContact(number=");
        sb.append(str);
        sb.append(", countryCode=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.number.hashCode() * 31) + this.countryCode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneContact)) {
            return false;
        }
        com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneContact phoneContact = (com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneContact) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.number, phoneContact.number) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, phoneContact.countryCode);
    }

    public final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneContact copy(java.lang.String number, java.lang.String countryCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        return new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneContact(number, countryCode);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getNumber() {
        return this.number;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneContact copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneContact phoneContact, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = phoneContact.number;
        }
        if ((i & 2) != 0) {
            str2 = phoneContact.countryCode;
        }
        return phoneContact.copy(str, str2);
    }
}
