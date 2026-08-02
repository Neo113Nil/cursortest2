package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzad {
    private final android.view.View zza;
    private final android.content.Context zzb;
    private final int zzc;
    private final com.google.android.libraries.places.internal.zzef zzd;
    private final com.google.android.libraries.places.widget.internal.placedetails.zzab zze;
    private final android.widget.TextView zzf;
    private final android.view.View zzg;
    private final android.widget.LinearLayout zzh;
    private final android.widget.TextView zzi;
    private final android.widget.TextView zzj;
    private final android.widget.TextView zzk;
    private final android.widget.ImageView zzl;
    private final android.widget.TextView zzm;
    private final android.widget.TextView zzn;
    private final android.widget.TextView zzo;
    private final android.widget.TextView zzp;
    private final android.widget.TextView zzq;
    private final android.widget.TextView zzr;
    private final android.view.View zzs;

    public zzad(android.view.View view, android.content.Context context, int i, com.google.android.libraries.places.internal.zzef zzefVar, com.google.android.libraries.places.widget.internal.placedetails.zzab zzabVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzabVar, "");
        this.zza = view;
        this.zzb = context;
        this.zzc = i;
        this.zzd = zzefVar;
        this.zze = zzabVar;
        android.view.View findViewById = view.findViewById(com.google.android.libraries.places.R.id.place_rating);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.zzf = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.google.android.libraries.places.R.id.rating_stars);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.zzg = findViewById2;
        android.view.View findViewById3 = view.findViewById(com.google.android.libraries.places.R.id.place_rating_container);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.zzh = (android.widget.LinearLayout) findViewById3;
        android.view.View findViewById4 = view.findViewById(com.google.android.libraries.places.R.id.place_rating_count);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.zzi = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = view.findViewById(com.google.android.libraries.places.R.id.place_type);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.zzj = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = view.findViewById(com.google.android.libraries.places.R.id.place_price);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.zzk = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = view.findViewById(com.google.android.libraries.places.R.id.wheelchair_accessibility_icon);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById7, "");
        this.zzl = (android.widget.ImageView) findViewById7;
        android.view.View findViewById8 = view.findViewById(com.google.android.libraries.places.R.id.place_wheelchair_icon_label);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById8, "");
        this.zzm = (android.widget.TextView) findViewById8;
        android.view.View findViewById9 = view.findViewById(com.google.android.libraries.places.R.id.place_type_price_spacer);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById9, "");
        this.zzn = (android.widget.TextView) findViewById9;
        android.view.View findViewById10 = view.findViewById(com.google.android.libraries.places.R.id.place_price_a11y_spacer);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById10, "");
        this.zzo = (android.widget.TextView) findViewById10;
        android.view.View findViewById11 = view.findViewById(com.google.android.libraries.places.R.id.place_open_status);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById11, "");
        this.zzp = (android.widget.TextView) findViewById11;
        android.view.View findViewById12 = view.findViewById(com.google.android.libraries.places.R.id.place_open_status_and_time_spacer);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById12, "");
        this.zzq = (android.widget.TextView) findViewById12;
        android.view.View findViewById13 = view.findViewById(com.google.android.libraries.places.R.id.place_next_open_or_close_time);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById13, "");
        this.zzr = (android.widget.TextView) findViewById13;
        android.view.View findViewById14 = view.findViewById(com.google.android.libraries.places.R.id.open_in_maps);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById14, "");
        this.zzs = findViewById14;
    }

    static /* synthetic */ void zzg(com.google.android.libraries.places.widget.internal.placedetails.zzad zzadVar, com.google.android.libraries.places.api.model.Place place, com.google.android.libraries.places.widget.internal.placedetails.zzo zzoVar, android.view.View view) {
        zzadVar.zzh(zzi(place));
        if (zzoVar != null) {
            zzoVar.zze(zzadVar.zzb);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh(android.content.Intent intent) {
        try {
            this.zzb.startActivity(intent);
        } catch (android.content.ActivityNotFoundException unused) {
            new com.google.android.libraries.places.internal.zzpl(this.zzb, this.zzc).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.content.Intent zzi(com.google.android.libraries.places.api.model.Place place) {
        android.net.Uri googleMapsUri = place.getGoogleMapsUri();
        if (googleMapsUri == null) {
            java.lang.String formattedAddress = place.getFormattedAddress();
            java.lang.String id = place.getId();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(formattedAddress).length() + 64 + java.lang.String.valueOf(id).length());
            sb.append("https://www.google.com/maps/search/?api=1&query=");
            sb.append(formattedAddress);
            sb.append("&query_place_id=");
            sb.append(id);
            googleMapsUri = android.net.Uri.parse(sb.toString());
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setData(googleMapsUri);
        return intent;
    }

    private static final void zzj(android.view.View view, java.lang.CharSequence charSequence, boolean z) {
        if (!z || charSequence == null || kotlin.text.StringsKt.isBlank(charSequence)) {
            view.setVisibility(8);
            return;
        }
        if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setText(charSequence);
        }
        view.setVisibility(0);
    }

    public final void zza(com.google.android.libraries.places.api.model.Place place, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, com.google.android.libraries.places.widget.internal.placedetails.zzo zzoVar) {
        java.lang.Integer userRatingCount;
        java.lang.String str;
        java.lang.String currencyCode;
        java.lang.String str2;
        com.google.android.libraries.places.widget.internal.placedetails.zzab zzabVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        if (place.getConsumerAlert() == null || !((zzabVar = this.zze) == com.google.android.libraries.places.widget.internal.placedetails.zzab.zza || zzabVar == com.google.android.libraries.places.widget.internal.placedetails.zzab.zzc)) {
            java.lang.Double rating = place.getRating();
            if (rating == null || place.getUserRatingCount() == null || ((userRatingCount = place.getUserRatingCount()) != null && userRatingCount.intValue() == 0)) {
                android.widget.TextView textView = this.zzf;
                android.content.Context context = this.zzb;
                zzj(textView, context.getString(com.google.android.libraries.places.R.string.place_details_no_reviews), z);
                this.zzg.setVisibility(8);
                this.zzi.setVisibility(8);
                this.zzh.setContentDescription(context.getResources().getString(com.google.android.libraries.places.R.string.place_details_no_reviews));
            } else {
                android.widget.TextView textView2 = this.zzf;
                zzj(textView2, rating.toString(), z);
                android.view.View view = this.zzg;
                if (view instanceof com.google.android.libraries.places.widget.internal.placedetails.RatingStarsView) {
                    com.google.android.libraries.places.widget.internal.placedetails.RatingStarsView ratingStarsView = (com.google.android.libraries.places.widget.internal.placedetails.RatingStarsView) view;
                    ratingStarsView.getLayoutParams().height = textView2.getLineHeight();
                    ratingStarsView.zza(rating.doubleValue());
                } else {
                    view.getLayoutParams().height = textView2.getLineHeight();
                    view.getLayoutParams().width = textView2.getLineHeight();
                }
                zzj(view, rating.toString(), z);
                int doubleValue = kotlin.jvm.internal.Intrinsics.areEqual(rating, 1.0d) ? (int) rating.doubleValue() : 5;
                android.widget.LinearLayout linearLayout = this.zzh;
                android.content.Context context2 = this.zzb;
                linearLayout.setContentDescription(context2.getResources().getQuantityString(com.google.android.libraries.places.R.plurals.place_details_ratings_content_description, doubleValue, rating.toString()));
                java.lang.Integer userRatingCount2 = place.getUserRatingCount();
                if (userRatingCount2 != null) {
                    str = context2.getString(com.google.android.libraries.places.R.string.place_details_review_count, java.text.NumberFormat.getNumberInstance(java.util.Locale.getDefault()).format(java.lang.Integer.valueOf(userRatingCount2.intValue())));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                } else {
                    str = null;
                }
                android.text.SpannableString spannableString = new android.text.SpannableString(str);
                spannableString.setSpan(new com.google.android.libraries.places.widget.internal.placedetails.zzac(this, place, zzoVar), 1, spannableString.length() - 1, 33);
                android.widget.TextView textView3 = this.zzi;
                zzj(textView3, spannableString, z);
                textView3.setMovementMethod(new android.text.method.LinkMovementMethod());
                android.content.res.Resources resources = context2.getResources();
                int i = com.google.android.libraries.places.R.plurals.place_details_review_count_a11y_label;
                java.lang.Integer userRatingCount3 = place.getUserRatingCount();
                textView3.setContentDescription(resources.getQuantityString(i, userRatingCount3 != null ? userRatingCount3.intValue() : 0, place.getUserRatingCount()));
            }
        } else {
            this.zzf.setVisibility(8);
            this.zzg.setVisibility(8);
            this.zzi.setVisibility(8);
        }
        android.widget.TextView textView4 = this.zzj;
        zzj(textView4, place.getPrimaryTypeDisplayName(), z2);
        android.widget.TextView textView5 = this.zzk;
        android.content.Context context3 = this.zzb;
        android.widget.TextView textView6 = textView5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context3, "");
        com.google.android.libraries.places.api.model.zzgf zza = place.zza();
        com.google.android.libraries.places.api.model.Money zza2 = zza != null ? zza.zza() : null;
        com.google.android.libraries.places.api.model.zzgf zza3 = place.zza();
        com.google.android.libraries.places.api.model.Money zzb = zza3 != null ? zza3.zzb() : null;
        if (zza2 == null || (currencyCode = zza2.getCurrencyCode()) == null) {
            currencyCode = zzb != null ? zzb.getCurrencyCode() : null;
        }
        if (place.zza() == null || currencyCode == null || zza2 == null) {
            str2 = null;
        } else {
            java.util.Currency currency = java.util.Currency.getInstance(currencyCode);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currency, "");
            java.lang.String symbol = currency.getSymbol(java.util.Locale.getDefault());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(symbol, "");
            str2 = zzb != null ? context3.getString(com.google.android.libraries.places.R.string.place_details_price_range, symbol, zza2.getUnits(), zzb.getUnits()) : context3.getString(com.google.android.libraries.places.R.string.place_details_price_range_no_upper_bound, symbol, zza2.getUnits());
        }
        if (str2 == null) {
            java.lang.Integer priceLevel = place.getPriceLevel();
            str2 = (priceLevel == null || priceLevel.intValue() != 1) ? (priceLevel == null || priceLevel.intValue() != 2) ? (priceLevel == null || priceLevel.intValue() != 3) ? (priceLevel != null && priceLevel.intValue() == 4) ? context3.getString(com.google.android.libraries.places.R.string.place_details_price_level_4) : null : context3.getString(com.google.android.libraries.places.R.string.place_details_price_level_3) : context3.getString(com.google.android.libraries.places.R.string.place_details_price_level_2) : context3.getString(com.google.android.libraries.places.R.string.place_details_price_level_1);
        }
        zzj(textView6, str2, z3);
        com.google.android.libraries.places.api.model.AccessibilityOptions accessibilityOptions = place.getAccessibilityOptions();
        if ((accessibilityOptions != null ? accessibilityOptions.getWheelchairAccessibleEntrance() : null) == com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.TRUE && z4) {
            android.widget.ImageView imageView = this.zzl;
            imageView.setVisibility(0);
            android.widget.TextView textView7 = this.zzm;
            imageView.getLayoutParams().height = textView7.getLineHeight();
            imageView.getLayoutParams().width = textView7.getLineHeight();
            if (textView4.getVisibility() == 8 && textView6.getVisibility() == 8) {
                textView7.setVisibility(0);
            } else {
                textView7.setVisibility(8);
            }
        } else {
            this.zzl.setVisibility(8);
            this.zzm.setVisibility(8);
        }
        android.widget.TextView textView8 = this.zzp;
        android.widget.TextView textView9 = textView8;
        zzj(textView9, com.google.android.libraries.places.widget.internal.placedetails.zzag.zzc(place, context3), z5);
        textView8.setTextColor(com.google.android.libraries.places.widget.internal.placedetails.zzag.zza(place, context3, this.zzc));
        android.widget.TextView textView10 = this.zzr;
        com.google.android.libraries.places.internal.zzef zzefVar = this.zzd;
        android.widget.TextView textView11 = textView10;
        zzj(textView11, com.google.android.libraries.places.widget.internal.placedetails.zzag.zzb(place, zzefVar != null ? zzefVar.zza() : null, context3), z5);
        if (textView4.getVisibility() == 0 && (textView6.getVisibility() == 0 || this.zzl.getVisibility() == 0)) {
            this.zzn.setVisibility(0);
        } else {
            this.zzn.setVisibility(8);
        }
        if (textView6.getVisibility() == 0 && this.zzl.getVisibility() == 0) {
            this.zzo.setVisibility(0);
        } else {
            this.zzo.setVisibility(8);
        }
        if (textView9.getVisibility() == 0 && textView11.getVisibility() == 0) {
            this.zzq.setVisibility(0);
        } else {
            this.zzq.setVisibility(8);
        }
    }

    public final void zzb(final com.google.android.libraries.places.api.model.Place place, final com.google.android.libraries.places.widget.internal.placedetails.zzo zzoVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(place, "");
        android.view.View view = this.zzs;
        view.setVisibility(0);
        view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzaa
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(android.view.View view2) {
                com.google.android.libraries.places.widget.internal.placedetails.zzad.zzg(com.google.android.libraries.places.widget.internal.placedetails.zzad.this, place, zzoVar, view2);
            }
        });
        com.google.android.libraries.places.internal.zzop.zza(view, this.zza, this.zzb, 48, 48);
    }

    public final void zzc() {
        this.zzf.setVisibility(8);
        this.zzg.setVisibility(8);
        this.zzi.setVisibility(8);
        this.zzj.setVisibility(8);
        this.zzk.setVisibility(8);
        this.zzl.setVisibility(8);
        this.zzm.setVisibility(8);
        this.zzn.setVisibility(8);
        this.zzo.setVisibility(8);
        this.zzp.setVisibility(8);
        this.zzq.setVisibility(8);
        this.zzr.setVisibility(8);
        this.zzs.setVisibility(8);
    }
}
