package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN;", "V", "Lkotlin/reflect/jvm/internal/DescriptorKPropertyN;", "Lkotlin/reflect/KMutableProperty;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "_setter", "Lkotlin/Lazy;", "Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN$Setter;", "setter", "getSetter", "()Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN$Setter;", "Setter", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DescriptorKMutablePropertyN<V> extends kotlin.reflect.jvm.internal.DescriptorKPropertyN<V> implements kotlin.reflect.KMutableProperty<V> {
    private final kotlin.Lazy<kotlin.reflect.jvm.internal.DescriptorKMutablePropertyN.Setter<V>> getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKMutablePropertyN(kotlin.reflect.jvm.internal.KDeclarationContainerImpl kDeclarationContainerImpl, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor) {
        super(kDeclarationContainerImpl, propertyDescriptor);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(propertyDescriptor, "");
        this.getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKMutablePropertyN$$Lambda$0
            private final kotlin.reflect.jvm.internal.DescriptorKMutablePropertyN Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.DescriptorKMutablePropertyN.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap);
            }

            {
                this.Camera2StreamConfigurationMap = this;
            }
        });
    }

    @Override // kotlin.reflect.KMutableProperty
    public final kotlin.reflect.jvm.internal.DescriptorKMutablePropertyN.Setter<V> getSetter() {
        return this.getHighSpeedVideoFpsRanges.getValue();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN$Setter;", "V", "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Setter;", "Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN;)V", "Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN;", "getProperty", "()Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Setter<V> extends kotlin.reflect.jvm.internal.DescriptorKProperty.Setter<V> {
        private final kotlin.reflect.jvm.internal.DescriptorKMutablePropertyN<V> property;

        public Setter(kotlin.reflect.jvm.internal.DescriptorKMutablePropertyN<V> descriptorKMutablePropertyN) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKMutablePropertyN, "");
            this.property = descriptorKMutablePropertyN;
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, kotlin.reflect.KProperty.Accessor
        public final kotlin.reflect.jvm.internal.DescriptorKMutablePropertyN<V> getProperty() {
            return this.property;
        }
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.DescriptorKMutablePropertyN.Setter Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.DescriptorKMutablePropertyN descriptorKMutablePropertyN) {
        return new kotlin.reflect.jvm.internal.DescriptorKMutablePropertyN.Setter(descriptorKMutablePropertyN);
    }
}
