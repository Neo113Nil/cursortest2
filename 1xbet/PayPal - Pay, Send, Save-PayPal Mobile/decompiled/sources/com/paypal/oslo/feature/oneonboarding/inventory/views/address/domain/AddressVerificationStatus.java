package com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressVerificationStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "status", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "VERIFIED", "CORRECTED", "INVALID", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressVerificationStatus {
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus CORRECTED;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus INVALID;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus UNKNOWN__;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus VERIFIED;
    private static final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final java.lang.String status;

    private AddressVerificationStatus(java.lang.String str, int i, java.lang.String str2) {
        this.status = str2;
    }

    public final java.lang.String getStatus() {
        return this.status;
    }

    static {
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus addressVerificationStatus = new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus("VERIFIED", 0, "VERIFIED");
        VERIFIED = addressVerificationStatus;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus addressVerificationStatus2 = new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus("CORRECTED", 1, "CORRECTED");
        CORRECTED = addressVerificationStatus2;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus addressVerificationStatus3 = new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus("INVALID", 2, "INVALID");
        INVALID = addressVerificationStatus3;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus addressVerificationStatus4 = new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus("UNKNOWN__", 3, "UNKNOWN__");
        UNKNOWN__ = addressVerificationStatus4;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus[] addressVerificationStatusArr = {addressVerificationStatus, addressVerificationStatus2, addressVerificationStatus3, addressVerificationStatus4};
        getHighResolutionOutputSizeshNQ4ISI = addressVerificationStatusArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(addressVerificationStatusArr);
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus[] values() {
        return (com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVerificationStatus> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
