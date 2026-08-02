package com.payair.logic.cardvalidation;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/payair/logic/cardvalidation/CardDataValidator;", "", "Lcom/payair/model/CardData;", "card", "Lcom/payair/logic/cardvalidation/CardDataValidationReport;", "validate", "(Lcom/payair/model/CardData;)Lcom/payair/logic/cardvalidation/CardDataValidationReport;", "CardValidationContext"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CardDataValidator {
    public static final com.payair.logic.cardvalidation.CardDataValidator INSTANCE = new com.payair.logic.cardvalidation.CardDataValidator();

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.text.Regex f4395a = new kotlin.text.Regex("[0-9]+");

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0012\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/payair/logic/cardvalidation/CardDataValidator$CardValidationContext;", "", "Lcom/payair/logic/cardvalidation/IssuerCardSpecs;", "issuerCardSpecs", "<init>", "(Lcom/payair/logic/cardvalidation/IssuerCardSpecs;)V", "", "pan", "Lcom/payair/logic/cardvalidation/CardValidationResult;", "validatePan", "(Ljava/lang/String;)Lcom/payair/logic/cardvalidation/CardValidationResult;", "expMonth", "expYear", "validateExpDate", "(Ljava/lang/String;Ljava/lang/String;)Lcom/payair/logic/cardvalidation/CardValidationResult;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "validateCvv", "chName", "validateChName", "a", "Lcom/payair/logic/cardvalidation/IssuerCardSpecs;", "getIssuerCardSpecs", "()Lcom/payair/logic/cardvalidation/IssuerCardSpecs;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CardValidationContext {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final com.payair.logic.cardvalidation.IssuerCardSpecs issuerCardSpecs;

        public CardValidationContext(com.payair.logic.cardvalidation.IssuerCardSpecs issuerCardSpecs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuerCardSpecs, "");
            this.issuerCardSpecs = issuerCardSpecs;
        }

        public final com.payair.logic.cardvalidation.IssuerCardSpecs getIssuerCardSpecs() {
            return this.issuerCardSpecs;
        }

        public final com.payair.logic.cardvalidation.CardValidationResult validateChName(java.lang.String chName) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(chName, "")) {
                return com.payair.logic.cardvalidation.CardValidationResult.CH_NAME_EMPTY;
            }
            if (chName == null) {
                return com.payair.logic.cardvalidation.CardValidationResult.CH_NAME_NULL;
            }
            int length = chName.length();
            return (2 > length || length >= 27) ? com.payair.logic.cardvalidation.CardValidationResult.CH_NAME_NONSTANDARD_LENGTH : !new kotlin.text.Regex("[ -~]+").matches(chName) ? com.payair.logic.cardvalidation.CardValidationResult.CH_NAME_NOT_ASCII : com.payair.logic.cardvalidation.CardValidationResult.CH_NAME_CORRECT;
        }

        public final com.payair.logic.cardvalidation.CardValidationResult validateCvv(java.lang.String cvv) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(cvv, "")) {
                return com.payair.logic.cardvalidation.CardValidationResult.CVV_EMPTY;
            }
            if (cvv == null) {
                return com.payair.logic.cardvalidation.CardValidationResult.CVV_NULL;
            }
            if (!com.payair.logic.cardvalidation.CardDataValidator.f4395a.matches(cvv)) {
                return com.payair.logic.cardvalidation.CardValidationResult.CVV_NOT_NUMERIC;
            }
            int length = cvv.length();
            if (3 > length || length >= 5) {
                return com.payair.logic.cardvalidation.CardValidationResult.CVV_WRONG_LENGTH;
            }
            kotlin.ranges.IntRange cvvLength = this.issuerCardSpecs.getCvvLength();
            int first = cvvLength.getFirst();
            int last = cvvLength.getLast();
            int length2 = cvv.length();
            return (first > length2 || length2 > last) ? com.payair.logic.cardvalidation.CardValidationResult.CVV_WRONG_LENGTH_FOR_ISSUER : com.payair.logic.cardvalidation.CardValidationResult.CVV_CORRECT;
        }

        public final com.payair.logic.cardvalidation.CardValidationResult validateExpDate(java.lang.String expMonth, java.lang.String expYear) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expMonth, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expYear, "");
            if (!com.payair.logic.cardvalidation.CardDataValidator.f4395a.matches(expMonth) || !com.payair.logic.cardvalidation.CardDataValidator.f4395a.matches(expYear)) {
                return com.payair.logic.cardvalidation.CardValidationResult.EXP_DATE_WRONG_FORMAT;
            }
            if (expMonth.length() != 2 || expYear.length() != 2) {
                return com.payair.logic.cardvalidation.CardValidationResult.EXP_DATE_WRONG_LENGTH;
            }
            int parseInt = java.lang.Integer.parseInt(expMonth);
            return (parseInt <= 0 || parseInt >= 13) ? com.payair.logic.cardvalidation.CardValidationResult.EXP_DATE_WRONG_MONTH : com.payair.logic.cardvalidation.CardDataValidator.access$isPastDate(com.payair.logic.cardvalidation.CardDataValidator.INSTANCE, java.lang.Integer.parseInt(expMonth), java.lang.Integer.parseInt(expYear)) ? com.payair.logic.cardvalidation.CardValidationResult.EXP_DATE_EXPIRED : com.payair.logic.cardvalidation.CardValidationResult.EXP_DATE_CORRECT;
        }

        public final com.payair.logic.cardvalidation.CardValidationResult validatePan(java.lang.String pan) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pan, "");
            kotlin.ranges.IntRange panLength = this.issuerCardSpecs.getPanLength();
            int first = panLength.getFirst();
            int last = panLength.getLast();
            int length = pan.length();
            return (first > length || length > last) ? com.payair.logic.cardvalidation.CardValidationResult.PAN_WRONG_LENGTH : !com.payair.logic.cardvalidation.CardDataValidator.f4395a.matches(pan) ? com.payair.logic.cardvalidation.CardValidationResult.PAN_NOT_NUMERIC : (com.payair.logic.cardvalidation.CardDataValidator.access$luhnCheck(com.payair.logic.cardvalidation.CardDataValidator.INSTANCE, pan) || !this.issuerCardSpecs.getLuhn()) ? !this.issuerCardSpecs.isSupported() ? com.payair.logic.cardvalidation.CardValidationResult.PAN_WRONG_ISSUER : com.payair.logic.cardvalidation.CardValidationResult.PAN_CORRECT : com.payair.logic.cardvalidation.CardValidationResult.PAN_WRONG_LUHN;
        }
    }

    public final com.payair.logic.cardvalidation.CardDataValidationReport validate(com.payair.model.CardData card) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(card, "");
        com.payair.logic.cardvalidation.CardDataValidator.CardValidationContext cardValidationContext = new com.payair.logic.cardvalidation.CardDataValidator.CardValidationContext(com.payair.logic.cardvalidation.IssuerCardSpecs.INSTANCE.getIssuer(card.getPan()));
        return new com.payair.logic.cardvalidation.CardDataValidationReport(cardValidationContext.getIssuerCardSpecs(), cardValidationContext.validatePan(card.getPan()), cardValidationContext.validateExpDate(card.getExpMonth(), card.getExpYear()), cardValidationContext.validateCvv(card.getCvv()), cardValidationContext.validateChName(card.getChName()));
    }

    public static final boolean access$isPastDate(com.payair.logic.cardvalidation.CardDataValidator cardDataValidator, int i, int i2) {
        java.lang.String format = new java.text.SimpleDateFormat("yy").format(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        if (i2 < java.lang.Integer.parseInt(format)) {
            return true;
        }
        java.lang.String format2 = new java.text.SimpleDateFormat("yy").format(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "");
        if (i2 != java.lang.Integer.parseInt(format2)) {
            return false;
        }
        java.lang.String format3 = new java.text.SimpleDateFormat("MM").format(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format3, "");
        return i < java.lang.Integer.parseInt(format3);
    }

    public static final boolean access$luhnCheck(com.payair.logic.cardvalidation.CardDataValidator cardDataValidator, java.lang.String str) {
        int i = 0;
        boolean z = false;
        for (int length = str.length() - 1; length >= 0; length--) {
            java.lang.String substring = str.substring(length, length + 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            int parseInt = java.lang.Integer.parseInt(substring);
            if (z && (parseInt = parseInt * 2) > 9) {
                parseInt = (parseInt % 10) + 1;
            }
            i += parseInt;
            z = !z;
        }
        return i % 10 == 0;
    }
}
