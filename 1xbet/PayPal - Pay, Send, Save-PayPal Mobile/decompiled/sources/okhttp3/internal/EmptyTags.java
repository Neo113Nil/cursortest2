package okhttp3.internal;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\t\u001a\u00020\u0001\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lokhttp3/internal/EmptyTags;", "Lokhttp3/internal/Tags;", "<init>", "()V", "", "T", "Lkotlin/reflect/KClass;", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "plus", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Lokhttp3/internal/Tags;", "get", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EmptyTags extends okhttp3.internal.Tags {
    public static final okhttp3.internal.EmptyTags INSTANCE = new okhttp3.internal.EmptyTags();

    private EmptyTags() {
        super(null);
    }

    @Override // okhttp3.internal.Tags
    public final <T> okhttp3.internal.Tags plus(kotlin.reflect.KClass<T> key, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        if (value != null) {
            return new okhttp3.internal.LinkedTags(key, value, this);
        }
        return this;
    }

    public final java.lang.String toString() {
        return "{}";
    }

    @Override // okhttp3.internal.Tags
    public final <T> T get(kotlin.reflect.KClass<T> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return null;
    }
}
