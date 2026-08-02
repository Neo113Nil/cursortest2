package com.paypal.oslo.core.appidentity.domain;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/appidentity/domain/AppIdentity;", "Lcom/paypal/oslo/core/appidentity/domain/AppInformation;", "Lcom/paypal/oslo/core/appidentity/domain/DeviceInformation;", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "Lcom/paypal/oslo/core/appidentity/domain/DistributionChannel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AppIdentity extends com.paypal.oslo.core.appidentity.domain.AppInformation, com.paypal.oslo.core.appidentity.domain.DeviceInformation, com.paypal.oslo.core.appidentity.domain.LocaleInformation, com.paypal.oslo.core.appidentity.domain.DistributionChannel {

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static com.paypal.oslo.core.appidentity.domain.DeviceType getDeviceType(com.paypal.oslo.core.appidentity.domain.AppIdentity appIdentity) {
            return com.paypal.oslo.core.appidentity.domain.AppIdentity.super.getDeviceType();
        }

        @java.lang.Deprecated
        public static java.lang.String getNetworkCarrier(com.paypal.oslo.core.appidentity.domain.AppIdentity appIdentity) {
            return com.paypal.oslo.core.appidentity.domain.AppIdentity.super.getNetworkCarrier();
        }

        @java.lang.Deprecated
        public static boolean isNFCSupported(com.paypal.oslo.core.appidentity.domain.AppIdentity appIdentity) {
            return com.paypal.oslo.core.appidentity.domain.AppIdentity.super.isNFCSupported();
        }
    }
}
