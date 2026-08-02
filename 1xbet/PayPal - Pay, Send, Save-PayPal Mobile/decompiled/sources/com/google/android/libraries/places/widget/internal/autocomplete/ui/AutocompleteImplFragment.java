package com.google.android.libraries.places.widget.internal.autocomplete.ui;

/* loaded from: classes8.dex */
public final class AutocompleteImplFragment extends androidx.fragment.app.Fragment {
    public static final /* synthetic */ int zza = 0;
    private final com.google.android.libraries.places.api.net.PlacesClient zzb;
    private final com.google.android.libraries.places.internal.zznq zzc;
    private final com.google.android.libraries.places.internal.zzpu zzd;
    private final com.google.android.libraries.places.internal.zzef zze;
    private com.google.android.libraries.places.internal.zzoi zzf;
    private com.google.android.libraries.places.widget.listener.PlaceSelectionListener zzg;
    private android.widget.EditText zzh;
    private androidx.recyclerview.widget.RecyclerView zzi;
    private android.view.View zzj;
    private android.view.View zzk;
    private android.view.View zzl;
    private android.view.View zzm;
    private android.view.View zzn;
    private android.view.View zzo;
    private android.view.View zzp;
    private android.view.View zzq;
    private android.widget.TextView zzr;
    private android.widget.TextView zzs;
    private com.google.android.libraries.places.widget.internal.autocomplete.ui.zzah zzt;
    private final com.google.android.libraries.places.widget.internal.autocomplete.ui.zzk zzu;

