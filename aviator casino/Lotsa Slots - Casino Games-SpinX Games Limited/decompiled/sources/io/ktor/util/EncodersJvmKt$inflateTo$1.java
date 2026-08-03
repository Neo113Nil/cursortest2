package io.ktor.util;

/* compiled from: EncodersJvm.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.EncodersJvmKt", f = "EncodersJvm.kt", i = {0}, l = {171}, m = "inflateTo", n = {"inflated"}, s = {"I$0"})
/* loaded from: classes6.dex */
final class EncodersJvmKt$inflateTo$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ java.lang.Object result;

    EncodersJvmKt$inflateTo$1(kotlin.coroutines.Continuation<? super io.ktor.util.EncodersJvmKt$inflateTo$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object inflateTo;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        inflateTo = io.ktor.util.EncodersJvmKt.inflateTo(null, null, null, null, this);
        return inflateTo;
    }
}
