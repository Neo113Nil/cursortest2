package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001bB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB+\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\b\u0010\u000fJ\u000f\u0010\u0016\u001a\u00028\u0000H\u0096\u0080\u0004¢\u0006\u0002\u0010\u0017J\f\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0096\u0080\u0004J\u000f\u0010\u001a\u001a\u00028\u0000H\u0096\u0082\u0004¢\u0006\u0002\u0010\u0017R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKProperty0;", "V", "Lkotlin/reflect/KProperty0;", "Lkotlin/reflect/jvm/internal/DescriptorKProperty;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "name", "", "signature", "boundReceiver", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "_getter", "Lkotlin/Lazy;", "Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter;", "getter", "getGetter", "()Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter;", "get", "()Ljava/lang/Object;", "delegateValue", "getDelegate", "invoke", "Getter", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public class DescriptorKProperty0<V> extends kotlin.reflect.jvm.internal.DescriptorKProperty<V> implements kotlin.reflect.KProperty0<V> {
    private final kotlin.Lazy<java.lang.Object> getHighSpeedVideoFpsRangesFor;
    private final kotlin.Lazy<kotlin.reflect.jvm.internal.DescriptorKProperty0.Getter<V>> getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKProperty0(kotlin.reflect.jvm.internal.KDeclarationContainerImpl kDeclarationContainerImpl, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor) {
        super(kDeclarationContainerImpl, propertyDescriptor);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(propertyDescriptor, "");
        this.getHighSpeedVideoSizes = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty0$$Lambda$0
            private final kotlin.reflect.jvm.internal.DescriptorKProperty0 getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.DescriptorKProperty0.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes);
            }

            {
                this.getHighSpeedVideoSizes = this;
            }
        });
        this.getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty0$$Lambda$1
            private final kotlin.reflect.jvm.internal.DescriptorKProperty0 Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                java.lang.Object delegateImpl;
                delegateImpl = r0.getDelegateImpl(this.Camera2StreamConfigurationMap.computeDelegateSource(), null, null);
                return delegateImpl;
            }

            {
                this.Camera2StreamConfigurationMap = this;
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKProperty0(kotlin.reflect.jvm.internal.KDeclarationContainerImpl kDeclarationContainerImpl, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.getHighSpeedVideoSizes = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty0$$Lambda$0
            private final kotlin.reflect.jvm.internal.DescriptorKProperty0 getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.DescriptorKProperty0.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes);
            }

            {
                this.getHighSpeedVideoSizes = this;
            }
        });
        this.getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty0$$Lambda$1
            private final kotlin.reflect.jvm.internal.DescriptorKProperty0 Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                java.lang.Object delegateImpl;
                delegateImpl = r0.getDelegateImpl(this.Camera2StreamConfigurationMap.computeDelegateSource(), null, null);
                return delegateImpl;
            }

            {
                this.Camera2StreamConfigurationMap = this;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.DescriptorKProperty, kotlin.reflect.KProperty
    public kotlin.reflect.jvm.internal.DescriptorKProperty0.Getter<V> getGetter() {
        return this.getHighSpeedVideoSizes.getValue();
    }

    @Override // kotlin.reflect.KProperty0
    public V get() {
        return getGetter().call(new java.lang.Object[0]);
    }

    @Override // kotlin.reflect.KProperty0
    public java.lang.Object getDelegate() {
        return this.getHighSpeedVideoFpsRangesFor.getValue();
    }

    @Override // kotlin.jvm.functions.Function0
    public V invoke() {
        return get();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;", "Lkotlin/reflect/KProperty0$Getter;", "Lkotlin/reflect/jvm/internal/DescriptorKProperty0;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/DescriptorKProperty0;)V", "invoke", "()Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/DescriptorKProperty0;", "getProperty", "()Lkotlin/reflect/jvm/internal/DescriptorKProperty0;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Getter<R> extends kotlin.reflect.jvm.internal.DescriptorKProperty.Getter<R> implements kotlin.reflect.KProperty0.Getter<R> {
        private final kotlin.reflect.jvm.internal.DescriptorKProperty0<R> property;

        /* JADX WARN: Multi-variable type inference failed */
        public Getter(kotlin.reflect.jvm.internal.DescriptorKProperty0<? extends R> descriptorKProperty0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKProperty0, "");
            this.property = descriptorKProperty0;
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, kotlin.reflect.KProperty.Accessor
        public final kotlin.reflect.jvm.internal.DescriptorKProperty0<R> getProperty() {
            return this.property;
        }

        @Override // kotlin.jvm.functions.Function0
        public final R invoke() {
            return getProperty().get();
        }
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.DescriptorKProperty0.Getter getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.DescriptorKProperty0 descriptorKProperty0) {
        return new kotlin.reflect.jvm.internal.DescriptorKProperty0.Getter(descriptorKProperty0);
    }
}
