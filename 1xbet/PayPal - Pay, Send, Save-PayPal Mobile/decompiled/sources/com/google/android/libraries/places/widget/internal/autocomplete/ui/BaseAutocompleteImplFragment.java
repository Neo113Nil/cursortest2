package com.google.android.libraries.places.widget.internal.autocomplete.ui;

/* loaded from: classes8.dex */
public final class BaseAutocompleteImplFragment extends androidx.fragment.app.Fragment {
    public static final /* synthetic */ int zza = 0;
    private final com.google.android.libraries.places.api.net.PlacesClient zzb;
    private final com.google.android.libraries.places.internal.zznq zzc;
    private final com.google.android.libraries.places.internal.zzpu zzd;
    private final com.google.android.libraries.places.internal.zzef zze;
    private java.lang.String zzf;
    private com.google.android.libraries.places.internal.zzoi zzg;
    private com.google.android.libraries.places.widget.listener.PlaceSelectionListener zzh;
    private com.google.android.libraries.places.widget.listener.PredictionSelectionListener zzi;
    private android.widget.EditText zzj;
    private androidx.recyclerview.widget.RecyclerView zzk;
    private android.view.View zzl;
    private android.view.View zzm;
    private android.view.View zzn;
    private android.widget.LinearLayout zzo;
    private android.widget.LinearLayout zzp;
    private android.widget.TextView zzq;
    private android.widget.ImageButton zzr;
    private com.google.android.libraries.places.widget.internal.autocomplete.ui.zzn zzs;
    private final com.google.android.libraries.places.widget.internal.autocomplete.ui.zzac zzt;
    private boolean zzu;
    private final int zzv;

