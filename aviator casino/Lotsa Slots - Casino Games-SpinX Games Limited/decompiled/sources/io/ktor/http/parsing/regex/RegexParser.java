package io.ktor.http.parsing.regex;

/* compiled from: RegexParser.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/http/parsing/regex/RegexParser;", "Lio/ktor/http/parsing/Parser;", "Lkotlin/text/Regex;", "expression", "", "", "", "", "indexes", "<init>", "(Lkotlin/text/Regex;Ljava/util/Map;)V", "input", "Lio/ktor/http/parsing/ParseResult;", "parse", "(Ljava/lang/String;)Lio/ktor/http/parsing/ParseResult;", "", "match", "(Ljava/lang/String;)Z", "Lkotlin/text/Regex;", "Ljava/util/Map;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RegexParser implements io.ktor.http.parsing.Parser {
    private final kotlin.text.Regex expression;
    private final java.util.Map<java.lang.String, java.util.List<java.lang.Integer>> indexes;

    /* JADX WARN: Multi-variable type inference failed */
    public RegexParser(kotlin.text.Regex expression, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.Integer>> indexes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expression, "expression");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(indexes, "indexes");
        this.expression = expression;
        this.indexes = indexes;
    }

    @Override // io.ktor.http.parsing.Parser
    public io.ktor.http.parsing.ParseResult parse(java.lang.String input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        kotlin.text.MatchResult matchEntire = this.expression.matchEntire(input);
        if (matchEntire == null || matchEntire.getValue().length() != input.length()) {
            return null;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.Integer>> entry : this.indexes.entrySet()) {
            java.lang.String key = entry.getKey();
            java.util.Iterator<T> it = entry.getValue().iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) it.next()).intValue();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                kotlin.text.MatchGroup matchGroup = matchEntire.getGroups().get(intValue);
                if (matchGroup != null) {
                    arrayList.add(matchGroup.getValue());
                }
                if (!arrayList.isEmpty()) {
                    linkedHashMap.put(key, arrayList);
                }
            }
        }
        return new io.ktor.http.parsing.ParseResult(linkedHashMap);
    }

    @Override // io.ktor.http.parsing.Parser
    public boolean match(java.lang.String input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        return this.expression.matches(input);
    }
}
