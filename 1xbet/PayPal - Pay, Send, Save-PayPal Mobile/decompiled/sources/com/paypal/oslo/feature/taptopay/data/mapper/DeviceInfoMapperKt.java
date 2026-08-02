package com.paypal.oslo.feature.taptopay.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletDeviceIDType;", "toDeviceWalletDeviceIDType", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletDeviceIDType;", "Lcom/paypal/oslo/api/graphql/schema/type/DeviceType;", "toDeviceType", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/DeviceType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeviceInfoMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.DeviceWalletDeviceIDType toDeviceWalletDeviceIDType(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int hashCode = str.hashCode();
        if (hashCode != -1628721009) {
            if (hashCode != 67818) {
                if (hashCode == 2199177 && str.equals(com.paypal.oslo.feature.taptopay.data.repository.paypal.device.WalletPartnerDeviceIdResolver.DEVICE_ID_TYPE_GUID)) {
                    return com.paypal.oslo.api.graphql.schema.type.DeviceWalletDeviceIDType.GUID;
                }
            } else if (str.equals(com.paypal.oslo.feature.taptopay.data.repository.paypal.device.WalletPartnerDeviceIdResolver.DEVICE_ID_TYPE_DMS)) {
                return com.paypal.oslo.api.graphql.schema.type.DeviceWalletDeviceIDType.DMS;
            }
        } else if (str.equals("DMS_ENCRYPTED")) {
            return com.paypal.oslo.api.graphql.schema.type.DeviceWalletDeviceIDType.DMS_ENCRYPTED;
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Unknown device ID type, defaulting to GUID", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceIdType", str)), null, 4, null);
        return com.paypal.oslo.api.graphql.schema.type.DeviceWalletDeviceIDType.GUID;
    }

    public static final com.paypal.oslo.api.graphql.schema.type.DeviceType toDeviceType(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "PHONE")) {
            return com.paypal.oslo.api.graphql.schema.type.DeviceType.PHONE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "TABLET")) {
            return com.paypal.oslo.api.graphql.schema.type.DeviceType.TABLET;
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Unknown device type, defaulting to PHONE", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceType", str)), null, 4, null);
        return com.paypal.oslo.api.graphql.schema.type.DeviceType.PHONE;
    }
}
