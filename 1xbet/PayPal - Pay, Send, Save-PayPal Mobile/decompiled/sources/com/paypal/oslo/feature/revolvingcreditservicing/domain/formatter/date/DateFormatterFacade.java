package com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J)\u0010\u0005\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0005\u0010\tJ'\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\tJ+\u0010\u0005\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0005\u0010\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "", "Ljava/time/LocalDate;", "date", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat;", "format", "Ljava/util/Locale;", "locale", "", "(Ljava/time/LocalDate;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat;Ljava/util/Locale;)Ljava/lang/String;", "requireFormat", "Ljava/time/Instant;", "(Ljava/time/Instant;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat;Ljava/util/Locale;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface DateFormatterFacade {
    java.lang.String format(java.time.Instant date, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat format, java.util.Locale locale);

    java.lang.String format(java.time.LocalDate date, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat format, java.util.Locale locale);

    java.lang.String requireFormat(java.time.LocalDate date, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat format, java.util.Locale locale);
}
