package io.ktor.utils.io.core;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/io/Source;", "Lkotlinx/io/Sink;", "output", "", "copyTo", "(Lkotlinx/io/Source;Lkotlinx/io/Sink;)J"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CopyKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use transferTo instead", replaceWith = @kotlin.ReplaceWith(expression = "output.transferTo(this)", imports = {"kotlinx.io.transferTo"}))
    public static final long copyTo(kotlinx.io.Source source, kotlinx.io.Sink sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        return source.transferTo(sink);
    }
}
