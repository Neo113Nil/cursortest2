package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeSource;
import org.json.JSONArray;

/* compiled from: CommonCacheFile.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0082\u0001\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112H\u0010\u0013\u001aD\b\u0001\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u0014H\u0096B¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonCacheFile;", "Lcom/unity3d/ads/core/domain/CacheFile;", "cacheRepository", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "<init>", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "Lcom/unity3d/ads/core/data/model/CacheResult;", "url", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "headers", "Lorg/json/JSONArray;", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "intervalMs", "onProgress", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "bytesDownloaded", "totalBytes", "Lkotlin/coroutines/Continuation;", "", "", "(Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;Lorg/json/JSONArray;IILkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CommonCacheFile implements CacheFile {
    private final CacheRepository cacheRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonCacheFile(CacheRepository cacheRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.unity3d.ads.core.domain.CacheFile
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(String str, AdObject adObject, JSONArray jSONArray, int i, int i2, Function3<? super Long, ? super Long, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super CacheResult> continuation) {
        CommonCacheFile$invoke$1 commonCacheFile$invoke$1;
        int i3;
        AdObject adObject2;
        long j;
        CacheResult cacheResult;
        String str2;
        if (continuation instanceof CommonCacheFile$invoke$1) {
            commonCacheFile$invoke$1 = (CommonCacheFile$invoke$1) continuation;
            if ((commonCacheFile$invoke$1.label & Integer.MIN_VALUE) != 0) {
                commonCacheFile$invoke$1.label -= Integer.MIN_VALUE;
                CommonCacheFile$invoke$1 commonCacheFile$invoke$12 = commonCacheFile$invoke$1;
                Object obj = commonCacheFile$invoke$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = commonCacheFile$invoke$12.label;
                if (i3 != 0) {
                    ResultKt.throwOnFailure(obj);
                    long m9541markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m9541markNowz9LOYto();
                    CacheRepository cacheRepository = this.cacheRepository;
                    commonCacheFile$invoke$12.L$0 = adObject;
                    commonCacheFile$invoke$12.J$0 = m9541markNowz9LOYto;
                    commonCacheFile$invoke$12.label = 1;
                    Object file = cacheRepository.getFile(str, jSONArray, i, i2, function3, commonCacheFile$invoke$12);
                    if (file == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    adObject2 = adObject;
                    obj = file;
                    j = m9541markNowz9LOYto;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = commonCacheFile$invoke$12.J$0;
                    AdObject adObject3 = (AdObject) commonCacheFile$invoke$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    adObject2 = adObject3;
                }
                cacheResult = (CacheResult) obj;
                if (!(cacheResult instanceof CacheResult.Success)) {
                    CacheResult.Success success = (CacheResult.Success) cacheResult;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_CACHE_SUCCESS_TIME, Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m9542boximpl(j))), MapsKt.mapOf(TuplesKt.to("cache_source", success.getSource().toString()), TuplesKt.to("protocol", success.getCachedFile().getProtocol())), MapsKt.mapOf(TuplesKt.to("size_kb", Boxing.boxInt((int) (success.getCachedFile().getContentLength() / 1024)))), adObject2, (Integer) null, (ByteString) null, 96, (Object) null);
                } else {
                    if (!(cacheResult instanceof CacheResult.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
                    DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_CACHE_FAILURE_TIME;
                    Double boxDouble = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m9542boximpl(j)));
                    Pair[] pairArr = new Pair[3];
                    CacheResult.Failure failure = (CacheResult.Failure) cacheResult;
                    pairArr[0] = TuplesKt.to("cache_source", failure.getSource().toString());
                    pairArr[1] = TuplesKt.to("reason", failure.getError().toString());
                    Throwable reason = failure.getReason();
                    if (reason == null || (str2 = reason.getMessage()) == null) {
                        str2 = "";
                    }
                    pairArr[2] = TuplesKt.to("reason_debug", str2);
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, boxDouble, MapsKt.mapOf(pairArr), (Map) null, adObject2, (Integer) null, (ByteString) null, 104, (Object) null);
                }
                return cacheResult;
            }
        }
        commonCacheFile$invoke$1 = new CommonCacheFile$invoke$1(this, continuation);
        CommonCacheFile$invoke$1 commonCacheFile$invoke$122 = commonCacheFile$invoke$1;
        Object obj2 = commonCacheFile$invoke$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = commonCacheFile$invoke$122.label;
        if (i3 != 0) {
        }
        cacheResult = (CacheResult) obj2;
        if (!(cacheResult instanceof CacheResult.Success)) {
        }
        return cacheResult;
    }
}
