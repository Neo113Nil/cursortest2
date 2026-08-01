package com.unity3d.ads.core.data.repository;

import androidx.compose.material.MenuKt;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.TimeSource;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidCacheRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2", f = "AndroidCacheRepository.kt", i = {0, 0}, l = {144}, m = "invokeSuspend", n = {"shouldCleanCache", "nativeClearCacheStartTime"}, s = {"Z$0", "J$0"})
/* loaded from: classes7.dex */
final class AndroidCacheRepository$clearCache$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    long J$0;
    boolean Z$0;
    int label;
    final /* synthetic */ AndroidCacheRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidCacheRepository$clearCache$2(AndroidCacheRepository androidCacheRepository, Continuation<? super AndroidCacheRepository$clearCache$2> continuation) {
        super(2, continuation);
        this.this$0 = androidCacheRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AndroidCacheRepository$clearCache$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AndroidCacheRepository$clearCache$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0189 A[Catch: Exception -> 0x01bb, TryCatch #1 {Exception -> 0x01bb, blocks: (B:33:0x0146, B:36:0x0157, B:22:0x0195, B:16:0x017d, B:18:0x0189, B:20:0x018d), top: B:32:0x0146 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0146 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SessionRepository sessionRepository;
        boolean cleanCache;
        long m9541markNowz9LOYto;
        Object cacheSize;
        SessionRepository sessionRepository2;
        SessionRepository sessionRepository3;
        CleanupDirectory cleanupDirectory;
        File cacheDir;
        SendDiagnosticEvent sendDiagnosticEvent;
        SessionRepository sessionRepository4;
        SessionRepository sessionRepository5;
        CleanupDirectory cleanupDirectory2;
        File webviewCacheDir;
        SendDiagnosticEvent sendDiagnosticEvent2;
        SendDiagnosticEvent sendDiagnosticEvent3;
        File webviewCacheDir2;
        File[] listFiles;
        SendDiagnosticEvent sendDiagnosticEvent4;
        File cacheDir2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            sessionRepository = this.this$0.sessionRepository;
            cleanCache = sessionRepository.getNativeConfiguration().getDebugSettings().getCleanCache();
            m9541markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m9541markNowz9LOYto();
            this.Z$0 = cleanCache;
            this.J$0 = m9541markNowz9LOYto;
            this.label = 1;
            cacheSize = this.this$0.getCacheSize(this);
            if (cacheSize == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m9541markNowz9LOYto = this.J$0;
            boolean z = this.Z$0;
            ResultKt.throwOnFailure(obj);
            cacheSize = obj;
            cleanCache = z;
        }
        long longValue = ((Number) cacheSize).longValue();
        if (!cleanCache) {
            try {
                sessionRepository2 = this.this$0.sessionRepository;
            } catch (Throwable th) {
                sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_ASSETS_FAILURE_TIME;
                double elapsedMillis = TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m9542boximpl(m9541markNowz9LOYto));
                Map mapOf = MapsKt.mapOf(TuplesKt.to("size_kb", Boxing.boxInt((int) (longValue / 1024))));
                Pair[] pairArr = new Pair[2];
                pairArr[0] = TuplesKt.to("reason", th.getClass().getSimpleName());
                String message = th.getMessage();
                if (message == null) {
                    message = th.getClass().getSimpleName();
                }
                pairArr[1] = TuplesKt.to("reason_debug", message);
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, Boxing.boxDouble(elapsedMillis), MapsKt.mapOf(pairArr), mapOf, (AdObject) null, (Integer) null, (ByteString) null, 112, (Object) null);
            }
            if (sessionRepository2.getNativeConfiguration().hasCachedAssetsConfiguration()) {
                sessionRepository3 = this.this$0.sessionRepository;
                NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = sessionRepository3.getNativeConfiguration().getCachedAssetsConfiguration();
                cleanupDirectory = this.this$0.cleanupDirectory;
                cacheDir = this.this$0.getCacheDir();
                cleanupDirectory.invoke(cacheDir, cachedAssetsConfiguration.getMaxCachedAssetSizeMb(), cachedAssetsConfiguration.getMaxCachedAssetAgeMs());
                sendDiagnosticEvent4 = this.this$0.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent4, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_ASSETS_SUCCESS_TIME, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m9542boximpl(m9541markNowz9LOYto))), (Map) null, MapsKt.mapOf(TuplesKt.to("size_kb", Boxing.boxInt((int) (longValue / 1024)))), (AdObject) null, (Integer) null, (ByteString) null, 116, (Object) null);
                long m9541markNowz9LOYto2 = TimeSource.Monotonic.INSTANCE.m9541markNowz9LOYto();
                if (!cleanCache) {
                    try {
                        sessionRepository4 = this.this$0.sessionRepository;
                    } catch (Exception e) {
                        sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
                        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType2 = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_FAILURE_TIME;
                        Double boxDouble = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m9542boximpl(m9541markNowz9LOYto2)));
                        Pair[] pairArr2 = new Pair[2];
                        pairArr2[0] = TuplesKt.to("reason", e.getClass().getSimpleName());
                        String message2 = e.getMessage();
                        if (message2 == null) {
                            message2 = e.getClass().getSimpleName();
                        }
                        pairArr2[1] = TuplesKt.to("reason_debug", message2);
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, diagnosticEventType2, boxDouble, MapsKt.mapOf(pairArr2), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, MenuKt.InTransitionDuration, (Object) null);
                    }
                    if (sessionRepository4.getNativeConfiguration().hasCachedWebviewFilesConfiguration()) {
                        sessionRepository5 = this.this$0.sessionRepository;
                        NativeConfigurationOuterClass.CachedAssetsConfiguration cachedWebviewFilesConfiguration = sessionRepository5.getNativeConfiguration().getCachedWebviewFilesConfiguration();
                        cleanupDirectory2 = this.this$0.cleanupDirectory;
                        webviewCacheDir = this.this$0.getWebviewCacheDir();
                        cleanupDirectory2.invoke(webviewCacheDir, cachedWebviewFilesConfiguration.getMaxCachedAssetSizeMb(), cachedWebviewFilesConfiguration.getMaxCachedAssetAgeMs());
                        sendDiagnosticEvent3 = this.this$0.sendDiagnosticEvent;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_SUCCESS_TIME, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m9542boximpl(m9541markNowz9LOYto2))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
                        return Unit.INSTANCE;
                    }
                }
                webviewCacheDir2 = this.this$0.getWebviewCacheDir();
                listFiles = webviewCacheDir2.listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        file.delete();
                    }
                }
                sendDiagnosticEvent3 = this.this$0.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_SUCCESS_TIME, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m9542boximpl(m9541markNowz9LOYto2))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
                return Unit.INSTANCE;
            }
        }
        cacheDir2 = this.this$0.getCacheDir();
        File[] listFiles2 = cacheDir2.listFiles();
        if (listFiles2 != null) {
            for (File file2 : listFiles2) {
                file2.delete();
            }
        }
        sendDiagnosticEvent4 = this.this$0.sendDiagnosticEvent;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent4, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_ASSETS_SUCCESS_TIME, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m9542boximpl(m9541markNowz9LOYto))), (Map) null, MapsKt.mapOf(TuplesKt.to("size_kb", Boxing.boxInt((int) (longValue / 1024)))), (AdObject) null, (Integer) null, (ByteString) null, 116, (Object) null);
        long m9541markNowz9LOYto22 = TimeSource.Monotonic.INSTANCE.m9541markNowz9LOYto();
        if (!cleanCache) {
        }
        webviewCacheDir2 = this.this$0.getWebviewCacheDir();
        listFiles = webviewCacheDir2.listFiles();
        if (listFiles != null) {
        }
        sendDiagnosticEvent3 = this.this$0.sendDiagnosticEvent;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CLEAN_WEBVIEW_SUCCESS_TIME, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m9542boximpl(m9541markNowz9LOYto22))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
        return Unit.INSTANCE;
    }
}
