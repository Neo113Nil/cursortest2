package kotlinx.coroutines.channels;

/* compiled from: Channels.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0003¢\u0006\u0002\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"trySendBlocking", "Lkotlinx/coroutines/channels/ChannelResult;", "", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/SendChannel;", "element", "(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Object;)Ljava/lang/Object;", "sendBlocking", "(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
/* loaded from: classes6.dex */
final /* synthetic */ class ChannelsKt__ChannelsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> java.lang.Object trySendBlocking(kotlinx.coroutines.channels.SendChannel<? super E> sendChannel, E e) {
        java.lang.Object runBlocking$default;
        java.lang.Object mo10716trySendJP2dKIU = sendChannel.mo10716trySendJP2dKIU(e);
        if (mo10716trySendJP2dKIU instanceof kotlinx.coroutines.channels.ChannelResult.Failed) {
            runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2(sendChannel, e, null), 1, null);
            return ((kotlinx.coroutines.channels.ChannelResult) runBlocking$default).getHolder();
        }
        return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m12333successJP2dKIU(kotlin.Unit.INSTANCE);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @kotlin.ReplaceWith(expression = "trySendBlocking(element)", imports = {}))
    public static final /* synthetic */ void sendBlocking(kotlinx.coroutines.channels.SendChannel sendChannel, java.lang.Object obj) {
        if (kotlinx.coroutines.channels.ChannelResult.m12328isSuccessimpl(sendChannel.mo10716trySendJP2dKIU(obj))) {
            return;
        }
        kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1(sendChannel, obj, null), 1, null);
    }
}
