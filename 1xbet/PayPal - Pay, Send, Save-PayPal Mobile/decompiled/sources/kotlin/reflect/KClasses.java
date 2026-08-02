package kotlin.reflect;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\u0005"}, d2 = {"", "T", "Lkotlin/reflect/KClass;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "cast", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Ljava/lang/Object;", "safeCast"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class KClasses {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T cast(kotlin.reflect.KClass<T> kClass, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        if (!kClass.isInstance(obj)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Value cannot be cast to ");
            sb.append(kClass.getQualifiedName());
            throw new java.lang.ClassCastException(sb.toString());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T safeCast(kotlin.reflect.KClass<T> kClass, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        if (!kClass.isInstance(obj)) {
            return null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        return obj;
    }
}
