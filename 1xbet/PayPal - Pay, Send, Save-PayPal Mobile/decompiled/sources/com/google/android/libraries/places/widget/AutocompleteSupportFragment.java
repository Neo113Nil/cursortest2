package com.google.android.libraries.places.widget;

@java.lang.Deprecated
/* loaded from: classes.dex */
public class AutocompleteSupportFragment extends androidx.fragment.app.Fragment {
    private final androidx.view.MutableLiveData zza;
    private final androidx.view.MutableLiveData zzb;
    private com.google.android.libraries.places.internal.zznp zzc;
    private com.google.android.libraries.places.widget.listener.PlaceSelectionListener zzd;

    public AutocompleteSupportFragment() {
        super(com.google.android.libraries.places.R.layout.places_autocomplete_fragment);
        this.zza = new androidx.view.MutableLiveData();
        this.zzb = new androidx.view.MutableLiveData();
        this.zzc = com.google.android.libraries.places.internal.zznq.zzs(com.google.android.libraries.places.widget.model.AutocompleteActivityMode.OVERLAY, com.google.common.collect.ImmutableList.of(), com.google.android.libraries.places.internal.zzor.FRAGMENT);
    }

    public static com.google.android.libraries.places.widget.AutocompleteSupportFragment newInstance() {
        return new com.google.android.libraries.places.widget.AutocompleteSupportFragment();
    }

    private final void zze(android.view.View view) {
        view.setVisibility(true != android.text.TextUtils.isEmpty((java.lang.CharSequence) this.zza.getValue()) ? 0 : 8);
    }

