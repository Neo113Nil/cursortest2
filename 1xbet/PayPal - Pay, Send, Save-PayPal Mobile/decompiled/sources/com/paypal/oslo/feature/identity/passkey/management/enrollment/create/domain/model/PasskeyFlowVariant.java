package com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyFlowVariant;", "", "<init>", "(Ljava/lang/String;I)V", "NATIVE_LOGIN", "APP_SETTINGS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyFlowVariant {
    public static final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant APP_SETTINGS;
    public static final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant NATIVE_LOGIN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant[] getHighSpeedVideoFpsRangesFor;

    private PasskeyFlowVariant(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant passkeyFlowVariant = new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant("NATIVE_LOGIN", 0);
        NATIVE_LOGIN = passkeyFlowVariant;
        com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant passkeyFlowVariant2 = new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant("APP_SETTINGS", 1);
        APP_SETTINGS = passkeyFlowVariant2;
        com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant[] passkeyFlowVariantArr = {passkeyFlowVariant, passkeyFlowVariant2};
        getHighSpeedVideoFpsRangesFor = passkeyFlowVariantArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(passkeyFlowVariantArr);
    }

    public static com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant[] values() {
        return (com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
