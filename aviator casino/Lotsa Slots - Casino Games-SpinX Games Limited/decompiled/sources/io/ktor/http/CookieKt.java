package io.ktor.http;

/* compiled from: Cookie.kt */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\f\u001a\u008d\u0001\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\u001c\u001a\u001d\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001d\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b \u0010\u001e\u001a\u0013\u0010!\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010$\u001a\u00020\u0005*\u00020#H\u0002¢\u0006\u0004\b$\u0010%\u001a*\u0010'\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010&2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082\b¢\u0006\u0004\b'\u0010(\u001a\"\u0010)\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010&H\u0082\b¢\u0006\u0004\b)\u0010*\u001a \u0010+\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0005H\u0082\b¢\u0006\u0004\b+\u0010,\u001a\"\u0010-\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0000H\u0082\b¢\u0006\u0004\b-\u0010.\u001a\u0013\u0010/\u001a\u00020\u0012*\u00020\u0000H\u0002¢\u0006\u0004\b/\u00100\"\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u0000018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103\"\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106\"\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020#018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00103¨\u00068"}, d2 = {"", "cookiesHeader", "Lio/ktor/http/Cookie;", "parseServerSetCookieHeader", "(Ljava/lang/String;)Lio/ktor/http/Cookie;", "", "skipEscaped", "", "parseClientCookiesHeader", "(Ljava/lang/String;Z)Ljava/util/Map;", "cookie", "renderSetCookieHeader", "(Lio/ktor/http/Cookie;)Ljava/lang/String;", "renderCookieHeader", "name", "value", "Lio/ktor/http/CookieEncoding;", "encoding", "", "maxAge", "Lio/ktor/util/date/GMTDate;", "expires", com.ironsource.X3.j.D, "path", "secure", "httpOnly", "extensions", "includeEncoding", "(Ljava/lang/String;Ljava/lang/String;Lio/ktor/http/CookieEncoding;Ljava/lang/Integer;Lio/ktor/util/date/GMTDate;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Z)Ljava/lang/String;", "encodeCookieValue", "(Ljava/lang/String;Lio/ktor/http/CookieEncoding;)Ljava/lang/String;", "encodedValue", "decodeCookieValue", "assertCookieName", "(Ljava/lang/String;)Ljava/lang/String;", "", "shouldEscapeInCookies", "(C)Z", "", "cookiePart", "(Ljava/lang/String;Ljava/lang/Object;Lio/ktor/http/CookieEncoding;)Ljava/lang/String;", "cookiePartUnencoded", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;", "cookiePartFlag", "(Ljava/lang/String;Z)Ljava/lang/String;", "cookiePartExt", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "toIntClamping", "(Ljava/lang/String;)I", "", "loweredPartNames", "Ljava/util/Set;", "Lkotlin/text/Regex;", "clientCookieHeaderPattern", "Lkotlin/text/Regex;", "cookieCharsShouldBeEscaped", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CookieKt {
    private static final java.util.Set<java.lang.String> loweredPartNames = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{io.ktor.client.utils.CacheControl.MAX_AGE, "expires", com.ironsource.X3.j.D, "path", "secure", "httponly", "$x-enc"});
    private static final kotlin.text.Regex clientCookieHeaderPattern = new kotlin.text.Regex("(^|;)\\s*([^;=\\{\\}\\s]+)\\s*(=\\s*(\"[^\"]*\"|[^;]*))?");
    private static final java.util.Set<java.lang.Character> cookieCharsShouldBeEscaped = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Character[]{';', java.lang.Character.valueOf(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA), '\"'});

    /* compiled from: Cookie.kt */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[io.ktor.http.CookieEncoding.values().length];
            try {
                iArr[io.ktor.http.CookieEncoding.RAW.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[io.ktor.http.CookieEncoding.DQUOTES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[io.ktor.http.CookieEncoding.BASE64_ENCODING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[io.ktor.http.CookieEncoding.URI_ENCODING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final io.ktor.http.Cookie parseServerSetCookieHeader(java.lang.String cookiesHeader) {
        io.ktor.http.CookieEncoding cookieEncoding;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookiesHeader, "cookiesHeader");
        java.util.Map<java.lang.String, java.lang.String> parseClientCookiesHeader = parseClientCookiesHeader(cookiesHeader, false);
        java.util.Iterator<T> it = parseClientCookiesHeader.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (!kotlin.text.StringsKt.startsWith$default((java.lang.String) entry.getKey(), "$", false, 2, (java.lang.Object) null)) {
                java.lang.String str = parseClientCookiesHeader.get("$x-enc");
                if (str == null || (cookieEncoding = io.ktor.http.CookieEncoding.valueOf(str)) == null) {
                    cookieEncoding = io.ktor.http.CookieEncoding.RAW;
                }
                io.ktor.http.CookieEncoding cookieEncoding2 = cookieEncoding;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(parseClientCookiesHeader.size()));
                java.util.Iterator<T> it2 = parseClientCookiesHeader.entrySet().iterator();
                while (it2.hasNext()) {
                    java.util.Map.Entry entry2 = (java.util.Map.Entry) it2.next();
                    linkedHashMap.put(io.ktor.util.TextKt.toLowerCasePreservingASCIIRules((java.lang.String) entry2.getKey()), entry2.getValue());
                }
                java.lang.String str2 = (java.lang.String) entry.getKey();
                java.lang.String decodeCookieValue = decodeCookieValue((java.lang.String) entry.getValue(), cookieEncoding2);
                java.lang.String str3 = (java.lang.String) linkedHashMap.get(io.ktor.client.utils.CacheControl.MAX_AGE);
                java.lang.Integer valueOf = str3 != null ? java.lang.Integer.valueOf(toIntClamping(str3)) : null;
                java.lang.String str4 = (java.lang.String) linkedHashMap.get("expires");
                io.ktor.util.date.GMTDate fromCookieToGmtDate = str4 != null ? io.ktor.http.DateUtilsKt.fromCookieToGmtDate(str4) : null;
                java.lang.String str5 = (java.lang.String) linkedHashMap.get(com.ironsource.X3.j.D);
                java.lang.String str6 = (java.lang.String) linkedHashMap.get("path");
                boolean containsKey = linkedHashMap.containsKey("secure");
                boolean containsKey2 = linkedHashMap.containsKey("httponly");
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry3 : parseClientCookiesHeader.entrySet()) {
                    java.lang.String key = entry3.getKey();
                    if (!loweredPartNames.contains(io.ktor.util.TextKt.toLowerCasePreservingASCIIRules(key)) && !kotlin.jvm.internal.Intrinsics.areEqual(key, entry.getKey())) {
                        linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                    }
                }
                return new io.ktor.http.Cookie(str2, decodeCookieValue, cookieEncoding2, valueOf, fromCookieToGmtDate, str5, str6, containsKey, containsKey2, linkedHashMap2);
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static /* synthetic */ java.util.Map parseClientCookiesHeader$default(java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return parseClientCookiesHeader(str, z);
    }

    public static final java.util.Map<java.lang.String, java.lang.String> parseClientCookiesHeader(java.lang.String cookiesHeader, final boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookiesHeader, "cookiesHeader");
        return kotlin.collections.MapsKt.toMap(kotlin.sequences.SequencesKt.map(kotlin.sequences.SequencesKt.filter(kotlin.sequences.SequencesKt.map(kotlin.text.Regex.findAll$default(clientCookieHeaderPattern, cookiesHeader, 0, 2, null), new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.CookieKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Pair parseClientCookiesHeader$lambda$4;
                parseClientCookiesHeader$lambda$4 = io.ktor.http.CookieKt.parseClientCookiesHeader$lambda$4((kotlin.text.MatchResult) obj);
                return parseClientCookiesHeader$lambda$4;
            }
        }), new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.CookieKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                boolean parseClientCookiesHeader$lambda$5;
                parseClientCookiesHeader$lambda$5 = io.ktor.http.CookieKt.parseClientCookiesHeader$lambda$5(z, (kotlin.Pair) obj);
                return java.lang.Boolean.valueOf(parseClientCookiesHeader$lambda$5);
            }
        }), new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.CookieKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Pair parseClientCookiesHeader$lambda$6;
                parseClientCookiesHeader$lambda$6 = io.ktor.http.CookieKt.parseClientCookiesHeader$lambda$6((kotlin.Pair) obj);
                return parseClientCookiesHeader$lambda$6;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair parseClientCookiesHeader$lambda$4(kotlin.text.MatchResult it) {
        java.lang.String str;
        java.lang.String value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        kotlin.text.MatchGroup matchGroup = it.getGroups().get(2);
        java.lang.String str2 = "";
        if (matchGroup == null || (str = matchGroup.getValue()) == null) {
            str = "";
        }
        kotlin.text.MatchGroup matchGroup2 = it.getGroups().get(4);
        if (matchGroup2 != null && (value = matchGroup2.getValue()) != null) {
            str2 = value;
        }
        return kotlin.TuplesKt.to(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseClientCookiesHeader$lambda$5(boolean z, kotlin.Pair it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return (z && kotlin.text.StringsKt.startsWith$default((java.lang.String) it.getFirst(), "$", false, 2, (java.lang.Object) null)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair parseClientCookiesHeader$lambda$6(kotlin.Pair cookie) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookie, "cookie");
        return (kotlin.text.StringsKt.startsWith$default((java.lang.String) cookie.getSecond(), "\"", false, 2, (java.lang.Object) null) && kotlin.text.StringsKt.endsWith$default((java.lang.String) cookie.getSecond(), "\"", false, 2, (java.lang.Object) null)) ? kotlin.Pair.copy$default(cookie, null, kotlin.text.StringsKt.removeSurrounding((java.lang.String) cookie.getSecond(), (java.lang.CharSequence) "\""), 1, null) : cookie;
    }

    public static final java.lang.String renderSetCookieHeader(io.ktor.http.Cookie cookie) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookie, "cookie");
        return renderSetCookieHeader$default(cookie.getName(), cookie.getValue(), cookie.getEncoding(), cookie.getMaxAgeInt(), cookie.getExpires(), cookie.getDomain(), cookie.getPath(), cookie.getSecure(), cookie.getHttpOnly(), cookie.getExtensions(), false, 1024, null);
    }

    public static final java.lang.String renderCookieHeader(io.ktor.http.Cookie cookie) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookie, "cookie");
        return cookie.getName() + com.ironsource.B5.U + encodeCookieValue(cookie.getValue(), cookie.getEncoding());
    }

    public static /* synthetic */ java.lang.String renderSetCookieHeader$default(java.lang.String str, java.lang.String str2, io.ktor.http.CookieEncoding cookieEncoding, java.lang.Integer num, io.ktor.util.date.GMTDate gMTDate, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, java.util.Map map, boolean z3, int i, java.lang.Object obj) {
        return renderSetCookieHeader(str, str2, (i & 4) != 0 ? io.ktor.http.CookieEncoding.URI_ENCODING : cookieEncoding, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : gMTDate, (i & 32) != 0 ? null : str3, (i & 64) == 0 ? str4 : null, (i & 128) != 0 ? false : z, (i & 256) == 0 ? z2 : false, (i & 512) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i & 1024) != 0 ? true : z3);
    }

    public static final java.lang.String renderSetCookieHeader(java.lang.String name, java.lang.String value, io.ktor.http.CookieEncoding encoding, java.lang.Integer num, io.ktor.util.date.GMTDate gMTDate, java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.util.Map<java.lang.String, java.lang.String> extensions, boolean z3) {
        java.lang.String str3;
        java.lang.String str4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoding, "encoding");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensions, "extensions");
        java.lang.String[] strArr = new java.lang.String[7];
        strArr[0] = assertCookieName(name) + com.ironsource.B5.U + encodeCookieValue(value.toString(), encoding);
        java.lang.String str5 = "";
        strArr[1] = num != null ? "Max-Age=" + num : "";
        java.lang.String httpDate = gMTDate != null ? io.ktor.http.DateUtilsKt.toHttpDate(gMTDate) : null;
        strArr[2] = httpDate == null ? "" : "Expires=" + ((java.lang.Object) httpDate);
        strArr[3] = str == null ? "" : "Domain=" + encodeCookieValue(str.toString(), io.ktor.http.CookieEncoding.RAW);
        strArr[4] = str2 == null ? "" : "Path=" + encodeCookieValue(str2.toString(), io.ktor.http.CookieEncoding.RAW);
        if (!z) {
            str3 = "";
        } else {
            str3 = "Secure";
        }
        strArr[5] = str3;
        if (!z2) {
            str4 = "";
        } else {
            str4 = "HttpOnly";
        }
        strArr[6] = str4;
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) strArr);
        java.util.ArrayList arrayList = new java.util.ArrayList(extensions.size());
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : extensions.entrySet()) {
            java.lang.String assertCookieName = assertCookieName(entry.getKey());
            java.lang.String value2 = entry.getValue();
            if (value2 != null) {
                assertCookieName = assertCookieName + com.ironsource.B5.U + encodeCookieValue(value2.toString(), io.ktor.http.CookieEncoding.RAW);
            }
            arrayList.add(assertCookieName);
        }
        java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) listOf, (java.lang.Iterable) arrayList);
        if (z3) {
            java.lang.String name2 = encoding.name();
            str5 = name2 != null ? "$x-enc=" + encodeCookieValue(name2.toString(), io.ktor.http.CookieEncoding.RAW) : "$x-enc";
        }
        java.util.List plus2 = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends java.lang.String>) plus, str5);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : plus2) {
            if (((java.lang.String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return kotlin.collections.CollectionsKt.joinToString$default(arrayList2, "; ", null, null, 0, null, null, 62, null);
    }

    public static final java.lang.String encodeCookieValue(java.lang.String value, io.ktor.http.CookieEncoding encoding) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoding, "encoding");
        int i = io.ktor.http.CookieKt.WhenMappings.$EnumSwitchMapping$0[encoding.ordinal()];
        if (i == 1) {
            return value;
        }
        if (i != 2) {
            if (i == 3) {
                return io.ktor.util.Base64Kt.encodeBase64(value);
            }
            if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return io.ktor.http.CodecsKt.encodeURLParameter(value, true);
        }
        java.lang.String str = value;
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, '\"', false, 2, (java.lang.Object) null)) {
            throw new java.lang.IllegalArgumentException("The cookie value contains characters that cannot be encoded in DQUOTES format. Consider URL_ENCODING mode");
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (shouldEscapeInCookies(str.charAt(i2))) {
                return "\"" + value + '\"';
            }
        }
        return value;
    }

    public static final java.lang.String decodeCookieValue(java.lang.String encodedValue, io.ktor.http.CookieEncoding encoding) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedValue, "encodedValue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoding, "encoding");
        int i = io.ktor.http.CookieKt.WhenMappings.$EnumSwitchMapping$0[encoding.ordinal()];
        if (i == 1 || i == 2) {
            java.lang.String str = encodedValue;
            return (kotlin.text.StringsKt.startsWith$default(kotlin.text.StringsKt.trimStart((java.lang.CharSequence) str).toString(), "\"", false, 2, (java.lang.Object) null) && kotlin.text.StringsKt.endsWith$default(kotlin.text.StringsKt.trimEnd((java.lang.CharSequence) str).toString(), "\"", false, 2, (java.lang.Object) null)) ? kotlin.text.StringsKt.removeSurrounding(kotlin.text.StringsKt.trim((java.lang.CharSequence) str).toString(), (java.lang.CharSequence) "\"") : encodedValue;
        }
        if (i == 3) {
            return io.ktor.util.Base64Kt.decodeBase64String(encodedValue);
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return io.ktor.http.CodecsKt.decodeURLQueryComponent$default(encodedValue, 0, 0, true, null, 11, null);
    }

    private static final java.lang.String assertCookieName(java.lang.String str) {
        java.lang.String str2 = str;
        for (int i = 0; i < str2.length(); i++) {
            if (shouldEscapeInCookies(str2.charAt(i))) {
                throw new java.lang.IllegalArgumentException("Cookie name is not valid: " + str);
            }
        }
        return str;
    }

    private static final boolean shouldEscapeInCookies(char c) {
        return kotlin.text.CharsKt.isWhitespace(c) || kotlin.jvm.internal.Intrinsics.compare((int) c, 32) < 0 || cookieCharsShouldBeEscaped.contains(java.lang.Character.valueOf(c));
    }

    private static final java.lang.String cookiePart(java.lang.String str, java.lang.Object obj, io.ktor.http.CookieEncoding cookieEncoding) {
        if (obj == null) {
            return "";
        }
        return str + com.ironsource.B5.U + encodeCookieValue(obj.toString(), cookieEncoding);
    }

    private static final java.lang.String cookiePartUnencoded(java.lang.String str, java.lang.Object obj) {
        if (obj == null) {
            return "";
        }
        return str + com.ironsource.B5.U + obj;
    }

    private static final java.lang.String cookiePartFlag(java.lang.String str, boolean z) {
        return z ? str : "";
    }

    private static final java.lang.String cookiePartExt(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            return str;
        }
        return str + com.ironsource.B5.U + encodeCookieValue(str2.toString(), io.ktor.http.CookieEncoding.RAW);
    }

    private static final int toIntClamping(java.lang.String str) {
        return (int) kotlin.ranges.RangesKt.coerceIn(java.lang.Long.parseLong(str), 0L, 2147483647L);
    }
}
