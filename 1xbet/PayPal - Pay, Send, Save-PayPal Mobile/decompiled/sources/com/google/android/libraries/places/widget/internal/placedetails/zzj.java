package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
final class zzj extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final android.widget.TextView zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzj(android.view.View view) {
        super(view);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        android.view.View findViewById = view.findViewById(com.google.android.libraries.places.R.id.feature_name);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.zza = (android.widget.TextView) findViewById;
    }

    public final android.widget.TextView zza() {
        return this.zza;
    }
}
