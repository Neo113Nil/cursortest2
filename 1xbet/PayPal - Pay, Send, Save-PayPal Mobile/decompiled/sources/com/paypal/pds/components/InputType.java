package com.paypal.pds.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/pds/components/InputType;", "", "Landroidx/compose/ui/text/input/KeyboardType;", "p0", "<init>", "(Ljava/lang/String;II)V", "keyBoardType", com.visa.cbp.getEncExpo.warmup, "getKeyBoardType-PjHm6EE", "()I", "Number", "SecureText"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class InputType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.pds.components.InputType Number;
    public static final com.paypal.pds.components.InputType SecureText;
    private static final /* synthetic */ com.paypal.pds.components.InputType[] getHighResolutionOutputSizeshNQ4ISI;
    private final int keyBoardType;

    private InputType(java.lang.String str, int i, int i2) {
        this.keyBoardType = i2;
    }

    /* renamed from: getKeyBoardType-PjHm6EE, reason: not valid java name and from getter */
    public final int getKeyBoardType() {
        return this.keyBoardType;
    }

    static {
        com.paypal.pds.components.InputType inputType = new com.paypal.pds.components.InputType("Number", 0, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8268getNumberPjHm6EE());
        Number = inputType;
        com.paypal.pds.components.InputType inputType2 = new com.paypal.pds.components.InputType("SecureText", 1, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8269getNumberPasswordPjHm6EE());
        SecureText = inputType2;
        com.paypal.pds.components.InputType[] inputTypeArr = {inputType, inputType2};
        getHighResolutionOutputSizeshNQ4ISI = inputTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(inputTypeArr);
    }

    public static com.paypal.pds.components.InputType[] values() {
        return (com.paypal.pds.components.InputType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.pds.components.InputType valueOf(java.lang.String str) {
        return (com.paypal.pds.components.InputType) java.lang.Enum.valueOf(com.paypal.pds.components.InputType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.pds.components.InputType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
