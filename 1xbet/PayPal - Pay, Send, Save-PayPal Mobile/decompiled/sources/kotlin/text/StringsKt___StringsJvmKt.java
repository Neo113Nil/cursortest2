package kotlin.text;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a=\u0010\u000b\u001a\u0004\u0018\u00010\u0002\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u0007*\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\tH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a1\u0010\u0010\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u001a\u0010\u000f\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00020\rj\n\u0012\u0006\b\u0000\u0012\u00020\u0002`\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0002*\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0006\u001a=\u0010\u0013\u001a\u0004\u0018\u00010\u0002\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u0007*\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\tH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\f\u001a1\u0010\u0014\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u001a\u0010\u000f\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00020\rj\n\u0012\u0006\b\u0000\u0012\u00020\u0002`\u000eH\u0007¢\u0006\u0004\b\u0014\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", "Ljava/util/SortedSet;", "", "toSortedSet", "(Ljava/lang/CharSequence;)Ljava/util/SortedSet;", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, "(Ljava/lang/CharSequence;)Ljava/lang/Character;", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", "selector", "maxBy", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Character;", "Ljava/util/Comparator;", "Lkotlin/getOutputStallDuration;", "comparator", "maxWith", "(Ljava/lang/CharSequence;Ljava/util/Comparator;)Ljava/lang/Character;", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, "minBy", "minWith"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
class StringsKt___StringsJvmKt extends kotlin.text.StringsKt__StringsKt {
    public static final java.util.SortedSet<java.lang.Character> toSortedSet(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        return (java.util.SortedSet) kotlin.text.StringsKt.toCollection(charSequence, new java.util.TreeSet());
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Character max(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        return kotlin.text.StringsKt.maxOrNull(charSequence);
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Character maxWith(java.lang.CharSequence charSequence, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "");
        return kotlin.text.StringsKt.maxWithOrNull(charSequence, comparator);
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Character min(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        return kotlin.text.StringsKt.minOrNull(charSequence);
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Character minWith(java.lang.CharSequence charSequence, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "");
        return kotlin.text.StringsKt.minWithOrNull(charSequence, comparator);
    }

    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends java.lang.Comparable<? super R>> java.lang.Character maxBy(java.lang.CharSequence charSequence, kotlin.jvm.functions.Function1<? super java.lang.Character, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int lastIndex = kotlin.text.StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return java.lang.Character.valueOf(charAt);
        }
        R invoke = function1.invoke(java.lang.Character.valueOf(charAt));
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                char charAt2 = charSequence.charAt(i);
                R invoke2 = function1.invoke(java.lang.Character.valueOf(charAt2));
                if (invoke.compareTo(invoke2) < 0) {
                    charAt = charAt2;
                    invoke = invoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return java.lang.Character.valueOf(charAt);
    }

    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends java.lang.Comparable<? super R>> java.lang.Character minBy(java.lang.CharSequence charSequence, kotlin.jvm.functions.Function1<? super java.lang.Character, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int lastIndex = kotlin.text.StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return java.lang.Character.valueOf(charAt);
        }
        R invoke = function1.invoke(java.lang.Character.valueOf(charAt));
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                char charAt2 = charSequence.charAt(i);
                R invoke2 = function1.invoke(java.lang.Character.valueOf(charAt2));
                if (invoke.compareTo(invoke2) > 0) {
                    charAt = charAt2;
                    invoke = invoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return java.lang.Character.valueOf(charAt);
    }
}
