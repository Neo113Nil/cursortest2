package com.applovin.impl;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes5.dex */
public enum z7 {
    UNSPECIFIED(-1),
    RESOURCE_REJECTED(1),
    API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED(2),
    FAILED_TO_LOAD_RESOURCE(3),
    XML_PARSING(100),
    GENERAL_WRAPPER_ERROR(300),
    TIMED_OUT(Sdk.SDKError.Reason.MRAID_ERROR_VALUE),
    WRAPPER_LIMIT_REACHED(Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE),
    NO_WRAPPER_RESPONSE(303),
    GENERAL_LINEAR_ERROR(400),
    NO_MEDIA_FILE_PROVIDED(401),
    MEDIA_FILE_TIMEOUT(TTAdConstant.AD_ID_IS_NULL_CODE),
    MEDIA_FILE_ERROR(405),
    GENERAL_COMPANION_AD_ERROR(600),
    UNABLE_TO_FETCH_COMPANION_AD_RESOURCE(IronSourceError.ERROR_BN_LOAD_WHILE_LONG_INITIATION),
    CAN_NOT_FIND_COMPANION_AD_RESOURCE(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED);


    /* renamed from: a, reason: collision with root package name */
    private final int f4576a;

    z7(int i) {
        this.f4576a = i;
    }

    public int b() {
        return this.f4576a;
    }
}
