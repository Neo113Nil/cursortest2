package kotlin.properties;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\u00020\u000e2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0012\u001a\u00028\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lkotlin/properties/ObservableProperty;", "V", "Lkotlin/properties/ReadWriteProperty;", "", "initialValue", "<init>", "(Ljava/lang/Object;)V", "Lkotlin/reflect/KProperty;", "property", "oldValue", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "", "beforeChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)Z", "", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "thisRef", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ObservableProperty<V> implements kotlin.properties.ReadWriteProperty<java.lang.Object, V> {
    private V getHighSpeedVideoSizes;

    public ObservableProperty(V v) {
        this.getHighSpeedVideoSizes = v;
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public V getValue(java.lang.Object thisRef, kotlin.reflect.KProperty<?> property) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        return this.getHighSpeedVideoSizes;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(java.lang.Object thisRef, kotlin.reflect.KProperty<?> property, V value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        V v = this.getHighSpeedVideoSizes;
        if (beforeChange(property, v, value)) {
            this.getHighSpeedVideoSizes = value;
            afterChange(property, v, value);
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ObservableProperty(value=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(')');
        return sb.toString();
    }

    protected boolean beforeChange(kotlin.reflect.KProperty<?> property, V oldValue, V newValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        return true;
    }

    protected void afterChange(kotlin.reflect.KProperty<?> property, V oldValue, V newValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
    }
}
