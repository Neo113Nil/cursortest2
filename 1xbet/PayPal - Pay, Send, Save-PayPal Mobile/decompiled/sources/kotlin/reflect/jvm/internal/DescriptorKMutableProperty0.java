package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001aB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB+\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\b\u0010\u000fJ\u0017\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u0000H\u0096\u0080\u0004¢\u0006\u0002\u0010\u0019R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;", "V", "Lkotlin/reflect/jvm/internal/DescriptorKProperty0;", "Lkotlin/reflect/KMutableProperty0;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "name", "", "signature", "boundReceiver", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "_setter", "Lkotlin/Lazy;", "Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter;", "setter", "getSetter", "()Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter;", "set", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "(Ljava/lang/Object;)V", "Setter", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DescriptorKMutableProperty0<V> extends kotlin.reflect.jvm.internal.DescriptorKProperty0<V> implements kotlin.reflect.KMutableProperty0<V> {
    private final kotlin.Lazy<kotlin.reflect.jvm.internal.DescriptorKMutableProperty0.Setter<V>> getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKMutableProperty0(kotlin.reflect.jvm.internal.KDeclarationContainerImpl kDeclarationContainerImpl, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor) {
        super(kDeclarationContainerImpl, propertyDescriptor);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(propertyDescriptor, "");
        this.getHighSpeedVideoSizes = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKMutableProperty0$$Lambda$0
            private final kotlin.reflect.jvm.internal.DescriptorKMutableProperty0 getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.DescriptorKMutableProperty0.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = this;
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKMutableProperty0(kotlin.reflect.jvm.internal.KDeclarationContainerImpl kDeclarationContainerImpl, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.getHighSpeedVideoSizes = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKMutableProperty0$$Lambda$0
            private final kotlin.reflect.jvm.internal.DescriptorKMutableProperty0 getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.DescriptorKMutableProperty0.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = this;
            }
        });
    }

    @Override // kotlin.reflect.KMutableProperty0, kotlin.reflect.KMutableProperty
    public final kotlin.reflect.jvm.internal.DescriptorKMutableProperty0.Setter<V> getSetter() {
        return this.getHighSpeedVideoSizes.getValue();
    }

    @Override // kotlin.reflect.KMutableProperty0
    public final void set(V value) {
        getSetter().call(value);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Setter;", "Lkotlin/reflect/KMutableProperty0$Setter;", "Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "invoke", "(Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;", "getProperty", "()Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Setter<R> extends kotlin.reflect.jvm.internal.DescriptorKProperty.Setter<R> implements kotlin.reflect.KMutableProperty0.Setter<R> {
        private final kotlin.reflect.jvm.internal.DescriptorKMutableProperty0<R> property;

        public Setter(kotlin.reflect.jvm.internal.DescriptorKMutableProperty0<R> descriptorKMutableProperty0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKMutableProperty0, "");
            this.property = descriptorKMutableProperty0;
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, kotlin.reflect.KProperty.Accessor
        public final kotlin.reflect.jvm.internal.DescriptorKMutableProperty0<R> getProperty() {
            return this.property;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj) {
            invoke2((kotlin.reflect.jvm.internal.DescriptorKMutableProperty0.Setter<R>) obj);
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(R value) {
            getProperty().set(value);
        }
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.DescriptorKMutableProperty0.Setter getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.DescriptorKMutableProperty0 descriptorKMutableProperty0) {
        return new kotlin.reflect.jvm.internal.DescriptorKMutableProperty0.Setter(descriptorKMutableProperty0);
    }
}
