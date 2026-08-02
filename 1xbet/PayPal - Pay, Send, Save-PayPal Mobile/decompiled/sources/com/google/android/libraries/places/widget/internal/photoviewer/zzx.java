package com.google.android.libraries.places.widget.internal.photoviewer;

/* loaded from: classes8.dex */
final class zzx {
    private final android.content.Context zza;
    private final int zzb;

    private final float zzc(int i, int i2) {
        int[] iArr = com.google.android.libraries.places.R.styleable.PlacesMaterialThemeAttrs;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iArr, "");
        android.content.res.TypedArray obtainStyledAttributes = this.zza.obtainStyledAttributes(this.zzb, iArr);
        float dimension = obtainStyledAttributes.getDimension(i, r1.getResources().getDimensionPixelSize(i2));
        obtainStyledAttributes.recycle();
        return dimension;
    }

    public final float zza() {
        return zzc(com.google.android.libraries.places.R.styleable.PlacesMaterialThemeAttrs_placesSpacingMedium, com.google.android.libraries.places.R.dimen.gmp_sys_measurement_spacing_medium);
    }

    public final float zzb() {
        return zzc(com.google.android.libraries.places.R.styleable.PlacesMaterialThemeAttrs_placesSpacingLarge, com.google.android.libraries.places.R.dimen.gmp_sys_measurement_spacing_large);
    }

    public zzx(android.content.Context context, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.zza = context;
        this.zzb = i;
    }
}
