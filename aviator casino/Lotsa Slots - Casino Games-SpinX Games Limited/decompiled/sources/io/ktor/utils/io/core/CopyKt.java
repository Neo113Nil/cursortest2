package io.ktor.utils.io.core;

/* compiled from: Copy.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/io/Source;", "Lkotlinx/io/Sink;", "output", "", "copyTo", "(Lkotlinx/io/Source;Lkotlinx/io/Sink;)J", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CopyKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use transferTo instead", replaceWith = @kotlin.ReplaceWith(expression = "output.transferTo(this)", imports = {"kotlinx.io.transferTo"}))
    public static final long copyTo(kotlinx.io.Source source, kotlinx.io.Sink output) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
        return source.transferTo(output);
    }
}
