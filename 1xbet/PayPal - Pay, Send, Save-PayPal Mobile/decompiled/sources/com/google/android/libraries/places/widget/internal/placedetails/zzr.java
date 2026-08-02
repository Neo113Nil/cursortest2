package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzr {
    private final android.content.Context zza;
    private final int zzb;
    private final android.view.View zzc;
    private final android.widget.TextView zzd;
    private final android.widget.TextView zze;

    public zzr(android.content.Context context, int i, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        this.zza = context;
        this.zzb = i;
        android.view.View findViewById = view.findViewById(com.google.android.libraries.places.R.id.consumer_alert);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.zzc = findViewById;
        android.view.View findViewById2 = view.findViewById(com.google.android.libraries.places.R.id.consumer_alert_overview);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.zzd = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.google.android.libraries.places.R.id.consumer_alert_details);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.zze = (android.widget.TextView) findViewById3;
    }

    static /* synthetic */ void zzb(com.google.android.libraries.places.widget.internal.placedetails.zzr zzrVar) {
        android.widget.TextView textView = zzrVar.zze;
        android.graphics.drawable.Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative, "");
        android.graphics.drawable.Drawable drawable = compoundDrawablesRelative[2];
        if (drawable != null) {
            int lineHeight = textView.getLineHeight();
            drawable.setBounds(0, 0, lineHeight, lineHeight);
            textView.setCompoundDrawablesRelative(null, null, drawable, null);
        }
    }

    public final void zza(com.google.android.libraries.places.api.model.Place place) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        final com.google.android.libraries.places.api.model.ConsumerAlert consumerAlert = place.getConsumerAlert();
        if (consumerAlert == null) {
            this.zzc.setVisibility(8);
            return;
        }
        this.zzc.setVisibility(0);
        this.zzd.setText(consumerAlert.getOverview());
        android.widget.TextView textView = this.zze;
        textView.post(new java.lang.Runnable() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.libraries.places.widget.internal.placedetails.zzr.zzb(com.google.android.libraries.places.widget.internal.placedetails.zzr.this);
            }
        });
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzp
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(android.view.View view) {
                new com.google.android.libraries.places.internal.zzpb(r0.zza, com.google.android.libraries.places.widget.internal.placedetails.zzr.this.zzb, consumerAlert).show();
            }
        });
    }
}
