package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzf extends androidx.fragment.app.Fragment {
    static final /* synthetic */ kotlin.reflect.KProperty[] zza = {kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(com.google.android.libraries.places.widget.internal.placedetails.zzf.class, "themeResId", "getThemeResId()I", 0))};
    private com.google.android.libraries.places.widget.internal.placedetails.zzbj zzb;
    private androidx.recyclerview.widget.RecyclerView zzc;
    private final kotlin.properties.ReadWriteProperty zzd = kotlin.properties.Delegates.INSTANCE.notNull();

    public static final /* synthetic */ void zza(final com.google.android.libraries.places.widget.internal.placedetails.zzf zzfVar, com.google.android.libraries.places.api.model.Place place) {
        android.content.Context requireContext = zzfVar.requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        com.google.android.libraries.places.widget.internal.placedetails.zzl zzlVar = new com.google.android.libraries.places.widget.internal.placedetails.zzl(com.google.android.libraries.places.widget.internal.placedetails.zzm.zza(place, requireContext));
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(zzfVar.requireContext(), 2);
        gridLayoutManager.setSpanSizeLookup(new com.google.android.libraries.places.widget.internal.placedetails.zze(zzlVar));
        androidx.recyclerview.widget.RecyclerView recyclerView = zzfVar.zzc;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(gridLayoutManager);
        androidx.recyclerview.widget.RecyclerView recyclerView3 = zzfVar.zzc;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            recyclerView3 = null;
        }
        recyclerView3.setAdapter(zzlVar);
        androidx.recyclerview.widget.RecyclerView recyclerView4 = zzfVar.zzc;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            recyclerView4 = null;
        }
        android.content.Context requireContext2 = zzfVar.requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext2, "");
        recyclerView4.addItemDecoration(new com.google.android.libraries.places.widget.internal.placedetails.zzb(requireContext2, zzfVar.zzc()));
        androidx.recyclerview.widget.RecyclerView recyclerView5 = zzfVar.zzc;
        if (recyclerView5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            recyclerView2 = recyclerView5;
        }
        recyclerView2.post(new java.lang.Runnable() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zza
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.libraries.places.widget.internal.placedetails.zzf.zzb(com.google.android.libraries.places.widget.internal.placedetails.zzf.this);
            }
        });
    }

    static /* synthetic */ void zzb(com.google.android.libraries.places.widget.internal.placedetails.zzf zzfVar) {
        com.google.android.libraries.places.widget.internal.placedetails.zzbj zzbjVar = zzfVar.zzb;
        if (zzbjVar == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            zzbjVar = null;
        }
        zzbjVar.zzh();
    }

    private final int zzc() {
        return ((java.lang.Number) this.zzd.getValue(this, zza[0])).intValue();
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
        this.zzd.setValue(this, zza[0], java.lang.Integer.valueOf(i));
        android.view.View inflate = layoutInflater.cloneInContext(new android.view.ContextThemeWrapper(getContext(), zzc())).inflate(com.google.android.libraries.places.R.layout.place_details_about_fragment, viewGroup, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.view.View findViewById = view.findViewById(com.google.android.libraries.places.R.id.features_list);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.zzc = (androidx.recyclerview.widget.RecyclerView) findViewById;
        com.google.android.libraries.places.widget.internal.placedetails.zzbj zzbjVar = this.zzb;
        if (zzbjVar == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            zzbjVar = null;
        }
        zzbjVar.zza().observe(getViewLifecycleOwner(), new com.google.android.libraries.places.widget.internal.placedetails.zzd(new com.google.android.libraries.places.widget.internal.placedetails.zzc(this)));
    }
}
