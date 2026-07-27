package io.ktor.http.cio;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpParser.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.http.cio.HttpParserKt", f = "HttpParser.kt", i = {0, 0, 0, 0}, l = {Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE}, m = "parseHeaders", n = {"input", "builder", "range", "headers"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes7.dex */
final class HttpParserKt$parseHeaders$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    HttpParserKt$parseHeaders$2(Continuation<? super HttpParserKt$parseHeaders$2> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HttpParserKt.parseHeaders(null, null, null, this);
    }
}
