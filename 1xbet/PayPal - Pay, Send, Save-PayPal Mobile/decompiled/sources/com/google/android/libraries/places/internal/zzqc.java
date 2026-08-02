package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzqc extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    final /* synthetic */ com.google.android.libraries.places.internal.zzqd zza;
    private final android.view.View zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzqc(final com.google.android.libraries.places.internal.zzqd zzqdVar, android.view.View view) {
        super(view);
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        this.zza = zzqdVar;
        this.zzb = view;
        android.view.View findViewById = view.findViewById(com.google.android.libraries.places.R.id.place_details_compact_layout);
        z = zzqdVar.zze;
        if (!z) {
            findViewById.setClickable(false);
            findViewById.setFocusable(false);
            return;
        }
        androidx.core.view.ViewCompat.setAccessibilityDelegate(findViewById, new com.google.android.libraries.places.internal.zzpz(findViewById));
        findViewById.setClickable(true);
        findViewById.setFocusable(true);
        findViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.internal.zzqb
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(android.view.View view2) {
                kotlin.jvm.functions.Function1 function1;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(com.google.android.libraries.places.internal.zzqc.this.getBindingAdapterPosition());
                if (valueOf.intValue() == -1) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    com.google.android.libraries.places.internal.zzqd zzqdVar2 = zzqdVar;
                    int intValue = valueOf.intValue();
                    function1 = zzqdVar2.zzj;
                    function1.invoke(java.lang.Integer.valueOf(intValue));
                }
            }
        });
        findViewById.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.google.android.libraries.places.internal.zzqa
            @Override // android.view.View.OnTouchListener
            public final /* synthetic */ boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                com.google.android.libraries.places.internal.zzqc.zzc(com.google.android.libraries.places.internal.zzqc.this, view2, motionEvent);
                return false;
            }
        });
    }

    static /* synthetic */ boolean zzc(com.google.android.libraries.places.internal.zzqc zzqcVar, android.view.View view, android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            zzqcVar.zzb.findViewById(com.google.android.libraries.places.R.id.place_highlight_scrim).setVisibility(0);
        } else if (action == 1 || action == 3) {
            zzqcVar.zzb.findViewById(com.google.android.libraries.places.R.id.place_highlight_scrim).setVisibility(8);
        }
        return false;
    }

    private final void zzd() {
        android.view.View view = this.zzb;
        ((android.widget.TextView) view.findViewById(com.google.android.libraries.places.R.id.place_details_attribution)).setVisibility(8);
        ((android.widget.ImageView) view.findViewById(com.google.android.libraries.places.R.id.legal_disclosures_icon)).setVisibility(8);
    }

    public final void zza() {
        int i;
        int i2;
        int i3;
        int i4;
        android.view.View view = this.zzb;
        androidx.cardview.widget.CardView cardView = (androidx.cardview.widget.CardView) view.findViewById(com.google.android.libraries.places.R.id.place_details_compact_horizontal_card);
        cardView.setRadius(0.0f);
        cardView.getLayoutParams().width = -1;
        cardView.getLayoutParams().height = -2;
        ((androidx.constraintlayout.widget.ConstraintLayout) view.findViewById(com.google.android.libraries.places.R.id.place_details_compact_layout)).setForeground(null);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.google.android.libraries.places.R.id.place_image);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        com.google.android.libraries.places.internal.zzqd zzqdVar = this.zza;
        i = zzqdVar.zzd;
        layoutParams.height = i;
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        i2 = zzqdVar.zzd;
        layoutParams2.width = i2;
        android.view.View findViewById = view.findViewById(com.google.android.libraries.places.R.id.image_loading_failure);
        android.view.ViewGroup.LayoutParams layoutParams3 = findViewById.getLayoutParams();
        i3 = zzqdVar.zzd;
        layoutParams3.height = i3;
        android.view.ViewGroup.LayoutParams layoutParams4 = findViewById.getLayoutParams();
        i4 = zzqdVar.zzd;
        layoutParams4.width = i4;
        zzd();
    }

    public final void zzb() {
        int i;
        android.view.View view = this.zzb;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        i = this.zza.zzc;
        int[] iArr = com.google.android.libraries.places.R.styleable.PlacesMaterialThemeAttrs;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iArr, "");
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, iArr);
        float dimension = obtainStyledAttributes.getDimension(com.google.android.libraries.places.R.styleable.PlacesMaterialThemeAttrs_placesCornerRadiusCard, context.getResources().getDimensionPixelSize(com.google.android.libraries.places.R.dimen.gmp_sys_shape_corner_medium_corner_size));
        androidx.cardview.widget.CardView cardView = (androidx.cardview.widget.CardView) view.findViewById(com.google.android.libraries.places.R.id.place_details_compact_vertical_card);
        cardView.getLayoutParams().width = context.getResources().getDimensionPixelSize(com.google.android.libraries.places.R.dimen.place_search_horizontal_card_width);
        cardView.setRadius(dimension);
        obtainStyledAttributes.recycle();
        view.findViewById(com.google.android.libraries.places.R.id.place_details_compact_layout).getLayoutParams().height = -1;
        android.view.ViewGroup.LayoutParams layoutParams = ((android.widget.Button) view.findViewById(com.google.android.libraries.places.R.id.open_in_maps)).getLayoutParams();
        kotlin.jvm.internal.Intrinsics.checkNotNull(layoutParams, "");
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.bottomToBottom = 0;
        layoutParams2.verticalBias = 1.0f;
        zzd();
    }
}
