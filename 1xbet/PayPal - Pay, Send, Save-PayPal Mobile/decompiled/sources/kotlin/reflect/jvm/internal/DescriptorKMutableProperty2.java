package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005:\u0001\u001cB!\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000b\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00028\u0002H\u0096\u0080\u0004¢\u0006\u0002\u0010\u001bR&\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00128VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty2;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/DescriptorKProperty2;", "Lkotlin/reflect/KMutableProperty2;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", "", "signature", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "_setter", "Lkotlin/Lazy;", "Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty2$Setter;", "setter", "getSetter", "()Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty2$Setter;", "set", "", "receiver1", "receiver2", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Setter", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DescriptorKMutableProperty2<D, E, V> extends kotlin.reflect.jvm.internal.DescriptorKProperty2<D, E, V> implements kotlin.reflect.KMutableProperty2<D, E, V> {
    private final kotlin.Lazy<kotlin.reflect.jvm.internal.DescriptorKMutableProperty2.Setter<D, E, V>> Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKMutableProperty2(kotlin.reflect.jvm.internal.KDeclarationContainerImpl kDeclarationContainerImpl, java.lang.String str, java.lang.String str2) {
        super(kDeclarationContainerImpl, str, str2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKMutableProperty2$$Lambda$0
            private final kotlin.reflect.jvm.internal.DescriptorKMutableProperty2 Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.DescriptorKMutableProperty2.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap);
            }

            {
                this.Camera2StreamConfigurationMap = this;
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKMutableProperty2(kotlin.reflect.jvm.internal.KDeclarationContainerImpl kDeclarationContainerImpl, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor) {
        super(kDeclarationContainerImpl, propertyDescriptor);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(propertyDescriptor, "");
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKMutableProperty2$$Lambda$0
            private final kotlin.reflect.jvm.internal.DescriptorKMutableProperty2 Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.DescriptorKMutableProperty2.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap);
            }

            {
                this.Camera2StreamConfigurationMap = this;
            }
        });
    }

    @Override // kotlin.reflect.KMutableProperty2, kotlin.reflect.KMutableProperty
    public final kotlin.reflect.jvm.internal.DescriptorKMutableProperty2.Setter<D, E, V> getSetter() {
        return this.Camera2StreamConfigurationMap.getValue();
    }

    @Override // kotlin.reflect.KMutableProperty2
    public final void set(D receiver1, E receiver2, V value) {
        getSetter().call(receiver1, receiver2, value);
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\u000b\u001a\u00028\u00042\u0006\u0010\f\u001a\u00028\u0005H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty2$Setter;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Setter;", "Lkotlin/reflect/KMutableProperty2$Setter;", "Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty2;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty2;)V", "receiver1", "receiver2", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty2;", "getProperty", "()Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty2;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Setter<D, E, V> extends kotlin.reflect.jvm.internal.DescriptorKProperty.Setter<V> implements kotlin.reflect.KMutableProperty2.Setter<D, E, V> {
        private final kotlin.reflect.jvm.internal.DescriptorKMutableProperty2<D, E, V> property;

        public Setter(kotlin.reflect.jvm.internal.DescriptorKMutableProperty2<D, E, V> descriptorKMutableProperty2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKMutableProperty2, "");
            this.property = descriptorKMutableProperty2;
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, kotlin.reflect.KProperty.Accessor
        public final kotlin.reflect.jvm.internal.DescriptorKMutableProperty2<D, E, V> getProperty() {
            return this.property;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function3
        public final /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            invoke2((kotlin.reflect.jvm.internal.DescriptorKMutableProperty2.Setter<D, E, V>) obj, obj2, obj3);
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(D receiver1, E receiver2, V value) {
            getProperty().set(receiver1, receiver2, value);
        }
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.DescriptorKMutableProperty2.Setter Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.DescriptorKMutableProperty2 descriptorKMutableProperty2) {
        return new kotlin.reflect.jvm.internal.DescriptorKMutableProperty2.Setter(descriptorKMutableProperty2);
    }
}
