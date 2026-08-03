package io.ktor.http.parsing;

/* compiled from: Debug.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/http/parsing/Grammar;", "", "offset", "", "printDebug", "(Lio/ktor/http/parsing/Grammar;I)V", "", "node", "printlnWithOffset", "(ILjava/lang/Object;)V", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DebugKt {
    public static /* synthetic */ void printDebug$default(io.ktor.http.parsing.Grammar grammar, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        printDebug(grammar, i);
    }

    public static final void printDebug(io.ktor.http.parsing.Grammar grammar, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grammar, "<this>");
        if (grammar instanceof io.ktor.http.parsing.StringGrammar) {
            printlnWithOffset(i, "STRING[" + kotlin.text.Regex.INSTANCE.escape(((io.ktor.http.parsing.StringGrammar) grammar).getValue()) + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            return;
        }
        if (grammar instanceof io.ktor.http.parsing.RawGrammar) {
            printlnWithOffset(i, "STRING[" + ((io.ktor.http.parsing.RawGrammar) grammar).getValue() + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            return;
        }
        if (grammar instanceof io.ktor.http.parsing.NamedGrammar) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NAMED[");
            io.ktor.http.parsing.NamedGrammar namedGrammar = (io.ktor.http.parsing.NamedGrammar) grammar;
            sb.append(namedGrammar.getName());
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            printlnWithOffset(i, sb.toString());
            printDebug(namedGrammar.getGrammar(), i + 2);
            return;
        }
        if (grammar instanceof io.ktor.http.parsing.SequenceGrammar) {
            printlnWithOffset(i, "SEQUENCE");
            java.util.Iterator<T> it = ((io.ktor.http.parsing.SequenceGrammar) grammar).getGrammars().iterator();
            while (it.hasNext()) {
                printDebug((io.ktor.http.parsing.Grammar) it.next(), i + 2);
            }
            return;
        }
        if (grammar instanceof io.ktor.http.parsing.OrGrammar) {
            printlnWithOffset(i, "OR");
            java.util.Iterator<T> it2 = ((io.ktor.http.parsing.OrGrammar) grammar).getGrammars().iterator();
            while (it2.hasNext()) {
                printDebug((io.ktor.http.parsing.Grammar) it2.next(), i + 2);
            }
            return;
        }
        if (grammar instanceof io.ktor.http.parsing.MaybeGrammar) {
            printlnWithOffset(i, "MAYBE");
            printDebug(((io.ktor.http.parsing.MaybeGrammar) grammar).getGrammar(), i + 2);
            return;
        }
        if (grammar instanceof io.ktor.http.parsing.ManyGrammar) {
            printlnWithOffset(i, "MANY");
            printDebug(((io.ktor.http.parsing.ManyGrammar) grammar).getGrammar(), i + 2);
            return;
        }
        if (grammar instanceof io.ktor.http.parsing.AtLeastOne) {
            printlnWithOffset(i, "MANY_NOT_EMPTY");
            printDebug(((io.ktor.http.parsing.AtLeastOne) grammar).getGrammar(), i + 2);
            return;
        }
        if (grammar instanceof io.ktor.http.parsing.AnyOfGrammar) {
            printlnWithOffset(i, "ANY_OF[" + kotlin.text.Regex.INSTANCE.escape(((io.ktor.http.parsing.AnyOfGrammar) grammar).getValue()) + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            return;
        }
        if (!(grammar instanceof io.ktor.http.parsing.RangeGrammar)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("RANGE[");
        io.ktor.http.parsing.RangeGrammar rangeGrammar = (io.ktor.http.parsing.RangeGrammar) grammar;
        sb2.append(rangeGrammar.getFrom());
        sb2.append('-');
        sb2.append(rangeGrammar.getTo());
        sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        printlnWithOffset(i, sb2.toString());
    }

    private static final void printlnWithOffset(int i, java.lang.Object obj) {
        java.lang.System.out.println((java.lang.Object) (kotlin.text.StringsKt.repeat(io.ktor.sse.ServerSentEventKt.SPACE, i) + (i / 2) + ": " + obj));
    }
}
