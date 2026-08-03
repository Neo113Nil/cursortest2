package io.ktor.serialization;

/* compiled from: ContentConverter.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.serialization.ContentConverterKt", f = "ContentConverter.kt", i = {0, 0}, l = {113}, m = "deserialize", n = {"body", "typeInfo"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
final class ContentConverterKt$deserialize$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;

    ContentConverterKt$deserialize$1(kotlin.coroutines.Continuation<? super io.ktor.serialization.ContentConverterKt$deserialize$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return io.ktor.serialization.ContentConverterKt.deserialize(null, null, null, null, this);
    }
}
