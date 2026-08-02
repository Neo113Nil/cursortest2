package okhttp3.internal.http;

import androidx.browser.browseractions.a;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.MapsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.platform.Platform;
import okio.C1190e;
import okio.C1193h;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\n*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a!\u0010\u001b\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\r*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001dH\u0007¢\u0006\u0004\b!\u0010\u001f\"\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006&"}, d2 = {"Lokhttp3/Headers;", "", "headerName", "", "Lokhttp3/Challenge;", "parseChallenges", "(Lokhttp3/Headers;Ljava/lang/String;)Ljava/util/List;", "Lokio/e;", "", "result", "", "readChallengeHeader", "(Lokio/e;Ljava/util/List;)V", "", "skipCommasAndWhitespace", "(Lokio/e;)Z", "", "prefix", "startsWith", "(Lokio/e;B)Z", "readQuotedString", "(Lokio/e;)Ljava/lang/String;", "readToken", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "headers", "receiveHeaders", "(Lokhttp3/CookieJar;Lokhttp3/HttpUrl;Lokhttp3/Headers;)V", "Lokhttp3/Response;", "promisesBody", "(Lokhttp3/Response;)Z", "response", "hasBody", "Lokio/h;", "QUOTED_STRING_DELIMITERS", "Lokio/h;", "TOKEN_DELIMITERS", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
@JvmName(name = "HttpHeaders")
/* loaded from: classes5.dex */
public final class HttpHeaders {
    private static final C1193h QUOTED_STRING_DELIMITERS;
    private static final C1193h TOKEN_DELIMITERS;

    static {
        C1193h.Companion.getClass();
        QUOTED_STRING_DELIMITERS = C1193h.a.c("\"\\");
        TOKEN_DELIMITERS = C1193h.a.c("\t ,=");
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "No longer supported", replaceWith = @ReplaceWith(expression = "response.promisesBody()", imports = {}))
    public static final boolean hasBody(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String headerName) {
        boolean equals;
        Intrinsics.checkNotNullParameter(headers, "<this>");
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            equals = StringsKt__StringsJVMKt.equals(headerName, headers.name(i), true);
            if (equals) {
                C1190e c1190e = new C1190e();
                c1190e.k0(headers.value(i));
                try {
                    readChallengeHeader(c1190e, arrayList);
                } catch (EOFException e) {
                    Platform.INSTANCE.get().log("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        boolean equals;
        Intrinsics.checkNotNullParameter(response, "<this>");
        if (Intrinsics.areEqual(response.request().method(), "HEAD")) {
            return false;
        }
        int code = response.code();
        if (((code < 100 || code >= 200) && code != 204 && code != 304) || _UtilJvmKt.headersContentLength(response) != -1) {
            return true;
        }
        equals = StringsKt__StringsJVMKt.equals("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true);
        return equals;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b9, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b9, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void readChallengeHeader(C1190e c1190e, List<Challenge> list) throws EOFException {
        String readToken;
        int skipAll;
        LinkedHashMap linkedHashMap;
        String repeat;
        while (true) {
            String str = null;
            while (true) {
                if (str == null) {
                    skipCommasAndWhitespace(c1190e);
                    str = readToken(c1190e);
                    if (str == null) {
                        return;
                    }
                }
                boolean skipCommasAndWhitespace = skipCommasAndWhitespace(c1190e);
                readToken = readToken(c1190e);
                if (readToken == null) {
                    if (c1190e.E()) {
                        list.add(new Challenge(str, (Map<String, String>) MapsKt.emptyMap()));
                        return;
                    }
                    return;
                }
                skipAll = _UtilCommonKt.skipAll(c1190e, Base64.padSymbol);
                boolean skipCommasAndWhitespace2 = skipCommasAndWhitespace(c1190e);
                if (skipCommasAndWhitespace || (!skipCommasAndWhitespace2 && !c1190e.E())) {
                    linkedHashMap = new LinkedHashMap();
                    int skipAll2 = _UtilCommonKt.skipAll(c1190e, Base64.padSymbol) + skipAll;
                    while (true) {
                        if (readToken == null) {
                            readToken = readToken(c1190e);
                            if (!skipCommasAndWhitespace(c1190e)) {
                                skipAll2 = _UtilCommonKt.skipAll(c1190e, Base64.padSymbol);
                            }
                        }
                        if (skipAll2 != 0) {
                            if (skipAll2 > 1 || skipCommasAndWhitespace(c1190e)) {
                                return;
                            }
                            String readQuotedString = startsWith(c1190e, (byte) 34) ? readQuotedString(c1190e) : readToken(c1190e);
                            if (readQuotedString == null || ((String) linkedHashMap.put(readToken, readQuotedString)) != null) {
                                return;
                            }
                            if (!skipCommasAndWhitespace(c1190e) && !c1190e.E()) {
                                return;
                            } else {
                                readToken = null;
                            }
                        }
                    }
                }
                list.add(new Challenge(str, linkedHashMap));
                str = readToken;
            }
            StringBuilder c = a.c(readToken);
            repeat = StringsKt__StringsJVMKt.repeat("=", skipAll);
            c.append(repeat);
            Map singletonMap = Collections.singletonMap(null, c.toString());
            Intrinsics.checkNotNullExpressionValue(singletonMap, "singletonMap(...)");
            list.add(new Challenge(str, (Map<String, String>) singletonMap));
        }
    }

    private static final String readQuotedString(C1190e c1190e) throws EOFException {
        if (c1190e.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C1190e c1190e2 = new C1190e();
        while (true) {
            long x = c1190e.x(QUOTED_STRING_DELIMITERS);
            if (x == -1) {
                return null;
            }
            if (c1190e.t(x) == 34) {
                c1190e2.write(c1190e, x);
                c1190e.readByte();
                return c1190e2.Y();
            }
            if (c1190e.b == x + 1) {
                return null;
            }
            c1190e2.write(c1190e, x);
            c1190e.readByte();
            c1190e2.write(c1190e, 1L);
        }
    }

    private static final String readToken(C1190e c1190e) {
        long x = c1190e.x(TOKEN_DELIMITERS);
        if (x == -1) {
            x = c1190e.b;
        }
        if (x != 0) {
            return c1190e.X(x, Charsets.UTF_8);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl url, Headers headers) {
        Intrinsics.checkNotNullParameter(cookieJar, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> parseAll = Cookie.INSTANCE.parseAll(url, headers);
        if (parseAll.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(url, parseAll);
    }

    private static final boolean skipCommasAndWhitespace(C1190e c1190e) {
        boolean z = false;
        while (!c1190e.E()) {
            byte t = c1190e.t(0L);
            if (t != 44) {
                if (t != 32 && t != 9) {
                    break;
                }
                c1190e.readByte();
            } else {
                c1190e.readByte();
                z = true;
            }
        }
        return z;
    }

    private static final boolean startsWith(C1190e c1190e, byte b) {
        return !c1190e.E() && c1190e.t(0L) == b;
    }
}
