package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzci extends androidx.recyclerview.widget.RecyclerView.Adapter {
    public static final /* synthetic */ int zza = 0;
    private static final kotlin.Lazy zzf = kotlin.LazyKt.lazy(com.google.android.libraries.places.widget.internal.placedetails.zzcd.zza);
    private final java.util.List zzb;
    private final kotlinx.coroutines.CoroutineScope zzc;
    private final int zzd;
    private final kotlin.jvm.functions.Function0 zze;
    private final com.google.android.libraries.places.internal.zzpm zzg;

    public zzci(java.util.List list, com.google.android.libraries.places.internal.zzpm zzpmVar, kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.zzb = list;
        this.zzg = zzpmVar;
        this.zzc = coroutineScope;
        this.zzd = i;
        this.zze = function0;
    }

    static /* synthetic */ void zzb(com.google.android.libraries.places.widget.internal.placedetails.zzcf zzcfVar, com.google.android.libraries.places.widget.internal.placedetails.zzci zzciVar, com.google.android.libraries.places.api.model.Review review, android.view.View view) {
        zzcfVar.zzi().setVisibility(8);
        zzcfVar.zzj().setVisibility(8);
        zzcfVar.zzk().setVisibility(0);
        android.widget.TextView zzf2 = zzcfVar.zzf();
        java.lang.String originalText = review.getOriginalText();
        if (originalText == null) {
            originalText = "";
        }
        zzi(zzf2, originalText);
        zzciVar.zze.invoke();
    }

    static /* synthetic */ void zzc(com.google.android.libraries.places.widget.internal.placedetails.zzcf zzcfVar, com.google.android.libraries.places.widget.internal.placedetails.zzci zzciVar, com.google.android.libraries.places.api.model.Review review, android.view.View view) {
        zzcfVar.zzi().setVisibility(0);
        zzcfVar.zzj().setVisibility(0);
        zzcfVar.zzk().setVisibility(8);
        android.widget.TextView zzf2 = zzcfVar.zzf();
        java.lang.String text = review.getText();
        if (text == null) {
            text = "";
        }
        zzi(zzf2, text);
        zzciVar.zze.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzg(android.content.Context context, com.google.android.libraries.places.widget.internal.placedetails.zzci zzciVar, com.google.android.libraries.places.api.model.Review review, android.view.MenuItem menuItem) {
        if (menuItem.getItemId() != com.google.android.libraries.places.R.id.report_review_menu_option) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setData(review.getFlagContentUri());
        try {
            context.startActivity(intent);
            return true;
        } catch (android.content.ActivityNotFoundException unused) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(context);
            new com.google.android.libraries.places.internal.zzpl(context, zzciVar.zzd).show();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzh(android.content.Context context, com.google.android.libraries.places.widget.internal.placedetails.zzci zzciVar, com.google.android.libraries.places.api.model.Review review, android.view.View view) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        java.lang.String uri = review.getAuthorAttribution().getUri();
        intent.setData(uri != null ? android.net.Uri.parse(uri) : null);
        try {
            context.startActivity(intent);
        } catch (android.content.ActivityNotFoundException unused) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(context);
            new com.google.android.libraries.places.internal.zzpl(context, zzciVar.zzd).show();
        }
    }

    private static final void zzi(android.view.View view, java.lang.CharSequence charSequence) {
        if (charSequence == null || kotlin.text.StringsKt.isBlank(charSequence)) {
            view.setVisibility(8);
            return;
        }
        if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setText(charSequence);
        }
        view.setVisibility(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.zzb.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.google.android.libraries.places.R.layout.place_details_reviews_item, viewGroup, false);
        kotlin.jvm.internal.Intrinsics.checkNotNull(inflate);
        return new com.google.android.libraries.places.widget.internal.placedetails.zzcf(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(final com.google.android.libraries.places.widget.internal.placedetails.zzcf zzcfVar, int i) {
        java.lang.String str;
        java.lang.String textLanguageCode;
        java.lang.String originalTextLanguageCode;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcfVar, "");
        final com.google.android.libraries.places.api.model.Review review = (com.google.android.libraries.places.api.model.Review) this.zzb.get(i);
        final android.content.Context context = zzcfVar.itemView.getContext();
        java.lang.String photoUri = review.getAuthorAttribution().getPhotoUri();
        android.graphics.drawable.Drawable drawable = context.getDrawable(com.google.android.libraries.places.R.drawable.review_author_image_placeholder);
        zzcfVar.zzb().setImageDrawable(drawable);
        if (photoUri != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.zzc, null, null, new com.google.android.libraries.places.widget.internal.placedetails.zzch(this, photoUri, zzcfVar, drawable, null), 3, null);
        }
        zzi(zzcfVar.zzc(), review.getAuthorAttribution().getName());
        zzi(zzcfVar.zzd(), review.getRelativePublishTimeDescription());
        com.google.android.libraries.places.widget.internal.placedetails.RatingStarsView zze = zzcfVar.zze();
        java.lang.Double rating = review.getRating();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rating, "");
        zze.zza(rating.doubleValue());
        android.widget.TextView zzf2 = zzcfVar.zzf();
        java.lang.String text = review.getText();
        if (text == null) {
            text = "";
        }
        zzi(zzf2, text);
        if (kotlin.jvm.internal.Intrinsics.areEqual(review.getTextLanguageCode(), review.getOriginalTextLanguageCode()) || (textLanguageCode = review.getTextLanguageCode()) == null || kotlin.text.StringsKt.isBlank(textLanguageCode) || (originalTextLanguageCode = review.getOriginalTextLanguageCode()) == null || kotlin.text.StringsKt.isBlank(originalTextLanguageCode)) {
            zzcfVar.zzl().setVisibility(8);
            zzcfVar.zzi().setVisibility(8);
            zzcfVar.zzj().setVisibility(8);
            zzcfVar.zzk().setVisibility(8);
        } else {
            java.lang.String originalTextLanguageCode2 = review.getOriginalTextLanguageCode();
            kotlin.jvm.internal.Intrinsics.checkNotNull(originalTextLanguageCode2, "");
            java.lang.String displayName = java.util.Locale.forLanguageTag(originalTextLanguageCode2).getDisplayName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(displayName, "");
            java.lang.String string = context.getString(com.google.android.libraries.places.R.string.place_details_see_original, displayName);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            zzi(zzcfVar.zzj(), string);
            zzcfVar.zzj().setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzce
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(android.view.View view) {
                    com.google.android.libraries.places.widget.internal.placedetails.zzci.zzb(com.google.android.libraries.places.widget.internal.placedetails.zzcf.this, this, review, view);
                }
            });
            zzcfVar.zzk().setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzbz
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(android.view.View view) {
                    com.google.android.libraries.places.widget.internal.placedetails.zzci.zzc(com.google.android.libraries.places.widget.internal.placedetails.zzcf.this, this, review, view);
                }
            });
            zzcfVar.zzl().setVisibility(0);
            zzcfVar.zzi().setVisibility(0);
            zzcfVar.zzk().setVisibility(8);
        }
        com.google.android.libraries.places.api.model.LocalDate visitDate = review.getVisitDate();
        if (visitDate != null) {
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(calendar, "");
            calendar.clear();
            calendar.set(visitDate.getYear(), visitDate.getMonth() - 1, visitDate.getDay());
            str = context.getString(com.google.android.libraries.places.R.string.place_details_visited_text, ((java.text.SimpleDateFormat) zzf.getValue()).format(calendar.getTime()));
        } else {
            str = null;
        }
        zzi(zzcfVar.zzg(), str);
        zzcfVar.zzh().setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzca
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(android.view.View view) {
                final android.content.Context context2 = context;
                android.widget.PopupMenu popupMenu = new android.widget.PopupMenu(context2, view);
                popupMenu.inflate(com.google.android.libraries.places.R.menu.review_more_menu);
                final com.google.android.libraries.places.widget.internal.placedetails.zzci zzciVar = this;
                final com.google.android.libraries.places.api.model.Review review2 = review;
                popupMenu.setOnMenuItemClickListener(new android.widget.PopupMenu.OnMenuItemClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzcc
                    @Override // android.widget.PopupMenu.OnMenuItemClickListener
                    public final /* synthetic */ boolean onMenuItemClick(android.view.MenuItem menuItem) {
                        boolean zzg;
                        zzg = com.google.android.libraries.places.widget.internal.placedetails.zzci.zzg(context2, zzciVar, review2, menuItem);
                        return zzg;
                    }
                });
                popupMenu.show();
            }
        });
        zzcfVar.zza().setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzcb
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(android.view.View view) {
                com.google.android.libraries.places.widget.internal.placedetails.zzci.zzh(context, this, review, view);
            }
        });
        androidx.constraintlayout.widget.ConstraintLayout zza2 = zzcfVar.zza();
        android.view.View view = zzcfVar.itemView;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        com.google.android.libraries.places.internal.zzop.zza(zza2, view, context, 48, 48);
        zzcfVar.zza().setContentDescription(context.getString(com.google.android.libraries.places.R.string.place_details_view_review_author_content_description, review.getAuthorAttribution().getName()));
        com.google.android.libraries.places.internal.zzop.zzb(zzcfVar.zza());
    }
}
