package com.google.android.libraries.places.widget.internal.photoviewer;

/* loaded from: classes8.dex */
public final class zzl extends androidx.fragment.app.Fragment {
    public static final /* synthetic */ int zzb = 0;
    public com.google.android.libraries.places.widget.internal.photoviewer.zze zza;
    private android.widget.ImageView zzc;
    private android.widget.ImageView zzd;
    private com.google.android.libraries.places.widget.internal.photoviewer.zzd zze;
    private android.widget.FrameLayout zzf;
    private com.google.android.libraries.places.internal.zzpt zzg;
    private android.view.View zzh;
    private android.view.View zzi;

    public static final /* synthetic */ void zzd(com.google.android.libraries.places.widget.internal.photoviewer.zzl zzlVar) {
        android.widget.ImageView imageView = zzlVar.zzc;
        android.widget.FrameLayout frameLayout = null;
        if (imageView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            imageView = null;
        }
        imageView.setVisibility(8);
        android.widget.FrameLayout frameLayout2 = zzlVar.zzf;
        if (frameLayout2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            frameLayout = frameLayout2;
        }
        frameLayout.setVisibility(0);
    }

    static /* synthetic */ void zzf(com.google.android.libraries.places.widget.internal.photoviewer.zzl zzlVar, android.view.View view) {
        zzlVar.zzi(false);
        zzlVar.zzb().onGoToPreviousImage();
        zzlVar.zzj();
    }

    static /* synthetic */ void zzg(com.google.android.libraries.places.widget.internal.photoviewer.zzl zzlVar, android.view.View view) {
        zzlVar.zzi(false);
        zzlVar.zzb().onGoToNextImage();
        zzlVar.zzj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzi(boolean z) {
        android.view.View view = this.zzh;
        android.view.View view2 = null;
        if (view == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        }
        view.setEnabled(z);
        android.view.View view3 = this.zzi;
        if (view3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            view2 = view3;
        }
        view2.setEnabled(z);
    }

    private final void zzj() {
        android.view.View view = getView();
        if (view != null) {
            view.postDelayed(new java.lang.Runnable() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.libraries.places.widget.internal.photoviewer.zzl.this.zzi(true);
                }
            }, 300L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        if (context instanceof com.google.android.libraries.places.widget.internal.photoviewer.zze) {
            com.google.android.libraries.places.widget.internal.photoviewer.zze zzeVar = (com.google.android.libraries.places.widget.internal.photoviewer.zze) context;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzeVar, "");
            this.zza = zzeVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle requireArguments = requireArguments();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireArguments, "");
        this.zze = (com.google.android.libraries.places.widget.internal.photoviewer.zzd) com.google.android.libraries.places.internal.zzou.zza(requireArguments, "page_data", com.google.android.libraries.places.widget.internal.photoviewer.zzd.class);
        if (this.zzg == null) {
            com.google.android.libraries.places.internal.zzps zza = com.google.android.libraries.places.internal.zzpr.zza();
            zza.zzc(requireContext());
            zza.zzb(com.google.android.libraries.places.internal.zzmy.PLACES_UI_KIT);
            this.zzg = zza.zza();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutInflater, "");
        android.view.View inflate = layoutInflater.inflate(com.google.android.libraries.places.R.layout.photo_viewer_fragment, viewGroup, false);
        android.view.View findViewById = inflate.findViewById(com.google.android.libraries.places.R.id.blurred_background_image);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.zzd = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.google.android.libraries.places.R.id.photo_viewer_image);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.zzc = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.google.android.libraries.places.R.id.loading_failed_ui);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.zzf = (android.widget.FrameLayout) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.google.android.libraries.places.R.id.previous_image_button);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.zzh = findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.google.android.libraries.places.R.id.next_image_button);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.zzi = findViewById5;
        android.view.View view = this.zzh;
        android.view.View view2 = null;
        if (view == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        }
        view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzi
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(android.view.View view3) {
                com.google.android.libraries.places.widget.internal.photoviewer.zzl.zzf(com.google.android.libraries.places.widget.internal.photoviewer.zzl.this, view3);
            }
        });
        android.view.View view3 = this.zzi;
        if (view3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            view2 = view3;
        }
        view2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzf
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(android.view.View view4) {
                com.google.android.libraries.places.widget.internal.photoviewer.zzl.zzg(com.google.android.libraries.places.widget.internal.photoviewer.zzl.this, view4);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNull(inflate);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.view.View view2 = this.zzh;
        android.widget.ImageView imageView = null;
        if (view2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            view2 = null;
        }
        view2.setVisibility(true != requireArguments().getBoolean("has_previous") ? 8 : 0);
        android.view.View view3 = this.zzi;
        if (view3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            view3 = null;
        }
        view3.setVisibility(true == requireArguments().getBoolean("has_next") ? 0 : 8);
        com.bumptech.glide.RequestManager with = com.bumptech.glide.Glide.with(requireContext());
        com.google.android.libraries.places.widget.internal.photoviewer.zzd zzdVar = this.zze;
        if (zzdVar == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            zzdVar = null;
        }
        com.bumptech.glide.RequestBuilder load = with.load(zzdVar.zzb());
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        com.bumptech.glide.RequestBuilder apply = load.apply(com.bumptech.glide.request.RequestOptions.bitmapTransform(new com.google.android.libraries.places.widget.internal.photoviewer.zza(requireContext, 25.0f, 0.125f)));
        android.widget.ImageView imageView2 = this.zzd;
        if (imageView2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            imageView = imageView2;
        }
        apply.into(imageView);
        requireView().post(new java.lang.Runnable() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.libraries.places.widget.internal.photoviewer.zzl zzlVar = com.google.android.libraries.places.widget.internal.photoviewer.zzl.this;
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.LifecycleOwnerKt.getLifecycleScope(zzlVar), null, null, new com.google.android.libraries.places.widget.internal.photoviewer.zzk(zzlVar, null), 3, null);
            }
        });
    }

    public final com.google.android.libraries.places.widget.internal.photoviewer.zze zzb() {
        com.google.android.libraries.places.widget.internal.photoviewer.zze zzeVar = this.zza;
        if (zzeVar != null) {
            return zzeVar;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final com.google.android.libraries.places.internal.zzpt zza() {
        return this.zzg;
    }
}
