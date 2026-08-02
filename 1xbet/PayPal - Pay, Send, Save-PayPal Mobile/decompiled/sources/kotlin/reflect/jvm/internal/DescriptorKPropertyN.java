package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u000fB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKPropertyN;", "V", "Lkotlin/reflect/jvm/internal/DescriptorKProperty;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "_getter", "Lkotlin/Lazy;", "Lkotlin/reflect/jvm/internal/DescriptorKPropertyN$Getter;", "getter", "getGetter", "()Lkotlin/reflect/jvm/internal/DescriptorKPropertyN$Getter;", "Getter", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public class DescriptorKPropertyN<V> extends kotlin.reflect.jvm.internal.DescriptorKProperty<V> {
    private final kotlin.Lazy<kotlin.reflect.jvm.internal.DescriptorKPropertyN.Getter<V>> Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKPropertyN(kotlin.reflect.jvm.internal.KDeclarationContainerImpl kDeclarationContainerImpl, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor) {
        super(kDeclarationContainerImpl, propertyDescriptor);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(propertyDescriptor, "");
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKPropertyN$$Lambda$0
            private final kotlin.reflect.jvm.internal.DescriptorKPropertyN Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.DescriptorKPropertyN.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap);
            }

            {
                this.Camera2StreamConfigurationMap = this;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.DescriptorKProperty, kotlin.reflect.KProperty
    public kotlin.reflect.jvm.internal.DescriptorKPropertyN.Getter<V> getGetter() {
        return this.Camera2StreamConfigurationMap.getValue();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKPropertyN$Getter;", "V", "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;", "Lkotlin/reflect/jvm/internal/DescriptorKPropertyN;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/DescriptorKPropertyN;)V", "Lkotlin/reflect/jvm/internal/DescriptorKPropertyN;", "getProperty", "()Lkotlin/reflect/jvm/internal/DescriptorKPropertyN;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Getter<V> extends kotlin.reflect.jvm.internal.DescriptorKProperty.Getter<V> {
        private final kotlin.reflect.jvm.internal.DescriptorKPropertyN<V> property;

        /* JADX WARN: Multi-variable type inference failed */
        public Getter(kotlin.reflect.jvm.internal.DescriptorKPropertyN<? extends V> descriptorKPropertyN) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKPropertyN, "");
            this.property = descriptorKPropertyN;
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, kotlin.reflect.KProperty.Accessor
        public final kotlin.reflect.jvm.internal.DescriptorKPropertyN<V> getProperty() {
            return this.property;
        }
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.DescriptorKPropertyN.Getter getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.DescriptorKPropertyN descriptorKPropertyN) {
        return new kotlin.reflect.jvm.internal.DescriptorKPropertyN.Getter(descriptorKPropertyN);
    }
}
