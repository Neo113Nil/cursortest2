package com.payair.logic.cardvalidation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#"}, d2 = {"Lcom/payair/logic/cardvalidation/CardValidationResult;", "", "Lcom/payair/logic/cardvalidation/ValidationResultType;", "a", "Lcom/payair/logic/cardvalidation/ValidationResultType;", "getType", "()Lcom/payair/logic/cardvalidation/ValidationResultType;", "type", "Lcom/payair/logic/cardvalidation/ValidationResultField;", util.h.xy.cb.b.f1091, "Lcom/payair/logic/cardvalidation/ValidationResultField;", "getField", "()Lcom/payair/logic/cardvalidation/ValidationResultField;", "field", "PAN_CORRECT", "PAN_WRONG_LENGTH", "PAN_NOT_NUMERIC", "PAN_WRONG_ISSUER", "PAN_WRONG_CARD_TYPE", "PAN_WRONG_LUHN", "EXP_DATE_CORRECT", "EXP_DATE_WRONG_FORMAT", "EXP_DATE_WRONG_LENGTH", "EXP_DATE_EXPIRED", "EXP_DATE_WRONG_MONTH", "CVV_CORRECT", "CVV_EMPTY", "CVV_NULL", "CVV_NOT_NUMERIC", "CVV_WRONG_LENGTH", "CVV_WRONG_LENGTH_FOR_ISSUER", "CH_NAME_CORRECT", "CH_NAME_EMPTY", "CH_NAME_NULL", "CH_NAME_NONSTANDARD_LENGTH", "CH_NAME_NOT_ASCII"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CardValidationResult {
    public static final com.payair.logic.cardvalidation.CardValidationResult CH_NAME_CORRECT;
    public static final com.payair.logic.cardvalidation.CardValidationResult CH_NAME_EMPTY;
    public static final com.payair.logic.cardvalidation.CardValidationResult CH_NAME_NONSTANDARD_LENGTH;
    public static final com.payair.logic.cardvalidation.CardValidationResult CH_NAME_NOT_ASCII;
    public static final com.payair.logic.cardvalidation.CardValidationResult CH_NAME_NULL;
    public static final com.payair.logic.cardvalidation.CardValidationResult CVV_CORRECT;
    public static final com.payair.logic.cardvalidation.CardValidationResult CVV_EMPTY;
    public static final com.payair.logic.cardvalidation.CardValidationResult CVV_NOT_NUMERIC;
    public static final com.payair.logic.cardvalidation.CardValidationResult CVV_NULL;
    public static final com.payair.logic.cardvalidation.CardValidationResult CVV_WRONG_LENGTH;
    public static final com.payair.logic.cardvalidation.CardValidationResult CVV_WRONG_LENGTH_FOR_ISSUER;
    public static final com.payair.logic.cardvalidation.CardValidationResult EXP_DATE_CORRECT;
    public static final com.payair.logic.cardvalidation.CardValidationResult EXP_DATE_EXPIRED;
    public static final com.payair.logic.cardvalidation.CardValidationResult EXP_DATE_WRONG_FORMAT;
    public static final com.payair.logic.cardvalidation.CardValidationResult EXP_DATE_WRONG_LENGTH;
    public static final com.payair.logic.cardvalidation.CardValidationResult EXP_DATE_WRONG_MONTH;
    public static final com.payair.logic.cardvalidation.CardValidationResult PAN_CORRECT;
    public static final com.payair.logic.cardvalidation.CardValidationResult PAN_NOT_NUMERIC;
    public static final com.payair.logic.cardvalidation.CardValidationResult PAN_WRONG_CARD_TYPE;
    public static final com.payair.logic.cardvalidation.CardValidationResult PAN_WRONG_ISSUER;
    public static final com.payair.logic.cardvalidation.CardValidationResult PAN_WRONG_LENGTH;
    public static final com.payair.logic.cardvalidation.CardValidationResult PAN_WRONG_LUHN;
    public static final /* synthetic */ com.payair.logic.cardvalidation.CardValidationResult[] c;
    public static final /* synthetic */ kotlin.enums.EnumEntries d;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final com.payair.logic.cardvalidation.ValidationResultType type;

    /* renamed from: b, reason: from kotlin metadata */
    public final com.payair.logic.cardvalidation.ValidationResultField field;

    static {
        com.payair.logic.cardvalidation.ValidationResultType validationResultType = com.payair.logic.cardvalidation.ValidationResultType.CORRECT;
        com.payair.logic.cardvalidation.ValidationResultField validationResultField = com.payair.logic.cardvalidation.ValidationResultField.PAN;
        com.payair.logic.cardvalidation.CardValidationResult cardValidationResult = new com.payair.logic.cardvalidation.CardValidationResult("PAN_CORRECT", 0, validationResultType, validationResultField);
        PAN_CORRECT = cardValidationResult;
        com.payair.logic.cardvalidation.ValidationResultType validationResultType2 = com.payair.logic.cardvalidation.ValidationResultType.ERROR;
        com.payair.logic.cardvalidation.CardValidationResult cardValidationResult2 = new com.payair.logic.cardvalidation.CardValidationResult("PAN_WRONG_LENGTH", 1, validationResultType2, validationResultField);
        PAN_WRONG_LENGTH = cardValidationResult2;
        com.payair.logic.cardvalidation.CardValidationResult cardValidationResult3 = new com.payair.logic.cardvalidation.CardValidationResult("PAN_NOT_NUMERIC", 2, validationResultType2, validationResultField);
        PAN_NOT_NUMERIC = cardValidationResult3;
        com.payair.logic.cardvalidation.ValidationResultType validationResultType3 = com.payair.logic.cardvalidation.ValidationResultType.WARNING;
        com.payair.logic.cardvalidation.CardValidationResult cardValidationResult4 = new com.payair.logic.cardvalidation.CardValidationResult("PAN_WRONG_ISSUER", 3, validationResultType3, validationResultField);
        PAN_WRONG_ISSUER = cardValidationResult4;
        com.payair.logic.cardvalidation.CardValidationResult cardValidationResult5 = new com.payair.logic.cardvalidation.CardValidationResult("PAN_WRONG_CARD_TYPE", 4, validationResultType3, validationResultField);
        PAN_WRONG_CARD_TYPE = cardValidationResult5;
        com.payair.logic.cardvalidation.CardValidationResult cardValidationResult6 = new com.payair.logic.cardvalidation.CardValidationResult("PAN_WRONG_LUHN", 5, validationResultType2, validationResultField);
        PAN_WRONG_LUHN = cardValidationResult6;
        com.payair.logic.cardvalidation.ValidationResultField validationResultField2 = com.payair.logic.cardvalidation.ValidationResultField.EXP_DATE;
        com.payair.logic.cardvalidation.CardValidationResult cardValidationResult7 = new com.payair.logic.cardvalidation.CardValidationResult("EXP_DATE_CORRECT", 6, validationResultType, validationResultField2);
        EXP_DATE_CORRECT = cardValidationResult7;
        com.payair.logic.cardvalidation.CardValidationResult cardValidationResult8 = new com.payair.logic.cardvalidation.CardValidationResult("EXP_DATE_WRONG_FORMAT", 7, validationResultType2, validationResultField2);
        EXP_DATE_WRONG_FORMAT = cardValidationResult8;
        com.payair.logic.cardvalidation.CardValidationResult cardValidationResult9 = new com.payair.logic.cardvalidation.CardValidationResult("EXP_DATE_WRONG_LENGTH", 8, validationResultType2, validationResultField2);
        EXP_DATE_WRONG_LENGTH = cardValidationResult9;
        com.payair.logic.cardvalidation.CardValidationResult cardValidationResult10 = new com.payair.logic.cardvalidation.CardValidationResult("EXP_DATE_EXPIRED", 9, validationResultType3, validationResultField2);
        EXP_DATE_EXPIRED = cardValidationResult10;
        com.payair.logic.cardvalidation.CardValidationResult cardValidationResult11 = new com.payair.logic.cardvalidation.CardValidationResult("EXP_DATE_WRONG_MONTH", 10, validationResultType2, validationResultField2);
        EXP_DATE_WRONG_MONTH = cardValidationResult11;
        com.payair.logic.cardvalidation.ValidationResultField validationResultField3 = com.payair.logic.cardvalidation.ValidationResultField.CVV;
        com.payair.logic.cardvalidation.CardValidationResult cardValidationResult12 = new com.payair.logic.cardvalidation.CardValidationResult("CVV_CORRECT", 11, validationResultType, validationResultField3);
        CVV_CORRECT = cardValidationResult12;
        com.payair.logic.cardvalidation.CardValidationResult cardValidationResult13 = new com.payair.logic.cardvalidation.CardValidationResult("CVV_EMPTY", 12, validationResultType3, validationResultField3);
        CVV_EMPTY = cardValidationResult13;
        com.payair.logic.cardvalidation.CardValidationResult cardValidationResult14 = new com.payair.logic.cardvalidation.CardValidationResult("CVV_NULL", 13, validationResultType3, validationResultField3);
        CVV_NULL = cardValidationResult14;
        com.payair.logic.cardvalidation.CardValidationResult cardValidationResult15 = new com.payair.logic.cardvalidation.CardValidationResult("CVV_NOT_NUMERIC", 14, validationResultType2, validationResultField3);
        CVV_NOT_NUMERIC = cardValidationResult15;
        com.payair.logic.cardvalidation.CardValidationResult cardValidationResult16 = new com.payair.logic.cardvalidation.CardValidationResult("CVV_WRONG_LENGTH", 15, validationResultType2, validationResultField3);
        CVV_WRONG_LENGTH = cardValidationResult16;
        com.payair.logic.cardvalidation.CardValidationResult cardValidationResult17 = new com.payair.logic.cardvalidation.CardValidationResult("CVV_WRONG_LENGTH_FOR_ISSUER", 16, validationResultType3, validationResultField3);
        CVV_WRONG_LENGTH_FOR_ISSUER = cardValidationResult17;
        com.payair.logic.cardvalidation.ValidationResultField validationResultField4 = com.payair.logic.cardvalidation.ValidationResultField.CH_NAME;
        com.payair.logic.cardvalidation.CardValidationResult cardValidationResult18 = new com.payair.logic.cardvalidation.CardValidationResult("CH_NAME_CORRECT", 17, validationResultType, validationResultField4);
        CH_NAME_CORRECT = cardValidationResult18;
        com.payair.logic.cardvalidation.CardValidationResult cardValidationResult19 = new com.payair.logic.cardvalidation.CardValidationResult("CH_NAME_EMPTY", 18, validationResultType3, validationResultField4);
        CH_NAME_EMPTY = cardValidationResult19;
        com.payair.logic.cardvalidation.CardValidationResult cardValidationResult20 = new com.payair.logic.cardvalidation.CardValidationResult("CH_NAME_NULL", 19, validationResultType3, validationResultField4);
        CH_NAME_NULL = cardValidationResult20;
        com.payair.logic.cardvalidation.CardValidationResult cardValidationResult21 = new com.payair.logic.cardvalidation.CardValidationResult("CH_NAME_NONSTANDARD_LENGTH", 20, validationResultType3, validationResultField4);
        CH_NAME_NONSTANDARD_LENGTH = cardValidationResult21;
        com.payair.logic.cardvalidation.CardValidationResult cardValidationResult22 = new com.payair.logic.cardvalidation.CardValidationResult("CH_NAME_NOT_ASCII", 21, validationResultType3, validationResultField4);
        CH_NAME_NOT_ASCII = cardValidationResult22;
        com.payair.logic.cardvalidation.CardValidationResult[] cardValidationResultArr = {cardValidationResult, cardValidationResult2, cardValidationResult3, cardValidationResult4, cardValidationResult5, cardValidationResult6, cardValidationResult7, cardValidationResult8, cardValidationResult9, cardValidationResult10, cardValidationResult11, cardValidationResult12, cardValidationResult13, cardValidationResult14, cardValidationResult15, cardValidationResult16, cardValidationResult17, cardValidationResult18, cardValidationResult19, cardValidationResult20, cardValidationResult21, cardValidationResult22};
        c = cardValidationResultArr;
        d = kotlin.enums.EnumEntriesKt.enumEntries(cardValidationResultArr);
    }

    public CardValidationResult(java.lang.String str, int i, com.payair.logic.cardvalidation.ValidationResultType validationResultType, com.payair.logic.cardvalidation.ValidationResultField validationResultField) {
        this.type = validationResultType;
        this.field = validationResultField;
    }

    public final com.payair.logic.cardvalidation.ValidationResultField getField() {
        return this.field;
    }

    public final com.payair.logic.cardvalidation.ValidationResultType getType() {
        return this.type;
    }

    public static com.payair.logic.cardvalidation.CardValidationResult[] values() {
        return (com.payair.logic.cardvalidation.CardValidationResult[]) c.clone();
    }

    public static com.payair.logic.cardvalidation.CardValidationResult valueOf(java.lang.String str) {
        return (com.payair.logic.cardvalidation.CardValidationResult) java.lang.Enum.valueOf(com.payair.logic.cardvalidation.CardValidationResult.class, str);
    }

    public static kotlin.enums.EnumEntries<com.payair.logic.cardvalidation.CardValidationResult> getEntries() {
        return d;
    }
}
