package arrow.core;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007JE\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00028\u00002\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJK\u0010\u0013\u001a\u00028\u0001\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Larrow/core/EmptyValue;", "", "<init>", "()V", "A", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "unbox", "(Ljava/lang/Object;)Ljava/lang/Object;", "T", "first", "second", "Lkotlin/Function2;", "combine", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function0;", "ifEmpty", "Lkotlin/Function1;", "ifNotEmpty", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EmptyValue {
    public static final arrow.core.EmptyValue INSTANCE = new arrow.core.EmptyValue();

    private EmptyValue() {
    }

    public final <T, R> R fold(java.lang.Object value, kotlin.jvm.functions.Function0<? extends R> ifEmpty, kotlin.jvm.functions.Function1<? super T, ? extends R> ifNotEmpty) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ifEmpty, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ifNotEmpty, "");
        return value == INSTANCE ? ifEmpty.invoke() : ifNotEmpty.invoke(value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <A> A unbox(java.lang.Object value) {
        if (value == INSTANCE) {
            return null;
        }
        return value;
    }

    public final <T> T combine(java.lang.Object first, T second, kotlin.jvm.functions.Function2<? super T, ? super T, ? extends T> combine) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combine, "");
        return first == INSTANCE ? second : combine.invoke(first, second);
    }
}
