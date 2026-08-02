package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 o2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001oB\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0007J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0013J)\u0010\u0019\u001a\u00020\n2\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n0\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u0013J\u0015\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b!\u0010\"J#\u0010$\u001a\u00020\n2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030#2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b'\u0010\"J1\u0010*\u001a\u00020 *\u0006\u0012\u0002\b\u00030#2\u0018\u0010)\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030#\u0012\u0006\u0012\u0004\u0018\u00010\r0(H\u0002¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\n¢\u0006\u0004\b,\u0010\u0013J#\u0010/\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\n\u0018\u00010-2\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b/\u00100R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u0010\u0007R\u0016\u0010*\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u00106R$\u00108\u001a\u0004\u0018\u0001078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010A\u001a\u0004\u0018\u00010\r8WX\u0096\u0004¢\u0006\f\u0012\u0004\b@\u0010\u0013\u001a\u0004\b>\u0010?R\u0011\u0010D\u001a\u00020 8G¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0011\u0010F\u001a\u00020 8G¢\u0006\u0006\u001a\u0004\bE\u0010CR$\u0010J\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020 8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010C\"\u0004\bH\u0010IR$\u0010M\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020 8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010C\"\u0004\bL\u0010IR$\u0010P\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020 8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010C\"\u0004\bO\u0010IR$\u0010S\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020 8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010C\"\u0004\bR\u0010IR$\u0010V\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020 8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010C\"\u0004\bU\u0010IR$\u0010Y\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020 8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010C\"\u0004\bX\u0010IR$\u0010\\\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020 8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010C\"\u0004\b[\u0010IR$\u0010_\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020 8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010C\"\u0004\b^\u0010IR*\u0010`\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010b\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u00106R\u001e\u0010e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bb\u0010dR*\u00105\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030#\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\be\u0010fR$\u0010g\u001a\u00020 2\u0006\u0010)\u001a\u00020 8C@CX\u0082\u000e¢\u0006\f\u001a\u0004\b5\u0010C\"\u0004\bb\u0010IR$\u0010j\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020 8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010C\"\u0004\bi\u0010IR$\u0010m\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020 8A@CX\u0080\u000e¢\u0006\f\u001a\u0004\bk\u0010C\"\u0004\bl\u0010IR\u0011\u0010n\u001a\u00020 8G¢\u0006\u0006\u001a\u0004\bn\u0010C"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/RecomposeScope;", "Landroidx/compose/runtime/tooling/IdentifiableRecomposeScope;", "Landroidx/compose/runtime/RecomposeScopeOwner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "<init>", "(Landroidx/compose/runtime/RecomposeScopeOwner;)V", "Landroidx/compose/runtime/Composer;", "composer", "", "compose", "(Landroidx/compose/runtime/Composer;)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/runtime/InvalidationResult;", "invalidateForResult", "(Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "release", "()V", "adoptedBy", "invalidate", "Lkotlin/Function2;", "", "block", "updateScope", "(Lkotlin/jvm/functions/Function2;)V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "(I)V", "scopeSkipped", "instance", "", "recordRead", "(Ljava/lang/Object;)Z", "Landroidx/compose/runtime/DerivedState;", "recordDerivedStateValue", "(Landroidx/compose/runtime/DerivedState;Ljava/lang/Object;)V", "instances", "isInvalidFor", "Landroidx/collection/MutableScatterMap;", "p0", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/runtime/DerivedState;Landroidx/collection/MutableScatterMap;)Z", "rereadTrackedInstances", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "end", "(I)Lkotlin/jvm/functions/Function1;", "Landroidx/compose/runtime/RecomposeScopeOwner;", "getOwner$runtime", "()Landroidx/compose/runtime/RecomposeScopeOwner;", "setOwner$runtime", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "Landroidx/compose/runtime/Anchor;", io.ktor.http.LinkHeader.Parameters.Anchor, "Landroidx/compose/runtime/Anchor;", "getAnchor", "()Landroidx/compose/runtime/Anchor;", "setAnchor", "(Landroidx/compose/runtime/Anchor;)V", "getIdentity", "()Ljava/lang/Object;", "getIdentity$annotations", "identity", "getValid", "()Z", "valid", "getCanRecompose", "canRecompose", "getUsed", "setUsed", "(Z)V", "used", "getReusing", "setReusing", "reusing", "getResetReusing", "setResetReusing", "resetReusing", "getPaused", "setPaused", "paused", "getResuming", "setResuming", "resuming", "getDefaultsInScope", "setDefaultsInScope", "defaultsInScope", "getDefaultsInvalid", "setDefaultsInvalid", "defaultsInvalid", "getRequiresRecompose", "setRequiresRecompose", "requiresRecompose", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function2;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/collection/MutableObjectIntMap;", "Landroidx/collection/MutableObjectIntMap;", "Camera2StreamConfigurationMap", "Landroidx/collection/MutableScatterMap;", "getOutputMinFrameDuration", "getForcedRecompose", "setForcedRecompose", "forcedRecompose", "getSkipped$runtime", "setSkipped", com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.FlowOutcome.SKIPPED, "isConditional", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RecomposeScopeImpl implements androidx.compose.runtime.ScopeUpdateScope, androidx.compose.runtime.RecomposeScope, androidx.compose.runtime.tooling.IdentifiableRecomposeScope {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.collection.MutableScatterMap<androidx.compose.runtime.DerivedState<?>, java.lang.Object> getHighSpeedVideoSizes;
    private androidx.compose.runtime.Anchor anchor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.collection.MutableObjectIntMap<java.lang.Object> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;
    private kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;
    private androidx.compose.runtime.RecomposeScopeOwner owner;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.runtime.RecomposeScopeImpl.Companion INSTANCE = new androidx.compose.runtime.RecomposeScopeImpl.Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ void getIdentity$annotations() {
    }

    public RecomposeScopeImpl(androidx.compose.runtime.RecomposeScopeOwner recomposeScopeOwner) {
        this.owner = recomposeScopeOwner;
    }

    /* renamed from: getOwner$runtime, reason: from getter */
    public final androidx.compose.runtime.RecomposeScopeOwner getOwner() {
        return this.owner;
    }

    public final void setOwner$runtime(androidx.compose.runtime.RecomposeScopeOwner recomposeScopeOwner) {
        this.owner = recomposeScopeOwner;
    }

    public final androidx.compose.runtime.Anchor getAnchor() {
        return this.anchor;
    }

    public final void setAnchor(androidx.compose.runtime.Anchor anchor) {
        this.anchor = anchor;
    }

    @Override // androidx.compose.runtime.tooling.IdentifiableRecomposeScope
    public final java.lang.Object getIdentity() {
        return this.anchor;
    }

    public final boolean getValid() {
        androidx.compose.runtime.Anchor anchor;
        return (this.owner == null || (anchor = this.anchor) == null || !anchor.getValid()) ? false : true;
    }

    public final boolean getCanRecompose() {
        return this.getHighSpeedVideoFpsRangesFor != null;
    }

    public final void compose(androidx.compose.runtime.Composer composer) {
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2 = this.getHighSpeedVideoFpsRangesFor;
        if (function2 == null) {
            throw new java.lang.IllegalStateException("Invalid restart scope".toString());
        }
        function2.invoke(composer, 1);
    }

    public final androidx.compose.runtime.InvalidationResult invalidateForResult(java.lang.Object value) {
        androidx.compose.runtime.InvalidationResult invalidate;
        androidx.compose.runtime.RecomposeScopeOwner recomposeScopeOwner = this.owner;
        return (recomposeScopeOwner == null || (invalidate = recomposeScopeOwner.invalidate(this, value)) == null) ? androidx.compose.runtime.InvalidationResult.IGNORED : invalidate;
    }

    public final void release() {
        androidx.compose.runtime.RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.recomposeScopeReleased(this);
        }
        this.owner = null;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRangesFor = null;
    }

    public final void adoptedBy(androidx.compose.runtime.RecomposeScopeOwner owner) {
        this.owner = owner;
    }

    @Override // androidx.compose.runtime.RecomposeScope
    public final void invalidate() {
        androidx.compose.runtime.RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.invalidate(this, null);
        }
    }

    @Override // androidx.compose.runtime.ScopeUpdateScope
    public final void updateScope(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> block) {
        this.getHighSpeedVideoFpsRangesFor = block;
    }

    public final void start(int token) {
        this.getHighResolutionOutputSizeshNQ4ISI = token;
        setSkipped(false);
    }

    public final void scopeSkipped() {
        if (getReusing()) {
            return;
        }
        setSkipped(true);
    }

    public final boolean recordRead(java.lang.Object instance) {
        int i = 0;
        if (getHighSpeedVideoSizes()) {
            return false;
        }
        androidx.collection.MutableObjectIntMap<java.lang.Object> mutableObjectIntMap = this.Camera2StreamConfigurationMap;
        int i2 = 1;
        if (mutableObjectIntMap == null) {
            mutableObjectIntMap = new androidx.collection.MutableObjectIntMap<>(i, i2, null);
            this.Camera2StreamConfigurationMap = mutableObjectIntMap;
        }
        return mutableObjectIntMap.put(instance, this.getHighResolutionOutputSizeshNQ4ISI, -1) == this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void recordDerivedStateValue(androidx.compose.runtime.DerivedState<?> instance, java.lang.Object value) {
        androidx.collection.MutableScatterMap<androidx.compose.runtime.DerivedState<?>, java.lang.Object> mutableScatterMap = this.getHighSpeedVideoSizes;
        if (mutableScatterMap == null) {
            mutableScatterMap = new androidx.collection.MutableScatterMap<>(0, 1, null);
            this.getHighSpeedVideoSizes = mutableScatterMap;
        }
        mutableScatterMap.set(instance, value);
    }

    public final boolean isConditional() {
        return this.getHighSpeedVideoSizes != null;
    }

    public final boolean isInvalidFor(java.lang.Object instances) {
        androidx.collection.MutableScatterMap<androidx.compose.runtime.DerivedState<?>, java.lang.Object> mutableScatterMap;
        if (instances == null || (mutableScatterMap = this.getHighSpeedVideoSizes) == null) {
            return true;
        }
        if (instances instanceof androidx.compose.runtime.DerivedState) {
            return getHighSpeedVideoFpsRanges((androidx.compose.runtime.DerivedState) instances, mutableScatterMap);
        }
        if (!(instances instanceof androidx.collection.ScatterSet)) {
            return true;
        }
        androidx.collection.ScatterSet scatterSet = (androidx.collection.ScatterSet) instances;
        if (scatterSet.isNotEmpty()) {
            java.lang.Object[] objArr = scatterSet.elements;
            long[] jArr = scatterSet.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                java.lang.Object obj = objArr[(i << 3) + i3];
                                if (!(obj instanceof androidx.compose.runtime.DerivedState) || getHighSpeedVideoFpsRanges((androidx.compose.runtime.DerivedState) obj, mutableScatterMap)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
                return true;
            }
        }
        return false;
    }

    private static boolean getHighSpeedVideoFpsRanges(androidx.compose.runtime.DerivedState<?> derivedState, androidx.collection.MutableScatterMap<androidx.compose.runtime.DerivedState<?>, java.lang.Object> mutableScatterMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(derivedState, "");
        androidx.compose.runtime.SnapshotMutationPolicy<?> policy = derivedState.getPolicy();
        if (policy == null) {
            policy = androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy();
        }
        return !policy.equivalent(derivedState.getCurrentRecord().getCurrentValue(), mutableScatterMap.get(derivedState));
    }

    public final void rereadTrackedInstances() {
        androidx.collection.MutableObjectIntMap<java.lang.Object> mutableObjectIntMap;
        androidx.compose.runtime.RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner == null || (mutableObjectIntMap = this.Camera2StreamConfigurationMap) == null) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(true);
        try {
            androidx.collection.MutableObjectIntMap<java.lang.Object> mutableObjectIntMap2 = mutableObjectIntMap;
            java.lang.Object[] objArr = mutableObjectIntMap2.keys;
            int[] iArr = mutableObjectIntMap2.values;
            long[] jArr = mutableObjectIntMap2.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                java.lang.Object obj = objArr[i4];
                                int i5 = iArr[i4];
                                recomposeScopeOwner.recordReadOf(obj);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        } finally {
            getHighResolutionOutputSizeshNQ4ISI(false);
        }
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.runtime.Composition, kotlin.Unit> end(final int token) {
        final androidx.collection.MutableObjectIntMap<java.lang.Object> mutableObjectIntMap = this.Camera2StreamConfigurationMap;
        if (mutableObjectIntMap == null || getSkipped$runtime()) {
            return null;
        }
        androidx.collection.MutableObjectIntMap<java.lang.Object> mutableObjectIntMap2 = mutableObjectIntMap;
        java.lang.Object[] objArr = mutableObjectIntMap2.keys;
        int[] iArr = mutableObjectIntMap2.values;
        long[] jArr = mutableObjectIntMap2.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        java.lang.Object obj = objArr[i4];
                        if (iArr[i4] != token) {
                            return new kotlin.jvm.functions.Function1() { // from class: androidx.compose.runtime.RecomposeScopeImpl$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    kotlin.Unit highSpeedVideoFpsRangesFor;
                                    highSpeedVideoFpsRangesFor = androidx.compose.runtime.RecomposeScopeImpl.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.RecomposeScopeImpl.this, token, mutableObjectIntMap, (androidx.compose.runtime.Composition) obj2);
                                    return highSpeedVideoFpsRangesFor;
                                }
                            };
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return null;
                }
            }
            if (i == length) {
                return null;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl, int i, androidx.collection.MutableObjectIntMap mutableObjectIntMap, androidx.compose.runtime.Composition composition) {
        int i2;
        if (recomposeScopeImpl.getHighResolutionOutputSizeshNQ4ISI == i && kotlin.jvm.internal.Intrinsics.areEqual(mutableObjectIntMap, recomposeScopeImpl.Camera2StreamConfigurationMap) && (composition instanceof androidx.compose.runtime.CompositionImpl)) {
            long[] jArr = mutableObjectIntMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((255 & j) < 128) {
                                int i7 = (i3 << 3) + i6;
                                java.lang.Object obj = mutableObjectIntMap.keys[i7];
                                boolean z = mutableObjectIntMap.values[i7] != i;
                                if (z) {
                                    androidx.compose.runtime.CompositionImpl compositionImpl = (androidx.compose.runtime.CompositionImpl) composition;
                                    compositionImpl.removeObservation$runtime(obj, recomposeScopeImpl);
                                    if (obj instanceof androidx.compose.runtime.DerivedState) {
                                        compositionImpl.removeDerivedStateObservation$runtime((androidx.compose.runtime.DerivedState) obj);
                                        androidx.collection.MutableScatterMap<androidx.compose.runtime.DerivedState<?>, java.lang.Object> mutableScatterMap = recomposeScopeImpl.getHighSpeedVideoSizes;
                                        if (mutableScatterMap != 0) {
                                            mutableScatterMap.remove(obj);
                                        }
                                    }
                                }
                                if (z) {
                                    mutableObjectIntMap.removeValueAt(i7);
                                }
                                i2 = 8;
                            } else {
                                i2 = i4;
                            }
                            j >>= i2;
                            i6++;
                            i4 = i2;
                        }
                        if (i5 != i4) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/SlotWriter;", "slots", "", "Landroidx/compose/runtime/Anchor;", "anchors", "Landroidx/compose/runtime/RecomposeScopeOwner;", "newOwner", "", "adoptAnchoredScopes$runtime", "(Landroidx/compose/runtime/SlotWriter;Ljava/util/List;Landroidx/compose/runtime/RecomposeScopeOwner;)V", "Landroidx/compose/runtime/SlotTable;", "", "hasAnchoredRecomposeScopes$runtime", "(Landroidx/compose/runtime/SlotTable;Ljava/util/List;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final void adoptAnchoredScopes$runtime(androidx.compose.runtime.SlotWriter slots, java.util.List<androidx.compose.runtime.Anchor> anchors, androidx.compose.runtime.RecomposeScopeOwner newOwner) {
            java.util.List<androidx.compose.runtime.Anchor> list = anchors;
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                java.lang.Object slot = slots.slot(anchors.get(i), 0);
                androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl = slot instanceof androidx.compose.runtime.RecomposeScopeImpl ? (androidx.compose.runtime.RecomposeScopeImpl) slot : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.adoptedBy(newOwner);
                }
            }
        }

        public final boolean hasAnchoredRecomposeScopes$runtime(androidx.compose.runtime.SlotTable slots, java.util.List<androidx.compose.runtime.Anchor> anchors) {
            java.util.List<androidx.compose.runtime.Anchor> list = anchors;
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    androidx.compose.runtime.Anchor anchor = anchors.get(i);
                    if (slots.ownsAnchor(anchor) && (slots.slot$runtime(slots.anchorIndex(anchor), 0) instanceof androidx.compose.runtime.RecomposeScopeImpl)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean getUsed() {
        return (this.getHighSpeedVideoFpsRanges & 1) != 0;
    }

    public final void setUsed(boolean z) {
        int i = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = z ? i | 1 : i & (-2);
    }

    public final boolean getReusing() {
        return (this.getHighSpeedVideoFpsRanges & 128) != 0;
    }

    public final void setReusing(boolean z) {
        int i = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = z ? i | 128 : i & (-129);
    }

    public final boolean getResetReusing() {
        return (this.getHighSpeedVideoFpsRanges & 1024) != 0;
    }

    public final void setResetReusing(boolean z) {
        int i = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = z ? i | 1024 : i & (-1025);
    }

    public final boolean getPaused() {
        return (this.getHighSpeedVideoFpsRanges & 256) != 0;
    }

    public final void setPaused(boolean z) {
        int i = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = z ? i | 256 : i & (-257);
    }

    public final boolean getResuming() {
        return (this.getHighSpeedVideoFpsRanges & 512) != 0;
    }

    public final void setResuming(boolean z) {
        int i = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = z ? i | 512 : i & (-513);
    }

    public final boolean getDefaultsInScope() {
        return (this.getHighSpeedVideoFpsRanges & 2) != 0;
    }

    public final void setDefaultsInScope(boolean z) {
        int i = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = z ? i | 2 : i & (-3);
    }

    public final boolean getDefaultsInvalid() {
        return (this.getHighSpeedVideoFpsRanges & 4) != 0;
    }

    public final void setDefaultsInvalid(boolean z) {
        int i = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = z ? i | 4 : i & (-5);
    }

    public final boolean getRequiresRecompose() {
        return (this.getHighSpeedVideoFpsRanges & 8) != 0;
    }

    public final void setRequiresRecompose(boolean z) {
        int i = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = z ? i | 8 : i & (-9);
    }

    private final boolean getHighSpeedVideoSizes() {
        return (this.getHighSpeedVideoFpsRanges & 32) != 0;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        int i = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = z ? i | 32 : i & (-33);
    }

    public final boolean getForcedRecompose() {
        return (this.getHighSpeedVideoFpsRanges & 64) != 0;
    }

    public final void setForcedRecompose(boolean z) {
        int i = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = z ? i | 64 : i & (-65);
    }

    public final boolean getSkipped$runtime() {
        return (this.getHighSpeedVideoFpsRanges & 16) != 0;
    }

    private final void setSkipped(boolean z) {
        int i = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = z ? i | 16 : i & (-17);
    }
}
