package io.ktor.websocket;

import androidx.media3.extractor.ts.TsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RawWebSocketCommon.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.RawWebSocketCommon", f = "RawWebSocketCommon.kt", i = {0}, l = {Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 134, TsExtractor.TS_STREAM_TYPE_DTS_UHD}, m = "flush", n = {"it"}, s = {"L$1"})
/* loaded from: classes7.dex */
final class RawWebSocketCommon$flush$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RawWebSocketCommon this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RawWebSocketCommon$flush$1(RawWebSocketCommon rawWebSocketCommon, Continuation<? super RawWebSocketCommon$flush$1> continuation) {
        super(continuation);
        this.this$0 = rawWebSocketCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.flush(this);
    }
}
