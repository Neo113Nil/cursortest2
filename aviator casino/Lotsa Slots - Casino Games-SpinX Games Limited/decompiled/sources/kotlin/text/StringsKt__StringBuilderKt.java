package kotlin.text;

/* compiled from: StringBuilder.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0087\b¢\u0006\u0002\u0010\u0005\u001a6\u0010\u0006\u001a\u00020\u00072\u001b\u0010\b\u001a\u0017\u0012\b\u0012\u00060\u0001j\u0002`\u0002\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a>\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u001b\u0010\b\u001a\u0017\u0012\b\u0012\u00060\u0001j\u0002`\u0002\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a/\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u000f\"\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0010\u001a/\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u000f\"\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0011\u001a2\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u0087\b¢\u0006\u0002\u0010\u0016\u001a\u001a\u0010\u0017\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u0002H\u0087\b¢\u0006\u0002\u0010\u0018\u001a$\u0010\u0017\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0019H\u0087\b¢\u0006\u0002\u0010\u001a\u001a$\u0010\u0017\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0087\b¢\u0006\u0002\u0010\u001b\u001a$\u0010\u0017\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0087\b¢\u0006\u0002\u0010\u0005\u001a\"\u0010\u0017\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u000e\u001a\u00020\u0013H\u0087\b¢\u0006\u0002\u0010\u001c\u001a\"\u0010\u0017\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u000e\u001a\u00020\u001dH\u0087\b¢\u0006\u0002\u0010\u001e\u001a\"\u0010\u0017\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u000e\u001a\u00020\u001fH\u0087\b¢\u0006\u0002\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006!"}, d2 = {"append", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "obj", "", "(Ljava/lang/StringBuilder;Ljava/lang/Object;)Ljava/lang/StringBuilder;", "buildString", "", "builderAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "capacity", "", "value", "", "(Ljava/lang/StringBuilder;[Ljava/lang/String;)Ljava/lang/StringBuilder;", "(Ljava/lang/StringBuilder;[Ljava/lang/Object;)Ljava/lang/StringBuilder;", "str", "", "offset", "len", "(Ljava/lang/StringBuilder;[CII)Ljava/lang/StringBuilder;", "appendLine", "(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;", "", "(Ljava/lang/StringBuilder;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", "(Ljava/lang/StringBuilder;[C)Ljava/lang/StringBuilder;", "", "(Ljava/lang/StringBuilder;C)Ljava/lang/StringBuilder;", "", "(Ljava/lang/StringBuilder;Z)Ljava/lang/StringBuilder;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes6.dex */
class StringsKt__StringBuilderKt extends kotlin.text.StringsKt__StringBuilderJVMKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use append(value: Any?) instead", replaceWith = @kotlin.ReplaceWith(expression = "append(value = obj)", imports = {}))
    private static final java.lang.StringBuilder append(java.lang.StringBuilder sb, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(obj);
        return sb;
    }

    private static final java.lang.String buildString(kotlin.jvm.functions.Function1<? super java.lang.StringBuilder, kotlin.Unit> builderAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        builderAction.invoke(sb);
        return sb.toString();
    }

    private static final java.lang.String buildString(int i, kotlin.jvm.functions.Function1<? super java.lang.StringBuilder, kotlin.Unit> builderAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i);
        builderAction.invoke(sb);
        return sb.toString();
    }

    public static final java.lang.StringBuilder append(java.lang.StringBuilder sb, java.lang.String... value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        for (java.lang.String str : value) {
            sb.append(str);
        }
        return sb;
    }

    public static final java.lang.StringBuilder append(java.lang.StringBuilder sb, java.lang.Object... value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        for (java.lang.Object obj : value) {
            sb.append(obj);
        }
        return sb;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use appendRange instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.appendRange(str, offset, offset + len)", imports = {}))
    private static final java.lang.StringBuilder append(java.lang.StringBuilder sb, char[] str, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "str");
        throw new kotlin.NotImplementedError(null, 1, null);
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append('\n');
        return sb;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(charSequence);
        sb.append('\n');
        return sb;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(str);
        sb.append('\n');
        return sb;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(obj);
        sb.append('\n');
        return sb;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, char[] value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        sb.append(value);
        sb.append('\n');
        return sb;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, char c) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(c);
        sb.append('\n');
        return sb;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(z);
        sb.append('\n');
        return sb;
    }
}
