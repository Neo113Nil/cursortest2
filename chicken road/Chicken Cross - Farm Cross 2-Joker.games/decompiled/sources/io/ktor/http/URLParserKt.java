package io.ktor.http;

import io.ktor.util.CharsetKt;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlinx.io.files.FileSystemKt;

/* compiled from: URLParser.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a3\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0011\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u000e\u001a+\u0010\u0012\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000e\u001a'\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a/\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u0019\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0014\u001a\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\" \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lio/ktor/http/URLBuilder;", "", "urlString", "takeFrom", "(Lio/ktor/http/URLBuilder;Ljava/lang/String;)Lio/ktor/http/URLBuilder;", "takeFromUnsafe", "", "startIndex", "endIndex", "slashCount", "", "parseFile", "(Lio/ktor/http/URLBuilder;Ljava/lang/String;III)V", "parseMailto", "(Lio/ktor/http/URLBuilder;Ljava/lang/String;II)V", "parseQuery", "(Lio/ktor/http/URLBuilder;Ljava/lang/String;II)I", "parseFragment", "fillHost", "findScheme", "(Ljava/lang/String;II)I", "", "char", "count", "(Ljava/lang/String;IIC)I", "indexOfColonInHostPort", "", "isLetter", "(C)Z", "", "ROOT_PATH", "Ljava/util/List;", "getROOT_PATH", "()Ljava/util/List;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class URLParserKt {
    private static final List<String> ROOT_PATH = CollectionsKt.listOf("");

    public static final List<String> getROOT_PATH() {
        return ROOT_PATH;
    }

    public static final URLBuilder takeFrom(URLBuilder uRLBuilder, String urlString) {
        Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        if (StringsKt.isBlank(urlString)) {
            return uRLBuilder;
        }
        try {
            return takeFromUnsafe(uRLBuilder, urlString);
        } catch (Throwable th) {
            throw new URLParserException(urlString, th);
        }
    }

    public static final URLBuilder takeFromUnsafe(URLBuilder uRLBuilder, String urlString) {
        int i;
        int i2;
        List<String> emptyList;
        List<String> emptyList2;
        int i3;
        Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        String str = urlString;
        int length = str.length();
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            }
            if (!CharsKt.isWhitespace(str.charAt(i4))) {
                break;
            }
            i4++;
        }
        int length2 = str.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i5 = length2 - 1;
                if (!CharsKt.isWhitespace(str.charAt(length2))) {
                    i = length2;
                    break;
                }
                if (i5 < 0) {
                    break;
                }
                length2 = i5;
            }
        }
        i = -1;
        int i6 = i + 1;
        int findScheme = findScheme(urlString, i4, i6);
        if (findScheme > 0) {
            String substring = urlString.substring(i4, i4 + findScheme);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            uRLBuilder.setProtocol(URLProtocol.INSTANCE.createOrDefault(substring));
            i4 += findScheme + 1;
        }
        if (Intrinsics.areEqual(uRLBuilder.getProtocol().getName(), "data")) {
            String substring2 = urlString.substring(i4, i6);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            uRLBuilder.setHost(substring2);
            return uRLBuilder;
        }
        int count = count(urlString, i4, i6, FileSystemKt.UnixPathSeparator);
        int i7 = i4 + count;
        if (Intrinsics.areEqual(uRLBuilder.getProtocol().getName(), "file")) {
            parseFile(uRLBuilder, urlString, i7, i6, count);
            return uRLBuilder;
        }
        if (Intrinsics.areEqual(uRLBuilder.getProtocol().getName(), "mailto")) {
            if (count != 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            parseMailto(uRLBuilder, urlString, i7, i6);
            return uRLBuilder;
        }
        if (Intrinsics.areEqual(uRLBuilder.getProtocol().getName(), "about")) {
            if (count != 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            String substring3 = urlString.substring(i7, i6);
            Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
            uRLBuilder.setHost(substring3);
            return uRLBuilder;
        }
        if (Intrinsics.areEqual(uRLBuilder.getProtocol().getName(), "tel")) {
            if (count != 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            String substring4 = urlString.substring(i7, i6);
            Intrinsics.checkNotNullExpressionValue(substring4, "substring(...)");
            uRLBuilder.setHost(substring4);
            return uRLBuilder;
        }
        if (count >= 2) {
            int i8 = i7;
            while (true) {
                i3 = i8;
                i2 = count;
                Integer valueOf = Integer.valueOf(StringsKt.indexOfAny$default((CharSequence) str, CharsetKt.toCharArray("@/\\?#"), i8, false, 4, (Object) null));
                if (valueOf.intValue() <= 0) {
                    valueOf = null;
                }
                i7 = valueOf != null ? valueOf.intValue() : i6;
                if (i7 >= i6 || urlString.charAt(i7) != '@') {
                    break;
                }
                int indexOfColonInHostPort = indexOfColonInHostPort(urlString, i3, i7);
                if (indexOfColonInHostPort != -1) {
                    String substring5 = urlString.substring(i3, indexOfColonInHostPort);
                    Intrinsics.checkNotNullExpressionValue(substring5, "substring(...)");
                    uRLBuilder.setEncodedUser(substring5);
                    String substring6 = urlString.substring(indexOfColonInHostPort + 1, i7);
                    Intrinsics.checkNotNullExpressionValue(substring6, "substring(...)");
                    uRLBuilder.setEncodedPassword(substring6);
                } else {
                    String substring7 = urlString.substring(i3, i7);
                    Intrinsics.checkNotNullExpressionValue(substring7, "substring(...)");
                    uRLBuilder.setEncodedUser(substring7);
                }
                i8 = i7 + 1;
                count = i2;
            }
            fillHost(uRLBuilder, urlString, i3, i7);
        } else {
            i2 = count;
        }
        int i9 = i7;
        if (i9 >= i6) {
            uRLBuilder.setEncodedPathSegments(urlString.charAt(i) == '/' ? ROOT_PATH : CollectionsKt.emptyList());
            return uRLBuilder;
        }
        if (i2 == 0) {
            emptyList = CollectionsKt.dropLast(uRLBuilder.getEncodedPathSegments(), 1);
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        uRLBuilder.setEncodedPathSegments(emptyList);
        Integer valueOf2 = Integer.valueOf(StringsKt.indexOfAny$default((CharSequence) str, CharsetKt.toCharArray("?#"), i9, false, 4, (Object) null));
        Integer num = valueOf2.intValue() > 0 ? valueOf2 : null;
        int intValue = num != null ? num.intValue() : i6;
        if (intValue > i9) {
            String substring8 = urlString.substring(i9, intValue);
            Intrinsics.checkNotNullExpressionValue(substring8, "substring(...)");
            List<String> emptyList3 = (uRLBuilder.getEncodedPathSegments().size() == 1 && ((CharSequence) CollectionsKt.first((List) uRLBuilder.getEncodedPathSegments())).length() == 0) ? CollectionsKt.emptyList() : uRLBuilder.getEncodedPathSegments();
            List<String> split$default = Intrinsics.areEqual(substring8, "/") ? ROOT_PATH : StringsKt.split$default((CharSequence) substring8, new char[]{FileSystemKt.UnixPathSeparator}, false, 0, 6, (Object) null);
            if (i2 == 1) {
                emptyList2 = ROOT_PATH;
            } else {
                emptyList2 = CollectionsKt.emptyList();
            }
            uRLBuilder.setEncodedPathSegments(CollectionsKt.plus((Collection) emptyList3, (Iterable) CollectionsKt.plus((Collection) emptyList2, (Iterable) split$default)));
            i9 = intValue;
        }
        if (i9 < i6 && urlString.charAt(i9) == '?') {
            i9 = parseQuery(uRLBuilder, urlString, i9, i6);
        }
        parseFragment(uRLBuilder, urlString, i9, i6);
        return uRLBuilder;
    }

    private static final void parseFile(URLBuilder uRLBuilder, String str, int i, int i2, int i3) {
        if (i3 == 1) {
            uRLBuilder.setHost("");
            String substring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            URLBuilderKt.setEncodedPath(uRLBuilder, substring);
            return;
        }
        if (i3 != 2) {
            if (i3 == 3) {
                uRLBuilder.setHost("");
                StringBuilder sb = new StringBuilder("/");
                String substring2 = str.substring(i, i2);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                URLBuilderKt.setEncodedPath(uRLBuilder, sb.append(substring2).toString());
                return;
            }
            throw new IllegalArgumentException("Invalid file url: " + str);
        }
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, FileSystemKt.UnixPathSeparator, i, false, 4, (Object) null);
        if (indexOf$default == -1 || indexOf$default == i2) {
            String substring3 = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
            uRLBuilder.setHost(substring3);
        } else {
            String substring4 = str.substring(i, indexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring4, "substring(...)");
            uRLBuilder.setHost(substring4);
            String substring5 = str.substring(indexOf$default, i2);
            Intrinsics.checkNotNullExpressionValue(substring5, "substring(...)");
            URLBuilderKt.setEncodedPath(uRLBuilder, substring5);
        }
    }

    private static final void parseMailto(URLBuilder uRLBuilder, String str, int i, int i2) {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, "@", i, false, 4, (Object) null);
        if (indexOf$default == -1) {
            throw new IllegalArgumentException("Invalid mailto url: " + str + ", it should contain '@'.");
        }
        String substring = str.substring(i, indexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        uRLBuilder.setUser(CodecsKt.decodeURLPart$default(substring, 0, 0, null, 7, null));
        String substring2 = str.substring(indexOf$default + 1, i2);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        uRLBuilder.setHost(substring2);
    }

    private static final int parseQuery(final URLBuilder uRLBuilder, String str, int i, int i2) {
        int i3 = i + 1;
        if (i3 == i2) {
            uRLBuilder.setTrailingQuery(true);
            return i2;
        }
        Integer valueOf = Integer.valueOf(StringsKt.indexOf$default((CharSequence) str, '#', i3, false, 4, (Object) null));
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            i2 = valueOf.intValue();
        }
        String substring = str.substring(i3, i2);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        QueryKt.parseQueryString$default(substring, 0, 0, false, 6, null).forEach(new Function2() { // from class: io.ktor.http.URLParserKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit parseQuery$lambda$5;
                parseQuery$lambda$5 = URLParserKt.parseQuery$lambda$5(URLBuilder.this, (String) obj, (List) obj2);
                return parseQuery$lambda$5;
            }
        });
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit parseQuery$lambda$5(URLBuilder uRLBuilder, String key, List values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        uRLBuilder.getEncodedParameters().appendAll(key, values);
        return Unit.INSTANCE;
    }

    private static final void parseFragment(URLBuilder uRLBuilder, String str, int i, int i2) {
        if (i >= i2 || str.charAt(i) != '#') {
            return;
        }
        String substring = str.substring(i + 1, i2);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        uRLBuilder.setEncodedFragment(substring);
    }

    private static final void fillHost(URLBuilder uRLBuilder, String str, int i, int i2) {
        int i3;
        Integer valueOf = Integer.valueOf(indexOfColonInHostPort(str, i, i2));
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : i2;
        String substring = str.substring(i, intValue);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        uRLBuilder.setHost(substring);
        int i4 = intValue + 1;
        if (i4 < i2) {
            String substring2 = str.substring(i4, i2);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            i3 = Integer.parseInt(substring2);
        } else {
            i3 = 0;
        }
        uRLBuilder.setPort(i3);
    }

    private static final int findScheme(String str, int i, int i2) {
        int i3;
        int i4;
        char charAt = str.charAt(i);
        if (('a' > charAt || charAt >= '{') && ('A' > charAt || charAt >= '[')) {
            i3 = i;
            i4 = i3;
        } else {
            i3 = i;
            i4 = -1;
        }
        while (i3 < i2) {
            char charAt2 = str.charAt(i3);
            if (charAt2 != ':') {
                if (charAt2 == '#' || charAt2 == '/' || charAt2 == '?') {
                    break;
                }
                if (i4 == -1 && (('a' > charAt2 || charAt2 >= '{') && (('A' > charAt2 || charAt2 >= '[') && (('0' > charAt2 || charAt2 >= ':') && charAt2 != '.' && charAt2 != '+' && charAt2 != '-')))) {
                    i4 = i3;
                }
                i3++;
            } else {
                if (i4 == -1) {
                    return i3 - i;
                }
                throw new IllegalArgumentException("Illegal character in scheme at position " + i4);
            }
        }
        return -1;
    }

    private static final int count(String str, int i, int i2, char c) {
        int i3 = 0;
        while (true) {
            int i4 = i + i3;
            if (i4 >= i2 || str.charAt(i4) != c) {
                break;
            }
            i3++;
        }
        return i3;
    }

    private static final int indexOfColonInHostPort(String str, int i, int i2) {
        boolean z = false;
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != ':') {
                if (charAt == '[') {
                    z = true;
                } else if (charAt == ']') {
                    z = false;
                }
            } else if (!z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private static final boolean isLetter(char c) {
        char lowerCase = Character.toLowerCase(c);
        return 'a' <= lowerCase && lowerCase < '{';
    }
}
