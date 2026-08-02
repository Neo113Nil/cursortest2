package com.payair.hce.visa.tokenization;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/payair/hce/visa/tokenization/VisaTokenizationInitializer;", "", "<init>", "()V", "Lcom/payair/hce/visa/tokenization/VisaTokenization;", "create", "()Lcom/payair/hce/visa/tokenization/VisaTokenization;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VisaTokenizationInitializer {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int DigitizedCardProfile;
    public static final com.payair.hce.visa.tokenization.VisaTokenizationInitializer INSTANCE = new com.payair.hce.visa.tokenization.VisaTokenizationInitializer();

    private VisaTokenizationInitializer() {
    }

    @kotlin.jvm.JvmStatic
    public static final com.payair.hce.visa.tokenization.VisaTokenization create() {
        return new com.payair.hce.setTranscriptMode();
    }

    static {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (i | 7) << 1;
        int i3 = -((i & (-8)) | ((~i) & 7));
        DigitizedCardProfile = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
    }
}
