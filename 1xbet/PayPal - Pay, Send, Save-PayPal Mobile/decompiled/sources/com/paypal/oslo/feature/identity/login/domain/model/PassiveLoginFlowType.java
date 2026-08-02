package com.paypal.oslo.feature.identity.login.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007j\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/PassiveLoginFlowType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "type", "Ljava/lang/String;", "getType", "SIGN_UP_COMPLETION_FLOW", "PASSWORD_RECOVERY_COMPLETION_FLOW"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PassiveLoginFlowType {
    public static final com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType PASSWORD_RECOVERY_COMPLETION_FLOW;
    public static final com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType SIGN_UP_COMPLETION_FLOW;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private final java.lang.String type;

    private PassiveLoginFlowType(java.lang.String str, int i, java.lang.String str2) {
        this.type = str2;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    static {
        com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType passiveLoginFlowType = new com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType("SIGN_UP_COMPLETION_FLOW", 0, "SIGN_UP_COMPLETION");
        SIGN_UP_COMPLETION_FLOW = passiveLoginFlowType;
        com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType passiveLoginFlowType2 = new com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType("PASSWORD_RECOVERY_COMPLETION_FLOW", 1, "PASSWORD_RECOVERY_COMPLETION");
        PASSWORD_RECOVERY_COMPLETION_FLOW = passiveLoginFlowType2;
        com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType[] passiveLoginFlowTypeArr = {passiveLoginFlowType, passiveLoginFlowType2};
        getHighResolutionOutputSizeshNQ4ISI = passiveLoginFlowTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(passiveLoginFlowTypeArr);
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.type;
    }

    public static com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType[] values() {
        return (com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
