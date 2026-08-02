package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public final class CoroutineDebuggingKt extends com.google.gson.TypeAdapter implements o.getHighSpeedVideoSizesFor {
    private o.getInputSizeshNQ4ISI Camera2StreamConfigurationMap;
    private com.google.gson.Gson getHighResolutionOutputSizeshNQ4ISI;
    private o.Camera2StreamConfigurationMap getHighSpeedVideoFpsRangesFor;

    public CoroutineDebuggingKt(com.google.gson.Gson gson, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap, o.getInputSizeshNQ4ISI getinputsizeshnq4isi) {
        this.getHighResolutionOutputSizeshNQ4ISI = gson;
        this.getHighSpeedVideoFpsRangesFor = camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = getinputsizeshnq4isi;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(jsonWriter, obj == com.visa.cbp.sdk.facade.TokenRepersoStatus.NO_MIGRATION ? 75 : obj == com.visa.cbp.sdk.facade.TokenRepersoStatus.COMPLETED_REPERSO ? com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE : obj == com.visa.cbp.sdk.facade.TokenRepersoStatus.ERROR_IN_REPERSO ? com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE : obj == com.visa.cbp.sdk.facade.TokenRepersoStatus.CALL_REPERSO ? 308 : obj == com.visa.cbp.sdk.facade.TokenRepersoStatus.NOT_MIGRATED ? com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE : obj == com.visa.cbp.sdk.facade.TokenRepersoStatus.REPERSO_INITIATED ? 357 : obj == com.visa.cbp.sdk.facade.TokenRepersoStatus.PENDING_NOTIFICATION ? 433 : -1);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final java.lang.Object read2(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        int highSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(jsonReader);
        if (highSpeedVideoSizes == 22) {
            return com.visa.cbp.sdk.facade.TokenRepersoStatus.COMPLETED_REPERSO;
        }
        if (highSpeedVideoSizes == 114) {
            return com.visa.cbp.sdk.facade.TokenRepersoStatus.CALL_REPERSO;
        }
        if (highSpeedVideoSizes == 134) {
            return com.visa.cbp.sdk.facade.TokenRepersoStatus.PENDING_NOTIFICATION;
        }
        if (highSpeedVideoSizes == 171) {
            return com.visa.cbp.sdk.facade.TokenRepersoStatus.NO_MIGRATION;
        }
        if (highSpeedVideoSizes == 377) {
            return com.visa.cbp.sdk.facade.TokenRepersoStatus.ERROR_IN_REPERSO;
        }
        if (highSpeedVideoSizes == 403) {
            return com.visa.cbp.sdk.facade.TokenRepersoStatus.REPERSO_INITIATED;
        }
        if (highSpeedVideoSizes != 433) {
            return null;
        }
        return com.visa.cbp.sdk.facade.TokenRepersoStatus.NOT_MIGRATED;
    }
}
