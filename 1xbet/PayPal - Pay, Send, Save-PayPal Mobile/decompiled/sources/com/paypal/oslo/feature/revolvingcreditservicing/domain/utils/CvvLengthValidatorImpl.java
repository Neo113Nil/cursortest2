package com.paypal.oslo.feature.revolvingcreditservicing.domain.utils;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/utils/CvvLengthValidatorImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/utils/CvvLengthValidator;", "<init>", "()V", "", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "", "isCvvLengthValid", "(Ljava/lang/String;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CvvLengthValidatorImpl implements com.paypal.oslo.feature.revolvingcreditservicing.domain.utils.CvvLengthValidator {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CvvLengthValidatorImpl() {
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.utils.CvvLengthValidator
    public final boolean isCvvLengthValid(java.lang.String cvv) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvv, "");
        return cvv.length() == 3;
    }
}
