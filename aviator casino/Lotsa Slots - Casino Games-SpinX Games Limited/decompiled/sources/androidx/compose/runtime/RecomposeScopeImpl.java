package androidx.compose.runtime;

/* compiled from: RecomposeScopeImpl.kt */
@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0001RB\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010;\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010<\u001a\u00020\u00102\u0006\u0010=\u001a\u00020\u000eJ\u001c\u0010>\u001a\u0010\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0010\u0018\u00010?2\u0006\u0010A\u001a\u00020\u000fJ\b\u0010B\u001a\u00020\u0010H\u0016J\u0010\u0010C\u001a\u00020D2\b\u0010\u0016\u001a\u0004\u0018\u000103J\u0016\u0010E\u001a\u00020\u00122\u000e\u0010F\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010GJ\u0015\u0010H\u001a\u00020I2\u0006\u0010#\u001a\u00020$H\u0001¢\u0006\u0002\bJJ\u000e\u0010K\u001a\u00020\u00122\u0006\u0010L\u001a\u000203J\u0006\u0010M\u001a\u00020\u0010J\u0006\u0010N\u001a\u00020\u0010J\u0006\u0010O\u001a\u00020\u0010J\u000e\u0010P\u001a\u00020\u00102\u0006\u0010A\u001a\u00020\u000fJ\"\u0010Q\u001a\u00020\u00102\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\rH\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u001aR\u000e\u0010\u001e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u001aR\u0011\u0010\"\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0014R\u001a\u0010#\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b%\u0010&R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010'\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\u0014\"\u0004\b)\u0010\u001aR$\u0010*\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u001aR$\u0010-\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128@@BX\u0080\u000e¢\u0006\f\u001a\u0004\b.\u0010\u0014\"\u0004\b/\u0010\u001aR\"\u00100\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u000302\u0012\u0006\u0012\u0004\u0018\u000103\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R$\u00106\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u0010\u0014\"\u0004\b8\u0010\u001aR\u0011\u00109\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b:\u0010\u0014¨\u0006S"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/RecomposeScope;", "owner", "Landroidx/compose/runtime/RecomposeScopeOwner;", "(Landroidx/compose/runtime/RecomposeScopeOwner;)V", io.ktor.http.LinkHeader.Parameters.Anchor, "Landroidx/compose/runtime/Anchor;", "getAnchor", "()Landroidx/compose/runtime/Anchor;", "setAnchor", "(Landroidx/compose/runtime/Anchor;)V", "block", "Lkotlin/Function2;", "Landroidx/compose/runtime/Composer;", "", "", "canRecompose", "", "getCanRecompose", "()Z", "currentToken", "value", "defaultsInScope", "getDefaultsInScope", "setDefaultsInScope", "(Z)V", "defaultsInvalid", "getDefaultsInvalid", "setDefaultsInvalid", "flags", "forcedRecompose", "getForcedRecompose", "setForcedRecompose", "isConditional", "observer", "Landroidx/compose/runtime/tooling/RecomposeScopeObserver;", "getObserver$annotations", "()V", "requiresRecompose", "getRequiresRecompose", "setRequiresRecompose", "rereading", "getRereading", "setRereading", com.facebook.login.LoginLogger.EVENT_PARAM_METHOD_RESULT_SKIPPED, "getSkipped$runtime_release", "setSkipped", "trackedDependencies", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/DerivedState;", "", "trackedInstances", "Landroidx/collection/MutableObjectIntMap;", "used", "getUsed", "setUsed", "valid", "getValid", "adoptedBy", "compose", "composer", "end", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "token", "invalidate", "invalidateForResult", "Landroidx/compose/runtime/InvalidationResult;", "isInvalidFor", com.ironsource.mediationsdk.d.k, "Landroidx/compose/runtime/collection/IdentityArraySet;", "observe", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "observe$runtime_release", "recordRead", com.ironsource.C3232q2.p, "release", "rereadTrackedInstances", "scopeSkipped", "start", "updateScope", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RecomposeScopeImpl implements androidx.compose.runtime.ScopeUpdateScope, androidx.compose.runtime.RecomposeScope {
    private androidx.compose.runtime.Anchor anchor;
    private kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> block;
    private int currentToken;
    private int flags;
    private androidx.compose.runtime.tooling.RecomposeScopeObserver observer;
    private androidx.compose.runtime.RecomposeScopeOwner owner;
    private androidx.collection.MutableScatterMap<androidx.compose.runtime.DerivedState<?>, java.lang.Object> trackedDependencies;
    private androidx.collection.MutableObjectIntMap<java.lang.Object> trackedInstances;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.runtime.RecomposeScopeImpl.Companion INSTANCE = new androidx.compose.runtime.RecomposeScopeImpl.Companion(null);
    public static final int $stable = 8;

    private static /* synthetic */ void getObserver$annotations() {
    }

    public RecomposeScopeImpl(androidx.compose.runtime.RecomposeScopeOwner recomposeScopeOwner) {
        this.owner = recomposeScopeOwner;
    }

    public final androidx.compose.runtime.Anchor getAnchor() {
        return this.anchor;
    }

    public final void setAnchor(androidx.compose.runtime.Anchor anchor) {
        this.anchor = anchor;
    }

    public final boolean getValid() {
        androidx.compose.runtime.Anchor anchor;
        return (this.owner == null || (anchor = this.anchor) == null || !anchor.getValid()) ? false : true;
    }

    public final boolean getCanRecompose() {
        return this.block != null;
    }

    public final boolean getUsed() {
        return (this.flags & 1) != 0;
    }

    public final void setUsed(boolean z) {
        if (z) {
            this.flags |= 1;
        } else {
            this.flags &= -2;
        }
    }

    public final boolean getDefaultsInScope() {
        return (this.flags & 2) != 0;
    }

    public final void setDefaultsInScope(boolean z) {
        if (z) {
            this.flags |= 2;
        } else {
            this.flags &= -3;
        }
    }

    public final boolean getDefaultsInvalid() {
        return (this.flags & 4) != 0;
    }

    public final void setDefaultsInvalid(boolean z) {
        if (z) {
            this.flags |= 4;
        } else {
            this.flags &= -5;
        }
    }

    public final boolean getRequiresRecompose() {
        return (this.flags & 8) != 0;
    }

    public final void setRequiresRecompose(boolean z) {
        if (z) {
            this.flags |= 8;
        } else {
            this.flags &= -9;
        }
    }

    public final void compose(androidx.compose.runtime.Composer composer) {
        kotlin.Unit unit;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2 = this.block;
        androidx.compose.runtime.tooling.RecomposeScopeObserver recomposeScopeObserver = this.observer;
        if (recomposeScopeObserver != null && function2 != null) {
            androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl = this;
            recomposeScopeObserver.onBeginScopeComposition(recomposeScopeImpl);
            try {
                function2.invoke(composer, 1);
                return;
            } finally {
                recomposeScopeObserver.onEndScopeComposition(recomposeScopeImpl);
            }
        }
        if (function2 != null) {
            function2.invoke(composer, 1);
            unit = kotlin.Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new java.lang.IllegalStateException("Invalid restart scope".toString());
        }
    }

    public final androidx.compose.runtime.tooling.CompositionObserverHandle observe$runtime_release(final androidx.compose.runtime.tooling.RecomposeScopeObserver observer) {
        java.lang.Object obj;
        obj = androidx.compose.runtime.RecomposeScopeImplKt.callbackLock;
        synchronized (obj) {
            this.observer = observer;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return new androidx.compose.runtime.tooling.CompositionObserverHandle() { // from class: androidx.compose.runtime.RecomposeScopeImpl$observe$2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public void dispose() {
                java.lang.Object obj2;
                androidx.compose.runtime.tooling.RecomposeScopeObserver recomposeScopeObserver;
                obj2 = androidx.compose.runtime.RecomposeScopeImplKt.callbackLock;
                androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl = androidx.compose.runtime.RecomposeScopeImpl.this;
                androidx.compose.runtime.tooling.RecomposeScopeObserver recomposeScopeObserver2 = observer;
                synchronized (obj2) {
                    recomposeScopeObserver = recomposeScopeImpl.observer;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(recomposeScopeObserver, recomposeScopeObserver2)) {
                        recomposeScopeImpl.observer = null;
                    }
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                }
            }
        };
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
        this.trackedInstances = null;
        this.trackedDependencies = null;
        androidx.compose.runtime.tooling.RecomposeScopeObserver recomposeScopeObserver = this.observer;
        if (recomposeScopeObserver != null) {
            recomposeScopeObserver.onScopeDisposed(this);
        }
    }

    public final void adoptedBy(androidx.compose.runtime.RecomposeScopeOwner owner) {
        this.owner = owner;
    }

    @Override // androidx.compose.runtime.RecomposeScope
    public void invalidate() {
        androidx.compose.runtime.RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.invalidate(this, null);
        }
    }

    @Override // androidx.compose.runtime.ScopeUpdateScope
    public void updateScope(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> block) {
        this.block = block;
    }

    private final boolean getRereading() {
        return (this.flags & 32) != 0;
    }

    private final void setRereading(boolean z) {
        if (z) {
            this.flags |= 32;
        } else {
            this.flags &= -33;
        }
    }

    public final boolean getForcedRecompose() {
        return (this.flags & 64) != 0;
    }

    public final void setForcedRecompose(boolean z) {
        if (z) {
            this.flags |= 64;
        } else {
            this.flags &= -65;
        }
    }

    public final boolean getSkipped$runtime_release() {
        return (this.flags & 16) != 0;
    }

    private final void setSkipped(boolean z) {
        if (z) {
            this.flags |= 16;
        } else {
            this.flags &= -17;
        }
    }

    public final void start(int token) {
        this.currentToken = token;
        setSkipped(false);
    }

    public final void scopeSkipped() {
        setSkipped(true);
    }

    public final boolean recordRead(java.lang.Object instance) {
        int i = 0;
        if (getRereading()) {
            return false;
        }
        androidx.collection.MutableObjectIntMap<java.lang.Object> mutableObjectIntMap = this.trackedInstances;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        int i2 = 1;
        if (mutableObjectIntMap == null) {
            mutableObjectIntMap = new androidx.collection.MutableObjectIntMap<>(i, i2, defaultConstructorMarker);
            this.trackedInstances = mutableObjectIntMap;
        }
        if (mutableObjectIntMap.put(instance, this.currentToken, -1) == this.currentToken) {
            return true;
        }
        if (instance instanceof androidx.compose.runtime.DerivedState) {
            androidx.collection.MutableScatterMap<androidx.compose.runtime.DerivedState<?>, java.lang.Object> mutableScatterMap = this.trackedDependencies;
            if (mutableScatterMap == null) {
                mutableScatterMap = new androidx.collection.MutableScatterMap<>(i, i2, defaultConstructorMarker);
                this.trackedDependencies = mutableScatterMap;
            }
            mutableScatterMap.set(instance, ((androidx.compose.runtime.DerivedState) instance).getCurrentRecord().getCurrentValue());
        }
        return false;
    }

    public final boolean isConditional() {
        return this.trackedDependencies != null;
    }

    public final boolean isInvalidFor(androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object> instances) {
        androidx.collection.MutableScatterMap<androidx.compose.runtime.DerivedState<?>, java.lang.Object> mutableScatterMap;
        if (instances != null && (mutableScatterMap = this.trackedDependencies) != null && instances.isNotEmpty()) {
            androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object> identityArraySet = instances;
            if ((identityArraySet instanceof java.util.Collection) && identityArraySet.isEmpty()) {
                return false;
            }
            for (java.lang.Object obj : identityArraySet) {
                if (obj instanceof androidx.compose.runtime.DerivedState) {
                    androidx.compose.runtime.DerivedState<?> derivedState = (androidx.compose.runtime.DerivedState) obj;
                    androidx.compose.runtime.SnapshotMutationPolicy<?> policy = derivedState.getPolicy();
                    if (policy == null) {
                        policy = androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy();
                    }
                    if (policy.equivalent(derivedState.getCurrentRecord().getCurrentValue(), mutableScatterMap.get(derivedState))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void rereadTrackedInstances() {
        androidx.collection.MutableObjectIntMap<java.lang.Object> mutableObjectIntMap;
        androidx.compose.runtime.RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner == null || (mutableObjectIntMap = this.trackedInstances) == null) {
            return;
        }
        setRereading(true);
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
            setRereading(false);
        }
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.runtime.Composition, kotlin.Unit> end(final int token) {
        final androidx.collection.MutableObjectIntMap<java.lang.Object> mutableObjectIntMap = this.trackedInstances;
        if (mutableObjectIntMap == null || getSkipped$runtime_release()) {
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
                            return new kotlin.jvm.functions.Function1<androidx.compose.runtime.Composition, kotlin.Unit>() { // from class: androidx.compose.runtime.RecomposeScopeImpl$end$1$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composition composition) {
                                    invoke2(composition);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(androidx.compose.runtime.Composition composition) {
                                    int i5;
                                    androidx.collection.MutableObjectIntMap mutableObjectIntMap3;
                                    androidx.collection.MutableScatterMap mutableScatterMap;
                                    androidx.compose.runtime.Composition composition2 = composition;
                                    i5 = androidx.compose.runtime.RecomposeScopeImpl.this.currentToken;
                                    if (i5 == token) {
                                        androidx.collection.MutableObjectIntMap<java.lang.Object> mutableObjectIntMap4 = mutableObjectIntMap;
                                        mutableObjectIntMap3 = androidx.compose.runtime.RecomposeScopeImpl.this.trackedInstances;
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(mutableObjectIntMap4, mutableObjectIntMap3) && (composition2 instanceof androidx.compose.runtime.CompositionImpl)) {
                                            androidx.collection.MutableObjectIntMap<java.lang.Object> mutableObjectIntMap5 = mutableObjectIntMap;
                                            int i6 = token;
                                            androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl = androidx.compose.runtime.RecomposeScopeImpl.this;
                                            long[] jArr2 = mutableObjectIntMap5.metadata;
                                            int length2 = jArr2.length - 2;
                                            if (length2 >= 0) {
                                                int i7 = 0;
                                                while (true) {
                                                    long j2 = jArr2[i7];
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i8 = 8 - ((~(i7 - length2)) >>> 31);
                                                        int i9 = 0;
                                                        while (i9 < i8) {
                                                            if ((255 & j2) < 128) {
                                                                int i10 = (i7 << 3) + i9;
                                                                java.lang.Object obj2 = mutableObjectIntMap5.keys[i10];
                                                                boolean z = mutableObjectIntMap5.values[i10] != i6;
                                                                if (z) {
                                                                    androidx.compose.runtime.CompositionImpl compositionImpl = (androidx.compose.runtime.CompositionImpl) composition2;
                                                                    compositionImpl.removeObservation$runtime_release(obj2, recomposeScopeImpl);
                                                                    androidx.compose.runtime.DerivedState<?> derivedState = obj2 instanceof androidx.compose.runtime.DerivedState ? (androidx.compose.runtime.DerivedState) obj2 : null;
                                                                    if (derivedState != null) {
                                                                        compositionImpl.removeDerivedStateObservation$runtime_release(derivedState);
                                                                        mutableScatterMap = recomposeScopeImpl.trackedDependencies;
                                                                        if (mutableScatterMap != null) {
                                                                            mutableScatterMap.remove(derivedState);
                                                                            if (mutableScatterMap.get_size() == 0) {
                                                                                recomposeScopeImpl.trackedDependencies = null;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (z) {
                                                                    mutableObjectIntMap5.removeValueAt(i10);
                                                                }
                                                            }
                                                            j2 >>= 8;
                                                            i9++;
                                                            composition2 = composition;
                                                        }
                                                        if (i8 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i7 == length2) {
                                                        break;
                                                    }
                                                    i7++;
                                                    composition2 = composition;
                                                }
                                            }
                                            if (mutableObjectIntMap.get_size() == 0) {
                                                androidx.compose.runtime.RecomposeScopeImpl.this.trackedInstances = null;
                                            }
                                        }
                                    }
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

    /* compiled from: RecomposeScopeImpl.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fJ#\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl$Companion;", "", "()V", "adoptAnchoredScopes", "", "slots", "Landroidx/compose/runtime/SlotWriter;", "anchors", "", "Landroidx/compose/runtime/Anchor;", "newOwner", "Landroidx/compose/runtime/RecomposeScopeOwner;", "adoptAnchoredScopes$runtime_release", "hasAnchoredRecomposeScopes", "", "Landroidx/compose/runtime/SlotTable;", "hasAnchoredRecomposeScopes$runtime_release", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void adoptAnchoredScopes$runtime_release(androidx.compose.runtime.SlotWriter slots, java.util.List<androidx.compose.runtime.Anchor> anchors, androidx.compose.runtime.RecomposeScopeOwner newOwner) {
            if (!anchors.isEmpty()) {
                int size = anchors.size();
                for (int i = 0; i < size; i++) {
                    java.lang.Object slot = slots.slot(anchors.get(i), 0);
                    androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl = slot instanceof androidx.compose.runtime.RecomposeScopeImpl ? (androidx.compose.runtime.RecomposeScopeImpl) slot : null;
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.adoptedBy(newOwner);
                    }
                }
            }
        }

        public final boolean hasAnchoredRecomposeScopes$runtime_release(androidx.compose.runtime.SlotTable slots, java.util.List<androidx.compose.runtime.Anchor> anchors) {
            if (!anchors.isEmpty()) {
                int size = anchors.size();
                for (int i = 0; i < size; i++) {
                    androidx.compose.runtime.Anchor anchor = anchors.get(i);
                    if (slots.ownsAnchor(anchor) && (slots.slot$runtime_release(slots.anchorIndex(anchor), 0) instanceof androidx.compose.runtime.RecomposeScopeImpl)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
