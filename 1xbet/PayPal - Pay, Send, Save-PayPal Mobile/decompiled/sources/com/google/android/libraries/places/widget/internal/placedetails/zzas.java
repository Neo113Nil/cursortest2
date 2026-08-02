package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzas {
    private final android.view.View zza;
    private final com.google.android.libraries.places.internal.zzpt zzb;
    private final kotlinx.coroutines.CoroutineScope zzc;
    private final int zzd;
    private final com.google.android.libraries.places.widget.model.Orientation zze;
    private final android.view.View zzf;
    private final android.widget.TextView zzg;

    public zzas(android.view.View view, com.google.android.libraries.places.internal.zzpt zzptVar, kotlinx.coroutines.CoroutineScope coroutineScope, int i, com.google.android.libraries.places.widget.model.Orientation orientation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientation, "");
        this.zza = view;
        this.zzb = zzptVar;
        this.zzc = coroutineScope;
        this.zzd = i;
        this.zze = orientation;
        this.zzf = view.findViewById(com.google.android.libraries.places.R.id.place_details_lightbox_hint_badge);
        this.zzg = (android.widget.TextView) view.findViewById(com.google.android.libraries.places.R.id.place_image_card_number_of_photos_text);
    }

    static /* synthetic */ void zzg(com.google.android.libraries.places.widget.internal.placedetails.zzas zzasVar, boolean z, boolean z2, com.google.android.libraries.places.widget.internal.placedetails.zzbq zzbqVar, int i, boolean z3) {
        android.view.View view = zzasVar.zza;
        view.findViewById(com.google.android.libraries.places.R.id.image_loading_failure).setVisibility(8);
        if (z && z2) {
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.google.android.libraries.places.R.id.place_image);
            android.view.View findViewById = view.findViewById(com.google.android.libraries.places.R.id.place_image_container);
            imageView.setVisibility(0);
            findViewById.setVisibility(0);
            if (zzbqVar instanceof com.google.android.libraries.places.widget.internal.placedetails.zzbm) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(zzasVar.zzc, null, null, new com.google.android.libraries.places.widget.internal.placedetails.zzar(zzasVar, z3, i, zzbqVar, imageView, null), 3, null);
                return;
            }
            if (zzbqVar instanceof com.google.android.libraries.places.widget.internal.placedetails.zzbn) {
                zzasVar.zzh(false, i);
                imageView.setImageDrawable(view.getContext().getResources().getDrawable(com.google.android.libraries.places.R.drawable.place_details_image_loading_background, new android.view.ContextThemeWrapper(view.getContext(), zzasVar.zzd).getTheme()));
            } else {
                if (zzbqVar instanceof com.google.android.libraries.places.widget.internal.placedetails.zzbo) {
                    return;
                }
                if (zzbqVar instanceof com.google.android.libraries.places.widget.internal.placedetails.zzbp) {
                    imageView.setImageDrawable(view.getContext().getResources().getDrawable(zzasVar.zze == com.google.android.libraries.places.widget.model.Orientation.HORIZONTAL ? com.google.android.libraries.places.R.drawable.place_details_placeholder_horizontal : com.google.android.libraries.places.R.drawable.place_details_placeholder_vertical, new android.view.ContextThemeWrapper(view.getContext(), zzasVar.zzd).getTheme()));
                } else {
                    if (!(zzbqVar instanceof com.google.android.libraries.places.widget.internal.placedetails.zzbl)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNull(imageView);
                    zzasVar.zzi(imageView);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh(boolean z, int i) {
        android.widget.TextView textView;
        boolean z2 = z && i > 0;
        android.view.View view = this.zzf;
        if (view != null) {
            view.setVisibility(true != z2 ? 8 : 0);
        }
        if (!z2 || (textView = this.zzg) == null) {
            return;
        }
        textView.setText(java.lang.String.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzi(android.widget.ImageView imageView) {
        android.view.View view = this.zza;
        imageView.setImageDrawable(view.getContext().getResources().getDrawable(com.google.android.libraries.places.R.drawable.place_details_image_loading_background, new android.view.ContextThemeWrapper(view.getContext(), this.zzd).getTheme()));
        view.findViewById(com.google.android.libraries.places.R.id.image_loading_failure).setVisibility(0);
    }

    private static final void zzj(android.widget.TextView textView, java.lang.CharSequence charSequence, boolean z) {
        if (!z || charSequence == null || kotlin.text.StringsKt.isBlank(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setText(charSequence);
            textView.setVisibility(0);
        }
    }

    public final void zza() {
        int lineHeight;
        com.google.android.libraries.places.widget.model.Orientation orientation = this.zze;
        if (orientation == com.google.android.libraries.places.widget.model.Orientation.HORIZONTAL) {
            lineHeight = ((android.widget.Button) this.zza.findViewById(com.google.android.libraries.places.R.id.open_in_maps_icon_measurement)).getLineHeight();
        } else {
            android.view.View findViewById = this.zza.findViewById(com.google.android.libraries.places.R.id.open_in_maps);
            kotlin.jvm.internal.Intrinsics.checkNotNull(findViewById, "");
            lineHeight = ((android.widget.Button) findViewById).getLineHeight();
        }
        android.view.View view = this.zza;
        android.graphics.drawable.Drawable drawable = view.getContext().getDrawable(com.google.android.libraries.places.R.drawable.open_in_new);
        if (drawable != null) {
            drawable.setBounds(0, 0, lineHeight, lineHeight);
        } else {
            drawable = null;
        }
        if (orientation != com.google.android.libraries.places.widget.model.Orientation.HORIZONTAL) {
            android.view.View findViewById2 = view.findViewById(com.google.android.libraries.places.R.id.open_in_maps);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
            ((android.widget.TextView) findViewById2).setCompoundDrawablesRelative(null, null, drawable, null);
        } else {
            android.widget.ImageButton imageButton = (android.widget.ImageButton) view.findViewById(com.google.android.libraries.places.R.id.open_in_maps);
            imageButton.setImageDrawable(drawable);
            imageButton.getLayoutParams().height = imageButton.getPaddingTop() + lineHeight + imageButton.getPaddingBottom();
            imageButton.getLayoutParams().width = lineHeight + imageButton.getPaddingStart() + imageButton.getPaddingEnd();
        }
    }

    public final void zzb(com.google.android.libraries.places.api.model.Place place, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        android.view.View view = this.zza;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.google.android.libraries.places.R.id.place_address);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.google.android.libraries.places.R.id.place_name);
        if (z) {
            textView.setMaxLines(1);
            textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
            textView2.setMaxLines(1);
            textView2.setEllipsize(android.text.TextUtils.TruncateAt.END);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(textView2);
        zzj(textView2, place.getDisplayName(), true);
        kotlin.jvm.internal.Intrinsics.checkNotNull(textView);
        zzj(textView, place.getFormattedAddress(), z2);
    }

    public final void zzc(final com.google.android.libraries.places.widget.internal.placedetails.zzbq zzbqVar, final boolean z, final boolean z2, final boolean z3, final int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzbqVar, "");
        this.zza.post(new java.lang.Runnable() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzap
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.libraries.places.widget.internal.placedetails.zzas.zzg(com.google.android.libraries.places.widget.internal.placedetails.zzas.this, z, z2, zzbqVar, i, z3);
            }
        });
    }
}
