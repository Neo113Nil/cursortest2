package androidx.compose.foundation.contextmenu;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001f\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0001\u0010\u0006"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "computeContextMenuColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "", "backgroundStyleId", "foregroundStyleId", "(IILandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/contextmenu/ContextMenuColors;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContextMenuUi_androidKt {
    public static final androidx.compose.foundation.contextmenu.ContextMenuColors computeContextMenuColors(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1428061410, i, -1, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:32)");
        }
        androidx.compose.foundation.contextmenu.ContextMenuColors computeContextMenuColors = computeContextMenuColors(android.R.style.Widget.PopupMenu, android.R.style.TextAppearance.Widget.PopupMenu.Large, composer, 54);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return computeContextMenuColors;
    }

    public static final androidx.compose.foundation.contextmenu.ContextMenuColors computeContextMenuColors(int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1689505294, i3, -1, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:41)");
        }
        android.content.Context context = (android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
        java.lang.Object obj = (android.content.res.Configuration) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration());
        boolean changed = composer.changed(context);
        boolean changed2 = composer.changed(obj);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed2 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            long backgroundColor = androidx.compose.foundation.contextmenu.ContextMenuUiKt.getDefaultContextMenuColors().getBackgroundColor();
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{android.R.attr.colorBackground});
            int m6049toArgb8_81llA = androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(backgroundColor);
            int color = obtainStyledAttributes.getColor(0, m6049toArgb8_81llA);
            obtainStyledAttributes.recycle();
            if (color != m6049toArgb8_81llA) {
                backgroundColor = androidx.compose.ui.graphics.ColorKt.Color(color);
            }
            long j = backgroundColor;
            android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i2, new int[]{android.R.attr.textColorPrimary});
            android.content.res.ColorStateList colorStateList = obtainStyledAttributes2.getColorStateList(0);
            obtainStyledAttributes2.recycle();
            long textColor = androidx.compose.foundation.contextmenu.ContextMenuUiKt.getDefaultContextMenuColors().getTextColor();
            int m6049toArgb8_81llA2 = androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(textColor);
            java.lang.Integer valueOf = colorStateList != null ? java.lang.Integer.valueOf(colorStateList.getColorForState(new int[]{android.R.attr.state_enabled}, m6049toArgb8_81llA2)) : null;
            if (valueOf != null && valueOf.intValue() != m6049toArgb8_81llA2) {
                textColor = androidx.compose.ui.graphics.ColorKt.Color(valueOf.intValue());
            }
            long j2 = textColor;
            long disabledTextColor = androidx.compose.foundation.contextmenu.ContextMenuUiKt.getDefaultContextMenuColors().getDisabledTextColor();
            int m6049toArgb8_81llA3 = androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(disabledTextColor);
            java.lang.Integer valueOf2 = colorStateList != null ? java.lang.Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, m6049toArgb8_81llA3)) : null;
            long Color = (valueOf2 == null || valueOf2.intValue() == m6049toArgb8_81llA3) ? disabledTextColor : androidx.compose.ui.graphics.ColorKt.Color(valueOf2.intValue());
            rememberedValue = new androidx.compose.foundation.contextmenu.ContextMenuColors(j, j2, j2, Color, Color, null);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.contextmenu.ContextMenuColors contextMenuColors = (androidx.compose.foundation.contextmenu.ContextMenuColors) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return contextMenuColors;
    }
}
