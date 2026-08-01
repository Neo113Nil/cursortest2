package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.ironsource.U3;
import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ErrorExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdPlayerConfigResponseOuterClass;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.AdResponseKt;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import gatewayprotocol.v1.WebviewConfiguration;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlin.time.TimeSource;
import kotlin.time.TimedValue;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidLoad.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/LoadResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidLoad$invoke$2", f = "AndroidLoad.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4}, l = {97, 101, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 164}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u249", "adType", "tmpAdObject", U3.w, U3.i.y0, HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "adType", "tmpAdObject", U3.w, U3.i.y0, HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "mark$iv$iv", "$this$invokeSuspend_u24lambda_u249", "adType", "tmpAdObject", U3.w, U3.i.y0, HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "adType", "tmpAdObject", U3.w, U3.i.y0, HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "mark$iv$iv", U3.w, U3.i.y0}, s = {"L$5", "L$6", "L$7", "I$0", "J$0", "I$1", "L$5", "L$6", "I$0", "J$0", "I$1", "J$1", "L$6", "L$7", "L$8", "I$0", "J$0", "I$1", "L$6", "L$7", "I$0", "J$0", "I$1", "J$1", "I$0", "J$0"})
/* loaded from: classes7.dex */
final class AndroidLoad$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LoadResult>, Object> {
    final /* synthetic */ AdRequestOuterClass.BannerSize $bannerSize;
    final /* synthetic */ Context $context;
    final /* synthetic */ HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup $headerBiddingAdMarkup;
    final /* synthetic */ UnityAdsLoadOptions $loadOptions;
    final /* synthetic */ ByteString $opportunityId;
    final /* synthetic */ String $placement;
    int I$0;
    int I$1;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ AndroidLoad this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidLoad$invoke$2(AdRequestOuterClass.BannerSize bannerSize, AndroidLoad androidLoad, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, ByteString byteString, String str, UnityAdsLoadOptions unityAdsLoadOptions, Context context, Continuation<? super AndroidLoad$invoke$2> continuation) {
        super(2, continuation);
        this.$bannerSize = bannerSize;
        this.this$0 = androidLoad;
        this.$headerBiddingAdMarkup = headerBiddingAdMarkup;
        this.$opportunityId = byteString;
        this.$placement = str;
        this.$loadOptions = unityAdsLoadOptions;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AndroidLoad$invoke$2 androidLoad$invoke$2 = new AndroidLoad$invoke$2(this.$bannerSize, this.this$0, this.$headerBiddingAdMarkup, this.$opportunityId, this.$placement, this.$loadOptions, this.$context, continuation);
        androidLoad$invoke$2.L$0 = obj;
        return androidLoad$invoke$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LoadResult> continuation) {
        return ((AndroidLoad$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(4:(1:(1:(1:(1:(4:8|9|10|11)(2:42|43))(12:44|45|46|47|48|49|50|51|(1:53)(1:89)|54|55|(5:57|(1:62)|61|(2:20|(1:22)(2:23|(2:25|(1:27))(2:28|29)))|31)(14:63|(1:65)|66|(1:68)|69|70|71|72|(1:74)(1:86)|75|76|77|78|(1:80)(1:81))))(22:100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|(1:122)(9:123|48|49|50|51|(0)(0)|54|55|(0)(0))))(19:148|149|150|151|152|153|154|155|(1:157)(1:164)|158|159|71|72|(0)(0)|75|76|77|78|(0)(0)))(19:173|174|175|176|177|178|179|180|181|183|184|185|186|187|188|189|190|191|(1:193)(16:194|152|153|154|155|(0)(0)|158|159|71|72|(0)(0)|75|76|77|78|(0)(0)))|39|(0)|31)(7:214|(1:216)(1:289)|217|218|219|220|(3:222|(0)|31)(8:(1:224)(1:284)|225|(2:227|228)(1:282)|(10:261|262|263|264|265|266|267|268|269|(1:271)(16:272|177|178|179|180|181|183|184|185|186|187|188|189|190|191|(0)(0)))(12:230|231|232|(3:253|254|255)(1:234)|235|236|237|238|239|240|241|(1:243)(19:244|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|(0)(0)))|248|39|(0)|31))|12|13|(2:15|(1:17)(1:32))(2:33|(2:35|36))|18|(0)|31|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x06e7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x056d A[Catch: UnityAdsNetworkException -> 0x06f3, TRY_ENTER, TryCatch #5 {UnityAdsNetworkException -> 0x06f3, blocks: (B:51:0x0512, B:54:0x053d, B:57:0x056d, B:59:0x0586, B:61:0x058e, B:63:0x05ba, B:65:0x062d, B:66:0x0637, B:68:0x0644, B:69:0x0655, B:94:0x0506), top: B:93:0x0506 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x05ba A[Catch: UnityAdsNetworkException -> 0x06f3, TryCatch #5 {UnityAdsNetworkException -> 0x06f3, blocks: (B:51:0x0512, B:54:0x053d, B:57:0x056d, B:59:0x0586, B:61:0x058e, B:63:0x05ba, B:65:0x062d, B:66:0x0637, B:68:0x0644, B:69:0x0655, B:94:0x0506), top: B:93:0x0506 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x06a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x053b  */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v15, types: [int] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42, types: [int] */
    /* JADX WARN: Type inference failed for: r3v45, types: [int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49, types: [int] */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v51, types: [int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        long m9541markNowz9LOYto;
        String str;
        int i;
        long j;
        AndroidLoad androidLoad;
        AndroidLoad androidLoad2;
        ?? r3;
        long j2;
        SessionRepository sessionRepository;
        String str2;
        String str3;
        AdObject tmpAdObject;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup;
        Object obj2;
        AndroidLoad androidLoad3;
        GetAdRequest getAdRequest;
        Object obj3;
        boolean z2;
        Object invoke;
        Object obj4;
        UnityAdsLoadOptions unityAdsLoadOptions;
        Context context;
        String str4;
        ByteString byteString;
        int i2;
        AndroidLoad androidLoad4;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType;
        int i3;
        AdObject adObject;
        long j3;
        GetAdPlayerConfigRequest getAdPlayerConfigRequest;
        AdFormatOuterClass.AdFormat adFormat;
        Object obj5;
        Object invoke2;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup2;
        Context context2;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType2;
        String str5;
        ByteString byteString2;
        int i4;
        AdObject adObject2;
        UnityAdsLoadOptions unityAdsLoadOptions2;
        long j4;
        int i5;
        ValidateExtrasSize validateExtrasSize;
        Object obj6;
        long j5;
        GetRequestPolicy getRequestPolicy;
        long j6;
        long m9541markNowz9LOYto2;
        ByteString byteString3;
        String str6;
        UnityAdsLoadOptions unityAdsLoadOptions3;
        Context context3;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType3;
        AdObject adObject3;
        long j7;
        int i6;
        Context context4;
        AdObject adObject4;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType4;
        ByteString byteString4;
        UnityAdsLoadOptions unityAdsLoadOptions4;
        GatewayClient gatewayClient;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType5;
        AdObject adObject5;
        Object obj7;
        Object request$default;
        long j8;
        AndroidLoad androidLoad5;
        Object m8079constructorimpl;
        AdObject adObject6;
        SendDiagnosticEvent sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType6;
        Context context5;
        UnityAdsLoadOptions unityAdsLoadOptions5;
        Object obj8;
        ?? r14;
        String str7;
        long j9;
        AndroidLoad androidLoad6;
        AdResponseOuterClass.AdResponse adResponse;
        ByteString byteString5;
        long j10;
        GetRequestPolicy getRequestPolicy2;
        long j11;
        long m9541markNowz9LOYto3;
        ByteString byteString6;
        String str8;
        UnityAdsLoadOptions unityAdsLoadOptions6;
        Context context6;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType7;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup3;
        AdObject adObject7;
        long j12;
        UnityAdsLoadOptions unityAdsLoadOptions7;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup4;
        ByteString byteString7;
        GatewayClient gatewayClient2;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup5;
        AdObject adObject8;
        Object obj9;
        Object request$default2;
        ?? r4;
        int i7;
        AndroidLoad androidLoad7;
        Object m8079constructorimpl2;
        AdObject adObject9;
        long j13;
        HandleGatewayAdResponse handleGatewayAdResponse;
        Object obj10;
        Object invoke3;
        boolean z3;
        SendDiagnosticEvent sendDiagnosticEvent2;
        UniversalResponseOuterClass.UniversalResponse universalResponse;
        String str9;
        Object handleGatewayException;
        SessionRepository sessionRepository2;
        SessionRepository sessionRepository3;
        boolean isCachePhaseFailure;
        SessionRepository sessionRepository4;
        SessionRepository sessionRepository5;
        Object obj11;
        AdRepository adRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            z = this.$bannerSize != null;
            m9541markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m9541markNowz9LOYto();
            AndroidLoad androidLoad8 = this.this$0;
            HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup6 = this.$headerBiddingAdMarkup;
            ByteString byteString8 = this.$opportunityId;
            String str10 = this.$placement;
            UnityAdsLoadOptions unityAdsLoadOptions8 = this.$loadOptions;
            AdRequestOuterClass.BannerSize bannerSize = this.$bannerSize;
            str = "native_load_config_success_time";
            Context context7 = this.$context;
            try {
                sessionRepository = androidLoad8.sessionRepository;
                try {
                } catch (UnityAdsNetworkException e) {
                    e = e;
                    androidLoad2 = androidLoad8;
                    r3 = z ? 1 : 0;
                    j2 = m9541markNowz9LOYto;
                }
            } catch (UnityAdsNetworkException e2) {
                e = e2;
                i = z ? 1 : 0;
                j = m9541markNowz9LOYto;
                androidLoad = androidLoad8;
            }
            if (!sessionRepository.isSdkInitialized()) {
                obj6 = (LoadResult) new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NOT_INITIALIZED, UnityAdsErrorKt.MSG_BOLD_LOAD_FAIL_SDK_NOT_INITIALIZED, null, "not_initialized", null, null, 52, null);
                if (!z) {
                }
                return obj6;
            }
            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType8 = z ? DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER : DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN;
            boolean isEmpty = headerBiddingAdMarkup6.getAdData().isEmpty();
            str2 = "native_load_config_failure_time";
            int i9 = !isEmpty ? 1 : 0;
            str3 = "getAdData(...)";
            tmpAdObject = androidLoad8.getTmpAdObject(byteString8, str10, !isEmpty, diagnosticAdType8, unityAdsLoadOptions8);
            LoadConfigurationInternal loadConfigurationInternal = unityAdsLoadOptions8.loadConfiguration;
            if (loadConfigurationInternal != null) {
                headerBiddingAdMarkup = headerBiddingAdMarkup6;
                validateExtrasSize = androidLoad8.validateExtrasSize;
                obj2 = coroutine_suspended;
                validateExtrasSize.invoke(loadConfigurationInternal.getExtras(), "load", tmpAdObject);
                Unit unit = Unit.INSTANCE;
            } else {
                headerBiddingAdMarkup = headerBiddingAdMarkup6;
                obj2 = coroutine_suspended;
            }
            if (isEmpty) {
                try {
                    androidLoad8.incrementLoadRequestCount(z);
                    getAdRequest = androidLoad8.getAdRequest;
                    LoadConfigurationInternal loadConfigurationInternal2 = unityAdsLoadOptions8.loadConfiguration;
                    this.L$0 = androidLoad8;
                    this.L$1 = byteString8;
                    this.L$2 = str10;
                    this.L$3 = unityAdsLoadOptions8;
                    this.L$4 = context7;
                    this.L$5 = coroutineScope;
                    this.L$6 = diagnosticAdType8;
                    this.L$7 = tmpAdObject;
                    this.I$0 = z ? 1 : 0;
                    this.J$0 = m9541markNowz9LOYto;
                    this.I$1 = i9;
                    try {
                        this.label = 1;
                        j = m9541markNowz9LOYto;
                        obj3 = null;
                        z2 = true;
                        androidLoad3 = androidLoad8;
                        try {
                            invoke = getAdRequest.invoke(str10, byteString8, bannerSize, loadConfigurationInternal2, this);
                            obj4 = obj2;
                            if (invoke == obj4) {
                                return obj4;
                            }
                            unityAdsLoadOptions = unityAdsLoadOptions8;
                            context = context7;
                            str4 = str10;
                            byteString = byteString8;
                            i2 = i9;
                            androidLoad4 = androidLoad3;
                            diagnosticAdType = diagnosticAdType8;
                            i3 = z ? 1 : 0;
                            adObject = tmpAdObject;
                            j3 = j;
                            UniversalRequestOuterClass.UniversalRequest universalRequest = (UniversalRequestOuterClass.UniversalRequest) invoke;
                            getRequestPolicy = androidLoad4.getRequestPolicy;
                            RequestPolicy invoke4 = getRequestPolicy.invoke();
                            j6 = j3;
                            m9541markNowz9LOYto2 = TimeSource.Monotonic.INSTANCE.m9541markNowz9LOYto();
                            Result.Companion companion = Result.INSTANCE;
                            gatewayClient = androidLoad4.gatewayClient;
                            OperationType operationType = OperationType.LOAD;
                            this.L$0 = androidLoad4;
                            this.L$1 = byteString;
                            this.L$2 = str4;
                            this.L$3 = unityAdsLoadOptions;
                            this.L$4 = context;
                            this.L$5 = diagnosticAdType;
                            this.L$6 = adObject;
                            this.L$7 = obj3;
                            this.I$0 = i3;
                            diagnosticAdType5 = diagnosticAdType;
                            adObject5 = adObject;
                            this.J$0 = j6;
                            this.I$1 = i2;
                            this.J$1 = m9541markNowz9LOYto2;
                            this.label = 2;
                            byteString3 = byteString;
                            str6 = str4;
                            unityAdsLoadOptions3 = unityAdsLoadOptions;
                            context3 = context;
                            obj7 = obj4;
                            j5 = j6;
                            diagnosticAdType3 = diagnosticAdType5;
                            adObject3 = adObject5;
                            request$default = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, invoke4, operationType, this, 1, null);
                            obj4 = obj7;
                            if (request$default != obj4) {
                            }
                        } catch (UnityAdsNetworkException e3) {
                            e = e3;
                            androidLoad2 = androidLoad3;
                            r3 = z ? 1 : 0;
                            j2 = j;
                            handleGatewayException = androidLoad2.handleGatewayException(e);
                            obj6 = (LoadResult) handleGatewayException;
                            m9541markNowz9LOYto = j2;
                            z = r3;
                            if (!z) {
                            }
                            return obj6;
                        }
                    } catch (UnityAdsNetworkException e4) {
                        e = e4;
                        j = m9541markNowz9LOYto;
                        androidLoad3 = androidLoad8;
                    }
                } catch (UnityAdsNetworkException e5) {
                    e = e5;
                    androidLoad3 = androidLoad8;
                    j = m9541markNowz9LOYto;
                }
            } else {
                j = m9541markNowz9LOYto;
                z2 = true;
                androidLoad = androidLoad8;
                Object obj12 = obj2;
                try {
                    androidLoad.incrementLoadRequestAdmCount(z);
                    getAdPlayerConfigRequest = androidLoad.getAdPlayerConfigRequest;
                    ByteString configurationToken = headerBiddingAdMarkup.getConfigurationToken();
                    Intrinsics.checkNotNullExpressionValue(configurationToken, "getConfigurationToken(...)");
                    if (bannerSize != null) {
                        try {
                            adFormat = AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER;
                        } catch (UnityAdsNetworkException e6) {
                            e = e6;
                            r3 = z ? 1 : 0;
                            androidLoad2 = androidLoad;
                        }
                    } else {
                        adFormat = null;
                    }
                    LoadConfigurationInternal loadConfigurationInternal3 = unityAdsLoadOptions8.loadConfiguration;
                    this.L$0 = androidLoad;
                    HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup7 = headerBiddingAdMarkup;
                    this.L$1 = headerBiddingAdMarkup7;
                    this.L$2 = byteString8;
                    this.L$3 = str10;
                    this.L$4 = unityAdsLoadOptions8;
                    this.L$5 = context7;
                    this.L$6 = coroutineScope;
                    this.L$7 = diagnosticAdType8;
                    this.L$8 = tmpAdObject;
                    this.I$0 = z ? 1 : 0;
                    i = z ? 1 : 0;
                    try {
                        this.J$0 = j;
                        this.I$1 = i9;
                        this.label = 3;
                        j = j;
                        obj5 = obj12;
                    } catch (UnityAdsNetworkException e7) {
                        e = e7;
                        j = j;
                    }
                    try {
                        invoke2 = getAdPlayerConfigRequest.invoke(str10, byteString8, configurationToken, adFormat, loadConfigurationInternal3, this);
                        if (invoke2 == obj5) {
                            return obj5;
                        }
                        headerBiddingAdMarkup2 = headerBiddingAdMarkup7;
                        context2 = context7;
                        diagnosticAdType2 = diagnosticAdType8;
                        str5 = str10;
                        byteString2 = byteString8;
                        i4 = i;
                        adObject2 = tmpAdObject;
                        unityAdsLoadOptions2 = unityAdsLoadOptions8;
                        j4 = j;
                        i5 = i9;
                        UniversalRequestOuterClass.UniversalRequest universalRequest2 = (UniversalRequestOuterClass.UniversalRequest) invoke2;
                        getRequestPolicy2 = androidLoad.getRequestPolicy;
                        RequestPolicy invoke5 = getRequestPolicy2.invoke();
                        j11 = j4;
                        m9541markNowz9LOYto3 = TimeSource.Monotonic.INSTANCE.m9541markNowz9LOYto();
                        Result.Companion companion2 = Result.INSTANCE;
                        gatewayClient2 = androidLoad.gatewayClient;
                        OperationType operationType2 = OperationType.LOAD_HEADER_BIDDING;
                        this.L$0 = androidLoad;
                        this.L$1 = headerBiddingAdMarkup2;
                        this.L$2 = byteString2;
                        this.L$3 = str5;
                        this.L$4 = unityAdsLoadOptions2;
                        this.L$5 = context2;
                        this.L$6 = diagnosticAdType2;
                        this.L$7 = adObject2;
                        headerBiddingAdMarkup5 = headerBiddingAdMarkup2;
                        this.L$8 = null;
                        this.I$0 = i4;
                        adObject8 = adObject2;
                        obj9 = obj5;
                        this.J$0 = j11;
                        this.I$1 = i5;
                        this.J$1 = m9541markNowz9LOYto3;
                        this.label = 4;
                        headerBiddingAdMarkup3 = headerBiddingAdMarkup5;
                        byteString6 = byteString2;
                        str8 = str5;
                        unityAdsLoadOptions6 = unityAdsLoadOptions2;
                        context6 = context2;
                        diagnosticAdType7 = diagnosticAdType2;
                        j10 = j11;
                        adObject7 = adObject8;
                        request$default2 = GatewayClient.DefaultImpls.request$default(gatewayClient2, null, universalRequest2, invoke5, operationType2, this, 1, null);
                        obj8 = obj9;
                        if (request$default2 != obj8) {
                        }
                    } catch (UnityAdsNetworkException e8) {
                        e = e8;
                        androidLoad2 = androidLoad;
                        r3 = i;
                        j2 = j;
                        handleGatewayException = androidLoad2.handleGatewayException(e);
                        obj6 = (LoadResult) handleGatewayException;
                        m9541markNowz9LOYto = j2;
                        z = r3;
                        if (!z) {
                        }
                        return obj6;
                    }
                } catch (UnityAdsNetworkException e9) {
                    e = e9;
                    i = z ? 1 : 0;
                }
            }
            j2 = j;
            handleGatewayException = androidLoad2.handleGatewayException(e);
            obj6 = (LoadResult) handleGatewayException;
            m9541markNowz9LOYto = j2;
            z = r3;
            if (!z) {
            }
            return obj6;
        }
        if (i8 == 1) {
            int i10 = this.I$1;
            j2 = this.J$0;
            r3 = this.I$0;
            AdObject adObject10 = (AdObject) this.L$7;
            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType9 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$6;
            Context context8 = (Context) this.L$4;
            UnityAdsLoadOptions unityAdsLoadOptions9 = (UnityAdsLoadOptions) this.L$3;
            String str11 = (String) this.L$2;
            ByteString byteString9 = (ByteString) this.L$1;
            AndroidLoad androidLoad9 = (AndroidLoad) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                diagnosticAdType = diagnosticAdType9;
                context = context8;
                str = "native_load_config_success_time";
                obj4 = coroutine_suspended;
                str2 = "native_load_config_failure_time";
                z2 = true;
                i2 = i10;
                i3 = r3;
                str4 = str11;
                j3 = j2;
                byteString = byteString9;
                androidLoad4 = androidLoad9;
                obj3 = null;
                invoke = obj;
                adObject = adObject10;
                unityAdsLoadOptions = unityAdsLoadOptions9;
                try {
                    UniversalRequestOuterClass.UniversalRequest universalRequest3 = (UniversalRequestOuterClass.UniversalRequest) invoke;
                    getRequestPolicy = androidLoad4.getRequestPolicy;
                    RequestPolicy invoke42 = getRequestPolicy.invoke();
                    j6 = j3;
                } catch (UnityAdsNetworkException e10) {
                    e = e10;
                    j5 = j3;
                }
                try {
                    m9541markNowz9LOYto2 = TimeSource.Monotonic.INSTANCE.m9541markNowz9LOYto();
                    try {
                        Result.Companion companion3 = Result.INSTANCE;
                        gatewayClient = androidLoad4.gatewayClient;
                        OperationType operationType3 = OperationType.LOAD;
                        this.L$0 = androidLoad4;
                        this.L$1 = byteString;
                        this.L$2 = str4;
                        this.L$3 = unityAdsLoadOptions;
                        this.L$4 = context;
                        this.L$5 = diagnosticAdType;
                        this.L$6 = adObject;
                        this.L$7 = obj3;
                        this.I$0 = i3;
                        diagnosticAdType5 = diagnosticAdType;
                        adObject5 = adObject;
                        try {
                            this.J$0 = j6;
                            this.I$1 = i2;
                            this.J$1 = m9541markNowz9LOYto2;
                            this.label = 2;
                            byteString3 = byteString;
                            str6 = str4;
                            unityAdsLoadOptions3 = unityAdsLoadOptions;
                            context3 = context;
                            obj7 = obj4;
                            j5 = j6;
                            diagnosticAdType3 = diagnosticAdType5;
                            adObject3 = adObject5;
                            try {
                                request$default = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest3, invoke42, operationType3, this, 1, null);
                                obj4 = obj7;
                            } catch (Throwable th) {
                                th = th;
                                obj4 = obj7;
                                j7 = m9541markNowz9LOYto2;
                                i6 = i2;
                                androidLoad2 = androidLoad4;
                                context4 = context3;
                                adObject4 = adObject3;
                                diagnosticAdType4 = diagnosticAdType3;
                                byteString4 = byteString3;
                                unityAdsLoadOptions4 = unityAdsLoadOptions3;
                                Result.Companion companion4 = Result.INSTANCE;
                                m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
                                adObject6 = adObject4;
                                TimedValue timedValue = new TimedValue(Result.m8078boximpl(m8079constructorimpl), TimeSource.Monotonic.ValueTimeMark.m9546elapsedNowUwyO8pc(j7), null);
                                Object value = ((Result) timedValue.component1()).getValue();
                                long duration = timedValue.getDuration();
                                sendDiagnosticEvent = androidLoad2.sendDiagnosticEvent;
                                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, Result.m8086isSuccessimpl(value) ? str : str2, Boxing.boxDouble(Duration.m9462toDoubleimpl(duration, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject6, (Integer) null, (ByteString) null, 108, (Object) null);
                                Object value2 = ((Result) timedValue.getValue()).getValue();
                                ResultKt.throwOnFailure(value2);
                                diagnosticAdType6 = diagnosticAdType4;
                                context5 = context4;
                                unityAdsLoadOptions5 = unityAdsLoadOptions4;
                                obj8 = obj4;
                                r14 = i3;
                                str7 = str6;
                                j9 = j5;
                                androidLoad6 = androidLoad2;
                                adResponse = ((UniversalResponseOuterClass.UniversalResponse) value2).getPayload().getAdResponse();
                                byteString5 = byteString4;
                                handleGatewayAdResponse = androidLoad6.handleGatewayAdResponse;
                                Intrinsics.checkNotNull(adResponse);
                                if (i6 != 0) {
                                }
                                this.L$0 = androidLoad6;
                                this.L$1 = byteString5;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.L$7 = null;
                                this.L$8 = null;
                                this.I$0 = r14;
                                this.J$0 = j9;
                                this.label = 5;
                                obj10 = obj8;
                                boolean z4 = z2;
                                j13 = j9;
                                invoke3 = handleGatewayAdResponse.invoke(unityAdsLoadOptions5, byteString5, adResponse, context5, str7, diagnosticAdType6, z4, false, this);
                                if (invoke3 != obj10) {
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            byteString3 = byteString;
                            str6 = str4;
                            unityAdsLoadOptions3 = unityAdsLoadOptions;
                            context3 = context;
                            j5 = j6;
                            adObject3 = adObject5;
                            diagnosticAdType3 = diagnosticAdType5;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        byteString3 = byteString;
                        str6 = str4;
                        unityAdsLoadOptions3 = unityAdsLoadOptions;
                        context3 = context;
                        diagnosticAdType3 = diagnosticAdType;
                        j5 = j6;
                        adObject3 = adObject;
                    }
                    if (request$default != obj4) {
                        return obj4;
                    }
                    j7 = m9541markNowz9LOYto2;
                    i6 = i2;
                    context4 = context3;
                    adObject4 = adObject3;
                    diagnosticAdType4 = diagnosticAdType3;
                    byteString4 = byteString3;
                    j8 = j5;
                    androidLoad5 = androidLoad4;
                    unityAdsLoadOptions4 = unityAdsLoadOptions3;
                    m8079constructorimpl = Result.m8079constructorimpl((UniversalResponseOuterClass.UniversalResponse) request$default);
                    j5 = j8;
                    adObject6 = adObject4;
                    androidLoad2 = androidLoad5;
                    TimedValue timedValue2 = new TimedValue(Result.m8078boximpl(m8079constructorimpl), TimeSource.Monotonic.ValueTimeMark.m9546elapsedNowUwyO8pc(j7), null);
                    Object value3 = ((Result) timedValue2.component1()).getValue();
                    long duration2 = timedValue2.getDuration();
                    sendDiagnosticEvent = androidLoad2.sendDiagnosticEvent;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, Result.m8086isSuccessimpl(value3) ? str : str2, Boxing.boxDouble(Duration.m9462toDoubleimpl(duration2, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject6, (Integer) null, (ByteString) null, 108, (Object) null);
                    Object value22 = ((Result) timedValue2.getValue()).getValue();
                    ResultKt.throwOnFailure(value22);
                    diagnosticAdType6 = diagnosticAdType4;
                    context5 = context4;
                    unityAdsLoadOptions5 = unityAdsLoadOptions4;
                    obj8 = obj4;
                    r14 = i3;
                    str7 = str6;
                    j9 = j5;
                    androidLoad6 = androidLoad2;
                    adResponse = ((UniversalResponseOuterClass.UniversalResponse) value22).getPayload().getAdResponse();
                    byteString5 = byteString4;
                    handleGatewayAdResponse = androidLoad6.handleGatewayAdResponse;
                    Intrinsics.checkNotNull(adResponse);
                    if (i6 != 0) {
                    }
                    this.L$0 = androidLoad6;
                    this.L$1 = byteString5;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.I$0 = r14;
                    this.J$0 = j9;
                    this.label = 5;
                    obj10 = obj8;
                    boolean z42 = z2;
                    j13 = j9;
                    invoke3 = handleGatewayAdResponse.invoke(unityAdsLoadOptions5, byteString5, adResponse, context5, str7, diagnosticAdType6, z42, false, this);
                    if (invoke3 != obj10) {
                    }
                } catch (UnityAdsNetworkException e11) {
                    e = e11;
                    j5 = j6;
                    r3 = i3;
                    androidLoad2 = androidLoad4;
                    j2 = j5;
                    handleGatewayException = androidLoad2.handleGatewayException(e);
                    obj6 = (LoadResult) handleGatewayException;
                    m9541markNowz9LOYto = j2;
                    z = r3;
                    if (!z) {
                    }
                    return obj6;
                }
            } catch (UnityAdsNetworkException e12) {
                e = e12;
                androidLoad2 = androidLoad9;
            }
        } else if (i8 == 2) {
            j7 = this.J$1;
            i6 = this.I$1;
            j8 = this.J$0;
            int i11 = this.I$0;
            adObject4 = (AdObject) this.L$6;
            diagnosticAdType4 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$5;
            context4 = (Context) this.L$4;
            unityAdsLoadOptions4 = (UnityAdsLoadOptions) this.L$3;
            str6 = (String) this.L$2;
            byteString4 = (ByteString) this.L$1;
            androidLoad5 = (AndroidLoad) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                request$default = obj;
                str = "native_load_config_success_time";
                str2 = "native_load_config_failure_time";
                z2 = true;
                i3 = i11;
                obj4 = coroutine_suspended;
                try {
                    m8079constructorimpl = Result.m8079constructorimpl((UniversalResponseOuterClass.UniversalResponse) request$default);
                    j5 = j8;
                    adObject6 = adObject4;
                    androidLoad2 = androidLoad5;
                } catch (Throwable th4) {
                    th = th4;
                    j5 = j8;
                    androidLoad2 = androidLoad5;
                    try {
                        Result.Companion companion42 = Result.INSTANCE;
                        m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
                        adObject6 = adObject4;
                        TimedValue timedValue22 = new TimedValue(Result.m8078boximpl(m8079constructorimpl), TimeSource.Monotonic.ValueTimeMark.m9546elapsedNowUwyO8pc(j7), null);
                        Object value32 = ((Result) timedValue22.component1()).getValue();
                        long duration22 = timedValue22.getDuration();
                        sendDiagnosticEvent = androidLoad2.sendDiagnosticEvent;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, Result.m8086isSuccessimpl(value32) ? str : str2, Boxing.boxDouble(Duration.m9462toDoubleimpl(duration22, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject6, (Integer) null, (ByteString) null, 108, (Object) null);
                        Object value222 = ((Result) timedValue22.getValue()).getValue();
                        ResultKt.throwOnFailure(value222);
                        diagnosticAdType6 = diagnosticAdType4;
                        context5 = context4;
                        unityAdsLoadOptions5 = unityAdsLoadOptions4;
                        obj8 = obj4;
                        r14 = i3;
                        str7 = str6;
                        j9 = j5;
                        androidLoad6 = androidLoad2;
                        adResponse = ((UniversalResponseOuterClass.UniversalResponse) value222).getPayload().getAdResponse();
                        byteString5 = byteString4;
                        handleGatewayAdResponse = androidLoad6.handleGatewayAdResponse;
                        Intrinsics.checkNotNull(adResponse);
                        if (i6 != 0) {
                        }
                        this.L$0 = androidLoad6;
                        this.L$1 = byteString5;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.L$8 = null;
                        this.I$0 = r14;
                        this.J$0 = j9;
                        this.label = 5;
                        obj10 = obj8;
                        boolean z422 = z2;
                        j13 = j9;
                        invoke3 = handleGatewayAdResponse.invoke(unityAdsLoadOptions5, byteString5, adResponse, context5, str7, diagnosticAdType6, z422, false, this);
                        if (invoke3 != obj10) {
                        }
                    } catch (UnityAdsNetworkException e13) {
                        e = e13;
                        r3 = i3;
                        j2 = j5;
                        handleGatewayException = androidLoad2.handleGatewayException(e);
                        obj6 = (LoadResult) handleGatewayException;
                        m9541markNowz9LOYto = j2;
                        z = r3;
                        if (!z) {
                        }
                        return obj6;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                j5 = j8;
                str = "native_load_config_success_time";
                str2 = "native_load_config_failure_time";
                androidLoad2 = androidLoad5;
                z2 = true;
                i3 = i11;
                obj4 = coroutine_suspended;
                Result.Companion companion422 = Result.INSTANCE;
                m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
                adObject6 = adObject4;
                TimedValue timedValue222 = new TimedValue(Result.m8078boximpl(m8079constructorimpl), TimeSource.Monotonic.ValueTimeMark.m9546elapsedNowUwyO8pc(j7), null);
                Object value322 = ((Result) timedValue222.component1()).getValue();
                long duration222 = timedValue222.getDuration();
                sendDiagnosticEvent = androidLoad2.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, Result.m8086isSuccessimpl(value322) ? str : str2, Boxing.boxDouble(Duration.m9462toDoubleimpl(duration222, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject6, (Integer) null, (ByteString) null, 108, (Object) null);
                Object value2222 = ((Result) timedValue222.getValue()).getValue();
                ResultKt.throwOnFailure(value2222);
                diagnosticAdType6 = diagnosticAdType4;
                context5 = context4;
                unityAdsLoadOptions5 = unityAdsLoadOptions4;
                obj8 = obj4;
                r14 = i3;
                str7 = str6;
                j9 = j5;
                androidLoad6 = androidLoad2;
                adResponse = ((UniversalResponseOuterClass.UniversalResponse) value2222).getPayload().getAdResponse();
                byteString5 = byteString4;
                handleGatewayAdResponse = androidLoad6.handleGatewayAdResponse;
                Intrinsics.checkNotNull(adResponse);
                if (i6 != 0) {
                }
                this.L$0 = androidLoad6;
                this.L$1 = byteString5;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.I$0 = r14;
                this.J$0 = j9;
                this.label = 5;
                obj10 = obj8;
                boolean z4222 = z2;
                j13 = j9;
                invoke3 = handleGatewayAdResponse.invoke(unityAdsLoadOptions5, byteString5, adResponse, context5, str7, diagnosticAdType6, z4222, false, this);
                if (invoke3 != obj10) {
                }
            }
            TimedValue timedValue2222 = new TimedValue(Result.m8078boximpl(m8079constructorimpl), TimeSource.Monotonic.ValueTimeMark.m9546elapsedNowUwyO8pc(j7), null);
            Object value3222 = ((Result) timedValue2222.component1()).getValue();
            long duration2222 = timedValue2222.getDuration();
            sendDiagnosticEvent = androidLoad2.sendDiagnosticEvent;
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, Result.m8086isSuccessimpl(value3222) ? str : str2, Boxing.boxDouble(Duration.m9462toDoubleimpl(duration2222, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject6, (Integer) null, (ByteString) null, 108, (Object) null);
            Object value22222 = ((Result) timedValue2222.getValue()).getValue();
            ResultKt.throwOnFailure(value22222);
            diagnosticAdType6 = diagnosticAdType4;
            context5 = context4;
            unityAdsLoadOptions5 = unityAdsLoadOptions4;
            obj8 = obj4;
            r14 = i3;
            str7 = str6;
            j9 = j5;
            androidLoad6 = androidLoad2;
            adResponse = ((UniversalResponseOuterClass.UniversalResponse) value22222).getPayload().getAdResponse();
            byteString5 = byteString4;
            handleGatewayAdResponse = androidLoad6.handleGatewayAdResponse;
            Intrinsics.checkNotNull(adResponse);
            if (i6 != 0) {
            }
            this.L$0 = androidLoad6;
            this.L$1 = byteString5;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = null;
            this.I$0 = r14;
            this.J$0 = j9;
            this.label = 5;
            obj10 = obj8;
            boolean z42222 = z2;
            j13 = j9;
            invoke3 = handleGatewayAdResponse.invoke(unityAdsLoadOptions5, byteString5, adResponse, context5, str7, diagnosticAdType6, z42222, false, this);
            if (invoke3 != obj10) {
            }
        } else if (i8 == 3) {
            int i12 = this.I$1;
            j2 = this.J$0;
            r3 = this.I$0;
            AdObject adObject11 = (AdObject) this.L$8;
            diagnosticAdType2 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$7;
            Context context9 = (Context) this.L$5;
            UnityAdsLoadOptions unityAdsLoadOptions10 = (UnityAdsLoadOptions) this.L$4;
            String str12 = (String) this.L$3;
            ByteString byteString10 = (ByteString) this.L$2;
            HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup8 = (HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup) this.L$1;
            AndroidLoad androidLoad10 = (AndroidLoad) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                str3 = "getAdData(...)";
                str = "native_load_config_success_time";
                obj5 = coroutine_suspended;
                str2 = "native_load_config_failure_time";
                z2 = true;
                j4 = j2;
                i4 = r3;
                headerBiddingAdMarkup2 = headerBiddingAdMarkup8;
                byteString2 = byteString10;
                invoke2 = obj;
                adObject2 = adObject11;
                context2 = context9;
                str5 = str12;
                unityAdsLoadOptions2 = unityAdsLoadOptions10;
                i5 = i12;
                androidLoad = androidLoad10;
                try {
                    UniversalRequestOuterClass.UniversalRequest universalRequest22 = (UniversalRequestOuterClass.UniversalRequest) invoke2;
                    getRequestPolicy2 = androidLoad.getRequestPolicy;
                    RequestPolicy invoke52 = getRequestPolicy2.invoke();
                    j11 = j4;
                } catch (UnityAdsNetworkException e14) {
                    e = e14;
                    j10 = j4;
                }
                try {
                    m9541markNowz9LOYto3 = TimeSource.Monotonic.INSTANCE.m9541markNowz9LOYto();
                    try {
                        Result.Companion companion22 = Result.INSTANCE;
                        gatewayClient2 = androidLoad.gatewayClient;
                        OperationType operationType22 = OperationType.LOAD_HEADER_BIDDING;
                        this.L$0 = androidLoad;
                        this.L$1 = headerBiddingAdMarkup2;
                        this.L$2 = byteString2;
                        this.L$3 = str5;
                        this.L$4 = unityAdsLoadOptions2;
                        this.L$5 = context2;
                        this.L$6 = diagnosticAdType2;
                        this.L$7 = adObject2;
                        headerBiddingAdMarkup5 = headerBiddingAdMarkup2;
                    } catch (Throwable th6) {
                        th = th6;
                        byteString6 = byteString2;
                        str8 = str5;
                        unityAdsLoadOptions6 = unityAdsLoadOptions2;
                        context6 = context2;
                        diagnosticAdType7 = diagnosticAdType2;
                        j10 = j11;
                        headerBiddingAdMarkup3 = headerBiddingAdMarkup2;
                    }
                    try {
                        this.L$8 = null;
                        this.I$0 = i4;
                        adObject8 = adObject2;
                        obj9 = obj5;
                        try {
                            this.J$0 = j11;
                            this.I$1 = i5;
                            this.J$1 = m9541markNowz9LOYto3;
                            this.label = 4;
                            headerBiddingAdMarkup3 = headerBiddingAdMarkup5;
                            byteString6 = byteString2;
                            str8 = str5;
                            unityAdsLoadOptions6 = unityAdsLoadOptions2;
                            context6 = context2;
                            diagnosticAdType7 = diagnosticAdType2;
                            j10 = j11;
                            adObject7 = adObject8;
                            try {
                                request$default2 = GatewayClient.DefaultImpls.request$default(gatewayClient2, null, universalRequest22, invoke52, operationType22, this, 1, null);
                                obj8 = obj9;
                            } catch (Throwable th7) {
                                th = th7;
                                obj8 = obj9;
                                r3 = i4;
                                j12 = m9541markNowz9LOYto3;
                                androidLoad2 = androidLoad;
                                unityAdsLoadOptions7 = unityAdsLoadOptions6;
                                headerBiddingAdMarkup4 = headerBiddingAdMarkup3;
                                byteString7 = byteString6;
                                Result.Companion companion5 = Result.INSTANCE;
                                m8079constructorimpl2 = Result.m8079constructorimpl(ResultKt.createFailure(th));
                                adObject9 = adObject7;
                                z3 = r3;
                                TimedValue timedValue3 = new TimedValue(Result.m8078boximpl(m8079constructorimpl2), TimeSource.Monotonic.ValueTimeMark.m9546elapsedNowUwyO8pc(j12), null);
                                Object value4 = ((Result) timedValue3.component1()).getValue();
                                long duration3 = timedValue3.getDuration();
                                sendDiagnosticEvent2 = androidLoad2.sendDiagnosticEvent;
                                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, !Result.m8086isSuccessimpl(value4) ? str : str2, Boxing.boxDouble(Duration.m9462toDoubleimpl(duration3, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject9, (Integer) null, (ByteString) null, 108, (Object) null);
                                Object value5 = ((Result) timedValue3.getValue()).getValue();
                                ResultKt.throwOnFailure(value5);
                                universalResponse = (UniversalResponseOuterClass.UniversalResponse) value5;
                                if (!universalResponse.hasError()) {
                                }
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            str8 = str5;
                            unityAdsLoadOptions6 = unityAdsLoadOptions2;
                            context6 = context2;
                            diagnosticAdType7 = diagnosticAdType2;
                            j10 = j11;
                            headerBiddingAdMarkup3 = headerBiddingAdMarkup5;
                            adObject7 = adObject8;
                            obj8 = obj9;
                            byteString6 = byteString2;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        str8 = str5;
                        unityAdsLoadOptions6 = unityAdsLoadOptions2;
                        context6 = context2;
                        diagnosticAdType7 = diagnosticAdType2;
                        j10 = j11;
                        headerBiddingAdMarkup3 = headerBiddingAdMarkup5;
                        byteString6 = byteString2;
                        Object obj13 = obj5;
                        adObject7 = adObject2;
                        obj8 = obj13;
                        r3 = i4;
                        j12 = m9541markNowz9LOYto3;
                        androidLoad2 = androidLoad;
                        unityAdsLoadOptions7 = unityAdsLoadOptions6;
                        headerBiddingAdMarkup4 = headerBiddingAdMarkup3;
                        byteString7 = byteString6;
                        Result.Companion companion52 = Result.INSTANCE;
                        m8079constructorimpl2 = Result.m8079constructorimpl(ResultKt.createFailure(th));
                        adObject9 = adObject7;
                        z3 = r3;
                        TimedValue timedValue32 = new TimedValue(Result.m8078boximpl(m8079constructorimpl2), TimeSource.Monotonic.ValueTimeMark.m9546elapsedNowUwyO8pc(j12), null);
                        Object value42 = ((Result) timedValue32.component1()).getValue();
                        long duration32 = timedValue32.getDuration();
                        sendDiagnosticEvent2 = androidLoad2.sendDiagnosticEvent;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, !Result.m8086isSuccessimpl(value42) ? str : str2, Boxing.boxDouble(Duration.m9462toDoubleimpl(duration32, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject9, (Integer) null, (ByteString) null, 108, (Object) null);
                        Object value52 = ((Result) timedValue32.getValue()).getValue();
                        ResultKt.throwOnFailure(value52);
                        universalResponse = (UniversalResponseOuterClass.UniversalResponse) value52;
                        if (!universalResponse.hasError()) {
                        }
                    }
                    if (request$default2 != obj8) {
                        return obj8;
                    }
                    r4 = i4;
                    j12 = m9541markNowz9LOYto3;
                    i7 = i5;
                    unityAdsLoadOptions7 = unityAdsLoadOptions6;
                    headerBiddingAdMarkup4 = headerBiddingAdMarkup3;
                    byteString7 = byteString6;
                    androidLoad7 = androidLoad;
                    m8079constructorimpl2 = Result.m8079constructorimpl((UniversalResponseOuterClass.UniversalResponse) request$default2);
                    i5 = i7;
                    z3 = r4;
                    adObject9 = adObject7;
                    androidLoad2 = androidLoad7;
                    TimedValue timedValue322 = new TimedValue(Result.m8078boximpl(m8079constructorimpl2), TimeSource.Monotonic.ValueTimeMark.m9546elapsedNowUwyO8pc(j12), null);
                    Object value422 = ((Result) timedValue322.component1()).getValue();
                    long duration322 = timedValue322.getDuration();
                    sendDiagnosticEvent2 = androidLoad2.sendDiagnosticEvent;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, !Result.m8086isSuccessimpl(value422) ? str : str2, Boxing.boxDouble(Duration.m9462toDoubleimpl(duration322, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject9, (Integer) null, (ByteString) null, 108, (Object) null);
                    Object value522 = ((Result) timedValue322.getValue()).getValue();
                    ResultKt.throwOnFailure(value522);
                    universalResponse = (UniversalResponseOuterClass.UniversalResponse) value522;
                    if (!universalResponse.hasError()) {
                    }
                } catch (UnityAdsNetworkException e15) {
                    e = e15;
                    j10 = j11;
                    r3 = i4;
                    androidLoad2 = androidLoad;
                    j2 = j10;
                    handleGatewayException = androidLoad2.handleGatewayException(e);
                    obj6 = (LoadResult) handleGatewayException;
                    m9541markNowz9LOYto = j2;
                    z = r3;
                    if (!z) {
                    }
                    return obj6;
                }
            } catch (UnityAdsNetworkException e16) {
                e = e16;
                androidLoad2 = androidLoad10;
            }
        } else if (i8 == 4) {
            j12 = this.J$1;
            i7 = this.I$1;
            long j14 = this.J$0;
            r4 = this.I$0;
            AdObject adObject12 = (AdObject) this.L$7;
            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType10 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$6;
            Context context10 = (Context) this.L$5;
            unityAdsLoadOptions7 = (UnityAdsLoadOptions) this.L$4;
            String str13 = (String) this.L$3;
            byteString7 = (ByteString) this.L$2;
            headerBiddingAdMarkup4 = (HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup) this.L$1;
            androidLoad7 = (AndroidLoad) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                request$default2 = obj;
                j10 = j14;
                str3 = "getAdData(...)";
                str = "native_load_config_success_time";
                obj8 = coroutine_suspended;
                str2 = "native_load_config_failure_time";
                adObject7 = adObject12;
                diagnosticAdType7 = diagnosticAdType10;
                context6 = context10;
                str8 = str13;
                z2 = true;
                try {
                    m8079constructorimpl2 = Result.m8079constructorimpl((UniversalResponseOuterClass.UniversalResponse) request$default2);
                    i5 = i7;
                    z3 = r4;
                    adObject9 = adObject7;
                    androidLoad2 = androidLoad7;
                } catch (Throwable th10) {
                    th = th10;
                    i5 = i7;
                    r3 = r4;
                    androidLoad2 = androidLoad7;
                    try {
                        Result.Companion companion522 = Result.INSTANCE;
                        m8079constructorimpl2 = Result.m8079constructorimpl(ResultKt.createFailure(th));
                        adObject9 = adObject7;
                        z3 = r3;
                        TimedValue timedValue3222 = new TimedValue(Result.m8078boximpl(m8079constructorimpl2), TimeSource.Monotonic.ValueTimeMark.m9546elapsedNowUwyO8pc(j12), null);
                        Object value4222 = ((Result) timedValue3222.component1()).getValue();
                        long duration3222 = timedValue3222.getDuration();
                        sendDiagnosticEvent2 = androidLoad2.sendDiagnosticEvent;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, !Result.m8086isSuccessimpl(value4222) ? str : str2, Boxing.boxDouble(Duration.m9462toDoubleimpl(duration3222, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject9, (Integer) null, (ByteString) null, 108, (Object) null);
                        Object value5222 = ((Result) timedValue3222.getValue()).getValue();
                        ResultKt.throwOnFailure(value5222);
                        universalResponse = (UniversalResponseOuterClass.UniversalResponse) value5222;
                        if (!universalResponse.hasError()) {
                        }
                    } catch (UnityAdsNetworkException e17) {
                        e = e17;
                        j2 = j10;
                        handleGatewayException = androidLoad2.handleGatewayException(e);
                        obj6 = (LoadResult) handleGatewayException;
                        m9541markNowz9LOYto = j2;
                        z = r3;
                        if (!z) {
                        }
                        return obj6;
                    }
                }
            } catch (Throwable th11) {
                th = th11;
                i5 = i7;
                r3 = r4;
                j10 = j14;
                str3 = "getAdData(...)";
                str = "native_load_config_success_time";
                obj8 = coroutine_suspended;
                str2 = "native_load_config_failure_time";
                adObject7 = adObject12;
                diagnosticAdType7 = diagnosticAdType10;
                context6 = context10;
                str8 = str13;
                androidLoad2 = androidLoad7;
                z2 = true;
                Result.Companion companion5222 = Result.INSTANCE;
                m8079constructorimpl2 = Result.m8079constructorimpl(ResultKt.createFailure(th));
                adObject9 = adObject7;
                z3 = r3;
                TimedValue timedValue32222 = new TimedValue(Result.m8078boximpl(m8079constructorimpl2), TimeSource.Monotonic.ValueTimeMark.m9546elapsedNowUwyO8pc(j12), null);
                Object value42222 = ((Result) timedValue32222.component1()).getValue();
                long duration32222 = timedValue32222.getDuration();
                sendDiagnosticEvent2 = androidLoad2.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, !Result.m8086isSuccessimpl(value42222) ? str : str2, Boxing.boxDouble(Duration.m9462toDoubleimpl(duration32222, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject9, (Integer) null, (ByteString) null, 108, (Object) null);
                Object value52222 = ((Result) timedValue32222.getValue()).getValue();
                ResultKt.throwOnFailure(value52222);
                universalResponse = (UniversalResponseOuterClass.UniversalResponse) value52222;
                if (!universalResponse.hasError()) {
                }
            }
            TimedValue timedValue322222 = new TimedValue(Result.m8078boximpl(m8079constructorimpl2), TimeSource.Monotonic.ValueTimeMark.m9546elapsedNowUwyO8pc(j12), null);
            Object value422222 = ((Result) timedValue322222.component1()).getValue();
            long duration322222 = timedValue322222.getDuration();
            sendDiagnosticEvent2 = androidLoad2.sendDiagnosticEvent;
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, !Result.m8086isSuccessimpl(value422222) ? str : str2, Boxing.boxDouble(Duration.m9462toDoubleimpl(duration322222, DurationUnit.MILLISECONDS)), (Map) null, (Map) null, adObject9, (Integer) null, (ByteString) null, 108, (Object) null);
            Object value522222 = ((Result) timedValue322222.getValue()).getValue();
            ResultKt.throwOnFailure(value522222);
            universalResponse = (UniversalResponseOuterClass.UniversalResponse) value522222;
            if (!universalResponse.hasError()) {
                ErrorOuterClass.PublicErrorCode errorCode = universalResponse.getError().getErrorCode();
                Intrinsics.checkNotNullExpressionValue(errorCode, "getErrorCode(...)");
                ErrorOuterClass.PublicErrorCode errorCode2 = universalResponse.getError().getErrorCode();
                if (errorCode2 == null || (str9 = UnityAdsErrorKt.getLoadErrorMsg(errorCode2)) == null) {
                    str9 = UnityAdsConstants.Messages.MSG_INTERNAL_ERROR;
                }
                String errorText = universalResponse.getError().getErrorText();
                ErrorOuterClass.Error error = universalResponse.getError();
                Intrinsics.checkNotNullExpressionValue(error, "getError(...)");
                obj6 = (LoadResult) new LoadResult.Failure(errorCode, str9, null, "gateway", errorText, ErrorExtensionsKt.getErrorTokenOrNull(error), 4, null);
                z = z3;
                m9541markNowz9LOYto = j10;
                if (!z) {
                    sessionRepository2 = this.this$0.sessionRepository;
                    sessionRepository2.setLastLoadLatency((int) TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m9542boximpl(m9541markNowz9LOYto)));
                    if (obj6 instanceof LoadResult.Success) {
                        sessionRepository5 = this.this$0.sessionRepository;
                        sessionRepository5.incrementSuccessCount();
                    } else {
                        if (!(obj6 instanceof LoadResult.Failure)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        sessionRepository3 = this.this$0.sessionRepository;
                        sessionRepository3.incrementAllErrorsCount();
                        isCachePhaseFailure = this.this$0.isCachePhaseFailure((LoadResult.Failure) obj6);
                        if (isCachePhaseFailure) {
                            sessionRepository4 = this.this$0.sessionRepository;
                            sessionRepository4.incrementCacheTimeoutErrorsCount();
                        }
                    }
                }
                return obj6;
            }
            AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse = universalResponse.getPayload().getAdPlayerConfigResponse();
            AdResponseKt.Dsl.Companion companion6 = AdResponseKt.Dsl.INSTANCE;
            AdResponseOuterClass.AdResponse.Builder newBuilder = AdResponseOuterClass.AdResponse.newBuilder();
            Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
            AdResponseKt.Dsl _create = companion6._create(newBuilder);
            ByteString adData = headerBiddingAdMarkup4.getAdData();
            String str14 = str3;
            Intrinsics.checkNotNullExpressionValue(adData, str14);
            _create.setAdData(adData);
            _create.setAdDataVersion(headerBiddingAdMarkup4.getAdDataVersion());
            ByteString trackingToken = adPlayerConfigResponse.getTrackingToken();
            Intrinsics.checkNotNullExpressionValue(trackingToken, "getTrackingToken(...)");
            _create.setTrackingToken(trackingToken);
            ByteString impressionConfiguration = adPlayerConfigResponse.getImpressionConfiguration();
            Intrinsics.checkNotNullExpressionValue(impressionConfiguration, "getImpressionConfiguration(...)");
            _create.setImpressionConfiguration(impressionConfiguration);
            _create.setImpressionConfigurationVersion(adPlayerConfigResponse.getImpressionConfigurationVersion());
            WebviewConfiguration.WebViewConfiguration webviewConfiguration = adPlayerConfigResponse.getWebviewConfiguration();
            Intrinsics.checkNotNullExpressionValue(webviewConfiguration, "getWebviewConfiguration(...)");
            _create.setWebviewConfiguration(webviewConfiguration);
            ByteString adDataRefreshToken = adPlayerConfigResponse.getAdDataRefreshToken();
            Intrinsics.checkNotNullExpressionValue(adDataRefreshToken, "getAdDataRefreshToken(...)");
            _create.setAdDataRefreshToken(adDataRefreshToken);
            CampaignMetadataOuterClass.CampaignMetadata campaignMetadata = adPlayerConfigResponse.getCampaignMetadata();
            Intrinsics.checkNotNullExpressionValue(campaignMetadata, "getCampaignMetadata(...)");
            _create.setCampaignMetadata(campaignMetadata);
            if (adPlayerConfigResponse.hasError()) {
                ErrorOuterClass.Error error2 = adPlayerConfigResponse.getError();
                Intrinsics.checkNotNullExpressionValue(error2, "getError(...)");
                _create.setError(error2);
            }
            ByteString adData2 = adPlayerConfigResponse.getAdData();
            Intrinsics.checkNotNullExpressionValue(adData2, str14);
            if (ByteStringsKt.isNotEmpty(adData2)) {
                ByteString adData3 = adPlayerConfigResponse.getAdData();
                Intrinsics.checkNotNullExpressionValue(adData3, str14);
                _create.setAdData(adData3);
                _create.setAdDataVersion(adPlayerConfigResponse.getAdDataVersion());
            }
            androidLoad6 = androidLoad2;
            unityAdsLoadOptions5 = unityAdsLoadOptions7;
            context5 = context6;
            str7 = str8;
            diagnosticAdType6 = diagnosticAdType7;
            j9 = j10;
            adResponse = _create._build();
            byteString5 = byteString7;
            int i13 = i5;
            r14 = z3;
            i6 = i13;
            try {
                handleGatewayAdResponse = androidLoad6.handleGatewayAdResponse;
                Intrinsics.checkNotNull(adResponse);
                if (i6 != 0) {
                    z2 = false;
                }
                this.L$0 = androidLoad6;
                this.L$1 = byteString5;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.I$0 = r14;
                this.J$0 = j9;
                this.label = 5;
                obj10 = obj8;
                boolean z422222 = z2;
                j13 = j9;
                try {
                    invoke3 = handleGatewayAdResponse.invoke(unityAdsLoadOptions5, byteString5, adResponse, context5, str7, diagnosticAdType6, z422222, false, this);
                    if (invoke3 != obj10) {
                        return obj10;
                    }
                    r3 = r14;
                    androidLoad2 = androidLoad6;
                } catch (UnityAdsNetworkException e18) {
                    e = e18;
                    r3 = r14;
                    androidLoad2 = androidLoad6;
                    j2 = j13;
                    handleGatewayException = androidLoad2.handleGatewayException(e);
                    obj6 = (LoadResult) handleGatewayException;
                    m9541markNowz9LOYto = j2;
                    z = r3;
                    if (!z) {
                    }
                    return obj6;
                }
            } catch (UnityAdsNetworkException e19) {
                e = e19;
                j13 = j9;
            }
        } else {
            if (i8 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = this.J$0;
            r3 = this.I$0;
            byteString5 = (ByteString) this.L$1;
            androidLoad2 = (AndroidLoad) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                j13 = j2;
                invoke3 = obj;
                r3 = r3;
            } catch (UnityAdsNetworkException e20) {
                e = e20;
            }
        }
        handleGatewayException = androidLoad2.handleGatewayException(e);
        obj6 = (LoadResult) handleGatewayException;
        m9541markNowz9LOYto = j2;
        z = r3;
        if (!z) {
        }
        return obj6;
        Object obj14 = (LoadResult) invoke3;
        if (obj14 instanceof LoadResult.Success) {
            adRepository = androidLoad2.adRepository;
            AdObject ad = adRepository.getAd(byteString5);
            obj11 = ad == null ? (LoadResult) new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, LoadResult.MSG_AD_OBJECT, null, "ad_object_not_found", null, null, 52, null) : (LoadResult) new LoadResult.Success(ad);
        } else {
            boolean z5 = obj14 instanceof LoadResult.Failure;
            obj11 = obj14;
            if (!z5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        obj6 = obj11;
        z = r3;
        m9541markNowz9LOYto = j13;
        if (!z) {
        }
        return obj6;
    }
}
