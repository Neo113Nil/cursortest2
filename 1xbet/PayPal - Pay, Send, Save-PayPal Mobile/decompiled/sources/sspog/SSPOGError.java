package sspog;

/* loaded from: classes18.dex */
public enum SSPOGError {
    RST_OK(0),
    RST_NOT_INIT(-1),
    RST_NO_PERMISSION(-2),
    RST_GENERAL_ERROR(1),
    RST_GENERAL_BUSINESS_ERROR(2),
    RST_INVALID_ARGUMENT(3),
    RST_INVALID_STATE(4),
    RST_BUFFER_UNDERFLOW(5),
    RST_BUFFER_OVERFLOW(6),
    RST_NULL_POINTER(7),
    RST_NOT_PERMIT(8),
    RST_OUT_OF_MEMORY(9),
    RST_TODO(10),
    RST_GOOGLE_PLAY_SERVICE_ERROR(11),
    RST_SAFETYNET_ERROR(12),
    RST_LIB_INVALID_KEY(256),
    RST_POG_NO_ENTRY(257),
    RST_POG_NETWORK_ERROR(258),
    RST_POG_INVALID_RESPONSE(259),
    RST_POG_NO_KEY(513),
    RST_POG_KEY_INVALID(my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_KEY_INVALID),
    RST_POG_DUKPT_KEY_INVALID(my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_DUKPT_KEY_INVALID),
    RST_POG_CRYPTO_ERROR(my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR),
    RST_POG_INVALID_CERTIFICATE(my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CERTIFICATE),
    RST_POG_CERTIFICATE_NOT_FOUND(my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CERTIFICATE_NOT_FOUND),
    RST_POG_INVALID_CA_CERTIFICATE(my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE),
    RST_POG_ATTEST_COTS_FAIL(my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL),
    RST_POG_ATTEST_SCRP_FAIL(my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL),
    RST_POG_ACTIVATION_SCRP_FAIL(my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL),
    RST_POG_PROVISION_FAIL(523),
    RST_POG_KEY_EXCHANGE_FAIL(524),
    RST_POG_DIFF_USER_ID(my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_DIFF_USER_ID),
    RST_POG_DIFF_SCRP_ID(my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_DIFF_SCRP_ID),
    RST_POG_COTS_TIME_NOT_SYNC(520001),
    RST_POG_OUTDATED_SECURITY_PATCH(520002),
    RST_POG_UNKNOWN_INSTALLATION_SOURCE(520003),
    RST_POG_PLAY_INTEGRITY_FAIL(520004),
    RST_POG_IS_DEVELOPER_OPTION_ENABLED(520101),
    RST_POG_IS_ADB_ENABLED(520102),
    RST_POG_IS_ROOTED_ERROR(520103),
    RST_POG_IS_DEBUGGING_ERROR(520104),
    RST_POG_IS_EMULATOR_ERROR(520105),
    RST_POG_IS_HOOKED_ERROR(520106);

    private int code;

    SSPOGError(int i) {
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }
}
