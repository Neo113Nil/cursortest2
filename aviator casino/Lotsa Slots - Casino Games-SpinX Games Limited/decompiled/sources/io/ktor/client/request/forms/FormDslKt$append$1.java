package io.ktor.client.request.forms;

/* compiled from: formDsl.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes6.dex */
public final class FormDslKt$append$1 implements kotlin.jvm.functions.Function0<kotlinx.io.Source> {
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlinx.io.Sink, kotlin.Unit> $bodyBuilder;

    /* JADX WARN: Multi-variable type inference failed */
    public FormDslKt$append$1(kotlin.jvm.functions.Function1<? super kotlinx.io.Sink, kotlin.Unit> function1) {
        this.$bodyBuilder = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final kotlinx.io.Source invoke() {
        kotlin.jvm.functions.Function1<kotlinx.io.Sink, kotlin.Unit> function1 = this.$bodyBuilder;
        kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
        function1.invoke(buffer);
        return buffer;
    }
}
