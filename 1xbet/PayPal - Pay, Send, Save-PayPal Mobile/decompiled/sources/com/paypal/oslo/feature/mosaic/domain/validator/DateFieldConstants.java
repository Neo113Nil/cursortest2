package com.paypal.oslo.feature.mosaic.domain.validator;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/domain/validator/DateFieldConstants;", "", "<init>", "()V", "", "DEFAULT_DATE_FORMAT", "Ljava/lang/String;", "INPUT_MASK", "", "MIN_AGE", com.visa.cbp.getEncExpo.warmup, "MAX_AGE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DateFieldConstants {
    public static final int $stable = 0;
    public static final java.lang.String DEFAULT_DATE_FORMAT = "MM/DD/YYYY";
    public static final java.lang.String INPUT_MASK = "00/00/0000";
    public static final com.paypal.oslo.feature.mosaic.domain.validator.DateFieldConstants INSTANCE = new com.paypal.oslo.feature.mosaic.domain.validator.DateFieldConstants();
    public static final int MAX_AGE = 100;
    public static final int MIN_AGE = 18;

    private DateFieldConstants() {
    }
}
