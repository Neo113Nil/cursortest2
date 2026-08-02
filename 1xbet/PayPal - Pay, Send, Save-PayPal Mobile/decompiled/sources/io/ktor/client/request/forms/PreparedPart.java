package io.ktor.client.request.forms;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b2\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0012\u0013"}, d2 = {"Lio/ktor/client/request/forms/PreparedPart;", "", "", "p0", "", "p1", "<init>", "([BLjava/lang/Long;)V", "headers", "[B", "getHeaders", "()[B", io.ktor.http.ContentDisposition.Parameters.Size, "Ljava/lang/Long;", "getSize", "()Ljava/lang/Long;", "InputPart", "ChannelPart", "Lio/ktor/client/request/forms/PreparedPart$ChannelPart;", "Lio/ktor/client/request/forms/PreparedPart$InputPart;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
abstract class PreparedPart {
    private final byte[] headers;
    private final java.lang.Long size;

    private PreparedPart(byte[] bArr, java.lang.Long l) {
        this.headers = bArr;
        this.size = l;
    }

    public final byte[] getHeaders() {
        return this.headers;
    }

    public final java.lang.Long getSize() {
        return this.size;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR!\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00048\u0007¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lio/ktor/client/request/forms/PreparedPart$InputPart;", "Lio/ktor/client/request/forms/PreparedPart;", "", "headers", "Lkotlin/Function0;", "Lkotlinx/io/Source;", "Lio/ktor/utils/io/core/Input;", "provider", "", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "([BLkotlin/jvm/functions/Function0;Ljava/lang/Long;)V", "Lkotlin/jvm/functions/Function0;", "getProvider", "()Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputPart extends io.ktor.client.request.forms.PreparedPart {
        private final kotlin.jvm.functions.Function0<kotlinx.io.Source> provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public InputPart(byte[] bArr, kotlin.jvm.functions.Function0<? extends kotlinx.io.Source> function0, java.lang.Long l) {
            super(bArr, l, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
            this.provider = function0;
        }

        public final kotlin.jvm.functions.Function0<kotlinx.io.Source> getProvider() {
            return this.provider;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lio/ktor/client/request/forms/PreparedPart$ChannelPart;", "Lio/ktor/client/request/forms/PreparedPart;", "", "headers", "Lkotlin/Function0;", "Lio/ktor/utils/io/ByteReadChannel;", "provider", "", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "([BLkotlin/jvm/functions/Function0;Ljava/lang/Long;)V", "Lkotlin/jvm/functions/Function0;", "getProvider", "()Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ChannelPart extends io.ktor.client.request.forms.PreparedPart {
        private final kotlin.jvm.functions.Function0<io.ktor.utils.io.ByteReadChannel> provider;

        public final kotlin.jvm.functions.Function0<io.ktor.utils.io.ByteReadChannel> getProvider() {
            return this.provider;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ChannelPart(byte[] bArr, kotlin.jvm.functions.Function0<? extends io.ktor.utils.io.ByteReadChannel> function0, java.lang.Long l) {
            super(bArr, l, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
            this.provider = function0;
        }
    }

    public /* synthetic */ PreparedPart(byte[] bArr, java.lang.Long l, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, l);
    }
}
