package com.datadog.android.trace.internal.domain.event;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0004¢\u0006\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/datadog/android/trace/internal/domain/event/BaseSpanEventMapper;", "T", "Lcom/datadog/android/trace/internal/domain/event/ContextAwareMapper;", "Lcom/datadog/android/trace/model/SpanEvent;", "<init>", "()V", "Lcom/datadog/android/api/context/AccountInfo;", "accountInfo", "Lcom/datadog/android/trace/model/SpanEvent$Account;", "resolveAccountInfo", "(Lcom/datadog/android/api/context/AccountInfo;)Lcom/datadog/android/trace/model/SpanEvent$Account;", "Lcom/datadog/android/api/context/DeviceInfo;", "deviceInfo", "Lcom/datadog/android/trace/model/SpanEvent$Device;", "resolveDeviceInfo", "(Lcom/datadog/android/api/context/DeviceInfo;)Lcom/datadog/android/trace/model/SpanEvent$Device;", "Lcom/datadog/android/api/context/NetworkInfo;", "networkInfo", "Lcom/datadog/android/trace/model/SpanEvent$Network;", "resolveNetworkInfo", "(Lcom/datadog/android/api/context/NetworkInfo;)Lcom/datadog/android/trace/model/SpanEvent$Network;", "Lcom/datadog/android/trace/model/SpanEvent$Os;", "resolveOsInfo", "(Lcom/datadog/android/api/context/DeviceInfo;)Lcom/datadog/android/trace/model/SpanEvent$Os;", "Lcom/datadog/android/api/context/UserInfo;", "userInfo", "Lcom/datadog/android/trace/model/SpanEvent$Usr;", "resolveUserInfo", "(Lcom/datadog/android/api/context/UserInfo;)Lcom/datadog/android/trace/model/SpanEvent$Usr;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class BaseSpanEventMapper<T> implements com.datadog.android.trace.internal.domain.event.ContextAwareMapper<T, com.datadog.android.trace.model.SpanEvent> {
    protected final com.datadog.android.trace.model.SpanEvent.Usr resolveUserInfo(com.datadog.android.api.context.UserInfo userInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userInfo, "");
        return new com.datadog.android.trace.model.SpanEvent.Usr(userInfo.getId(), userInfo.getName(), userInfo.getEmail(), kotlin.collections.MapsKt.toMutableMap(userInfo.getAdditionalProperties()));
    }

    protected final com.datadog.android.trace.model.SpanEvent.Account resolveAccountInfo(com.datadog.android.api.context.AccountInfo accountInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountInfo, "");
        return new com.datadog.android.trace.model.SpanEvent.Account(accountInfo.getId(), accountInfo.getName(), kotlin.collections.MapsKt.toMutableMap(accountInfo.getExtraInfo()));
    }

    protected final com.datadog.android.trace.model.SpanEvent.Device resolveDeviceInfo(com.datadog.android.api.context.DeviceInfo deviceInfo) {
        com.datadog.android.trace.model.SpanEvent.Type type;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "");
        switch (com.datadog.android.trace.internal.domain.event.BaseSpanEventMapper.WhenMappings.$EnumSwitchMapping$0[deviceInfo.getDeviceType().ordinal()]) {
            case 1:
                type = com.datadog.android.trace.model.SpanEvent.Type.MOBILE;
                break;
            case 2:
                type = com.datadog.android.trace.model.SpanEvent.Type.TABLET;
                break;
            case 3:
                type = com.datadog.android.trace.model.SpanEvent.Type.TV;
                break;
            case 4:
                type = com.datadog.android.trace.model.SpanEvent.Type.DESKTOP;
                break;
            case 5:
                type = com.datadog.android.trace.model.SpanEvent.Type.GAMING_CONSOLE;
                break;
            case 6:
                type = com.datadog.android.trace.model.SpanEvent.Type.BOT;
                break;
            case 7:
                type = com.datadog.android.trace.model.SpanEvent.Type.OTHER;
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.datadog.android.trace.model.SpanEvent.Device(type, deviceInfo.getDeviceName(), deviceInfo.getDeviceModel(), deviceInfo.getDeviceBrand(), deviceInfo.getArchitecture(), null, null, null, null, null, null, java.lang.Integer.valueOf(deviceInfo.getLogicalCpuCount()), deviceInfo.getTotalRam(), deviceInfo.isLowRam(), 2016, null);
    }

    protected final com.datadog.android.trace.model.SpanEvent.Os resolveOsInfo(com.datadog.android.api.context.DeviceInfo deviceInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "");
        return new com.datadog.android.trace.model.SpanEvent.Os(deviceInfo.getOsName(), deviceInfo.getOsVersion(), null, deviceInfo.getOsMajorVersion(), 4, null);
    }

    protected final com.datadog.android.trace.model.SpanEvent.Network resolveNetworkInfo(com.datadog.android.api.context.NetworkInfo networkInfo) {
        com.datadog.android.trace.model.SpanEvent.SimCarrier simCarrier;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInfo, "");
        if (networkInfo.getCarrierId() == null && networkInfo.getCarrierName() == null) {
            simCarrier = null;
        } else {
            java.lang.Long carrierId = networkInfo.getCarrierId();
            simCarrier = new com.datadog.android.trace.model.SpanEvent.SimCarrier(carrierId != null ? carrierId.toString() : null, networkInfo.getCarrierName());
        }
        java.lang.Long strength = networkInfo.getStrength();
        java.lang.String obj = strength != null ? strength.toString() : null;
        java.lang.Long downKbps = networkInfo.getDownKbps();
        java.lang.String obj2 = downKbps != null ? downKbps.toString() : null;
        java.lang.Long upKbps = networkInfo.getUpKbps();
        return new com.datadog.android.trace.model.SpanEvent.Network(new com.datadog.android.trace.model.SpanEvent.Client(simCarrier, obj, obj2, upKbps != null ? upKbps.toString() : null, networkInfo.getConnectivity().toString()));
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.datadog.android.api.context.DeviceType.values().length];
            try {
                iArr[com.datadog.android.api.context.DeviceType.MOBILE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.datadog.android.api.context.DeviceType.TABLET.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.datadog.android.api.context.DeviceType.TV.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.datadog.android.api.context.DeviceType.DESKTOP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.datadog.android.api.context.DeviceType.GAMING_CONSOLE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.datadog.android.api.context.DeviceType.BOT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.datadog.android.api.context.DeviceType.OTHER.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
