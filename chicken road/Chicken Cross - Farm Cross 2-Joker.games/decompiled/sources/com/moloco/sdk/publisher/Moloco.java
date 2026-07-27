package com.moloco.sdk.publisher;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.Init;
import com.moloco.sdk.acm.AndroidClientMetrics;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.InitConfig;
import com.moloco.sdk.acm.UpdateConfig;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.android_context.b;
import com.moloco.sdk.internal.publisher.C4787b;
import com.moloco.sdk.internal.publisher.C4788c;
import com.moloco.sdk.internal.publisher.x;
import com.moloco.sdk.internal.publisher.y;
import com.moloco.sdk.internal.scheduling.c;
import com.moloco.sdk.internal.services.bidtoken.h;
import com.moloco.sdk.internal.services.bidtoken.i;
import com.moloco.sdk.internal.services.bidtoken.n;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.init.MolocoInitParams;
import com.moloco.sdk.service_locator.a;
import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\"\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013Jk\u0010 \u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142>\u0010\u001f\u001a:\u0012\u0015\u0012\u0013\u0018\u00010\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\b0\u0017j\u0002`\u001eH\u0007¢\u0006\u0004\b \u0010!Jk\u0010\"\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142>\u0010\u001f\u001a:\u0012\u0015\u0012\u0013\u0018\u00010\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\b0\u0017j\u0002`\u001eH\u0007¢\u0006\u0004\b\"\u0010!Js\u0010%\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010$\u001a\u00020#2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142>\u0010\u001f\u001a:\u0012\u0015\u0012\u0013\u0018\u00010\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\b0\u0017j\u0002`\u001eH\u0007¢\u0006\u0004\b%\u0010&Jk\u0010'\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142>\u0010\u001f\u001a:\u0012\u0015\u0012\u0013\u0018\u00010\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\b0\u0017j\u0002`\u001eH\u0007¢\u0006\u0004\b'\u0010!Jk\u0010+\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142>\u0010\u001f\u001a:\u0012\u0015\u0012\u0013\u0018\u00010(¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b()\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\b0\u0017j\u0002`*H\u0007¢\u0006\u0004\b+\u0010!Jk\u0010/\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142>\u0010\u001f\u001a:\u0012\u0015\u0012\u0013\u0018\u00010,¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(-\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\b0\u0017j\u0002`.H\u0007¢\u0006\u0004\b/\u0010!Jk\u00103\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142>\u0010\u001f\u001a:\u0012\u0015\u0012\u0013\u0018\u000100¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(1\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\b0\u0017j\u0002`2H\u0007¢\u0006\u0004\b3\u0010!J\u0017\u00106\u001a\u00020\b2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\bH\u0082@¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\b2\u0006\u0010:\u001a\u00020\u0004H\u0002¢\u0006\u0004\b;\u0010\fJ\u000f\u0010<\u001a\u00020\bH\u0002¢\u0006\u0004\b<\u0010\u0003J\u0017\u0010?\u001a\u00020>2\u0006\u0010=\u001a\u00020\u0014H\u0002¢\u0006\u0004\b?\u0010@J\u0010\u0010B\u001a\u00020\bH\u0081@¢\u0006\u0004\bA\u00109R2\u0010E\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060D0C8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bE\u0010F\u0012\u0004\bI\u0010\u0003\u001a\u0004\bG\u0010HR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00140J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001b\u0010R\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001b\u0010W\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010O\u001a\u0004\bU\u0010VR\u001b\u0010\\\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010O\u001a\u0004\bZ\u0010[R\u001b\u0010a\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010O\u001a\u0004\b_\u0010`R*\u0010c\u001a\u0004\u0018\u00010b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bc\u0010d\u0012\u0004\bi\u0010\u0003\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR*\u0010:\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b:\u0010j\u0012\u0004\bn\u0010\u0003\u001a\u0004\bk\u0010l\"\u0004\bm\u0010\fR\u001a\u0010o\u001a\u00020>8FX\u0087\u0004¢\u0006\f\u0012\u0004\bq\u0010\u0003\u001a\u0004\bo\u0010pR\u0016\u0010t\u001a\u0004\u0018\u00010\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00140u8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bv\u0010w¨\u0006y"}, d2 = {"Lcom/moloco/sdk/publisher/Moloco;", "", "<init>", "()V", "Lcom/moloco/sdk/publisher/init/MolocoInitParams;", "initParam", "Lcom/moloco/sdk/publisher/MolocoInitializationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "initialize", "(Lcom/moloco/sdk/publisher/init/MolocoInitParams;Lcom/moloco/sdk/publisher/MolocoInitializationListener;)V", "logMolocoInfo", "(Lcom/moloco/sdk/publisher/init/MolocoInitParams;)V", "Lcom/moloco/sdk/publisher/MediationInfo;", "mediationInfo", "Landroid/content/Context;", "context", "Lcom/moloco/sdk/publisher/MolocoBidTokenListener;", "getBidToken", "(Lcom/moloco/sdk/publisher/MediationInfo;Landroid/content/Context;Lcom/moloco/sdk/publisher/MolocoBidTokenListener;)V", "", "adUnitId", "watermarkString", "Lkotlin/Function2;", "Lcom/moloco/sdk/publisher/Banner;", "Lkotlin/ParameterName;", "name", "banner", "Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;", "error", "Lcom/moloco/sdk/publisher/CreateBannerCallback;", "callback", "createBanner", "(Lcom/moloco/sdk/publisher/MediationInfo;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "createBannerTablet", "Lcom/moloco/sdk/publisher/BannerAdSize;", ContentDisposition.Parameters.Size, "createMolocoBanner", "(Lcom/moloco/sdk/publisher/MediationInfo;Ljava/lang/String;Lcom/moloco/sdk/publisher/BannerAdSize;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "createMREC", "Lcom/moloco/sdk/publisher/NativeAd;", "nativeAd", "Lcom/moloco/sdk/publisher/CreateNativeAdCallback;", "createNativeAd", "Lcom/moloco/sdk/publisher/InterstitialAd;", "interstitialAd", "Lcom/moloco/sdk/publisher/CreateInterstitialAdCallback;", "createInterstitial", "Lcom/moloco/sdk/publisher/RewardedInterstitialAd;", "rewardedInterstitialAd", "Lcom/moloco/sdk/publisher/CreateRewardedInterstitialAdCallback;", "createRewardedInterstitial", "Lcom/moloco/sdk/Init$SDKInitResponse;", "sdkInitResponse", "processInitConfigs", "(Lcom/moloco/sdk/Init$SDKInitResponse;)V", "updateAndroidClientMetricsOnInitSuccess", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initParams", "initializeAndroidClientMetrics", "initializeILRD", "mediationName", "", "shouldInitializeILRD", "(Ljava/lang/String;)Z", "clearState$moloco_sdk_release", "clearState", "", "", "pendingInitByMediator", "Ljava/util/Map;", "getPendingInitByMediator$moloco_sdk_release", "()Ljava/util/Map;", "getPendingInitByMediator$moloco_sdk_release$annotations", "", "_failedMediations", "Ljava/util/Set;", "Lcom/moloco/sdk/internal/publisher/x;", "initializationHandler$delegate", "Lkotlin/Lazy;", "getInitializationHandler", "()Lcom/moloco/sdk/internal/publisher/x;", "initializationHandler", "Lcom/moloco/sdk/internal/services/bidtoken/h;", "bidTokenHandler$delegate", "getBidTokenHandler", "()Lcom/moloco/sdk/internal/services/bidtoken/h;", "bidTokenHandler", "Lcom/moloco/sdk/internal/publisher/b;", "adCreator$delegate", "getAdCreator", "()Lcom/moloco/sdk/internal/publisher/b;", "adCreator", "Lkotlinx/coroutines/CoroutineScope;", "scope$delegate", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/Job;", "initJob", "Lkotlinx/coroutines/Job;", "getInitJob", "()Lkotlinx/coroutines/Job;", "setInitJob", "(Lkotlinx/coroutines/Job;)V", "getInitJob$annotations", "Lcom/moloco/sdk/publisher/init/MolocoInitParams;", "getInitParams", "()Lcom/moloco/sdk/publisher/init/MolocoInitParams;", "setInitParams", "getInitParams$annotations", "isInitialized", "()Z", "isInitialized$annotations", "getAppKey$moloco_sdk_release", "()Ljava/lang/String;", "appKey", "", "getFailedMediations$moloco_sdk_release", "()Ljava/util/Set;", "failedMediations", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes7.dex */
public final class Moloco {
    private static Job initJob;
    private static MolocoInitParams initParams;
    public static final Moloco INSTANCE = new Moloco();
    private static final Map<String, List<MolocoInitializationListener>> pendingInitByMediator = new LinkedHashMap();
    private static final Set<String> _failedMediations = new LinkedHashSet();

    /* renamed from: initializationHandler$delegate, reason: from kotlin metadata */
    private static final Lazy initializationHandler = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.publisher.Moloco$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            x initializationHandler_delegate$lambda$7;
            initializationHandler_delegate$lambda$7 = Moloco.initializationHandler_delegate$lambda$7();
            return initializationHandler_delegate$lambda$7;
        }
    });

    /* renamed from: bidTokenHandler$delegate, reason: from kotlin metadata */
    private static final Lazy bidTokenHandler = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.publisher.Moloco$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            i bidTokenHandler_delegate$lambda$8;
            bidTokenHandler_delegate$lambda$8 = Moloco.bidTokenHandler_delegate$lambda$8();
            return bidTokenHandler_delegate$lambda$8;
        }
    });

    /* renamed from: adCreator$delegate, reason: from kotlin metadata */
    private static final Lazy adCreator = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.publisher.Moloco$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            C4787b adCreator_delegate$lambda$9;
            adCreator_delegate$lambda$9 = Moloco.adCreator_delegate$lambda$9();
            return adCreator_delegate$lambda$9;
        }
    });

    /* renamed from: scope$delegate, reason: from kotlin metadata */
    private static final Lazy scope = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.publisher.Moloco$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            CoroutineScope scope_delegate$lambda$10;
            scope_delegate$lambda$10 = Moloco.scope_delegate$lambda$10();
            return scope_delegate$lambda$10;
        }
    });
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Init.SDKInitResponse.SupportedNetworks.values().length];
            try {
                iArr[Init.SDKInitResponse.SupportedNetworks.LEVEL_PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private Moloco() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4787b adCreator_delegate$lambda$9() {
        return new C4787b(INSTANCE.getInitializationHandler().d(), a.h.f10873a.i(), new C4788c(null, 0L, 3, null), new Moloco$adCreator$2$1(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i bidTokenHandler_delegate$lambda$8() {
        return new i(n.a(), INSTANCE.getInitializationHandler(), a.h.f10873a.i());
    }

    @JvmStatic
    public static final void createBanner(MediationInfo mediationInfo, String adUnitId, String watermarkString, Function2<? super Banner, ? super MolocoAdError.AdCreateError, Unit> callback) {
        Intrinsics.checkNotNullParameter(mediationInfo, "mediationInfo");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating banner async for adUnitId: " + adUnitId, null, false, 12, null);
        BuildersKt__Builders_commonKt.launch$default(INSTANCE.getScope(), null, null, new Moloco$createBanner$1(mediationInfo, adUnitId, watermarkString, callback, null), 3, null);
    }

    public static /* synthetic */ void createBanner$default(MediationInfo mediationInfo, String str, String str2, Function2 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        createBanner(mediationInfo, str, str2, function2);
    }

    @JvmStatic
    public static final void createBannerTablet(MediationInfo mediationInfo, String adUnitId, String watermarkString, Function2<? super Banner, ? super MolocoAdError.AdCreateError, Unit> callback) {
        Intrinsics.checkNotNullParameter(mediationInfo, "mediationInfo");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating banner tablet async for adUnitId: " + adUnitId, null, false, 12, null);
        BuildersKt__Builders_commonKt.launch$default(INSTANCE.getScope(), null, null, new Moloco$createBannerTablet$1(mediationInfo, adUnitId, watermarkString, callback, null), 3, null);
    }

    public static /* synthetic */ void createBannerTablet$default(MediationInfo mediationInfo, String str, String str2, Function2 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        createBannerTablet(mediationInfo, str, str2, function2);
    }

    @JvmStatic
    public static final void createInterstitial(MediationInfo mediationInfo, String adUnitId, String watermarkString, Function2<? super InterstitialAd, ? super MolocoAdError.AdCreateError, Unit> callback) {
        Intrinsics.checkNotNullParameter(mediationInfo, "mediationInfo");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating interstitial ad for mediation async for adUnitId: " + adUnitId, null, false, 12, null);
        BuildersKt__Builders_commonKt.launch$default(INSTANCE.getScope(), null, null, new Moloco$createInterstitial$1(mediationInfo, adUnitId, watermarkString, callback, null), 3, null);
    }

    public static /* synthetic */ void createInterstitial$default(MediationInfo mediationInfo, String str, String str2, Function2 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        createInterstitial(mediationInfo, str, str2, function2);
    }

    @JvmStatic
    public static final void createMREC(MediationInfo mediationInfo, String adUnitId, String watermarkString, Function2<? super Banner, ? super MolocoAdError.AdCreateError, Unit> callback) {
        Intrinsics.checkNotNullParameter(mediationInfo, "mediationInfo");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating banner MREC async for adUnitId: " + adUnitId, null, false, 12, null);
        BuildersKt__Builders_commonKt.launch$default(INSTANCE.getScope(), null, null, new Moloco$createMREC$1(mediationInfo, adUnitId, watermarkString, callback, null), 3, null);
    }

    public static /* synthetic */ void createMREC$default(MediationInfo mediationInfo, String str, String str2, Function2 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        createMREC(mediationInfo, str, str2, function2);
    }

    @JvmStatic
    public static final void createMolocoBanner(MediationInfo mediationInfo, String adUnitId, BannerAdSize size, String watermarkString, Function2<? super Banner, ? super MolocoAdError.AdCreateError, Unit> callback) {
        Intrinsics.checkNotNullParameter(mediationInfo, "mediationInfo");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating Moloco banner async for adUnitId: " + adUnitId + ", size: " + size, null, false, 12, null);
        BuildersKt__Builders_commonKt.launch$default(INSTANCE.getScope(), null, null, new Moloco$createMolocoBanner$1(mediationInfo, size, adUnitId, watermarkString, callback, null), 3, null);
    }

    public static /* synthetic */ void createMolocoBanner$default(MediationInfo mediationInfo, String str, BannerAdSize bannerAdSize, String str2, Function2 function2, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        createMolocoBanner(mediationInfo, str, bannerAdSize, str2, function2);
    }

    @JvmStatic
    public static final void createNativeAd(MediationInfo mediationInfo, String adUnitId, String watermarkString, Function2<? super NativeAd, ? super MolocoAdError.AdCreateError, Unit> callback) {
        Intrinsics.checkNotNullParameter(mediationInfo, "mediationInfo");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating native ad for mediation async for adUnitId: " + adUnitId, null, false, 12, null);
        BuildersKt__Builders_commonKt.launch$default(INSTANCE.getScope(), null, null, new Moloco$createNativeAd$1(mediationInfo, adUnitId, watermarkString, callback, null), 3, null);
    }

    public static /* synthetic */ void createNativeAd$default(MediationInfo mediationInfo, String str, String str2, Function2 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        createNativeAd(mediationInfo, str, str2, function2);
    }

    @JvmStatic
    public static final void createRewardedInterstitial(MediationInfo mediationInfo, String adUnitId, String watermarkString, Function2<? super RewardedInterstitialAd, ? super MolocoAdError.AdCreateError, Unit> callback) {
        Intrinsics.checkNotNullParameter(mediationInfo, "mediationInfo");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating rewarded ad for mediation async for adUnitId: " + adUnitId, null, false, 12, null);
        BuildersKt__Builders_commonKt.launch$default(INSTANCE.getScope(), null, null, new Moloco$createRewardedInterstitial$1(mediationInfo, adUnitId, watermarkString, callback, null), 3, null);
    }

    public static /* synthetic */ void createRewardedInterstitial$default(MediationInfo mediationInfo, String str, String str2, Function2 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        createRewardedInterstitial(mediationInfo, str, str2, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4787b getAdCreator() {
        return (C4787b) adCreator.getValue();
    }

    @JvmStatic
    public static final void getBidToken(MediationInfo mediationInfo, Context context, MolocoBidTokenListener listener) {
        Intrinsics.checkNotNullParameter(mediationInfo, "mediationInfo");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        b.a(context);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Fetching bid token", null, false, 12, null);
        BuildersKt__Builders_commonKt.launch$default(c.f10710a.b(), null, null, new Moloco$getBidToken$1(MetricsRecorder.INSTANCE.create(mediationInfo.getName()), mediationInfo, listener, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h getBidTokenHandler() {
        return (h) bidTokenHandler.getValue();
    }

    public static /* synthetic */ void getInitJob$annotations() {
    }

    public static /* synthetic */ void getInitParams$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x getInitializationHandler() {
        return (x) initializationHandler.getValue();
    }

    public static /* synthetic */ void getPendingInitByMediator$moloco_sdk_release$annotations() {
    }

    private final CoroutineScope getScope() {
        return (CoroutineScope) scope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x initializationHandler_delegate$lambda$7() {
        return new x(a.h.f10873a.i());
    }

    @JvmStatic
    public static final void initialize(MolocoInitParams initParam) {
        Intrinsics.checkNotNullParameter(initParam, "initParam");
        initialize$default(initParam, null, 2, null);
    }

    public static /* synthetic */ void initialize$default(MolocoInitParams molocoInitParams, MolocoInitializationListener molocoInitializationListener, int i, Object obj) {
        if ((i & 2) != 0) {
            molocoInitializationListener = null;
        }
        initialize(molocoInitParams, molocoInitializationListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeAndroidClientMetrics(MolocoInitParams initParams2) {
        if (!getInitializationHandler().c()) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "Moloco", "ACM cannot be initialized as Moloco SDK cannot be initialized", null, false, 12, null);
            return;
        }
        com.moloco.sdk.internal.configs.a c = com.moloco.sdk.internal.configs.b.c();
        AndroidClientMetrics androidClientMetrics = AndroidClientMetrics.INSTANCE;
        String appKey = initParams2.getAppKey();
        String d = c.d();
        Context appContext = initParams2.getAppContext();
        long c2 = c.c();
        Pair pair = TuplesKt.to(com.moloco.sdk.acm.b.e, initParams2.getAppKey());
        a.e eVar = a.e.f10870a;
        AndroidClientMetrics.initialize$default(androidClientMetrics, new InitConfig(appKey, d, appContext, c2, MapsKt.mapOf(pair, TuplesKt.to(com.moloco.sdk.acm.b.f, eVar.h().invoke().b()), TuplesKt.to(com.moloco.sdk.acm.b.g, eVar.h().invoke().c()), TuplesKt.to(com.moloco.sdk.acm.b.h, BuildConfig.SDK_VERSION_NAME), TuplesKt.to(com.moloco.sdk.acm.b.d, eVar.l().invoke().w()), TuplesKt.to("osv", eVar.l().invoke().x()))), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeILRD() {
        Init.SDKInitResponse e = getInitializationHandler().e();
        if (e == null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "Moloco", "ILRD cannot be initialized as Moloco SDK is not initialized", null, false, 12, null);
            return;
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(a.b.f10867a.g().b(e));
        if (m8082exceptionOrNullimpl != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "ILRD initialization failed. " + m8082exceptionOrNullimpl.getMessage(), null, false, 12, null);
        }
    }

    public static final boolean isInitialized() {
        return INSTANCE.getInitializationHandler().d().getValue() == Initialization.SUCCESS;
    }

    @JvmStatic
    public static /* synthetic */ void isInitialized$annotations() {
    }

    private final void logMolocoInfo(MolocoInitParams initParam) {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "Moloco", "=====================================", null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "Moloco SDK initializing", null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "SDK Version: 4.10.1", null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "Mediation: " + initParam.getMediationInfo().getName(), null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "isInitialized: " + isInitialized(), null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "=====================================", null, false, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processInitConfigs(Init.SDKInitResponse sdkInitResponse) {
        if (sdkInitResponse.hasEventCollectionConfig()) {
            Init.SDKInitResponse.EventCollectionConfig eventCollectionConfig = sdkInitResponse.getEventCollectionConfig();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.debug$default(molocoLogger, "Moloco", "Init response has eventCollectionConfig", false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "eventCollectionConfig:", false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "eventCollectionEnabled: " + eventCollectionConfig.getEventCollectionEnabled(), false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "mrefCollectionEnabled: " + eventCollectionConfig.getMrefCollectionEnabled(), false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "appFgUrl: " + eventCollectionConfig.getAppForegroundTrackingUrl(), false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "appBgUrl: " + eventCollectionConfig.getAppBackgroundTrackingUrl(), false, 4, null);
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c c = a.k.f10876a.c();
            boolean eventCollectionEnabled = eventCollectionConfig.getEventCollectionEnabled();
            boolean mrefCollectionEnabled = eventCollectionConfig.getMrefCollectionEnabled();
            String appForegroundTrackingUrl = eventCollectionConfig.getAppForegroundTrackingUrl();
            Intrinsics.checkNotNullExpressionValue(appForegroundTrackingUrl, "getAppForegroundTrackingUrl(...)");
            String appBackgroundTrackingUrl = eventCollectionConfig.getAppBackgroundTrackingUrl();
            Intrinsics.checkNotNullExpressionValue(appBackgroundTrackingUrl, "getAppBackgroundTrackingUrl(...)");
            c.a(eventCollectionEnabled, mrefCollectionEnabled, appForegroundTrackingUrl, appBackgroundTrackingUrl);
            if (eventCollectionConfig.getEventCollectionEnabled()) {
                a.b.f10867a.e().a();
            }
        } else {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "Moloco", "Init response does not have eventCollectionConfig", false, 4, null);
        }
        a.c.f10868a.b().a(sdkInitResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineScope scope_delegate$lambda$10() {
        return CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldInitializeILRD(String mediationName) {
        Init.SDKInitResponse.ILRDConfig ilrdConfig;
        List<Init.SDKInitResponse.SupportedNetworks> supportedNetworksList;
        Init.SDKInitResponse e = getInitializationHandler().e();
        if (e == null || (ilrdConfig = e.getIlrdConfig()) == null || (supportedNetworksList = ilrdConfig.getSupportedNetworksList()) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(supportedNetworksList, 10));
        for (Init.SDKInitResponse.SupportedNetworks supportedNetworks : supportedNetworksList) {
            String lowerCase = ((supportedNetworks == null ? -1 : WhenMappings.$EnumSwitchMapping$0[supportedNetworks.ordinal()]) == 1 ? "LevelPlay" : supportedNetworks.name()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        String lowerCase2 = mediationName.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        return arrayList.contains(lowerCase2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateAndroidClientMetricsOnInitSuccess(Continuation<? super Unit> continuation) {
        Object updateConfig = AndroidClientMetrics.INSTANCE.updateConfig(new UpdateConfig(((com.moloco.sdk.internal.configs.a) a.c.f10868a.b().a(com.moloco.sdk.internal.configs.a.class, com.moloco.sdk.internal.configs.b.c())).d(), Boxing.boxLong(r0.c())), continuation);
        return updateConfig == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateConfig : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object clearState$moloco_sdk_release(Continuation<? super Unit> continuation) {
        Moloco$clearState$1 moloco$clearState$1;
        Object coroutine_suspended;
        int i;
        Moloco moloco;
        x initializationHandler2;
        if (continuation instanceof Moloco$clearState$1) {
            moloco$clearState$1 = (Moloco$clearState$1) continuation;
            int i2 = moloco$clearState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                moloco$clearState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = moloco$clearState$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = moloco$clearState$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, "Moloco", "clearState() unit testing function called", false, 4, null);
                    initParams = null;
                    Job job = initJob;
                    if (job != null) {
                        moloco$clearState$1.L$0 = this;
                        moloco$clearState$1.label = 1;
                        if (JobKt.cancelAndJoin(job, moloco$clearState$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    moloco = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    moloco = (Moloco) moloco$clearState$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                initJob = null;
                pendingInitByMediator.clear();
                initializationHandler2 = moloco.getInitializationHandler();
                moloco$clearState$1.L$0 = null;
                moloco$clearState$1.label = 2;
                if (initializationHandler2.b(moloco$clearState$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        moloco$clearState$1 = new Moloco$clearState$1(this, continuation);
        Object obj2 = moloco$clearState$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = moloco$clearState$1.label;
        if (i != 0) {
        }
        initJob = null;
        pendingInitByMediator.clear();
        initializationHandler2 = moloco.getInitializationHandler();
        moloco$clearState$1.L$0 = null;
        moloco$clearState$1.label = 2;
        if (initializationHandler2.b(moloco$clearState$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    public final String getAppKey$moloco_sdk_release() {
        MolocoInitParams molocoInitParams = initParams;
        if (molocoInitParams != null) {
            return molocoInitParams.getAppKey();
        }
        return null;
    }

    public final Set<String> getFailedMediations$moloco_sdk_release() {
        return CollectionsKt.toSet(_failedMediations);
    }

    public final Job getInitJob() {
        return initJob;
    }

    public final MolocoInitParams getInitParams() {
        return initParams;
    }

    public final Map<String, List<MolocoInitializationListener>> getPendingInitByMediator$moloco_sdk_release() {
        return pendingInitByMediator;
    }

    public final void setInitJob(Job job) {
        initJob = job;
    }

    public final void setInitParams(MolocoInitParams molocoInitParams) {
        initParams = molocoInitParams;
    }

    @JvmStatic
    public static final synchronized void initialize(MolocoInitParams initParam, MolocoInitializationListener listener) {
        Job launch$default;
        synchronized (Moloco.class) {
            Intrinsics.checkNotNullParameter(initParam, "initParam");
            Moloco moloco = INSTANCE;
            moloco.logMolocoInfo(initParam);
            if (initParam.getAppKey().length() == 0) {
                throw new IllegalArgumentException("Moloco SDK initialized with empty appKey");
            }
            if (isInitialized()) {
                if (Intrinsics.areEqual(initParam.getAppKey(), moloco.getAppKey$moloco_sdk_release())) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Already initialized. Returning and notifying listener", null, false, 12, null);
                    if (moloco.shouldInitializeILRD(initParam.getMediationInfo().getName())) {
                        moloco.initializeILRD();
                    }
                    if (listener != null) {
                        y.a(listener, x.f.a());
                    }
                } else {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Already initialized but with different appKey. Returning error and notifying listener", null, false, 12, null);
                    _failedMediations.add(initParam.getMediationInfo().getName());
                    MetricsRecorder.INSTANCE.create(initParam.getMediationInfo().getName()).recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.i.c()));
                    if (listener != null) {
                        y.a(listener, x.f.a(x.k));
                    }
                }
                return;
            }
            synchronized (moloco) {
                Job job = initJob;
                if (job == null || !job.isActive()) {
                    Unit unit = Unit.INSTANCE;
                    initParams = initParam;
                    b.a(initParam.getAppContext());
                    launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getIo()), null, null, new Moloco$initialize$2(initParam, listener, null), 3, null);
                    initJob = launch$default;
                    return;
                }
                String appKey = initParam.getAppKey();
                MolocoInitParams molocoInitParams = initParams;
                if (!Intrinsics.areEqual(appKey, molocoInitParams != null ? molocoInitParams.getAppKey() : null)) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Init Job active with different appKey. Notifying listener and avoiding init", null, false, 12, null);
                    _failedMediations.add(initParam.getMediationInfo().getName());
                    MetricsRecorder.INSTANCE.create(initParam.getMediationInfo().getName()).recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.i.c()));
                    if (listener != null) {
                        y.a(listener, x.f.a(x.l));
                    }
                    return;
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Init Job active with same appKey. Queuing listener and returning for mediator: " + initParam.getMediationInfo().getName(), null, false, 12, null);
                String name = initParam.getMediationInfo().getName();
                Map<String, List<MolocoInitializationListener>> map = pendingInitByMediator;
                List<MolocoInitializationListener> list = map.get(name);
                if (list == null) {
                    list = new ArrayList<>();
                    map.put(name, list);
                }
                List<MolocoInitializationListener> list2 = list;
                if (listener != null) {
                    list2.add(listener);
                }
            }
        }
    }
}
