package androidx.compose.runtime.internal;

/* compiled from: ComposableLambdaN.jvm.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J(\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u0013\"\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\tR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaNImpl;", "Landroidx/compose/runtime/internal/ComposableLambdaN;", com.ironsource.X3.i.W, "", "tracked", "", "arity", "(IZI)V", "_block", "", "getArity", "()I", "getKey", "scope", "Landroidx/compose/runtime/RecomposeScope;", "scopes", "", "invoke", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "realParamCount", "params", "trackRead", "", "composer", "Landroidx/compose/runtime/Composer;", "trackWrite", "update", "block", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposableLambdaNImpl implements androidx.compose.runtime.internal.ComposableLambdaN {
    public static final int $stable = 0;
    private java.lang.Object _block;
    private final int arity;
    private final int key;
    private androidx.compose.runtime.RecomposeScope scope;
    private java.util.List<androidx.compose.runtime.RecomposeScope> scopes;
    private final boolean tracked;

    private final int realParamCount(int params) {
        int i = params - 2;
        for (int i2 = 1; i2 * 10 < i; i2++) {
            i--;
        }
        return i;
    }

    public ComposableLambdaNImpl(int i, boolean z, int i2) {
        this.key = i;
        this.tracked = z;
        this.arity = i2;
    }

    public final int getKey() {
        return this.key;
    }

    @Override // kotlin.jvm.functions.FunctionN, kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    private final void trackWrite() {
        if (this.tracked) {
            androidx.compose.runtime.RecomposeScope recomposeScope = this.scope;
            if (recomposeScope != null) {
                recomposeScope.invalidate();
                this.scope = null;
            }
            java.util.List<androidx.compose.runtime.RecomposeScope> list = this.scopes;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).invalidate();
                }
                list.clear();
            }
        }
    }

    private final void trackRead(androidx.compose.runtime.Composer composer) {
        androidx.compose.runtime.RecomposeScope recomposeScope;
        if (!this.tracked || (recomposeScope = composer.getRecomposeScope()) == null) {
            return;
        }
        composer.recordUsed(recomposeScope);
        if (androidx.compose.runtime.internal.ComposableLambdaKt.replacableWith(this.scope, recomposeScope)) {
            this.scope = recomposeScope;
            return;
        }
        java.util.List<androidx.compose.runtime.RecomposeScope> list = this.scopes;
        if (list == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.scopes = arrayList;
            arrayList.add(recomposeScope);
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (androidx.compose.runtime.internal.ComposableLambdaKt.replacableWith(list.get(i), recomposeScope)) {
                list.set(i, recomposeScope);
                return;
            }
        }
        list.add(recomposeScope);
    }

    public final void update(java.lang.Object block) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(block, this._block)) {
            return;
        }
        boolean z = this._block == null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(block, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        this._block = (kotlin.jvm.functions.FunctionN) block;
        if (z) {
            return;
        }
        trackWrite();
    }

    @Override // kotlin.jvm.functions.FunctionN
    public java.lang.Object invoke(final java.lang.Object... args) {
        int sameBits;
        final int realParamCount = realParamCount(args.length);
        java.lang.Object obj = args[realParamCount];
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.Composer");
        java.lang.Object[] array = kotlin.collections.ArraysKt.slice(args, kotlin.ranges.RangesKt.until(0, args.length - 1)).toArray(new java.lang.Object[0]);
        java.lang.Object obj2 = args[args.length - 1];
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) obj2).intValue();
        androidx.compose.runtime.Composer startRestartGroup = ((androidx.compose.runtime.Composer) obj).startRestartGroup(this.key);
        trackRead(startRestartGroup);
        if (startRestartGroup.changed(this)) {
            sameBits = androidx.compose.runtime.internal.ComposableLambdaKt.differentBits(realParamCount);
        } else {
            sameBits = androidx.compose.runtime.internal.ComposableLambdaKt.sameBits(realParamCount);
        }
        int i = intValue | sameBits;
        java.lang.Object obj3 = this._block;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
        spreadBuilder.addSpread(array);
        spreadBuilder.add(java.lang.Integer.valueOf(i));
        java.lang.Object invoke = ((kotlin.jvm.functions.FunctionN) obj3).invoke(spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()]));
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaNImpl$invoke$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                    invoke(composer, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer, int i2) {
                    java.lang.Object[] array2 = kotlin.collections.ArraysKt.slice(args, kotlin.ranges.RangesKt.until(0, realParamCount)).toArray(new java.lang.Object[0]);
                    java.lang.Object obj4 = args[realParamCount + 1];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
                    int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(((java.lang.Integer) obj4).intValue());
                    int length = (args.length - realParamCount) - 2;
                    java.lang.Object[] objArr = new java.lang.Object[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        java.lang.Object obj5 = args[realParamCount + 2 + i3];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Int");
                        objArr[i3] = java.lang.Integer.valueOf(androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(((java.lang.Integer) obj5).intValue()));
                    }
                    androidx.compose.runtime.internal.ComposableLambdaNImpl composableLambdaNImpl = this;
                    kotlin.jvm.internal.SpreadBuilder spreadBuilder2 = new kotlin.jvm.internal.SpreadBuilder(4);
                    spreadBuilder2.addSpread(array2);
                    spreadBuilder2.add(composer);
                    spreadBuilder2.add(java.lang.Integer.valueOf(updateChangedFlags | 1));
                    spreadBuilder2.addSpread(objArr);
                    composableLambdaNImpl.invoke(spreadBuilder2.toArray(new java.lang.Object[spreadBuilder2.size()]));
                }
            });
        }
        return invoke;
    }
}
