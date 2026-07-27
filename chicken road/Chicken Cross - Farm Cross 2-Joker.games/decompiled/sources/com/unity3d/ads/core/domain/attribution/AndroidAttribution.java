package com.unity3d.ads.core.domain.attribution;

import android.adservices.AdServicesState;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.os.ext.SdkExtensions;
import android.view.InputEvent;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AndroidAttribution.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\u0012J\u001e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u0018J\u001e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u0018J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/unity3d/ads/core/domain/attribution/AndroidAttribution;", "", "context", "Landroid/content/Context;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "<init>", "(Landroid/content/Context;Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "measurementManager", "Landroid/adservices/measurement/MeasurementManager;", "getMeasurementManager", "()Landroid/adservices/measurement/MeasurementManager;", "measurementManager$delegate", "Lkotlin/Lazy;", "isAvailable", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerView", "url", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "(Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerClick", "getUri", "Landroid/net/Uri;", "baseUrl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidAttribution {
    private final ISDKDispatchers dispatchers;

    /* renamed from: measurementManager$delegate, reason: from kotlin metadata */
    private final Lazy measurementManager;
    private final SessionRepository sessionRepository;

    public AndroidAttribution(final Context context, ISDKDispatchers dispatchers, SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.dispatchers = dispatchers;
        this.sessionRepository = sessionRepository;
        this.measurementManager = LazyKt.lazy(new Function0() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MeasurementManager measurementManager;
                measurementManager = AndroidAttribution.this.getMeasurementManager(context);
                return measurementManager;
            }
        });
    }

    private final MeasurementManager getMeasurementManager() {
        return (MeasurementManager) this.measurementManager.getValue();
    }

    public final Object isAvailable(Continuation<? super Boolean> continuation) {
        if (Device.getApiLevel() < 33) {
            return Boxing.boxBoolean(false);
        }
        if (SdkExtensions.getExtensionVersion(1000000) < 4) {
            return Boxing.boxBoolean(false);
        }
        if (getMeasurementManager() == null) {
            return Boxing.boxBoolean(false);
        }
        if (!AdServicesState.isAdServicesStateEnabled()) {
            return Boxing.boxBoolean(false);
        }
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.getMeasurementApiStatus(ExecutorsKt.asExecutor(this.dispatchers.getDefault()), new OutcomeReceiver<Integer, Exception>() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$isAvailable$2$1
                @Override // android.os.OutcomeReceiver
                public /* bridge */ /* synthetic */ void onResult(Integer num) {
                    onResult(num.intValue());
                }

                public void onResult(int status) {
                    Continuation<Boolean> continuation2 = safeContinuation2;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m8079constructorimpl(Boolean.valueOf(status == 1)));
                }

                @Override // android.os.OutcomeReceiver
                public void onError(Exception error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    Continuation<Boolean> continuation2 = safeContinuation2;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m8079constructorimpl(false));
                }
            });
        } else {
            Result.Companion companion = Result.INSTANCE;
            safeContinuation2.resumeWith(Result.m8079constructorimpl(Boxing.boxBoolean(false)));
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public final Object registerView(String str, AdObject adObject, Continuation<? super Boolean> continuation) {
        if (getMeasurementManager() == null) {
            return Boxing.boxBoolean(false);
        }
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), null, ExecutorsKt.asExecutor(this.dispatchers.getDefault()), new OutcomeReceiver<Object, Exception>() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerView$2$1
                @Override // android.os.OutcomeReceiver
                public void onResult(Object p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    Continuation<Boolean> continuation2 = safeContinuation2;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m8079constructorimpl(true));
                }

                @Override // android.os.OutcomeReceiver
                public void onError(Exception error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    Continuation<Boolean> continuation2 = safeContinuation2;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m8079constructorimpl(false));
                }
            });
        } else {
            Result.Companion companion = Result.INSTANCE;
            safeContinuation2.resumeWith(Result.m8079constructorimpl(Boxing.boxBoolean(false)));
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public final Object registerClick(String str, AdObject adObject, Continuation<? super Boolean> continuation) {
        WebViewContainer webViewContainer;
        StateFlow<InputEvent> lastInputEvent;
        InputEvent value;
        if (getMeasurementManager() == null) {
            return Boxing.boxBoolean(false);
        }
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null || (webViewContainer = adPlayer.getWebViewContainer()) == null || (lastInputEvent = webViewContainer.getLastInputEvent()) == null || (value = lastInputEvent.getValue()) == null) {
            return Boxing.boxBoolean(false);
        }
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), value, ExecutorsKt.asExecutor(this.dispatchers.getDefault()), new OutcomeReceiver<Object, Exception>() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerClick$2$1
                @Override // android.os.OutcomeReceiver
                public void onResult(Object p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    Continuation<Boolean> continuation2 = safeContinuation2;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m8079constructorimpl(true));
                }

                @Override // android.os.OutcomeReceiver
                public void onError(Exception error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    Continuation<Boolean> continuation2 = safeContinuation2;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m8079constructorimpl(false));
                }
            });
        } else {
            Result.Companion companion = Result.INSTANCE;
            safeContinuation2.resumeWith(Result.m8079constructorimpl(Boxing.boxBoolean(false)));
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MeasurementManager getMeasurementManager(Context context) {
        if (Device.getApiLevel() >= 33 && SdkExtensions.getExtensionVersion(1000000) >= 4) {
            return (MeasurementManager) context.getSystemService(MeasurementManager.class);
        }
        return null;
    }

    private final Uri getUri(String baseUrl, AdObject adObject) {
        Uri parse = Uri.parse(baseUrl);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
        Uri build = parse.buildUpon().appendQueryParameter("sessionToken", ProtobufExtensionsKt.toBase64$default(this.sessionRepository.getSessionToken(), false, 1, null)).appendQueryParameter(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(adObject.getTrackingToken(), false, 1, null)).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
