package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.ironsource.U3;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: DeviceInfoRepository.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u000e\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\bH&J\u000e\u0010\u0018\u001a\u00020\u0019H¦@¢\u0006\u0002\u0010\tJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0019H¦@¢\u0006\u0002\u0010\tJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cH¦@¢\u0006\u0002\u0010\tJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0019H¦@¢\u0006\u0002\u0010\tR\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0012\u0010!\u001a\u00020\"X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0012\u0010%\u001a\u00020&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0012\u0010)\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010 R\u0012\u0010+\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010 R\u0012\u0010-\u001a\u00020\"X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010$R\u0018\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001900X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0012\u00103\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u0010 R\u0012\u00105\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010 R\u0012\u00107\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u0010 R\u0012\u00109\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010 R\u0012\u0010;\u001a\u00020<X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "", "allowedPii", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "getAllowedPii", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "staticDeviceInfo", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cachedStaticDeviceInfo", "dynamicDeviceInfo", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfo", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "piiData", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "getPiiData", "()Lgatewayprotocol/v1/PiiOuterClass$Pii;", "volumeSettingsChange", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "getVolumeSettingsChange", "()Lkotlinx/coroutines/flow/Flow;", "getIdfi", "", "getAuidString", "getAuidByteString", "Lcom/google/protobuf/ByteString;", "getUnityBuildGuid", "analyticsUserId", "getAnalyticsUserId", "()Ljava/lang/String;", "ringerMode", "", "getRingerMode", "()I", "systemBootTime", "", "getSystemBootTime", "()J", U3.i.n, "getOrientation", "connectionTypeStr", "getConnectionTypeStr", "currentUiTheme", "getCurrentUiTheme", "localeList", "", "getLocaleList", "()Ljava/util/List;", "appName", "getAppName", "model", "getModel", "manufacturer", "getManufacturer", "osVersion", "getOsVersion", "hasInternet", "", "getHasInternet", "()Z", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DeviceInfoRepository {
    StaticDeviceInfoOuterClass.StaticDeviceInfo cachedStaticDeviceInfo();

    MutableStateFlow<AllowedPiiOuterClass.AllowedPii> getAllowedPii();

    String getAnalyticsUserId();

    String getAppName();

    Object getAuidByteString(Continuation<? super ByteString> continuation);

    Object getAuidString(Continuation<? super String> continuation);

    String getConnectionTypeStr();

    int getCurrentUiTheme();

    DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

    boolean getHasInternet();

    Object getIdfi(Continuation<? super String> continuation);

    List<String> getLocaleList();

    String getManufacturer();

    String getModel();

    String getOrientation();

    String getOsVersion();

    PiiOuterClass.Pii getPiiData();

    int getRingerMode();

    long getSystemBootTime();

    Object getUnityBuildGuid(Continuation<? super String> continuation);

    Flow<VolumeSettingsChange> getVolumeSettingsChange();

    Object staticDeviceInfo(Continuation<? super StaticDeviceInfoOuterClass.StaticDeviceInfo> continuation);
}
