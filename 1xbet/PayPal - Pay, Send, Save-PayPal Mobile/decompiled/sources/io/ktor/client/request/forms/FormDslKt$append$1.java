package io.ktor.client.request.forms;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes17.dex */
public final class FormDslKt$append$1 implements kotlin.jvm.functions.Function0<kotlinx.io.Source> {
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlinx.io.Sink, kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function0
    public final kotlinx.io.Source invoke() {
        kotlin.jvm.functions.Function1<kotlinx.io.Sink, kotlin.Unit> function1 = this.getHighSpeedVideoSizes;
        kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
        function1.invoke(buffer);
        return buffer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FormDslKt$append$1(kotlin.jvm.functions.Function1<? super kotlinx.io.Sink, kotlin.Unit> function1) {
        this.getHighSpeedVideoSizes = function1;
    }
}
