package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzao extends androidx.fragment.app.Fragment {
    static final /* synthetic */ kotlin.reflect.KProperty[] zza = {kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(com.google.android.libraries.places.widget.internal.placedetails.zzao.class, "themeResId", "getThemeResId()I", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(com.google.android.libraries.places.widget.internal.placedetails.zzao.class, "openingHoursRequested", "getOpeningHoursRequested()Z", 0))};
    private com.google.android.libraries.places.widget.internal.placedetails.zzbj zzb;
    private final kotlin.properties.ReadWriteProperty zzc = kotlin.properties.Delegates.INSTANCE.notNull();
    private final kotlin.properties.ReadWriteProperty zzd = kotlin.properties.Delegates.INSTANCE.notNull();
    private com.google.android.libraries.places.widget.internal.placedetails.zzr zze;
    private androidx.recyclerview.widget.RecyclerView zzf;
    private android.widget.TextView zzg;
    private androidx.recyclerview.widget.RecyclerView zzh;
    private android.widget.TextView zzi;
    private android.view.View zzj;
    private android.widget.TextView zzk;
    private android.widget.ImageView zzl;
    private android.widget.TextView zzm;
    private android.widget.TextView zzn;
    private android.widget.TextView zzo;
    private android.widget.ImageView zzp;
    private androidx.recyclerview.widget.RecyclerView zzq;
    private android.widget.ImageView zzr;
    private android.widget.TextView zzs;
    private android.widget.ImageView zzt;
    private android.widget.TextView zzu;
    private android.widget.ImageView zzv;
    private android.widget.TextView zzw;
    private android.widget.ImageView zzx;
    private boolean zzy;

    static /* synthetic */ void zze(com.google.android.libraries.places.widget.internal.placedetails.zzao zzaoVar, android.view.View view) {
        androidx.recyclerview.widget.RecyclerView recyclerView = null;
        if (zzaoVar.zzy) {
            android.widget.ImageView imageView = zzaoVar.zzp;
            if (imageView == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                imageView = null;
            }
            imageView.setContentDescription(zzaoVar.requireContext().getString(com.google.android.libraries.places.R.string.show_weekly_hours_content_description));
            androidx.recyclerview.widget.RecyclerView recyclerView2 = zzaoVar.zzq;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                recyclerView = recyclerView2;
            }
            recyclerView.setVisibility(8);
        } else {
            android.widget.ImageView imageView2 = zzaoVar.zzp;
            if (imageView2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                imageView2 = null;
            }
            imageView2.setContentDescription(zzaoVar.requireContext().getString(com.google.android.libraries.places.R.string.hide_weekly_hours_content_description));
            androidx.recyclerview.widget.RecyclerView recyclerView3 = zzaoVar.zzq;
            if (recyclerView3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                recyclerView = recyclerView3;
            }
            recyclerView.setVisibility(0);
        }
        zzaoVar.zzy = !zzaoVar.zzy;
        zzaoVar.zzj();
    }

    private final int zzf() {
        return ((java.lang.Number) this.zzc.getValue(this, zza[0])).intValue();
    }

    private final boolean zzg() {
        return ((java.lang.Boolean) this.zzd.getValue(this, zza[1])).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(final com.google.android.libraries.places.api.model.Place place) {
        java.util.List list;
        boolean z;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.google.android.libraries.places.internal.zzef zzb;
        java.lang.String str;
        java.lang.String str2;
        android.widget.ImageView imageView;
        java.util.List<java.lang.String> list2;
        android.widget.ImageView imageView2;
        android.widget.TextView textView;
        android.widget.ImageView imageView3;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.ImageView imageView4;
        android.widget.TextView textView4;
        android.widget.TextView textView5;
        android.widget.TextView textView6;
        android.widget.ImageView imageView5;
        com.google.android.libraries.places.internal.zzef zzb2;
        com.google.android.libraries.places.internal.zzef zzb3;
        java.util.List<com.google.android.libraries.places.api.model.FuelPrice> fuelPrices;
        com.google.android.libraries.places.widget.internal.placedetails.zzr zzrVar = this.zze;
        if (zzrVar == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            zzrVar = null;
        }
        zzrVar.zza(place);
        com.google.android.libraries.places.api.model.EVChargeOptions evChargeOptions = place.getEvChargeOptions();
        java.util.List<com.google.android.libraries.places.api.model.ConnectorAggregation> connectorAggregations = evChargeOptions != null ? evChargeOptions.getConnectorAggregations() : null;
        com.google.android.libraries.places.api.model.FuelOptions fuelOptions = place.getFuelOptions();
        if (fuelOptions == null || (fuelPrices = fuelOptions.getFuelPrices()) == null) {
            list = null;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : fuelPrices) {
                com.google.android.libraries.places.api.model.FuelPrice.FuelType type = ((com.google.android.libraries.places.api.model.FuelPrice) obj).getType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
                if (com.google.android.libraries.places.widget.internal.placedetails.zzz.zza(type)) {
                    arrayList.add(obj);
                }
            }
            list = kotlin.collections.CollectionsKt.sortedWith(arrayList, new com.google.android.libraries.places.widget.internal.placedetails.zzan());
        }
        if (connectorAggregations == null || connectorAggregations.isEmpty()) {
            if (list == null || list.isEmpty()) {
                androidx.recyclerview.widget.RecyclerView recyclerView2 = this.zzf;
                if (recyclerView2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    recyclerView2 = null;
                }
                recyclerView2.setVisibility(8);
                androidx.recyclerview.widget.RecyclerView recyclerView3 = this.zzh;
                if (recyclerView3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    recyclerView3 = null;
                }
                recyclerView3.setVisibility(8);
                android.widget.TextView textView7 = this.zzi;
                if (textView7 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    textView7 = null;
                }
                textView7.setVisibility(8);
                android.widget.TextView textView8 = this.zzg;
                if (textView8 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    textView8 = null;
                }
                textView8.setVisibility(8);
                android.view.View view = this.zzj;
                if (view == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    view = null;
                }
                view.setVisibility(8);
            } else {
                androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(requireContext(), list.size());
                com.google.android.libraries.places.widget.internal.placedetails.zzbj zzbjVar = this.zzb;
                if (zzbjVar == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    zzbjVar = null;
                }
                com.google.android.libraries.places.internal.zzpt zze = zzbjVar.zze();
                java.time.Instant zza2 = (zze == null || (zzb = zze.zzb()) == null) ? null : zzb.zza();
                androidx.recyclerview.widget.RecyclerView recyclerView4 = this.zzh;
                if (recyclerView4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    recyclerView4 = null;
                }
                recyclerView4.setAdapter(new com.google.android.libraries.places.widget.internal.placedetails.zzy(list, zza2));
                androidx.recyclerview.widget.RecyclerView recyclerView5 = this.zzh;
                if (recyclerView5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    recyclerView5 = null;
                }
                recyclerView5.setLayoutManager(gridLayoutManager);
                java.util.List<com.google.android.libraries.places.api.model.FuelPrice> list3 = list;
                if (!(list3 instanceof java.util.Collection) || !list3.isEmpty()) {
                    for (com.google.android.libraries.places.api.model.FuelPrice fuelPrice : list3) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(fuelPrice);
                        if (com.google.android.libraries.places.widget.internal.placedetails.zzz.zzb(fuelPrice, zza2)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                android.widget.TextView textView9 = this.zzi;
                if (textView9 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    textView9 = null;
                }
                zzl(textView9, z ? requireContext().getString(com.google.android.libraries.places.R.string.fuel_price_updated_over_24_hours_ago) : null);
                androidx.recyclerview.widget.RecyclerView recyclerView6 = this.zzf;
                if (recyclerView6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    recyclerView6 = null;
                }
                recyclerView6.setVisibility(8);
                android.widget.TextView textView10 = this.zzg;
                if (textView10 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    textView10 = null;
                }
                textView10.setVisibility(8);
                androidx.recyclerview.widget.RecyclerView recyclerView7 = this.zzh;
                if (recyclerView7 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    recyclerView7 = null;
                }
                recyclerView7.setVisibility(0);
                android.view.View view2 = this.zzj;
                if (view2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    view2 = null;
                }
                view2.setVisibility(0);
                recyclerView = this.zzh;
                if (recyclerView == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                }
            }
            recyclerView = null;
        } else {
            androidx.recyclerview.widget.RecyclerView recyclerView8 = this.zzf;
            if (recyclerView8 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                recyclerView8 = null;
            }
            recyclerView8.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(requireContext()));
            androidx.recyclerview.widget.RecyclerView recyclerView9 = this.zzf;
            if (recyclerView9 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                recyclerView9 = null;
            }
            recyclerView9.setAdapter(new com.google.android.libraries.places.widget.internal.placedetails.zzt(connectorAggregations, zzf()));
            android.widget.TextView textView11 = this.zzg;
            if (textView11 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                textView11 = null;
            }
            android.widget.TextView textView12 = textView11;
            android.content.Context requireContext = requireContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
            com.google.android.libraries.places.widget.internal.placedetails.zzbj zzbjVar2 = this.zzb;
            if (zzbjVar2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                zzbjVar2 = null;
            }
            com.google.android.libraries.places.internal.zzpt zze2 = zzbjVar2.zze();
            zzl(textView12, com.google.android.libraries.places.widget.internal.placedetails.zzu.zza(connectorAggregations, requireContext, (zze2 == null || (zzb3 = zze2.zzb()) == null) ? null : zzb3.zza()));
            androidx.recyclerview.widget.RecyclerView recyclerView10 = this.zzf;
            if (recyclerView10 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                recyclerView10 = null;
            }
            recyclerView10.setVisibility(0);
            androidx.recyclerview.widget.RecyclerView recyclerView11 = this.zzh;
            if (recyclerView11 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                recyclerView11 = null;
            }
            recyclerView11.setVisibility(8);
            android.widget.TextView textView13 = this.zzi;
            if (textView13 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                textView13 = null;
            }
            textView13.setVisibility(8);
            android.view.View view3 = this.zzj;
            if (view3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                view3 = null;
            }
            view3.setVisibility(0);
            recyclerView = this.zzf;
            if (recyclerView == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                recyclerView = null;
            }
        }
        android.widget.TextView textView14 = this.zzk;
        if (textView14 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            textView14 = null;
        }
        zzl(textView14, place.getFormattedAddress());
        android.widget.ImageView imageView6 = this.zzl;
        if (imageView6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            imageView6 = null;
        }
        zzl(imageView6, place.getFormattedAddress());
        if (zzg()) {
            android.content.Context requireContext2 = requireContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext2, "");
            str = com.google.android.libraries.places.widget.internal.placedetails.zzag.zzc(place, requireContext2);
        } else {
            str = null;
        }
        if (zzg()) {
            com.google.android.libraries.places.widget.internal.placedetails.zzbj zzbjVar3 = this.zzb;
            if (zzbjVar3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                zzbjVar3 = null;
            }
            com.google.android.libraries.places.internal.zzpt zze3 = zzbjVar3.zze();
            java.time.Instant zza3 = (zze3 == null || (zzb2 = zze3.zzb()) == null) ? null : zzb2.zza();
            android.content.Context requireContext3 = requireContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext3, "");
            str2 = com.google.android.libraries.places.widget.internal.placedetails.zzag.zzb(place, zza3, requireContext3);
        } else {
            str2 = null;
        }
        android.widget.TextView textView15 = this.zzm;
        if (textView15 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            textView15 = null;
        }
        java.lang.String str3 = str;
        zzl(textView15, str3);
        android.widget.TextView textView16 = this.zzm;
        if (textView16 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            textView16 = null;
        }
        android.content.Context requireContext4 = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext4, "");
        textView16.setTextColor(com.google.android.libraries.places.widget.internal.placedetails.zzag.zza(place, requireContext4, zzf()));
        android.widget.TextView textView17 = this.zzo;
        if (textView17 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            textView17 = null;
        }
        zzl(textView17, str2);
        android.widget.TextView textView18 = this.zzm;
        if (textView18 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            textView18 = null;
        }
        if (textView18.getVisibility() == 0) {
            android.widget.TextView textView19 = this.zzo;
            if (textView19 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                textView19 = null;
            }
            if (textView19.getVisibility() == 0) {
                android.widget.TextView textView20 = this.zzn;
                if (textView20 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    textView20 = null;
                }
                textView20.setVisibility(0);
                imageView = this.zzr;
                if (imageView == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    imageView = null;
                }
                zzl(imageView, str3);
                com.google.android.libraries.places.api.model.OpeningHours currentOpeningHours = place.getCurrentOpeningHours();
                java.util.List<java.lang.String> weekdayText = currentOpeningHours == null ? currentOpeningHours.getWeekdayText() : null;
                list2 = weekdayText;
                if (list2 != null || list2.isEmpty() || str3 == null || str3.length() == 0) {
                    imageView2 = this.zzp;
                    if (imageView2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        imageView2 = null;
                    }
                    imageView2.setVisibility(8);
                } else {
                    android.widget.ImageView imageView7 = this.zzp;
                    if (imageView7 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        imageView7 = null;
                    }
                    imageView7.setVisibility(0);
                    androidx.recyclerview.widget.RecyclerView recyclerView12 = this.zzq;
                    if (recyclerView12 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        recyclerView12 = null;
                    }
                    recyclerView12.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(requireContext()));
                    androidx.recyclerview.widget.RecyclerView recyclerView13 = this.zzq;
                    if (recyclerView13 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        recyclerView13 = null;
                    }
                    recyclerView13.setAdapter(new com.google.android.libraries.places.widget.internal.placedetails.zzw(weekdayText));
                    android.widget.ImageView imageView8 = this.zzp;
                    if (imageView8 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        imageView8 = null;
                    }
                    imageView8.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzaj
                        @Override // android.view.View.OnClickListener
                        public final /* synthetic */ void onClick(android.view.View view4) {
                            com.google.android.libraries.places.widget.internal.placedetails.zzao.zze(com.google.android.libraries.places.widget.internal.placedetails.zzao.this, view4);
                        }
                    });
                }
                textView = this.zzu;
                if (textView == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    textView = null;
                }
                zzl(textView, place.getInternationalPhoneNumber());
                imageView3 = this.zzv;
                if (imageView3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    imageView3 = null;
                }
                zzl(imageView3, place.getInternationalPhoneNumber());
                textView2 = this.zzu;
                if (textView2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    textView2 = null;
                }
                if (textView2.getVisibility() == 0) {
                    android.widget.TextView textView21 = this.zzu;
                    if (textView21 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        textView21 = null;
                    }
                    textView21.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzak
                        @Override // android.view.View.OnClickListener
                        public final /* synthetic */ void onClick(android.view.View view4) {
                            com.google.android.libraries.places.widget.internal.placedetails.zzao.zzk(com.google.android.libraries.places.api.model.Place.this, this, view4);
                        }
                    });
                    android.widget.TextView textView22 = this.zzu;
                    if (textView22 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        textView22 = null;
                    }
                    com.google.android.libraries.places.internal.zzop.zzb(textView22);
                }
                textView3 = this.zzs;
                if (textView3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    textView3 = null;
                }
                android.widget.TextView textView23 = textView3;
                android.net.Uri websiteUri = place.getWebsiteUri();
                zzl(textView23, websiteUri == null ? websiteUri.getHost() : null);
                imageView4 = this.zzt;
                if (imageView4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    imageView4 = null;
                }
                android.widget.ImageView imageView9 = imageView4;
                android.net.Uri websiteUri2 = place.getWebsiteUri();
                zzl(imageView9, websiteUri2 == null ? websiteUri2.toString() : null);
                textView4 = this.zzs;
                if (textView4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    textView4 = null;
                }
                textView4.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzah
                    @Override // android.view.View.OnClickListener
                    public final /* synthetic */ void onClick(android.view.View view4) {
                        com.google.android.libraries.places.widget.internal.placedetails.zzao.this.zzi(place.getWebsiteUri());
                    }
                });
                textView5 = this.zzs;
                if (textView5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    textView5 = null;
                }
                com.google.android.libraries.places.internal.zzop.zzb(textView5);
                textView6 = this.zzw;
                if (textView6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    textView6 = null;
                }
                android.widget.TextView textView24 = textView6;
                com.google.android.libraries.places.api.model.PlusCode plusCode = place.getPlusCode();
                zzl(textView24, plusCode == null ? plusCode.getCompoundCode() : null);
                imageView5 = this.zzx;
                if (imageView5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    imageView5 = null;
                }
                android.widget.ImageView imageView10 = imageView5;
                com.google.android.libraries.places.api.model.PlusCode plusCode2 = place.getPlusCode();
                zzl(imageView10, plusCode2 != null ? plusCode2.getCompoundCode() : null);
                if (recyclerView == null) {
                    recyclerView.post(new java.lang.Runnable() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzai
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.libraries.places.widget.internal.placedetails.zzao.this.zzj();
                        }
                    });
                    return;
                } else {
                    zzj();
                    return;
                }
            }
        }
        android.widget.TextView textView25 = this.zzn;
        if (textView25 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            textView25 = null;
        }
        textView25.setVisibility(8);
        imageView = this.zzr;
        if (imageView == null) {
        }
        zzl(imageView, str3);
        com.google.android.libraries.places.api.model.OpeningHours currentOpeningHours2 = place.getCurrentOpeningHours();
        if (currentOpeningHours2 == null) {
        }
        list2 = weekdayText;
        if (list2 != null) {
        }
        imageView2 = this.zzp;
        if (imageView2 == null) {
        }
        imageView2.setVisibility(8);
        textView = this.zzu;
        if (textView == null) {
        }
        zzl(textView, place.getInternationalPhoneNumber());
        imageView3 = this.zzv;
        if (imageView3 == null) {
        }
        zzl(imageView3, place.getInternationalPhoneNumber());
        textView2 = this.zzu;
        if (textView2 == null) {
        }
        if (textView2.getVisibility() == 0) {
        }
        textView3 = this.zzs;
        if (textView3 == null) {
        }
        android.widget.TextView textView232 = textView3;
        android.net.Uri websiteUri3 = place.getWebsiteUri();
        zzl(textView232, websiteUri3 == null ? websiteUri3.getHost() : null);
        imageView4 = this.zzt;
        if (imageView4 == null) {
        }
        android.widget.ImageView imageView92 = imageView4;
        android.net.Uri websiteUri22 = place.getWebsiteUri();
        zzl(imageView92, websiteUri22 == null ? websiteUri22.toString() : null);
        textView4 = this.zzs;
        if (textView4 == null) {
        }
        textView4.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzah
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(android.view.View view4) {
                com.google.android.libraries.places.widget.internal.placedetails.zzao.this.zzi(place.getWebsiteUri());
            }
        });
        textView5 = this.zzs;
        if (textView5 == null) {
        }
        com.google.android.libraries.places.internal.zzop.zzb(textView5);
        textView6 = this.zzw;
        if (textView6 == null) {
        }
        android.widget.TextView textView242 = textView6;
        com.google.android.libraries.places.api.model.PlusCode plusCode3 = place.getPlusCode();
        zzl(textView242, plusCode3 == null ? plusCode3.getCompoundCode() : null);
        imageView5 = this.zzx;
        if (imageView5 == null) {
        }
        android.widget.ImageView imageView102 = imageView5;
        com.google.android.libraries.places.api.model.PlusCode plusCode22 = place.getPlusCode();
        zzl(imageView102, plusCode22 != null ? plusCode22.getCompoundCode() : null);
        if (recyclerView == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzi(android.net.Uri uri) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setData(uri);
        try {
            requireContext().startActivity(intent);
        } catch (android.content.ActivityNotFoundException unused) {
            android.content.Context requireContext = requireContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
            new com.google.android.libraries.places.internal.zzpl(requireContext, zzf()).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj() {
        com.google.android.libraries.places.widget.internal.placedetails.zzbj zzbjVar = this.zzb;
        if (zzbjVar == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            zzbjVar = null;
        }
        zzbjVar.zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzk(com.google.android.libraries.places.api.model.Place place, com.google.android.libraries.places.widget.internal.placedetails.zzao zzaoVar, android.view.View view) {
        try {
            zzaoVar.startActivity(new android.content.Intent("android.intent.action.DIAL", android.net.Uri.parse("tel:".concat(java.lang.String.valueOf(place.getInternationalPhoneNumber())))));
        } catch (android.content.ActivityNotFoundException unused) {
        }
    }

    private static final void zzl(android.view.View view, java.lang.CharSequence charSequence) {
        if (charSequence == null || kotlin.text.StringsKt.isBlank(charSequence)) {
            view.setVisibility(8);
            return;
        }
        if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setText(charSequence);
        }
        view.setVisibility(0);
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
        boolean z = requireArguments().getBoolean("arg-opening-hours-requested");
        kotlin.reflect.KProperty<?>[] kPropertyArr = zza;
        this.zzd.setValue(this, kPropertyArr[1], java.lang.Boolean.valueOf(z));
        int i = requireArguments().getInt("arg-theme-res-id");
        this.zzc.setValue(this, kPropertyArr[0], java.lang.Integer.valueOf(i));
        android.view.View inflate = layoutInflater.cloneInContext(new android.view.ContextThemeWrapper(getContext(), zzf())).inflate(com.google.android.libraries.places.R.layout.place_details_overview_fragment, viewGroup, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.view.View findViewById = view.findViewById(com.google.android.libraries.places.R.id.ev_charging_options);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.zzf = (androidx.recyclerview.widget.RecyclerView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.google.android.libraries.places.R.id.ev_chargers_availability_last_updated);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.zzg = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.google.android.libraries.places.R.id.fuel_options);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.zzh = (androidx.recyclerview.widget.RecyclerView) findViewById3;
        android.view.View findViewById4 = view.findViewById(com.google.android.libraries.places.R.id.stale_fuel_prices_message);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.zzi = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = view.findViewById(com.google.android.libraries.places.R.id.type_specific_info_divider);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.zzj = findViewById5;
        android.view.View findViewById6 = view.findViewById(com.google.android.libraries.places.R.id.address_text);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.zzk = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = view.findViewById(com.google.android.libraries.places.R.id.address_icon);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById7, "");
        this.zzl = (android.widget.ImageView) findViewById7;
        android.view.View findViewById8 = view.findViewById(com.google.android.libraries.places.R.id.phone_text);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById8, "");
        this.zzu = (android.widget.TextView) findViewById8;
        android.view.View findViewById9 = view.findViewById(com.google.android.libraries.places.R.id.phone_icon);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById9, "");
        this.zzv = (android.widget.ImageView) findViewById9;
        android.view.View findViewById10 = view.findViewById(com.google.android.libraries.places.R.id.website_text);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById10, "");
        this.zzs = (android.widget.TextView) findViewById10;
        android.view.View findViewById11 = view.findViewById(com.google.android.libraries.places.R.id.website_icon);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById11, "");
        this.zzt = (android.widget.ImageView) findViewById11;
        android.view.View findViewById12 = view.findViewById(com.google.android.libraries.places.R.id.plus_code_text);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById12, "");
        this.zzw = (android.widget.TextView) findViewById12;
        android.view.View findViewById13 = view.findViewById(com.google.android.libraries.places.R.id.plus_code_icon);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById13, "");
        this.zzx = (android.widget.ImageView) findViewById13;
        android.view.View findViewById14 = view.findViewById(com.google.android.libraries.places.R.id.open_status);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById14, "");
        this.zzm = (android.widget.TextView) findViewById14;
        android.view.View findViewById15 = view.findViewById(com.google.android.libraries.places.R.id.open_status_and_time_spacer);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById15, "");
        this.zzn = (android.widget.TextView) findViewById15;
        android.view.View findViewById16 = view.findViewById(com.google.android.libraries.places.R.id.next_open_or_close_time);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById16, "");
        this.zzo = (android.widget.TextView) findViewById16;
        android.view.View findViewById17 = view.findViewById(com.google.android.libraries.places.R.id.expand_open_hours);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById17, "");
        this.zzp = (android.widget.ImageView) findViewById17;
        android.view.View findViewById18 = view.findViewById(com.google.android.libraries.places.R.id.expanded_open_hours);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById18, "");
        this.zzq = (androidx.recyclerview.widget.RecyclerView) findViewById18;
        android.view.View findViewById19 = view.findViewById(com.google.android.libraries.places.R.id.open_hours_icon);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById19, "");
        this.zzr = (android.widget.ImageView) findViewById19;
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        this.zze = new com.google.android.libraries.places.widget.internal.placedetails.zzr(requireContext, zzf(), view);
        com.google.android.libraries.places.widget.internal.placedetails.zzbj zzbjVar = this.zzb;
        if (zzbjVar == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            zzbjVar = null;
        }
        zzbjVar.zza().observe(getViewLifecycleOwner(), new com.google.android.libraries.places.widget.internal.placedetails.zzam(new com.google.android.libraries.places.widget.internal.placedetails.zzal(this)));
    }
}
