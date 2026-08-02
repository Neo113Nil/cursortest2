package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzs extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final android.widget.TextView zza;
    private final android.widget.TextView zzb;
    private final androidx.cardview.widget.CardView zzc;
    private final android.widget.TextView zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(android.view.View view) {
        super(view);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        android.view.View findViewById = view.findViewById(com.google.android.libraries.places.R.id.connector_name);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.zza = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.google.android.libraries.places.R.id.max_charge_rate);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.zzb = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.google.android.libraries.places.R.id.chargers_available_card);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.zzc = (androidx.cardview.widget.CardView) findViewById3;
        android.view.View findViewById4 = view.findViewById(com.google.android.libraries.places.R.id.chargers_available);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.zzd = (android.widget.TextView) findViewById4;
    }

    public final android.widget.TextView zzd() {
        return this.zzd;
    }

    public final androidx.cardview.widget.CardView zzc() {
        return this.zzc;
    }

    public final android.widget.TextView zzb() {
        return this.zzb;
    }

    public final android.widget.TextView zza() {
        return this.zza;
    }
}
