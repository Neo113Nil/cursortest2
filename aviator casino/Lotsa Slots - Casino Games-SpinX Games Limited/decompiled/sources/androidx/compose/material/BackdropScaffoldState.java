package androidx.compose.material;

/* compiled from: BackdropScaffold.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0011\u0010\u0016\u001a\u00020\u0017H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\u0017H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/material/BackdropScaffoldState;", "Landroidx/compose/material/SwipeableState;", "Landroidx/compose/material/BackdropValue;", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "", "snackbarHostState", "Landroidx/compose/material/SnackbarHostState;", "(Landroidx/compose/material/BackdropValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/material/SnackbarHostState;)V", "isConcealed", "()Z", "isRevealed", "nestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection$material_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getSnackbarHostState", "()Landroidx/compose/material/SnackbarHostState;", "conceal", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reveal", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@androidx.compose.material.ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class BackdropScaffoldState extends androidx.compose.material.SwipeableState<androidx.compose.material.BackdropValue> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material.BackdropScaffoldState.Companion INSTANCE = new androidx.compose.material.BackdropScaffoldState.Companion(null);
    private final androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection;
    private final androidx.compose.material.SnackbarHostState snackbarHostState;

    public /* synthetic */ BackdropScaffoldState(androidx.compose.material.BackdropValue backdropValue, androidx.compose.animation.core.SpringSpec<java.lang.Float> springSpec, androidx.compose.material.BackdropScaffoldState.AnonymousClass1 anonymousClass1, androidx.compose.material.SnackbarHostState snackbarHostState, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(backdropValue, (i & 2) != 0 ? androidx.compose.material.SwipeableDefaults.INSTANCE.getAnimationSpec() : springSpec, (i & 4) != 0 ? new kotlin.jvm.functions.Function1<androidx.compose.material.BackdropValue, java.lang.Boolean>() { // from class: androidx.compose.material.BackdropScaffoldState.1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(androidx.compose.material.BackdropValue it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                return true;
            }
        } : anonymousClass1, (i & 8) != 0 ? new androidx.compose.material.SnackbarHostState() : snackbarHostState);
    }

    public final androidx.compose.material.SnackbarHostState getSnackbarHostState() {
        return this.snackbarHostState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldState(androidx.compose.material.BackdropValue initialValue, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.jvm.functions.Function1<? super androidx.compose.material.BackdropValue, java.lang.Boolean> confirmStateChange, androidx.compose.material.SnackbarHostState snackbarHostState) {
        super(initialValue, animationSpec, confirmStateChange);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(snackbarHostState, "snackbarHostState");
        this.snackbarHostState = snackbarHostState;
        this.nestedScrollConnection = androidx.compose.material.SwipeableKt.getPreUpPostDownNestedScrollConnection(this);
    }

    public final boolean isRevealed() {
        return getCurrentValue() == androidx.compose.material.BackdropValue.Revealed;
    }

    public final boolean isConcealed() {
        return getCurrentValue() == androidx.compose.material.BackdropValue.Concealed;
    }

    public final java.lang.Object reveal(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animateTo$default = androidx.compose.material.SwipeableState.animateTo$default(this, androidx.compose.material.BackdropValue.Revealed, null, continuation, 2, null);
        return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object conceal(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animateTo$default = androidx.compose.material.SwipeableState.animateTo$default(this, androidx.compose.material.BackdropValue.Concealed, null, continuation, 2, null);
        return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
    }

    /* renamed from: getNestedScrollConnection$material_release, reason: from getter */
    public final androidx.compose.ui.input.nestedscroll.NestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    /* compiled from: BackdropScaffold.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/material/BackdropScaffoldState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/BackdropScaffoldState;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "Landroidx/compose/material/BackdropValue;", "", "snackbarHostState", "Landroidx/compose/material/SnackbarHostState;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.material.BackdropScaffoldState, ?> Saver(final androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, final kotlin.jvm.functions.Function1<? super androidx.compose.material.BackdropValue, java.lang.Boolean> confirmStateChange, final androidx.compose.material.SnackbarHostState snackbarHostState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(snackbarHostState, "snackbarHostState");
            return androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2<androidx.compose.runtime.saveable.SaverScope, androidx.compose.material.BackdropScaffoldState, androidx.compose.material.BackdropValue>() { // from class: androidx.compose.material.BackdropScaffoldState$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                public final androidx.compose.material.BackdropValue invoke(androidx.compose.runtime.saveable.SaverScope Saver, androidx.compose.material.BackdropScaffoldState it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    return it.getCurrentValue();
                }
            }, new kotlin.jvm.functions.Function1<androidx.compose.material.BackdropValue, androidx.compose.material.BackdropScaffoldState>() { // from class: androidx.compose.material.BackdropScaffoldState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final androidx.compose.material.BackdropScaffoldState invoke(androidx.compose.material.BackdropValue it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    return new androidx.compose.material.BackdropScaffoldState(it, animationSpec, confirmStateChange, snackbarHostState);
                }
            });
        }
    }
}
