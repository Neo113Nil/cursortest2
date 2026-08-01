package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.LimitedSessionTokenKt;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidGetLimitedSessionToken.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\u00020\u000bH\u0096B¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetLimitedSessionToken;", "Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "mediationRepository", "Lcom/unity3d/ads/core/data/repository/MediationRepository;", "<init>", "(Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/MediationRepository;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidGetLimitedSessionToken implements GetLimitedSessionToken {
    private final DeviceInfoRepository deviceInfoRepository;
    private final MediationRepository mediationRepository;
    private final SessionRepository sessionRepository;

    public AndroidGetLimitedSessionToken(DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, MediationRepository mediationRepository) {
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(mediationRepository, "mediationRepository");
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.mediationRepository = mediationRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.unity3d.ads.core.domain.GetLimitedSessionToken
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(Continuation<? super UniversalRequestOuterClass.LimitedSessionToken> continuation) {
        AndroidGetLimitedSessionToken$invoke$1 androidGetLimitedSessionToken$invoke$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        LimitedSessionTokenKt.Dsl _create;
        LimitedSessionTokenKt.Dsl dsl;
        LimitedSessionTokenKt.Dsl dsl2;
        LimitedSessionTokenKt.Dsl dsl3;
        LimitedSessionTokenKt.Dsl dsl4;
        LimitedSessionTokenKt.Dsl dsl5;
        LimitedSessionTokenKt.Dsl dsl6;
        LimitedSessionTokenKt.Dsl dsl7;
        LimitedSessionTokenKt.Dsl dsl8;
        LimitedSessionTokenKt.Dsl dsl9;
        LimitedSessionTokenKt.Dsl dsl10;
        LimitedSessionTokenKt.Dsl dsl11;
        String gameId;
        String name;
        String version;
        if (continuation instanceof AndroidGetLimitedSessionToken$invoke$1) {
            androidGetLimitedSessionToken$invoke$1 = (AndroidGetLimitedSessionToken$invoke$1) continuation;
            if ((androidGetLimitedSessionToken$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidGetLimitedSessionToken$invoke$1.label -= Integer.MIN_VALUE;
                obj = androidGetLimitedSessionToken$invoke$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidGetLimitedSessionToken$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    LimitedSessionTokenKt.Dsl.Companion companion = LimitedSessionTokenKt.Dsl.INSTANCE;
                    UniversalRequestOuterClass.LimitedSessionToken.Builder newBuilder = UniversalRequestOuterClass.LimitedSessionToken.newBuilder();
                    Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
                    _create = companion._create(newBuilder);
                    _create.setSessionId(this.sessionRepository.getSessionId());
                    DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                    androidGetLimitedSessionToken$invoke$1.L$0 = _create;
                    androidGetLimitedSessionToken$invoke$1.L$1 = _create;
                    androidGetLimitedSessionToken$invoke$1.L$2 = _create;
                    androidGetLimitedSessionToken$invoke$1.label = 1;
                    obj = deviceInfoRepository.staticDeviceInfo(androidGetLimitedSessionToken$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dsl = _create;
                    dsl2 = dsl;
                } else if (i == 1) {
                    _create = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$2;
                    dsl = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$1;
                    dsl2 = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            dsl9 = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$2;
                            dsl10 = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$1;
                            dsl11 = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            dsl9.setIdfi((String) obj);
                            dsl10.setSdkVersion(41900);
                            dsl10.setSdkVersionName("4.19.0");
                            gameId = this.sessionRepository.getGameId();
                            if (gameId != null) {
                                dsl10.setGameId(gameId);
                            }
                            dsl10.setPlatform(ClientInfoOuterClass.Platform.PLATFORM_ANDROID);
                            dsl10.setMediationProvider(this.mediationRepository.getMediationProvider().invoke());
                            name = this.mediationRepository.getName();
                            if (name != null && dsl10.getMediationProvider() == ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM) {
                                dsl10.setCustomMediationName(name);
                            }
                            version = this.mediationRepository.getVersion();
                            if (version != null) {
                                dsl10.setMediationVersion(version);
                            }
                            return dsl11._build();
                        }
                        dsl6 = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$2;
                        dsl7 = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$1;
                        dsl8 = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        String osVersion = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getOsVersion();
                        Intrinsics.checkNotNullExpressionValue(osVersion, "getOsVersion(...)");
                        dsl6.setOsVersion(osVersion);
                        DeviceInfoRepository deviceInfoRepository2 = this.deviceInfoRepository;
                        androidGetLimitedSessionToken$invoke$1.L$0 = dsl8;
                        androidGetLimitedSessionToken$invoke$1.L$1 = dsl7;
                        androidGetLimitedSessionToken$invoke$1.L$2 = dsl7;
                        androidGetLimitedSessionToken$invoke$1.label = 4;
                        obj = deviceInfoRepository2.getIdfi(androidGetLimitedSessionToken$invoke$1);
                        if (obj != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        dsl9 = dsl7;
                        dsl10 = dsl9;
                        dsl11 = dsl8;
                        dsl9.setIdfi((String) obj);
                        dsl10.setSdkVersion(41900);
                        dsl10.setSdkVersionName("4.19.0");
                        gameId = this.sessionRepository.getGameId();
                        if (gameId != null) {
                        }
                        dsl10.setPlatform(ClientInfoOuterClass.Platform.PLATFORM_ANDROID);
                        dsl10.setMediationProvider(this.mediationRepository.getMediationProvider().invoke());
                        name = this.mediationRepository.getName();
                        if (name != null) {
                            dsl10.setCustomMediationName(name);
                        }
                        version = this.mediationRepository.getVersion();
                        if (version != null) {
                        }
                        return dsl11._build();
                    }
                    dsl3 = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$2;
                    dsl4 = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$1;
                    dsl5 = (LimitedSessionTokenKt.Dsl) androidGetLimitedSessionToken$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    String deviceModel = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getDeviceModel();
                    Intrinsics.checkNotNullExpressionValue(deviceModel, "getDeviceModel(...)");
                    dsl3.setDeviceModel(deviceModel);
                    DeviceInfoRepository deviceInfoRepository3 = this.deviceInfoRepository;
                    androidGetLimitedSessionToken$invoke$1.L$0 = dsl5;
                    androidGetLimitedSessionToken$invoke$1.L$1 = dsl4;
                    androidGetLimitedSessionToken$invoke$1.L$2 = dsl4;
                    androidGetLimitedSessionToken$invoke$1.label = 3;
                    obj = deviceInfoRepository3.staticDeviceInfo(androidGetLimitedSessionToken$invoke$1);
                    if (obj != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dsl6 = dsl4;
                    dsl7 = dsl6;
                    dsl8 = dsl5;
                    String osVersion2 = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getOsVersion();
                    Intrinsics.checkNotNullExpressionValue(osVersion2, "getOsVersion(...)");
                    dsl6.setOsVersion(osVersion2);
                    DeviceInfoRepository deviceInfoRepository22 = this.deviceInfoRepository;
                    androidGetLimitedSessionToken$invoke$1.L$0 = dsl8;
                    androidGetLimitedSessionToken$invoke$1.L$1 = dsl7;
                    androidGetLimitedSessionToken$invoke$1.L$2 = dsl7;
                    androidGetLimitedSessionToken$invoke$1.label = 4;
                    obj = deviceInfoRepository22.getIdfi(androidGetLimitedSessionToken$invoke$1);
                    if (obj != coroutine_suspended) {
                    }
                }
                String deviceMake = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getDeviceMake();
                Intrinsics.checkNotNullExpressionValue(deviceMake, "getDeviceMake(...)");
                _create.setDeviceMake(deviceMake);
                DeviceInfoRepository deviceInfoRepository4 = this.deviceInfoRepository;
                androidGetLimitedSessionToken$invoke$1.L$0 = dsl2;
                androidGetLimitedSessionToken$invoke$1.L$1 = dsl;
                androidGetLimitedSessionToken$invoke$1.L$2 = dsl;
                androidGetLimitedSessionToken$invoke$1.label = 2;
                obj = deviceInfoRepository4.staticDeviceInfo(androidGetLimitedSessionToken$invoke$1);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsl3 = dsl;
                dsl4 = dsl3;
                dsl5 = dsl2;
                String deviceModel2 = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getDeviceModel();
                Intrinsics.checkNotNullExpressionValue(deviceModel2, "getDeviceModel(...)");
                dsl3.setDeviceModel(deviceModel2);
                DeviceInfoRepository deviceInfoRepository32 = this.deviceInfoRepository;
                androidGetLimitedSessionToken$invoke$1.L$0 = dsl5;
                androidGetLimitedSessionToken$invoke$1.L$1 = dsl4;
                androidGetLimitedSessionToken$invoke$1.L$2 = dsl4;
                androidGetLimitedSessionToken$invoke$1.label = 3;
                obj = deviceInfoRepository32.staticDeviceInfo(androidGetLimitedSessionToken$invoke$1);
                if (obj != coroutine_suspended) {
                }
            }
        }
        androidGetLimitedSessionToken$invoke$1 = new AndroidGetLimitedSessionToken$invoke$1(this, continuation);
        obj = androidGetLimitedSessionToken$invoke$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidGetLimitedSessionToken$invoke$1.label;
        if (i != 0) {
        }
        String deviceMake2 = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getDeviceMake();
        Intrinsics.checkNotNullExpressionValue(deviceMake2, "getDeviceMake(...)");
        _create.setDeviceMake(deviceMake2);
        DeviceInfoRepository deviceInfoRepository42 = this.deviceInfoRepository;
        androidGetLimitedSessionToken$invoke$1.L$0 = dsl2;
        androidGetLimitedSessionToken$invoke$1.L$1 = dsl;
        androidGetLimitedSessionToken$invoke$1.L$2 = dsl;
        androidGetLimitedSessionToken$invoke$1.label = 2;
        obj = deviceInfoRepository42.staticDeviceInfo(androidGetLimitedSessionToken$invoke$1);
        if (obj != coroutine_suspended) {
        }
    }
}
