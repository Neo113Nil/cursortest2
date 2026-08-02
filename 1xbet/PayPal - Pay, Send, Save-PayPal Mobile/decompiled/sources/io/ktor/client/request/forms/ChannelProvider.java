package io.ktor.client.request.forms;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lio/ktor/client/request/forms/ChannelProvider;", "", "", io.ktor.http.ContentDisposition.Parameters.Size, "Lkotlin/Function0;", "Lio/ktor/utils/io/ByteReadChannel;", "block", "<init>", "(Ljava/lang/Long;Lkotlin/jvm/functions/Function0;)V", "Ljava/lang/Long;", "getSize", "()Ljava/lang/Long;", "Lkotlin/jvm/functions/Function0;", "getBlock", "()Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ChannelProvider {
    private final kotlin.jvm.functions.Function0<io.ktor.utils.io.ByteReadChannel> block;
    private final java.lang.Long size;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelProvider(java.lang.Long l, kotlin.jvm.functions.Function0<? extends io.ktor.utils.io.ByteReadChannel> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.size = l;
        this.block = function0;
    }

    public /* synthetic */ ChannelProvider(java.lang.Long l, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, function0);
    }

    public final kotlin.jvm.functions.Function0<io.ktor.utils.io.ByteReadChannel> getBlock() {
        return this.block;
    }

    public final java.lang.Long getSize() {
        return this.size;
    }
}
