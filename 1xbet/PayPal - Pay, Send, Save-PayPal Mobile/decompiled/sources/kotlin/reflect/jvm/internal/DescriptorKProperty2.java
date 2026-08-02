package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\b\u0012\u0004\u0012\u0002H\u00030\u0005:\u0001\u001fB!\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000b\u0010\u000fJ\u001f\u0010\u0016\u001a\u00028\u00022\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0001H\u0096\u0080\u0004¢\u0006\u0002\u0010\u0019J!\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0001H\u0096\u0080\u0004¢\u0006\u0002\u0010\u0019J\u001f\u0010\u001e\u001a\u00028\u00022\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0001H\u0096\u0082\u0004¢\u0006\u0002\u0010\u0019R&\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00128VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKProperty2;", "D", "E", "V", "Lkotlin/reflect/KProperty2;", "Lkotlin/reflect/jvm/internal/DescriptorKProperty;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", "", "signature", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "_getter", "Lkotlin/Lazy;", "Lkotlin/reflect/jvm/internal/DescriptorKProperty2$Getter;", "getter", "getGetter", "()Lkotlin/reflect/jvm/internal/DescriptorKProperty2$Getter;", "get", "receiver1", "receiver2", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "delegateSource", "Ljava/lang/reflect/Member;", "getDelegate", "", "invoke", "Getter", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public class DescriptorKProperty2<D, E, V> extends kotlin.reflect.jvm.internal.DescriptorKProperty<V> implements kotlin.reflect.KProperty2<D, E, V> {
    private final kotlin.Lazy<kotlin.reflect.jvm.internal.DescriptorKProperty2.Getter<D, E, V>> Camera2StreamConfigurationMap;
    private final kotlin.Lazy<java.lang.reflect.Member> getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKProperty2(kotlin.reflect.jvm.internal.KDeclarationContainerImpl kDeclarationContainerImpl, java.lang.String str, java.lang.String str2) {
        super(kDeclarationContainerImpl, str, str2, kotlin.jvm.internal.CallableReference.NO_RECEIVER);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty2$$Lambda$0
            private final kotlin.reflect.jvm.internal.DescriptorKProperty2 getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.DescriptorKProperty2.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes);
            }

            {
                this.getHighSpeedVideoSizes = this;
            }
        });
        this.getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty2$$Lambda$1
            private final kotlin.reflect.jvm.internal.DescriptorKProperty2 getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                java.lang.reflect.Member computeDelegateSource;
                computeDelegateSource = this.getHighSpeedVideoFpsRangesFor.computeDelegateSource();
                return computeDelegateSource;
            }

            {
                this.getHighSpeedVideoFpsRangesFor = this;
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKProperty2(kotlin.reflect.jvm.internal.KDeclarationContainerImpl kDeclarationContainerImpl, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor) {
        super(kDeclarationContainerImpl, propertyDescriptor);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(propertyDescriptor, "");
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty2$$Lambda$0
            private final kotlin.reflect.jvm.internal.DescriptorKProperty2 getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.DescriptorKProperty2.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes);
            }

            {
                this.getHighSpeedVideoSizes = this;
            }
        });
        this.getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty2$$Lambda$1
            private final kotlin.reflect.jvm.internal.DescriptorKProperty2 getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                java.lang.reflect.Member computeDelegateSource;
                computeDelegateSource = this.getHighSpeedVideoFpsRangesFor.computeDelegateSource();
                return computeDelegateSource;
            }

            {
                this.getHighSpeedVideoFpsRangesFor = this;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.DescriptorKProperty, kotlin.reflect.KProperty
    public kotlin.reflect.jvm.internal.DescriptorKProperty2.Getter<D, E, V> getGetter() {
        return this.Camera2StreamConfigurationMap.getValue();
    }

    @Override // kotlin.reflect.KProperty2
    public V get(D receiver1, E receiver2) {
        return getGetter().call(receiver1, receiver2);
    }

    @Override // kotlin.reflect.KProperty2
    public java.lang.Object getDelegate(D receiver1, E receiver2) {
        return getDelegateImpl(this.getHighSpeedVideoFpsRanges.getValue(), receiver1, receiver2);
    }

    @Override // kotlin.jvm.functions.Function2
    public V invoke(D receiver1, E receiver2) {
        return get(receiver1, receiver2);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0006\b\u0005\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00028\u00052\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\u000b\u001a\u00028\u0004H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKProperty2$Getter;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;", "Lkotlin/reflect/KProperty2$Getter;", "Lkotlin/reflect/jvm/internal/DescriptorKProperty2;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/DescriptorKProperty2;)V", "receiver1", "receiver2", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/DescriptorKProperty2;", "getProperty", "()Lkotlin/reflect/jvm/internal/DescriptorKProperty2;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Getter<D, E, V> extends kotlin.reflect.jvm.internal.DescriptorKProperty.Getter<V> implements kotlin.reflect.KProperty2.Getter<D, E, V> {
        private final kotlin.reflect.jvm.internal.DescriptorKProperty2<D, E, V> property;

        /* JADX WARN: Multi-variable type inference failed */
        public Getter(kotlin.reflect.jvm.internal.DescriptorKProperty2<D, E, ? extends V> descriptorKProperty2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKProperty2, "");
            this.property = descriptorKProperty2;
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, kotlin.reflect.KProperty.Accessor
        public final kotlin.reflect.jvm.internal.DescriptorKProperty2<D, E, V> getProperty() {
            return this.property;
        }

        @Override // kotlin.jvm.functions.Function2
        public final V invoke(D receiver1, E receiver2) {
            return getProperty().get(receiver1, receiver2);
        }
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.DescriptorKProperty2.Getter getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.DescriptorKProperty2 descriptorKProperty2) {
        return new kotlin.reflect.jvm.internal.DescriptorKProperty2.Getter(descriptorKProperty2);
    }
}
