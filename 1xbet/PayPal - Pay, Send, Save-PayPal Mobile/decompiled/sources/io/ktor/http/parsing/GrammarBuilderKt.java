package io.ktor.http.parsing;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Lio/ktor/http/parsing/GrammarBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lio/ktor/http/parsing/Grammar;", "grammar", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/http/parsing/Grammar;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class GrammarBuilderKt {
    public static final io.ktor.http.parsing.Grammar grammar(kotlin.jvm.functions.Function1<? super io.ktor.http.parsing.GrammarBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        io.ktor.http.parsing.GrammarBuilder grammarBuilder = new io.ktor.http.parsing.GrammarBuilder();
        function1.invoke(grammarBuilder);
        return grammarBuilder.build();
    }
}
