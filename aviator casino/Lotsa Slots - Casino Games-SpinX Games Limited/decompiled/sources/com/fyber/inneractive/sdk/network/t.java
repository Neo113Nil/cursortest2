package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public enum t {
    VAST_ERROR_DVC_FAILURE(46),
    FMP_SDK_INIT_FAILED(62),
    VAST_COMPANION_FAILED_LOADING(70),
    VAST_COMPANION_INCOMPATIBLE_MIMETYPE(75),
    FMP_COMPANION_FAILED_LOADING(78),
    ERROR_STORE_PROMO_FAILURE(96),
    VAST_ERROR_INVALID_RESPONSE(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_ERROR_VALUE),
    VAST_ERROR_TOO_MANY_WRAPPERS(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE),
    VAST_ERROR_NO_MEDIA_FILES(303),
    VAST_ERROR_NO_COMPATIBLE_MEDIA_FILE(304),
    VAST_ERROR_PRE_BUFFER_TIMEOUT(306),
    VAST_ERROR_BUFFER_TIMEOUT(307),
    VAST_ERROR_FAILED_PLAYING_MEDIA_FILE(308),
    VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE),
    VAST_ERROR_UNSECURE_URL(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE),
    MRAID_ERROR_UNSECURE_CONTENT(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE),
    VPAID_ERROR_UNSECURE_CONTENT(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE),
    MRAID_VIDEO_HAS_NOT_STARTED_PLAYING_IN_A_TIMELY_FASHION(390),
    VAST_UNKNOWN_PLAYER_ERROR(399),
    NATIVE_ERROR_INVALID_NATIVE_RESPONSE(401),
    NATIVE_ERROR_FAILED_TO_LOAD_AD(402),
    NATIVE_ERROR_MISMATCH_REQUIRED_ASSET_RESPONSE(com.ironsource.InterfaceC3141l1.a.b.d),
    NATIVE_ERROR_INVALID_REQUIRED_ASSET_DATA(com.ironsource.InterfaceC3141l1.a.b.e),
    NATIVE_ERROR_INVALID_OPTIONAL_ASSET_DATA(com.ironsource.InterfaceC3141l1.a.b.f),
    NATIVE_ERROR_INVALID_LINK_WEB_URL(com.ironsource.InterfaceC3141l1.a.b.g),
    NATIVE_ERROR_FAILED_LOAD_ASSET(com.ironsource.InterfaceC3141l1.a.b.j),
    NATIVE_ERROR_MISMATCH_OPTIONAL_ASSET_RESPONSE(com.ironsource.InterfaceC3141l1.a.b.k),
    NATIVE_ERROR_MISSING_PROTOCOL_REQUIRED_FIELD(com.facebook.internal.FacebookRequestErrorClassification.EC_APP_NOT_INSTALLED),
    NATIVE_ERROR_RECEIVED_VIDEO_BUT_NOT_SUPPORTED(413),
    NATIVE_ERROR_NO_VALID_URLS_FOR_CLICK(414),
    NATIVE_ERROR_SOME_INVALID_URLS_FOR_PROCESSED_CLICK(415),
    MRAID_AUTO_ACTION_DETECTED(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE),
    FIRST_PARTY_EXTRA_DATA_ERROR(550),
    INTERNAL_CONFIG_MISMATCH(601),
    FATAL_ADM_PARSING_ERROR(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_LOAD_WHILE_LONG_INITIATION),
    FATAL_ADM_MARKUP_FETCHING_ERROR(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED),
    TOKEN_EXCEEDS_LIMIT(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_LOAD_EXCEPTION),
    IGNITE_FLOW_MODE_NOT_COMPATIBLE(606),
    IGNITE_FLOW_FAILED_TO_START(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT),
    IGNITE_FLOW_FAILED_TO_INSTALL_APP(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_INSTANCE_INIT_EXCEPTION),
    IGNITE_FLOW_FAILED_TO_LOAD_WEBPAGE(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE),
    FATAL_CONFIGURATION_ERROR(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NT_LOAD_AFTER_LONG_INITIATION),
    FATAL_FEATURES_CONFIG_ERROR(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NT_LOAD_PLACEMENT_CAPPED),
    IA_AD_LOAD_FAILED(801),
    IA_AD_EXPIRED(802),
    IA_AD_DESTROYED_WITHOUT_SHOW(803),
    IA_AD_FAILURE_DATA(850),
    CLICK_PARSING_FAILURE(991),
    MISSMATCH_SPOTID(992),
    FAILED_DNS(995),
    FETCH_TOKEN_DV_ERROR(1000),
    DV_ERROR_PHASE(1001),
    ODT_ENCRYPTION_EXCEPTION(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION.a()),
    ODT_RAW_ONE_DT_ERROR(com.digitalturbine.ignite.authenticator.events.d.RAW_ONE_DT_ERROR.a()),
    ODT_ONE_DT_PARSE_ERROR(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_PARSE_ERROR.a()),
    ODT_ONE_DT_AUTHENTICATION_ERROR(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_AUTHENTICATION_ERROR.a()),
    ODT_ONE_DT_BROADCAST_ERROR(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_BROADCAST_ERROR.a()),
    ODT_ONE_DT_REQUEST_ERROR(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_REQUEST_ERROR.a()),
    ODT_ONE_DT_GENERAL_ERROR(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_GENERAL_ERROR.a());

    private static final java.util.HashMap<java.lang.Integer, com.fyber.inneractive.sdk.network.t> sMap = new java.util.HashMap<>();
    int val;

    static {
        for (com.fyber.inneractive.sdk.network.t tVar : values()) {
            sMap.put(java.lang.Integer.valueOf(tVar.val), tVar);
        }
    }

    t(int i) {
        this.val = i;
    }

    public static com.fyber.inneractive.sdk.network.t a(com.digitalturbine.ignite.authenticator.events.d dVar) {
        return sMap.get(java.lang.Integer.valueOf(dVar.a()));
    }
}
