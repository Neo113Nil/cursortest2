package com.zettle.sdk.meta;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\t"}, d2 = {"Lcom/zettle/sdk/meta/PlatformInfo;", "", "Lcom/zettle/sdk/meta/Version;", "version", "", "isVersionAtLeast", "(Lcom/zettle/sdk/meta/Version;)Z", "", "getDeviceBrand", "()Ljava/lang/String;", "deviceBrand", "getDeviceLocale", "deviceLocale", "getDeviceManufacturer", "deviceManufacturer", "getDeviceModel", "deviceModel", "getDeviceModelBrand", "deviceModelBrand", "getDeviceName", "deviceName", "getVersionCode", "versionCode"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface PlatformInfo {
    java.lang.String getDeviceBrand();

    java.lang.String getDeviceLocale();

    java.lang.String getDeviceManufacturer();

    java.lang.String getDeviceModel();

    java.lang.String getDeviceModelBrand();

    java.lang.String getDeviceName();

    java.lang.String getVersionCode();

    boolean isVersionAtLeast(com.zettle.sdk.meta.Version version);
}
