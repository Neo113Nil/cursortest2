package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.coherence.CoherenceLibraryManager;
import gatewayprotocol.v1.InitializationCompletedEventRequestKt;
import gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidGetInitializationCompletedRequest.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\u00020\rH\u0096B¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetInitializationCompletedRequest;", "Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "coherenceLibraryManager", "Lcom/unity3d/ads/core/domain/coherence/CoherenceLibraryManager;", "<init>", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/coherence/CoherenceLibraryManager;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidGetInitializationCompletedRequest implements GetInitializationCompletedRequest {
    private final CoherenceLibraryManager coherenceLibraryManager;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final SessionRepository sessionRepository;

    public AndroidGetInitializationCompletedRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, CoherenceLibraryManager coherenceLibraryManager) {
        Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(coherenceLibraryManager, "coherenceLibraryManager");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.coherenceLibraryManager = coherenceLibraryManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00c9 A[PHI: r8
      0x00c9: PHI (r8v19 java.lang.Object) = (r8v15 java.lang.Object), (r8v1 java.lang.Object) binds: [B:22:0x00c6, B:10:0x002b] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.unity3d.ads.core.domain.GetInitializationCompletedRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(Continuation<? super UniversalRequestOuterClass.UniversalRequest> continuation) {
        AndroidGetInitializationCompletedRequest$invoke$1 androidGetInitializationCompletedRequest$invoke$1;
        int i;
        InitializationCompletedEventRequestKt.Dsl _create;
        InitializationCompletedEventRequestKt.Dsl dsl;
        InitializationCompletedEventRequestKt.Dsl dsl2;
        byte[] commonAttributes;
        if (continuation instanceof AndroidGetInitializationCompletedRequest$invoke$1) {
            androidGetInitializationCompletedRequest$invoke$1 = (AndroidGetInitializationCompletedRequest$invoke$1) continuation;
            if ((androidGetInitializationCompletedRequest$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidGetInitializationCompletedRequest$invoke$1.label -= Integer.MIN_VALUE;
                Object obj = androidGetInitializationCompletedRequest$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidGetInitializationCompletedRequest$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    InitializationCompletedEventRequestKt.Dsl.Companion companion = InitializationCompletedEventRequestKt.Dsl.INSTANCE;
                    InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder newBuilder = InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.newBuilder();
                    Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
                    _create = companion._create(newBuilder);
                    DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                    androidGetInitializationCompletedRequest$invoke$1.L$0 = _create;
                    androidGetInitializationCompletedRequest$invoke$1.L$1 = _create;
                    androidGetInitializationCompletedRequest$invoke$1.L$2 = _create;
                    androidGetInitializationCompletedRequest$invoke$1.label = 1;
                    obj = deviceInfoRepository.staticDeviceInfo(androidGetInitializationCompletedRequest$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dsl = _create;
                    dsl2 = dsl;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    _create = (InitializationCompletedEventRequestKt.Dsl) androidGetInitializationCompletedRequest$invoke$1.L$2;
                    dsl = (InitializationCompletedEventRequestKt.Dsl) androidGetInitializationCompletedRequest$invoke$1.L$1;
                    dsl2 = (InitializationCompletedEventRequestKt.Dsl) androidGetInitializationCompletedRequest$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                _create.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
                dsl.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
                if (this.sessionRepository.getNativeConfiguration().getFeatureFlags().getEnableCoherenceLibrary() && (commonAttributes = this.coherenceLibraryManager.getCommonAttributes()) != null) {
                    ByteString copyFrom = ByteString.copyFrom(commonAttributes);
                    Intrinsics.checkNotNullExpressionValue(copyFrom, "copyFrom(...)");
                    dsl.setCoherenceAttributes(copyFrom);
                }
                InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest _build = dsl2._build();
                UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
                UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder2 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                Intrinsics.checkNotNullExpressionValue(newBuilder2, "newBuilder(...)");
                UniversalRequestKt.PayloadKt.Dsl _create2 = companion2._create(newBuilder2);
                _create2.setInitializationCompletedEventRequest(_build);
                UniversalRequestOuterClass.UniversalRequest.Payload _build2 = _create2._build();
                GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = this.getUniversalRequestForPayLoad;
                androidGetInitializationCompletedRequest$invoke$1.L$0 = null;
                androidGetInitializationCompletedRequest$invoke$1.L$1 = null;
                androidGetInitializationCompletedRequest$invoke$1.L$2 = null;
                androidGetInitializationCompletedRequest$invoke$1.label = 2;
                obj = getUniversalRequestForPayLoad.invoke(_build2, androidGetInitializationCompletedRequest$invoke$1);
                return obj != coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        androidGetInitializationCompletedRequest$invoke$1 = new AndroidGetInitializationCompletedRequest$invoke$1(this, continuation);
        Object obj2 = androidGetInitializationCompletedRequest$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidGetInitializationCompletedRequest$invoke$1.label;
        if (i != 0) {
        }
        _create.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj2);
        dsl.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
        if (this.sessionRepository.getNativeConfiguration().getFeatureFlags().getEnableCoherenceLibrary()) {
            ByteString copyFrom2 = ByteString.copyFrom(commonAttributes);
            Intrinsics.checkNotNullExpressionValue(copyFrom2, "copyFrom(...)");
            dsl.setCoherenceAttributes(copyFrom2);
        }
        InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest _build3 = dsl2._build();
        UniversalRequestKt universalRequestKt2 = UniversalRequestKt.INSTANCE;
        UniversalRequestKt.PayloadKt.Dsl.Companion companion22 = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder22 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder22, "newBuilder(...)");
        UniversalRequestKt.PayloadKt.Dsl _create22 = companion22._create(newBuilder22);
        _create22.setInitializationCompletedEventRequest(_build3);
        UniversalRequestOuterClass.UniversalRequest.Payload _build22 = _create22._build();
        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2 = this.getUniversalRequestForPayLoad;
        androidGetInitializationCompletedRequest$invoke$1.L$0 = null;
        androidGetInitializationCompletedRequest$invoke$1.L$1 = null;
        androidGetInitializationCompletedRequest$invoke$1.L$2 = null;
        androidGetInitializationCompletedRequest$invoke$1.label = 2;
        obj2 = getUniversalRequestForPayLoad2.invoke(_build22, androidGetInitializationCompletedRequest$invoke$1);
        if (obj2 != coroutine_suspended2) {
        }
    }
}
