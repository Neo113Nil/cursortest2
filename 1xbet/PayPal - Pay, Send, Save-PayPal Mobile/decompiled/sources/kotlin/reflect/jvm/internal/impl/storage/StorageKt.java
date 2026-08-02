package kotlin.reflect.jvm.internal.impl.storage;

/* loaded from: classes5.dex */
public final class StorageKt {
    public static final <T> T getValue(kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<? extends T> notNullLazyValue, java.lang.Object obj, kotlin.reflect.KProperty<?> kProperty) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notNullLazyValue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "");
        return notNullLazyValue.invoke();
    }

    public static final <T> T getValue(kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue<? extends T> nullableLazyValue, java.lang.Object obj, kotlin.reflect.KProperty<?> kProperty) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nullableLazyValue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "");
        return nullableLazyValue.invoke();
    }
}
