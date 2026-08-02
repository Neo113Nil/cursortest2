package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zznu {
    public static int zza(int i, int i2, int i3) {
        return zzb(i, i2, i3) ? i3 : i2;
    }

    public static boolean zzb(int i, int i2, int i3) {
        double zze = zze(i);
        double zzd = zzd(zze(i2), zze);
        return zzd <= 3.0d && zzd <= zzd(zze(i3), zze);
    }

    public static void zzc(android.widget.ImageView imageView, int i) {
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        int rgb = android.graphics.Color.rgb(android.graphics.Color.red(i), android.graphics.Color.green(i), android.graphics.Color.blue(i));
        android.graphics.drawable.Drawable mutate = drawable.mutate();
        mutate.setColorFilter(rgb, android.graphics.PorterDuff.Mode.SRC_ATOP);
        mutate.setAlpha(android.graphics.Color.alpha(i));
    }

    private static double zzd(double d, double d2) {
        return java.lang.Math.round(((java.lang.Math.max(d, d2) + 0.05d) / (java.lang.Math.min(d, d2) + 0.05d)) * 100.0d) / 100.0d;
    }

    private static double zze(int i) {
        return (zzf(android.graphics.Color.red(i) / 255.0d) * 0.2126d) + (zzf(android.graphics.Color.green(i) / 255.0d) * 0.7152d) + (zzf(android.graphics.Color.blue(i) / 255.0d) * 0.0722d);
    }

    private static double zzf(double d) {
        return d <= 0.03928d ? d / 12.92d : java.lang.Math.pow((d + 0.055d) / 1.055d, 2.4d);
    }
}
