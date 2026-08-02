package util.h.xy.bv;

/* loaded from: classes18.dex */
public final class i {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI;
    private static final java.lang.String getHighSpeedVideoSizes = util.h.xy.ca.ra.class.getName();

    static {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25700(util.h.xy.bv.rb rbVar) {
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes;
        int m25749 = rbVar.m25749();
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes2 = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR;
        if (m25749 == 523) {
            provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.ENROLLMENT_REQUIRED;
        } else if (m25749 == 524) {
            provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.CARD_NOT_ENROLLED;
        } else if (m25749 == 597) {
            provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.ENROLLMENT_CREDENTIAL_EXPIRED;
        } else if (m25749 == 555) {
            provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.ENROLLMENT_TRY_LIMIT_EXCEEDED;
        } else if (m25749 == 554) {
            provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.ENROLLMENT_WRONG_ACTIVATION_CODE;
        } else if (m25749 == 561) {
            provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.CARD_STATE_DESYNCHRO;
        } else {
            if (m25749 != 581 && (m25749 < 671 || m25749 > 678)) {
                if (m25749 == 603) {
                    provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.SDK_NEED_TO_BE_UPGRADED;
                } else if (m25749 == 599) {
                    provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.DEVICE_STATE_NOT_OK;
                }
            }
            provisioningServiceErrorCodes = com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_SERVER_ERROR;
        }
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes provisioningServiceErrorCodes3 = provisioningServiceErrorCodes;
        return new com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError(provisioningServiceErrorCodes3, rbVar.m25751(), m25749, null, rbVar.m25742() == null ? provisioningServiceErrorCodes3.toString() : rbVar.m25742(), rbVar.m25750());
    }
}
