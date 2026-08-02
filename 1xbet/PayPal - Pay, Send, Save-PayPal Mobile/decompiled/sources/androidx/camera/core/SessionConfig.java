package androidx.camera.core;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001:\u0001DBa\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0012J+\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b)\u0010\"R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b*\u0010\"R\u001a\u0010,\u001a\u00020+8\u0017X\u0097D¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u001a\u0010/\u001a\u00020\n8\u0017X\u0097D¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00103\u001a\u00020+8\u0017X\u0097D¢\u0006\f\n\u0004\b3\u0010-\u001a\u0004\b4\u0010.R\u001c\u00106\u001a\u0004\u0018\u0001058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010:\u001a\u00020+8\u0017X\u0097D¢\u0006\f\n\u0004\b:\u0010-\u001a\u0004\b:\u0010.R<\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00152\u0012\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00158\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R$\u0010@\u001a\u00020\u00132\u0006\u0010;\u001a\u00020\u00138\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C"}, d2 = {"Landroidx/camera/core/SessionConfig;", "", "", "Landroidx/camera/core/UseCase;", "useCases", "Landroidx/camera/core/ViewPort;", "viewPort", "Landroidx/camera/core/CameraEffect;", "effects", "Landroid/util/Range;", "", "frameRateRange", "", "Landroidx/camera/core/featuregroup/GroupableFeature;", "requiredFeatureGroup", "preferredFeatureGroup", "<init>", "(Ljava/util/List;Landroidx/camera/core/ViewPort;Ljava/util/List;Landroid/util/Range;Ljava/util/Set;Ljava/util/List;)V", "([Landroidx/camera/core/UseCase;)V", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/Consumer;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setFeatureSelectionListener", "(Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/core/ViewPort;", "getViewPort", "()Landroidx/camera/core/ViewPort;", "Ljava/util/List;", "getEffects", "()Ljava/util/List;", "Landroid/util/Range;", "getFrameRateRange", "()Landroid/util/Range;", "Ljava/util/Set;", "getRequiredFeatureGroup", "()Ljava/util/Set;", "getPreferredFeatureGroup", "getUseCases", "", "isLegacy", "Z", "()Z", "sessionType", com.visa.cbp.getEncExpo.warmup, "getSessionType", "()I", "requireNonEmptyUseCases", "getRequireNonEmptyUseCases", "Landroidx/camera/core/CameraFilter;", "cameraFilter", "Landroidx/camera/core/CameraFilter;", "getCameraFilter", "()Landroidx/camera/core/CameraFilter;", "isAutoRotationEnabled", "p0", "featureSelectionListener", "Landroidx/core/util/Consumer;", "getFeatureSelectionListener", "()Landroidx/core/util/Consumer;", "featureSelectionListenerExecutor", "Ljava/util/concurrent/Executor;", "getFeatureSelectionListenerExecutor", "()Ljava/util/concurrent/Executor;", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public class SessionConfig {
    private final androidx.camera.core.CameraFilter cameraFilter;
    private final java.util.List<androidx.camera.core.CameraEffect> effects;
    private androidx.core.util.Consumer<java.util.Set<androidx.camera.core.featuregroup.GroupableFeature>> featureSelectionListener;
    private java.util.concurrent.Executor featureSelectionListenerExecutor;
    private final android.util.Range<java.lang.Integer> frameRateRange;
    private final boolean isAutoRotationEnabled;
    private final boolean isLegacy;
    private final java.util.List<androidx.camera.core.featuregroup.GroupableFeature> preferredFeatureGroup;
    private final boolean requireNonEmptyUseCases;
    private final java.util.Set<androidx.camera.core.featuregroup.GroupableFeature> requiredFeatureGroup;
    private final int sessionType;
    private final java.util.List<androidx.camera.core.UseCase> useCases;
    private final androidx.camera.core.ViewPort viewPort;

    public static /* synthetic */ void $r8$lambda$nHoExTCOzN2kfNQ5jRFz93oyuMM(java.util.Set set) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SessionConfig(java.util.List<? extends androidx.camera.core.UseCase> list, androidx.camera.core.ViewPort viewPort, java.util.List<? extends androidx.camera.core.CameraEffect> list2, android.util.Range<java.lang.Integer> range, java.util.Set<? extends androidx.camera.core.featuregroup.GroupableFeature> set, java.util.List<? extends androidx.camera.core.featuregroup.GroupableFeature> list3) {
        java.lang.String obj;
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        this.viewPort = viewPort;
        this.effects = list2;
        this.frameRateRange = range;
        this.requiredFeatureGroup = set;
        this.preferredFeatureGroup = list3;
        java.util.List<androidx.camera.core.UseCase> distinct = kotlin.collections.CollectionsKt.distinct(list);
        this.useCases = distinct;
        this.requireNonEmptyUseCases = true;
        this.featureSelectionListener = new androidx.core.util.Consumer() { // from class: androidx.camera.core.SessionConfig$$ExternalSyntheticLambda0
            @Override // androidx.core.util.Consumer
            public final void accept(java.lang.Object obj2) {
                androidx.camera.core.SessionConfig.$r8$lambda$nHoExTCOzN2kfNQ5jRFz93oyuMM((java.util.Set) obj2);
            }
        };
        java.util.concurrent.ScheduledExecutorService mainThreadExecutor = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mainThreadExecutor, "");
        this.featureSelectionListenerExecutor = mainThreadExecutor;
        if (getRequireNonEmptyUseCases() && list.isEmpty()) {
            throw new java.lang.IllegalArgumentException("SessionConfig must contain at least one UseCase.".toString());
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(range, androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
            java.util.Iterator<androidx.camera.core.UseCase> it = distinct.iterator();
            while (it.hasNext()) {
                if (it.next().getAppConfig().hasTargetFrameRate()) {
                    throw new java.lang.IllegalArgumentException("Can't set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig.".toString());
                }
            }
        }
        if (this.requiredFeatureGroup.isEmpty() && this.preferredFeatureGroup.isEmpty()) {
            return;
        }
        java.util.Set<androidx.camera.core.featuregroup.GroupableFeature> set2 = this.requiredFeatureGroup;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set2, 10));
        java.util.Iterator<T> it2 = set2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((androidx.camera.core.featuregroup.GroupableFeature) it2.next()).getFeatureTypeInternal());
        }
        for (androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal featureTypeInternal : kotlin.collections.CollectionsKt.distinct(arrayList)) {
            java.util.Set<androidx.camera.core.featuregroup.GroupableFeature> set3 = this.requiredFeatureGroup;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : set3) {
                if (((androidx.camera.core.featuregroup.GroupableFeature) obj2).getFeatureTypeInternal() == featureTypeInternal) {
                    arrayList2.add(obj2);
                }
            }
            java.util.ArrayList arrayList3 = arrayList2;
            if (arrayList3.size() > 1) {
                throw new java.lang.IllegalArgumentException("requiredFeatures has conflicting feature values: ".concat(java.lang.String.valueOf(arrayList3)).toString());
            }
        }
        if (kotlin.collections.CollectionsKt.distinct(this.preferredFeatureGroup).size() != this.preferredFeatureGroup.size()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Duplicate values in preferredFeatures(");
            sb.append(this.preferredFeatureGroup);
            sb.append(')');
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        java.util.Set intersect = kotlin.collections.CollectionsKt.intersect(this.requiredFeatureGroup, this.preferredFeatureGroup);
        if (!intersect.isEmpty()) {
            throw new java.lang.IllegalArgumentException("requiredFeatures and preferredFeatures have duplicate values: ".concat(java.lang.String.valueOf(intersect)).toString());
        }
        for (androidx.camera.core.UseCase useCase : this.useCases) {
            if (androidx.camera.core.featuregroup.impl.UseCaseType.INSTANCE.getFeatureGroupUseCaseType(useCase) == androidx.camera.core.featuregroup.impl.UseCaseType.UNDEFINED) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(useCase);
                sb2.append(" is not supported with feature group");
                throw new java.lang.IllegalArgumentException(sb2.toString().toString());
            }
            java.lang.String str3 = useCase instanceof androidx.camera.core.Preview ? "Preview" : useCase instanceof androidx.camera.core.ImageCapture ? "ImageCapture" : useCase instanceof androidx.camera.core.ImageAnalysis ? "ImageAnalysis" : androidx.camera.core.impl.utils.UseCaseUtil.isVideoCapture(useCase) ? "VideoCapture" : "UseCase";
            androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal appConfiguredGroupableFeatureType$camera_core = androidx.camera.core.featuregroup.impl.UseCaseType.INSTANCE.getAppConfiguredGroupableFeatureType$camera_core(useCase);
            if (appConfiguredGroupableFeatureType$camera_core != null) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("A ");
                kotlin.jvm.internal.Intrinsics.checkNotNull(appConfiguredGroupableFeatureType$camera_core);
                sb3.append(appConfiguredGroupableFeatureType$camera_core.name());
                sb3.append(" value is set to ");
                sb3.append(str3);
                sb3.append(" despite using feature groups. Do not use APIs like ");
                int i = androidx.camera.core.SessionConfig.WhenMappings.$EnumSwitchMapping$0[appConfiguredGroupableFeatureType$camera_core.ordinal()];
                if (i == 1) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                    sb4.append(str3);
                    sb4.append(".Builder.setDynamicRange");
                    obj = sb4.toString();
                } else if (i == 2) {
                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                    sb5.append(str3);
                    sb5.append(".Builder.setTargetFrameRateRange");
                    obj = sb5.toString();
                } else if (i != 3) {
                    if (i == 4) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(str3);
                        sb6.append(".Builder.setOutputFormat");
                        obj = sb6.toString();
                    } else {
                        if (i != 5) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        obj = "Recorder.Builder.setQualitySelector";
                    }
                } else if (androidx.camera.core.impl.utils.UseCaseUtil.isVideoCapture(useCase)) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(str3);
                    sb7.append(".Builder.setVideoStabilizationEnabled");
                    obj = sb7.toString();
                } else {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                    sb8.append(str3);
                    sb8.append(".Builder.setPreviewStabilizationEnabled");
                    obj = sb8.toString();
                }
                sb3.append(obj);
                sb3.append(" while using feature groups. If, for example, ");
                int i2 = androidx.camera.core.SessionConfig.WhenMappings.$EnumSwitchMapping$0[appConfiguredGroupableFeatureType$camera_core.ordinal()];
                if (i2 == 1) {
                    str = "HDR";
                } else if (i2 == 2) {
                    str = "60 FPS";
                } else if (i2 == 3) {
                    str = "stabilization";
                } else if (i2 == 4) {
                    str = "JPEG_R output format";
                } else {
                    if (i2 != 5) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    str = "UHD recording quality";
                }
                sb3.append(str);
                sb3.append(" is required, instead set ");
                int i3 = androidx.camera.core.SessionConfig.WhenMappings.$EnumSwitchMapping$0[appConfiguredGroupableFeatureType$camera_core.ordinal()];
                if (i3 == 1) {
                    str2 = "GroupableFeature.HDR_HLG10";
                } else if (i3 == 2) {
                    str2 = "GroupableFeature.FPS_60";
                } else if (i3 == 3) {
                    str2 = "GroupableFeature.PREVIEW_STABILIZATION";
                } else if (i3 == 4) {
                    str2 = "GroupableFeature.IMAGE_ULTRA_HDR";
                } else {
                    if (i3 != 5) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    str2 = "GroupableFeatures.UHD_RECORDING";
                }
                sb3.append(str2);
                sb3.append(" as either a required or preferred feature.");
                throw new java.lang.IllegalArgumentException(sb3.toString().toString());
            }
        }
    }

    public final androidx.camera.core.ViewPort getViewPort() {
        return this.viewPort;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SessionConfig(java.util.List list, androidx.camera.core.ViewPort viewPort, java.util.List list2, android.util.Range range, java.util.Set set, java.util.List list3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, r2, r3, range, (i & 16) != 0 ? kotlin.collections.SetsKt.emptySet() : set, (i & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3);
        androidx.camera.core.ViewPort viewPort2 = (i & 2) != 0 ? null : viewPort;
        java.util.List emptyList = (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2;
        if ((i & 8) != 0) {
            range = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(range, "");
        }
    }

    public final java.util.List<androidx.camera.core.CameraEffect> getEffects() {
        return this.effects;
    }

    public final android.util.Range<java.lang.Integer> getFrameRateRange() {
        return this.frameRateRange;
    }

    public final java.util.Set<androidx.camera.core.featuregroup.GroupableFeature> getRequiredFeatureGroup() {
        return this.requiredFeatureGroup;
    }

    public final java.util.List<androidx.camera.core.featuregroup.GroupableFeature> getPreferredFeatureGroup() {
        return this.preferredFeatureGroup;
    }

    public final java.util.List<androidx.camera.core.UseCase> getUseCases() {
        return this.useCases;
    }

    /* renamed from: isLegacy, reason: from getter */
    public boolean getIsLegacy() {
        return this.isLegacy;
    }

    public int getSessionType() {
        return this.sessionType;
    }

    public boolean getRequireNonEmptyUseCases() {
        return this.requireNonEmptyUseCases;
    }

    public androidx.camera.core.CameraFilter getCameraFilter() {
        return this.cameraFilter;
    }

    /* renamed from: isAutoRotationEnabled, reason: from getter */
    public boolean getIsAutoRotationEnabled() {
        return this.isAutoRotationEnabled;
    }

    public final androidx.core.util.Consumer<java.util.Set<androidx.camera.core.featuregroup.GroupableFeature>> getFeatureSelectionListener() {
        return this.featureSelectionListener;
    }

    public final java.util.concurrent.Executor getFeatureSelectionListenerExecutor() {
        return this.featureSelectionListenerExecutor;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SessionConfig(androidx.camera.core.UseCase... useCaseArr) {
        this(kotlin.collections.ArraysKt.toList(useCaseArr), null, null, null, null, null, 62, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseArr, "");
    }

    public static /* synthetic */ void setFeatureSelectionListener$default(androidx.camera.core.SessionConfig sessionConfig, java.util.concurrent.Executor executor, androidx.core.util.Consumer consumer, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFeatureSelectionListener");
        }
        if ((i & 1) != 0) {
            java.util.concurrent.ScheduledExecutorService mainThreadExecutor = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mainThreadExecutor, "");
            executor = mainThreadExecutor;
        }
        sessionConfig.setFeatureSelectionListener(executor, consumer);
    }

    public final void setFeatureSelectionListener(java.util.concurrent.Executor executor, androidx.core.util.Consumer<java.util.Set<androidx.camera.core.featuregroup.GroupableFeature>> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.featureSelectionListener = listener;
        this.featureSelectionListenerExecutor = executor;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SessionConfig@");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" {useCases=");
        sb.append(this.useCases);
        sb.append(", frameRateRange=");
        sb.append(this.frameRateRange);
        sb.append(", requiredFeatureGroup=");
        sb.append(this.requiredFeatureGroup);
        sb.append(", preferredFeatureGroup=");
        sb.append(this.preferredFeatureGroup);
        sb.append(", effects=");
        sb.append(this.effects);
        sb.append(", viewPort=");
        sb.append(this.viewPort);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001b\u001a\u00020\u00002\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u0018\"\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020\u00002\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u0018\"\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010#R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010%R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00190*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010%R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010%R\u0016\u00101\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00100R\u0018\u0010/\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00103R\u0016\u0010'\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00104\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100"}, d2 = {"Landroidx/camera/core/SessionConfig$Builder;", "", "", "Landroidx/camera/core/UseCase;", "useCases", "<init>", "(Ljava/util/List;)V", "([Landroidx/camera/core/UseCase;)V", "Landroidx/camera/core/SessionConfig;", "sessionConfig", "(Landroidx/camera/core/SessionConfig;)V", "Landroidx/camera/core/ViewPort;", "viewPort", "setViewPort", "(Landroidx/camera/core/ViewPort;)Landroidx/camera/core/SessionConfig$Builder;", "Landroidx/camera/core/CameraEffect;", "effect", "addEffect", "(Landroidx/camera/core/CameraEffect;)Landroidx/camera/core/SessionConfig$Builder;", "Landroid/util/Range;", "", "frameRateRange", "setFrameRateRange", "(Landroid/util/Range;)Landroidx/camera/core/SessionConfig$Builder;", "", "Landroidx/camera/core/featuregroup/GroupableFeature;", "features", "setRequiredFeatureGroup", "([Landroidx/camera/core/featuregroup/GroupableFeature;)Landroidx/camera/core/SessionConfig$Builder;", "setPreferredFeatureGroup", "", "isAutoRotationEnabled", "setAutoRotationEnabled", "(Z)Landroidx/camera/core/SessionConfig$Builder;", "build", "()Landroidx/camera/core/SessionConfig;", "getOutputFormats", "Ljava/util/List;", "Camera2StreamConfigurationMap", "getInputFormats", "Landroidx/camera/core/ViewPort;", "getHighSpeedVideoFpsRangesFor", "", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/util/Range;", "getHighSpeedVideoFpsRanges", "getOutputMinFrameDuration", "Z", "getHighSpeedVideoSizesFor", "Landroidx/camera/core/CameraFilter;", "Landroidx/camera/core/CameraFilter;", "getInputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private androidx.camera.core.CameraFilter getOutputMinFrameDuration;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private android.util.Range<java.lang.Integer> getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private boolean getHighSpeedVideoSizesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.util.List<androidx.camera.core.featuregroup.GroupableFeature> getOutputFormats;
        private java.util.List<androidx.camera.core.CameraEffect> getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        private boolean getInputSizeshNQ4ISI;

        /* renamed from: getInputFormats, reason: from kotlin metadata */
        private androidx.camera.core.ViewPort getHighSpeedVideoFpsRangesFor;

        /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
        private int getInputFormats;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        private final java.util.List<androidx.camera.core.UseCase> Camera2StreamConfigurationMap;

        /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
        private final java.util.List<androidx.camera.core.featuregroup.GroupableFeature> getHighResolutionOutputSizeshNQ4ISI;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder(java.util.List<? extends androidx.camera.core.UseCase> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.Camera2StreamConfigurationMap = list;
            this.getHighSpeedVideoSizes = new java.util.ArrayList();
            android.util.Range<java.lang.Integer> range = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(range, "");
            this.getHighSpeedVideoFpsRanges = range;
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
            this.getOutputFormats = new java.util.ArrayList();
            this.getInputSizeshNQ4ISI = true;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(androidx.camera.core.UseCase... useCaseArr) {
            this((java.util.List<? extends androidx.camera.core.UseCase>) kotlin.collections.ArraysKt.toList(useCaseArr));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseArr, "");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(androidx.camera.core.SessionConfig sessionConfig) {
            this(sessionConfig.getUseCases());
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
            this.getHighSpeedVideoFpsRangesFor = sessionConfig.getViewPort();
            this.getHighSpeedVideoSizes = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) sessionConfig.getEffects());
            this.getHighSpeedVideoFpsRanges = sessionConfig.getFrameRateRange();
            this.getHighResolutionOutputSizeshNQ4ISI.addAll(sessionConfig.getRequiredFeatureGroup());
            this.getOutputFormats.addAll(sessionConfig.getPreferredFeatureGroup());
            this.getHighSpeedVideoSizesFor = sessionConfig.getIsAutoRotationEnabled();
            this.getOutputMinFrameDuration = sessionConfig.getCameraFilter();
            this.getInputFormats = sessionConfig.getSessionType();
            this.getInputSizeshNQ4ISI = sessionConfig.getRequireNonEmptyUseCases();
        }

        public final androidx.camera.core.SessionConfig.Builder setViewPort(androidx.camera.core.ViewPort viewPort) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewPort, "");
            this.getHighSpeedVideoFpsRangesFor = viewPort;
            return this;
        }

        public final androidx.camera.core.SessionConfig.Builder addEffect(androidx.camera.core.CameraEffect effect) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(effect, "");
            this.getHighSpeedVideoSizes.add(effect);
            return this;
        }

        public final androidx.camera.core.SessionConfig.Builder setFrameRateRange(android.util.Range<java.lang.Integer> frameRateRange) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameRateRange, "");
            this.getHighSpeedVideoFpsRanges = frameRateRange;
            return this;
        }

        public final androidx.camera.core.SessionConfig.Builder setRequiredFeatureGroup(androidx.camera.core.featuregroup.GroupableFeature... features) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(features, "");
            this.getHighResolutionOutputSizeshNQ4ISI.clear();
            kotlin.collections.CollectionsKt.addAll(this.getHighResolutionOutputSizeshNQ4ISI, features);
            return this;
        }

        public final androidx.camera.core.SessionConfig.Builder setPreferredFeatureGroup(androidx.camera.core.featuregroup.GroupableFeature... features) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(features, "");
            this.getOutputFormats.clear();
            kotlin.collections.CollectionsKt.addAll(this.getOutputFormats, features);
            return this;
        }

        public final androidx.camera.core.SessionConfig.Builder setAutoRotationEnabled(boolean isAutoRotationEnabled) {
            this.getHighSpeedVideoSizesFor = isAutoRotationEnabled;
            return this;
        }

        public final androidx.camera.core.SessionConfig build() {
            final java.util.List<androidx.camera.core.UseCase> list = this.Camera2StreamConfigurationMap;
            final androidx.camera.core.ViewPort viewPort = this.getHighSpeedVideoFpsRangesFor;
            final java.util.List list2 = kotlin.collections.CollectionsKt.toList(this.getHighSpeedVideoSizes);
            final android.util.Range<java.lang.Integer> range = this.getHighSpeedVideoFpsRanges;
            final java.util.Set set = kotlin.collections.CollectionsKt.toSet(this.getHighResolutionOutputSizeshNQ4ISI);
            final java.util.List list3 = kotlin.collections.CollectionsKt.toList(this.getOutputFormats);
            return new androidx.camera.core.SessionConfig(this, list, viewPort, list2, range, set, list3) { // from class: androidx.camera.core.SessionConfig$Builder$build$1
                private final androidx.camera.core.CameraFilter cameraFilter;
                private final boolean isAutoRotationEnabled;
                private final boolean requireNonEmptyUseCases;
                private final int sessionType;

                {
                    boolean z;
                    androidx.camera.core.CameraFilter cameraFilter;
                    int i;
                    boolean z2;
                    z = this.getHighSpeedVideoSizesFor;
                    this.isAutoRotationEnabled = z;
                    cameraFilter = this.getOutputMinFrameDuration;
                    this.cameraFilter = cameraFilter;
                    i = this.getInputFormats;
                    this.sessionType = i;
                    z2 = this.getInputSizeshNQ4ISI;
                    this.requireNonEmptyUseCases = z2;
                }

                @Override // androidx.camera.core.SessionConfig
                /* renamed from: isAutoRotationEnabled, reason: from getter */
                public final boolean getIsAutoRotationEnabled() {
                    return this.isAutoRotationEnabled;
                }

                @Override // androidx.camera.core.SessionConfig
                public final androidx.camera.core.CameraFilter getCameraFilter() {
                    return this.cameraFilter;
                }

                @Override // androidx.camera.core.SessionConfig
                public final int getSessionType() {
                    return this.sessionType;
                }

                @Override // androidx.camera.core.SessionConfig
                public final boolean getRequireNonEmptyUseCases() {
                    return this.requireNonEmptyUseCases;
                }
            };
        }
    }

    public final void setFeatureSelectionListener(androidx.core.util.Consumer<java.util.Set<androidx.camera.core.featuregroup.GroupableFeature>> consumer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumer, "");
        setFeatureSelectionListener$default(this, null, consumer, 1, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SessionConfig(java.util.List<? extends androidx.camera.core.UseCase> list, androidx.camera.core.ViewPort viewPort, java.util.List<? extends androidx.camera.core.CameraEffect> list2, android.util.Range<java.lang.Integer> range, java.util.Set<? extends androidx.camera.core.featuregroup.GroupableFeature> set) {
        this(list, viewPort, list2, range, set, null, 32, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SessionConfig(java.util.List<? extends androidx.camera.core.UseCase> list, androidx.camera.core.ViewPort viewPort, java.util.List<? extends androidx.camera.core.CameraEffect> list2, android.util.Range<java.lang.Integer> range) {
        this(list, viewPort, list2, range, null, null, 48, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SessionConfig(java.util.List<? extends androidx.camera.core.UseCase> list, androidx.camera.core.ViewPort viewPort, java.util.List<? extends androidx.camera.core.CameraEffect> list2) {
        this(list, viewPort, list2, null, null, null, 56, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SessionConfig(java.util.List<? extends androidx.camera.core.UseCase> list, androidx.camera.core.ViewPort viewPort) {
        this(list, viewPort, null, null, null, null, 60, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.values().length];
            try {
                iArr[androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.DYNAMIC_RANGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.FPS_RANGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.VIDEO_STABILIZATION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.IMAGE_FORMAT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.RECORDING_QUALITY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SessionConfig(java.util.List<? extends androidx.camera.core.UseCase> list) {
        this(list, null, null, null, null, null, 62, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
    }
}
