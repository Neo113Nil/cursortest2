package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007\"\u0014\u0010\u0006\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000b"}, d2 = {"", com.datadog.android.log.LogAttributes.HOST, "", "hostIsIp", "(Ljava/lang/String;)Z", "Lio/ktor/http/parsing/Grammar;", "getHighSpeedVideoFpsRanges", "Lio/ktor/http/parsing/Grammar;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lio/ktor/http/parsing/Parser;", "Lio/ktor/http/parsing/Parser;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class IpParserKt {
    private static final io.ktor.http.parsing.Grammar getHighResolutionOutputSizeshNQ4ISI;
    private static final io.ktor.http.parsing.Grammar getHighSpeedVideoFpsRanges;
    private static final io.ktor.http.parsing.Parser getHighSpeedVideoSizes;

    public static final boolean hostIsIp(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return getHighSpeedVideoSizes.match(str);
    }

    static {
        io.ktor.http.parsing.Grammar then = io.ktor.http.parsing.ParserDslKt.then(io.ktor.http.parsing.ParserDslKt.then(io.ktor.http.parsing.ParserDslKt.then(io.ktor.http.parsing.ParserDslKt.then(io.ktor.http.parsing.ParserDslKt.then(io.ktor.http.parsing.ParserDslKt.then(io.ktor.http.parsing.PrimitivesKt.getDigits(), "."), io.ktor.http.parsing.PrimitivesKt.getDigits()), "."), io.ktor.http.parsing.PrimitivesKt.getDigits()), "."), io.ktor.http.parsing.PrimitivesKt.getDigits());
        getHighSpeedVideoFpsRanges = then;
        io.ktor.http.parsing.Grammar then2 = io.ktor.http.parsing.ParserDslKt.then(io.ktor.http.parsing.ParserDslKt.then("[", io.ktor.http.parsing.ParserDslKt.atLeastOne(io.ktor.http.parsing.ParserDslKt.or(io.ktor.http.parsing.PrimitivesKt.getHex(), io.ktor.sse.ServerSentEventKt.COLON))), "]");
        getHighResolutionOutputSizeshNQ4ISI = then2;
        getHighSpeedVideoSizes = io.ktor.http.parsing.regex.RegexParserGeneratorKt.buildRegexParser(io.ktor.http.parsing.ParserDslKt.or(then, then2));
    }
}
