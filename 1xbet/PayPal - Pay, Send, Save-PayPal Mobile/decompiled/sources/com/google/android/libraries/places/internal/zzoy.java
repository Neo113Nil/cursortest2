package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzoy {
    public static final /* synthetic */ int zza = 0;
    private static final int zzb = com.google.android.libraries.places.R.style.PlacesMaterialTheme;
    private static final int[] zzc = {com.google.android.libraries.places.R.attr.placesColorSurface, com.google.android.libraries.places.R.attr.placesColorOutlineDecorative, com.google.android.libraries.places.R.attr.placesColorPrimary, com.google.android.libraries.places.R.attr.placesColorOnSurface, com.google.android.libraries.places.R.attr.placesColorOnSurfaceVariant, com.google.android.libraries.places.R.attr.placesColorSecondaryContainer, com.google.android.libraries.places.R.attr.placesColorOnSecondaryContainer, com.google.android.libraries.places.R.attr.placesColorNeutralContainer, com.google.android.libraries.places.R.attr.placesColorOnNeutralContainer, com.google.android.libraries.places.R.attr.placesColorOnNeutralContainerVariant, com.google.android.libraries.places.R.attr.placesColorPositiveContainer, com.google.android.libraries.places.R.attr.placesColorOnPositiveContainer, com.google.android.libraries.places.R.attr.placesColorPositive, com.google.android.libraries.places.R.attr.placesColorNegative, com.google.android.libraries.places.R.attr.placesColorInfo, com.google.android.libraries.places.R.attr.placesColorButtonBorder, com.google.android.libraries.places.R.attr.placesColorStarRating, com.google.android.libraries.places.R.attr.placesColorDisabledSurface};
    private static final int[] zzd = {com.google.android.libraries.places.R.attr.placesTextAppearanceBodySmall, com.google.android.libraries.places.R.attr.placesTextAppearanceBodyMedium, com.google.android.libraries.places.R.attr.placesTextAppearanceLabelMedium, com.google.android.libraries.places.R.attr.placesTextAppearanceLabelLarge, com.google.android.libraries.places.R.attr.placesTextAppearanceHeadlineMedium, com.google.android.libraries.places.R.attr.placesTextAppearanceDisplaySmall, com.google.android.libraries.places.R.attr.placesTextAppearanceTitleSmall, com.google.android.libraries.places.R.attr.placesTextAppearanceTitleMedium, com.google.android.libraries.places.R.attr.placesTextAppearanceTitleLarge};
    private static final int[] zze = {com.google.android.libraries.places.R.attr.placesSpacingExtraSmall, com.google.android.libraries.places.R.attr.placesSpacingSmall, com.google.android.libraries.places.R.attr.placesSpacingMedium, com.google.android.libraries.places.R.attr.placesSpacingLarge, com.google.android.libraries.places.R.attr.placesSpacingExtraLarge, com.google.android.libraries.places.R.attr.placesSpacingTwoExtraLarge};
    private static final int[] zzf = {com.google.android.libraries.places.R.attr.placesBorderWidth, com.google.android.libraries.places.R.attr.placesBorderWidthButton};
    private static final int[] zzg = {com.google.android.libraries.places.R.attr.placesCornerRadius, com.google.android.libraries.places.R.attr.placesCornerRadiusButton, com.google.android.libraries.places.R.attr.placesCornerRadiusThumbnail, com.google.android.libraries.places.R.attr.placesCornerRadiusCollageOuter, com.google.android.libraries.places.R.attr.placesCornerRadiusCard, com.google.android.libraries.places.R.attr.placesCornerRadiusDialog};
    private static final int[] zzh = {com.google.android.libraries.places.R.attr.placesColorAttributionLightTheme, com.google.android.libraries.places.R.attr.placesColorAttributionDarkTheme};

    public static final boolean zza(android.content.Context context, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return zzg(context, i, zzh);
    }

    public static final boolean zzb(android.content.Context context, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return zzg(context, i, zzc);
    }

    public static final boolean zzc(android.content.Context context, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return zzg(context, i, zzf);
    }

    public static final boolean zzd(android.content.Context context, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return zzg(context, i, zzg);
    }

    public static final boolean zze(android.content.Context context, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return zzg(context, i, zze);
    }

    public static final boolean zzf(android.content.Context context, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return zzg(context, i, zzd);
    }

    private static final boolean zzg(android.content.Context context, int i, int[] iArr) {
        int i2 = zzb;
        if (i == i2) {
            return false;
        }
        android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(context, i2);
        android.view.ContextThemeWrapper contextThemeWrapper2 = new android.view.ContextThemeWrapper(context, i);
        android.util.TypedValue typedValue = new android.util.TypedValue();
        android.util.TypedValue typedValue2 = new android.util.TypedValue();
        for (int i3 : iArr) {
            contextThemeWrapper.getTheme().resolveAttribute(i3, typedValue, true);
            if (!contextThemeWrapper2.getTheme().resolveAttribute(i3, typedValue2, true)) {
                return false;
            }
            if (typedValue.data != typedValue2.data) {
                return true;
            }
        }
        return false;
    }
}
