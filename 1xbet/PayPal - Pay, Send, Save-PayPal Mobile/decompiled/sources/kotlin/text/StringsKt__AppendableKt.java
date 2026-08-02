package kotlin.text;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a9\u0010\b\u001a\u00028\u0000\"\f\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u0001*\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\u000b\u001a\u00028\u0000\"\f\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u0001*\u00028\u00002\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\n\"\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u00012\u0006\u0010\r\u001a\u00028\u00002\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Ljava/lang/Appendable;", "Lkotlin/text/getHighSpeedVideoFpsRangesFor;", "T", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "startIndex", "endIndex", "appendRange", "(Ljava/lang/Appendable;Ljava/lang/CharSequence;II)Ljava/lang/Appendable;", "", "append", "(Ljava/lang/Appendable;[Ljava/lang/CharSequence;)Ljava/lang/Appendable;", "element", "Lkotlin/Function1;", "transform", "", "appendElement", "(Ljava/lang/Appendable;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
public class StringsKt__AppendableKt {
    @kotlin.IgnorableReturnValue
    public static final <T extends java.lang.Appendable> T appendRange(T t, java.lang.CharSequence charSequence, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        T t2 = (T) t.append(charSequence, i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(t2, "");
        return t2;
    }

    @kotlin.IgnorableReturnValue
    public static final <T extends java.lang.Appendable> T append(T t, java.lang.CharSequence... charSequenceArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequenceArr, "");
        for (java.lang.CharSequence charSequence : charSequenceArr) {
            t.append(charSequence);
        }
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void appendElement(java.lang.Appendable appendable, T t, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.CharSequence> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appendable, "");
        if (function1 != null) {
            appendable.append(function1.invoke(t));
            return;
        }
        if (t == 0 || (t instanceof java.lang.CharSequence)) {
            appendable.append((java.lang.CharSequence) t);
        } else if (t instanceof java.lang.Character) {
            appendable.append(((java.lang.Character) t).charValue());
        } else {
            appendable.append(t.toString());
        }
    }
}
