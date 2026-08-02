package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001\u001cB+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\f\u0010\u0010J\u001f\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0001H\u0096\u0080\u0004¢\u0006\u0002\u0010\u001bR \u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00138VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty1;", "T", "V", "Lkotlin/reflect/jvm/internal/DescriptorKProperty1;", "Lkotlin/reflect/KMutableProperty1;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", "", "signature", "boundReceiver", "", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "_setter", "Lkotlin/Lazy;", "Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty1$Setter;", "setter", "getSetter", "()Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty1$Setter;", "set", "", "receiver", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "(Ljava/lang/Object;Ljava/lang/Object;)V", "Setter", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DescriptorKMutableProperty1<T, V> extends kotlin.reflect.jvm.internal.DescriptorKProperty1<T, V> implements kotlin.reflect.KMutableProperty1<T, V> {
    private final kotlin.Lazy<kotlin.reflect.jvm.internal.DescriptorKMutableProperty1.Setter<T, V>> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKMutableProperty1(kotlin.reflect.jvm.internal.KDeclarationContainerImpl kDeclarationContainerImpl, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKMutableProperty1$$Lambda$0
            private final kotlin.reflect.jvm.internal.DescriptorKMutableProperty1 getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.DescriptorKMutableProperty1.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes);
            }

            {
                this.getHighSpeedVideoSizes = this;
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKMutableProperty1(kotlin.reflect.jvm.internal.KDeclarationContainerImpl kDeclarationContainerImpl, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor) {
        super(kDeclarationContainerImpl, propertyDescriptor);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(propertyDescriptor, "");
        this.getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKMutableProperty1$$Lambda$0
            private final kotlin.reflect.jvm.internal.DescriptorKMutableProperty1 getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.DescriptorKMutableProperty1.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes);
            }

            {
                this.getHighSpeedVideoSizes = this;
            }
        });
    }

    @Override // kotlin.reflect.KMutableProperty1, kotlin.reflect.KMutableProperty
    public final kotlin.reflect.jvm.internal.DescriptorKMutableProperty1.Setter<T, V> getSetter() {
        return this.getHighSpeedVideoFpsRangesFor.getValue();
    }

    @Override // kotlin.reflect.KMutableProperty1
    public final void set(T receiver, V value) {
        getSetter().call(receiver, value);
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00028\u00022\u0006\u0010\n\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty1$Setter;", "T", "V", "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Setter;", "Lkotlin/reflect/KMutableProperty1$Setter;", "Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty1;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty1;)V", "receiver", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty1;", "getProperty", "()Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Setter<T, V> extends kotlin.reflect.jvm.internal.DescriptorKProperty.Setter<V> implements kotlin.reflect.KMutableProperty1.Setter<T, V> {
        private final kotlin.reflect.jvm.internal.DescriptorKMutableProperty1<T, V> property;

        public Setter(kotlin.reflect.jvm.internal.DescriptorKMutableProperty1<T, V> descriptorKMutableProperty1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKMutableProperty1, "");
            this.property = descriptorKMutableProperty1;
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, kotlin.reflect.KProperty.Accessor
        public final kotlin.reflect.jvm.internal.DescriptorKMutableProperty1<T, V> getProperty() {
            return this.property;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj, java.lang.Object obj2) {
            invoke2((kotlin.reflect.jvm.internal.DescriptorKMutableProperty1.Setter<T, V>) obj, obj2);
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(T receiver, V value) {
            getProperty().set(receiver, value);
        }
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.DescriptorKMutableProperty1.Setter getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.DescriptorKMutableProperty1 descriptorKMutableProperty1) {
        return new kotlin.reflect.jvm.internal.DescriptorKMutableProperty1.Setter(descriptorKMutableProperty1);
    }
}
