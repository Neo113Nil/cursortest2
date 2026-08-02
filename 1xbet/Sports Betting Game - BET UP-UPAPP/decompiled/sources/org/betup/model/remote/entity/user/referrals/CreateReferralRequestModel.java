package org.betup.model.remote.entity.user.referrals;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class CreateReferralRequestModel {

    @SerializedName("device_identifier")
    private String deviceIdentifier;

    @SerializedName("referral_code")
    private String referralCode;

    public CreateReferralRequestModel(String referralCode, String deviceIdentifier) {
        this.referralCode = referralCode;
        this.deviceIdentifier = deviceIdentifier;
    }

    public String getReferralCode() {
        return this.referralCode;
    }

    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }

    public String getDeviceIdentifier() {
        return this.deviceIdentifier;
    }

    public void setDeviceIdentifier(String deviceIdentifier) {
        this.deviceIdentifier = deviceIdentifier;
    }
}
