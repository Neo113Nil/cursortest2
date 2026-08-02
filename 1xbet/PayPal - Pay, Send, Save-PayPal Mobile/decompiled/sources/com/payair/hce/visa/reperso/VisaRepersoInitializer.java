package com.payair.hce.visa.reperso;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/payair/hce/visa/reperso/VisaRepersoInitializer;", "", "<init>", "()V", "Lcom/payair/hce/visa/reperso/VisaReperso;", "create", "()Lcom/payair/hce/visa/reperso/VisaReperso;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class VisaRepersoInitializer {
    public static final com.payair.hce.visa.reperso.VisaRepersoInitializer INSTANCE = new com.payair.hce.visa.reperso.VisaRepersoInitializer();
    private static int DigitizedCardProfile = 0;
    private static int writeReplace = (DigitizedCardProfile + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;

    private VisaRepersoInitializer() {
    }

    @kotlin.jvm.JvmStatic
    public static final com.payair.hce.visa.reperso.VisaReperso create() {
        com.payair.hce.setFriction setfriction = new com.payair.hce.setFriction();
        int i = writeReplace + 45;
        DigitizedCardProfile = i % 128;
        if (i % 2 == 0) {
            return setfriction;
        }
        throw null;
    }
}
