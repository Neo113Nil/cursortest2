package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzbc {
    public static final com.google.android.libraries.places.widget.internal.placedetails.zzbd zza(boolean z, java.util.List list, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        float f = context.getResources().getDisplayMetrics().density;
        int i = (int) (context.getResources().getConfiguration().screenWidthDp * f);
        int i2 = (int) (context.getResources().getConfiguration().screenHeightDp * f);
        return new com.google.android.libraries.places.widget.internal.placedetails.zzbd(z, list, java.lang.Math.min(i, i2), java.lang.Math.max(i, i2));
    }
}
