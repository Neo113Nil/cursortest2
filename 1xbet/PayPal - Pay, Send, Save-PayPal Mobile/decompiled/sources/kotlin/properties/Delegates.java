package kotlin.properties;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0004*\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0082\u0001\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00042\u0006\u0010\b\u001a\u00028\u00002Q\b\u0004\u0010\u0011\u001aK\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0082\u0001\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00042\u0006\u0010\b\u001a\u00028\u00002Q\b\u0004\u0010\u0011\u001aK\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00140\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/properties/Delegates;", "", "<init>", "()V", "T", "Lkotlin/properties/ReadWriteProperty;", "notNull", "()Lkotlin/properties/ReadWriteProperty;", "initialValue", "Lkotlin/Function3;", "Lkotlin/reflect/KProperty;", "Lkotlin/ParameterName;", "name", "property", "oldValue", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "", "onChange", "observable", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlin/properties/ReadWriteProperty;", "", "vetoable"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Delegates {
    public static final kotlin.properties.Delegates INSTANCE = new kotlin.properties.Delegates();

    private Delegates() {
    }

    public final <T> kotlin.properties.ReadWriteProperty<java.lang.Object, T> notNull() {
        return new kotlin.properties.NotNullVar();
    }

    public final <T> kotlin.properties.ReadWriteProperty<java.lang.Object, T> observable(final T initialValue, final kotlin.jvm.functions.Function3<? super kotlin.reflect.KProperty<?>, ? super T, ? super T, kotlin.Unit> onChange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onChange, "");
        return new kotlin.properties.ObservableProperty<T>(initialValue) { // from class: kotlin.properties.Delegates$observable$1
            @Override // kotlin.properties.ObservableProperty
            protected final void afterChange(kotlin.reflect.KProperty<?> property, T oldValue, T newValue) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
                onChange.invoke(property, oldValue, newValue);
            }
        };
    }

    public final <T> kotlin.properties.ReadWriteProperty<java.lang.Object, T> vetoable(final T initialValue, final kotlin.jvm.functions.Function3<? super kotlin.reflect.KProperty<?>, ? super T, ? super T, java.lang.Boolean> onChange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onChange, "");
        return new kotlin.properties.ObservableProperty<T>(initialValue) { // from class: kotlin.properties.Delegates$vetoable$1
            @Override // kotlin.properties.ObservableProperty
            protected final boolean beforeChange(kotlin.reflect.KProperty<?> property, T oldValue, T newValue) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
                return onChange.invoke(property, oldValue, newValue).booleanValue();
            }
        };
    }
}
