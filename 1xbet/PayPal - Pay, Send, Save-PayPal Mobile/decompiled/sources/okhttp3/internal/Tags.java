package okhttp3.internal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\b\u001a\u00020\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\b\u0010\tJ*\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦\u0002¢\u0006\u0004\b\n\u0010\u000b\u0082\u0001\u0002\f\r"}, d2 = {"Lokhttp3/internal/Tags;", "", "<init>", "()V", "T", "Lkotlin/reflect/KClass;", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "plus", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Lokhttp3/internal/Tags;", "get", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "Lokhttp3/internal/EmptyTags;", "Lokhttp3/internal/LinkedTags;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Tags {
    public abstract <T> T get(kotlin.reflect.KClass<T> key);

    public abstract <T> okhttp3.internal.Tags plus(kotlin.reflect.KClass<T> key, T value);

    private Tags() {
    }

    public /* synthetic */ Tags(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
