package com.zettle.sdk.meta;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010R\u0014\u0010\u001d\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0011\u0010!\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/zettle/sdk/meta/PlatformInfoFromBuild;", "Lcom/zettle/sdk/meta/PlatformInfo;", "Lcom/zettle/sdk/meta/BuildInfo;", "build", "<init>", "(Lcom/zettle/sdk/meta/BuildInfo;)V", "Lcom/zettle/sdk/meta/Version;", "version", "", "isVersionAtLeast", "(Lcom/zettle/sdk/meta/Version;)Z", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/meta/BuildInfo;", "getHighSpeedVideoFpsRangesFor", "", "getDeviceBrand", "()Ljava/lang/String;", "deviceBrand", "getDeviceLocale", "deviceLocale", "getDeviceManufacturer", "deviceManufacturer", "getDeviceModel", "deviceModel", "getDeviceModelBrand", "deviceModelBrand", "getDeviceName", "deviceName", "getVersionCode", "versionCode", "", "getVersionCodeInt", "()I", "versionCodeInt"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PlatformInfoFromBuild implements com.zettle.sdk.meta.PlatformInfo {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.BuildInfo getHighSpeedVideoFpsRangesFor;

    public PlatformInfoFromBuild(com.zettle.sdk.meta.BuildInfo buildInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildInfo, "");
        this.getHighSpeedVideoFpsRangesFor = buildInfo;
    }

    @Override // com.zettle.sdk.meta.PlatformInfo
    public final java.lang.String getDeviceName() {
        java.util.List filterNotNull = kotlin.collections.ArraysKt.filterNotNull(new java.lang.String[]{this.getHighSpeedVideoFpsRangesFor.getProduct(), this.getHighSpeedVideoFpsRangesFor.getDevice()});
        java.lang.String joinToString$default = !filterNotNull.isEmpty() ? kotlin.collections.CollectionsKt.joinToString$default(filterNotNull, " ", null, null, 0, null, null, 62, null) : null;
        if (joinToString$default != null) {
            return kotlin.text.StringsKt.trim(joinToString$default).toString();
        }
        return null;
    }

    @Override // com.zettle.sdk.meta.PlatformInfo
    public final java.lang.String getDeviceModel() {
        java.lang.String model = this.getHighSpeedVideoFpsRangesFor.getModel();
        if (kotlin.text.StringsKt.isBlank(model)) {
            return null;
        }
        return model;
    }

    @Override // com.zettle.sdk.meta.PlatformInfo
    public final java.lang.String getDeviceBrand() {
        java.lang.String brand = this.getHighSpeedVideoFpsRangesFor.getBrand();
        if (kotlin.text.StringsKt.isBlank(brand)) {
            return null;
        }
        return brand;
    }

    @Override // com.zettle.sdk.meta.PlatformInfo
    public final java.lang.String getDeviceModelBrand() {
        java.util.List filterNotNull = kotlin.collections.ArraysKt.filterNotNull(new java.lang.String[]{getDeviceModel(), getDeviceBrand()});
        java.lang.String joinToString$default = !filterNotNull.isEmpty() ? kotlin.collections.CollectionsKt.joinToString$default(filterNotNull, " ", null, null, 0, null, null, 62, null) : null;
        if (joinToString$default != null) {
            return kotlin.text.StringsKt.trim(joinToString$default).toString();
        }
        return null;
    }

    @Override // com.zettle.sdk.meta.PlatformInfo
    public final java.lang.String getDeviceManufacturer() {
        java.lang.String manufacturer = this.getHighSpeedVideoFpsRangesFor.getManufacturer();
        if (kotlin.text.StringsKt.isBlank(manufacturer)) {
            return null;
        }
        return manufacturer;
    }

    @Override // com.zettle.sdk.meta.PlatformInfo
    public final java.lang.String getDeviceLocale() {
        return this.getHighSpeedVideoFpsRangesFor.getLocaleProvider().invoke();
    }

    @Override // com.zettle.sdk.meta.PlatformInfo
    public final java.lang.String getVersionCode() {
        return java.lang.String.valueOf(getVersionCodeInt());
    }

    @Override // com.zettle.sdk.meta.PlatformInfo
    public final boolean isVersionAtLeast(com.zettle.sdk.meta.Version version) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
        return getVersionCodeInt() >= version.getCode();
    }

    public final int getVersionCodeInt() {
        return this.getHighSpeedVideoFpsRangesFor.getVersionCode();
    }
}
