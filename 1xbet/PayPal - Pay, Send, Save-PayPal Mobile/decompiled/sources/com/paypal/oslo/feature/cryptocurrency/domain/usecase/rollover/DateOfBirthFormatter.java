package com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0001\bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rollover/DateOfBirthFormatter;", "", "<init>", "()V", "", "dateOfBirth", "format", "(Ljava/lang/String;)Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DateOfBirthFormatter {
    public static final int $stable = 0;

    @javax.inject.Inject
    public DateOfBirthFormatter() {
    }

    public final java.lang.String format(java.lang.String dateOfBirth) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateOfBirth, "");
        try {
            java.time.format.DateTimeFormatter ofPattern = java.time.format.DateTimeFormatter.ofPattern(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConstants.DOB_DEFAULT_VALIDATION_PATTERN);
            return java.time.LocalDate.parse(dateOfBirth, ofPattern).format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } catch (java.time.format.DateTimeParseException unused) {
            return null;
        }
    }
}
