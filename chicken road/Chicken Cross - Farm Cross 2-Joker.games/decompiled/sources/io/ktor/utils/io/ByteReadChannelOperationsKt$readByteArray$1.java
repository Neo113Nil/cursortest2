package io.ktor.utils.io;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteReadChannelOperations.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 0}, l = {Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE}, m = "readByteArray", n = {"$this$readByteArray", "builder$iv", "$this$readByteArray_u24lambda_u242", "count"}, s = {"L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes7.dex */
final class ByteReadChannelOperationsKt$readByteArray$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    ByteReadChannelOperationsKt$readByteArray$1(Continuation<? super ByteReadChannelOperationsKt$readByteArray$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ByteReadChannelOperationsKt.readByteArray(null, 0, this);
    }
}
