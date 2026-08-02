package androidx.camera.core.featuregroup.impl.resolver;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\f2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/camera/core/featuregroup/impl/resolver/DefaultFeatureGroupResolver;", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolver;", "Landroidx/camera/core/impl/CameraInfoInternal;", "cameraInfoInternal", "<init>", "(Landroidx/camera/core/impl/CameraInfoInternal;)V", "Landroidx/camera/core/SessionConfig;", "sessionConfig", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult;", "resolveFeatureGroup", "(Landroidx/camera/core/SessionConfig;)Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult;", "Landroidx/camera/core/featuregroup/GroupableFeature;", "", "Landroidx/camera/core/UseCase;", "p0", "Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$UseCaseMissing;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/camera/core/featuregroup/GroupableFeature;Ljava/util/List;)Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult$UseCaseMissing;", "p1", "", "p2", "p3", "(Landroidx/camera/core/SessionConfig;Ljava/util/List;ILjava/util/List;)Landroidx/camera/core/featuregroup/impl/resolver/FeatureGroupResolutionResult;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/core/impl/CameraInfoInternal;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultFeatureGroupResolver implements androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolver {
    private static final androidx.camera.core.featuregroup.impl.resolver.DefaultFeatureGroupResolver.Companion Companion = new androidx.camera.core.featuregroup.impl.resolver.DefaultFeatureGroupResolver.Companion(null);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.core.impl.CameraInfoInternal getHighSpeedVideoSizes;

    public DefaultFeatureGroupResolver(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfoInternal, "");
        this.getHighSpeedVideoSizes = cameraInfoInternal;
    }

    @Override // androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolver
    public final androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult resolveFeatureGroup(androidx.camera.core.SessionConfig sessionConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
        java.util.List<androidx.camera.core.UseCase> useCases = sessionConfig.getUseCases();
        java.util.Set<androidx.camera.core.featuregroup.GroupableFeature> requiredFeatureGroup = sessionConfig.getRequiredFeatureGroup();
        java.util.List<androidx.camera.core.featuregroup.GroupableFeature> preferredFeatureGroup = sessionConfig.getPreferredFeatureGroup();
        if (requiredFeatureGroup.isEmpty() && preferredFeatureGroup.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Must have at least one required or preferred feature".toString());
        }
        for (androidx.camera.core.UseCase useCase : useCases) {
            if (androidx.camera.core.featuregroup.impl.UseCaseType.INSTANCE.getFeatureGroupUseCaseType(useCase) == androidx.camera.core.featuregroup.impl.UseCaseType.UNDEFINED) {
                return new androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.UnsupportedUseCase(useCase);
            }
        }
        java.util.Iterator<T> it = requiredFeatureGroup.iterator();
        while (it.hasNext()) {
            androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.UseCaseMissing highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((androidx.camera.core.featuregroup.GroupableFeature) it.next(), useCases);
            if (highSpeedVideoFpsRangesFor != null) {
                return highSpeedVideoFpsRangesFor;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : preferredFeatureGroup) {
            androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.UseCaseMissing highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor((androidx.camera.core.featuregroup.GroupableFeature) obj, useCases);
            if (highSpeedVideoFpsRangesFor2 != null) {
                androidx.camera.core.Logger.d("DefaultFeatureGroupResolver", "resolveFeatureGroup: filtered out preferred feature due to ".concat(java.lang.String.valueOf(highSpeedVideoFpsRangesFor2)));
            } else {
                highSpeedVideoFpsRangesFor2 = null;
            }
            if (highSpeedVideoFpsRangesFor2 == null) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        androidx.camera.core.Logger.d("DefaultFeatureGroupResolver", "resolveFeatureGroup: filteredPreferredFeatures = ".concat(java.lang.String.valueOf(arrayList2)));
        return getHighSpeedVideoFpsRangesFor(sessionConfig, arrayList2, 0, kotlin.collections.CollectionsKt.emptyList());
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c5, code lost:
    
        if (r1 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ee, code lost:
    
        if (r1 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010f, code lost:
    
        if (r5 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0130, code lost:
    
        if (r5 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0149, code lost:
    
        if (r4 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0152, code lost:
    
        if (r3 == false) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.UseCaseMissing getHighSpeedVideoFpsRangesFor(androidx.camera.core.featuregroup.GroupableFeature groupableFeature, java.util.List<? extends androidx.camera.core.UseCase> list) {
        boolean z;
        boolean z2;
        boolean z3;
        java.lang.String obj;
        java.util.List<? extends androidx.camera.core.UseCase> list2 = list;
        boolean z4 = list2 instanceof java.util.Collection;
        boolean z5 = false;
        if (!z4 || !list2.isEmpty()) {
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((androidx.camera.core.UseCase) it.next()) instanceof androidx.camera.core.ImageCapture) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z4 || !list2.isEmpty()) {
            for (androidx.camera.core.UseCase useCase : list2) {
                if ((useCase instanceof androidx.camera.core.Preview) || androidx.camera.core.impl.utils.UseCaseUtil.isVideoCapture(useCase)) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (!z4 || !list2.isEmpty()) {
            for (androidx.camera.core.UseCase useCase2 : list2) {
                if ((useCase2 instanceof androidx.camera.core.Preview) || (useCase2 instanceof androidx.camera.core.ImageAnalysis) || androidx.camera.core.impl.utils.UseCaseUtil.isVideoCapture(useCase2)) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        if (!z4 || !list2.isEmpty()) {
            java.util.Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (androidx.camera.core.impl.utils.UseCaseUtil.isVideoCapture((androidx.camera.core.UseCase) it2.next())) {
                    z5 = true;
                    break;
                }
            }
        }
        int i = androidx.camera.core.featuregroup.impl.resolver.DefaultFeatureGroupResolver.WhenMappings.$EnumSwitchMapping$1[groupableFeature.getFeatureTypeInternal().ordinal()];
        if (i == 1) {
            obj = androidx.camera.core.featuregroup.impl.UseCaseType.IMAGE_CAPTURE.toString();
        } else if (i == 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(androidx.camera.core.featuregroup.impl.UseCaseType.PREVIEW);
            sb.append(" or ");
            sb.append(androidx.camera.core.featuregroup.impl.UseCaseType.VIDEO_CAPTURE);
            obj = sb.toString();
        } else if (i == 3) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(androidx.camera.core.featuregroup.impl.UseCaseType.PREVIEW);
            sb2.append(" or ");
            sb2.append(androidx.camera.core.featuregroup.impl.UseCaseType.VIDEO_CAPTURE);
            sb2.append(" or ");
            sb2.append(androidx.camera.core.featuregroup.impl.UseCaseType.IMAGE_ANALYSIS);
            obj = sb2.toString();
        } else if (i == 4) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(groupableFeature, "");
            int i2 = androidx.camera.core.featuregroup.impl.resolver.DefaultFeatureGroupResolver.WhenMappings.$EnumSwitchMapping$0[((androidx.camera.core.featuregroup.impl.feature.VideoStabilizationFeature) groupableFeature).getVideoStabilization().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    obj = androidx.camera.core.featuregroup.impl.UseCaseType.VIDEO_CAPTURE.toString();
                }
                obj = null;
                if (obj != null) {
                    return new androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.UseCaseMissing(obj, groupableFeature);
                }
                return null;
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(androidx.camera.core.featuregroup.impl.UseCaseType.PREVIEW);
            sb3.append(" or ");
            sb3.append(androidx.camera.core.featuregroup.impl.UseCaseType.VIDEO_CAPTURE);
            sb3.append(" or ");
            sb3.append(androidx.camera.core.featuregroup.impl.UseCaseType.IMAGE_ANALYSIS);
            obj = sb3.toString();
        } else {
            if (i != 5) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            obj = androidx.camera.core.featuregroup.impl.UseCaseType.VIDEO_CAPTURE.toString();
        }
    }

    private final androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult getHighSpeedVideoFpsRangesFor(androidx.camera.core.SessionConfig p0, java.util.List<? extends androidx.camera.core.featuregroup.GroupableFeature> p1, int p2, java.util.List<? extends androidx.camera.core.featuregroup.GroupableFeature> p3) {
        while (p2 < p1.size()) {
            int i = p2 + 1;
            androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(p0, p1, i, kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends androidx.camera.core.featuregroup.GroupableFeature>) p3, p1.get(p2)));
            if (highSpeedVideoFpsRangesFor instanceof androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.Supported) {
                return highSpeedVideoFpsRangesFor;
            }
            p2 = i;
        }
        java.util.Set plus = kotlin.collections.SetsKt.plus((java.util.Set) p0.getRequiredFeatureGroup(), (java.lang.Iterable) p3);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("getFeatureListResolvedByPriority: features = ");
        sb.append(plus);
        sb.append(", useCases = ");
        sb.append(p0.getUseCases());
        androidx.camera.core.Logger.d("DefaultFeatureGroupResolver", sb.toString());
        java.util.Set set = plus;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set, 10));
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((androidx.camera.core.featuregroup.GroupableFeature) it.next()).getFeatureTypeInternal());
        }
        java.util.Iterator it2 = kotlin.collections.CollectionsKt.distinct(arrayList).iterator();
        while (true) {
            if (!it2.hasNext()) {
                if (this.getHighSpeedVideoSizes.isResolvedFeatureGroupSupported(new androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup(plus), p0)) {
                    return new androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.Supported(new androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup(plus));
                }
            } else {
                androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal featureTypeInternal = (androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal) it2.next();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : set) {
                    if (((androidx.camera.core.featuregroup.GroupableFeature) obj).getFeatureTypeInternal() == featureTypeInternal) {
                        arrayList2.add(obj);
                    }
                }
                if (arrayList2.size() > 1) {
                    break;
                }
            }
        }
        return androidx.camera.core.featuregroup.impl.resolver.FeatureGroupResolutionResult.Unsupported.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/core/featuregroup/impl/resolver/DefaultFeatureGroupResolver$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[androidx.camera.core.impl.stabilization.VideoStabilization.values().length];
            try {
                iArr[androidx.camera.core.impl.stabilization.VideoStabilization.PREVIEW.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.camera.core.impl.stabilization.VideoStabilization.ON.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.values().length];
            try {
                iArr2[androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.IMAGE_FORMAT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.DYNAMIC_RANGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.FPS_RANGE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.VIDEO_STABILIZATION.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.RECORDING_QUALITY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
