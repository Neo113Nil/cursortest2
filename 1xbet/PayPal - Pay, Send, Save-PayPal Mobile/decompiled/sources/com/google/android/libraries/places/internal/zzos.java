package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzos {
    @kotlin.jvm.JvmStatic
    public static final int zza(android.content.Context context, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        int[] iArr = com.google.android.libraries.places.R.styleable.PlacesMaterialThemeAttrs;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iArr, "");
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, iArr);
        int i2 = obtainStyledAttributes.getInt((obtainStyledAttributes.getResources().getConfiguration().uiMode & 48) == 32 ? com.google.android.libraries.places.R.styleable.PlacesMaterialThemeAttrs_placesColorAttributionDarkTheme : com.google.android.libraries.places.R.styleable.PlacesMaterialThemeAttrs_placesColorAttributionLightTheme, -1);
        com.google.android.libraries.places.internal.zzot zzotVar = com.google.android.libraries.places.internal.zzot.zza;
        if (i2 != zzotVar.zza()) {
            zzotVar = com.google.android.libraries.places.internal.zzot.zzb;
            if (i2 != zzotVar.zza()) {
                com.google.android.libraries.places.internal.zzot zzotVar2 = com.google.android.libraries.places.internal.zzot.zzc;
                if (i2 == zzotVar2.zza()) {
                    zzotVar = zzotVar2;
                }
            }
        }
        obtainStyledAttributes.recycle();
        return context.getColor(zzotVar.zzb());
    }
}
