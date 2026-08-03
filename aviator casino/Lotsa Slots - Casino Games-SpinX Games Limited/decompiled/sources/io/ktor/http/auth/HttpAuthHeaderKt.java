package io.ktor.http.auth;

/* compiled from: HttpAuthHeader.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0002¢\u0006\u0004\b\u0003\u0010\f\u001a7\u0010\u000f\u001a\u0004\u0018\u00010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a3\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0018\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u001c\u001a\u00020\b*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010\u001e\u001a\u00020\b*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u0017\u001a\u0013\u0010 \u001a\u00020\u001f*\u00020\u001aH\u0002¢\u0006\u0004\b \u0010!\u001a\u0013\u0010\"\u001a\u00020\u001f*\u00020\u001aH\u0002¢\u0006\u0004\b\"\u0010!\"\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\"\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%\"\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)\"\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)¨\u0006+"}, d2 = {"", "headerValue", "Lio/ktor/http/auth/HttpAuthHeader;", "parseAuthorizationHeader", "(Ljava/lang/String;)Lio/ktor/http/auth/HttpAuthHeader;", "", "parseAuthorizationHeaders", "(Ljava/lang/String;)Ljava/util/List;", "", "startIndex", "", "headers", "(Ljava/lang/String;ILjava/util/List;)I", "header", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "nextChallengeIndex", "(Ljava/util/List;Lio/ktor/http/auth/HttpAuthHeader;ILjava/lang/String;)Ljava/lang/Integer;", "", "parameters", "matchParameters", "(Ljava/lang/String;ILjava/util/Map;)I", "matchParameter", "matchToken68", "(Ljava/lang/String;I)I", "unescaped", "(Ljava/lang/String;)Ljava/lang/String;", "", "delimiter", "skipDelimiter", "(Ljava/lang/String;IC)I", "skipSpaces", "", "isToken68", "(C)Z", "isToken", "", "TOKEN_EXTRA", "Ljava/util/Set;", "TOKEN68_EXTRA", "Lkotlin/text/Regex;", "token68Pattern", "Lkotlin/text/Regex;", "escapeRegex", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpAuthHeaderKt {
    private static final java.util.Set<java.lang.Character> TOKEN_EXTRA = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Character[]{'!', '#', java.lang.Character.valueOf(kotlin.text.Typography.dollar), '%', java.lang.Character.valueOf(kotlin.text.Typography.amp), '\'', java.lang.Character.valueOf(io.ktor.util.date.GMTDateParser.ANY), '+', '-', '.', '^', '_', '`', '|', '~'});
    private static final java.util.Set<java.lang.Character> TOKEN68_EXTRA = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Character[]{'-', '.', '_', '~', '+', java.lang.Character.valueOf(kotlinx.io.files.FileSystemKt.UnixPathSeparator)});
    private static final kotlin.text.Regex token68Pattern = new kotlin.text.Regex("[a-zA-Z0-9\\-._~+/]+=*");
    private static final kotlin.text.Regex escapeRegex = new kotlin.text.Regex("\\\\.");

    public static final io.ktor.http.auth.HttpAuthHeader parseAuthorizationHeader(java.lang.String headerValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerValue, "headerValue");
        int skipSpaces = skipSpaces(headerValue, 0);
        int i = skipSpaces;
        while (i < headerValue.length() && isToken(headerValue.charAt(i))) {
            i++;
        }
        java.lang.String substring = kotlin.text.StringsKt.substring(headerValue, kotlin.ranges.RangesKt.until(skipSpaces, i));
        int skipSpaces2 = skipSpaces(headerValue, i);
        if (kotlin.text.StringsKt.isBlank(substring)) {
            return null;
        }
        if (headerValue.length() == skipSpaces2) {
            return new io.ktor.http.auth.HttpAuthHeader.Parameterized(substring, kotlin.collections.CollectionsKt.emptyList(), (io.ktor.http.auth.HeaderValueEncoding) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        int matchToken68 = matchToken68(headerValue, skipSpaces2);
        java.lang.String obj = kotlin.text.StringsKt.trim((java.lang.CharSequence) kotlin.text.StringsKt.substring(headerValue, kotlin.ranges.RangesKt.until(skipSpaces2, matchToken68))).toString();
        if (obj.length() > 0 && matchToken68 == headerValue.length()) {
            return new io.ktor.http.auth.HttpAuthHeader.Single(substring, obj);
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (matchParameters(headerValue, skipSpaces2, linkedHashMap) == -1) {
            return new io.ktor.http.auth.HttpAuthHeader.Parameterized(substring, linkedHashMap, (io.ktor.http.auth.HeaderValueEncoding) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        throw new io.ktor.http.parsing.ParseException("Function parseAuthorizationHeader can parse only one header", null, 2, null);
    }

    public static final java.util.List<io.ktor.http.auth.HttpAuthHeader> parseAuthorizationHeaders(java.lang.String headerValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerValue, "headerValue");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        while (i != -1) {
            i = parseAuthorizationHeader(headerValue, i, arrayList);
        }
        return arrayList;
    }

    private static final int parseAuthorizationHeader(java.lang.String str, int i, java.util.List<io.ktor.http.auth.HttpAuthHeader> list) {
        java.lang.Integer nextChallengeIndex;
        int skipSpaces = skipSpaces(str, i);
        int i2 = skipSpaces;
        while (i2 < str.length() && isToken(str.charAt(i2))) {
            i2++;
        }
        java.lang.String substring = kotlin.text.StringsKt.substring(str, kotlin.ranges.RangesKt.until(skipSpaces, i2));
        if (kotlin.text.StringsKt.isBlank(substring)) {
            throw new io.ktor.http.parsing.ParseException("Invalid authScheme value: it should be token, can't be blank", null, 2, null);
        }
        int skipSpaces2 = skipSpaces(str, i2);
        java.lang.Integer nextChallengeIndex2 = nextChallengeIndex(list, new io.ktor.http.auth.HttpAuthHeader.Parameterized(substring, kotlin.collections.CollectionsKt.emptyList(), (io.ktor.http.auth.HeaderValueEncoding) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), skipSpaces2, str);
        if (nextChallengeIndex2 != null) {
            return nextChallengeIndex2.intValue();
        }
        int matchToken68 = matchToken68(str, skipSpaces2);
        java.lang.String obj = kotlin.text.StringsKt.trim((java.lang.CharSequence) kotlin.text.StringsKt.substring(str, kotlin.ranges.RangesKt.until(skipSpaces2, matchToken68))).toString();
        if (obj.length() > 0 && (nextChallengeIndex = nextChallengeIndex(list, new io.ktor.http.auth.HttpAuthHeader.Single(substring, obj), matchToken68, str)) != null) {
            return nextChallengeIndex.intValue();
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        int matchParameters = matchParameters(str, skipSpaces2, linkedHashMap);
        list.add(new io.ktor.http.auth.HttpAuthHeader.Parameterized(substring, linkedHashMap, (io.ktor.http.auth.HeaderValueEncoding) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return matchParameters;
    }

    private static final java.lang.Integer nextChallengeIndex(java.util.List<io.ktor.http.auth.HttpAuthHeader> list, io.ktor.http.auth.HttpAuthHeader httpAuthHeader, int i, java.lang.String str) {
        if (i != str.length() && str.charAt(i) != ',') {
            return null;
        }
        list.add(httpAuthHeader);
        if (i == str.length()) {
            return -1;
        }
        if (str.charAt(i) == ',') {
            return java.lang.Integer.valueOf(i + 1);
        }
        throw new java.lang.IllegalStateException("".toString());
    }

    private static final int matchParameters(java.lang.String str, int i, java.util.Map<java.lang.String, java.lang.String> map) {
        while (i > 0 && i < str.length()) {
            int matchParameter = matchParameter(str, i, map);
            if (matchParameter == i) {
                return i;
            }
            i = skipDelimiter(str, matchParameter, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        }
        return i;
    }

    private static final int matchParameter(java.lang.String str, int i, java.util.Map<java.lang.String, java.lang.String> map) {
        int i2;
        int skipSpaces = skipSpaces(str, i);
        int i3 = skipSpaces;
        while (i3 < str.length() && isToken(str.charAt(i3))) {
            i3++;
        }
        java.lang.String substring = kotlin.text.StringsKt.substring(str, kotlin.ranges.RangesKt.until(skipSpaces, i3));
        int skipSpaces2 = skipSpaces(str, i3);
        if (skipSpaces2 == str.length() || str.charAt(skipSpaces2) != '=') {
            return i;
        }
        boolean z = true;
        int skipSpaces3 = skipSpaces(str, skipSpaces2 + 1);
        if (str.charAt(skipSpaces3) == '\"') {
            skipSpaces3++;
            i2 = skipSpaces3;
            boolean z2 = false;
            while (i2 < str.length() && (str.charAt(i2) != '\"' || z2)) {
                z2 = !z2 && str.charAt(i2) == '\\';
                i2++;
            }
            if (i2 == str.length()) {
                throw new io.ktor.http.parsing.ParseException("Expected closing quote'\"' in parameter", null, 2, null);
            }
        } else {
            i2 = skipSpaces3;
            while (i2 < str.length() && str.charAt(i2) != ' ' && str.charAt(i2) != ',') {
                i2++;
            }
            z = false;
        }
        java.lang.String substring2 = kotlin.text.StringsKt.substring(str, kotlin.ranges.RangesKt.until(skipSpaces3, i2));
        if (z) {
            substring2 = unescaped(substring2);
        }
        map.put(substring, substring2);
        return z ? i2 + 1 : i2;
    }

    private static final int matchToken68(java.lang.String str, int i) {
        int skipSpaces = skipSpaces(str, i);
        while (skipSpaces < str.length() && isToken68(str.charAt(skipSpaces))) {
            skipSpaces++;
        }
        while (skipSpaces < str.length() && str.charAt(skipSpaces) == '=') {
            skipSpaces++;
        }
        return skipSpaces(str, skipSpaces);
    }

    private static final java.lang.String unescaped(java.lang.String str) {
        return escapeRegex.replace(str, new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.auth.HttpAuthHeaderKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.CharSequence unescaped$lambda$2;
                unescaped$lambda$2 = io.ktor.http.auth.HttpAuthHeaderKt.unescaped$lambda$2((kotlin.text.MatchResult) obj);
                return unescaped$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence unescaped$lambda$2(kotlin.text.MatchResult it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return kotlin.text.StringsKt.takeLast(it.getValue(), 1);
    }

    private static final int skipDelimiter(java.lang.String str, int i, char c) {
        int skipSpaces = skipSpaces(str, i);
        if (skipSpaces == str.length()) {
            return -1;
        }
        if (str.charAt(skipSpaces) != c) {
            throw new io.ktor.http.parsing.ParseException("Expected delimiter " + c + " at position " + skipSpaces, null, 2, null);
        }
        return skipSpaces(str, skipSpaces + 1);
    }

    private static final int skipSpaces(java.lang.String str, int i) {
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
        return i;
    }

    private static final boolean isToken68(char c) {
        return ('a' <= c && c < '{') || ('A' <= c && c < '[') || io.ktor.http.CookieUtilsKt.isDigit(c) || TOKEN68_EXTRA.contains(java.lang.Character.valueOf(c));
    }

    private static final boolean isToken(char c) {
        return ('a' <= c && c < '{') || ('A' <= c && c < '[') || io.ktor.http.CookieUtilsKt.isDigit(c) || TOKEN_EXTRA.contains(java.lang.Character.valueOf(c));
    }
}
