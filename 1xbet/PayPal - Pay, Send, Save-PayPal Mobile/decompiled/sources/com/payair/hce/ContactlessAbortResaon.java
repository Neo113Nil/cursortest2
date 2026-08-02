package com.payair.hce;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ContactlessAbortResaon {
    private static int DigitizedCardProfile = 0;
    private static int valueOf = 1;
    public static final com.payair.hce.ContactlessAbortResaon WALLET_CANCEL_REQUEST = new com.payair.hce.ContactlessAbortResaon("WALLET_CANCEL_REQUEST", 0);
    public static final com.payair.hce.ContactlessAbortResaon CARD_ERROR = new com.payair.hce.ContactlessAbortResaon("CARD_ERROR", 1);
    public static final com.payair.hce.ContactlessAbortResaon TERMINAL_ERROR = new com.payair.hce.ContactlessAbortResaon("TERMINAL_ERROR", 2);
    private static final /* synthetic */ com.payair.hce.ContactlessAbortResaon[] $VALUES = $values();

    private static /* synthetic */ com.payair.hce.ContactlessAbortResaon[] $values() {
        com.payair.hce.ContactlessAbortResaon[] contactlessAbortResaonArr;
        int i = DigitizedCardProfile;
        int i2 = ((i | 57) << 1) - ((i & (-58)) | ((~i) & 57));
        int i3 = i2 % 128;
        valueOf = i3;
        if (i2 % 2 == 0) {
            contactlessAbortResaonArr = new com.payair.hce.ContactlessAbortResaon[4];
            contactlessAbortResaonArr[1] = WALLET_CANCEL_REQUEST;
            contactlessAbortResaonArr[0] = CARD_ERROR;
            contactlessAbortResaonArr[4] = TERMINAL_ERROR;
        } else {
            contactlessAbortResaonArr = new com.payair.hce.ContactlessAbortResaon[]{WALLET_CANCEL_REQUEST, CARD_ERROR, TERMINAL_ERROR};
        }
        int i4 = i3 & 9;
        int i5 = (i3 ^ 9) | i4;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        DigitizedCardProfile = i6 % 128;
        if (i6 % 2 == 0) {
            return contactlessAbortResaonArr;
        }
        throw null;
    }

    public static com.payair.hce.ContactlessAbortResaon valueOf(java.lang.String str) {
        int i = valueOf;
        int i2 = (i ^ 99) + ((i & 99) << 1);
        DigitizedCardProfile = i2 % 128;
        com.payair.hce.ContactlessAbortResaon contactlessAbortResaon = (com.payair.hce.ContactlessAbortResaon) java.lang.Enum.valueOf(com.payair.hce.ContactlessAbortResaon.class, str);
        if (i2 % 2 == 0) {
            return contactlessAbortResaon;
        }
        throw null;
    }

    public static com.payair.hce.ContactlessAbortResaon[] values() {
        int i = DigitizedCardProfile;
        int i2 = ((i & (-92)) | ((~i) & 91)) + ((i & 91) << 1);
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        com.payair.hce.ContactlessAbortResaon[] contactlessAbortResaonArr = (com.payair.hce.ContactlessAbortResaon[]) $VALUES.clone();
        if (i3 != 0) {
            return contactlessAbortResaonArr;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        int i = valueOf;
        DigitizedCardProfile = (((i | 69) << 1) - (i ^ 69)) % 128;
    }

    private ContactlessAbortResaon(java.lang.String str, int i) {
    }
}
