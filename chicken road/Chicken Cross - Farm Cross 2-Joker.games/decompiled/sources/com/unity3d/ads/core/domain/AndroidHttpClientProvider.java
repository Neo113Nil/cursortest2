package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.android.gms.net.CronetProviderInstaller;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.CronetClient;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.core.OkHttp3Client;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlin.time.TimeSource;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import okhttp3.OkHttpClient;
import org.chromium.net.CronetEngine;

/* compiled from: AndroidHttpClientProvider.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0012\u001a\u00020\u0011H\u0096B¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u0013J&\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHttpClientProvider;", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "context", "Landroid/content/Context;", "cronetEngineBuilderFactory", "Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;", "mediationTraitsMetadataReader", "Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;", "<init>", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Landroid/content/Context;Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;)V", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "cachedClient", "Lcom/unity3d/services/core/network/core/HttpClient;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createHttpClient", "buildNetworkClient", "selectedHttpClient", "Lcom/unity3d/ads/core/domain/HttpClientSelection;", "(Landroid/content/Context;Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/ads/core/domain/HttpClientSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOkHttp3Client", "Lcom/unity3d/services/core/network/core/OkHttp3Client;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidHttpClientProvider implements HttpClientProvider {
    private HttpClient cachedClient;
    private final Context context;
    private final CronetEngineBuilderFactory cronetEngineBuilderFactory;
    private final ISDKDispatchers dispatchers;
    private final MediationTraitsMetadataReader mediationTraitsMetadataReader;
    private final Mutex mutex;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidHttpClientProvider(ISDKDispatchers dispatchers, SendDiagnosticEvent sendDiagnosticEvent, Context context, CronetEngineBuilderFactory cronetEngineBuilderFactory, MediationTraitsMetadataReader mediationTraitsMetadataReader) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cronetEngineBuilderFactory, "cronetEngineBuilderFactory");
        Intrinsics.checkNotNullParameter(mediationTraitsMetadataReader, "mediationTraitsMetadataReader");
        this.dispatchers = dispatchers;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.context = context;
        this.cronetEngineBuilderFactory = cronetEngineBuilderFactory;
        this.mediationTraitsMetadataReader = mediationTraitsMetadataReader;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d A[Catch: all -> 0x0073, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0073, blocks: (B:25:0x0055, B:29:0x005d), top: B:24:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.unity3d.ads.core.domain.HttpClientProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(Continuation<? super HttpClient> continuation) {
        AndroidHttpClientProvider$invoke$1 androidHttpClientProvider$invoke$1;
        int i;
        Mutex mutex;
        Mutex mutex2;
        Throwable th;
        HttpClient httpClient;
        try {
            if (continuation instanceof AndroidHttpClientProvider$invoke$1) {
                androidHttpClientProvider$invoke$1 = (AndroidHttpClientProvider$invoke$1) continuation;
                if ((androidHttpClientProvider$invoke$1.label & Integer.MIN_VALUE) != 0) {
                    androidHttpClientProvider$invoke$1.label -= Integer.MIN_VALUE;
                    Object obj = androidHttpClientProvider$invoke$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = androidHttpClientProvider$invoke$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.mutex;
                        androidHttpClientProvider$invoke$1.L$0 = mutex;
                        androidHttpClientProvider$invoke$1.label = 1;
                        if (mutex.lock(null, androidHttpClientProvider$invoke$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (Mutex) androidHttpClientProvider$invoke$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                HttpClient httpClient2 = (HttpClient) obj;
                                this.cachedClient = httpClient2;
                                mutex2.unlock(null);
                                return httpClient2;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        Mutex mutex3 = (Mutex) androidHttpClientProvider$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                    }
                    httpClient = this.cachedClient;
                    if (httpClient != null) {
                        androidHttpClientProvider$invoke$1.L$0 = mutex;
                        androidHttpClientProvider$invoke$1.label = 2;
                        Object createHttpClient = createHttpClient(androidHttpClientProvider$invoke$1);
                        if (createHttpClient == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex2 = mutex;
                        obj = createHttpClient;
                        HttpClient httpClient22 = (HttpClient) obj;
                        this.cachedClient = httpClient22;
                        mutex2.unlock(null);
                        return httpClient22;
                    }
                    mutex.unlock(null);
                    return httpClient;
                }
            }
            httpClient = this.cachedClient;
            if (httpClient != null) {
            }
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
        androidHttpClientProvider$invoke$1 = new AndroidHttpClientProvider$invoke$1(this, continuation);
        Object obj2 = androidHttpClientProvider$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidHttpClientProvider$invoke$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
    
        if (r15 == null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createHttpClient(Continuation<? super HttpClient> continuation) {
        AndroidHttpClientProvider$createHttpClient$1 androidHttpClientProvider$createHttpClient$1;
        int i;
        Object m8079constructorimpl;
        HttpClientSelection httpClientSelection;
        long j;
        HttpClientSelection httpClientSelection2;
        String str;
        if (continuation instanceof AndroidHttpClientProvider$createHttpClient$1) {
            androidHttpClientProvider$createHttpClient$1 = (AndroidHttpClientProvider$createHttpClient$1) continuation;
            if ((androidHttpClientProvider$createHttpClient$1.label & Integer.MIN_VALUE) != 0) {
                androidHttpClientProvider$createHttpClient$1.label -= Integer.MIN_VALUE;
                Object obj = androidHttpClientProvider$createHttpClient$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidHttpClientProvider$createHttpClient$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String stringTrait = this.mediationTraitsMetadataReader.getStringTrait(MediationTraitsMetadataReader.USE_HTTP_CLIENT);
                    if (stringTrait != null) {
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            AndroidHttpClientProvider androidHttpClientProvider = this;
                            String upperCase = stringTrait.toUpperCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                            m8079constructorimpl = Result.m8079constructorimpl(HttpClientSelection.valueOf(upperCase));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
                        }
                        if (Result.m8085isFailureimpl(m8079constructorimpl)) {
                            m8079constructorimpl = null;
                        }
                        httpClientSelection = (HttpClientSelection) m8079constructorimpl;
                    }
                    httpClientSelection = HttpClientSelection.CRONET_WITHOUT_QUIC;
                    long m9541markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m9541markNowz9LOYto();
                    AndroidHttpClientProvider$createHttpClient$client$1 androidHttpClientProvider$createHttpClient$client$1 = new AndroidHttpClientProvider$createHttpClient$client$1(httpClientSelection, this, null);
                    androidHttpClientProvider$createHttpClient$1.L$0 = httpClientSelection;
                    androidHttpClientProvider$createHttpClient$1.J$0 = m9541markNowz9LOYto;
                    androidHttpClientProvider$createHttpClient$1.label = 1;
                    Object withTimeoutOrNull = TimeoutKt.withTimeoutOrNull(500L, androidHttpClientProvider$createHttpClient$client$1, androidHttpClientProvider$createHttpClient$1);
                    if (withTimeoutOrNull == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j = m9541markNowz9LOYto;
                    httpClientSelection2 = httpClientSelection;
                    obj = withTimeoutOrNull;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = androidHttpClientProvider$createHttpClient$1.J$0;
                    httpClientSelection2 = (HttpClientSelection) androidHttpClientProvider$createHttpClient$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                HttpClient httpClient = (HttpClient) obj;
                double m9462toDoubleimpl = Duration.m9462toDoubleimpl(TimeSource.Monotonic.ValueTimeMark.m9546elapsedNowUwyO8pc(j), DurationUnit.MILLISECONDS);
                if (StringsKt.contains$default((CharSequence) httpClientSelection2.name(), (CharSequence) "CRONET", false, 2, (Object) null)) {
                    if (httpClient == null) {
                        str = "native_cronet_timeout";
                    } else {
                        str = httpClient instanceof CronetClient ? "native_cronet_success_time" : "native_cronet_failure_time";
                    }
                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, str, Boxing.boxDouble(m9462toDoubleimpl), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
                }
                return httpClient != null ? getOkHttp3Client() : httpClient;
            }
        }
        androidHttpClientProvider$createHttpClient$1 = new AndroidHttpClientProvider$createHttpClient$1(this, continuation);
        Object obj2 = androidHttpClientProvider$createHttpClient$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidHttpClientProvider$createHttpClient$1.label;
        if (i != 0) {
        }
        HttpClient httpClient2 = (HttpClient) obj2;
        double m9462toDoubleimpl2 = Duration.m9462toDoubleimpl(TimeSource.Monotonic.ValueTimeMark.m9546elapsedNowUwyO8pc(j), DurationUnit.MILLISECONDS);
        if (StringsKt.contains$default((CharSequence) httpClientSelection2.name(), (CharSequence) "CRONET", false, 2, (Object) null)) {
        }
        if (httpClient2 != null) {
        }
    }

    public final OkHttp3Client getOkHttp3Client() {
        return new OkHttp3Client(this.dispatchers, new OkHttpClient());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object buildNetworkClient(final Context context, final ISDKDispatchers iSDKDispatchers, final HttpClientSelection httpClientSelection, Continuation<? super HttpClient> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        CronetProviderInstaller.installProvider(context).addOnCompleteListener(ExecutorsKt.asExecutor(iSDKDispatchers.getIo()), new OnCompleteListener() { // from class: com.unity3d.ads.core.domain.AndroidHttpClientProvider$buildNetworkClient$2$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task<Void> it) {
                String str;
                SendDiagnosticEvent sendDiagnosticEvent;
                CronetEngineBuilderFactory cronetEngineBuilderFactory;
                SendDiagnosticEvent sendDiagnosticEvent2;
                String message;
                Intrinsics.checkNotNullParameter(it, "it");
                str = "Errored without message.";
                if (it.isSuccessful()) {
                    try {
                        cronetEngineBuilderFactory = AndroidHttpClientProvider.this.cronetEngineBuilderFactory;
                        CronetEngine.Builder createCronetEngineBuilder = cronetEngineBuilderFactory.createCronetEngineBuilder(context);
                        if (httpClientSelection == HttpClientSelection.CRONET_WITH_QUIC) {
                            createCronetEngineBuilder.enableQuic(true);
                            createCronetEngineBuilder.addQuicHint(ServiceProvider.GATEWAY_HOST, 443, 443);
                            createCronetEngineBuilder.addQuicHint(ServiceProvider.CDN_CREATIVES_HOST, 443, 443);
                        }
                        CronetEngine build = createCronetEngineBuilder.build();
                        CancellableContinuation<HttpClient> cancellableContinuation = cancellableContinuationImpl2;
                        Result.Companion companion = Result.INSTANCE;
                        Intrinsics.checkNotNull(build);
                        cancellableContinuation.resumeWith(Result.m8079constructorimpl(new CronetClient(build, iSDKDispatchers)));
                        return;
                    } catch (Throwable th) {
                        sendDiagnosticEvent = AndroidHttpClientProvider.this.sendDiagnosticEvent;
                        String message2 = th.getMessage();
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_cronet_engine_error", (Double) null, MapsKt.mapOf(TuplesKt.to("reason", message2 != null ? message2 : "Errored without message.")), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
                        CancellableContinuation<HttpClient> cancellableContinuation2 = cancellableContinuationImpl2;
                        Result.Companion companion2 = Result.INSTANCE;
                        cancellableContinuation2.resumeWith(Result.m8079constructorimpl(AndroidHttpClientProvider.this.getOkHttp3Client()));
                        return;
                    }
                }
                sendDiagnosticEvent2 = AndroidHttpClientProvider.this.sendDiagnosticEvent;
                Exception exception = it.getException();
                if (exception != null && (message = exception.getMessage()) != null) {
                    str = message;
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, "native_cronet_install_error", (Double) null, MapsKt.mapOf(TuplesKt.to("reason", str)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
                CancellableContinuation<HttpClient> cancellableContinuation3 = cancellableContinuationImpl2;
                Result.Companion companion3 = Result.INSTANCE;
                cancellableContinuation3.resumeWith(Result.m8079constructorimpl(AndroidHttpClientProvider.this.getOkHttp3Client()));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
