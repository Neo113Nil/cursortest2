package androidx.compose.material;

/* compiled from: Strings.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"getString", "", "string", "Landroidx/compose/material/Strings;", "getString-4foXLRw", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Strings_androidKt {
    /* renamed from: getString-4foXLRw, reason: not valid java name */
    public static final java.lang.String m1509getString4foXLRw(int i, androidx.compose.runtime.Composer composer, int i2) {
        java.lang.String str;
        composer.startReplaceableGroup(-726638443);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(getString)P(0:c#material.Strings)25@921L7,26@962L7:Strings.android.kt#jmzs0o");
        androidx.compose.runtime.ProvidableCompositionLocal<android.content.res.Configuration> localConfiguration = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
        composer.consume(localConfiguration);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        androidx.compose.runtime.ProvidableCompositionLocal<android.content.Context> localContext = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(localContext);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        android.content.res.Resources resources = ((android.content.Context) consume).getResources();
        if (androidx.compose.material.Strings.m1498equalsimpl0(i, androidx.compose.material.Strings.INSTANCE.m1506getNavigationMenuUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.navigation_menu);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.navigation_menu)");
        } else if (androidx.compose.material.Strings.m1498equalsimpl0(i, androidx.compose.material.Strings.INSTANCE.m1502getCloseDrawerUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.close_drawer);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.close_drawer)");
        } else if (androidx.compose.material.Strings.m1498equalsimpl0(i, androidx.compose.material.Strings.INSTANCE.m1503getCloseSheetUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.close_sheet);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.close_sheet)");
        } else if (androidx.compose.material.Strings.m1498equalsimpl0(i, androidx.compose.material.Strings.INSTANCE.m1504getDefaultErrorMessageUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.default_error_message);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.st…ng.default_error_message)");
        } else if (androidx.compose.material.Strings.m1498equalsimpl0(i, androidx.compose.material.Strings.INSTANCE.m1505getExposedDropdownMenuUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.dropdown_menu);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.dropdown_menu)");
        } else if (androidx.compose.material.Strings.m1498equalsimpl0(i, androidx.compose.material.Strings.INSTANCE.m1508getSliderRangeStartUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.range_start);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.range_start)");
        } else if (androidx.compose.material.Strings.m1498equalsimpl0(i, androidx.compose.material.Strings.INSTANCE.m1507getSliderRangeEndUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.range_end);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.range_end)");
        } else {
            str = "";
        }
        composer.endReplaceableGroup();
        return str;
    }
}
