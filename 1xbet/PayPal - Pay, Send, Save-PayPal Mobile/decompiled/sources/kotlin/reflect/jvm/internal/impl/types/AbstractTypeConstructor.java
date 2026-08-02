package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public abstract class AbstractTypeConstructor extends kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor {
    private final boolean Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor.Supertypes> getHighResolutionOutputSizeshNQ4ISI;

    protected abstract java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> computeSupertypes();

    protected kotlin.reflect.jvm.internal.impl.types.KotlinType defaultSupertypeIfEmpty() {
        return null;
    }

    protected abstract kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker getSupertypeLoopChecker();

    public AbstractTypeConstructor(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        this.getHighResolutionOutputSizeshNQ4ISI = storageManager.createLazyValueWithPostCompute(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges);
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        }, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$$Lambda$1
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor.getHighSpeedVideoSizes();
            }
        }, new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$$Lambda$2
            private final kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, (kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor.Supertypes) obj);
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> getSupertypes() {
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke().getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public kotlin.reflect.jvm.internal.impl.types.TypeConstructor refine(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        return new kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor.ModuleViewTypeConstructor(this, kotlinTypeRefiner);
    }

    final class ModuleViewTypeConstructor implements kotlin.reflect.jvm.internal.impl.types.TypeConstructor {
        private final kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor getHighSpeedVideoFpsRanges;
        private final kotlin.Lazy getHighSpeedVideoFpsRangesFor;

        public ModuleViewTypeConstructor(final kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor abstractTypeConstructor, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
            this.getHighSpeedVideoFpsRanges = abstractTypeConstructor;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlinTypeRefiner;
            this.getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(this, abstractTypeConstructor) { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$ModuleViewTypeConstructor$$Lambda$0
                private final kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor getHighSpeedVideoFpsRangesFor;
                private final kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor.ModuleViewTypeConstructor getHighSpeedVideoSizes;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    java.util.List refineTypes;
                    refineTypes = kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefinerKt.refineTypes(this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor.getSupertypes());
                    return refineTypes;
                }

                {
                    this.getHighSpeedVideoSizes = this;
                    this.getHighSpeedVideoFpsRangesFor = abstractTypeConstructor;
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getParameters() {
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = this.getHighSpeedVideoFpsRanges.getParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameters, "");
            return parameters;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final boolean isDenotable() {
            return this.getHighSpeedVideoFpsRanges.isDenotable();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: getDeclarationDescriptor */
        public final kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor() {
            return this.getHighSpeedVideoFpsRanges.mo23898getDeclarationDescriptor();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns() {
            kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns builtIns = this.getHighSpeedVideoFpsRanges.getBuiltIns();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builtIns, "");
            return builtIns;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final kotlin.reflect.jvm.internal.impl.types.TypeConstructor refine(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
            return this.getHighSpeedVideoFpsRanges.refine(kotlinTypeRefiner);
        }

        public final boolean equals(java.lang.Object obj) {
            return this.getHighSpeedVideoFpsRanges.equals(obj);
        }

        public final int hashCode() {
            return this.getHighSpeedVideoFpsRanges.hashCode();
        }

        public final java.lang.String toString() {
            return this.getHighSpeedVideoFpsRanges.toString();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final /* synthetic */ java.util.Collection getSupertypes() {
            return (java.util.List) this.getHighSpeedVideoFpsRangesFor.getValue();
        }
    }

    static final class Supertypes {
        final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> Camera2StreamConfigurationMap;
        java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> getHighResolutionOutputSizeshNQ4ISI;

        /* JADX WARN: Multi-variable type inference failed */
        public Supertypes(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> collection) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
            this.Camera2StreamConfigurationMap = collection;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.INSTANCE.getErrorTypeForLoopInSupertypes());
        }
    }

    private static java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, boolean z) {
        java.util.List plus;
        kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor abstractTypeConstructor = typeConstructor instanceof kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor ? (kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor) typeConstructor : null;
        if (abstractTypeConstructor != null && (plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) abstractTypeConstructor.getHighResolutionOutputSizeshNQ4ISI.invoke().Camera2StreamConfigurationMap, (java.lang.Iterable) abstractTypeConstructor.getAdditionalNeighboursInSupertypeGraph(z))) != null) {
            return plus;
        }
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypes = typeConstructor.getSupertypes();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supertypes, "");
        return supertypes;
    }

    protected boolean getShouldReportCyclicScopeWithCompanionWarning() {
        return this.Camera2StreamConfigurationMap;
    }

    protected java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> getAdditionalNeighboursInSupertypeGraph(boolean z) {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor.Supertypes getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor abstractTypeConstructor) {
        return new kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor.Supertypes(abstractTypeConstructor.computeSupertypes());
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor.Supertypes getHighSpeedVideoSizes() {
        return new kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor.Supertypes(kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.INSTANCE.getErrorTypeForLoopInSupertypes()));
    }

    static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(final kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor abstractTypeConstructor, kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor.Supertypes supertypes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supertypes, "");
        kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor abstractTypeConstructor2 = abstractTypeConstructor;
        java.util.List findLoopsInSupertypesAndDisconnect = abstractTypeConstructor.getSupertypeLoopChecker().findLoopsInSupertypesAndDisconnect(abstractTypeConstructor2, supertypes.Camera2StreamConfigurationMap, new kotlin.jvm.functions.Function1(abstractTypeConstructor) { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$$Lambda$3
            private final kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, (kotlin.reflect.jvm.internal.impl.types.TypeConstructor) obj);
            }

            {
                this.Camera2StreamConfigurationMap = abstractTypeConstructor;
            }
        }, new kotlin.jvm.functions.Function1(abstractTypeConstructor) { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$$Lambda$4
            private final kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, (kotlin.reflect.jvm.internal.impl.types.KotlinType) obj);
            }

            {
                this.Camera2StreamConfigurationMap = abstractTypeConstructor;
            }
        });
        if (findLoopsInSupertypesAndDisconnect.isEmpty()) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType defaultSupertypeIfEmpty = abstractTypeConstructor.defaultSupertypeIfEmpty();
            java.util.List listOf = defaultSupertypeIfEmpty != null ? kotlin.collections.CollectionsKt.listOf(defaultSupertypeIfEmpty) : null;
            if (listOf == null) {
                listOf = kotlin.collections.CollectionsKt.emptyList();
            }
            findLoopsInSupertypesAndDisconnect = listOf;
        }
        if (abstractTypeConstructor.getShouldReportCyclicScopeWithCompanionWarning()) {
            abstractTypeConstructor.getSupertypeLoopChecker().findLoopsInSupertypesAndDisconnect(abstractTypeConstructor2, findLoopsInSupertypesAndDisconnect, new kotlin.jvm.functions.Function1(abstractTypeConstructor) { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$$Lambda$5
                private final kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor getHighSpeedVideoFpsRangesFor;

                @Override // kotlin.jvm.functions.Function1
                public java.lang.Object invoke(java.lang.Object obj) {
                    return kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, (kotlin.reflect.jvm.internal.impl.types.TypeConstructor) obj);
                }

                {
                    this.getHighSpeedVideoFpsRangesFor = abstractTypeConstructor;
                }
            }, new kotlin.jvm.functions.Function1(abstractTypeConstructor) { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$$Lambda$6
                private final kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor getHighSpeedVideoFpsRanges;

                @Override // kotlin.jvm.functions.Function1
                public java.lang.Object invoke(java.lang.Object obj) {
                    return kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, (kotlin.reflect.jvm.internal.impl.types.KotlinType) obj);
                }

                {
                    this.getHighSpeedVideoFpsRanges = abstractTypeConstructor;
                }
            });
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> list = findLoopsInSupertypesAndDisconnect instanceof java.util.List ? (java.util.List) findLoopsInSupertypesAndDisconnect : null;
        if (list == null) {
            list = kotlin.collections.CollectionsKt.toList(findLoopsInSupertypesAndDisconnect);
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> processSupertypesWithoutCycles = abstractTypeConstructor.processSupertypesWithoutCycles(list);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processSupertypesWithoutCycles, "");
        supertypes.getHighResolutionOutputSizeshNQ4ISI = processSupertypesWithoutCycles;
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ java.lang.Iterable getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor abstractTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructor, "");
        return getHighSpeedVideoSizes(typeConstructor, false);
    }

    static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor abstractTypeConstructor, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        abstractTypeConstructor.reportSupertypeLoopError(kotlinType);
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ java.lang.Iterable getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor abstractTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructor, "");
        return getHighSpeedVideoSizes(typeConstructor, true);
    }

    static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor abstractTypeConstructor, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        abstractTypeConstructor.reportScopesLoopError(kotlinType);
        return kotlin.Unit.INSTANCE;
    }

    protected void reportSupertypeLoopError(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
    }

    protected void reportScopesLoopError(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
    }

    protected java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> processSupertypesWithoutCycles(java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return list;
    }
}
