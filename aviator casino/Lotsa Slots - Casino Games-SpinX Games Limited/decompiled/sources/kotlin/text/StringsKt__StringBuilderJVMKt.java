package kotlin.text;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StringBuilderJVM.kt */
@kotlin.Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001d\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a%\u0010\u0006\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a%\u0010\u0006\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0014\u0010\t\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u0002H\u0007\u001a!\u0010\n\u001a\u00020\u000b*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0087\n\u001a-\u0010\r\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0010H\u0087\b\u001a\u001d\u0010\u0011\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0087\b\u001a%\u0010\u0012\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0087\b\u001a7\u0010\u0013\u001a\u00020\u000b*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bH\u0087\b\u001a-\u0010\u0017\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0087\b\u001a-\u0010\u0017\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0087\b\u001a5\u0010\u0019\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0087\b\u001a5\u0010\u0019\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0087\b\u001a\u001f\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u001bH\u0087\b\u001a%\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u000e\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H\u0087\b\u001a\u001d\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u001d\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u001d\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u001d\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u001cH\u0087\b\u001a\u001d\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u001dH\u0087\b\u001a\u001d\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u001eH\u0087\b\u001a\u0014\u0010\u001f\u001a\u00060 j\u0002`!*\u00060 j\u0002`!H\u0007\u001a\u001f\u0010\u001f\u001a\u00060 j\u0002`!*\u00060 j\u0002`!2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0018H\u0087\b\u001a\u001d\u0010\u001f\u001a\u00060 j\u0002`!*\u00060 j\u0002`!2\u0006\u0010\u0003\u001a\u00020\fH\u0087\b\u001a\u0014\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u0002H\u0007\u001a\u001f\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u001bH\u0087\b\u001a\u001f\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0018H\u0087\b\u001a\u001f\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010H\u0087\b\u001a\u001f\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\"H\u0087\b\u001a%\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u000e\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H\u0087\b\u001a\u001d\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0015H\u0087\b\u001a\u001d\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\fH\u0087\b\u001a\u001d\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020#H\u0087\b\u001a\u001d\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u001d\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u001d\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u001d\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u001cH\u0087\b\u001a\u001d\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u001dH\u0087\b\u001a\u001d\u0010\u001f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u001eH\u0087\b¨\u0006$"}, d2 = {"append", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "value", "", "", "insert", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "clear", "set", "", "", "setRange", "startIndex", "endIndex", "", "deleteAt", "deleteRange", "toCharArray", "destination", "", "destinationOffset", "appendRange", "", "insertRange", "appendLine", "Ljava/lang/StringBuffer;", "", "", "", "appendln", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "", "", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes6.dex */
public class StringsKt__StringBuilderJVMKt extends kotlin.text.StringsKt__RegexExtensionsKt {
    private static final java.lang.StringBuilder append(java.lang.StringBuilder sb, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append((int) b);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        return sb;
    }

    private static final java.lang.StringBuilder append(java.lang.StringBuilder sb, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append((int) s);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        return sb;
    }

    private static final java.lang.StringBuilder insert(java.lang.StringBuilder sb, int i, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder insert = sb.insert(i, (int) b);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(insert, "insert(...)");
        return insert;
    }

    private static final java.lang.StringBuilder insert(java.lang.StringBuilder sb, int i, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder insert = sb.insert(i, (int) s);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(insert, "insert(...)");
        return insert;
    }

    public static final java.lang.StringBuilder clear(java.lang.StringBuilder sb) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.setLength(0);
        return sb;
    }

    private static final void set(java.lang.StringBuilder sb, int i, char c) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.setCharAt(i, c);
    }

    private static final java.lang.StringBuilder setRange(java.lang.StringBuilder sb, int i, int i2, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        java.lang.StringBuilder replace = sb.replace(i, i2, value);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(replace, "replace(...)");
        return replace;
    }

    private static final java.lang.StringBuilder deleteAt(java.lang.StringBuilder sb, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder deleteCharAt = sb.deleteCharAt(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deleteCharAt, "deleteCharAt(...)");
        return deleteCharAt;
    }

    private static final java.lang.StringBuilder deleteRange(java.lang.StringBuilder sb, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder delete = sb.delete(i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(delete, "delete(...)");
        return delete;
    }

    static /* synthetic */ void toCharArray$default(java.lang.StringBuilder sb, char[] destination, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = sb.length();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "destination");
        sb.getChars(i2, i3, destination, i);
    }

    private static final void toCharArray(java.lang.StringBuilder sb, char[] destination, int i, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "destination");
        sb.getChars(i2, i3, destination, i);
    }

    private static final java.lang.StringBuilder appendRange(java.lang.StringBuilder sb, char[] value, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        sb.append(value, i, i2 - i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        return sb;
    }

    private static final java.lang.StringBuilder appendRange(java.lang.StringBuilder sb, java.lang.CharSequence value, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        sb.append(value, i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        return sb;
    }

    private static final java.lang.StringBuilder insertRange(java.lang.StringBuilder sb, int i, char[] value, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        java.lang.StringBuilder insert = sb.insert(i, value, i2, i3 - i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(insert, "insert(...)");
        return insert;
    }

    private static final java.lang.StringBuilder insertRange(java.lang.StringBuilder sb, int i, java.lang.CharSequence value, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        java.lang.StringBuilder insert = sb.insert(i, value, i2, i3);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(insert, "insert(...)");
        return insert;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, java.lang.StringBuffer stringBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(stringBuffer);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        return sb;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, java.lang.StringBuilder sb2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append((java.lang.CharSequence) sb2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        return sb;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        return sb;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append((int) s);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        return sb;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append((int) b);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        return sb;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(j);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        return sb;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(f);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        return sb;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(d);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        return sb;
    }

    @kotlin.Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    public static final java.lang.Appendable appendln(java.lang.Appendable appendable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appendable, "<this>");
        java.lang.Appendable append = appendable.append(kotlin.text.SystemProperties.LINE_SEPARATOR);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(append, "append(...)");
        return append;
    }

    @kotlin.Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    private static final java.lang.Appendable appendln(java.lang.Appendable appendable, java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appendable, "<this>");
        java.lang.Appendable append = appendable.append(charSequence);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(append, "append(...)");
        return kotlin.text.StringsKt.appendln(append);
    }

    @kotlin.Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    private static final java.lang.Appendable appendln(java.lang.Appendable appendable, char c) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appendable, "<this>");
        java.lang.Appendable append = appendable.append(c);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(append, "append(...)");
        return kotlin.text.StringsKt.appendln(append);
    }

    @kotlin.Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    public static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(kotlin.text.SystemProperties.LINE_SEPARATOR);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        return sb;
    }

    @kotlin.Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, java.lang.StringBuffer stringBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(stringBuffer);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        return kotlin.text.StringsKt.appendln(sb);
    }

    @kotlin.Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(charSequence);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        return kotlin.text.StringsKt.appendln(sb);
    }

    @kotlin.Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        return kotlin.text.StringsKt.appendln(sb);
    }

    @kotlin.Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(obj);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        return kotlin.text.StringsKt.appendln(sb);
    }

    @kotlin.Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, java.lang.StringBuilder sb2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append((java.lang.CharSequence) sb2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        return kotlin.text.StringsKt.appendln(sb);
    }

    @kotlin.Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, char[] value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        sb.append(value);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        return kotlin.text.StringsKt.appendln(sb);
    }

    @kotlin.Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, char c) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(c);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        return kotlin.text.StringsKt.appendln(sb);
    }

    @kotlin.Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(z);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        return kotlin.text.StringsKt.appendln(sb);
    }

    @kotlin.Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        return kotlin.text.StringsKt.appendln(sb);
    }

    @kotlin.Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append((int) s);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        return kotlin.text.StringsKt.appendln(sb);
    }

    @kotlin.Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append((int) b);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        return kotlin.text.StringsKt.appendln(sb);
    }

    @kotlin.Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(j);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        return kotlin.text.StringsKt.appendln(sb);
    }

    @kotlin.Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(f);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        return kotlin.text.StringsKt.appendln(sb);
    }

    @kotlin.Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.4")
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(d);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        return kotlin.text.StringsKt.appendln(sb);
    }
}
