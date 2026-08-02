package com.google.android.libraries.places.widget.internal.autocomplete.ui;

/* loaded from: classes8.dex */
public final class zzq extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final android.widget.TextView zza;
    private final android.widget.TextView zzb;
    private final android.widget.ImageView zzc;
    private final android.widget.FrameLayout zzd;
    private final com.google.android.libraries.places.internal.zznq zze;
    private com.google.android.libraries.places.api.model.AutocompletePrediction zzf;
    private boolean zzg;
    private final android.text.style.ForegroundColorSpan zzh;
    private final android.text.style.ForegroundColorSpan zzi;

    public zzq(final com.google.android.libraries.places.widget.internal.autocomplete.ui.zzp zzpVar, android.view.View view, com.google.android.libraries.places.internal.zznq zznqVar) {
        super(view);
        this.zzh = new android.text.style.ForegroundColorSpan(com.google.android.material.color.MaterialColors.getColor(view, com.google.android.libraries.places.R.attr.placesColorOnSurfaceVariant));
        this.zzi = new android.text.style.ForegroundColorSpan(com.google.android.material.color.MaterialColors.getColor(view, com.google.android.libraries.places.R.attr.placesColorOnSurface));
        this.zza = (android.widget.TextView) view.findViewById(com.google.android.libraries.places.R.id.autocomplete_prediction_primary_text);
        this.zzb = (android.widget.TextView) view.findViewById(com.google.android.libraries.places.R.id.autocomplete_prediction_secondary_text);
        this.zzc = (android.widget.ImageView) view.findViewById(com.google.android.libraries.places.R.id.list_item_icon);
        this.zzd = (android.widget.FrameLayout) view.findViewById(com.google.android.libraries.places.R.id.list_item_icon_container);
        this.zze = zznqVar;
        this.itemView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzo
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(android.view.View view2) {
                com.google.android.libraries.places.widget.internal.autocomplete.ui.zzq.this.zzc(zzpVar, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzc(com.google.android.libraries.places.widget.internal.autocomplete.ui.zzp zzpVar, android.view.View view) {
        com.google.android.libraries.places.api.model.AutocompletePrediction autocompletePrediction = this.zzf;
        if (autocompletePrediction == null) {
            return;
        }
        try {
            zzpVar.zza(autocompletePrediction, getAdapterPosition());
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    public final void zza(com.google.android.libraries.places.api.model.AutocompletePrediction autocompletePrediction, boolean z) {
        java.lang.String concat;
        this.zzf = autocompletePrediction;
        this.zzg = z;
        com.google.android.libraries.places.widget.model.AutocompleteUiCustomization zzo = this.zze.zzo();
        if (zzo != null) {
            com.google.android.libraries.places.widget.model.AutocompleteUiIcon zzc = zzo.getZzc();
            if (zzc != null) {
                int zza = zzc.getZza();
                if (zza != 0) {
                    this.zzd.setVisibility(0);
                    this.zzc.setImageResource(zza);
                } else {
                    this.zzd.setVisibility(8);
                }
            }
            com.google.android.libraries.places.widget.model.AutocompleteListDensity zza2 = zzo.getZza();
            if (zza2 != null && zza2.ordinal() == 1) {
                this.zza.setSingleLine(false);
                this.zzb.setSingleLine(false);
            }
        }
        this.zza.setText(autocompletePrediction.getPrimaryText(this.zzh));
        android.text.SpannableString secondaryText = autocompletePrediction.getSecondaryText(null);
        if (this.zzf.getDistanceMeters() == null) {
            concat = "";
        } else {
            double intValue = r10.intValue() * 6.21371E-4d;
            if (intValue % 1.0d == 0.0d) {
                int i = (int) intValue;
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 3);
                sb.append(i);
                sb.append(" mi");
                concat = sb.toString();
            } else {
                concat = java.lang.String.valueOf(new java.text.DecimalFormat("#.#").format(intValue)).concat(" mi");
            }
        }
        android.widget.TextView textView = this.zzb;
        textView.setVisibility(0);
        if (secondaryText.length() == 0 || concat.length() == 0) {
            if (concat.length() != 0) {
                textView.setText(concat);
                return;
            } else if (secondaryText.length() != 0) {
                textView.setText(secondaryText);
                return;
            } else {
                textView.setVisibility(8);
                return;
            }
        }
        java.lang.String valueOf = java.lang.String.valueOf(secondaryText);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(concat.length() + 5 + java.lang.String.valueOf(valueOf).length());
        sb2.append(concat);
        sb2.append("  ·  ");
        sb2.append(valueOf);
        android.text.SpannableString spannableString = new android.text.SpannableString(sb2.toString());
        int length = concat.length();
        spannableString.setSpan(this.zzi, length + 2, length + 3, 33);
        textView.setText(spannableString);
    }

    public final boolean zzb() {
        return this.zzg;
    }
}
