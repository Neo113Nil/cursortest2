package com.paypal.oslo.core.appidentity.domain;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/appidentity/domain/DeviceInformation;", "", "", "getDeviceModel", "()Ljava/lang/String;", "deviceModel", "getDeviceManufacturer", "deviceManufacturer", "getOsName", "osName", "getOsVersion", "osVersion", "Lcom/paypal/oslo/core/appidentity/domain/DeviceOrientation;", "getDeviceOrientation", "()Lcom/paypal/oslo/core/appidentity/domain/DeviceOrientation;", "deviceOrientation", "getAndroidId", "androidId", "", "isNFCSupported", "()Z", "Lcom/paypal/oslo/core/appidentity/domain/DeviceType;", "getDeviceType", "()Lcom/paypal/oslo/core/appidentity/domain/DeviceType;", "deviceType", "getNetworkCarrier", "networkCarrier"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface DeviceInformation {
    java.lang.String getAndroidId();

    java.lang.String getDeviceManufacturer();

    java.lang.String getDeviceModel();

    com.paypal.oslo.core.appidentity.domain.DeviceOrientation getDeviceOrientation();

    java.lang.String getOsName();

    java.lang.String getOsVersion();

    default boolean isNFCSupported() {
        return false;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean isNFCSupported(com.paypal.oslo.core.appidentity.domain.DeviceInformation deviceInformation) {
            return com.paypal.oslo.core.appidentity.domain.DeviceInformation.super.isNFCSupported();
        }

        @java.lang.Deprecated
        public static com.paypal.oslo.core.appidentity.domain.DeviceType getDeviceType(com.paypal.oslo.core.appidentity.domain.DeviceInformation deviceInformation) {
            return com.paypal.oslo.core.appidentity.domain.DeviceInformation.super.getDeviceType();
        }

        @java.lang.Deprecated
        public static java.lang.String getNetworkCarrier(com.paypal.oslo.core.appidentity.domain.DeviceInformation deviceInformation) {
            return com.paypal.oslo.core.appidentity.domain.DeviceInformation.super.getNetworkCarrier();
        }
    }

    default com.paypal.oslo.core.appidentity.domain.DeviceType getDeviceType() {
        return com.paypal.oslo.core.appidentity.domain.DeviceType.PHONE;
    }

    default java.lang.String getNetworkCarrier() {
        return "unknown";
    }
}
