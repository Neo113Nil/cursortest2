package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzbr {
    public static final com.google.android.libraries.places.widget.internal.placedetails.zzbs zza(double d) {
        int i = (int) d;
        if (i <= 0 || i >= 5) {
            return i == 5 ? new com.google.android.libraries.places.widget.internal.placedetails.zzbs(5, false) : new com.google.android.libraries.places.widget.internal.placedetails.zzbs(0, false);
        }
        kotlin.ranges.OpenEndRange<java.lang.Double> rangeUntil = kotlin.ranges.RangesKt.rangeUntil(0.0d, 0.25d);
        java.lang.Double valueOf = java.lang.Double.valueOf(d - i);
        return rangeUntil.contains(valueOf) ? new com.google.android.libraries.places.widget.internal.placedetails.zzbs(i, false) : kotlin.ranges.RangesKt.rangeUntil(0.25d, 0.75d).contains(valueOf) ? new com.google.android.libraries.places.widget.internal.placedetails.zzbs(i, true) : new com.google.android.libraries.places.widget.internal.placedetails.zzbs(i + 1, false);
    }
}
