package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001bB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumber;", "", "", "countryCode", "", com.microblink.blinkid.entities.recognizers.blinkid.jordan.JordanCombinedRecognizer.VerificationConstants.NationalNumber, "extension", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "copy", "(ILjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumber;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getCountryCode", "Ljava/lang/String;", "getNationalNumber", "getExtension", com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PhoneNumber {
    private final int countryCode;
    private final java.lang.String extension;
    private final java.lang.String nationalNumber;

    public PhoneNumber(int i, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.countryCode = i;
        this.nationalNumber = str;
        this.extension = str2;
    }

    public /* synthetic */ PhoneNumber(int i, java.lang.String str, java.lang.String str2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : str2);
    }

    public final int getCountryCode() {
        return this.countryCode;
    }

    public final java.lang.String getNationalNumber() {
        return this.nationalNumber;
    }

    public final java.lang.String getExtension() {
        return this.extension;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumber$Configuration;", "", "Lcom/paypal/oslo/core/i18n/domain/model/Style;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "", "shouldObscure", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/model/Style;Z)V", "component1", "()Lcom/paypal/oslo/core/i18n/domain/model/Style;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/core/i18n/domain/model/Style;Z)Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumber$Configuration;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/i18n/domain/model/Style;", "getStyle", "Z", "getShouldObscure"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Configuration {
        private final boolean shouldObscure;
        private final com.paypal.oslo.core.i18n.domain.model.Style style;

        public Configuration(com.paypal.oslo.core.i18n.domain.model.Style style, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(style, "");
            this.style = style;
            this.shouldObscure = z;
        }

        public /* synthetic */ Configuration(com.paypal.oslo.core.i18n.domain.model.Style style, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(style, (i & 2) != 0 ? false : z);
        }

        public final com.paypal.oslo.core.i18n.domain.model.Style getStyle() {
            return this.style;
        }

        public final boolean getShouldObscure() {
            return this.shouldObscure;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.i18n.domain.model.Style style = this.style;
            boolean z = this.shouldObscure;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Configuration(style=");
            sb.append(style);
            sb.append(", shouldObscure=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.style.hashCode() * 31) + java.lang.Boolean.hashCode(this.shouldObscure);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.i18n.domain.model.PhoneNumber.Configuration)) {
                return false;
            }
            com.paypal.oslo.core.i18n.domain.model.PhoneNumber.Configuration configuration = (com.paypal.oslo.core.i18n.domain.model.PhoneNumber.Configuration) other;
            return this.style == configuration.style && this.shouldObscure == configuration.shouldObscure;
        }

        public final com.paypal.oslo.core.i18n.domain.model.PhoneNumber.Configuration copy(com.paypal.oslo.core.i18n.domain.model.Style style, boolean shouldObscure) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(style, "");
            return new com.paypal.oslo.core.i18n.domain.model.PhoneNumber.Configuration(style, shouldObscure);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldObscure() {
            return this.shouldObscure;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.Style getStyle() {
            return this.style;
        }

        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.PhoneNumber.Configuration copy$default(com.paypal.oslo.core.i18n.domain.model.PhoneNumber.Configuration configuration, com.paypal.oslo.core.i18n.domain.model.Style style, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                style = configuration.style;
            }
            if ((i & 2) != 0) {
                z = configuration.shouldObscure;
            }
            return configuration.copy(style, z);
        }
    }

    public final java.lang.String toString() {
        int i = this.countryCode;
        java.lang.String str = this.nationalNumber;
        java.lang.String str2 = this.extension;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PhoneNumber(countryCode=");
        sb.append(i);
        sb.append(", nationalNumber=");
        sb.append(str);
        sb.append(", extension=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.countryCode);
        int hashCode2 = this.nationalNumber.hashCode();
        java.lang.String str = this.extension;
        return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.i18n.domain.model.PhoneNumber)) {
            return false;
        }
        com.paypal.oslo.core.i18n.domain.model.PhoneNumber phoneNumber = (com.paypal.oslo.core.i18n.domain.model.PhoneNumber) other;
        return this.countryCode == phoneNumber.countryCode && kotlin.jvm.internal.Intrinsics.areEqual(this.nationalNumber, phoneNumber.nationalNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.extension, phoneNumber.extension);
    }

    public final com.paypal.oslo.core.i18n.domain.model.PhoneNumber copy(int countryCode, java.lang.String nationalNumber, java.lang.String extension) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nationalNumber, "");
        return new com.paypal.oslo.core.i18n.domain.model.PhoneNumber(countryCode, nationalNumber, extension);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getExtension() {
        return this.extension;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getNationalNumber() {
        return this.nationalNumber;
    }

    /* renamed from: component1, reason: from getter */
    public final int getCountryCode() {
        return this.countryCode;
    }

    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.PhoneNumber copy$default(com.paypal.oslo.core.i18n.domain.model.PhoneNumber phoneNumber, int i, java.lang.String str, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = phoneNumber.countryCode;
        }
        if ((i2 & 2) != 0) {
            str = phoneNumber.nationalNumber;
        }
        if ((i2 & 4) != 0) {
            str2 = phoneNumber.extension;
        }
        return phoneNumber.copy(i, str, str2);
    }
}
