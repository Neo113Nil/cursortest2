package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzx extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final android.widget.TextView zza;
    private final android.widget.TextView zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzx(android.view.View view) {
        super(view);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        android.view.View findViewById = view.findViewById(com.google.android.libraries.places.R.id.fuel_type);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.zza = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.google.android.libraries.places.R.id.fuel_price);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.zzb = (android.widget.TextView) findViewById2;
    }

    public final android.widget.TextView zzb() {
        return this.zzb;
    }

    public final android.widget.TextView zza() {
        return this.zza;
    }
}