    private BaseAutocompleteImplFragment(int i, com.google.android.libraries.places.api.net.PlacesClient placesClient, com.google.android.libraries.places.internal.zznq zznqVar, com.google.android.libraries.places.internal.zzpu zzpuVar, com.google.android.libraries.places.internal.zzef zzefVar, int i2) {
        super(i);
        this.zzt = new com.google.android.libraries.places.widget.internal.autocomplete.ui.zzac(this, null);
        this.zzu = false;
        this.zzb = placesClient;
        this.zzc = zznqVar;
        this.zzd = zzpuVar;
        this.zze = zzefVar;
        this.zzv = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final void zzi() {
        this.zzu = true;
        com.google.android.libraries.places.internal.zzpj zzpjVar = new com.google.android.libraries.places.internal.zzpj(requireContext(), this.zzv, com.google.common.collect.ImmutableList.of());
        zzpjVar.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzz
            @Override // android.content.DialogInterface.OnDismissListener
            public final /* synthetic */ void onDismiss(android.content.DialogInterface dialogInterface) {
                com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment.this.zzh(dialogInterface);
            }
        });
        zzpjVar.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzo, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzd(com.google.android.libraries.places.internal.zzns zznsVar) {
        try {
            this.zzm.setVisibility(0);
            this.zzp.setVisibility(8);
            int zzg = zznsVar.zzg() - 1;
            if (zzg == 0) {
                com.google.android.libraries.places.internal.zznq zznqVar = this.zzc;
                if (android.text.TextUtils.isEmpty(zznqVar.zzf())) {
                    this.zzm.setVisibility(8);
                    this.zzo.setVisibility(8);
                }
                this.zzj.requestFocus();
                this.zzj.setText(zznqVar.zzf());
                android.widget.EditText editText = this.zzj;
                editText.setSelection(editText.getText().length());
                return;
            }
            if (zzg == 1) {
                this.zzs.submitList(null);
                this.zzm.setVisibility(8);
                this.zzj.getText().clear();
                this.zzo.setVisibility(8);
                return;
            }
            switch (zzg) {
                case 4:
                    this.zzs.submitList(zznsVar.zzb());
                    this.zzo.setVisibility(0);
                    return;
                case 5:
                    this.zzs.submitList(null);
                    this.zzq.setText(this.zzf);
                    this.zzp.setVisibility(0);
                    this.zzo.setVisibility(0);
                    return;
                case 6:
                    break;
                case 7:
                    com.google.android.libraries.places.widget.listener.PlaceSelectionListener placeSelectionListener = this.zzh;
                    if (placeSelectionListener != null) {
                        placeSelectionListener.onPlaceSelected((com.google.android.libraries.places.api.model.Place) com.google.common.base.Preconditions.checkNotNull(zznsVar.zzc()));
                    }
                    com.google.android.libraries.places.widget.listener.PredictionSelectionListener predictionSelectionListener = this.zzi;
                    if (predictionSelectionListener != null) {
                        predictionSelectionListener.onPredictionSelected((com.google.android.libraries.places.api.model.AutocompletePrediction) com.google.common.base.Preconditions.checkNotNull(zznsVar.zzd()), (com.google.android.libraries.places.api.model.AutocompleteSessionToken) com.google.common.base.Preconditions.checkNotNull(zznsVar.zze()));
                        return;
                    }
                    return;
                case 8:
                    com.google.android.libraries.places.api.model.AutocompletePrediction autocompletePrediction = (com.google.android.libraries.places.api.model.AutocompletePrediction) com.google.common.base.Preconditions.checkNotNull(zznsVar.zzd(), "Prediction should not be null.");
                    this.zzj.clearFocus();
                    android.widget.EditText editText2 = this.zzj;
                    com.google.android.libraries.places.widget.internal.autocomplete.ui.zzac zzacVar = this.zzt;
                    editText2.removeTextChangedListener(zzacVar);
                    this.zzj.setText(autocompletePrediction.getPrimaryText(null));
                    this.zzj.addTextChangedListener(zzacVar);
                    break;
                case 9:
                    com.google.android.libraries.places.widget.listener.PlaceSelectionListener placeSelectionListener2 = this.zzh;
                    if (placeSelectionListener2 != null) {
                        placeSelectionListener2.onError((com.google.android.gms.common.api.Status) com.google.common.base.Preconditions.checkNotNull(zznsVar.zzf()));
                    }
                    com.google.android.libraries.places.widget.listener.PredictionSelectionListener predictionSelectionListener2 = this.zzi;
                    if (predictionSelectionListener2 != null) {
                        predictionSelectionListener2.onError((com.google.android.gms.common.api.Status) com.google.common.base.Preconditions.checkNotNull(zznsVar.zzf()));
                    }
                    com.google.android.gms.common.api.Status zzf = zznsVar.zzf();
                    if (zzf != null && !zzf.equals(com.google.android.gms.common.api.Status.RESULT_CANCELED)) {
                        this.zzq.setText(com.google.android.libraries.places.internal.zznt.zze(requireContext(), com.google.android.libraries.places.R.string.autocomplete_error_loading_results_message));
                        this.zzp.setVisibility(0);
                    }
                    this.zzo.setVisibility(8);
                    return;
                default:
                    return;
            }
            this.zzs.submitList(null);
            com.google.android.libraries.places.widget.listener.PlaceSelectionListener placeSelectionListener3 = this.zzh;
            if (placeSelectionListener3 != null) {
                placeSelectionListener3.onError((com.google.android.gms.common.api.Status) com.google.common.base.Preconditions.checkNotNull(zznsVar.zzf()));
            }
            com.google.android.libraries.places.widget.listener.PredictionSelectionListener predictionSelectionListener3 = this.zzi;
            if (predictionSelectionListener3 != null) {
                predictionSelectionListener3.onError((com.google.android.gms.common.api.Status) com.google.common.base.Preconditions.checkNotNull(zznsVar.zzf()));
            }
            this.zzq.setText(com.google.android.libraries.places.internal.zznt.zze(requireContext(), com.google.android.libraries.places.R.string.autocomplete_error_loading_results_message));
            this.zzp.setVisibility(0);
            this.zzo.setVisibility(8);
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
            com.google.android.libraries.places.internal.zzom zzomVar = new com.google.android.libraries.places.internal.zzom(zznqVar.zza(), zznqVar.zzo(), zznqVar.zzd(), zznqVar.zzb(), zznqVar.zzf(), zznqVar.zzq(), this.zze);
            com.google.android.libraries.places.internal.zzapa zza2 = com.google.android.libraries.places.internal.zzox.zza(requireContext(), this.zzv);
            zzomVar.zzd(new com.google.android.libraries.places.internal.zzok(zza2.zza(), zza2.zzc(), zza2.zzd(), zza2.zze(), zza2.zzf()));
            com.google.android.libraries.places.internal.zzoi zzoiVar = (com.google.android.libraries.places.internal.zzoi) new androidx.view.ViewModelProvider(this, new com.google.android.libraries.places.internal.zzoh(new com.google.android.libraries.places.internal.zzod(this.zzb, zznqVar, zzomVar.zzg(), zznqVar.zza() == com.google.android.libraries.places.internal.zzow.JWT_AND_ONE_PLATFORM ? com.google.android.libraries.places.internal.zzmy.PLACES_UI_KIT : com.google.android.libraries.places.internal.zzmy.ONE_PLATFORM_AUTOCOMPLETE_WIDGET), zzomVar, this.zzd)).get(com.google.android.libraries.places.internal.zzoi.class);
            this.zzg = zzoiVar;
            zzoiVar.zzb(bundle);
            requireActivity().getGetHighResolutionOutputSizeshNQ4ISI().addCallback(this, new com.google.android.libraries.places.widget.internal.autocomplete.ui.zzr(this, true));
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.zzg.zzi();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.zzg.zzh();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("arg-show-legal-disclosures", this.zzu);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(final android.view.View view, android.os.Bundle bundle) {
        androidx.appcompat.app.ActionBar supportActionBar;
        try {
            androidx.fragment.app.FragmentActivity requireActivity = requireActivity();
            android.view.Window window = requireActivity.getWindow();
            if ((requireActivity instanceof androidx.appcompat.app.AppCompatActivity) && (supportActionBar = ((androidx.appcompat.app.AppCompatActivity) requireActivity).getSupportActionBar()) != null) {
                supportActionBar.hide();
            }
            int i = this.zzv;
            android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(requireActivity, i);
            android.util.TypedValue typedValue = new android.util.TypedValue();
            if (contextThemeWrapper.getTheme().resolveAttribute(com.google.android.libraries.places.R.attr.placesColorSurface, typedValue, true)) {
                window.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(typedValue.data));
            }
            this.zzj = (android.widget.EditText) view.findViewById(com.google.android.libraries.places.R.id.autocomplete_search_bar_edit_text);
            this.zzk = (androidx.recyclerview.widget.RecyclerView) view.findViewById(com.google.android.libraries.places.R.id.autocomplete_prediction_list);
            this.zzl = view.findViewById(com.google.android.libraries.places.R.id.autocomplete_back_image_button);
            this.zzm = view.findViewById(com.google.android.libraries.places.R.id.autocomplete_clear_image_button);
            this.zzn = view.findViewById(com.google.android.libraries.places.R.id.autocomplete_google_maps_attribution_image_separator);
            this.zzo = (android.widget.LinearLayout) view.findViewById(com.google.android.libraries.places.R.id.autocomplete_google_maps_attribution_image_container);
            this.zzp = (android.widget.LinearLayout) view.findViewById(com.google.android.libraries.places.R.id.autocomplete_message_container);
            this.zzq = (android.widget.TextView) view.findViewById(com.google.android.libraries.places.R.id.autocomplete_message_text_view);
            android.widget.ImageButton imageButton = (android.widget.ImageButton) view.findViewById(com.google.android.libraries.places.R.id.autocomplete_disclosure_icon);
            this.zzr = imageButton;
            imageButton.setOnClickListener(new com.google.android.libraries.places.widget.internal.autocomplete.ui.zzs(this));
            this.zzf = com.google.android.libraries.places.internal.zznt.zze(requireContext(), com.google.android.libraries.places.R.string.autocomplete_no_matching_results_for_query);
            this.zzj.addTextChangedListener(this.zzt);
            this.zzj.setOnFocusChangeListener(new com.google.android.libraries.places.widget.internal.autocomplete.ui.zzad(null));
            com.google.android.libraries.places.internal.zznq zznqVar = this.zzc;
            int ordinal = zznqVar.zzb().ordinal();
            if (ordinal == 0) {
                view.setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzu
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
            } else if (ordinal == 1) {
                requireActivity().getWindow().addFlags(67108864);
                view.setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzv
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final /* synthetic */ android.view.WindowInsets onApplyWindowInsets(android.view.View view2, android.view.WindowInsets windowInsets) {
                        android.view.View view3 = view;
                        view3.setPaddingRelative(view3.getPaddingStart(), windowInsets.getSystemWindowInsetTop(), view3.getPaddingEnd(), view3.getPaddingBottom());
                        return windowInsets;
                    }
                });
                this.zzn.setVisibility(8);
            }
            this.zzl.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzw
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(android.view.View view2) {
                    com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment.this.zze(view2);
                }
            });
            this.zzm.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzx
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(android.view.View view2) {
                    com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment.this.zzf(view2);
                }
            });
            this.zzs = new com.google.android.libraries.places.widget.internal.autocomplete.ui.zzn(new com.google.android.libraries.places.widget.internal.autocomplete.ui.zzp() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzy
                @Override // com.google.android.libraries.places.widget.internal.autocomplete.ui.zzp
                public final /* synthetic */ void zza(com.google.android.libraries.places.api.model.AutocompletePrediction autocompletePrediction, int i2) {
                    com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment.this.zzg(autocompletePrediction, i2);
                }
            }, zznqVar, i);
            this.zzk.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(requireContext()));
            this.zzk.setItemAnimator(new com.google.android.libraries.places.widget.internal.autocomplete.ui.zzaf(getResources()));
            this.zzk.setAdapter(this.zzs);
            this.zzk.addOnScrollListener(new com.google.android.libraries.places.widget.internal.autocomplete.ui.zzt(this));
            com.google.android.libraries.places.widget.model.AutocompleteUiCustomization zzo = zznqVar.zzo();
            if (zzo != null) {
                java.lang.String zzd = zzo.getZzd();
                if (zzd == null) {
                    zzd = com.google.android.libraries.places.internal.zznt.zze(requireContext(), com.google.android.libraries.places.R.string.autocomplete_search_hint);
                }
                this.zzj.setHint(zzd);
                java.lang.String zzb = zzo.getZzb();
                if (zzb != null) {
                    this.zzf = zzb;
                }
            }
            android.content.Context context = getContext();
            if (context != null) {
                int zza2 = com.google.android.libraries.places.internal.zzos.zza(context, i);
                ((android.widget.ImageView) requireView().findViewById(com.google.android.libraries.places.R.id.autocomplete_google_maps_attribution_image)).setColorFilter(zza2);
                ((android.widget.ImageButton) requireView().findViewById(com.google.android.libraries.places.R.id.autocomplete_disclosure_icon)).setColorFilter(zza2);
            }
            this.zzg.zza().observe(getViewLifecycleOwner(), new androidx.view.Observer() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzaa
                @Override // androidx.view.Observer
                public final /* synthetic */ void onChanged(java.lang.Object obj) {
                    com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment.this.zzd((com.google.android.libraries.places.internal.zzns) obj);
                }
            });
            if (bundle != null) {
                boolean z = bundle.getBoolean("arg-show-legal-disclosures");
                this.zzu = z;
                if (z) {
                    zzi();
                }
            }
            this.zzg.zzl();
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    public final void zza() {
        this.zzg.zzk();
    }

    final /* synthetic */ void zze(android.view.View view) {
        this.zzg.zzj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzg(com.google.android.libraries.places.api.model.AutocompletePrediction autocompletePrediction, int i) {
        try {
            this.zzg.zzd(autocompletePrediction, i);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzf(android.view.View view) {
        try {
            this.zzg.zzf();
            this.zzj.requestFocus();
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    final /* synthetic */ android.widget.EditText zzk() {
        return this.zzj;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzoi zzj() {
        return this.zzg;
    }

    final /* synthetic */ void zzh(android.content.DialogInterface dialogInterface) {
        this.zzu = false;
    }

    public final void zzc(com.google.android.libraries.places.widget.listener.PredictionSelectionListener predictionSelectionListener) {
        this.zzi = predictionSelectionListener;
    }

    public final void zzb(com.google.android.libraries.places.widget.listener.PlaceSelectionListener placeSelectionListener) {
        this.zzh = placeSelectionListener;
    }

    /* synthetic */ BaseAutocompleteImplFragment(int i, com.google.android.libraries.places.api.net.PlacesClient placesClient, com.google.android.libraries.places.internal.zznq zznqVar, com.google.android.libraries.places.internal.zzpu zzpuVar, com.google.android.libraries.places.internal.zzef zzefVar, int i2, byte[] bArr) {
        this(i, placesClient, zznqVar, zzpuVar, zzefVar, i2);
    }
}
