package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material/Strings;", "string", "", "getString-4foXLRw", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "getString"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Strings_androidKt {
    /* renamed from: getString-4foXLRw, reason: not valid java name */
    public static final java.lang.String m2763getString4foXLRw(int i, androidx.compose.runtime.Composer composer, int i2) {
        java.lang.String string;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-726638443, i2, -1, "androidx.compose.material.getString (Strings.android.kt:25)");
        }
        composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration());
        android.content.res.Resources resources = ((android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        if (androidx.compose.material.Strings.m2751equalsimpl0(i, androidx.compose.material.Strings.INSTANCE.m2759getNavigationMenuUdPEhr4())) {
            string = resources.getString(androidx.compose.ui.R.string.navigation_menu);
        } else if (androidx.compose.material.Strings.m2751equalsimpl0(i, androidx.compose.material.Strings.INSTANCE.m2755getCloseDrawerUdPEhr4())) {
            string = resources.getString(androidx.compose.ui.R.string.close_drawer);
        } else if (androidx.compose.material.Strings.m2751equalsimpl0(i, androidx.compose.material.Strings.INSTANCE.m2756getCloseSheetUdPEhr4())) {
            string = resources.getString(androidx.compose.ui.R.string.close_sheet);
        } else if (androidx.compose.material.Strings.m2751equalsimpl0(i, androidx.compose.material.Strings.INSTANCE.m2757getDefaultErrorMessageUdPEhr4())) {
            string = resources.getString(androidx.compose.ui.R.string.default_error_message);
        } else if (androidx.compose.material.Strings.m2751equalsimpl0(i, androidx.compose.material.Strings.INSTANCE.m2758getExposedDropdownMenuUdPEhr4())) {
            string = resources.getString(androidx.compose.ui.R.string.dropdown_menu);
        } else if (androidx.compose.material.Strings.m2751equalsimpl0(i, androidx.compose.material.Strings.INSTANCE.m2761getSliderRangeStartUdPEhr4())) {
            string = resources.getString(androidx.compose.ui.R.string.range_start);
        } else if (androidx.compose.material.Strings.m2751equalsimpl0(i, androidx.compose.material.Strings.INSTANCE.m2760getSliderRangeEndUdPEhr4())) {
            string = resources.getString(androidx.compose.ui.R.string.range_end);
        } else {
            string = androidx.compose.material.Strings.m2751equalsimpl0(i, androidx.compose.material.Strings.INSTANCE.m2762getSnackbarPaneTitleUdPEhr4()) ? resources.getString(androidx.compose.material.R.string.mc2_snackbar_pane_title) : "";
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return string;
    }
}
