package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/navigation/CollectionNavType;", "T", "Landroidx/navigation/NavType;", "", "isNullableAllowed", "<init>", "(Z)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "", "serializeAsValues", "(Ljava/lang/Object;)Ljava/util/List;", "emptyCollection", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class CollectionNavType<T> extends androidx.view.NavType<T> {
    public abstract T emptyCollection();

    public abstract java.util.List<java.lang.String> serializeAsValues(T value);

    public CollectionNavType(boolean z) {
        super(z);
    }
}