    private final void zzf() {
        android.content.Intent build = new com.google.android.libraries.places.widget.Autocomplete.IntentBuilder(this.zzc.zzr()).build(requireContext());
        if (requireView().isEnabled()) {
            requireView().setEnabled(false);
            startActivityForResult(build, 30421);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zzg(android.widget.EditText editText, android.view.View view, java.lang.CharSequence charSequence) {
        try {
            editText.setHint(charSequence);
            view.setContentDescription(charSequence);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzc(android.widget.EditText editText, android.view.View view, java.lang.CharSequence charSequence) {
        try {
            editText.setText(charSequence);
            zze(view);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        if (i == 30421) {
            try {
                com.google.android.libraries.places.widget.listener.PlaceSelectionListener placeSelectionListener = this.zzd;
                if (placeSelectionListener == null) {
                    android.util.Log.isLoggable("Places", 5);
                    return;
                }
                if (intent == null) {
                    android.util.Log.isLoggable("Places", 6);
                } else {
                    if (i2 != -1) {
                        placeSelectionListener.onError(com.google.android.libraries.places.widget.Autocomplete.getStatusFromIntent(intent));
                        return;
                    }
                    com.google.android.libraries.places.api.model.Place placeFromIntent = com.google.android.libraries.places.widget.Autocomplete.getPlaceFromIntent(intent);
                    placeSelectionListener.onPlaceSelected(placeFromIntent);
                    setText(placeFromIntent.getDisplayName());
                }
            } catch (java.lang.Error | java.lang.RuntimeException e) {
                com.google.android.libraries.places.internal.zznb.zzb(e);
                throw e;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            try {
                com.google.android.libraries.places.internal.zznq zznqVar = (com.google.android.libraries.places.internal.zznq) bundle.getParcelable("options");
                if (zznqVar != null) {
                    androidx.view.MutableLiveData mutableLiveData = this.zza;
                    if (mutableLiveData.getValue() == 0) {
                        mutableLiveData.postValue(zznqVar.zzf());
                    }
                    androidx.view.MutableLiveData mutableLiveData2 = this.zzb;
                    if (mutableLiveData2.getValue() == 0) {
                        mutableLiveData2.postValue(zznqVar.zzg());
                    }
                    this.zzc = zznqVar.zzr();
                }
            } catch (java.lang.Error | java.lang.RuntimeException e) {
                com.google.android.libraries.places.internal.zznb.zzb(e);
                throw e;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        requireView().setEnabled(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        bundle.putParcelable("options", this.zzc.zzr());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        final android.view.View findViewById = view.findViewById(com.google.android.libraries.places.R.id.places_autocomplete_search_button);
        final android.view.View findViewById2 = view.findViewById(com.google.android.libraries.places.R.id.places_autocomplete_clear_button);
        final android.widget.EditText editText = (android.widget.EditText) view.findViewById(com.google.android.libraries.places.R.id.places_autocomplete_search_input);
        editText.setHint(com.google.android.libraries.places.internal.zznt.zze(requireContext(), com.google.android.libraries.places.R.string.places_autocomplete_search_hint));
        findViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzg
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(android.view.View view2) {
                com.google.android.libraries.places.widget.AutocompleteSupportFragment.this.zza(view2);
            }
        });
        editText.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzc
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(android.view.View view2) {
                com.google.android.libraries.places.widget.AutocompleteSupportFragment.this.zzb(view2);
            }
        });
        findViewById2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.widget.zzd
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(android.view.View view2) {
                com.google.android.libraries.places.widget.AutocompleteSupportFragment.this.setText(null);
            }
        });
        zze(findViewById2);
        this.zza.observe(getViewLifecycleOwner(), new androidx.view.Observer() { // from class: com.google.android.libraries.places.widget.zze
            @Override // androidx.view.Observer
            public final /* synthetic */ void onChanged(java.lang.Object obj) {
                com.google.android.libraries.places.widget.AutocompleteSupportFragment.this.zzc(editText, findViewById2, (java.lang.CharSequence) obj);
            }
        });
        this.zzb.observe(getViewLifecycleOwner(), new androidx.view.Observer() { // from class: com.google.android.libraries.places.widget.zzf
            @Override // androidx.view.Observer
            public final /* synthetic */ void onChanged(java.lang.Object obj) {
                com.google.android.libraries.places.widget.AutocompleteSupportFragment.zzg(editText, findViewById, (java.lang.CharSequence) obj);
            }
        });
    }

    public com.google.android.libraries.places.widget.AutocompleteSupportFragment setActivityMode(com.google.android.libraries.places.widget.model.AutocompleteActivityMode autocompleteActivityMode) {
        this.zzc.zzb(autocompleteActivityMode);
        return this;
    }

    public com.google.android.libraries.places.widget.AutocompleteSupportFragment setCountries(java.util.List<java.lang.String> list) {
        this.zzc.zzj(list);
        return this;
    }

    public com.google.android.libraries.places.widget.AutocompleteSupportFragment setHint(java.lang.CharSequence charSequence) {
        try {
            if (charSequence != null) {
                this.zzc.zzg(charSequence.toString());
                this.zzb.postValue(charSequence);
                return this;
            }
            java.lang.String string = getString(com.google.android.libraries.places.R.string.places_autocomplete_search_hint);
            this.zzc.zzg(string);
            this.zzb.postValue(string);
            return this;
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    public com.google.android.libraries.places.widget.AutocompleteSupportFragment setLocationBias(com.google.android.libraries.places.api.model.LocationBias locationBias) {
        this.zzc.zzh(locationBias);
        return this;
    }

    public com.google.android.libraries.places.widget.AutocompleteSupportFragment setLocationRestriction(com.google.android.libraries.places.api.model.LocationRestriction locationRestriction) {
        this.zzc.zzi(locationRestriction);
        return this;
    }

    public com.google.android.libraries.places.widget.AutocompleteSupportFragment setPlaceFields(java.util.List<com.google.android.libraries.places.api.model.Place.Field> list) {
        this.zzc.zzc(list);
        return this;
    }

    public com.google.android.libraries.places.widget.AutocompleteSupportFragment setRegionCode(java.lang.String str) {
        this.zzc.zzn(str);
        return this;
    }

    public com.google.android.libraries.places.widget.AutocompleteSupportFragment setText(java.lang.CharSequence charSequence) {
        try {
            this.zzc.zzf(android.text.TextUtils.isEmpty(charSequence) ? null : charSequence.toString());
            this.zza.postValue(charSequence);
            return this;
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    public com.google.android.libraries.places.widget.AutocompleteSupportFragment setTypesFilter(java.util.List<java.lang.String> list) {
        this.zzc.zzk(list);
        return this;
    }

    final /* synthetic */ void zza(android.view.View view) {
        zzf();
    }

    final /* synthetic */ void zzb(android.view.View view) {
        zzf();
    }

    public com.google.android.libraries.places.widget.AutocompleteSupportFragment setCountries(java.lang.String... strArr) {
        this.zzc.zzj(com.google.common.collect.ImmutableList.copyOf(strArr));
        return this;
    }

    public com.google.android.libraries.places.widget.AutocompleteSupportFragment setOnPlaceSelectedListener(com.google.android.libraries.places.widget.listener.PlaceSelectionListener placeSelectionListener) {
        this.zzd = placeSelectionListener;
        return this;
    }
}
