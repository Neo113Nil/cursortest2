package com.unity3d.ads.core.domain;

import android.content.Context;
import android.util.Base64;
import com.google.protobuf.ByteString;
import com.ironsource.Te;
import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CoroutineOpportunity;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.WebViewConfiguration;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CacheWebViewAssets;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.adload.WebViewLessLoadStrategy;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.extensions.ErrorExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.OperativeEventErrorDataKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlin.time.TimeSource;
import kotlin.time.TimedValue;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.json.JSONObject;

/* compiled from: AndroidHandleGatewayAdResponse.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJN\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0096B¢\u0006\u0002\u00101J&\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020+2\u0006\u00107\u001a\u000208H\u0082@¢\u0006\u0002\u00109J0\u0010:\u001a\u0002032\u0006\u0010;\u001a\u00020<2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\u0010=\u001a\u0004\u0018\u00010>H\u0082@¢\u0006\u0002\u0010?R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleGatewayAdResponse;", "Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "getWebViewContainerUseCase", "Lcom/unity3d/ads/core/domain/AndroidGetWebViewContainerUseCase;", "getWebViewBridge", "Lcom/unity3d/ads/core/domain/GetWebViewBridgeUseCase;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "getHandleInvocationsFromAdViewer", "Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;", "campaignRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getOperativeEventApi", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "getLatestWebViewConfiguration", "Lcom/unity3d/ads/core/domain/GetLatestWebViewConfiguration;", "adPlayerScope", "Lcom/unity3d/ads/adplayer/AdPlayerScope;", "getAdPlayer", "Lcom/unity3d/ads/core/domain/GetAdPlayer;", "cacheWebViewAssets", "Lcom/unity3d/ads/core/domain/CacheWebViewAssets;", "webViewLessLoadStrategy", "Lcom/unity3d/ads/core/domain/adload/WebViewLessLoadStrategy;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "<init>", "(Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/AndroidGetWebViewContainerUseCase;Lcom/unity3d/ads/core/domain/GetWebViewBridgeUseCase;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;Lcom/unity3d/ads/core/data/repository/CampaignRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;Lcom/unity3d/ads/core/domain/GetLatestWebViewConfiguration;Lcom/unity3d/ads/adplayer/AdPlayerScope;Lcom/unity3d/ads/core/domain/GetAdPlayer;Lcom/unity3d/ads/core/domain/CacheWebViewAssets;Lcom/unity3d/ads/core/domain/adload/WebViewLessLoadStrategy;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "invoke", "Lcom/unity3d/ads/core/data/model/LoadResult;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "opportunityId", "Lcom/google/protobuf/ByteString;", Te.n, "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "context", "Landroid/content/Context;", "placementId", "", "adType", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "", "forceWebViewLoad", "(Lcom/unity3d/ads/UnityAdsLoadOptions;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;Landroid/content/Context;Ljava/lang/String;Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadUrl", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "webViewUrl", "webviewContainer", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "(Lcom/unity3d/ads/core/data/model/AdObject;Ljava/lang/String;Lcom/unity3d/ads/adplayer/WebViewContainer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanup", "t", "", "adPlayer", "Lcom/unity3d/ads/adplayer/AdPlayer;", "(Ljava/lang/Throwable;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;Lcom/unity3d/ads/adplayer/AdPlayer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidHandleGatewayAdResponse implements HandleGatewayAdResponse {
    private final AdPlayerScope adPlayerScope;
    private final AdRepository adRepository;
    private final CacheWebViewAssets cacheWebViewAssets;
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetAdPlayer getAdPlayer;
    private final HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer;
    private final GetLatestWebViewConfiguration getLatestWebViewConfiguration;
    private final GetOperativeEventApi getOperativeEventApi;
    private final GetWebViewBridgeUseCase getWebViewBridge;
    private final AndroidGetWebViewContainerUseCase getWebViewContainerUseCase;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final WebViewLessLoadStrategy webViewLessLoadStrategy;

    public AndroidHandleGatewayAdResponse(AdRepository adRepository, AndroidGetWebViewContainerUseCase getWebViewContainerUseCase, GetWebViewBridgeUseCase getWebViewBridge, DeviceInfoRepository deviceInfoRepository, HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer, CampaignRepository campaignRepository, SendDiagnosticEvent sendDiagnosticEvent, GetOperativeEventApi getOperativeEventApi, GetLatestWebViewConfiguration getLatestWebViewConfiguration, AdPlayerScope adPlayerScope, GetAdPlayer getAdPlayer, CacheWebViewAssets cacheWebViewAssets, WebViewLessLoadStrategy webViewLessLoadStrategy, SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        Intrinsics.checkNotNullParameter(getWebViewContainerUseCase, "getWebViewContainerUseCase");
        Intrinsics.checkNotNullParameter(getWebViewBridge, "getWebViewBridge");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(getHandleInvocationsFromAdViewer, "getHandleInvocationsFromAdViewer");
        Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(getOperativeEventApi, "getOperativeEventApi");
        Intrinsics.checkNotNullParameter(getLatestWebViewConfiguration, "getLatestWebViewConfiguration");
        Intrinsics.checkNotNullParameter(adPlayerScope, "adPlayerScope");
        Intrinsics.checkNotNullParameter(getAdPlayer, "getAdPlayer");
        Intrinsics.checkNotNullParameter(cacheWebViewAssets, "cacheWebViewAssets");
        Intrinsics.checkNotNullParameter(webViewLessLoadStrategy, "webViewLessLoadStrategy");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.adRepository = adRepository;
        this.getWebViewContainerUseCase = getWebViewContainerUseCase;
        this.getWebViewBridge = getWebViewBridge;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getHandleInvocationsFromAdViewer = getHandleInvocationsFromAdViewer;
        this.campaignRepository = campaignRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getLatestWebViewConfiguration = getLatestWebViewConfiguration;
        this.adPlayerScope = adPlayerScope;
        this.getAdPlayer = getAdPlayer;
        this.cacheWebViewAssets = cacheWebViewAssets;
        this.webViewLessLoadStrategy = webViewLessLoadStrategy;
        this.sessionRepository = sessionRepository;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|379|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x00bc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x00bd, code lost:
    
        r15 = r11;
        r2 = r12;
        r5 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00bd: MOVE (r15 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:378:0x00bd */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00be: MOVE (r2 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:378:0x00bd */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0823 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x06a2 A[Catch: CancellationException -> 0x0988, TryCatch #35 {CancellationException -> 0x0988, blocks: (B:83:0x0677, B:85:0x069f, B:86:0x06a4, B:114:0x06a2), top: B:82:0x0677 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04e0 A[Catch: CancellationException -> 0x09bb, TRY_ENTER, TRY_LEAVE, TryCatch #19 {CancellationException -> 0x09bb, blocks: (B:144:0x04b9, B:146:0x04e0), top: B:143:0x04b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0a17  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0449 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x02eb A[Catch: CancellationException -> 0x01f0, TRY_ENTER, TryCatch #10 {CancellationException -> 0x01f0, blocks: (B:302:0x01e6, B:307:0x02eb, B:309:0x02f3), top: B:301:0x01e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0a0f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0353 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0a10  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x030b A[Catch: CancellationException -> 0x09c1, TRY_ENTER, TryCatch #17 {CancellationException -> 0x09c1, blocks: (B:305:0x02d8, B:312:0x0343, B:333:0x030b), top: B:304:0x02d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0871 A[Catch: CancellationException -> 0x0972, TRY_LEAVE, TryCatch #12 {CancellationException -> 0x0972, blocks: (B:41:0x086d, B:43:0x0871, B:47:0x0900, B:49:0x0925, B:50:0x0941, B:52:0x0953, B:54:0x096c, B:56:0x0959, B:58:0x095f, B:60:0x0967), top: B:40:0x086d }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0900 A[Catch: CancellationException -> 0x0972, TRY_ENTER, TryCatch #12 {CancellationException -> 0x0972, blocks: (B:41:0x086d, B:43:0x0871, B:47:0x0900, B:49:0x0925, B:50:0x0941, B:52:0x0953, B:54:0x096c, B:56:0x0959, B:58:0x095f, B:60:0x0967), top: B:40:0x086d }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0855 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x069f A[Catch: CancellationException -> 0x0988, TryCatch #35 {CancellationException -> 0x0988, blocks: (B:83:0x0677, B:85:0x069f, B:86:0x06a4, B:114:0x06a2), top: B:82:0x0677 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x07aa A[Catch: CancellationException -> 0x097b, TryCatch #20 {CancellationException -> 0x097b, blocks: (B:95:0x0787, B:97:0x07aa, B:99:0x07ba, B:100:0x07ed), top: B:94:0x0787 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r18v11, types: [int] */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r4v49, types: [int] */
    /* JADX WARN: Type inference failed for: r7v25, types: [T, com.unity3d.ads.adplayer.AdPlayer] */
    @Override // com.unity3d.ads.core.domain.HandleGatewayAdResponse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(UnityAdsLoadOptions unityAdsLoadOptions, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, Context context, String str, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, boolean z, boolean z2, Continuation<? super LoadResult> continuation) {
        AndroidHandleGatewayAdResponse$invoke$1 androidHandleGatewayAdResponse$invoke$1;
        AdResponseOuterClass.AdResponse adResponse2;
        ByteString byteString2;
        Object obj;
        Ref.ObjectRef objectRef;
        NonCancellable nonCancellable;
        AndroidHandleGatewayAdResponse$invoke$5 androidHandleGatewayAdResponse$invoke$5;
        CancellationException cancellationException;
        Throwable cause;
        ByteString byteString3;
        AdResponseOuterClass.AdResponse adResponse3;
        boolean z3;
        Object invoke;
        boolean z4;
        Ref.ObjectRef objectRef2;
        ByteString byteString4;
        AdResponseOuterClass.AdResponse adResponse4;
        String str2;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType2;
        UnityAdsLoadOptions unityAdsLoadOptions2;
        String errorText;
        ErrorOuterClass.PublicErrorCode errorCode;
        CoroutineScope plus;
        AdObject adObject;
        Object obj2;
        String str3;
        Object obj3;
        String str4;
        AdObject adObject2;
        WebViewConfiguration webViewConfiguration;
        boolean z5;
        boolean z6;
        long j;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType3;
        String str5;
        CoroutineScope coroutineScope;
        TimedValue timedValue;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType4;
        AdObject adObject3;
        UnityAdsLoadOptions unityAdsLoadOptions3;
        Ref.ObjectRef objectRef3;
        boolean z7;
        boolean z8;
        boolean booleanValue;
        Object obj4;
        boolean z9;
        boolean z10;
        String str6;
        AdResponseOuterClass.AdResponse adResponse5;
        WebViewConfiguration webViewConfiguration2;
        boolean z11;
        boolean z12;
        boolean z13;
        String str7;
        UnityAdsLoadOptions unityAdsLoadOptions4;
        boolean z14;
        AdObject adObject4;
        boolean z15;
        CoroutineScope coroutineScope2;
        WebViewConfiguration webViewConfiguration3;
        Ref.ObjectRef objectRef4;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType5;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType;
        ByteString byteString5;
        String str8;
        Object obj5;
        String encodeToString;
        long m9541markNowz9LOYto;
        CoroutineScope coroutineScope3;
        AdObject adObject5;
        int i;
        Throwable th;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType6;
        WebViewConfiguration webViewConfiguration4;
        String str9;
        CoroutineScope coroutineScope4;
        AdObject adObject6;
        UnityAdsLoadOptions unityAdsLoadOptions5;
        String str10;
        AdObject adObject7;
        AdResponseOuterClass.AdResponse adResponse6;
        WebViewConfiguration webViewConfiguration5;
        int i2;
        Object m8079constructorimpl;
        boolean z16;
        int i3;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType7;
        WebViewConfiguration webViewConfiguration6;
        AdObject adObject8;
        Ref.ObjectRef objectRef5;
        String str11;
        UnityAdsLoadOptions unityAdsLoadOptions6;
        String str12;
        long j2;
        CoroutineScope coroutineScope5;
        String str13;
        String str14;
        WebViewConfiguration webViewConfiguration7;
        Ref.ObjectRef objectRef6;
        String str15;
        CoroutineScope coroutineScope6;
        UnityAdsLoadOptions unityAdsLoadOptions7;
        AndroidWebViewContainer androidWebViewContainer;
        AdObject copy;
        long m9541markNowz9LOYto2;
        CoroutineScope coroutineScope7;
        Object loadUrl;
        AdObject adObject9;
        Ref.ObjectRef objectRef7;
        ByteString byteString6;
        UnityAdsLoadOptions unityAdsLoadOptions8;
        int i4;
        String str16;
        AdResponseOuterClass.AdResponse adResponse7;
        WebViewConfiguration webViewConfiguration8;
        long j3;
        long j4;
        Ref.ObjectRef objectRef8;
        String str17;
        UnityAdsLoadOptions unityAdsLoadOptions9;
        LoadEvent loadEvent;
        WebViewConfiguration webViewConfiguration9;
        int i5;
        Object single;
        AdObject adObject10;
        UnityAdsLoadOptions unityAdsLoadOptions10;
        String str18;
        JSONObject data;
        ByteString byteString7;
        if (continuation instanceof AndroidHandleGatewayAdResponse$invoke$1) {
            androidHandleGatewayAdResponse$invoke$1 = (AndroidHandleGatewayAdResponse$invoke$1) continuation;
            if ((androidHandleGatewayAdResponse$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidHandleGatewayAdResponse$invoke$1.label -= Integer.MIN_VALUE;
                Object obj6 = androidHandleGatewayAdResponse$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (androidHandleGatewayAdResponse$invoke$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj6);
                        Ref.ObjectRef objectRef9 = new Ref.ObjectRef();
                        try {
                            try {
                                if (adResponse.hasError()) {
                                    ErrorOuterClass.PublicErrorCode errorCode2 = adResponse.getError().getErrorCode();
                                    Intrinsics.checkNotNullExpressionValue(errorCode2, "getErrorCode(...)");
                                    ErrorOuterClass.Error error = adResponse.getError();
                                    if (error == null || (errorCode = error.getErrorCode()) == null || (errorText = UnityAdsErrorKt.getLoadErrorMsg(errorCode)) == null) {
                                        errorText = adResponse.getError().getErrorText();
                                    }
                                    String str19 = errorText;
                                    String errorText2 = adResponse.getError().getErrorText();
                                    ErrorOuterClass.Error error2 = adResponse.getError();
                                    Intrinsics.checkNotNullExpressionValue(error2, "getError(...)");
                                    return new LoadResult.Failure(errorCode2, str19, null, "gateway", errorText2, ErrorExtensionsKt.getErrorTokenOrNull(error2), 4, null);
                                }
                                if (adResponse.getAdData().isEmpty()) {
                                    return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NO_FILL, UnityAdsErrorKt.MSG_BOLD_LOAD_FAIL_NO_FILL, null, "no_fill", null, null, 52, null);
                                }
                                GetLatestWebViewConfiguration getLatestWebViewConfiguration = this.getLatestWebViewConfiguration;
                                String entryPoint = adResponse.getWebviewConfiguration().getEntryPoint();
                                Integer boxInt = Boxing.boxInt(adResponse.getWebviewConfiguration().getVersion());
                                List<String> additionalFilesList = adResponse.getWebviewConfiguration().getAdditionalFilesList();
                                String type = adResponse.getWebviewConfiguration().getType();
                                androidHandleGatewayAdResponse$invoke$1.L$0 = unityAdsLoadOptions;
                                byteString3 = byteString;
                                try {
                                    androidHandleGatewayAdResponse$invoke$1.L$1 = byteString3;
                                    adResponse3 = adResponse;
                                    try {
                                        androidHandleGatewayAdResponse$invoke$1.L$2 = adResponse3;
                                        androidHandleGatewayAdResponse$invoke$1.L$3 = str;
                                        androidHandleGatewayAdResponse$invoke$1.L$4 = diagnosticAdType;
                                        androidHandleGatewayAdResponse$invoke$1.L$5 = objectRef9;
                                        androidHandleGatewayAdResponse$invoke$1.Z$0 = z;
                                        z3 = z2;
                                        androidHandleGatewayAdResponse$invoke$1.Z$1 = z3;
                                        androidHandleGatewayAdResponse$invoke$1.label = 1;
                                        invoke = getLatestWebViewConfiguration.invoke(entryPoint, boxInt, additionalFilesList, type, androidHandleGatewayAdResponse$invoke$1);
                                        if (invoke == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        z4 = z;
                                        objectRef2 = objectRef9;
                                        byteString4 = byteString3;
                                        adResponse4 = adResponse3;
                                        str2 = str;
                                        diagnosticAdType2 = diagnosticAdType;
                                        unityAdsLoadOptions2 = unityAdsLoadOptions;
                                        try {
                                            WebViewConfiguration webViewConfiguration10 = (WebViewConfiguration) invoke;
                                            plus = CoroutineScopeKt.plus(this.adPlayerScope, new CoroutineOpportunity(byteString4));
                                            if (!z3) {
                                                adObject = this.adRepository.getAd(byteString4);
                                                if (adObject == null) {
                                                    return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "webviewless_ad_not_found", null, null, 52, null);
                                                }
                                            } else {
                                                ByteString trackingToken = adResponse4.getTrackingToken();
                                                Intrinsics.checkNotNullExpressionValue(trackingToken, "getTrackingToken(...)");
                                                adObject = new AdObject(plus, byteString4, str2, trackingToken, false, null, null, null, unityAdsLoadOptions2, z4, diagnosticAdType2, null, null, null, null, null, null, 129264, null);
                                            }
                                            if (this.sessionRepository.getNativeConfiguration().getFeatureFlags().getUseOptimisticWebviewCache()) {
                                                boolean z17 = z3;
                                                str3 = "?platform=android&mode=ad-viewer&webviewType=";
                                                obj3 = coroutine_suspended;
                                                str5 = str2;
                                                coroutineScope = plus;
                                                timedValue = null;
                                                diagnosticAdType4 = diagnosticAdType2;
                                                adObject3 = adObject;
                                                webViewConfiguration = webViewConfiguration10;
                                                unityAdsLoadOptions3 = unityAdsLoadOptions2;
                                                objectRef3 = objectRef2;
                                                z7 = z4;
                                                z8 = z17;
                                                if (timedValue != null) {
                                                }
                                                if (timedValue != null) {
                                                }
                                                if (!booleanValue) {
                                                }
                                            } else {
                                                try {
                                                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_STARTED, (Double) null, (Map) null, (Map) null, adObject, (Integer) null, (ByteString) null, 110, (Object) null);
                                                } catch (CancellationException e) {
                                                    e = e;
                                                    obj2 = coroutine_suspended;
                                                }
                                                try {
                                                    long m9541markNowz9LOYto3 = TimeSource.Monotonic.INSTANCE.m9541markNowz9LOYto();
                                                    str3 = "?platform=android&mode=ad-viewer&webviewType=";
                                                    CacheWebViewAssets cacheWebViewAssets = this.cacheWebViewAssets;
                                                    androidHandleGatewayAdResponse$invoke$1.L$0 = unityAdsLoadOptions2;
                                                    androidHandleGatewayAdResponse$invoke$1.L$1 = byteString4;
                                                    androidHandleGatewayAdResponse$invoke$1.L$2 = adResponse4;
                                                    androidHandleGatewayAdResponse$invoke$1.L$3 = str2;
                                                    androidHandleGatewayAdResponse$invoke$1.L$4 = diagnosticAdType2;
                                                    androidHandleGatewayAdResponse$invoke$1.L$5 = objectRef2;
                                                    androidHandleGatewayAdResponse$invoke$1.L$6 = webViewConfiguration10;
                                                    androidHandleGatewayAdResponse$invoke$1.L$7 = plus;
                                                    androidHandleGatewayAdResponse$invoke$1.L$8 = adObject;
                                                    androidHandleGatewayAdResponse$invoke$1.Z$0 = z4;
                                                    androidHandleGatewayAdResponse$invoke$1.Z$1 = z3;
                                                    androidHandleGatewayAdResponse$invoke$1.J$0 = m9541markNowz9LOYto3;
                                                    boolean z18 = z3;
                                                    androidHandleGatewayAdResponse$invoke$1.label = 2;
                                                    obj6 = cacheWebViewAssets.warmFromDisk(webViewConfiguration10, androidHandleGatewayAdResponse$invoke$1);
                                                    obj3 = coroutine_suspended;
                                                    if (obj6 == obj3) {
                                                        return obj3;
                                                    }
                                                    str4 = str2;
                                                    adObject2 = adObject;
                                                    webViewConfiguration = webViewConfiguration10;
                                                    Ref.ObjectRef objectRef10 = objectRef2;
                                                    z5 = z18;
                                                    DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType8 = diagnosticAdType2;
                                                    z6 = z4;
                                                    j = m9541markNowz9LOYto3;
                                                    objectRef = objectRef10;
                                                    diagnosticAdType3 = diagnosticAdType8;
                                                    try {
                                                        boolean z19 = z5;
                                                        boolean z20 = z6;
                                                        TimedValue timedValue2 = new TimedValue(Boxing.boxBoolean(((Boolean) obj6).booleanValue()), TimeSource.Monotonic.ValueTimeMark.m9546elapsedNowUwyO8pc(j), null);
                                                        z8 = z19;
                                                        adObject3 = adObject2;
                                                        unityAdsLoadOptions3 = unityAdsLoadOptions2;
                                                        coroutineScope = plus;
                                                        objectRef3 = objectRef;
                                                        diagnosticAdType4 = diagnosticAdType3;
                                                        str5 = str4;
                                                        timedValue = timedValue2;
                                                        z7 = z20;
                                                        if (timedValue != null) {
                                                            try {
                                                                booleanValue = ((Boolean) timedValue.getValue()).booleanValue();
                                                            } catch (CancellationException e2) {
                                                                e = e2;
                                                                obj = obj3;
                                                                adResponse2 = adResponse4;
                                                                byteString2 = byteString4;
                                                                objectRef = objectRef3;
                                                                nonCancellable = NonCancellable.INSTANCE;
                                                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, objectRef, null);
                                                                androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                                androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                                if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                                }
                                                            }
                                                        } else {
                                                            booleanValue = false;
                                                        }
                                                        if (timedValue != null) {
                                                            obj4 = obj3;
                                                            try {
                                                                SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
                                                                if (booleanValue) {
                                                                    diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_SUCCESS_TIME;
                                                                } else {
                                                                    diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_FAILURE_TIME;
                                                                }
                                                                z9 = z8;
                                                                z10 = z7;
                                                                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, Boxing.boxDouble(Duration.m9462toDoubleimpl(timedValue.m9563getDurationUwyO8pc(), DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject3, (Integer) null, (ByteString) null, 108, (Object) null);
                                                            } catch (CancellationException e3) {
                                                                e = e3;
                                                                adResponse2 = adResponse4;
                                                                byteString2 = byteString4;
                                                                objectRef = objectRef3;
                                                                obj = obj4;
                                                                nonCancellable = NonCancellable.INSTANCE;
                                                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, objectRef, null);
                                                                androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                                androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                                if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                                }
                                                            }
                                                        } else {
                                                            obj4 = obj3;
                                                            z9 = z8;
                                                            z10 = z7;
                                                        }
                                                        if (!booleanValue) {
                                                            try {
                                                                CacheWebViewAssets cacheWebViewAssets2 = this.cacheWebViewAssets;
                                                                androidHandleGatewayAdResponse$invoke$1.L$0 = unityAdsLoadOptions3;
                                                                androidHandleGatewayAdResponse$invoke$1.L$1 = byteString4;
                                                                androidHandleGatewayAdResponse$invoke$1.L$2 = adResponse4;
                                                                androidHandleGatewayAdResponse$invoke$1.L$3 = str5;
                                                                androidHandleGatewayAdResponse$invoke$1.L$4 = diagnosticAdType4;
                                                                androidHandleGatewayAdResponse$invoke$1.L$5 = objectRef3;
                                                                androidHandleGatewayAdResponse$invoke$1.L$6 = webViewConfiguration;
                                                                androidHandleGatewayAdResponse$invoke$1.L$7 = coroutineScope;
                                                                androidHandleGatewayAdResponse$invoke$1.L$8 = adObject3;
                                                                boolean z21 = z10;
                                                                androidHandleGatewayAdResponse$invoke$1.Z$0 = z21;
                                                                boolean z22 = z9;
                                                                androidHandleGatewayAdResponse$invoke$1.Z$1 = z22;
                                                                androidHandleGatewayAdResponse$invoke$1.I$0 = booleanValue ? 1 : 0;
                                                                androidHandleGatewayAdResponse$invoke$1.label = 3;
                                                                coroutine_suspended = obj4;
                                                                if (CacheWebViewAssets.DefaultImpls.invoke$default(cacheWebViewAssets2, webViewConfiguration, false, androidHandleGatewayAdResponse$invoke$1, 2, null) == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                                WebViewConfiguration webViewConfiguration11 = webViewConfiguration;
                                                                str6 = str5;
                                                                adResponse5 = adResponse4;
                                                                webViewConfiguration2 = webViewConfiguration11;
                                                                z11 = z21;
                                                                z12 = z22;
                                                                byteString2 = byteString4;
                                                                str7 = str6;
                                                                objectRef4 = objectRef3;
                                                                diagnosticAdType5 = diagnosticAdType4;
                                                                z15 = z11;
                                                                z13 = z12;
                                                                coroutineScope2 = coroutineScope;
                                                                webViewConfiguration3 = webViewConfiguration2;
                                                                adObject4 = adObject3;
                                                                unityAdsLoadOptions4 = unityAdsLoadOptions3;
                                                                z14 = booleanValue;
                                                                adResponse2 = adResponse5;
                                                                try {
                                                                    if (webViewConfiguration3.getEntryPoint().length() == 0) {
                                                                        try {
                                                                            return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "no_webview_entry_point", null, null, 52, null);
                                                                        } catch (CancellationException e4) {
                                                                            e = e4;
                                                                            obj = coroutine_suspended;
                                                                            objectRef = objectRef4;
                                                                            nonCancellable = NonCancellable.INSTANCE;
                                                                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, objectRef, null);
                                                                            androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                            androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                                            if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                                            }
                                                                        }
                                                                    } else {
                                                                        String configUrl = SdkProperties.getConfigUrl();
                                                                        Intrinsics.checkNotNull(configUrl);
                                                                        ?? r18 = z14;
                                                                        AdObject adObject11 = adObject4;
                                                                        boolean z23 = z15;
                                                                        Object obj7 = coroutine_suspended;
                                                                        try {
                                                                            if (!StringsKt.endsWith$default(configUrl, ".html", false, 2, (Object) null)) {
                                                                                configUrl = null;
                                                                            }
                                                                            if (configUrl == null) {
                                                                                try {
                                                                                    configUrl = webViewConfiguration3.getEntryPoint();
                                                                                } catch (CancellationException e5) {
                                                                                    e = e5;
                                                                                    objectRef = objectRef4;
                                                                                    obj = obj7;
                                                                                    nonCancellable = NonCancellable.INSTANCE;
                                                                                    androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, objectRef, null);
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                                                    if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            try {
                                                                                URI uri = new URI(configUrl);
                                                                                StringBuilder append = new StringBuilder(str3).append(webViewConfiguration3.getType()).append(Typography.amp);
                                                                                String query = uri.getQuery();
                                                                                if (query == null) {
                                                                                    query = "";
                                                                                }
                                                                                WebViewConfiguration webViewConfiguration12 = webViewConfiguration3;
                                                                                str8 = StringsKt.substringBeforeLast$default(configUrl, "?", (String) null, 2, (Object) null) + append.append(query).toString();
                                                                                if (!z13) {
                                                                                    try {
                                                                                        if (diagnosticAdType5 != DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER && adResponse2.hasCampaignMetadata() && adResponse2.getCampaignMetadata().getAssetsToCacheCount() > 0) {
                                                                                            WebViewLessLoadStrategy webViewLessLoadStrategy = this.webViewLessLoadStrategy;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$0 = byteString2;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$1 = adResponse2;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$2 = objectRef4;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.label = 4;
                                                                                            objectRef = objectRef4;
                                                                                            try {
                                                                                                obj6 = webViewLessLoadStrategy.invoke(coroutineScope2, str8, unityAdsLoadOptions4, byteString2, adResponse2, str7, diagnosticAdType5, z23, androidHandleGatewayAdResponse$invoke$1);
                                                                                                return obj6 == obj7 ? obj7 : obj6;
                                                                                            } catch (CancellationException e6) {
                                                                                                e = e6;
                                                                                                obj5 = obj7;
                                                                                                obj = obj5;
                                                                                                nonCancellable = NonCancellable.INSTANCE;
                                                                                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, objectRef, null);
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                                                                if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } catch (CancellationException e7) {
                                                                                        e = e7;
                                                                                        objectRef = objectRef4;
                                                                                    }
                                                                                }
                                                                                objectRef = objectRef4;
                                                                                obj5 = obj7;
                                                                                try {
                                                                                    encodeToString = Base64.encodeToString(adResponse2.getImpressionConfiguration().toByteArray(), 2);
                                                                                    m9541markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m9541markNowz9LOYto();
                                                                                    try {
                                                                                        Result.Companion companion = Result.INSTANCE;
                                                                                        AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = this;
                                                                                        AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase = this.getWebViewContainerUseCase;
                                                                                        try {
                                                                                            AdPlayerScope adPlayerScope = this.adPlayerScope;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$0 = unityAdsLoadOptions4;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$1 = byteString2;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$2 = adResponse2;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$3 = str7;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$4 = diagnosticAdType5;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$5 = objectRef;
                                                                                            byteString5 = byteString2;
                                                                                            try {
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$6 = webViewConfiguration12;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$7 = coroutineScope2;
                                                                                                webViewConfiguration12 = webViewConfiguration12;
                                                                                                adObject5 = adObject11;
                                                                                                try {
                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$8 = adObject5;
                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$9 = str8;
                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$10 = encodeToString;
                                                                                                    androidHandleGatewayAdResponse$invoke$1.Z$0 = z13;
                                                                                                    coroutineScope3 = coroutineScope2;
                                                                                                    try {
                                                                                                        androidHandleGatewayAdResponse$invoke$1.I$0 = r18;
                                                                                                        androidHandleGatewayAdResponse$invoke$1.J$0 = m9541markNowz9LOYto;
                                                                                                        r18 = r18;
                                                                                                        try {
                                                                                                            androidHandleGatewayAdResponse$invoke$1.label = 5;
                                                                                                            obj6 = androidGetWebViewContainerUseCase.invoke(adPlayerScope, adObject5, androidHandleGatewayAdResponse$invoke$1);
                                                                                                            obj5 = obj5;
                                                                                                        } catch (Throwable th2) {
                                                                                                            th = th2;
                                                                                                            obj5 = obj5;
                                                                                                            i = r18;
                                                                                                            th = th;
                                                                                                            diagnosticAdType6 = diagnosticAdType5;
                                                                                                            webViewConfiguration4 = webViewConfiguration12;
                                                                                                            str9 = str7;
                                                                                                            coroutineScope4 = coroutineScope3;
                                                                                                            adObject6 = adObject5;
                                                                                                            unityAdsLoadOptions5 = unityAdsLoadOptions4;
                                                                                                            str10 = encodeToString;
                                                                                                            i2 = i;
                                                                                                            try {
                                                                                                                Result.Companion companion2 = Result.INSTANCE;
                                                                                                                m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
                                                                                                                z16 = z13;
                                                                                                                i3 = i2;
                                                                                                                diagnosticAdType7 = diagnosticAdType6;
                                                                                                                String str20 = str8;
                                                                                                                webViewConfiguration6 = webViewConfiguration4;
                                                                                                                adObject8 = adObject6;
                                                                                                                objectRef5 = objectRef;
                                                                                                                str11 = str20;
                                                                                                                long j5 = m9541markNowz9LOYto;
                                                                                                                unityAdsLoadOptions6 = unityAdsLoadOptions5;
                                                                                                                str12 = str10;
                                                                                                                j2 = j5;
                                                                                                                byteString2 = byteString5;
                                                                                                                String str21 = str9;
                                                                                                                coroutineScope5 = coroutineScope4;
                                                                                                                str13 = str21;
                                                                                                            } catch (CancellationException e8) {
                                                                                                                e = e8;
                                                                                                                obj = obj5;
                                                                                                                byteString2 = byteString5;
                                                                                                                nonCancellable = NonCancellable.INSTANCE;
                                                                                                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, objectRef, null);
                                                                                                                androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                                                                                androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                                                                androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                                                                androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                                                                androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                                                                androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                                                                androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                                                                androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                                                                androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                                                androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                                                androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                                                androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                                                                                if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                str14 = str11;
                                                                                                                webViewConfiguration7 = webViewConfiguration6;
                                                                                                                TimedValue timedValue3 = new TimedValue(Result.m8078boximpl(m8079constructorimpl), TimeSource.Monotonic.ValueTimeMark.m9546elapsedNowUwyO8pc(j2), null);
                                                                                                                objectRef6 = objectRef5;
                                                                                                                str15 = str13;
                                                                                                                coroutineScope6 = coroutineScope5;
                                                                                                                String str22 = str12;
                                                                                                                unityAdsLoadOptions7 = unityAdsLoadOptions6;
                                                                                                                try {
                                                                                                                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, !Result.m8086isSuccessimpl(((Result) timedValue3.component1()).getValue()) ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_FAILURE_TIME, Boxing.boxDouble(Duration.m9462toDoubleimpl(timedValue3.getDuration(), DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject8, (Integer) null, (ByteString) null, 108, (Object) null);
                                                                                                                    Object value = ((Result) timedValue3.getValue()).getValue();
                                                                                                                    ResultKt.throwOnFailure(value);
                                                                                                                    androidWebViewContainer = (AndroidWebViewContainer) value;
                                                                                                                    WebViewBridge invoke2 = this.getWebViewBridge.invoke(androidWebViewContainer, this.adPlayerScope);
                                                                                                                    objectRef = objectRef6;
                                                                                                                } catch (CancellationException e9) {
                                                                                                                    e = e9;
                                                                                                                    obj = obj5;
                                                                                                                    objectRef = objectRef6;
                                                                                                                    nonCancellable = NonCancellable.INSTANCE;
                                                                                                                    androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, objectRef, null);
                                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                                                    androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                                                                                    if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    objectRef.element = this.getAdPlayer.invoke(invoke2, androidWebViewContainer, adObject8, diagnosticAdType7);
                                                                                                                    copy = r17.copy((r35 & 1) != 0 ? r17.adScope : adObject8.getAdScope(), (r35 & 2) != 0 ? r17.opportunityId : null, (r35 & 4) != 0 ? r17.placementId : null, (r35 & 8) != 0 ? r17.trackingToken : null, (r35 & 16) != 0 ? r17.isOfferwallAd : false, (r35 & 32) != 0 ? r17.offerwallPlacementName : null, (r35 & 64) != 0 ? r17.adPlayer : (AdPlayer) objectRef.element, (r35 & 128) != 0 ? r17.playerServerId : null, (r35 & 256) != 0 ? r17.loadOptions : null, (r35 & 512) != 0 ? r17.isHeaderBidding : false, (r35 & 1024) != 0 ? r17.adType : null, (r35 & 2048) != 0 ? r17.ttl : null, (r35 & 4096) != 0 ? r17.state : null, (r35 & 8192) != 0 ? r17.loadConfiguration : null, (r35 & 16384) != 0 ? r17.showConfiguration : null, (r35 & 32768) != 0 ? r17.activity : null, (r35 & 65536) != 0 ? adObject8.webViewLessLoadingRequiredData : adObject8.getWebViewLessLoadingRequiredData());
                                                                                                                    FlowKt.launchIn(FlowKt.onEach(this.deviceInfoRepository.getAllowedPii(), new AndroidHandleGatewayAdResponse$invoke$2(objectRef, null)), ((AdPlayer) objectRef.element).getScope());
                                                                                                                    m9541markNowz9LOYto2 = TimeSource.Monotonic.INSTANCE.m9541markNowz9LOYto();
                                                                                                                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, copy, (Integer) null, (ByteString) null, 110, (Object) null);
                                                                                                                    HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.getHandleInvocationsFromAdViewer;
                                                                                                                    ByteString adData = adResponse2.getAdData();
                                                                                                                    Intrinsics.checkNotNullExpressionValue(adData, "getAdData(...)");
                                                                                                                    obj4 = obj5;
                                                                                                                    try {
                                                                                                                        String base64$default = ProtobufExtensionsKt.toBase64$default(adData, false, 1, null);
                                                                                                                        Intrinsics.checkNotNull(str22);
                                                                                                                        ByteString adDataRefreshToken = adResponse2.getAdDataRefreshToken();
                                                                                                                        Intrinsics.checkNotNullExpressionValue(adDataRefreshToken, "getAdDataRefreshToken(...)");
                                                                                                                        invoke2.setExposedFunctions(handleInvocationsFromAdViewer.invoke(base64$default, ProtobufExtensionsKt.toBase64$default(adDataRefreshToken, false, 1, null), str22, copy));
                                                                                                                        if (!z16) {
                                                                                                                        }
                                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$0 = unityAdsLoadOptions7;
                                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$1 = byteString2;
                                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$2 = adResponse2;
                                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$3 = str15;
                                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$4 = objectRef;
                                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$5 = webViewConfiguration7;
                                                                                                                        coroutineScope7 = coroutineScope6;
                                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$6 = coroutineScope7;
                                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$7 = copy;
                                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                                                        int i6 = i3;
                                                                                                                        androidHandleGatewayAdResponse$invoke$1.I$0 = i6;
                                                                                                                        androidHandleGatewayAdResponse$invoke$1.J$0 = m9541markNowz9LOYto2;
                                                                                                                        androidHandleGatewayAdResponse$invoke$1.label = 6;
                                                                                                                        loadUrl = loadUrl(adObject8, str14, androidWebViewContainer, androidHandleGatewayAdResponse$invoke$1);
                                                                                                                        obj = obj4;
                                                                                                                        if (loadUrl != obj) {
                                                                                                                        }
                                                                                                                    } catch (CancellationException e10) {
                                                                                                                        e = e10;
                                                                                                                        obj = obj4;
                                                                                                                        nonCancellable = NonCancellable.INSTANCE;
                                                                                                                        androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, objectRef, null);
                                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                                                        androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                                                                                        if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                                                                                        }
                                                                                                                    }
                                                                                                                } catch (CancellationException e11) {
                                                                                                                    e = e11;
                                                                                                                    obj = obj5;
                                                                                                                    nonCancellable = NonCancellable.INSTANCE;
                                                                                                                    androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, objectRef, null);
                                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                                                    androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                                                                                    if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                                                                                    }
                                                                                                                }
                                                                                                            } catch (CancellationException e12) {
                                                                                                                e = e12;
                                                                                                                obj = obj5;
                                                                                                                objectRef = objectRef5;
                                                                                                                nonCancellable = NonCancellable.INSTANCE;
                                                                                                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, objectRef, null);
                                                                                                                androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                                                                                androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                                                                androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                                                                androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                                                                androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                                                                androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                                                                androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                                                                androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                                                                androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                                                androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                                                androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                                                androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                                                                                if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (Throwable th3) {
                                                                                                        th = th3;
                                                                                                        r18 = r18;
                                                                                                    }
                                                                                                } catch (Throwable th4) {
                                                                                                    th = th4;
                                                                                                    coroutineScope3 = coroutineScope2;
                                                                                                }
                                                                                            } catch (Throwable th5) {
                                                                                                th = th5;
                                                                                                webViewConfiguration12 = webViewConfiguration12;
                                                                                                coroutineScope3 = coroutineScope2;
                                                                                                adObject5 = adObject11;
                                                                                                obj5 = obj5;
                                                                                                i = r18;
                                                                                                th = th;
                                                                                                diagnosticAdType6 = diagnosticAdType5;
                                                                                                webViewConfiguration4 = webViewConfiguration12;
                                                                                                str9 = str7;
                                                                                                coroutineScope4 = coroutineScope3;
                                                                                                adObject6 = adObject5;
                                                                                                unityAdsLoadOptions5 = unityAdsLoadOptions4;
                                                                                                str10 = encodeToString;
                                                                                                i2 = i;
                                                                                                Result.Companion companion22 = Result.INSTANCE;
                                                                                                m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
                                                                                                z16 = z13;
                                                                                                i3 = i2;
                                                                                                diagnosticAdType7 = diagnosticAdType6;
                                                                                                String str202 = str8;
                                                                                                webViewConfiguration6 = webViewConfiguration4;
                                                                                                adObject8 = adObject6;
                                                                                                objectRef5 = objectRef;
                                                                                                str11 = str202;
                                                                                                long j52 = m9541markNowz9LOYto;
                                                                                                unityAdsLoadOptions6 = unityAdsLoadOptions5;
                                                                                                str12 = str10;
                                                                                                j2 = j52;
                                                                                                byteString2 = byteString5;
                                                                                                String str212 = str9;
                                                                                                coroutineScope5 = coroutineScope4;
                                                                                                str13 = str212;
                                                                                                str14 = str11;
                                                                                                webViewConfiguration7 = webViewConfiguration6;
                                                                                                TimedValue timedValue32 = new TimedValue(Result.m8078boximpl(m8079constructorimpl), TimeSource.Monotonic.ValueTimeMark.m9546elapsedNowUwyO8pc(j2), null);
                                                                                                objectRef6 = objectRef5;
                                                                                                str15 = str13;
                                                                                                coroutineScope6 = coroutineScope5;
                                                                                                String str222 = str12;
                                                                                                unityAdsLoadOptions7 = unityAdsLoadOptions6;
                                                                                                SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, !Result.m8086isSuccessimpl(((Result) timedValue32.component1()).getValue()) ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_FAILURE_TIME, Boxing.boxDouble(Duration.m9462toDoubleimpl(timedValue32.getDuration(), DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject8, (Integer) null, (ByteString) null, 108, (Object) null);
                                                                                                Object value2 = ((Result) timedValue32.getValue()).getValue();
                                                                                                ResultKt.throwOnFailure(value2);
                                                                                                androidWebViewContainer = (AndroidWebViewContainer) value2;
                                                                                                WebViewBridge invoke22 = this.getWebViewBridge.invoke(androidWebViewContainer, this.adPlayerScope);
                                                                                                objectRef = objectRef6;
                                                                                                objectRef.element = this.getAdPlayer.invoke(invoke22, androidWebViewContainer, adObject8, diagnosticAdType7);
                                                                                                copy = r17.copy((r35 & 1) != 0 ? r17.adScope : adObject8.getAdScope(), (r35 & 2) != 0 ? r17.opportunityId : null, (r35 & 4) != 0 ? r17.placementId : null, (r35 & 8) != 0 ? r17.trackingToken : null, (r35 & 16) != 0 ? r17.isOfferwallAd : false, (r35 & 32) != 0 ? r17.offerwallPlacementName : null, (r35 & 64) != 0 ? r17.adPlayer : (AdPlayer) objectRef.element, (r35 & 128) != 0 ? r17.playerServerId : null, (r35 & 256) != 0 ? r17.loadOptions : null, (r35 & 512) != 0 ? r17.isHeaderBidding : false, (r35 & 1024) != 0 ? r17.adType : null, (r35 & 2048) != 0 ? r17.ttl : null, (r35 & 4096) != 0 ? r17.state : null, (r35 & 8192) != 0 ? r17.loadConfiguration : null, (r35 & 16384) != 0 ? r17.showConfiguration : null, (r35 & 32768) != 0 ? r17.activity : null, (r35 & 65536) != 0 ? adObject8.webViewLessLoadingRequiredData : adObject8.getWebViewLessLoadingRequiredData());
                                                                                                FlowKt.launchIn(FlowKt.onEach(this.deviceInfoRepository.getAllowedPii(), new AndroidHandleGatewayAdResponse$invoke$2(objectRef, null)), ((AdPlayer) objectRef.element).getScope());
                                                                                                m9541markNowz9LOYto2 = TimeSource.Monotonic.INSTANCE.m9541markNowz9LOYto();
                                                                                                SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, copy, (Integer) null, (ByteString) null, 110, (Object) null);
                                                                                                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer2 = this.getHandleInvocationsFromAdViewer;
                                                                                                ByteString adData2 = adResponse2.getAdData();
                                                                                                Intrinsics.checkNotNullExpressionValue(adData2, "getAdData(...)");
                                                                                                obj4 = obj5;
                                                                                                String base64$default2 = ProtobufExtensionsKt.toBase64$default(adData2, false, 1, null);
                                                                                                Intrinsics.checkNotNull(str222);
                                                                                                ByteString adDataRefreshToken2 = adResponse2.getAdDataRefreshToken();
                                                                                                Intrinsics.checkNotNullExpressionValue(adDataRefreshToken2, "getAdDataRefreshToken(...)");
                                                                                                invoke22.setExposedFunctions(handleInvocationsFromAdViewer2.invoke(base64$default2, ProtobufExtensionsKt.toBase64$default(adDataRefreshToken2, false, 1, null), str222, copy));
                                                                                                if (!z16) {
                                                                                                }
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$0 = unityAdsLoadOptions7;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$1 = byteString2;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$2 = adResponse2;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$3 = str15;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$4 = objectRef;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$5 = webViewConfiguration7;
                                                                                                coroutineScope7 = coroutineScope6;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$6 = coroutineScope7;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$7 = copy;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                                int i62 = i3;
                                                                                                androidHandleGatewayAdResponse$invoke$1.I$0 = i62;
                                                                                                androidHandleGatewayAdResponse$invoke$1.J$0 = m9541markNowz9LOYto2;
                                                                                                androidHandleGatewayAdResponse$invoke$1.label = 6;
                                                                                                loadUrl = loadUrl(adObject8, str14, androidWebViewContainer, androidHandleGatewayAdResponse$invoke$1);
                                                                                                obj = obj4;
                                                                                                if (loadUrl != obj) {
                                                                                                }
                                                                                            }
                                                                                        } catch (Throwable th6) {
                                                                                            th = th6;
                                                                                            byteString5 = byteString2;
                                                                                        }
                                                                                    } catch (Throwable th7) {
                                                                                        th = th7;
                                                                                        byteString5 = byteString2;
                                                                                        coroutineScope3 = coroutineScope2;
                                                                                        adObject5 = adObject11;
                                                                                        i = r18;
                                                                                    }
                                                                                    if (obj6 == obj5) {
                                                                                        return obj5;
                                                                                    }
                                                                                    adObject7 = adObject5;
                                                                                    diagnosticAdType6 = diagnosticAdType5;
                                                                                    adResponse6 = adResponse2;
                                                                                    webViewConfiguration5 = webViewConfiguration12;
                                                                                    str9 = str7;
                                                                                    coroutineScope4 = coroutineScope3;
                                                                                    i5 = r18;
                                                                                    try {
                                                                                        z16 = z13;
                                                                                        i3 = i5;
                                                                                        diagnosticAdType7 = diagnosticAdType6;
                                                                                        AdObject adObject12 = adObject7;
                                                                                        m8079constructorimpl = Result.m8079constructorimpl((AndroidWebViewContainer) obj6);
                                                                                        adObject8 = adObject12;
                                                                                        WebViewConfiguration webViewConfiguration13 = webViewConfiguration5;
                                                                                        adResponse2 = adResponse6;
                                                                                        byteString2 = byteString5;
                                                                                        long j6 = m9541markNowz9LOYto;
                                                                                        unityAdsLoadOptions6 = unityAdsLoadOptions4;
                                                                                        str12 = encodeToString;
                                                                                        j2 = j6;
                                                                                        objectRef5 = objectRef;
                                                                                        str11 = str8;
                                                                                        webViewConfiguration6 = webViewConfiguration13;
                                                                                        String str23 = str9;
                                                                                        coroutineScope5 = coroutineScope4;
                                                                                        str13 = str23;
                                                                                    } catch (Throwable th8) {
                                                                                        AdObject adObject13 = adObject7;
                                                                                        th = th8;
                                                                                        webViewConfiguration4 = webViewConfiguration5;
                                                                                        adResponse2 = adResponse6;
                                                                                        unityAdsLoadOptions5 = unityAdsLoadOptions4;
                                                                                        str10 = encodeToString;
                                                                                        adObject6 = adObject13;
                                                                                        i2 = i5;
                                                                                        Result.Companion companion222 = Result.INSTANCE;
                                                                                        m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
                                                                                        z16 = z13;
                                                                                        i3 = i2;
                                                                                        diagnosticAdType7 = diagnosticAdType6;
                                                                                        String str2022 = str8;
                                                                                        webViewConfiguration6 = webViewConfiguration4;
                                                                                        adObject8 = adObject6;
                                                                                        objectRef5 = objectRef;
                                                                                        str11 = str2022;
                                                                                        long j522 = m9541markNowz9LOYto;
                                                                                        unityAdsLoadOptions6 = unityAdsLoadOptions5;
                                                                                        str12 = str10;
                                                                                        j2 = j522;
                                                                                        byteString2 = byteString5;
                                                                                        String str2122 = str9;
                                                                                        coroutineScope5 = coroutineScope4;
                                                                                        str13 = str2122;
                                                                                        str14 = str11;
                                                                                        webViewConfiguration7 = webViewConfiguration6;
                                                                                        TimedValue timedValue322 = new TimedValue(Result.m8078boximpl(m8079constructorimpl), TimeSource.Monotonic.ValueTimeMark.m9546elapsedNowUwyO8pc(j2), null);
                                                                                        objectRef6 = objectRef5;
                                                                                        str15 = str13;
                                                                                        coroutineScope6 = coroutineScope5;
                                                                                        String str2222 = str12;
                                                                                        unityAdsLoadOptions7 = unityAdsLoadOptions6;
                                                                                        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, !Result.m8086isSuccessimpl(((Result) timedValue322.component1()).getValue()) ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_FAILURE_TIME, Boxing.boxDouble(Duration.m9462toDoubleimpl(timedValue322.getDuration(), DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject8, (Integer) null, (ByteString) null, 108, (Object) null);
                                                                                        Object value22 = ((Result) timedValue322.getValue()).getValue();
                                                                                        ResultKt.throwOnFailure(value22);
                                                                                        androidWebViewContainer = (AndroidWebViewContainer) value22;
                                                                                        WebViewBridge invoke222 = this.getWebViewBridge.invoke(androidWebViewContainer, this.adPlayerScope);
                                                                                        objectRef = objectRef6;
                                                                                        objectRef.element = this.getAdPlayer.invoke(invoke222, androidWebViewContainer, adObject8, diagnosticAdType7);
                                                                                        copy = r17.copy((r35 & 1) != 0 ? r17.adScope : adObject8.getAdScope(), (r35 & 2) != 0 ? r17.opportunityId : null, (r35 & 4) != 0 ? r17.placementId : null, (r35 & 8) != 0 ? r17.trackingToken : null, (r35 & 16) != 0 ? r17.isOfferwallAd : false, (r35 & 32) != 0 ? r17.offerwallPlacementName : null, (r35 & 64) != 0 ? r17.adPlayer : (AdPlayer) objectRef.element, (r35 & 128) != 0 ? r17.playerServerId : null, (r35 & 256) != 0 ? r17.loadOptions : null, (r35 & 512) != 0 ? r17.isHeaderBidding : false, (r35 & 1024) != 0 ? r17.adType : null, (r35 & 2048) != 0 ? r17.ttl : null, (r35 & 4096) != 0 ? r17.state : null, (r35 & 8192) != 0 ? r17.loadConfiguration : null, (r35 & 16384) != 0 ? r17.showConfiguration : null, (r35 & 32768) != 0 ? r17.activity : null, (r35 & 65536) != 0 ? adObject8.webViewLessLoadingRequiredData : adObject8.getWebViewLessLoadingRequiredData());
                                                                                        FlowKt.launchIn(FlowKt.onEach(this.deviceInfoRepository.getAllowedPii(), new AndroidHandleGatewayAdResponse$invoke$2(objectRef, null)), ((AdPlayer) objectRef.element).getScope());
                                                                                        m9541markNowz9LOYto2 = TimeSource.Monotonic.INSTANCE.m9541markNowz9LOYto();
                                                                                        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, copy, (Integer) null, (ByteString) null, 110, (Object) null);
                                                                                        HandleInvocationsFromAdViewer handleInvocationsFromAdViewer22 = this.getHandleInvocationsFromAdViewer;
                                                                                        ByteString adData22 = adResponse2.getAdData();
                                                                                        Intrinsics.checkNotNullExpressionValue(adData22, "getAdData(...)");
                                                                                        obj4 = obj5;
                                                                                        String base64$default22 = ProtobufExtensionsKt.toBase64$default(adData22, false, 1, null);
                                                                                        Intrinsics.checkNotNull(str2222);
                                                                                        ByteString adDataRefreshToken22 = adResponse2.getAdDataRefreshToken();
                                                                                        Intrinsics.checkNotNullExpressionValue(adDataRefreshToken22, "getAdDataRefreshToken(...)");
                                                                                        invoke222.setExposedFunctions(handleInvocationsFromAdViewer22.invoke(base64$default22, ProtobufExtensionsKt.toBase64$default(adDataRefreshToken22, false, 1, null), str2222, copy));
                                                                                        if (!z16) {
                                                                                        }
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$0 = unityAdsLoadOptions7;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$1 = byteString2;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$2 = adResponse2;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$3 = str15;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$4 = objectRef;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$5 = webViewConfiguration7;
                                                                                        coroutineScope7 = coroutineScope6;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$6 = coroutineScope7;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$7 = copy;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                        int i622 = i3;
                                                                                        androidHandleGatewayAdResponse$invoke$1.I$0 = i622;
                                                                                        androidHandleGatewayAdResponse$invoke$1.J$0 = m9541markNowz9LOYto2;
                                                                                        androidHandleGatewayAdResponse$invoke$1.label = 6;
                                                                                        loadUrl = loadUrl(adObject8, str14, androidWebViewContainer, androidHandleGatewayAdResponse$invoke$1);
                                                                                        obj = obj4;
                                                                                        if (loadUrl != obj) {
                                                                                        }
                                                                                    }
                                                                                    str14 = str11;
                                                                                    webViewConfiguration7 = webViewConfiguration6;
                                                                                    TimedValue timedValue3222 = new TimedValue(Result.m8078boximpl(m8079constructorimpl), TimeSource.Monotonic.ValueTimeMark.m9546elapsedNowUwyO8pc(j2), null);
                                                                                    objectRef6 = objectRef5;
                                                                                    str15 = str13;
                                                                                    coroutineScope6 = coroutineScope5;
                                                                                    String str22222 = str12;
                                                                                    unityAdsLoadOptions7 = unityAdsLoadOptions6;
                                                                                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, !Result.m8086isSuccessimpl(((Result) timedValue3222.component1()).getValue()) ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_FAILURE_TIME, Boxing.boxDouble(Duration.m9462toDoubleimpl(timedValue3222.getDuration(), DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject8, (Integer) null, (ByteString) null, 108, (Object) null);
                                                                                    Object value222 = ((Result) timedValue3222.getValue()).getValue();
                                                                                    ResultKt.throwOnFailure(value222);
                                                                                    androidWebViewContainer = (AndroidWebViewContainer) value222;
                                                                                    WebViewBridge invoke2222 = this.getWebViewBridge.invoke(androidWebViewContainer, this.adPlayerScope);
                                                                                    objectRef = objectRef6;
                                                                                    objectRef.element = this.getAdPlayer.invoke(invoke2222, androidWebViewContainer, adObject8, diagnosticAdType7);
                                                                                    copy = r17.copy((r35 & 1) != 0 ? r17.adScope : adObject8.getAdScope(), (r35 & 2) != 0 ? r17.opportunityId : null, (r35 & 4) != 0 ? r17.placementId : null, (r35 & 8) != 0 ? r17.trackingToken : null, (r35 & 16) != 0 ? r17.isOfferwallAd : false, (r35 & 32) != 0 ? r17.offerwallPlacementName : null, (r35 & 64) != 0 ? r17.adPlayer : (AdPlayer) objectRef.element, (r35 & 128) != 0 ? r17.playerServerId : null, (r35 & 256) != 0 ? r17.loadOptions : null, (r35 & 512) != 0 ? r17.isHeaderBidding : false, (r35 & 1024) != 0 ? r17.adType : null, (r35 & 2048) != 0 ? r17.ttl : null, (r35 & 4096) != 0 ? r17.state : null, (r35 & 8192) != 0 ? r17.loadConfiguration : null, (r35 & 16384) != 0 ? r17.showConfiguration : null, (r35 & 32768) != 0 ? r17.activity : null, (r35 & 65536) != 0 ? adObject8.webViewLessLoadingRequiredData : adObject8.getWebViewLessLoadingRequiredData());
                                                                                    FlowKt.launchIn(FlowKt.onEach(this.deviceInfoRepository.getAllowedPii(), new AndroidHandleGatewayAdResponse$invoke$2(objectRef, null)), ((AdPlayer) objectRef.element).getScope());
                                                                                    m9541markNowz9LOYto2 = TimeSource.Monotonic.INSTANCE.m9541markNowz9LOYto();
                                                                                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, copy, (Integer) null, (ByteString) null, 110, (Object) null);
                                                                                    HandleInvocationsFromAdViewer handleInvocationsFromAdViewer222 = this.getHandleInvocationsFromAdViewer;
                                                                                    ByteString adData222 = adResponse2.getAdData();
                                                                                    Intrinsics.checkNotNullExpressionValue(adData222, "getAdData(...)");
                                                                                    obj4 = obj5;
                                                                                    String base64$default222 = ProtobufExtensionsKt.toBase64$default(adData222, false, 1, null);
                                                                                    Intrinsics.checkNotNull(str22222);
                                                                                    ByteString adDataRefreshToken222 = adResponse2.getAdDataRefreshToken();
                                                                                    Intrinsics.checkNotNullExpressionValue(adDataRefreshToken222, "getAdDataRefreshToken(...)");
                                                                                    invoke2222.setExposedFunctions(handleInvocationsFromAdViewer222.invoke(base64$default222, ProtobufExtensionsKt.toBase64$default(adDataRefreshToken222, false, 1, null), str22222, copy));
                                                                                    if (!z16 && this.sessionRepository.getNativeConfiguration().getFeatureFlags().getWebviewLessLoadParallelActivityLaunch()) {
                                                                                        BuildersKt__Builders_commonKt.launch$default(this.adPlayerScope, null, null, new AndroidHandleGatewayAdResponse$invoke$loadEvent$1(this, adObject8, str14, androidWebViewContainer, null), 3, null);
                                                                                        j4 = m9541markNowz9LOYto2;
                                                                                        byteString6 = byteString2;
                                                                                        objectRef8 = objectRef;
                                                                                        adResponse7 = adResponse2;
                                                                                        obj = obj4;
                                                                                        str17 = str15;
                                                                                        unityAdsLoadOptions9 = unityAdsLoadOptions7;
                                                                                        loadEvent = LoadEvent.Completed.INSTANCE;
                                                                                        webViewConfiguration9 = webViewConfiguration7;
                                                                                        if (loadEvent instanceof LoadEvent.Error) {
                                                                                        }
                                                                                    } else {
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$0 = unityAdsLoadOptions7;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$1 = byteString2;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$2 = adResponse2;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$3 = str15;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$4 = objectRef;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$5 = webViewConfiguration7;
                                                                                        coroutineScope7 = coroutineScope6;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$6 = coroutineScope7;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$7 = copy;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                        androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                        int i6222 = i3;
                                                                                        androidHandleGatewayAdResponse$invoke$1.I$0 = i6222;
                                                                                        androidHandleGatewayAdResponse$invoke$1.J$0 = m9541markNowz9LOYto2;
                                                                                        androidHandleGatewayAdResponse$invoke$1.label = 6;
                                                                                        loadUrl = loadUrl(adObject8, str14, androidWebViewContainer, androidHandleGatewayAdResponse$invoke$1);
                                                                                        obj = obj4;
                                                                                        if (loadUrl != obj) {
                                                                                            return obj;
                                                                                        }
                                                                                        adObject9 = copy;
                                                                                        objectRef7 = objectRef;
                                                                                        byteString6 = byteString2;
                                                                                        unityAdsLoadOptions8 = unityAdsLoadOptions7;
                                                                                        i4 = i6222;
                                                                                        str16 = str15;
                                                                                        adResponse7 = adResponse2;
                                                                                        webViewConfiguration8 = webViewConfiguration7;
                                                                                        j3 = m9541markNowz9LOYto2;
                                                                                        try {
                                                                                            Flow<LoadEvent> onLoadEvent = ((AdPlayer) objectRef7.element).getOnLoadEvent();
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$0 = unityAdsLoadOptions8;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$1 = byteString6;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$2 = adResponse7;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$3 = str16;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$4 = objectRef7;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$5 = webViewConfiguration8;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$6 = coroutineScope7;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$7 = adObject9;
                                                                                            androidHandleGatewayAdResponse$invoke$1.I$0 = i4;
                                                                                            androidHandleGatewayAdResponse$invoke$1.J$0 = j3;
                                                                                            androidHandleGatewayAdResponse$invoke$1.label = 7;
                                                                                            single = FlowKt.single(onLoadEvent, androidHandleGatewayAdResponse$invoke$1);
                                                                                            if (single != obj) {
                                                                                                return obj;
                                                                                            }
                                                                                            String str24 = str16;
                                                                                            adObject10 = adObject9;
                                                                                            obj6 = single;
                                                                                            unityAdsLoadOptions10 = unityAdsLoadOptions8;
                                                                                            str18 = str24;
                                                                                            i3 = i4;
                                                                                            coroutineScope6 = coroutineScope7;
                                                                                            str17 = str18;
                                                                                            unityAdsLoadOptions9 = unityAdsLoadOptions10;
                                                                                            loadEvent = (LoadEvent) obj6;
                                                                                            webViewConfiguration9 = webViewConfiguration8;
                                                                                            copy = adObject10;
                                                                                            objectRef8 = objectRef7;
                                                                                            j4 = j3;
                                                                                            try {
                                                                                                if (loadEvent instanceof LoadEvent.Error) {
                                                                                                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CREATE_AD_OBJECT_FAILURE_TIME, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m9542boximpl(j4))), (Map) null, (Map) null, copy, (Integer) null, (ByteString) null, 108, (Object) null);
                                                                                                    NonCancellable nonCancellable2 = NonCancellable.INSTANCE;
                                                                                                    AndroidHandleGatewayAdResponse$invoke$3 androidHandleGatewayAdResponse$invoke$3 = new AndroidHandleGatewayAdResponse$invoke$3(this, loadEvent, byteString6, adResponse7, objectRef8, null);
                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$0 = byteString6;
                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$1 = adResponse7;
                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$2 = objectRef8;
                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$3 = loadEvent;
                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$1.label = 8;
                                                                                                    if (BuildersKt.withContext(nonCancellable2, androidHandleGatewayAdResponse$invoke$3, androidHandleGatewayAdResponse$invoke$1) == obj) {
                                                                                                        return obj;
                                                                                                    }
                                                                                                    byteString7 = byteString6;
                                                                                                    try {
                                                                                                        return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((LoadEvent.Error) loadEvent).getMessage(), null, 36, null);
                                                                                                    } catch (CancellationException e13) {
                                                                                                        e = e13;
                                                                                                        objectRef = objectRef8;
                                                                                                        byteString2 = byteString7;
                                                                                                        adResponse2 = adResponse7;
                                                                                                        nonCancellable = NonCancellable.INSTANCE;
                                                                                                        androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, objectRef, null);
                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                                        androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                                        androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                                                                        if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CREATE_AD_OBJECT_SUCCESS_TIME, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m9542boximpl(j4))), (Map) null, (Map) null, copy, (Integer) null, (ByteString) null, 108, (Object) null);
                                                                                                    if (i3 != 0) {
                                                                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope6, null, null, new AndroidHandleGatewayAdResponse$invoke$4(this, webViewConfiguration9, null), 3, null);
                                                                                                    }
                                                                                                    this.campaignRepository.setLoadTimestamp(byteString6);
                                                                                                    this.adRepository.addAd(byteString6, copy);
                                                                                                    String objectId = unityAdsLoadOptions9.getObjectId();
                                                                                                    if ((objectId == null || StringsKt.isBlank(objectId)) && (data = unityAdsLoadOptions9.getData()) != null && !data.has("adMarkup")) {
                                                                                                        this.adRepository.enqueueOpportunityForPlacement(str17, byteString6);
                                                                                                    }
                                                                                                    return new LoadResult.Success(copy);
                                                                                                }
                                                                                            } catch (CancellationException e14) {
                                                                                                e = e14;
                                                                                                objectRef = objectRef8;
                                                                                                adResponse2 = adResponse7;
                                                                                                byteString2 = byteString6;
                                                                                                nonCancellable = NonCancellable.INSTANCE;
                                                                                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, objectRef, null);
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                                                                if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                                                                }
                                                                                            }
                                                                                        } catch (CancellationException e15) {
                                                                                            e = e15;
                                                                                            objectRef = objectRef7;
                                                                                            adResponse2 = adResponse7;
                                                                                            byteString2 = byteString6;
                                                                                            nonCancellable = NonCancellable.INSTANCE;
                                                                                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, objectRef, null);
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                            androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                                                            if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } catch (CancellationException e16) {
                                                                                    e = e16;
                                                                                    obj = obj5;
                                                                                    nonCancellable = NonCancellable.INSTANCE;
                                                                                    androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, objectRef, null);
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                                                    if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                                                    }
                                                                                }
                                                                            } catch (Throwable unused) {
                                                                                byteString5 = byteString2;
                                                                                objectRef = objectRef4;
                                                                                obj = obj7;
                                                                                try {
                                                                                    return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "invalid_url", configUrl, null, 36, null);
                                                                                } catch (CancellationException e17) {
                                                                                    e = e17;
                                                                                    byteString2 = byteString5;
                                                                                    nonCancellable = NonCancellable.INSTANCE;
                                                                                    androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, objectRef, null);
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                                                    if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        } catch (CancellationException e18) {
                                                                            e = e18;
                                                                        }
                                                                    }
                                                                } catch (CancellationException e19) {
                                                                    e = e19;
                                                                }
                                                            } catch (CancellationException e20) {
                                                                e = e20;
                                                                coroutine_suspended = obj4;
                                                                adResponse2 = adResponse4;
                                                                byteString2 = byteString4;
                                                                obj = coroutine_suspended;
                                                                objectRef = objectRef3;
                                                                nonCancellable = NonCancellable.INSTANCE;
                                                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, objectRef, null);
                                                                androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                                androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                                androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                                if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                                    return obj;
                                                                }
                                                                cancellationException = e;
                                                                cause = cancellationException.getCause();
                                                                if (cause != null) {
                                                                }
                                                            }
                                                        } else {
                                                            coroutine_suspended = obj4;
                                                            z13 = z9;
                                                            byteString2 = byteString4;
                                                            str7 = str5;
                                                            AdObject adObject14 = adObject3;
                                                            unityAdsLoadOptions4 = unityAdsLoadOptions3;
                                                            z14 = booleanValue ? 1 : 0;
                                                            adResponse2 = adResponse4;
                                                            adObject4 = adObject14;
                                                            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType9 = diagnosticAdType4;
                                                            z15 = z10;
                                                            coroutineScope2 = coroutineScope;
                                                            webViewConfiguration3 = webViewConfiguration;
                                                            objectRef4 = objectRef3;
                                                            diagnosticAdType5 = diagnosticAdType9;
                                                            if (webViewConfiguration3.getEntryPoint().length() == 0) {
                                                            }
                                                        }
                                                    } catch (CancellationException e21) {
                                                        e = e21;
                                                        obj = obj3;
                                                        adResponse2 = adResponse4;
                                                        byteString2 = byteString4;
                                                        nonCancellable = NonCancellable.INSTANCE;
                                                        androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, objectRef, null);
                                                        androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                        androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                        androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                        androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                        androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                        androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                        androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                        androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                        androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                        androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                        androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                        androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                        if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                        }
                                                    }
                                                } catch (CancellationException e22) {
                                                    e = e22;
                                                    obj2 = coroutine_suspended;
                                                    obj = obj2;
                                                    objectRef = objectRef2;
                                                    adResponse2 = adResponse4;
                                                    byteString2 = byteString4;
                                                    nonCancellable = NonCancellable.INSTANCE;
                                                    androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, objectRef, null);
                                                    androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                                    androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                                    androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                                    androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                                    androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                                    androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                                    androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                                    androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                                    androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                                    androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                                    androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                                    androidHandleGatewayAdResponse$invoke$1.label = 9;
                                                    if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                                    }
                                                }
                                            }
                                        } catch (CancellationException e23) {
                                            e = e23;
                                            obj = coroutine_suspended;
                                        }
                                    } catch (CancellationException e24) {
                                        e = e24;
                                        obj = coroutine_suspended;
                                        objectRef = objectRef9;
                                        byteString2 = byteString3;
                                        adResponse2 = adResponse3;
                                        nonCancellable = NonCancellable.INSTANCE;
                                        androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, objectRef, null);
                                        androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                        androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                        androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                        androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                        androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                        androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                        androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                        androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                        androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                        androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                        androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                        androidHandleGatewayAdResponse$invoke$1.label = 9;
                                        if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                        }
                                    }
                                } catch (CancellationException e25) {
                                    e = e25;
                                    adResponse3 = adResponse;
                                    obj = coroutine_suspended;
                                    objectRef = objectRef9;
                                    byteString2 = byteString3;
                                    adResponse2 = adResponse3;
                                    nonCancellable = NonCancellable.INSTANCE;
                                    androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, objectRef, null);
                                    androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                    androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                    androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                    androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                    androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                    androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                    androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                    androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                    androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                    androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                    androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                    androidHandleGatewayAdResponse$invoke$1.label = 9;
                                    if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                    }
                                }
                            } catch (CancellationException e26) {
                                e = e26;
                                byteString2 = byteString;
                                adResponse2 = adResponse;
                                obj = coroutine_suspended;
                                objectRef = objectRef9;
                                nonCancellable = NonCancellable.INSTANCE;
                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, objectRef, null);
                                androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                                androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                                androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                                androidHandleGatewayAdResponse$invoke$1.label = 9;
                                if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                                }
                            }
                        } catch (CancellationException e27) {
                            e = e27;
                            byteString3 = byteString;
                        }
                        break;
                    case 1:
                        boolean z24 = androidHandleGatewayAdResponse$invoke$1.Z$1;
                        z4 = androidHandleGatewayAdResponse$invoke$1.Z$0;
                        objectRef2 = (Ref.ObjectRef) androidHandleGatewayAdResponse$invoke$1.L$5;
                        diagnosticAdType2 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) androidHandleGatewayAdResponse$invoke$1.L$4;
                        str2 = (String) androidHandleGatewayAdResponse$invoke$1.L$3;
                        adResponse4 = (AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$1.L$2;
                        byteString4 = (ByteString) androidHandleGatewayAdResponse$invoke$1.L$1;
                        unityAdsLoadOptions2 = (UnityAdsLoadOptions) androidHandleGatewayAdResponse$invoke$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj6);
                            invoke = obj6;
                            z3 = z24;
                            WebViewConfiguration webViewConfiguration102 = (WebViewConfiguration) invoke;
                            plus = CoroutineScopeKt.plus(this.adPlayerScope, new CoroutineOpportunity(byteString4));
                            if (!z3) {
                            }
                            if (this.sessionRepository.getNativeConfiguration().getFeatureFlags().getUseOptimisticWebviewCache()) {
                            }
                        } catch (CancellationException e28) {
                            e = e28;
                            adResponse2 = adResponse4;
                            byteString2 = byteString4;
                            obj = coroutine_suspended;
                            objectRef = objectRef2;
                            nonCancellable = NonCancellable.INSTANCE;
                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, objectRef, null);
                            androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                            androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                            androidHandleGatewayAdResponse$invoke$1.label = 9;
                            if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                            }
                        }
                        break;
                    case 2:
                        long j7 = androidHandleGatewayAdResponse$invoke$1.J$0;
                        z5 = androidHandleGatewayAdResponse$invoke$1.Z$1;
                        z6 = androidHandleGatewayAdResponse$invoke$1.Z$0;
                        adObject2 = (AdObject) androidHandleGatewayAdResponse$invoke$1.L$8;
                        CoroutineScope coroutineScope8 = (CoroutineScope) androidHandleGatewayAdResponse$invoke$1.L$7;
                        WebViewConfiguration webViewConfiguration14 = (WebViewConfiguration) androidHandleGatewayAdResponse$invoke$1.L$6;
                        objectRef3 = (Ref.ObjectRef) androidHandleGatewayAdResponse$invoke$1.L$5;
                        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType10 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) androidHandleGatewayAdResponse$invoke$1.L$4;
                        String str25 = (String) androidHandleGatewayAdResponse$invoke$1.L$3;
                        adResponse2 = (AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$1.L$2;
                        ByteString byteString8 = (ByteString) androidHandleGatewayAdResponse$invoke$1.L$1;
                        UnityAdsLoadOptions unityAdsLoadOptions11 = (UnityAdsLoadOptions) androidHandleGatewayAdResponse$invoke$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj6);
                            str3 = "?platform=android&mode=ad-viewer&webviewType=";
                            str4 = str25;
                            obj3 = coroutine_suspended;
                            webViewConfiguration = webViewConfiguration14;
                            objectRef = objectRef3;
                            byteString4 = byteString8;
                            unityAdsLoadOptions2 = unityAdsLoadOptions11;
                            j = j7;
                            plus = coroutineScope8;
                            adResponse4 = adResponse2;
                            diagnosticAdType3 = diagnosticAdType10;
                            boolean z192 = z5;
                            boolean z202 = z6;
                            TimedValue timedValue22 = new TimedValue(Boxing.boxBoolean(((Boolean) obj6).booleanValue()), TimeSource.Monotonic.ValueTimeMark.m9546elapsedNowUwyO8pc(j), null);
                            z8 = z192;
                            adObject3 = adObject2;
                            unityAdsLoadOptions3 = unityAdsLoadOptions2;
                            coroutineScope = plus;
                            objectRef3 = objectRef;
                            diagnosticAdType4 = diagnosticAdType3;
                            str5 = str4;
                            timedValue = timedValue22;
                            z7 = z202;
                            if (timedValue != null) {
                            }
                            if (timedValue != null) {
                            }
                            if (!booleanValue) {
                            }
                        } catch (CancellationException e29) {
                            e = e29;
                            byteString2 = byteString8;
                            obj = coroutine_suspended;
                            objectRef = objectRef3;
                            nonCancellable = NonCancellable.INSTANCE;
                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, objectRef, null);
                            androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                            androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                            androidHandleGatewayAdResponse$invoke$1.label = 9;
                            if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                            }
                        }
                        break;
                    case 3:
                        ?? r4 = androidHandleGatewayAdResponse$invoke$1.I$0;
                        z12 = androidHandleGatewayAdResponse$invoke$1.Z$1;
                        z11 = androidHandleGatewayAdResponse$invoke$1.Z$0;
                        adObject3 = (AdObject) androidHandleGatewayAdResponse$invoke$1.L$8;
                        coroutineScope = (CoroutineScope) androidHandleGatewayAdResponse$invoke$1.L$7;
                        webViewConfiguration2 = (WebViewConfiguration) androidHandleGatewayAdResponse$invoke$1.L$6;
                        objectRef3 = (Ref.ObjectRef) androidHandleGatewayAdResponse$invoke$1.L$5;
                        diagnosticAdType4 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) androidHandleGatewayAdResponse$invoke$1.L$4;
                        str6 = (String) androidHandleGatewayAdResponse$invoke$1.L$3;
                        adResponse2 = (AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$1.L$2;
                        byteString4 = (ByteString) androidHandleGatewayAdResponse$invoke$1.L$1;
                        unityAdsLoadOptions3 = (UnityAdsLoadOptions) androidHandleGatewayAdResponse$invoke$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj6);
                            str3 = "?platform=android&mode=ad-viewer&webviewType=";
                            adResponse5 = adResponse2;
                            booleanValue = r4;
                            byteString2 = byteString4;
                            str7 = str6;
                            objectRef4 = objectRef3;
                            diagnosticAdType5 = diagnosticAdType4;
                            z15 = z11;
                            z13 = z12;
                            coroutineScope2 = coroutineScope;
                            webViewConfiguration3 = webViewConfiguration2;
                            adObject4 = adObject3;
                            unityAdsLoadOptions4 = unityAdsLoadOptions3;
                            z14 = booleanValue;
                            adResponse2 = adResponse5;
                            if (webViewConfiguration3.getEntryPoint().length() == 0) {
                            }
                        } catch (CancellationException e30) {
                            e = e30;
                            byteString2 = byteString4;
                            obj = coroutine_suspended;
                            objectRef = objectRef3;
                            nonCancellable = NonCancellable.INSTANCE;
                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, objectRef, null);
                            androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                            androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                            androidHandleGatewayAdResponse$invoke$1.label = 9;
                            if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                            }
                        }
                        break;
                    case 4:
                        Ref.ObjectRef objectRef11 = (Ref.ObjectRef) androidHandleGatewayAdResponse$invoke$1.L$2;
                        AdResponseOuterClass.AdResponse adResponse8 = (AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$1.L$1;
                        ByteString byteString9 = (ByteString) androidHandleGatewayAdResponse$invoke$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj6);
                        } catch (CancellationException e31) {
                            e = e31;
                            adResponse2 = adResponse8;
                            objectRef = objectRef11;
                            byteString2 = byteString9;
                            obj = coroutine_suspended;
                            nonCancellable = NonCancellable.INSTANCE;
                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, objectRef, null);
                            androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                            androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                            androidHandleGatewayAdResponse$invoke$1.label = 9;
                            if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                            }
                        }
                        break;
                    case 5:
                        long j8 = androidHandleGatewayAdResponse$invoke$1.J$0;
                        int i7 = androidHandleGatewayAdResponse$invoke$1.I$0;
                        z13 = androidHandleGatewayAdResponse$invoke$1.Z$0;
                        str10 = (String) androidHandleGatewayAdResponse$invoke$1.L$10;
                        str8 = (String) androidHandleGatewayAdResponse$invoke$1.L$9;
                        adObject6 = (AdObject) androidHandleGatewayAdResponse$invoke$1.L$8;
                        coroutineScope4 = (CoroutineScope) androidHandleGatewayAdResponse$invoke$1.L$7;
                        WebViewConfiguration webViewConfiguration15 = (WebViewConfiguration) androidHandleGatewayAdResponse$invoke$1.L$6;
                        Ref.ObjectRef objectRef12 = (Ref.ObjectRef) androidHandleGatewayAdResponse$invoke$1.L$5;
                        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType11 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) androidHandleGatewayAdResponse$invoke$1.L$4;
                        str9 = (String) androidHandleGatewayAdResponse$invoke$1.L$3;
                        AdResponseOuterClass.AdResponse adResponse9 = (AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$1.L$2;
                        ByteString byteString10 = (ByteString) androidHandleGatewayAdResponse$invoke$1.L$1;
                        unityAdsLoadOptions5 = (UnityAdsLoadOptions) androidHandleGatewayAdResponse$invoke$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj6);
                            i5 = i7;
                            byteString5 = byteString10;
                            diagnosticAdType6 = diagnosticAdType11;
                            webViewConfiguration5 = webViewConfiguration15;
                            adResponse6 = adResponse9;
                            unityAdsLoadOptions4 = unityAdsLoadOptions5;
                            encodeToString = str10;
                            adObject7 = adObject6;
                            obj5 = coroutine_suspended;
                            objectRef = objectRef12;
                            m9541markNowz9LOYto = j8;
                            z16 = z13;
                            i3 = i5;
                            diagnosticAdType7 = diagnosticAdType6;
                            AdObject adObject122 = adObject7;
                            m8079constructorimpl = Result.m8079constructorimpl((AndroidWebViewContainer) obj6);
                            adObject8 = adObject122;
                            WebViewConfiguration webViewConfiguration132 = webViewConfiguration5;
                            adResponse2 = adResponse6;
                            byteString2 = byteString5;
                            long j62 = m9541markNowz9LOYto;
                            unityAdsLoadOptions6 = unityAdsLoadOptions4;
                            str12 = encodeToString;
                            j2 = j62;
                            objectRef5 = objectRef;
                            str11 = str8;
                            webViewConfiguration6 = webViewConfiguration132;
                            String str232 = str9;
                            coroutineScope5 = coroutineScope4;
                            str13 = str232;
                        } catch (Throwable th9) {
                            i2 = i7;
                            byteString5 = byteString10;
                            diagnosticAdType6 = diagnosticAdType11;
                            adResponse2 = adResponse9;
                            th = th9;
                            webViewConfiguration4 = webViewConfiguration15;
                            obj5 = coroutine_suspended;
                            objectRef = objectRef12;
                            m9541markNowz9LOYto = j8;
                            Result.Companion companion2222 = Result.INSTANCE;
                            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
                            z16 = z13;
                            i3 = i2;
                            diagnosticAdType7 = diagnosticAdType6;
                            String str20222 = str8;
                            webViewConfiguration6 = webViewConfiguration4;
                            adObject8 = adObject6;
                            objectRef5 = objectRef;
                            str11 = str20222;
                            long j5222 = m9541markNowz9LOYto;
                            unityAdsLoadOptions6 = unityAdsLoadOptions5;
                            str12 = str10;
                            j2 = j5222;
                            byteString2 = byteString5;
                            String str21222 = str9;
                            coroutineScope5 = coroutineScope4;
                            str13 = str21222;
                            str14 = str11;
                            webViewConfiguration7 = webViewConfiguration6;
                            TimedValue timedValue32222 = new TimedValue(Result.m8078boximpl(m8079constructorimpl), TimeSource.Monotonic.ValueTimeMark.m9546elapsedNowUwyO8pc(j2), null);
                            objectRef6 = objectRef5;
                            str15 = str13;
                            coroutineScope6 = coroutineScope5;
                            String str222222 = str12;
                            unityAdsLoadOptions7 = unityAdsLoadOptions6;
                            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, !Result.m8086isSuccessimpl(((Result) timedValue32222.component1()).getValue()) ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_FAILURE_TIME, Boxing.boxDouble(Duration.m9462toDoubleimpl(timedValue32222.getDuration(), DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject8, (Integer) null, (ByteString) null, 108, (Object) null);
                            Object value2222 = ((Result) timedValue32222.getValue()).getValue();
                            ResultKt.throwOnFailure(value2222);
                            androidWebViewContainer = (AndroidWebViewContainer) value2222;
                            WebViewBridge invoke22222 = this.getWebViewBridge.invoke(androidWebViewContainer, this.adPlayerScope);
                            objectRef = objectRef6;
                            objectRef.element = this.getAdPlayer.invoke(invoke22222, androidWebViewContainer, adObject8, diagnosticAdType7);
                            copy = r17.copy((r35 & 1) != 0 ? r17.adScope : adObject8.getAdScope(), (r35 & 2) != 0 ? r17.opportunityId : null, (r35 & 4) != 0 ? r17.placementId : null, (r35 & 8) != 0 ? r17.trackingToken : null, (r35 & 16) != 0 ? r17.isOfferwallAd : false, (r35 & 32) != 0 ? r17.offerwallPlacementName : null, (r35 & 64) != 0 ? r17.adPlayer : (AdPlayer) objectRef.element, (r35 & 128) != 0 ? r17.playerServerId : null, (r35 & 256) != 0 ? r17.loadOptions : null, (r35 & 512) != 0 ? r17.isHeaderBidding : false, (r35 & 1024) != 0 ? r17.adType : null, (r35 & 2048) != 0 ? r17.ttl : null, (r35 & 4096) != 0 ? r17.state : null, (r35 & 8192) != 0 ? r17.loadConfiguration : null, (r35 & 16384) != 0 ? r17.showConfiguration : null, (r35 & 32768) != 0 ? r17.activity : null, (r35 & 65536) != 0 ? adObject8.webViewLessLoadingRequiredData : adObject8.getWebViewLessLoadingRequiredData());
                            FlowKt.launchIn(FlowKt.onEach(this.deviceInfoRepository.getAllowedPii(), new AndroidHandleGatewayAdResponse$invoke$2(objectRef, null)), ((AdPlayer) objectRef.element).getScope());
                            m9541markNowz9LOYto2 = TimeSource.Monotonic.INSTANCE.m9541markNowz9LOYto();
                            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, copy, (Integer) null, (ByteString) null, 110, (Object) null);
                            HandleInvocationsFromAdViewer handleInvocationsFromAdViewer2222 = this.getHandleInvocationsFromAdViewer;
                            ByteString adData2222 = adResponse2.getAdData();
                            Intrinsics.checkNotNullExpressionValue(adData2222, "getAdData(...)");
                            obj4 = obj5;
                            String base64$default2222 = ProtobufExtensionsKt.toBase64$default(adData2222, false, 1, null);
                            Intrinsics.checkNotNull(str222222);
                            ByteString adDataRefreshToken2222 = adResponse2.getAdDataRefreshToken();
                            Intrinsics.checkNotNullExpressionValue(adDataRefreshToken2222, "getAdDataRefreshToken(...)");
                            invoke22222.setExposedFunctions(handleInvocationsFromAdViewer2222.invoke(base64$default2222, ProtobufExtensionsKt.toBase64$default(adDataRefreshToken2222, false, 1, null), str222222, copy));
                            if (!z16) {
                            }
                            androidHandleGatewayAdResponse$invoke$1.L$0 = unityAdsLoadOptions7;
                            androidHandleGatewayAdResponse$invoke$1.L$1 = byteString2;
                            androidHandleGatewayAdResponse$invoke$1.L$2 = adResponse2;
                            androidHandleGatewayAdResponse$invoke$1.L$3 = str15;
                            androidHandleGatewayAdResponse$invoke$1.L$4 = objectRef;
                            androidHandleGatewayAdResponse$invoke$1.L$5 = webViewConfiguration7;
                            coroutineScope7 = coroutineScope6;
                            androidHandleGatewayAdResponse$invoke$1.L$6 = coroutineScope7;
                            androidHandleGatewayAdResponse$invoke$1.L$7 = copy;
                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                            int i62222 = i3;
                            androidHandleGatewayAdResponse$invoke$1.I$0 = i62222;
                            androidHandleGatewayAdResponse$invoke$1.J$0 = m9541markNowz9LOYto2;
                            androidHandleGatewayAdResponse$invoke$1.label = 6;
                            loadUrl = loadUrl(adObject8, str14, androidWebViewContainer, androidHandleGatewayAdResponse$invoke$1);
                            obj = obj4;
                            if (loadUrl != obj) {
                            }
                        }
                        str14 = str11;
                        webViewConfiguration7 = webViewConfiguration6;
                        TimedValue timedValue322222 = new TimedValue(Result.m8078boximpl(m8079constructorimpl), TimeSource.Monotonic.ValueTimeMark.m9546elapsedNowUwyO8pc(j2), null);
                        objectRef6 = objectRef5;
                        str15 = str13;
                        coroutineScope6 = coroutineScope5;
                        String str2222222 = str12;
                        unityAdsLoadOptions7 = unityAdsLoadOptions6;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, !Result.m8086isSuccessimpl(((Result) timedValue322222.component1()).getValue()) ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_FAILURE_TIME, Boxing.boxDouble(Duration.m9462toDoubleimpl(timedValue322222.getDuration(), DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject8, (Integer) null, (ByteString) null, 108, (Object) null);
                        Object value22222 = ((Result) timedValue322222.getValue()).getValue();
                        ResultKt.throwOnFailure(value22222);
                        androidWebViewContainer = (AndroidWebViewContainer) value22222;
                        WebViewBridge invoke222222 = this.getWebViewBridge.invoke(androidWebViewContainer, this.adPlayerScope);
                        objectRef = objectRef6;
                        objectRef.element = this.getAdPlayer.invoke(invoke222222, androidWebViewContainer, adObject8, diagnosticAdType7);
                        copy = r17.copy((r35 & 1) != 0 ? r17.adScope : adObject8.getAdScope(), (r35 & 2) != 0 ? r17.opportunityId : null, (r35 & 4) != 0 ? r17.placementId : null, (r35 & 8) != 0 ? r17.trackingToken : null, (r35 & 16) != 0 ? r17.isOfferwallAd : false, (r35 & 32) != 0 ? r17.offerwallPlacementName : null, (r35 & 64) != 0 ? r17.adPlayer : (AdPlayer) objectRef.element, (r35 & 128) != 0 ? r17.playerServerId : null, (r35 & 256) != 0 ? r17.loadOptions : null, (r35 & 512) != 0 ? r17.isHeaderBidding : false, (r35 & 1024) != 0 ? r17.adType : null, (r35 & 2048) != 0 ? r17.ttl : null, (r35 & 4096) != 0 ? r17.state : null, (r35 & 8192) != 0 ? r17.loadConfiguration : null, (r35 & 16384) != 0 ? r17.showConfiguration : null, (r35 & 32768) != 0 ? r17.activity : null, (r35 & 65536) != 0 ? adObject8.webViewLessLoadingRequiredData : adObject8.getWebViewLessLoadingRequiredData());
                        FlowKt.launchIn(FlowKt.onEach(this.deviceInfoRepository.getAllowedPii(), new AndroidHandleGatewayAdResponse$invoke$2(objectRef, null)), ((AdPlayer) objectRef.element).getScope());
                        m9541markNowz9LOYto2 = TimeSource.Monotonic.INSTANCE.m9541markNowz9LOYto();
                        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, copy, (Integer) null, (ByteString) null, 110, (Object) null);
                        HandleInvocationsFromAdViewer handleInvocationsFromAdViewer22222 = this.getHandleInvocationsFromAdViewer;
                        ByteString adData22222 = adResponse2.getAdData();
                        Intrinsics.checkNotNullExpressionValue(adData22222, "getAdData(...)");
                        obj4 = obj5;
                        String base64$default22222 = ProtobufExtensionsKt.toBase64$default(adData22222, false, 1, null);
                        Intrinsics.checkNotNull(str2222222);
                        ByteString adDataRefreshToken22222 = adResponse2.getAdDataRefreshToken();
                        Intrinsics.checkNotNullExpressionValue(adDataRefreshToken22222, "getAdDataRefreshToken(...)");
                        invoke222222.setExposedFunctions(handleInvocationsFromAdViewer22222.invoke(base64$default22222, ProtobufExtensionsKt.toBase64$default(adDataRefreshToken22222, false, 1, null), str2222222, copy));
                        if (!z16) {
                            break;
                        }
                        androidHandleGatewayAdResponse$invoke$1.L$0 = unityAdsLoadOptions7;
                        androidHandleGatewayAdResponse$invoke$1.L$1 = byteString2;
                        androidHandleGatewayAdResponse$invoke$1.L$2 = adResponse2;
                        androidHandleGatewayAdResponse$invoke$1.L$3 = str15;
                        androidHandleGatewayAdResponse$invoke$1.L$4 = objectRef;
                        androidHandleGatewayAdResponse$invoke$1.L$5 = webViewConfiguration7;
                        coroutineScope7 = coroutineScope6;
                        androidHandleGatewayAdResponse$invoke$1.L$6 = coroutineScope7;
                        androidHandleGatewayAdResponse$invoke$1.L$7 = copy;
                        androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                        androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                        androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                        int i622222 = i3;
                        androidHandleGatewayAdResponse$invoke$1.I$0 = i622222;
                        androidHandleGatewayAdResponse$invoke$1.J$0 = m9541markNowz9LOYto2;
                        androidHandleGatewayAdResponse$invoke$1.label = 6;
                        loadUrl = loadUrl(adObject8, str14, androidWebViewContainer, androidHandleGatewayAdResponse$invoke$1);
                        obj = obj4;
                        if (loadUrl != obj) {
                        }
                        break;
                    case 6:
                        long j9 = androidHandleGatewayAdResponse$invoke$1.J$0;
                        i4 = androidHandleGatewayAdResponse$invoke$1.I$0;
                        AdObject adObject15 = (AdObject) androidHandleGatewayAdResponse$invoke$1.L$7;
                        CoroutineScope coroutineScope9 = (CoroutineScope) androidHandleGatewayAdResponse$invoke$1.L$6;
                        webViewConfiguration8 = (WebViewConfiguration) androidHandleGatewayAdResponse$invoke$1.L$5;
                        objectRef7 = (Ref.ObjectRef) androidHandleGatewayAdResponse$invoke$1.L$4;
                        String str26 = (String) androidHandleGatewayAdResponse$invoke$1.L$3;
                        adResponse7 = (AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$1.L$2;
                        byteString6 = (ByteString) androidHandleGatewayAdResponse$invoke$1.L$1;
                        unityAdsLoadOptions8 = (UnityAdsLoadOptions) androidHandleGatewayAdResponse$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj6);
                        adObject9 = adObject15;
                        coroutineScope7 = coroutineScope9;
                        j3 = j9;
                        str16 = str26;
                        obj = coroutine_suspended;
                        Flow<LoadEvent> onLoadEvent2 = ((AdPlayer) objectRef7.element).getOnLoadEvent();
                        androidHandleGatewayAdResponse$invoke$1.L$0 = unityAdsLoadOptions8;
                        androidHandleGatewayAdResponse$invoke$1.L$1 = byteString6;
                        androidHandleGatewayAdResponse$invoke$1.L$2 = adResponse7;
                        androidHandleGatewayAdResponse$invoke$1.L$3 = str16;
                        androidHandleGatewayAdResponse$invoke$1.L$4 = objectRef7;
                        androidHandleGatewayAdResponse$invoke$1.L$5 = webViewConfiguration8;
                        androidHandleGatewayAdResponse$invoke$1.L$6 = coroutineScope7;
                        androidHandleGatewayAdResponse$invoke$1.L$7 = adObject9;
                        androidHandleGatewayAdResponse$invoke$1.I$0 = i4;
                        androidHandleGatewayAdResponse$invoke$1.J$0 = j3;
                        androidHandleGatewayAdResponse$invoke$1.label = 7;
                        single = FlowKt.single(onLoadEvent2, androidHandleGatewayAdResponse$invoke$1);
                        if (single != obj) {
                        }
                        break;
                    case 7:
                        long j10 = androidHandleGatewayAdResponse$invoke$1.J$0;
                        i4 = androidHandleGatewayAdResponse$invoke$1.I$0;
                        AdObject adObject16 = (AdObject) androidHandleGatewayAdResponse$invoke$1.L$7;
                        CoroutineScope coroutineScope10 = (CoroutineScope) androidHandleGatewayAdResponse$invoke$1.L$6;
                        webViewConfiguration8 = (WebViewConfiguration) androidHandleGatewayAdResponse$invoke$1.L$5;
                        objectRef7 = (Ref.ObjectRef) androidHandleGatewayAdResponse$invoke$1.L$4;
                        String str27 = (String) androidHandleGatewayAdResponse$invoke$1.L$3;
                        adResponse7 = (AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$1.L$2;
                        byteString6 = (ByteString) androidHandleGatewayAdResponse$invoke$1.L$1;
                        UnityAdsLoadOptions unityAdsLoadOptions12 = (UnityAdsLoadOptions) androidHandleGatewayAdResponse$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj6);
                        adObject10 = adObject16;
                        obj = coroutine_suspended;
                        unityAdsLoadOptions10 = unityAdsLoadOptions12;
                        str18 = str27;
                        coroutineScope7 = coroutineScope10;
                        j3 = j10;
                        i3 = i4;
                        coroutineScope6 = coroutineScope7;
                        str17 = str18;
                        unityAdsLoadOptions9 = unityAdsLoadOptions10;
                        loadEvent = (LoadEvent) obj6;
                        webViewConfiguration9 = webViewConfiguration8;
                        copy = adObject10;
                        objectRef8 = objectRef7;
                        j4 = j3;
                        if (loadEvent instanceof LoadEvent.Error) {
                        }
                        break;
                    case 8:
                        loadEvent = (LoadEvent) androidHandleGatewayAdResponse$invoke$1.L$3;
                        objectRef8 = (Ref.ObjectRef) androidHandleGatewayAdResponse$invoke$1.L$2;
                        AdResponseOuterClass.AdResponse adResponse10 = (AdResponseOuterClass.AdResponse) androidHandleGatewayAdResponse$invoke$1.L$1;
                        byteString7 = (ByteString) androidHandleGatewayAdResponse$invoke$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj6);
                            adResponse7 = adResponse10;
                            obj = coroutine_suspended;
                            return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((LoadEvent.Error) loadEvent).getMessage(), null, 36, null);
                        } catch (CancellationException e32) {
                            e = e32;
                            adResponse2 = adResponse10;
                            byteString2 = byteString7;
                            obj = coroutine_suspended;
                            objectRef = objectRef8;
                            nonCancellable = NonCancellable.INSTANCE;
                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(this, e, byteString2, adResponse2, objectRef, null);
                            androidHandleGatewayAdResponse$invoke$1.L$0 = e;
                            androidHandleGatewayAdResponse$invoke$1.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$1.L$10 = null;
                            androidHandleGatewayAdResponse$invoke$1.label = 9;
                            if (BuildersKt.withContext(nonCancellable, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$1) != obj) {
                            }
                        }
                        break;
                    case 9:
                        cancellationException = (CancellationException) androidHandleGatewayAdResponse$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj6);
                        cause = cancellationException.getCause();
                        if (cause != null) {
                            throw cancellationException;
                        }
                        throw cause;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        androidHandleGatewayAdResponse$invoke$1 = new AndroidHandleGatewayAdResponse$invoke$1(this, continuation);
        Object obj62 = androidHandleGatewayAdResponse$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (androidHandleGatewayAdResponse$invoke$1.label) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadUrl(AdObject adObject, String str, WebViewContainer webViewContainer, Continuation<? super Unit> continuation) {
        AndroidHandleGatewayAdResponse$loadUrl$1 androidHandleGatewayAdResponse$loadUrl$1;
        int i;
        AdObject adObject2;
        long j;
        Object m8079constructorimpl;
        if (continuation instanceof AndroidHandleGatewayAdResponse$loadUrl$1) {
            androidHandleGatewayAdResponse$loadUrl$1 = (AndroidHandleGatewayAdResponse$loadUrl$1) continuation;
            if ((androidHandleGatewayAdResponse$loadUrl$1.label & Integer.MIN_VALUE) != 0) {
                androidHandleGatewayAdResponse$loadUrl$1.label -= Integer.MIN_VALUE;
                Object obj = androidHandleGatewayAdResponse$loadUrl$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidHandleGatewayAdResponse$loadUrl$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    long m9541markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m9541markNowz9LOYto();
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = this;
                        androidHandleGatewayAdResponse$loadUrl$1.L$0 = adObject;
                        androidHandleGatewayAdResponse$loadUrl$1.J$0 = m9541markNowz9LOYto;
                        androidHandleGatewayAdResponse$loadUrl$1.label = 1;
                        if (webViewContainer.loadUrl(str, androidHandleGatewayAdResponse$loadUrl$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        adObject2 = adObject;
                        j = m9541markNowz9LOYto;
                    } catch (Throwable th) {
                        th = th;
                        adObject2 = adObject;
                        j = m9541markNowz9LOYto;
                        Result.Companion companion2 = Result.INSTANCE;
                        m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
                        AdObject adObject3 = adObject2;
                        TimedValue timedValue = new TimedValue(Result.m8078boximpl(m8079constructorimpl), TimeSource.Monotonic.ValueTimeMark.m9546elapsedNowUwyO8pc(j), null);
                        Object value = ((Result) timedValue.component1()).getValue();
                        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, !Result.m8086isSuccessimpl(value) ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_FAILURE_TIME, Boxing.boxDouble(Duration.m9462toDoubleimpl(timedValue.getDuration(), DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject3, (Integer) null, (ByteString) null, 108, (Object) null);
                        ResultKt.throwOnFailure(value);
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = androidHandleGatewayAdResponse$loadUrl$1.J$0;
                    adObject2 = (AdObject) androidHandleGatewayAdResponse$loadUrl$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Companion companion22 = Result.INSTANCE;
                        m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
                        AdObject adObject32 = adObject2;
                        TimedValue timedValue2 = new TimedValue(Result.m8078boximpl(m8079constructorimpl), TimeSource.Monotonic.ValueTimeMark.m9546elapsedNowUwyO8pc(j), null);
                        Object value2 = ((Result) timedValue2.component1()).getValue();
                        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, !Result.m8086isSuccessimpl(value2) ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_FAILURE_TIME, Boxing.boxDouble(Duration.m9462toDoubleimpl(timedValue2.getDuration(), DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject32, (Integer) null, (ByteString) null, 108, (Object) null);
                        ResultKt.throwOnFailure(value2);
                        return Unit.INSTANCE;
                    }
                }
                m8079constructorimpl = Result.m8079constructorimpl(Unit.INSTANCE);
                AdObject adObject322 = adObject2;
                TimedValue timedValue22 = new TimedValue(Result.m8078boximpl(m8079constructorimpl), TimeSource.Monotonic.ValueTimeMark.m9546elapsedNowUwyO8pc(j), null);
                Object value22 = ((Result) timedValue22.component1()).getValue();
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, !Result.m8086isSuccessimpl(value22) ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_FAILURE_TIME, Boxing.boxDouble(Duration.m9462toDoubleimpl(timedValue22.getDuration(), DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject322, (Integer) null, (ByteString) null, 108, (Object) null);
                ResultKt.throwOnFailure(value22);
                return Unit.INSTANCE;
            }
        }
        androidHandleGatewayAdResponse$loadUrl$1 = new AndroidHandleGatewayAdResponse$loadUrl$1(this, continuation);
        Object obj2 = androidHandleGatewayAdResponse$loadUrl$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidHandleGatewayAdResponse$loadUrl$1.label;
        if (i != 0) {
        }
        m8079constructorimpl = Result.m8079constructorimpl(Unit.INSTANCE);
        AdObject adObject3222 = adObject2;
        TimedValue timedValue222 = new TimedValue(Result.m8078boximpl(m8079constructorimpl), TimeSource.Monotonic.ValueTimeMark.m9546elapsedNowUwyO8pc(j), null);
        Object value222 = ((Result) timedValue222.component1()).getValue();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, !Result.m8086isSuccessimpl(value222) ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_FAILURE_TIME, Boxing.boxDouble(Duration.m9462toDoubleimpl(timedValue222.getDuration(), DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject3222, (Integer) null, (ByteString) null, 108, (Object) null);
        ResultKt.throwOnFailure(value222);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cleanup(Throwable th, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, AdPlayer adPlayer, Continuation<? super Unit> continuation) {
        AndroidHandleGatewayAdResponse$cleanup$1 androidHandleGatewayAdResponse$cleanup$1;
        int i;
        String message;
        AdPlayer adPlayer2;
        Object invoke;
        if (continuation instanceof AndroidHandleGatewayAdResponse$cleanup$1) {
            androidHandleGatewayAdResponse$cleanup$1 = (AndroidHandleGatewayAdResponse$cleanup$1) continuation;
            if ((androidHandleGatewayAdResponse$cleanup$1.label & Integer.MIN_VALUE) != 0) {
                androidHandleGatewayAdResponse$cleanup$1.label -= Integer.MIN_VALUE;
                Object obj = androidHandleGatewayAdResponse$cleanup$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidHandleGatewayAdResponse$cleanup$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    OperativeEventErrorDataKt.Dsl.Companion companion = OperativeEventErrorDataKt.Dsl.INSTANCE;
                    OperativeEventRequestOuterClass.OperativeEventErrorData.Builder newBuilder = OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
                    Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
                    OperativeEventErrorDataKt.Dsl _create = companion._create(newBuilder);
                    _create.setErrorType(OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED);
                    Throwable cause = th.getCause();
                    if ((cause == null || (message = cause.getMessage()) == null) && (message = th.getMessage()) == null) {
                        message = "";
                    }
                    _create.setMessage(message);
                    OperativeEventRequestOuterClass.OperativeEventErrorData _build = _create._build();
                    GetOperativeEventApi getOperativeEventApi = this.getOperativeEventApi;
                    OperativeEventRequestOuterClass.OperativeEventType operativeEventType = OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_LOAD_ERROR;
                    ByteString trackingToken = adResponse.getTrackingToken();
                    Intrinsics.checkNotNullExpressionValue(trackingToken, "getTrackingToken(...)");
                    ByteString byteString2 = _build.toByteString();
                    Intrinsics.checkNotNullExpressionValue(byteString2, "toByteString(...)");
                    adPlayer2 = adPlayer;
                    androidHandleGatewayAdResponse$cleanup$1.L$0 = adPlayer2;
                    androidHandleGatewayAdResponse$cleanup$1.label = 1;
                    invoke = getOperativeEventApi.invoke(operativeEventType, byteString, trackingToken, byteString2, (r18 & 16) != 0 ? null : null, (r18 & 32) != 0 ? null : null, androidHandleGatewayAdResponse$cleanup$1);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    AdPlayer adPlayer3 = (AdPlayer) androidHandleGatewayAdResponse$cleanup$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    adPlayer2 = adPlayer3;
                }
                if (adPlayer2 != null) {
                    return Unit.INSTANCE;
                }
                androidHandleGatewayAdResponse$cleanup$1.L$0 = null;
                androidHandleGatewayAdResponse$cleanup$1.label = 2;
                if (adPlayer2.destroy(androidHandleGatewayAdResponse$cleanup$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        androidHandleGatewayAdResponse$cleanup$1 = new AndroidHandleGatewayAdResponse$cleanup$1(this, continuation);
        Object obj2 = androidHandleGatewayAdResponse$cleanup$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidHandleGatewayAdResponse$cleanup$1.label;
        if (i != 0) {
        }
        if (adPlayer2 != null) {
        }
    }
}
