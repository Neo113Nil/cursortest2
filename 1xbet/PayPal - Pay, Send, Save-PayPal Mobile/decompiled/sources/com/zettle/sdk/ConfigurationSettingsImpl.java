package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Lcom/zettle/sdk/ConfigurationSettingsImpl;", "Lcom/zettle/sdk/ConfigurationSettings;", "<init>", "()V", "", "getHighResolutionOutputSizeshNQ4ISI", "Z", "isSimplifiedUserConfig", "()Z", "getHighSpeedVideoSizes", "isUatMode"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final class ConfigurationSettingsImpl implements com.zettle.sdk.ConfigurationSettings {
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoSizes;

    @Override // com.zettle.sdk.ConfigurationSettings
    /* renamed from: isUatMode, reason: from getter */
    public final boolean getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.zettle.sdk.ConfigurationSettings
    /* renamed from: isSimplifiedUserConfig, reason: from getter */
    public final boolean getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
