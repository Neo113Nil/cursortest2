package io.ktor.http.parsing.regex;

/* compiled from: RegexParserGenerator.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001aA\u0010\r\u001a\u00020\f*\u00020\u00002\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a5\u0010\u0012\u001a\u00020\u0011*\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/http/parsing/Grammar;", "Lio/ktor/http/parsing/Parser;", "buildRegexParser", "(Lio/ktor/http/parsing/Grammar;)Lio/ktor/http/parsing/Parser;", "", "", "", "", "groups", "offset", "", "shouldGroup", "Lio/ktor/http/parsing/regex/GrammarRegex;", "toRegex", "(Lio/ktor/http/parsing/Grammar;Ljava/util/Map;IZ)Lio/ktor/http/parsing/regex/GrammarRegex;", com.ironsource.X3.i.W, "value", "", "add", "(Ljava/util/Map;Ljava/lang/String;I)V", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RegexParserGeneratorKt {
    public static final io.ktor.http.parsing.Parser buildRegexParser(io.ktor.http.parsing.Grammar grammar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grammar, "<this>");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        return new io.ktor.http.parsing.regex.RegexParser(new kotlin.text.Regex(toRegex$default(grammar, linkedHashMap, 0, false, 6, null).getRegex()), linkedHashMap);
    }

    static /* synthetic */ io.ktor.http.parsing.regex.GrammarRegex toRegex$default(io.ktor.http.parsing.Grammar grammar, java.util.Map map, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return toRegex(grammar, map, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final io.ktor.http.parsing.regex.GrammarRegex toRegex(io.ktor.http.parsing.Grammar grammar, java.util.Map<java.lang.String, java.util.List<java.lang.Integer>> map, int i, boolean z) {
        char c;
        if (grammar instanceof io.ktor.http.parsing.StringGrammar) {
            return new io.ktor.http.parsing.regex.GrammarRegex(kotlin.text.Regex.INSTANCE.escape(((io.ktor.http.parsing.StringGrammar) grammar).getValue()), 0, false, 6, null);
        }
        if (grammar instanceof io.ktor.http.parsing.RawGrammar) {
            return new io.ktor.http.parsing.regex.GrammarRegex(((io.ktor.http.parsing.RawGrammar) grammar).getValue(), 0, false, 6, null);
        }
        if (grammar instanceof io.ktor.http.parsing.NamedGrammar) {
            io.ktor.http.parsing.NamedGrammar namedGrammar = (io.ktor.http.parsing.NamedGrammar) grammar;
            io.ktor.http.parsing.regex.GrammarRegex regex$default = toRegex$default(namedGrammar.getGrammar(), map, i + 1, false, 4, null);
            add(map, namedGrammar.getName(), i);
            return new io.ktor.http.parsing.regex.GrammarRegex(regex$default.getRegex(), regex$default.getGroupsCount(), true);
        }
        if (grammar instanceof io.ktor.http.parsing.ComplexGrammar) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i2 = z ? i + 1 : i;
            int i3 = 0;
            for (java.lang.Object obj : ((io.ktor.http.parsing.ComplexGrammar) grammar).getGrammars()) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                io.ktor.http.parsing.regex.GrammarRegex regex = toRegex((io.ktor.http.parsing.Grammar) obj, map, i2, true);
                if (i3 != 0 && (grammar instanceof io.ktor.http.parsing.OrGrammar)) {
                    sb.append("|");
                }
                sb.append(regex.getRegex());
                i2 += regex.getGroupsCount();
                i3 = i4;
            }
            int i5 = i2 - i;
            if (z) {
                i5--;
            }
            java.lang.String sb2 = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            return new io.ktor.http.parsing.regex.GrammarRegex(sb2, i5, z);
        }
        if (grammar instanceof io.ktor.http.parsing.SimpleGrammar) {
            if (grammar instanceof io.ktor.http.parsing.MaybeGrammar) {
                c = '?';
            } else if (grammar instanceof io.ktor.http.parsing.ManyGrammar) {
                c = io.ktor.util.date.GMTDateParser.ANY;
            } else {
                if (!(grammar instanceof io.ktor.http.parsing.AtLeastOne)) {
                    throw new java.lang.IllegalStateException(("Unsupported simple grammar element: " + grammar).toString());
                }
                c = '+';
            }
            io.ktor.http.parsing.regex.GrammarRegex regex2 = toRegex(((io.ktor.http.parsing.SimpleGrammar) grammar).getGrammar(), map, i, true);
            return new io.ktor.http.parsing.regex.GrammarRegex(regex2.getRegex() + c, regex2.getGroupsCount(), false, 4, null);
        }
        if (grammar instanceof io.ktor.http.parsing.AnyOfGrammar) {
            return new io.ktor.http.parsing.regex.GrammarRegex(com.ironsource.X3.j.d + kotlin.text.Regex.INSTANCE.escape(((io.ktor.http.parsing.AnyOfGrammar) grammar).getValue()) + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST, 0, false, 6, null);
        }
        if (!(grammar instanceof io.ktor.http.parsing.RangeGrammar)) {
            throw new java.lang.IllegalStateException(("Unsupported grammar element: " + grammar).toString());
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(com.ironsource.X3.j.d);
        io.ktor.http.parsing.RangeGrammar rangeGrammar = (io.ktor.http.parsing.RangeGrammar) grammar;
        sb3.append(rangeGrammar.getFrom());
        sb3.append('-');
        sb3.append(rangeGrammar.getTo());
        sb3.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return new io.ktor.http.parsing.regex.GrammarRegex(sb3.toString(), 0, false, 6, null);
    }

    private static final void add(java.util.Map<java.lang.String, java.util.List<java.lang.Integer>> map, java.lang.String str, int i) {
        if (!map.containsKey(str)) {
            map.put(str, new java.util.ArrayList());
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
        java.util.List<java.lang.Integer> list = map.get(str);
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        list.add(valueOf);
    }
}
