package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/material/BottomSheetScaffoldState;", "", "Landroidx/compose/material/BottomSheetState;", "bottomSheetState", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "<init>", "(Landroidx/compose/material/BottomSheetState;Landroidx/compose/material/SnackbarHostState;)V", "Landroidx/compose/material/BottomSheetState;", "getBottomSheetState", "()Landroidx/compose/material/BottomSheetState;", "Landroidx/compose/material/SnackbarHostState;", "getSnackbarHostState", "()Landroidx/compose/material/SnackbarHostState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BottomSheetScaffoldState {
    public static final int $stable = 0;
    private final androidx.compose.material.BottomSheetState bottomSheetState;
    private final androidx.compose.material.SnackbarHostState snackbarHostState;

    public BottomSheetScaffoldState(androidx.compose.material.BottomSheetState bottomSheetState, androidx.compose.material.SnackbarHostState snackbarHostState) {
        this.bottomSheetState = bottomSheetState;
        this.snackbarHostState = snackbarHostState;
    }

    public final androidx.compose.material.BottomSheetState getBottomSheetState() {
        return this.bottomSheetState;
    }

    public final androidx.compose.material.SnackbarHostState getSnackbarHostState() {
        return this.snackbarHostState;
    }
}
