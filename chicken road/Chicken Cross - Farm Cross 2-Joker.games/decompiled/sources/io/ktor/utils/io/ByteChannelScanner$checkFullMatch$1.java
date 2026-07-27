package io.ktor.utils.io;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannelScanner.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteChannelScanner", f = "ByteChannelScanner.kt", i = {}, l = {Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 142}, m = "checkFullMatch", n = {}, s = {})
/* loaded from: classes7.dex */
final class ByteChannelScanner$checkFullMatch$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ByteChannelScanner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ByteChannelScanner$checkFullMatch$1(ByteChannelScanner byteChannelScanner, Continuation<? super ByteChannelScanner$checkFullMatch$1> continuation) {
        super(continuation);
        this.this$0 = byteChannelScanner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object checkFullMatch;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        checkFullMatch = this.this$0.checkFullMatch(this);
        return checkFullMatch;
    }
}
