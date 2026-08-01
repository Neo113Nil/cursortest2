package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.ironsource.Te;
import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.adquality.UpdateAdQualitySessionToken;
import com.unity3d.ads.core.extensions.ErrorExtensionsKt;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: AndroidHandleGatewayUniversalResponse.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096B¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleGatewayUniversalResponse;", "Lcom/unity3d/ads/core/domain/HandleGatewayUniversalResponse;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "appSetIdDataSource", "Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;", "updateAdQualitySessionToken", "Lcom/unity3d/ads/core/domain/adquality/UpdateAdQualitySessionToken;", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;Lcom/unity3d/ads/core/domain/adquality/UpdateAdQualitySessionToken;)V", "invoke", "", Te.n, "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidHandleGatewayUniversalResponse implements HandleGatewayUniversalResponse {
    private final AndroidAppSetIdDataSource appSetIdDataSource;
    private final DeviceInfoRepository deviceInfoRepository;
    private final SessionRepository sessionRepository;
    private final UpdateAdQualitySessionToken updateAdQualitySessionToken;

    public AndroidHandleGatewayUniversalResponse(SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, AndroidAppSetIdDataSource appSetIdDataSource, UpdateAdQualitySessionToken updateAdQualitySessionToken) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(appSetIdDataSource, "appSetIdDataSource");
        Intrinsics.checkNotNullParameter(updateAdQualitySessionToken, "updateAdQualitySessionToken");
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.appSetIdDataSource = appSetIdDataSource;
        this.updateAdQualitySessionToken = updateAdQualitySessionToken;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.unity3d.ads.core.domain.HandleGatewayUniversalResponse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(UniversalResponseOuterClass.UniversalResponse universalResponse, Continuation<? super Unit> continuation) {
        AndroidHandleGatewayUniversalResponse$invoke$1 androidHandleGatewayUniversalResponse$invoke$1;
        int i;
        MutableDataOuterClass.MutableData mutableData;
        AllowedPiiOuterClass.AllowedPii value;
        AllowedPiiOuterClass.AllowedPii allowedPii;
        if (continuation instanceof AndroidHandleGatewayUniversalResponse$invoke$1) {
            androidHandleGatewayUniversalResponse$invoke$1 = (AndroidHandleGatewayUniversalResponse$invoke$1) continuation;
            if ((androidHandleGatewayUniversalResponse$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidHandleGatewayUniversalResponse$invoke$1.label -= Integer.MIN_VALUE;
                Object obj = androidHandleGatewayUniversalResponse$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidHandleGatewayUniversalResponse$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (universalResponse.hasError()) {
                        ErrorOuterClass.PublicErrorCode errorCode = universalResponse.getError().getErrorCode();
                        Intrinsics.checkNotNullExpressionValue(errorCode, "getErrorCode(...)");
                        String initErrorMsg = UnityAdsErrorKt.getInitErrorMsg(errorCode, this.sessionRepository.getGameId());
                        if (initErrorMsg == null) {
                            initErrorMsg = universalResponse.getError().getErrorText();
                        }
                        String str = initErrorMsg;
                        Intrinsics.checkNotNull(str);
                        IllegalStateException illegalStateException = new IllegalStateException(universalResponse.getError().getErrorText());
                        String errorText = universalResponse.getError().getErrorText();
                        ErrorOuterClass.PublicErrorCode errorCode2 = universalResponse.getError().getErrorCode();
                        ErrorOuterClass.Error error = universalResponse.getError();
                        Intrinsics.checkNotNullExpressionValue(error, "getError(...)");
                        throw new GatewayException(str, illegalStateException, "gateway_universal", errorText, errorCode2, ErrorExtensionsKt.getErrorTokenOrNull(error));
                    }
                    if (universalResponse.hasMutableData()) {
                        mutableData = universalResponse.getMutableData();
                        MutableStateFlow<AllowedPiiOuterClass.AllowedPii> allowedPii2 = this.deviceInfoRepository.getAllowedPii();
                        do {
                            value = allowedPii2.getValue();
                            allowedPii = mutableData.getAllowedPii();
                            Intrinsics.checkNotNullExpressionValue(allowedPii, "getAllowedPii(...)");
                        } while (!allowedPii2.compareAndSet(value, allowedPii));
                        if (mutableData.getAllowedPii().getAppsetId()) {
                            this.appSetIdDataSource.invoke();
                        }
                        SessionRepository sessionRepository = this.sessionRepository;
                        ByteString currentState = mutableData.getCurrentState();
                        Intrinsics.checkNotNullExpressionValue(currentState, "getCurrentState(...)");
                        sessionRepository.setGatewayState(currentState);
                        if (mutableData.hasSessionToken()) {
                            SessionRepository sessionRepository2 = this.sessionRepository;
                            ByteString sessionToken = mutableData.getSessionToken();
                            Intrinsics.checkNotNullExpressionValue(sessionToken, "getSessionToken(...)");
                            sessionRepository2.setSessionToken(sessionToken);
                            UpdateAdQualitySessionToken updateAdQualitySessionToken = this.updateAdQualitySessionToken;
                            ByteString sessionToken2 = mutableData.getSessionToken();
                            Intrinsics.checkNotNullExpressionValue(sessionToken2, "getSessionToken(...)");
                            updateAdQualitySessionToken.invoke(sessionToken2);
                        }
                        if (mutableData.hasPrivacy()) {
                            SessionRepository sessionRepository3 = this.sessionRepository;
                            ByteString privacy = mutableData.getPrivacy();
                            Intrinsics.checkNotNullExpressionValue(privacy, "getPrivacy(...)");
                            androidHandleGatewayUniversalResponse$invoke$1.L$0 = mutableData;
                            androidHandleGatewayUniversalResponse$invoke$1.label = 1;
                            if (sessionRepository3.setPrivacy(privacy, androidHandleGatewayUniversalResponse$invoke$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    mutableData = (MutableDataOuterClass.MutableData) androidHandleGatewayUniversalResponse$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (mutableData.hasPrivacyFsm()) {
                        SessionRepository sessionRepository4 = this.sessionRepository;
                        ByteString privacyFsm = mutableData.getPrivacyFsm();
                        Intrinsics.checkNotNullExpressionValue(privacyFsm, "getPrivacyFsm(...)");
                        androidHandleGatewayUniversalResponse$invoke$1.L$0 = null;
                        androidHandleGatewayUniversalResponse$invoke$1.label = 3;
                        if (sessionRepository4.setPrivacyFsm(privacyFsm, androidHandleGatewayUniversalResponse$invoke$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                mutableData = (MutableDataOuterClass.MutableData) androidHandleGatewayUniversalResponse$invoke$1.L$0;
                ResultKt.throwOnFailure(obj);
                if (mutableData.hasSessionCounters()) {
                    SessionRepository sessionRepository5 = this.sessionRepository;
                    SessionCountersOuterClass.SessionCounters sessionCounters = mutableData.getSessionCounters();
                    Intrinsics.checkNotNullExpressionValue(sessionCounters, "getSessionCounters(...)");
                    sessionRepository5.setSessionCounters(sessionCounters);
                }
                if (mutableData.hasCache()) {
                    SessionRepository sessionRepository6 = this.sessionRepository;
                    ByteString cache = mutableData.getCache();
                    Intrinsics.checkNotNullExpressionValue(cache, "getCache(...)");
                    androidHandleGatewayUniversalResponse$invoke$1.L$0 = mutableData;
                    androidHandleGatewayUniversalResponse$invoke$1.label = 2;
                    if (sessionRepository6.setGatewayCache(cache, androidHandleGatewayUniversalResponse$invoke$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (mutableData.hasPrivacyFsm()) {
                }
                return Unit.INSTANCE;
            }
        }
        androidHandleGatewayUniversalResponse$invoke$1 = new AndroidHandleGatewayUniversalResponse$invoke$1(this, continuation);
        Object obj2 = androidHandleGatewayUniversalResponse$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidHandleGatewayUniversalResponse$invoke$1.label;
        if (i != 0) {
        }
        if (mutableData.hasSessionCounters()) {
        }
        if (mutableData.hasCache()) {
        }
        if (mutableData.hasPrivacyFsm()) {
        }
        return Unit.INSTANCE;
    }
}