    private AutocompleteImplFragment(int i, com.google.android.libraries.places.api.net.PlacesClient placesClient, com.google.android.libraries.places.internal.zznq zznqVar, com.google.android.libraries.places.internal.zzpu zzpuVar, com.google.android.libraries.places.internal.zzef zzefVar) {
        super(i);
        this.zzu = new com.google.android.libraries.places.widget.internal.autocomplete.ui.zzk(this, null);
        this.zzb = placesClient;
        this.zzc = zznqVar;
        this.zzd = zzpuVar;
        this.zze = zzefVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzb(com.google.android.libraries.places.internal.zzns zznsVar) {
        try {
            this.zzk.setVisibility(0);
            this.zzl.setVisibility(0);
            this.zzm.setVisibility(8);
            this.zzn.setVisibility(8);
            this.zzo.setVisibility(0);
            this.zzp.setVisibility(8);
            this.zzq.setVisibility(8);
            this.zzr.setVisibility(8);
            this.zzs.setVisibility(8);
            switch (zznsVar.zzg() - 1) {
                case 0:
                    com.google.android.libraries.places.internal.zznq zznqVar = this.zzc;
                    if (android.text.TextUtils.isEmpty(zznqVar.zzf())) {
                        this.zzk.setVisibility(8);
                    }
                    this.zzh.requestFocus();
                    this.zzh.setText(zznqVar.zzf());
                    android.widget.EditText editText = this.zzh;
                    editText.setSelection(editText.getText().length());
                    return;
                case 1:
                    this.zzt.submitList(null);
                    this.zzk.setVisibility(8);
                    this.zzh.getText().clear();
                    return;
                case 2:
                    this.zzm.setVisibility(0);
                    return;
                case 3:
                    this.zzs.setVisibility(8);
                    this.zzn.setVisibility(0);
                    this.zzo.setVisibility(8);
                    this.zzq.setVisibility(0);
                    this.zzr.setVisibility(0);
                    return;
                case 4:
                    this.zzt.submitList(zznsVar.zzb());
                    this.zzp.setVisibility(0);
                    return;
                case 5:
                    this.zzt.submitList(null);
                    this.zzo.setVisibility(8);
                    this.zzq.setVisibility(0);
                    this.zzs.setVisibility(4);
                    this.zzr.setText(getString(com.google.android.libraries.places.R.string.places_autocomplete_no_results_for_query, zznsVar.zza()));
                    this.zzr.setVisibility(0);
                    return;
                case 6:
                    break;
                case 7:
                default:
                    this.zzg.onPlaceSelected((com.google.android.libraries.places.api.model.Place) com.google.common.base.Preconditions.checkNotNull(zznsVar.zzc()));
                    return;
                case 8:
                    com.google.android.libraries.places.api.model.AutocompletePrediction autocompletePrediction = (com.google.android.libraries.places.api.model.AutocompletePrediction) com.google.common.base.Preconditions.checkNotNull(zznsVar.zzd(), "Prediction should not be null.");
                    this.zzh.clearFocus();
                    android.widget.EditText editText2 = this.zzh;
                    com.google.android.libraries.places.widget.internal.autocomplete.ui.zzk zzkVar = this.zzu;
                    editText2.removeTextChangedListener(zzkVar);
                    this.zzh.setText(autocompletePrediction.getPrimaryText(null));
                    this.zzh.addTextChangedListener(zzkVar);
                    break;
                case 9:
                    this.zzg.onError((com.google.android.gms.common.api.Status) com.google.common.base.Preconditions.checkNotNull(zznsVar.zzf()));
                    return;
            }
            this.zzt.submitList(null);
            this.zzo.setVisibility(8);
            this.zzq.setVisibility(0);
            this.zzs.setVisibility(0);
            this.zzr.setText(getString(com.google.android.libraries.places.R.string.places_search_error));
            this.zzr.setVisibility(0);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        try {
            com.google.android.libraries.places.internal.zznq zznqVar = this.zzc;
            com.google.android.libraries.places.internal.zzom zzomVar = new com.google.android.libraries.places.internal.zzom(zznqVar.zza(), null, zznqVar.zzd(), zznqVar.zzb(), zznqVar.zzf(), zznqVar.zzq(), this.zze);
            com.google.android.libraries.places.internal.zzoi zzoiVar = (com.google.android.libraries.places.internal.zzoi) new androidx.view.ViewModelProvider(this, new com.google.android.libraries.places.internal.zzoh(new com.google.android.libraries.places.internal.zzod(this.zzb, zznqVar, zzomVar.zzg(), com.google.android.libraries.places.internal.zzmy.AUTOCOMPLETE_WIDGET), zzomVar, this.zzd)).get(com.google.android.libraries.places.internal.zzoi.class);
            this.zzf = zzoiVar;
            zzoiVar.zzb(bundle);
            requireActivity().getGetHighResolutionOutputSizeshNQ4ISI().addCallback(this, new com.google.android.libraries.places.widget.internal.autocomplete.ui.zza(this, true));
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.zzf.zzk();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.zzf.zzi();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.zzf.zzh();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(final android.view.View view, android.os.Bundle bundle) {
        try {
            this.zzh = (android.widget.EditText) view.findViewById(com.google.android.libraries.places.R.id.places_autocomplete_search_bar);
            this.zzi = (androidx.recyclerview.widget.RecyclerView) view.findViewById(com.google.android.libraries.places.R.id.places_autocomplete_list);
            this.zzj = view.findViewById(com.google.android.libraries.places.R.id.places_autocomplete_back_button);
            this.zzk = view.findViewById(com.google.android.libraries.places.R.id.places_autocomplete_clear_button);
            this.zzl = view.findViewById(com.google.android.libraries.places.R.id.places_autocomplete_search_bar_separator);
            this.zzm = view.findViewById(com.google.android.libraries.places.R.id.places_autocomplete_progress);
            this.zzn = view.findViewById(com.google.android.libraries.places.R.id.places_autocomplete_try_again_progress);
            this.zzo = view.findViewById(com.google.android.libraries.places.R.id.places_autocomplete_powered_by_google);
            this.zzp = view.findViewById(com.google.android.libraries.places.R.id.places_autocomplete_powered_by_google_separator);
            this.zzq = view.findViewById(com.google.android.libraries.places.R.id.places_autocomplete_sad_cloud);
            this.zzr = (android.widget.TextView) view.findViewById(com.google.android.libraries.places.R.id.places_autocomplete_error_message);
            this.zzs = (android.widget.TextView) view.findViewById(com.google.android.libraries.places.R.id.places_autocomplete_try_again);
            this.zzh.addTextChangedListener(this.zzu);
            this.zzh.setOnFocusChangeListener(new com.google.android.libraries.places.widget.internal.autocomplete.ui.zzl(null));
            android.widget.EditText editText = this.zzh;
            com.google.android.libraries.places.internal.zznq zznqVar = this.zzc;
            editText.setHint(android.text.TextUtils.isEmpty(zznqVar.zzg()) ? com.google.android.libraries.places.internal.zznt.zze(requireContext(), com.google.android.libraries.places.R.string.places_autocomplete_search_hint) : zznqVar.zzg());
            int ordinal = zznqVar.zzb().ordinal();
            if (ordinal == 0) {
                view.setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzc
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final /* synthetic */ android.view.WindowInsets onApplyWindowInsets(android.view.View view2, android.view.WindowInsets windowInsets) {
                        android.view.View view3 = view;
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        if (marginLayoutParams != null) {
                            marginLayoutParams.setMargins(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
                            view3.setLayoutParams(marginLayoutParams);
                        }
                        return windowInsets;
                    }
                });
                int zzl = zznqVar.zzl();
                int zzm = zznqVar.zzm();
                if (android.graphics.Color.alpha(zzl) < 255) {
                    zzl = 0;
                }
                if (zzl != 0 && zzm != 0) {
                    int zza2 = com.google.android.libraries.places.internal.zznu.zza(zzl, androidx.core.content.ContextCompat.getColor(requireContext(), com.google.android.libraries.places.R.color.places_text_white_alpha_87), androidx.core.content.ContextCompat.getColor(requireContext(), com.google.android.libraries.places.R.color.places_text_black_alpha_87));
                    int zza3 = com.google.android.libraries.places.internal.zznu.zza(zzl, androidx.core.content.ContextCompat.getColor(requireContext(), com.google.android.libraries.places.R.color.places_text_white_alpha_60), androidx.core.content.ContextCompat.getColor(requireContext(), com.google.android.libraries.places.R.color.places_text_black_alpha_60));
                    view.findViewById(com.google.android.libraries.places.R.id.places_autocomplete_search_bar_container).setBackgroundColor(zzl);
                    android.view.Window window = requireActivity().getWindow();
                    window.setStatusBarColor(zzm);
                    if (com.google.android.libraries.places.internal.zznu.zzb(zzm, -1, -16777216)) {
                        window.getDecorView().setSystemUiVisibility(8192);
                    }
                    this.zzh.setTextColor(zza2);
                    this.zzh.setHintTextColor(zza3);
                    com.google.android.libraries.places.internal.zznu.zzc((android.widget.ImageView) this.zzj, zza2);
                    com.google.android.libraries.places.internal.zznu.zzc((android.widget.ImageView) this.zzk, zza2);
                }
            } else if (ordinal == 1) {
                requireActivity().getWindow().addFlags(67108864);
                view.setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzd
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final /* synthetic */ android.view.WindowInsets onApplyWindowInsets(android.view.View view2, android.view.WindowInsets windowInsets) {
                        android.view.View view3 = view;
                        view3.setPaddingRelative(view3.getPaddingStart(), windowInsets.getSystemWindowInsetTop(), view3.getPaddingEnd(), view3.getPaddingBottom());
                        return windowInsets;
                    }
                });
            }
            this.zzj.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zze
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(android.view.View view2) {
                    com.google.android.libraries.places.widget.internal.autocomplete.ui.AutocompleteImplFragment.this.zzc(view2);
                }
            });
            this.zzk.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzf
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(android.view.View view2) {
                    com.google.android.libraries.places.widget.internal.autocomplete.ui.AutocompleteImplFragment.this.zzd(view2);
                }
            });
            this.zzs.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzh
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(android.view.View view2) {
                    com.google.android.libraries.places.widget.internal.autocomplete.ui.AutocompleteImplFragment.this.zzf(view2);
                }
            });
            this.zzt = new com.google.android.libraries.places.widget.internal.autocomplete.ui.zzah(new com.google.android.libraries.places.widget.internal.autocomplete.ui.zzai() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzg
                @Override // com.google.android.libraries.places.widget.internal.autocomplete.ui.zzai
                public final /* synthetic */ void zza(com.google.android.libraries.places.api.model.AutocompletePrediction autocompletePrediction, int i) {
                    com.google.android.libraries.places.widget.internal.autocomplete.ui.AutocompleteImplFragment.this.zze(autocompletePrediction, i);
                }
            });
            this.zzi.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(requireContext()));
            this.zzi.setItemAnimator(new com.google.android.libraries.places.widget.internal.autocomplete.ui.zzaf(getResources()));
            this.zzi.setAdapter(this.zzt);
            this.zzi.addOnScrollListener(new com.google.android.libraries.places.widget.internal.autocomplete.ui.zzb(this));
            this.zzf.zza().observe(getViewLifecycleOwner(), new androidx.view.Observer() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzi
                @Override // androidx.view.Observer
                public final /* synthetic */ void onChanged(java.lang.Object obj) {
                    com.google.android.libraries.places.widget.internal.autocomplete.ui.AutocompleteImplFragment.this.zzb((com.google.android.libraries.places.internal.zzns) obj);
                }
            });
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    final /* synthetic */ void zzc(android.view.View view) {
        this.zzf.zzj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zze(com.google.android.libraries.places.api.model.AutocompletePrediction autocompletePrediction, int i) {
        try {
            this.zzf.zzd(autocompletePrediction, i);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzd(android.view.View view) {
        try {
            this.zzf.zzf();
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzf(android.view.View view) {
        try {
            this.zzf.zzg(this.zzh.getText().toString(), this.zzh.getSelectionEnd());
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    final /* synthetic */ android.widget.EditText zzh() {
        return this.zzh;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzoi zzg() {
        return this.zzf;
    }

    public final void zza(com.google.android.libraries.places.widget.listener.PlaceSelectionListener placeSelectionListener) {
        this.zzg = placeSelectionListener;
    }

    /* synthetic */ AutocompleteImplFragment(int i, com.google.android.libraries.places.api.net.PlacesClient placesClient, com.google.android.libraries.places.internal.zznq zznqVar, com.google.android.libraries.places.internal.zzpu zzpuVar, com.google.android.libraries.places.internal.zzef zzefVar, byte[] bArr) {
        this(i, placesClient, zznqVar, zzpuVar, zzefVar);
    }
}
