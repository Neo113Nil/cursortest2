package io.ktor.utils.io.core;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Lkotlinx/io/Sink;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlinx/io/Source;", "buildPacket", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/io/Source;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BuilderKt {
    public static final kotlinx.io.Source buildPacket(kotlin.jvm.functions.Function1<? super kotlinx.io.Sink, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
        function1.invoke(buffer);
        return buffer;
    }
}
