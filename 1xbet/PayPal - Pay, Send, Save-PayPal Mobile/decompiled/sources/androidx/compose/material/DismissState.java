package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\t8G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/material/DismissState;", "Landroidx/compose/material/SwipeableState;", "Landroidx/compose/material/DismissValue;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "<init>", "(Landroidx/compose/material/DismissValue;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/material/DismissDirection;", "direction", "isDismissed", "(Landroidx/compose/material/DismissDirection;)Z", "", "reset", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismiss", "(Landroidx/compose/material/DismissDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDismissDirection", "()Landroidx/compose/material/DismissDirection;", "dismissDirection", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DismissState extends androidx.compose.material.SwipeableState<androidx.compose.material.DismissValue> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material.DismissState.Companion INSTANCE = new androidx.compose.material.DismissState.Companion(null);

    /* renamed from: $r8$lambda$II3xah2zwKxnaXP6N4S_f-FsX0w, reason: not valid java name */
    public static /* synthetic */ boolean m2599$r8$lambda$II3xah2zwKxnaXP6N4S_fFsX0w(androidx.compose.material.DismissValue dismissValue) {
        return true;
    }

    public DismissState(androidx.compose.material.DismissValue dismissValue, kotlin.jvm.functions.Function1<? super androidx.compose.material.DismissValue, java.lang.Boolean> function1) {
        super(dismissValue, null, function1, 2, null);
    }

    public /* synthetic */ DismissState(androidx.compose.material.DismissValue dismissValue, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(dismissValue, (i & 2) != 0 ? new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.DismissState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.compose.material.DismissState.m2599$r8$lambda$II3xah2zwKxnaXP6N4S_fFsX0w((androidx.compose.material.DismissValue) obj));
            }
        } : function1);
    }

    public final androidx.compose.material.DismissDirection getDismissDirection() {
        if (getOffset().getValue().floatValue() == 0.0f) {
            return null;
        }
        return getOffset().getValue().floatValue() > 0.0f ? androidx.compose.material.DismissDirection.StartToEnd : androidx.compose.material.DismissDirection.EndToStart;
    }

    public final boolean isDismissed(androidx.compose.material.DismissDirection direction) {
        return getCurrentValue() == (direction == androidx.compose.material.DismissDirection.StartToEnd ? androidx.compose.material.DismissValue.DismissedToEnd : androidx.compose.material.DismissValue.DismissedToStart);
    }

    public final java.lang.Object reset(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animateTo$default = androidx.compose.material.SwipeableState.animateTo$default(this, androidx.compose.material.DismissValue.Default, null, continuation, 2, null);
        return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object dismiss(androidx.compose.material.DismissDirection dismissDirection, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animateTo$default = androidx.compose.material.SwipeableState.animateTo$default(this, dismissDirection == androidx.compose.material.DismissDirection.StartToEnd ? androidx.compose.material.DismissValue.DismissedToEnd : androidx.compose.material.DismissValue.DismissedToStart, null, continuation, 2, null);
        return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/material/DismissState$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/material/DismissValue;", "", "confirmStateChange", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/DismissState;", "Saver", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.material.DismissState, androidx.compose.material.DismissValue> Saver(final kotlin.jvm.functions.Function1<? super androidx.compose.material.DismissValue, java.lang.Boolean> confirmStateChange) {
            return androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.DismissState$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    androidx.compose.material.DismissValue currentValue;
                    currentValue = ((androidx.compose.material.DismissState) obj2).getCurrentValue();
                    return currentValue;
                }
            }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.DismissState$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.compose.material.DismissState.Companion.$r8$lambda$jqjvQc3iySsDjV7U18XVvLg7x3w(kotlin.jvm.functions.Function1.this, (androidx.compose.material.DismissValue) obj);
                }
            });
        }

        public static /* synthetic */ androidx.compose.material.DismissState $r8$lambda$jqjvQc3iySsDjV7U18XVvLg7x3w(kotlin.jvm.functions.Function1 function1, androidx.compose.material.DismissValue dismissValue) {
            return new androidx.compose.material.DismissState(dismissValue, function1);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
