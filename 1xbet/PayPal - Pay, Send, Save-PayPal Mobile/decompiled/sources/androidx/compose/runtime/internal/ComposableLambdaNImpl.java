package androidx.compose.runtime.internal;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u000e\"\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaNImpl;", "Landroidx/compose/runtime/internal/ComposableLambdaN;", "", "key", "", "tracked", "arity", "<init>", "(IZI)V", "", "block", "", "update", "(Ljava/lang/Object;)V", "", "args", "invoke", "([Ljava/lang/Object;)Ljava/lang/Object;", com.visa.cbp.getEncExpo.warmup, "getKey", "()I", "getHighSpeedVideoFpsRanges", "Z", "getHighSpeedVideoSizes", "getArity", "Camera2StreamConfigurationMap", "Ljava/lang/Object;", "Landroidx/compose/runtime/RecomposeScope;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/RecomposeScope;", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableLambdaNImpl implements androidx.compose.runtime.internal.ComposableLambdaN {
    public static final int $stable = 0;
    private java.lang.Object Camera2StreamConfigurationMap;
    private final int arity;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.runtime.RecomposeScope getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;
    private java.util.List<androidx.compose.runtime.RecomposeScope> getHighSpeedVideoFpsRangesFor;
    private final int key;

    public ComposableLambdaNImpl(int i, boolean z, int i2) {
        this.key = i;
        this.getHighSpeedVideoSizes = z;
        this.arity = i2;
    }

    public final int getKey() {
        return this.key;
    }

    @Override // kotlin.jvm.functions.FunctionN, kotlin.jvm.internal.FunctionBase
    public final int getArity() {
        return this.arity;
    }

    public final void update(java.lang.Object block) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(block, this.Camera2StreamConfigurationMap)) {
            return;
        }
        boolean z = this.Camera2StreamConfigurationMap == null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(block, "");
        this.Camera2StreamConfigurationMap = (kotlin.jvm.functions.FunctionN) block;
        if (z || !this.getHighSpeedVideoSizes) {
            return;
        }
        androidx.compose.runtime.RecomposeScope recomposeScope = this.getHighSpeedVideoFpsRanges;
        if (recomposeScope != null) {
            recomposeScope.invalidate();
            this.getHighSpeedVideoFpsRanges = null;
        }
        java.util.List<androidx.compose.runtime.RecomposeScope> list = this.getHighSpeedVideoFpsRangesFor;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).invalidate();
            }
            list.clear();
        }
    }

    @Override // kotlin.jvm.functions.FunctionN
    public final java.lang.Object invoke(final java.lang.Object... args) {
        androidx.compose.runtime.RecomposeScope recomposeScope;
        final int length = args.length - 2;
        for (int i = 1; i * 10 < length; i++) {
            length--;
        }
        java.lang.Object obj = args[length];
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        int i2 = 0;
        java.lang.Object[] array = kotlin.collections.ArraysKt.slice(args, kotlin.ranges.RangesKt.until(0, args.length - 1)).toArray(new java.lang.Object[0]);
        java.lang.Object obj2 = args[args.length - 1];
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
        int intValue = ((java.lang.Integer) obj2).intValue();
        androidx.compose.runtime.Composer startRestartGroup = ((androidx.compose.runtime.Composer) obj).startRestartGroup(this.key);
        if (this.getHighSpeedVideoSizes && (recomposeScope = startRestartGroup.getRecomposeScope()) != null) {
            startRestartGroup.recordUsed(recomposeScope);
            if (androidx.compose.runtime.internal.ComposableLambdaKt.replacableWith(this.getHighSpeedVideoFpsRanges, recomposeScope)) {
                this.getHighSpeedVideoFpsRanges = recomposeScope;
            } else {
                java.util.List<androidx.compose.runtime.RecomposeScope> list = this.getHighSpeedVideoFpsRangesFor;
                if (list == null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    this.getHighSpeedVideoFpsRangesFor = arrayList;
                    arrayList.add(recomposeScope);
                } else {
                    int size = list.size();
                    while (true) {
                        if (i2 < size) {
                            if (androidx.compose.runtime.internal.ComposableLambdaKt.replacableWith(list.get(i2), recomposeScope)) {
                                list.set(i2, recomposeScope);
                                break;
                            }
                            i2++;
                        } else {
                            list.add(recomposeScope);
                            break;
                        }
                    }
                }
            }
        }
        int differentBits = startRestartGroup.changed(this) ? androidx.compose.runtime.internal.ComposableLambdaKt.differentBits(length) : androidx.compose.runtime.internal.ComposableLambdaKt.sameBits(length);
        java.lang.Object obj3 = this.Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "");
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
        spreadBuilder.addSpread(array);
        spreadBuilder.add(java.lang.Integer.valueOf(intValue | differentBits));
        java.lang.Object invoke = ((kotlin.jvm.functions.FunctionN) obj3).invoke(spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()]));
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaNImpl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                    return androidx.compose.runtime.internal.ComposableLambdaNImpl.$r8$lambda$9k_e3la5cGYuh3PnJ0Qve7Y7tVg(args, length, this, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                }
            });
        }
        return invoke;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9k_e3la5cGYuh3PnJ0Qve7Y7tVg(java.lang.Object[] objArr, int i, androidx.compose.runtime.internal.ComposableLambdaNImpl composableLambdaNImpl, androidx.compose.runtime.Composer composer, int i2) {
        java.lang.Object[] array = kotlin.collections.ArraysKt.slice(objArr, kotlin.ranges.RangesKt.until(0, i)).toArray(new java.lang.Object[0]);
        java.lang.Object obj = objArr[i + 1];
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(((java.lang.Integer) obj).intValue());
        int length = (objArr.length - i) - 2;
        java.lang.Object[] objArr2 = new java.lang.Object[length];
        for (int i3 = 0; i3 < length; i3++) {
            java.lang.Object obj2 = objArr[i + 2 + i3];
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
            objArr2[i3] = java.lang.Integer.valueOf(androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(((java.lang.Integer) obj2).intValue()));
        }
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(4);
        spreadBuilder.addSpread(array);
        spreadBuilder.add(composer);
        spreadBuilder.add(java.lang.Integer.valueOf(updateChangedFlags | 1));
        spreadBuilder.addSpread(objArr2);
        composableLambdaNImpl.invoke(spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()]));
        return kotlin.Unit.INSTANCE;
    }
}
