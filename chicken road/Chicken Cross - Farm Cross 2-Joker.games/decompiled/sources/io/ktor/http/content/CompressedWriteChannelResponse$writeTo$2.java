package io.ktor.http.content;

import com.mbridge.msdk.out.MBSupportMuteAdType;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelKt;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CompressedContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.http.content.CompressedWriteChannelResponse$writeTo$2", f = "CompressedContent.kt", i = {0}, l = {MBSupportMuteAdType.REWARD_VIDEO}, m = "invokeSuspend", n = {"$this$use$iv"}, s = {"L$0"})
/* loaded from: classes7.dex */
final class CompressedWriteChannelResponse$writeTo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ByteWriteChannel $channel;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CompressedWriteChannelResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CompressedWriteChannelResponse$writeTo$2(CompressedWriteChannelResponse compressedWriteChannelResponse, ByteWriteChannel byteWriteChannel, Continuation<? super CompressedWriteChannelResponse$writeTo$2> continuation) {
        super(2, continuation);
        this.this$0 = compressedWriteChannelResponse;
        this.$channel = byteWriteChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CompressedWriteChannelResponse$writeTo$2 compressedWriteChannelResponse$writeTo$2 = new CompressedWriteChannelResponse$writeTo$2(this.this$0, this.$channel, continuation);
        compressedWriteChannelResponse$writeTo$2.L$0 = obj;
        return compressedWriteChannelResponse$writeTo$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CompressedWriteChannelResponse$writeTo$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ByteWriteChannel byteWriteChannel;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ByteWriteChannel encode = this.this$0.getEncoder().encode(this.$channel, ((CoroutineScope) this.L$0).getCoroutineContext());
            try {
                OutgoingContent.WriteChannelContent original = this.this$0.getOriginal();
                this.L$0 = encode;
                this.label = 1;
                if (original.writeTo(encode, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                byteWriteChannel = encode;
            } catch (Throwable th2) {
                byteWriteChannel = encode;
                th = th2;
                ByteWriteChannelOperationsKt.close(byteWriteChannel, th);
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteWriteChannel = (ByteWriteChannel) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
                try {
                    ByteWriteChannelOperationsKt.close(byteWriteChannel, th);
                    throw th;
                } catch (Throwable th4) {
                    ByteWriteChannelKt.close(byteWriteChannel);
                    throw th4;
                }
            }
        }
        ByteWriteChannelKt.close(byteWriteChannel);
        return Unit.INSTANCE;
    }
}
