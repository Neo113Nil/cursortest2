package io.ktor.http.parsing;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lio/ktor/http/parsing/NamedGrammar;", "Lio/ktor/http/parsing/Grammar;", "", "name", "grammar", "<init>", "(Ljava/lang/String;Lio/ktor/http/parsing/Grammar;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lio/ktor/http/parsing/Grammar;", "getGrammar", "()Lio/ktor/http/parsing/Grammar;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NamedGrammar extends io.ktor.http.parsing.Grammar {
    private final io.ktor.http.parsing.Grammar grammar;
    private final java.lang.String name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NamedGrammar(java.lang.String str, io.ktor.http.parsing.Grammar grammar) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grammar, "");
        this.name = str;
        this.grammar = grammar;
    }

    public final io.ktor.http.parsing.Grammar getGrammar() {
        return this.grammar;
    }

    public final java.lang.String getName() {
        return this.name;
    }
}
