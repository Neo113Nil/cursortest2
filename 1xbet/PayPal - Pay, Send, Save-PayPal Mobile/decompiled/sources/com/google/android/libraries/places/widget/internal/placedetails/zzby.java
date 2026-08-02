package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzby extends androidx.fragment.app.Fragment {
    static final /* synthetic */ kotlin.reflect.KProperty[] zza = {kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(com.google.android.libraries.places.widget.internal.placedetails.zzby.class, "themeResId", "getThemeResId()I", 0))};
    private com.google.android.libraries.places.widget.internal.placedetails.zzbj zzb;
    private com.google.android.libraries.places.widget.internal.placedetails.zzr zzc;
    private androidx.recyclerview.widget.RecyclerView zzd;
    private final kotlin.properties.ReadWriteProperty zze = kotlin.properties.Delegates.INSTANCE.notNull();

    public static final /* synthetic */ void zza(final com.google.android.libraries.places.widget.internal.placedetails.zzby zzbyVar, com.google.android.libraries.places.api.model.Place place) {
        com.google.android.libraries.places.widget.internal.placedetails.zzr zzrVar = zzbyVar.zzc;
        if (zzrVar == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            zzrVar = null;
        }
        zzrVar.zza(place);
        java.util.List<com.google.android.libraries.places.api.model.Review> reviews = place.getReviews();
        if (reviews != null) {
            androidx.recyclerview.widget.RecyclerView recyclerView = zzbyVar.zzd;
            if (recyclerView == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                recyclerView = null;
            }
            com.google.android.libraries.places.widget.internal.placedetails.zzbj zzbjVar = zzbyVar.zzb;
            if (zzbjVar == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                zzbjVar = null;
            }
            com.google.android.libraries.places.internal.zzpt zze = zzbjVar.zze();
            recyclerView.setAdapter(new com.google.android.libraries.places.widget.internal.placedetails.zzci(reviews, zze != null ? zze.zze() : null, androidx.view.LifecycleOwnerKt.getLifecycleScope(zzbyVar), zzbyVar.zze(), new kotlin.jvm.functions.Function0() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzbt
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ java.lang.Object invoke() {
                    return com.google.android.libraries.places.widget.internal.placedetails.zzby.zzc(com.google.android.libraries.places.widget.internal.placedetails.zzby.this);
                }
            }));
            zzbyVar.zzf();
        }
    }

    static /* synthetic */ kotlin.Unit zzc(com.google.android.libraries.places.widget.internal.placedetails.zzby zzbyVar) {
        zzbyVar.zzf();
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ void zzd(com.google.android.libraries.places.widget.internal.placedetails.zzby zzbyVar) {
        com.google.android.libraries.places.widget.internal.placedetails.zzbj zzbjVar = zzbyVar.zzb;
        if (zzbjVar == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            zzbjVar = null;
        }
        zzbjVar.zzh();
    }

    private final int zze() {
        return ((java.lang.Number) this.zze.getValue(this, zza[0])).intValue();
    }

    private final void zzf() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.zzd;
        if (recyclerView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            recyclerView = null;
        }
        recyclerView.post(new java.lang.Runnable() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzbu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.libraries.places.widget.internal.placedetails.zzby.zzd(com.google.android.libraries.places.widget.internal.placedetails.zzby.this);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.fragment.app.Fragment requireParentFragment = requireParentFragment();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireParentFragment, "");
        android.app.Application application = requireActivity().getApplication();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(application, "");
        this.zzb = (com.google.android.libraries.places.widget.internal.placedetails.zzbj) new androidx.view.ViewModelProvider(requireParentFragment, com.google.android.libraries.places.widget.internal.placedetails.zzau.zza(application)).get(com.google.android.libraries.places.widget.internal.placedetails.zzbj.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutInflater, "");
        int i = requireArguments().getInt("arg-theme-res-id");
        this.zze.setValue(this, zza[0], java.lang.Integer.valueOf(i));
        android.view.View inflate = layoutInflater.cloneInContext(new android.view.ContextThemeWrapper(getContext(), zze())).inflate(com.google.android.libraries.places.R.layout.place_details_reviews_fragment, viewGroup, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.view.View findViewById = view.findViewById(com.google.android.libraries.places.R.id.reviews_list);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
        this.zzd = recyclerView;
        com.google.android.libraries.places.widget.internal.placedetails.zzbj zzbjVar = null;
        if (recyclerView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(requireContext()));
        ((android.widget.ImageView) view.findViewById(com.google.android.libraries.places.R.id.about_reviews_icon)).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzbv
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(android.view.View view2) {
                com.google.android.libraries.places.widget.internal.placedetails.zzby.zzg(com.google.android.libraries.places.widget.internal.placedetails.zzby.this, view2);
            }
        });
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        this.zzc = new com.google.android.libraries.places.widget.internal.placedetails.zzr(requireContext, zze(), view);
        com.google.android.libraries.places.widget.internal.placedetails.zzbj zzbjVar2 = this.zzb;
        if (zzbjVar2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            zzbjVar = zzbjVar2;
        }
        zzbjVar.zza().observe(getViewLifecycleOwner(), new com.google.android.libraries.places.widget.internal.placedetails.zzbx(new com.google.android.libraries.places.widget.internal.placedetails.zzbw(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzg(com.google.android.libraries.places.widget.internal.placedetails.zzby zzbyVar, android.view.View view) {
        android.content.Context requireContext = zzbyVar.requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        new com.google.android.libraries.places.internal.zzpj(requireContext, zzbyVar.zze(), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.google.android.libraries.places.internal.zzpi[]{com.google.android.libraries.places.internal.zzpi.zza, com.google.android.libraries.places.internal.zzpi.zzc})).show();
    }
}
