package io.ktor.client.request.forms;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.io.Buffer;
import kotlinx.io.Sink;
import kotlinx.io.Source;

/* compiled from: formDsl.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes7.dex */
public final class FormDslKt$append$1 implements Function0<Source> {
    final /* synthetic */ Function1<Sink, Unit> $bodyBuilder;

    /* JADX WARN: Multi-variable type inference failed */
    public FormDslKt$append$1(Function1<? super Sink, Unit> function1) {
        this.$bodyBuilder = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Source invoke() {
        Function1<Sink, Unit> function1 = this.$bodyBuilder;
        Buffer buffer = new Buffer();
        function1.invoke(buffer);
        return buffer;
    }
}
