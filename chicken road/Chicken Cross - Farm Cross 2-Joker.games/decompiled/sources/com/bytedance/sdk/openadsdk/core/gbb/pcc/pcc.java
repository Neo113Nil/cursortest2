package com.bytedance.sdk.openadsdk.core.gbb.pcc;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes4.dex */
public enum pcc {
    XML_PARSING_ERROR(100),
    SCHEMA_VALIDATION_ERROR(101),
    WRAPPER_TIMEOUT(Sdk.SDKError.Reason.MRAID_ERROR_VALUE),
    NO_ADS_VAST_RESPONSE(303),
    GENERAL_LINEAR_AD_ERROR(400),
    GENERAL_COMPANION_AD_ERROR(600),
    UNDEFINED_ERROR(DescriptorProtos.Edition.EDITION_LEGACY_VALUE);

    private final int kj;

    pcc(int i) {
        this.kj = i;
    }

    public String pcc() {
        return String.valueOf(this.kj);
    }
}
