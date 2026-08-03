package androidx.compose.material;

/* compiled from: Chip.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JQ\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u0019H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 Jo\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010#\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010$\u001a\u00020\u00192\b\b\u0002\u0010%\u001a\u00020\u00192\b\b\u0002\u0010&\u001a\u00020\u00192\b\b\u0002\u0010'\u001a\u00020\u0019H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)JQ\u0010*\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u0019H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010 Jo\u0010,\u001a\u00020\"2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010#\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010$\u001a\u00020\u00192\b\b\u0002\u0010%\u001a\u00020\u00192\b\b\u0002\u0010&\u001a\u00020\u00192\b\b\u0002\u0010'\u001a\u00020\u0019H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010)R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\tR\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0011\u0010\tR\u0011\u0010\u0012\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/material/ChipDefaults;", "", "()V", "ContentOpacity", "", "LeadingIconOpacity", "LeadingIconSize", "Landroidx/compose/ui/unit/Dp;", "getLeadingIconSize-D9Ej5fM", "()F", "F", "MinHeight", "getMinHeight-D9Ej5fM", "OutlinedBorderOpacity", "OutlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM", "SelectedIconSize", "getSelectedIconSize-D9Ej5fM", "outlinedBorder", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "chipColors", "Landroidx/compose/material/ChipColors;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "leadingIconContentColor", "disabledBackgroundColor", "disabledContentColor", "disabledLeadingIconContentColor", "chipColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ChipColors;", "filterChipColors", "Landroidx/compose/material/SelectableChipColors;", "leadingIconColor", "disabledLeadingIconColor", "selectedBackgroundColor", "selectedContentColor", "selectedLeadingIconColor", "filterChipColors-J08w3-E", "(JJJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/SelectableChipColors;", "outlinedChipColors", "outlinedChipColors-5tl4gsc", "outlinedFilterChipColors", "outlinedFilterChipColors-J08w3-E", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@androidx.compose.material.ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class ChipDefaults {
    public static final int $stable = 0;
    public static final float ContentOpacity = 0.87f;
    public static final float LeadingIconOpacity = 0.54f;
    public static final float OutlinedBorderOpacity = 0.12f;
    public static final androidx.compose.material.ChipDefaults INSTANCE = new androidx.compose.material.ChipDefaults();
    private static final float MinHeight = androidx.compose.ui.unit.Dp.m4478constructorimpl(32);
    private static final float OutlinedBorderSize = androidx.compose.ui.unit.Dp.m4478constructorimpl(1);
    private static final float LeadingIconSize = androidx.compose.ui.unit.Dp.m4478constructorimpl(20);
    private static final float SelectedIconSize = androidx.compose.ui.unit.Dp.m4478constructorimpl(18);

    private ChipDefaults() {
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1298getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: chipColors-5tl4gsc, reason: not valid java name */
    public final androidx.compose.material.ChipColors m1295chipColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1838505436);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(chipColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,5:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color)384@16784L6,385@16878L6,386@16939L6,389@17141L6,390@17201L8,391@17276L6,393@17383L8,396@17531L8:Chip.kt#jmzs0o");
        long m2158compositeOverOWjLjI = (i2 & 1) != 0 ? androidx.compose.ui.graphics.ColorKt.m2158compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1314getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1319getSurface0d7_KjU()) : j;
        long m2112copywmQWz5c$default = (i2 & 2) != 0 ? androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1314getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m2112copywmQWz5c$default2 = (i2 & 4) != 0 ? androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(m2112copywmQWz5c$default, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        androidx.compose.material.DefaultChipColors defaultChipColors = new androidx.compose.material.DefaultChipColors(m2158compositeOverOWjLjI, m2112copywmQWz5c$default, m2112copywmQWz5c$default2, (i2 & 8) != 0 ? androidx.compose.ui.graphics.ColorKt.m2158compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1314getOnSurface0d7_KjU(), androidx.compose.material.ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1319getSurface0d7_KjU()) : j4, (i2 & 16) != 0 ? androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(m2112copywmQWz5c$default, androidx.compose.material.ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j5, (i2 & 32) != 0 ? androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(m2112copywmQWz5c$default2, androidx.compose.material.ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j6, null);
        composer.endReplaceableGroup();
        return defaultChipColors;
    }

    /* renamed from: outlinedChipColors-5tl4gsc, reason: not valid java name */
    public final androidx.compose.material.ChipColors m1301outlinedChipColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1763922662);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(outlinedChipColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,5:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color)420@18727L6,421@18787L6,425@19070L8,428@19218L8,429@19270L342:Chip.kt#jmzs0o");
        long m1319getSurface0d7_KjU = (i2 & 1) != 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1319getSurface0d7_KjU() : j;
        long m2112copywmQWz5c$default = (i2 & 2) != 0 ? androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1314getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m2112copywmQWz5c$default2 = (i2 & 4) != 0 ? androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(m2112copywmQWz5c$default, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        androidx.compose.material.ChipColors m1295chipColors5tl4gsc = m1295chipColors5tl4gsc(m1319getSurface0d7_KjU, m2112copywmQWz5c$default, m2112copywmQWz5c$default2, (i2 & 8) != 0 ? m1319getSurface0d7_KjU : j4, (i2 & 16) != 0 ? androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(m2112copywmQWz5c$default, androidx.compose.material.ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j5, (i2 & 32) != 0 ? androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(m2112copywmQWz5c$default2, androidx.compose.material.ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j6, composer, (i & 14) | (i & 112) | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (i & 3670016), 0);
        composer.endReplaceableGroup();
        return m1295chipColors5tl4gsc;
    }

    /* renamed from: filterChipColors-J08w3-E, reason: not valid java name */
    public final androidx.compose.material.SelectableChipColors m1296filterChipColorsJ08w3E(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(830140629);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(filterChipColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,5:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color,6:c#ui.graphics.Color,7:c#ui.graphics.Color,8:c#ui.graphics.Color)454@20609L6,455@20703L6,456@20764L6,459@20951L6,460@21011L8,461@21086L6,463@21193L8,466@21328L8,468@21424L6,471@21583L6,474@21744L6:Chip.kt#jmzs0o");
        long m2158compositeOverOWjLjI = (i2 & 1) != 0 ? androidx.compose.ui.graphics.ColorKt.m2158compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1314getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1319getSurface0d7_KjU()) : j;
        long m2112copywmQWz5c$default = (i2 & 2) != 0 ? androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1314getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m2112copywmQWz5c$default2 = (i2 & 4) != 0 ? androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(m2112copywmQWz5c$default, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        androidx.compose.material.DefaultSelectableChipColors defaultSelectableChipColors = new androidx.compose.material.DefaultSelectableChipColors(m2158compositeOverOWjLjI, m2112copywmQWz5c$default, m2112copywmQWz5c$default2, (i2 & 8) != 0 ? androidx.compose.ui.graphics.ColorKt.m2158compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1314getOnSurface0d7_KjU(), androidx.compose.material.ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1319getSurface0d7_KjU()) : j4, (i2 & 16) != 0 ? androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(m2112copywmQWz5c$default, androidx.compose.material.ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j5, (i2 & 32) != 0 ? androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(m2112copywmQWz5c$default2, androidx.compose.material.ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j6, (i2 & 64) != 0 ? androidx.compose.ui.graphics.ColorKt.m2158compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1314getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), m2158compositeOverOWjLjI) : j7, (i2 & 128) != 0 ? androidx.compose.ui.graphics.ColorKt.m2158compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1314getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), m2112copywmQWz5c$default) : j8, (i2 & 256) != 0 ? androidx.compose.ui.graphics.ColorKt.m2158compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1314getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), m2112copywmQWz5c$default2) : j9, null);
        composer.endReplaceableGroup();
        return defaultSelectableChipColors;
    }

    /* renamed from: outlinedFilterChipColors-J08w3-E, reason: not valid java name */
    public final androidx.compose.material.SelectableChipColors m1302outlinedFilterChipColorsJ08w3E(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(346878099);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(outlinedFilterChipColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,5:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color,6:c#ui.graphics.Color,7:c#ui.graphics.Color,8:c#ui.graphics.Color)505@23394L6,506@23454L6,510@23714L8,513@23849L8,515@23945L6,518@24105L6,521@24266L6:Chip.kt#jmzs0o");
        long m1319getSurface0d7_KjU = (i2 & 1) != 0 ? androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1319getSurface0d7_KjU() : j;
        long m2112copywmQWz5c$default = (i2 & 2) != 0 ? androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1314getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m2112copywmQWz5c$default2 = (i2 & 4) != 0 ? androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(m2112copywmQWz5c$default, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        androidx.compose.material.DefaultSelectableChipColors defaultSelectableChipColors = new androidx.compose.material.DefaultSelectableChipColors(m1319getSurface0d7_KjU, m2112copywmQWz5c$default, m2112copywmQWz5c$default2, (i2 & 8) != 0 ? m1319getSurface0d7_KjU : j4, (i2 & 16) != 0 ? androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(m2112copywmQWz5c$default, androidx.compose.material.ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j5, (i2 & 32) != 0 ? androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(m2112copywmQWz5c$default2, androidx.compose.material.ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j6, (i2 & 64) != 0 ? androidx.compose.ui.graphics.ColorKt.m2158compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1314getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), m1319getSurface0d7_KjU) : j7, (i2 & 128) != 0 ? androidx.compose.ui.graphics.ColorKt.m2158compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1314getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), m2112copywmQWz5c$default) : j8, (i2 & 256) != 0 ? androidx.compose.ui.graphics.ColorKt.m2158compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1314getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), m2112copywmQWz5c$default2) : j9, null);
        composer.endReplaceableGroup();
        return defaultSelectableChipColors;
    }

    public final androidx.compose.foundation.BorderStroke getOutlinedBorder(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-1650225597);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C542@25113L6:Chip.kt#jmzs0o");
        androidx.compose.foundation.BorderStroke m239BorderStrokecXLIe8U = androidx.compose.foundation.BorderStrokeKt.m239BorderStrokecXLIe8U(OutlinedBorderSize, androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6).m1314getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        composer.endReplaceableGroup();
        return m239BorderStrokecXLIe8U;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m1299getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    /* renamed from: getLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1297getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
    }

    /* renamed from: getSelectedIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1300getSelectedIconSizeD9Ej5fM() {
        return SelectedIconSize;
    }
}
