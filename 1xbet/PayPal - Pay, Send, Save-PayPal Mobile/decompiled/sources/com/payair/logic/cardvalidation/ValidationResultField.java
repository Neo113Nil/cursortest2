package com.payair.logic.cardvalidation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/payair/logic/cardvalidation/ValidationResultField;", "", "PAN", "EXP_DATE", "CVV", "CH_NAME"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ValidationResultField {
    public static final com.payair.logic.cardvalidation.ValidationResultField CH_NAME;
    public static final com.payair.logic.cardvalidation.ValidationResultField CVV;
    public static final com.payair.logic.cardvalidation.ValidationResultField EXP_DATE;
    public static final com.payair.logic.cardvalidation.ValidationResultField PAN;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ com.payair.logic.cardvalidation.ValidationResultField[] f4399a;
    public static final /* synthetic */ kotlin.enums.EnumEntries b;

    static {
        com.payair.logic.cardvalidation.ValidationResultField validationResultField = new com.payair.logic.cardvalidation.ValidationResultField("PAN", 0);
        PAN = validationResultField;
        com.payair.logic.cardvalidation.ValidationResultField validationResultField2 = new com.payair.logic.cardvalidation.ValidationResultField("EXP_DATE", 1);
        EXP_DATE = validationResultField2;
        com.payair.logic.cardvalidation.ValidationResultField validationResultField3 = new com.payair.logic.cardvalidation.ValidationResultField("CVV", 2);
        CVV = validationResultField3;
        com.payair.logic.cardvalidation.ValidationResultField validationResultField4 = new com.payair.logic.cardvalidation.ValidationResultField("CH_NAME", 3);
        CH_NAME = validationResultField4;
        com.payair.logic.cardvalidation.ValidationResultField[] validationResultFieldArr = {validationResultField, validationResultField2, validationResultField3, validationResultField4};
        f4399a = validationResultFieldArr;
        b = kotlin.enums.EnumEntriesKt.enumEntries(validationResultFieldArr);
    }

    public ValidationResultField(java.lang.String str, int i) {
    }

    public static com.payair.logic.cardvalidation.ValidationResultField[] values() {
        return (com.payair.logic.cardvalidation.ValidationResultField[]) f4399a.clone();
    }

    public static com.payair.logic.cardvalidation.ValidationResultField valueOf(java.lang.String str) {
        return (com.payair.logic.cardvalidation.ValidationResultField) java.lang.Enum.valueOf(com.payair.logic.cardvalidation.ValidationResultField.class, str);
    }

    public static kotlin.enums.EnumEntries<com.payair.logic.cardvalidation.ValidationResultField> getEntries() {
        return b;
    }
}
