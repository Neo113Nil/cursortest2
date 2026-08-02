package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public final class ScopesHolderForClass<T extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> {
    private final kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getHighSpeedVideoFpsRangesFor;
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner, T> getHighSpeedVideoSizes;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass.class, "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};
    public static final kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass.Companion Companion = new kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass.Companion(null);

    /* JADX WARN: Multi-variable type inference failed */
    private ScopesHolderForClass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner, ? extends T> function1, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        this.getHighSpeedVideoFpsRangesFor = classDescriptor;
        this.getHighSpeedVideoSizes = function1;
        this.Camera2StreamConfigurationMap = kotlinTypeRefiner;
        this.getHighResolutionOutputSizeshNQ4ISI = storageManager.createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope invoke;
                invoke = r0.getHighSpeedVideoSizes.invoke(this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap);
                return invoke;
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = this;
            }
        });
    }

    public final T getScope(final kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        if (kotlinTypeRefiner.isRefinementNeededForModule(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getModule(this.getHighSpeedVideoFpsRangesFor))) {
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = this.getHighSpeedVideoFpsRangesFor.getTypeConstructor();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeConstructor, "");
            if (kotlinTypeRefiner.isRefinementNeededForTypeConstructor(typeConstructor)) {
                return (T) kotlinTypeRefiner.getOrPutScopeForClass(this.getHighSpeedVideoFpsRangesFor, new kotlin.jvm.functions.Function0(this, kotlinTypeRefiner) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass$$Lambda$1
                    private final kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass getHighResolutionOutputSizeshNQ4ISI;
                    private final kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner getHighSpeedVideoFpsRanges;

                    @Override // kotlin.jvm.functions.Function0
                    public java.lang.Object invoke() {
                        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope invoke;
                        invoke = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes.invoke(this.getHighSpeedVideoFpsRanges);
                        return invoke;
                    }

                    {
                        this.getHighResolutionOutputSizeshNQ4ISI = this;
                        this.getHighSpeedVideoFpsRanges = kotlinTypeRefiner;
                    }
                });
            }
            return (T) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighResolutionOutputSizeshNQ4ISI, this, (kotlin.reflect.KProperty<?>) getHighSpeedVideoFpsRanges[0]);
        }
        return (T) kotlin.reflect.jvm.internal.impl.storage.StorageKt.getValue(this.getHighResolutionOutputSizeshNQ4ISI, this, (kotlin.reflect.KProperty<?>) getHighSpeedVideoFpsRanges[0]);
    }

    public static final class Companion {
        private Companion() {
        }

        public final <T extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass<T> create(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner, ? extends T> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            return new kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass<>(classDescriptor, storageManager, function1, kotlinTypeRefiner, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ScopesHolderForClass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.jvm.functions.Function1 function1, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(classDescriptor, storageManager, function1, kotlinTypeRefiner);
    }
}
