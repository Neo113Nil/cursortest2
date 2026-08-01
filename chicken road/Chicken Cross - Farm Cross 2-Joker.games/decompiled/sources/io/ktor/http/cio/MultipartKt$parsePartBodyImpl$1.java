package io.ktor.http.cio;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Multipart.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.http.cio.MultipartKt", f = "Multipart.kt", i = {0, 1, 1, 1, 2, 3}, l = {Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 136}, m = "parsePartBodyImpl", n = {"output", "boundaryPrefixed", "input", "output", "output", "byteCount"}, s = {"L$0", "L$0", "L$1", "L$2", "L$0", "J$0"})
/* loaded from: classes7.dex */
final class MultipartKt$parsePartBodyImpl$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    MultipartKt$parsePartBodyImpl$1(Continuation<? super MultipartKt$parsePartBodyImpl$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object parsePartBodyImpl;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        parsePartBodyImpl = MultipartKt.parsePartBodyImpl(null, null, null, null, 0L, this);
        return parsePartBodyImpl;
    }
}
