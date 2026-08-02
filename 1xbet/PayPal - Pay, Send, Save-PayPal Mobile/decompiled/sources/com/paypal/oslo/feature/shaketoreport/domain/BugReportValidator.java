package com.paypal.oslo.feature.shaketoreport.domain;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\bJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/domain/BugReportValidator;", "", "<init>", "()V", "", "title", "", "isValidTitle", "(Ljava/lang/String;)Z", "isWithinTitleLimit", "steps", "isValidSteps", "isWithinStepsLimit", "stepsToReproduce", "isValidForm", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "getMaxTitleLength", "()I", "getMaxStepsLength"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BugReportValidator {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shaketoreport.domain.BugReportValidator INSTANCE = new com.paypal.oslo.feature.shaketoreport.domain.BugReportValidator();

    public final int getMaxStepsLength() {
        return 500;
    }

    public final int getMaxTitleLength() {
        return 100;
    }

    private BugReportValidator() {
    }

    public final boolean isValidTitle(java.lang.String title) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        return title.length() >= 5;
    }

    public final boolean isWithinTitleLimit(java.lang.String title) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        return title.length() <= 100;
    }

    public final boolean isValidSteps(java.lang.String steps) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(steps, "");
        return steps.length() >= 10;
    }

    public final boolean isWithinStepsLimit(java.lang.String steps) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(steps, "");
        return steps.length() <= 500;
    }

    public final boolean isValidForm(java.lang.String title, java.lang.String stepsToReproduce) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepsToReproduce, "");
        return isValidTitle(title) && isValidSteps(stepsToReproduce);
    }
}
