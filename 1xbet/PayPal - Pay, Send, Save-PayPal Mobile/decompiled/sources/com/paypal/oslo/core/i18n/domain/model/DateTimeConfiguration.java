package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/DateTimeConfiguration;", "", "Lcom/paypal/oslo/core/i18n/domain/model/DateFormat;", "dateFormat", "Ljava/util/Locale;", "locale", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/model/DateFormat;Ljava/util/Locale;)V", "component1", "()Lcom/paypal/oslo/core/i18n/domain/model/DateFormat;", "component2", "()Ljava/util/Locale;", "copy", "(Lcom/paypal/oslo/core/i18n/domain/model/DateFormat;Ljava/util/Locale;)Lcom/paypal/oslo/core/i18n/domain/model/DateTimeConfiguration;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/i18n/domain/model/DateFormat;", "getDateFormat", "Ljava/util/Locale;", "getLocale"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DateTimeConfiguration {
    private final com.paypal.oslo.core.i18n.domain.model.DateFormat dateFormat;
    private final java.util.Locale locale;

    public DateTimeConfiguration(com.paypal.oslo.core.i18n.domain.model.DateFormat dateFormat, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateFormat, "");
        this.dateFormat = dateFormat;
        this.locale = locale;
    }

    public /* synthetic */ DateTimeConfiguration(com.paypal.oslo.core.i18n.domain.model.DateFormat dateFormat, java.util.Locale locale, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(dateFormat, (i & 2) != 0 ? null : locale);
    }

    public final com.paypal.oslo.core.i18n.domain.model.DateFormat getDateFormat() {
        return this.dateFormat;
    }

    public final java.util.Locale getLocale() {
        return this.locale;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.i18n.domain.model.DateFormat dateFormat = this.dateFormat;
        java.util.Locale locale = this.locale;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DateTimeConfiguration(dateFormat=");
        sb.append(dateFormat);
        sb.append(", locale=");
        sb.append(locale);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.dateFormat.hashCode();
        java.util.Locale locale = this.locale;
        return (hashCode * 31) + (locale == null ? 0 : locale.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration)) {
            return false;
        }
        com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration dateTimeConfiguration = (com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.dateFormat, dateTimeConfiguration.dateFormat) && kotlin.jvm.internal.Intrinsics.areEqual(this.locale, dateTimeConfiguration.locale);
    }

    public final com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration copy(com.paypal.oslo.core.i18n.domain.model.DateFormat dateFormat, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateFormat, "");
        return new com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration(dateFormat, locale);
    }

    /* renamed from: component2, reason: from getter */
    public final java.util.Locale getLocale() {
        return this.locale;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.i18n.domain.model.DateFormat getDateFormat() {
        return this.dateFormat;
    }

    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration copy$default(com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration dateTimeConfiguration, com.paypal.oslo.core.i18n.domain.model.DateFormat dateFormat, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            dateFormat = dateTimeConfiguration.dateFormat;
        }
        if ((i & 2) != 0) {
            locale = dateTimeConfiguration.locale;
        }
        return dateTimeConfiguration.copy(dateFormat, locale);
    }
}
