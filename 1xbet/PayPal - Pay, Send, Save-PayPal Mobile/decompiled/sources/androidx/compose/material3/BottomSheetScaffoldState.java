package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/material3/BottomSheetScaffoldState;", "", "Landroidx/compose/material3/SheetState;", "bottomSheetState", "Landroidx/compose/material3/SnackbarHostState;", "snackbarHostState", "<init>", "(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;)V", "Landroidx/compose/material3/SheetState;", "getBottomSheetState", "()Landroidx/compose/material3/SheetState;", "Landroidx/compose/material3/SnackbarHostState;", "getSnackbarHostState", "()Landroidx/compose/material3/SnackbarHostState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BottomSheetScaffoldState {
    public static final int $stable = 0;
    private final androidx.compose.material3.SheetState bottomSheetState;
    private final androidx.compose.material3.SnackbarHostState snackbarHostState;

    public BottomSheetScaffoldState(androidx.compose.material3.SheetState sheetState, androidx.compose.material3.SnackbarHostState snackbarHostState) {
        this.bottomSheetState = sheetState;
        this.snackbarHostState = snackbarHostState;
    }

    public final androidx.compose.material3.SheetState getBottomSheetState() {
        return this.bottomSheetState;
    }

    public final androidx.compose.material3.SnackbarHostState getSnackbarHostState() {
        return this.snackbarHostState;
    }
}
