package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* loaded from: classes5.dex */
public final class LazyJavaClassDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase implements kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor {
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor>> getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getHighSpeedVideoSizes;
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass getHighSpeedVideoSizesFor;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassKind getInputFormats;
    private final boolean getInputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper getOutputFormats;
    private final kotlin.reflect.jvm.internal.impl.descriptors.Modality getOutputMinFrameDuration;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor getOutputMinFrameDurationlomOqCM;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope> getOutputSizes;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope getOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext getOutputStallDuration;
    private final kotlin.Lazy getOutputStallDurationlomOqCM;
    private final kotlin.reflect.jvm.internal.impl.descriptors.Visibility isOutputSupportedForhNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope toString;
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.Companion Companion = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.Companion(null);
    private static final java.util.Set<java.lang.String> Camera2StreamConfigurationMap = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getCompanionObjectDescriptor */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mo23888getCompanionObjectDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getUnsubstitutedPrimaryConstructor */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor mo23889getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation<kotlin.reflect.jvm.internal.impl.types.SimpleType> getValueClassRepresentation() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean isActual() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean isCompanionObject() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean isData() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean isExpect() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean isFun() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean isValue() {
        return false;
    }

    public /* synthetic */ LazyJavaClassDescriptor(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, declarationDescriptor, javaClass, (i & 8) != 0 ? null : classDescriptor);
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass getJClass() {
        return this.getHighSpeedVideoSizesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        super(lazyJavaResolverContext.getStorageManager(), declarationDescriptor, javaClass.getName(), lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaClass), false);
        kotlin.reflect.jvm.internal.impl.descriptors.ClassKind classKind;
        kotlin.reflect.jvm.internal.impl.descriptors.Modality modality;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaClass, "");
        this.getOutputStallDuration = lazyJavaResolverContext;
        this.getHighSpeedVideoSizesFor = javaClass;
        this.getHighSpeedVideoFpsRanges = classDescriptor;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext childForClassOrPackage$default = kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.childForClassOrPackage$default(lazyJavaResolverContext, this, javaClass, 0, 4, null);
        this.getHighResolutionOutputSizeshNQ4ISI = childForClassOrPackage$default;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor lazyJavaClassDescriptor = this;
        childForClassOrPackage$default.getComponents().getJavaResolverCache().recordClass(javaClass, lazyJavaClassDescriptor);
        javaClass.getLightClassOriginKind();
        this.getOutputStallDurationlomOqCM = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = this;
            }
        });
        if (javaClass.isAnnotationType()) {
            classKind = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS;
        } else if (javaClass.isInterface()) {
            classKind = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE;
        } else {
            classKind = javaClass.isEnum() ? kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS : kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS;
        }
        this.getInputFormats = classKind;
        if (javaClass.isAnnotationType() || javaClass.isEnum()) {
            modality = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL;
        } else {
            modality = kotlin.reflect.jvm.internal.impl.descriptors.Modality.Companion.convertFromFlags(javaClass.isSealed(), javaClass.isSealed() || javaClass.isAbstract() || javaClass.isInterface(), !javaClass.isFinal());
        }
        this.getOutputMinFrameDuration = modality;
        this.isOutputSupportedForhNQ4ISI = javaClass.getVisibility();
        this.getInputSizeshNQ4ISI = (javaClass.getOuterClass() == null || javaClass.isStatic()) ? false : true;
        this.getOutputMinFrameDurationlomOqCM = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor();
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope lazyJavaClassMemberScope = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope(childForClassOrPackage$default, lazyJavaClassDescriptor, javaClass, classDescriptor != null, null, 16, null);
        this.toString = lazyJavaClassMemberScope;
        this.getOutputSizes = kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass.Companion.create(lazyJavaClassDescriptor, childForClassOrPackage$default.getStorageManager(), childForClassOrPackage$default.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner(), new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$$Lambda$1
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, (kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner) obj);
            }

            {
                this.getHighSpeedVideoSizes = this;
            }
        });
        this.getOutputFormats = new kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper(lazyJavaClassMemberScope);
        this.getOutputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope(childForClassOrPackage$default, javaClass, this);
        this.getHighSpeedVideoSizes = kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt.resolveAnnotations(childForClassOrPackage$default, javaClass);
        this.getHighSpeedVideoFpsRangesFor = childForClassOrPackage$default.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$$Lambda$2
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes);
            }

            {
                this.getHighSpeedVideoSizes = this;
            }
        });
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation> getModuleAnnotations() {
        return (java.util.List) this.getOutputStallDurationlomOqCM.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassKind getKind() {
        return this.getInputFormats;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final kotlin.reflect.jvm.internal.impl.descriptors.Modality getModality() {
        return this.getOutputMinFrameDuration;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public final kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility getVisibility() {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.isOutputSupportedForhNQ4ISI, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PRIVATE) && this.getHighSpeedVideoSizesFor.getOuterClass() == null) {
            kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility = kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities.PACKAGE_VISIBILITY;
            kotlin.jvm.internal.Intrinsics.checkNotNull(descriptorVisibility);
            return descriptorVisibility;
        }
        return kotlin.reflect.jvm.internal.impl.load.java.UtilsKt.toDescriptorVisibility(this.isOutputSupportedForhNQ4ISI);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final boolean isInner() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final kotlin.reflect.jvm.internal.impl.types.TypeConstructor getTypeConstructor() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope getUnsubstitutedMemberScope(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        return this.getOutputSizes.getScope(kotlinTypeRefiner);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getUnsubstitutedInnerClassesScope() {
        return this.getOutputFormats;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getStaticScope() {
        return this.getOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope getUnsubstitutedMemberScope() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope unsubstitutedMemberScope = super.getUnsubstitutedMemberScope();
        kotlin.jvm.internal.Intrinsics.checkNotNull(unsubstitutedMemberScope, "");
        return (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope) unsubstitutedMemberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> getConstructors() {
        return this.toString.getConstructors$descriptors_jvm().invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getDeclaredTypeParameters() {
        return this.getHighSpeedVideoFpsRangesFor.invoke();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Lazy Java class ");
        sb.append(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameUnsafe(this));
        return sb.toString();
    }

    final class LazyJavaClassTypeConstructor extends kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor {
        private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor>> getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final boolean isDenotable() {
            return true;
        }

        public LazyJavaClassTypeConstructor() {
            super(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this.getHighResolutionOutputSizeshNQ4ISI.getStorageManager());
            this.getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this.getHighResolutionOutputSizeshNQ4ISI.getStorageManager().createLazyValue(new kotlin.jvm.functions.Function0(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$LazyJavaClassTypeConstructor$$Lambda$0
                private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor getHighResolutionOutputSizeshNQ4ISI;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    java.util.List computeConstructorTypeParameters;
                    computeConstructorTypeParameters = kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt.computeConstructorTypeParameters(this.getHighResolutionOutputSizeshNQ4ISI);
                    return computeConstructorTypeParameters;
                }

                {
                    this.getHighResolutionOutputSizeshNQ4ISI = r1;
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: getDeclarationDescriptor */
        public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor() {
            return mo23898getDeclarationDescriptor();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getParameters() {
            return this.getHighSpeedVideoFpsRangesFor.invoke();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v17 kotlin.reflect.jvm.internal.impl.name.FqName, still in use, count: 2, list:
              (r8v17 kotlin.reflect.jvm.internal.impl.name.FqName) from 0x0081: IF  (r8v17 kotlin.reflect.jvm.internal.impl.name.FqName) == (null kotlin.reflect.jvm.internal.impl.name.FqName)  -> B:74:0x013a A[HIDDEN]
              (r8v17 kotlin.reflect.jvm.internal.impl.name.FqName) from 0x0086: PHI (r8v14 kotlin.reflect.jvm.internal.impl.name.FqName) = (r8v0 kotlin.reflect.jvm.internal.impl.name.FqName), (r8v17 kotlin.reflect.jvm.internal.impl.name.FqName) binds: [B:75:0x0085, B:12:0x0081] A[DONT_GENERATE, DONT_INLINE]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x01b6  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01dd  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0224  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x022b  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0085  */
        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> computeSupertypes() {
            /*
                Method dump skipped, instructions count: 580
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.computeSupertypes():java.util.Collection");
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker getSupertypeLoopChecker() {
            return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this.getHighResolutionOutputSizeshNQ4ISI.getComponents().getSupertypeLoopChecker();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: getDeclarationDescriptor */
        public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mo23898getDeclarationDescriptor() {
            return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this;
        }

        public final java.lang.String toString() {
            java.lang.String asString = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this.getName().asString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
            return asString;
        }
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor copy$descriptors_jvm(kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache javaResolverCache, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaResolverCache, "");
        kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext replaceComponents = kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.replaceComponents(lazyJavaResolverContext, lazyJavaResolverContext.getComponents().replace(javaResolverCache));
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = getContainingDeclaration();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(containingDeclaration, "");
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor(replaceComponents, containingDeclaration, this.getHighSpeedVideoSizesFor, classDescriptor);
    }

    static /* synthetic */ java.util.List getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getClassId(lazyJavaClassDescriptor);
        if (classId != null) {
            return lazyJavaClassDescriptor.getOutputStallDuration.getComponents().getJavaModuleResolver().getAnnotationsForModuleOwnerOfClass(classId);
        }
        return null;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor lazyJavaClassDescriptor, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope(lazyJavaClassDescriptor.getHighResolutionOutputSizeshNQ4ISI, lazyJavaClassDescriptor, lazyJavaClassDescriptor.getHighSpeedVideoSizesFor, lazyJavaClassDescriptor.getHighSpeedVideoFpsRanges != null, lazyJavaClassDescriptor.toString);
    }

    static /* synthetic */ java.util.List Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter> typeParameters = lazyJavaClassDescriptor.getHighSpeedVideoSizesFor.getTypeParameters();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(typeParameters, 10));
        for (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter javaTypeParameter : typeParameters) {
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor resolveTypeParameter = lazyJavaClassDescriptor.getHighResolutionOutputSizeshNQ4ISI.getTypeParameterResolver().resolveTypeParameter(javaTypeParameter);
            if (resolveTypeParameter == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Parameter ");
                sb.append(javaTypeParameter);
                sb.append(" surely belongs to class ");
                sb.append(lazyJavaClassDescriptor.getHighSpeedVideoSizesFor);
                sb.append(", so it must be resolved");
                throw new java.lang.AssertionError(sb.toString());
            }
            arrayList.add(resolveTypeParameter);
        }
        return arrayList;
    }
}
