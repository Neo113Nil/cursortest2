package io.ktor.http.parsing.regex;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a=\u0010\r\u001a\u00020\f*\u00020\u00002\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lio/ktor/http/parsing/Grammar;", "Lio/ktor/http/parsing/Parser;", "buildRegexParser", "(Lio/ktor/http/parsing/Grammar;)Lio/ktor/http/parsing/Parser;", "", "", "", "", "p0", "p1", "", "p2", "Lio/ktor/http/parsing/regex/GrammarRegex;", "getHighSpeedVideoFpsRanges", "(Lio/ktor/http/parsing/Grammar;Ljava/util/Map;IZ)Lio/ktor/http/parsing/regex/GrammarRegex;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RegexParserGeneratorKt {
    public static final io.ktor.http.parsing.Parser buildRegexParser(io.ktor.http.parsing.Grammar grammar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grammar, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        return new io.ktor.http.parsing.regex.RegexParser(new kotlin.text.Regex(getHighSpeedVideoFpsRanges(grammar, linkedHashMap, 1, false).getHighSpeedVideoSizes), linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final io.ktor.http.parsing.regex.GrammarRegex getHighSpeedVideoFpsRanges(io.ktor.http.parsing.Grammar grammar, java.util.Map<java.lang.String, java.util.List<java.lang.Integer>> map, int i, boolean z) {
        char c;
        if (grammar instanceof io.ktor.http.parsing.StringGrammar) {
            return new io.ktor.http.parsing.regex.GrammarRegex(kotlin.text.Regex.INSTANCE.escape(((io.ktor.http.parsing.StringGrammar) grammar).getValue()), 0, false, 6, null);
        }
        if (grammar instanceof io.ktor.http.parsing.RawGrammar) {
            return new io.ktor.http.parsing.regex.GrammarRegex(((io.ktor.http.parsing.RawGrammar) grammar).getValue(), 0, false, 6, null);
        }
        int i2 = 0;
        if (grammar instanceof io.ktor.http.parsing.NamedGrammar) {
            io.ktor.http.parsing.NamedGrammar namedGrammar = (io.ktor.http.parsing.NamedGrammar) grammar;
            io.ktor.http.parsing.regex.GrammarRegex highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(namedGrammar.getGrammar(), map, i + 1, false);
            java.lang.String name2 = namedGrammar.getName();
            if (!map.containsKey(name2)) {
                map.put(name2, new java.util.ArrayList());
            }
            java.util.List<java.lang.Integer> list = map.get(name2);
            kotlin.jvm.internal.Intrinsics.checkNotNull(list);
            list.add(java.lang.Integer.valueOf(i));
            return new io.ktor.http.parsing.regex.GrammarRegex(highSpeedVideoFpsRanges.getHighSpeedVideoSizes, highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI, true);
        }
        if (grammar instanceof io.ktor.http.parsing.ComplexGrammar) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i3 = z ? i + 1 : i;
            for (java.lang.Object obj : ((io.ktor.http.parsing.ComplexGrammar) grammar).getGrammars()) {
                if (i2 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                io.ktor.http.parsing.regex.GrammarRegex highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges((io.ktor.http.parsing.Grammar) obj, map, i3, true);
                if (i2 != 0 && (grammar instanceof io.ktor.http.parsing.OrGrammar)) {
                    sb.append(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
                }
                sb.append(highSpeedVideoFpsRanges2.getHighSpeedVideoSizes);
                i3 += highSpeedVideoFpsRanges2.getHighResolutionOutputSizeshNQ4ISI;
                i2++;
            }
            int i4 = i3 - i;
            if (z) {
                i4--;
            }
            java.lang.String obj2 = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
            return new io.ktor.http.parsing.regex.GrammarRegex(obj2, i4, z);
        }
        if (grammar instanceof io.ktor.http.parsing.SimpleGrammar) {
            if (grammar instanceof io.ktor.http.parsing.MaybeGrammar) {
                c = '?';
            } else if (grammar instanceof io.ktor.http.parsing.ManyGrammar) {
                c = '*';
            } else {
                if (!(grammar instanceof io.ktor.http.parsing.AtLeastOne)) {
                    throw new java.lang.IllegalStateException("Unsupported simple grammar element: ".concat(java.lang.String.valueOf(grammar)).toString());
                }
                c = '+';
            }
            io.ktor.http.parsing.regex.GrammarRegex highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(((io.ktor.http.parsing.SimpleGrammar) grammar).getGrammar(), map, i, true);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(highSpeedVideoFpsRanges3.getHighSpeedVideoSizes);
            sb2.append(c);
            return new io.ktor.http.parsing.regex.GrammarRegex(sb2.toString(), highSpeedVideoFpsRanges3.getHighResolutionOutputSizeshNQ4ISI, false, 4, null);
        }
        if (grammar instanceof io.ktor.http.parsing.AnyOfGrammar) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("[");
            sb3.append(kotlin.text.Regex.INSTANCE.escape(((io.ktor.http.parsing.AnyOfGrammar) grammar).getValue()));
            sb3.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            return new io.ktor.http.parsing.regex.GrammarRegex(sb3.toString(), 0, false, 6, null);
        }
        if (!(grammar instanceof io.ktor.http.parsing.RangeGrammar)) {
            throw new java.lang.IllegalStateException("Unsupported grammar element: ".concat(java.lang.String.valueOf(grammar)).toString());
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("[");
        io.ktor.http.parsing.RangeGrammar rangeGrammar = (io.ktor.http.parsing.RangeGrammar) grammar;
        sb4.append(rangeGrammar.getFrom());
        sb4.append('-');
        sb4.append(rangeGrammar.getTo());
        sb4.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return new io.ktor.http.parsing.regex.GrammarRegex(sb4.toString(), 0, false, 6, null);
    }
}
