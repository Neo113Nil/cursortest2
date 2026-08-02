package com.payair.logic.cardvalidation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004"}, d2 = {"Lcom/payair/logic/cardvalidation/ValidationResultType;", "", "CORRECT", "WARNING", "ERROR"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ValidationResultType {
    public static final com.payair.logic.cardvalidation.ValidationResultType CORRECT;
    public static final com.payair.logic.cardvalidation.ValidationResultType ERROR;
    public static final com.payair.logic.cardvalidation.ValidationResultType WARNING;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ com.payair.logic.cardvalidation.ValidationResultType[] f4400a;
    public static final /* synthetic */ kotlin.enums.EnumEntries b;

    static {
        com.payair.logic.cardvalidation.ValidationResultType validationResultType = new com.payair.logic.cardvalidation.ValidationResultType("CORRECT", 0);
        CORRECT = validationResultType;
        com.payair.logic.cardvalidation.ValidationResultType validationResultType2 = new com.payair.logic.cardvalidation.ValidationResultType("WARNING", 1);
        WARNING = validationResultType2;
        com.payair.logic.cardvalidation.ValidationResultType validationResultType3 = new com.payair.logic.cardvalidation.ValidationResultType("ERROR", 2);
        ERROR = validationResultType3;
        com.payair.logic.cardvalidation.ValidationResultType[] validationResultTypeArr = {validationResultType, validationResultType2, validationResultType3};
        f4400a = validationResultTypeArr;
        b = kotlin.enums.EnumEntriesKt.enumEntries(validationResultTypeArr);
    }

    public ValidationResultType(java.lang.String str, int i) {
    }

    public static com.payair.logic.cardvalidation.ValidationResultType[] values() {
        return (com.payair.logic.cardvalidation.ValidationResultType[]) f4400a.clone();
    }

    public static com.payair.logic.cardvalidation.ValidationResultType valueOf(java.lang.String str) {
        return (com.payair.logic.cardvalidation.ValidationResultType) java.lang.Enum.valueOf(com.payair.logic.cardvalidation.ValidationResultType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.payair.logic.cardvalidation.ValidationResultType> getEntries() {
        return b;
    }
}
