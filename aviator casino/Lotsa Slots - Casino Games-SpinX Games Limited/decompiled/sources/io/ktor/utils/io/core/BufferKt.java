package io.ktor.utils.io.core;

/* compiled from: Buffer.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003*>\b\u0007\u0010\n\"\u00020\u00002\u00020\u0000B0\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\"\b\u0007\u0012\u001e\b\u000bB\u001a\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\f\b\u000b\u0012\b\b\fJ\u0004\b\b(\f¨\u0006\r"}, d2 = {"Lkotlinx/io/Buffer;", "", "canRead", "(Lkotlinx/io/Buffer;)Z", "Lkotlin/Deprecated;", "message", io.ktor.utils.io.DeprecationKt.IO_DEPRECATION_MESSAGE, "replaceWith", "Lkotlin/ReplaceWith;", "expression", "Buffer", "imports", "kotlinx.io.Buffer", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BufferKt {
    @kotlin.Deprecated(message = io.ktor.utils.io.DeprecationKt.IO_DEPRECATION_MESSAGE, replaceWith = @kotlin.ReplaceWith(expression = "Buffer", imports = {"kotlinx.io.Buffer"}))
    public static /* synthetic */ void Buffer$annotations() {
    }

    public static final boolean canRead(kotlinx.io.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        return !buffer.exhausted();
    }
}
