package io.ktor.utils.io.core;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003*\n\u0010\u0004\"\u00020\u00002\u00020\u0000"}, d2 = {"Lkotlinx/io/Buffer;", "", "canRead", "(Lkotlinx/io/Buffer;)Z", "Buffer"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BufferKt {
    @kotlin.Deprecated(message = io.ktor.utils.io.DeprecationKt.IO_DEPRECATION_MESSAGE, replaceWith = @kotlin.ReplaceWith(expression = "Buffer", imports = {"kotlinx.io.Buffer"}))
    public static /* synthetic */ void Buffer$annotations() {
    }

    public static final boolean canRead(kotlinx.io.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        return !buffer.exhausted();
    }
}
