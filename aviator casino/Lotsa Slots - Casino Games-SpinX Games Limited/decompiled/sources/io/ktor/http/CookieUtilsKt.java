package io.ktor.http;

/* compiled from: CookieUtils.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a%\u0010\u000b\u001a\u00020\t*\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u0011\u001a\u00020\t*\u00020\r2\u001e\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000eH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a+\u0010\u0015\u001a\u00020\t*\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0013H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a+\u0010\u0017\u001a\u00020\t*\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u0013H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001a+\u0010\u0018\u001a\u00020\t*\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u0013H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u001b\u0010\u001b\u001a\u00020\t*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, d2 = {"", "", "isDelimiter", "(C)Z", "isNonDelimiter", "isOctet", "isNonDigit", "isDigit", "Lkotlin/Function0;", "", "block", "otherwise", "(ZLkotlin/jvm/functions/Function0;)V", "", "Lkotlin/Function3;", "", "success", "tryParseTime", "(Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V", "Lkotlin/Function1;", "Lio/ktor/util/date/Month;", "tryParseMonth", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "tryParseDayOfMonth", "tryParseYear", "Lio/ktor/http/CookieDateBuilder;", "token", "handleToken", "(Lio/ktor/http/CookieDateBuilder;Ljava/lang/String;)V", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CookieUtilsKt {
    public static final boolean isDelimiter(char c) {
        return c == '\t' || (' ' <= c && c < '0') || ((';' <= c && c < 'A') || (('[' <= c && c < 'a') || ('{' <= c && c < 127)));
    }

    public static final boolean isDigit(char c) {
        return '0' <= c && c < ':';
    }

    public static final boolean isNonDelimiter(char c) {
        return (c >= 0 && c < '\t') || ('\n' <= c && c < ' ') || (('0' <= c && c < ':') || c == ':' || (('a' <= c && c < '{') || (('A' <= c && c < '[') || (127 <= c && c < 256))));
    }

    public static final boolean isNonDigit(char c) {
        return (c >= 0 && c < '0') || ('J' <= c && c < 256);
    }

    public static final boolean isOctet(char c) {
        return c >= 0 && c < 256;
    }

    public static final void otherwise(boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        if (z) {
            return;
        }
        block.invoke();
    }

    public static final void tryParseTime(java.lang.String str, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> success) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(success, "success");
        io.ktor.http.StringLexer stringLexer = new io.ktor.http.StringLexer(str);
        int index = stringLexer.getIndex();
        if (stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$hour$1$1.INSTANCE)) {
            stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$hour$1$3.INSTANCE);
            java.lang.String substring = stringLexer.getSource().substring(index, stringLexer.getIndex());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            int parseInt = java.lang.Integer.parseInt(substring);
            if (stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$1.INSTANCE)) {
                int index2 = stringLexer.getIndex();
                if (stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$minute$1$1.INSTANCE)) {
                    stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$minute$1$3.INSTANCE);
                    java.lang.String substring2 = stringLexer.getSource().substring(index2, stringLexer.getIndex());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                    int parseInt2 = java.lang.Integer.parseInt(substring2);
                    if (stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$3.INSTANCE)) {
                        int index3 = stringLexer.getIndex();
                        if (stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$second$1$1.INSTANCE)) {
                            stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$second$1$3.INSTANCE);
                            java.lang.String substring3 = stringLexer.getSource().substring(index3, stringLexer.getIndex());
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                            int parseInt3 = java.lang.Integer.parseInt(substring3);
                            if (stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$5.INSTANCE)) {
                                stringLexer.acceptWhile(io.ktor.http.CookieUtilsKt$tryParseTime$6.INSTANCE);
                            }
                            success.invoke(java.lang.Integer.valueOf(parseInt), java.lang.Integer.valueOf(parseInt2), java.lang.Integer.valueOf(parseInt3));
                        }
                    }
                }
            }
        }
    }

    public static final void tryParseMonth(java.lang.String str, kotlin.jvm.functions.Function1<? super io.ktor.util.date.Month, kotlin.Unit> success) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(success, "success");
        if (str.length() < 3) {
            return;
        }
        for (io.ktor.util.date.Month month : io.ktor.util.date.Month.getEntries()) {
            if (kotlin.text.StringsKt.startsWith(str, month.getValue(), true)) {
                success.invoke(month);
                return;
            }
        }
    }

    public static final void tryParseDayOfMonth(java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> success) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(success, "success");
        io.ktor.http.StringLexer stringLexer = new io.ktor.http.StringLexer(str);
        int index = stringLexer.getIndex();
        if (stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseDayOfMonth$day$1$1.INSTANCE)) {
            stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseDayOfMonth$day$1$3.INSTANCE);
            java.lang.String substring = stringLexer.getSource().substring(index, stringLexer.getIndex());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            int parseInt = java.lang.Integer.parseInt(substring);
            if (stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseDayOfMonth$1.INSTANCE)) {
                stringLexer.acceptWhile(io.ktor.http.CookieUtilsKt$tryParseDayOfMonth$2.INSTANCE);
            }
            success.invoke(java.lang.Integer.valueOf(parseInt));
        }
    }

    public static final void tryParseYear(java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> success) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(success, "success");
        io.ktor.http.StringLexer stringLexer = new io.ktor.http.StringLexer(str);
        int index = stringLexer.getIndex();
        for (int i = 0; i < 2; i++) {
            if (!stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseYear$year$1$1$1.INSTANCE)) {
                return;
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseYear$year$1$2$1.INSTANCE);
        }
        java.lang.String substring = stringLexer.getSource().substring(index, stringLexer.getIndex());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        int parseInt = java.lang.Integer.parseInt(substring);
        if (stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseYear$1.INSTANCE)) {
            stringLexer.acceptWhile(io.ktor.http.CookieUtilsKt$tryParseYear$2.INSTANCE);
        }
        success.invoke(java.lang.Integer.valueOf(parseInt));
    }

    public static final void handleToken(io.ktor.http.CookieDateBuilder cookieDateBuilder, java.lang.String token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookieDateBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "token");
        if (cookieDateBuilder.getHours() == null || cookieDateBuilder.getMinutes() == null || cookieDateBuilder.getSeconds() == null) {
            io.ktor.http.StringLexer stringLexer = new io.ktor.http.StringLexer(token);
            int index = stringLexer.getIndex();
            if (stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$hour$1$1.INSTANCE)) {
                stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$hour$1$3.INSTANCE);
                java.lang.String substring = stringLexer.getSource().substring(index, stringLexer.getIndex());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                int parseInt = java.lang.Integer.parseInt(substring);
                if (stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$1.INSTANCE)) {
                    int index2 = stringLexer.getIndex();
                    if (stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$minute$1$1.INSTANCE)) {
                        stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$minute$1$3.INSTANCE);
                        java.lang.String substring2 = stringLexer.getSource().substring(index2, stringLexer.getIndex());
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                        int parseInt2 = java.lang.Integer.parseInt(substring2);
                        if (stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$3.INSTANCE)) {
                            int index3 = stringLexer.getIndex();
                            if (stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$second$1$1.INSTANCE)) {
                                stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$second$1$3.INSTANCE);
                                java.lang.String substring3 = stringLexer.getSource().substring(index3, stringLexer.getIndex());
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                                int parseInt3 = java.lang.Integer.parseInt(substring3);
                                if (stringLexer.accept(io.ktor.http.CookieUtilsKt$tryParseTime$5.INSTANCE)) {
                                    stringLexer.acceptWhile(io.ktor.http.CookieUtilsKt$tryParseTime$6.INSTANCE);
                                }
                                cookieDateBuilder.setHours(java.lang.Integer.valueOf(parseInt));
                                cookieDateBuilder.setMinutes(java.lang.Integer.valueOf(parseInt2));
                                cookieDateBuilder.setSeconds(java.lang.Integer.valueOf(parseInt3));
                                return;
                            }
                        }
                    }
                }
            }
        }
        if (cookieDateBuilder.getDayOfMonth() == null) {
            io.ktor.http.StringLexer stringLexer2 = new io.ktor.http.StringLexer(token);
            int index4 = stringLexer2.getIndex();
            if (stringLexer2.accept(io.ktor.http.CookieUtilsKt$tryParseDayOfMonth$day$1$1.INSTANCE)) {
                stringLexer2.accept(io.ktor.http.CookieUtilsKt$tryParseDayOfMonth$day$1$3.INSTANCE);
                java.lang.String substring4 = stringLexer2.getSource().substring(index4, stringLexer2.getIndex());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring4, "substring(...)");
                int parseInt4 = java.lang.Integer.parseInt(substring4);
                if (stringLexer2.accept(io.ktor.http.CookieUtilsKt$tryParseDayOfMonth$1.INSTANCE)) {
                    stringLexer2.acceptWhile(io.ktor.http.CookieUtilsKt$tryParseDayOfMonth$2.INSTANCE);
                }
                cookieDateBuilder.setDayOfMonth(java.lang.Integer.valueOf(parseInt4));
                return;
            }
        }
        if (cookieDateBuilder.getMonth() == null && token.length() >= 3) {
            for (io.ktor.util.date.Month month : io.ktor.util.date.Month.getEntries()) {
                if (kotlin.text.StringsKt.startsWith(token, month.getValue(), true)) {
                    cookieDateBuilder.setMonth(month);
                    return;
                }
            }
        }
        if (cookieDateBuilder.getYear() == null) {
            io.ktor.http.StringLexer stringLexer3 = new io.ktor.http.StringLexer(token);
            int index5 = stringLexer3.getIndex();
            for (int i = 0; i < 2; i++) {
                if (!stringLexer3.accept(io.ktor.http.CookieUtilsKt$tryParseYear$year$1$1$1.INSTANCE)) {
                    return;
                }
            }
            for (int i2 = 0; i2 < 2; i2++) {
                stringLexer3.accept(io.ktor.http.CookieUtilsKt$tryParseYear$year$1$2$1.INSTANCE);
            }
            java.lang.String substring5 = stringLexer3.getSource().substring(index5, stringLexer3.getIndex());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring5, "substring(...)");
            int parseInt5 = java.lang.Integer.parseInt(substring5);
            if (stringLexer3.accept(io.ktor.http.CookieUtilsKt$tryParseYear$1.INSTANCE)) {
                stringLexer3.acceptWhile(io.ktor.http.CookieUtilsKt$tryParseYear$2.INSTANCE);
            }
            cookieDateBuilder.setYear(java.lang.Integer.valueOf(parseInt5));
        }
    }
}
