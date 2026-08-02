package io.ktor.http.parsing;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00018\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lio/ktor/http/parsing/MaybeGrammar;", "Lio/ktor/http/parsing/Grammar;", "Lio/ktor/http/parsing/SimpleGrammar;", "grammar", "<init>", "(Lio/ktor/http/parsing/Grammar;)V", "Lio/ktor/http/parsing/Grammar;", "getGrammar", "()Lio/ktor/http/parsing/Grammar;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MaybeGrammar extends io.ktor.http.parsing.Grammar implements io.ktor.http.parsing.SimpleGrammar {
    private final io.ktor.http.parsing.Grammar grammar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaybeGrammar(io.ktor.http.parsing.Grammar grammar) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grammar, "");
        this.grammar = grammar;
    }

    @Override // io.ktor.http.parsing.SimpleGrammar
    public final io.ktor.http.parsing.Grammar getGrammar() {
        return this.grammar;
    }
}
