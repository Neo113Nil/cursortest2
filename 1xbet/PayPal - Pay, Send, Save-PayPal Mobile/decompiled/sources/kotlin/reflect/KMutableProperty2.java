package kotlin.reflect;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\u0010J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u0002H&¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlin/reflect/KMutableProperty2;", "D", "E", "V", "Lkotlin/reflect/KProperty2;", "Lkotlin/reflect/KMutableProperty;", "receiver1", "receiver2", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "set", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/reflect/KMutableProperty2$Setter;", "getSetter", "()Lkotlin/reflect/KMutableProperty2$Setter;", "setter", "Setter"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface KMutableProperty2<D, E, V> extends kotlin.reflect.KProperty2<D, E, V>, kotlin.reflect.KMutableProperty<V> {

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\bf\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\b\u0012\u0004\u0012\u00028\u00050\u00042\u001a\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00020\u00060\u0005"}, d2 = {"Lkotlin/reflect/KMutableProperty2$Setter;", "D", "E", "V", "Lkotlin/reflect/KMutableProperty$Setter;", "Lkotlin/Function3;", ""}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Setter<D, E, V> extends kotlin.reflect.KMutableProperty.Setter<V>, kotlin.jvm.functions.Function3<D, E, V, kotlin.Unit> {
    }

    @Override // kotlin.reflect.KMutableProperty
    kotlin.reflect.KMutableProperty2.Setter<D, E, V> getSetter();

    void set(D receiver1, E receiver2, V value);
}
