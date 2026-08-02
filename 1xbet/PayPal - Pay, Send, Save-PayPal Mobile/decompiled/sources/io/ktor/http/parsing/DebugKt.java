package io.ktor.http.parsing;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lio/ktor/http/parsing/Grammar;", "", "offset", "", "printDebug", "(Lio/ktor/http/parsing/Grammar;I)V", "p0", "", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(ILjava/lang/Object;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DebugKt {
    public static /* synthetic */ void printDebug$default(io.ktor.http.parsing.Grammar grammar, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        printDebug(grammar, i);
    }

    public static final void printDebug(io.ktor.http.parsing.Grammar grammar, int i) {
        while (true) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grammar, "");
            if (grammar instanceof io.ktor.http.parsing.StringGrammar) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("STRING[");
                sb.append(kotlin.text.Regex.INSTANCE.escape(((io.ktor.http.parsing.StringGrammar) grammar).getValue()));
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                getHighResolutionOutputSizeshNQ4ISI(i, sb.toString());
                return;
            }
            if (grammar instanceof io.ktor.http.parsing.RawGrammar) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("STRING[");
                sb2.append(((io.ktor.http.parsing.RawGrammar) grammar).getValue());
                sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                getHighResolutionOutputSizeshNQ4ISI(i, sb2.toString());
                return;
            }
            if (grammar instanceof io.ktor.http.parsing.NamedGrammar) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("NAMED[");
                io.ktor.http.parsing.NamedGrammar namedGrammar = (io.ktor.http.parsing.NamedGrammar) grammar;
                sb3.append(namedGrammar.getName());
                sb3.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                getHighResolutionOutputSizeshNQ4ISI(i, sb3.toString());
                grammar = namedGrammar.getGrammar();
            } else {
                if (grammar instanceof io.ktor.http.parsing.SequenceGrammar) {
                    getHighResolutionOutputSizeshNQ4ISI(i, "SEQUENCE");
                    java.util.Iterator<T> it = ((io.ktor.http.parsing.SequenceGrammar) grammar).getGrammars().iterator();
                    while (it.hasNext()) {
                        printDebug((io.ktor.http.parsing.Grammar) it.next(), i + 2);
                    }
                    return;
                }
                if (grammar instanceof io.ktor.http.parsing.OrGrammar) {
                    getHighResolutionOutputSizeshNQ4ISI(i, "OR");
                    java.util.Iterator<T> it2 = ((io.ktor.http.parsing.OrGrammar) grammar).getGrammars().iterator();
                    while (it2.hasNext()) {
                        printDebug((io.ktor.http.parsing.Grammar) it2.next(), i + 2);
                    }
                    return;
                }
                if (grammar instanceof io.ktor.http.parsing.MaybeGrammar) {
                    getHighResolutionOutputSizeshNQ4ISI(i, "MAYBE");
                    grammar = ((io.ktor.http.parsing.MaybeGrammar) grammar).getGrammar();
                } else if (grammar instanceof io.ktor.http.parsing.ManyGrammar) {
                    getHighResolutionOutputSizeshNQ4ISI(i, "MANY");
                    grammar = ((io.ktor.http.parsing.ManyGrammar) grammar).getGrammar();
                } else if (grammar instanceof io.ktor.http.parsing.AtLeastOne) {
                    getHighResolutionOutputSizeshNQ4ISI(i, "MANY_NOT_EMPTY");
                    grammar = ((io.ktor.http.parsing.AtLeastOne) grammar).getGrammar();
                } else {
                    if (grammar instanceof io.ktor.http.parsing.AnyOfGrammar) {
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("ANY_OF[");
                        sb4.append(kotlin.text.Regex.INSTANCE.escape(((io.ktor.http.parsing.AnyOfGrammar) grammar).getValue()));
                        sb4.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                        getHighResolutionOutputSizeshNQ4ISI(i, sb4.toString());
                        return;
                    }
                    if (!(grammar instanceof io.ktor.http.parsing.RangeGrammar)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder("RANGE[");
                    io.ktor.http.parsing.RangeGrammar rangeGrammar = (io.ktor.http.parsing.RangeGrammar) grammar;
                    sb5.append(rangeGrammar.getFrom());
                    sb5.append('-');
                    sb5.append(rangeGrammar.getTo());
                    sb5.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                    getHighResolutionOutputSizeshNQ4ISI(i, sb5.toString());
                    return;
                }
            }
            i += 2;
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(int i, java.lang.Object obj) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.text.StringsKt.repeat(" ", i));
        sb.append(i / 2);
        sb.append(": ");
        sb.append(obj);
        java.lang.System.out.println((java.lang.Object) sb.toString());
    }
}
