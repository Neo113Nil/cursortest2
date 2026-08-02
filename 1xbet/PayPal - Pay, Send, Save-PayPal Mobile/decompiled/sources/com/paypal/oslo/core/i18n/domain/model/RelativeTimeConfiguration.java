package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeConfiguration;", "", "Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Lcom/paypal/oslo/core/i18n/domain/model/DurationUnit;", "unit", "Ljava/util/Locale;", "locale", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeStyle;Lcom/paypal/oslo/core/i18n/domain/model/DurationUnit;Ljava/util/Locale;)V", "component1", "()Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeStyle;", "component2", "()Lcom/paypal/oslo/core/i18n/domain/model/DurationUnit;", "component3", "()Ljava/util/Locale;", "copy", "(Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeStyle;Lcom/paypal/oslo/core/i18n/domain/model/DurationUnit;Ljava/util/Locale;)Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeConfiguration;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeStyle;", "getStyle", "Lcom/paypal/oslo/core/i18n/domain/model/DurationUnit;", "getUnit", "Ljava/util/Locale;", "getLocale"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RelativeTimeConfiguration {
    private final java.util.Locale locale;
    private final com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle style;
    private final com.paypal.oslo.core.i18n.domain.model.DurationUnit unit;

    public RelativeTimeConfiguration(com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle relativeTimeStyle, com.paypal.oslo.core.i18n.domain.model.DurationUnit durationUnit, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relativeTimeStyle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit, "");
        this.style = relativeTimeStyle;
        this.unit = durationUnit;
        this.locale = locale;
    }

    public /* synthetic */ RelativeTimeConfiguration(com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle relativeTimeStyle, com.paypal.oslo.core.i18n.domain.model.DurationUnit durationUnit, java.util.Locale locale, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(relativeTimeStyle, durationUnit, (i & 4) != 0 ? null : locale);
    }

    public final com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle getStyle() {
        return this.style;
    }

    public final com.paypal.oslo.core.i18n.domain.model.DurationUnit getUnit() {
        return this.unit;
    }

    public final java.util.Locale getLocale() {
        return this.locale;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle relativeTimeStyle = this.style;
        com.paypal.oslo.core.i18n.domain.model.DurationUnit durationUnit = this.unit;
        java.util.Locale locale = this.locale;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RelativeTimeConfiguration(style=");
        sb.append(relativeTimeStyle);
        sb.append(", unit=");
        sb.append(durationUnit);
        sb.append(", locale=");
        sb.append(locale);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.style.hashCode();
        int hashCode2 = this.unit.hashCode();
        java.util.Locale locale = this.locale;
        return (((hashCode * 31) + hashCode2) * 31) + (locale == null ? 0 : locale.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.i18n.domain.model.RelativeTimeConfiguration)) {
            return false;
        }
        com.paypal.oslo.core.i18n.domain.model.RelativeTimeConfiguration relativeTimeConfiguration = (com.paypal.oslo.core.i18n.domain.model.RelativeTimeConfiguration) other;
        return this.style == relativeTimeConfiguration.style && this.unit == relativeTimeConfiguration.unit && kotlin.jvm.internal.Intrinsics.areEqual(this.locale, relativeTimeConfiguration.locale);
    }

    public final com.paypal.oslo.core.i18n.domain.model.RelativeTimeConfiguration copy(com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle style, com.paypal.oslo.core.i18n.domain.model.DurationUnit unit, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(style, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
        return new com.paypal.oslo.core.i18n.domain.model.RelativeTimeConfiguration(style, unit, locale);
    }

    /* renamed from: component3, reason: from getter */
    public final java.util.Locale getLocale() {
        return this.locale;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.i18n.domain.model.DurationUnit getUnit() {
        return this.unit;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle getStyle() {
        return this.style;
    }

    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.RelativeTimeConfiguration copy$default(com.paypal.oslo.core.i18n.domain.model.RelativeTimeConfiguration relativeTimeConfiguration, com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle relativeTimeStyle, com.paypal.oslo.core.i18n.domain.model.DurationUnit durationUnit, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            relativeTimeStyle = relativeTimeConfiguration.style;
        }
        if ((i & 2) != 0) {
            durationUnit = relativeTimeConfiguration.unit;
        }
        if ((i & 4) != 0) {
            locale = relativeTimeConfiguration.locale;
        }
        return relativeTimeConfiguration.copy(relativeTimeStyle, durationUnit, locale);
    }
}
