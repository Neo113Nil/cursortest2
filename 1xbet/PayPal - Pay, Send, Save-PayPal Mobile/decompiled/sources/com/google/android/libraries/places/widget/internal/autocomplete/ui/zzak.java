package com.google.android.libraries.places.widget.internal.autocomplete.ui;

/* loaded from: classes8.dex */
public final class zzak extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final android.widget.TextView zza;
    private final android.widget.TextView zzb;
    private com.google.android.libraries.places.api.model.AutocompletePrediction zzc;
    private boolean zzd;

    public zzak(final com.google.android.libraries.places.widget.internal.autocomplete.ui.zzai zzaiVar, android.view.View view) {
        super(view);
        this.zza = (android.widget.TextView) view.findViewById(com.google.android.libraries.places.R.id.places_autocomplete_prediction_primary_text);
        this.zzb = (android.widget.TextView) view.findViewById(com.google.android.libraries.places.R.id.places_autocomplete_prediction_secondary_text);
        this.itemView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzaj
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(android.view.View view2) {
                com.google.android.libraries.places.widget.internal.autocomplete.ui.zzak.this.zzc(zzaiVar, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzc(com.google.android.libraries.places.widget.internal.autocomplete.ui.zzai zzaiVar, android.view.View view) {
        com.google.android.libraries.places.api.model.AutocompletePrediction autocompletePrediction = this.zzc;
        if (autocompletePrediction == null) {
            return;
        }
        try {
            zzaiVar.zza(autocompletePrediction, getAdapterPosition());
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    public final void zza(com.google.android.libraries.places.api.model.AutocompletePrediction autocompletePrediction, boolean z) {
        this.zzc = autocompletePrediction;
        this.zzd = z;
        android.text.SpannableString primaryText = autocompletePrediction.getPrimaryText(new android.text.style.ForegroundColorSpan(androidx.core.content.ContextCompat.getColor(this.itemView.getContext(), com.google.android.libraries.places.R.color.places_autocomplete_prediction_primary_text_highlight)));
        android.widget.TextView textView = this.zza;
        textView.setText(primaryText);
        android.widget.TextView textView2 = this.zzb;
        android.text.SpannableString secondaryText = autocompletePrediction.getSecondaryText(null);
        textView2.setText(secondaryText);
        if (secondaryText.length() == 0) {
            textView2.setVisibility(8);
            textView.setGravity(16);
        } else {
            textView2.setVisibility(0);
            textView.setGravity(80);
        }
    }

    public final boolean zzb() {
        return this.zzd;
    }
}
