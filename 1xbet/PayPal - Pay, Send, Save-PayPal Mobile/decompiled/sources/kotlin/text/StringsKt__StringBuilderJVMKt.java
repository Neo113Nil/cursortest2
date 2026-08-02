package kotlin.text;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u0001H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005*\u00060\u0004j\u0002`\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u0006\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0003"}, d2 = {"Ljava/lang/StringBuilder;", "Lkotlin/text/getHighSpeedVideoSizes;", "clear", "(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;", "Ljava/lang/Appendable;", "Lkotlin/text/getHighSpeedVideoFpsRangesFor;", "appendln", "(Ljava/lang/Appendable;)Ljava/lang/Appendable;"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
public class StringsKt__StringBuilderJVMKt extends kotlin.text.StringsKt__RegexExtensionsKt {
    @kotlin.IgnorableReturnValue
    public static final java.lang.StringBuilder clear(java.lang.StringBuilder sb) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "");
        sb.setLength(0);
        return sb;
    }

    @kotlin.Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    public static final java.lang.Appendable appendln(java.lang.Appendable appendable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appendable, "");
        java.lang.Appendable append = appendable.append(kotlin.text.SystemProperties.getHighResolutionOutputSizeshNQ4ISI);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(append, "");
        return append;
    }

    @kotlin.Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    public static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "");
        sb.append(kotlin.text.SystemProperties.getHighResolutionOutputSizeshNQ4ISI);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        return sb;
    }
}
