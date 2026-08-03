package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbqe implements com.google.android.gms.internal.ads.zzbpq {
    private final com.google.android.gms.internal.ads.zzedo zza;

    public zzbqe(com.google.android.gms.internal.ads.zzedo zzedoVar) {
        this.zza = zzedoVar;
    }

    private static final android.os.Bundle zzb(java.util.Map map) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        if (map.containsKey("networkExtras")) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject((java.lang.String) map.get("networkExtras"));
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    java.lang.Object obj = jSONObject.get(next);
                    if (obj instanceof java.lang.String) {
                        bundle.putString(next, (java.lang.String) obj);
                    } else if (obj instanceof java.lang.Integer) {
                        bundle.putInt(next, ((java.lang.Integer) obj).intValue());
                    } else if (obj instanceof java.lang.Boolean) {
                        bundle.putBoolean(next, ((java.lang.Boolean) obj).booleanValue());
                    } else if (obj instanceof java.lang.Float) {
                        bundle.putFloat(next, ((java.lang.Float) obj).floatValue());
                    } else if (obj instanceof java.lang.Double) {
                        bundle.putDouble(next, ((java.lang.Double) obj).doubleValue());
                    } else if (obj instanceof java.lang.Long) {
                        bundle.putLong(next, ((java.lang.Long) obj).longValue());
                    }
                }
            } catch (org.json.JSONException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "OutOfContextTestingGmsgHandler.generateNetworkExtras");
            }
        }
        return bundle;
    }

    private static final java.util.List zzc(java.lang.String str, java.lang.String str2) {
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "OutOfContextTestingGmsgHandler.stringArrayToList.".concat(str2));
            return new java.util.ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.ads.AdRequest build;
        com.google.android.gms.ads.AdSize adSize;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkM)).booleanValue()) {
            com.google.android.gms.internal.ads.zzedp zzedpVar = new com.google.android.gms.internal.ads.zzedp();
            java.lang.String str = (java.lang.String) map.get("adUnitId");
            if (!android.text.TextUtils.isEmpty(str)) {
                zzedpVar.zzh(str);
            }
            java.lang.String str2 = (java.lang.String) map.get("format");
            if (!android.text.TextUtils.isEmpty(str2)) {
                zzedpVar.zzi(str2);
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkO)).booleanValue()) {
                boolean z = false;
                if (map.containsKey("isGamRequest") && ((java.lang.String) map.get("isGamRequest")).equals("1")) {
                    z = true;
                }
                zzedpVar.zzn(z);
                if (zzedpVar.zzg()) {
                    com.google.android.gms.ads.admanager.AdManagerAdRequest.Builder builder = new com.google.android.gms.ads.admanager.AdManagerAdRequest.Builder();
                    if (map.containsKey("keywords")) {
                        java.util.Iterator it = zzc((java.lang.String) map.get("keywords"), "keywords").iterator();
                        while (it.hasNext()) {
                            builder.addKeyword((java.lang.String) it.next());
                        }
                    }
                    builder.addNetworkExtrasBundle(com.google.ads.mediation.admob.AdMobAdapter.class, zzb(map));
                    if (map.containsKey("customTargeting")) {
                        try {
                            org.json.JSONObject jSONObject = new org.json.JSONObject((java.lang.String) map.get("customTargeting"));
                            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                java.lang.String next = keys.next();
                                builder.addCustomTargeting(next, jSONObject.getString(next));
                            }
                        } catch (org.json.JSONException e) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "OutOfContextTestingGmsgHandler.generateAdManagerAdRequest");
                        }
                    }
                    if (map.containsKey("contentUrl") && !android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get("contentUrl"))) {
                        builder.setContentUrl((java.lang.String) map.get("contentUrl"));
                    }
                    if (map.containsKey("neighboringContentUrlStrings")) {
                        builder.setNeighboringContentUrls(zzc((java.lang.String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                    }
                    if (map.containsKey("requestAgent")) {
                        builder.setRequestAgent((java.lang.String) map.get("requestAgent"));
                    }
                    if (map.containsKey("publisherProvidedId")) {
                        builder.setPublisherProvidedId((java.lang.String) map.get("publisherProvidedId"));
                    }
                    if (map.containsKey("categoryExclusions")) {
                        java.util.Iterator it2 = zzc((java.lang.String) map.get("categoryExclusions"), "categoryExclusions").iterator();
                        while (it2.hasNext()) {
                            builder.addCategoryExclusion((java.lang.String) it2.next());
                        }
                    }
                    build = builder.build();
                } else {
                    com.google.android.gms.ads.AdRequest.Builder builder2 = new com.google.android.gms.ads.AdRequest.Builder();
                    if (map.containsKey("keywords")) {
                        java.util.Iterator it3 = zzc((java.lang.String) map.get("keywords"), "keywords").iterator();
                        while (it3.hasNext()) {
                            builder2.addKeyword((java.lang.String) it3.next());
                        }
                    }
                    builder2.addNetworkExtrasBundle(com.google.ads.mediation.admob.AdMobAdapter.class, zzb(map));
                    if (map.containsKey("customTargeting")) {
                        try {
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject((java.lang.String) map.get("customTargeting"));
                            java.util.Iterator<java.lang.String> keys2 = jSONObject2.keys();
                            while (keys2.hasNext()) {
                                java.lang.String next2 = keys2.next();
                                builder2.addCustomTargeting(next2, jSONObject2.getString(next2));
                            }
                        } catch (org.json.JSONException e2) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "OutOfContextTestingGmsgHandler.generateAdMobAdRequest");
                        }
                    }
                    if (map.containsKey("contentUrl") && !android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get("contentUrl"))) {
                        builder2.setContentUrl((java.lang.String) map.get("contentUrl"));
                    }
                    if (map.containsKey("neighboringContentUrlStrings")) {
                        builder2.setNeighboringContentUrls(zzc((java.lang.String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                    }
                    if (map.containsKey("requestAgent")) {
                        builder2.setRequestAgent((java.lang.String) map.get("requestAgent"));
                    }
                    build = builder2.build();
                }
                zzedpVar.zzj(build);
                java.lang.String str3 = (java.lang.String) map.get("width");
                java.lang.String str4 = (java.lang.String) map.get("height");
                if (android.text.TextUtils.isEmpty(str3) || android.text.TextUtils.isEmpty(str4)) {
                    adSize = com.google.android.gms.ads.AdSize.BANNER;
                } else {
                    try {
                        adSize = new com.google.android.gms.ads.AdSize(java.lang.Integer.parseInt(str3), java.lang.Integer.parseInt(str4));
                    } catch (java.lang.NumberFormatException e3) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e3, "OutOfContextTestingGmsgHandler.generateAdSize");
                        adSize = com.google.android.gms.ads.AdSize.BANNER;
                    }
                }
                zzedpVar.zzk(adSize);
                if (map.containsKey("clickToExpandRequested") || map.containsKey("customControlsRequested") || map.containsKey("startMuted")) {
                    com.google.android.gms.ads.VideoOptions.Builder builder3 = new com.google.android.gms.ads.VideoOptions.Builder();
                    if (map.containsKey("startMuted")) {
                        builder3.setStartMuted(((java.lang.String) map.get("startMuted")).equals("1"));
                    }
                    if (map.containsKey("customControlsRequested")) {
                        builder3.setCustomControlsRequested(((java.lang.String) map.get("customControlsRequested")).equals("1"));
                    }
                    if (map.containsKey("clickToExpandRequested")) {
                        builder3.setClickToExpandRequested(((java.lang.String) map.get("clickToExpandRequested")).equals("1"));
                    }
                    zzedpVar.zzm(builder3.build());
                }
                if (map.containsKey("customMuteThisAdRequested") || map.containsKey("disableImageLoading") || map.containsKey("mediaAspectRatio") || map.containsKey("preferredAdChoicesPosition") || map.containsKey("shouldRequestMultipleImages") || (zzedpVar.zzf() != null && zzedpVar.zzb().equals("NATIVE"))) {
                    com.google.android.gms.ads.nativead.NativeAdOptions.Builder builder4 = new com.google.android.gms.ads.nativead.NativeAdOptions.Builder();
                    if (map.containsKey("disableImageLoading")) {
                        builder4.setReturnUrlsForImageAssets(((java.lang.String) map.get("disableImageLoading")).equals("1"));
                    }
                    if (map.containsKey("mediaAspectRatio")) {
                        java.lang.String str5 = (java.lang.String) map.get("mediaAspectRatio");
                        if (!android.text.TextUtils.isEmpty(str5)) {
                            try {
                                builder4.setMediaAspectRatio(java.lang.Integer.parseInt(str5));
                            } catch (java.lang.NumberFormatException e4) {
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.mediaAspectRatio");
                            }
                        }
                    }
                    if (map.containsKey("shouldRequestMultipleImages")) {
                        builder4.setRequestMultipleImages(((java.lang.String) map.get("shouldRequestMultipleImages")).equals("1"));
                    }
                    if (map.containsKey("preferredAdChoicesPosition")) {
                        java.lang.String str6 = (java.lang.String) map.get("preferredAdChoicesPosition");
                        if (!android.text.TextUtils.isEmpty(str6)) {
                            try {
                                builder4.setAdChoicesPlacement(java.lang.Integer.parseInt(str6));
                            } catch (java.lang.NumberFormatException e5) {
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e5, "OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.preferredAdChoicesPosition");
                            }
                        }
                    }
                    if (map.containsKey("customMuteThisAdRequested")) {
                        builder4.setRequestCustomMuteThisAd(((java.lang.String) map.get("customMuteThisAdRequested")).equals("1"));
                    }
                    com.google.android.gms.ads.VideoOptions zzf = zzedpVar.zzf();
                    if (zzf != null) {
                        builder4.setVideoOptions(zzf);
                    }
                    zzedpVar.zzl(builder4.build());
                }
            }
            java.lang.String str7 = (java.lang.String) map.get("action");
            if (android.text.TextUtils.isEmpty(str7) || android.text.TextUtils.isEmpty(zzedpVar.zza())) {
                return;
            }
            if (str7.equals("load") && !android.text.TextUtils.isEmpty(zzedpVar.zzb())) {
                this.zza.zzc(zzedpVar);
            } else if (str7.equals(com.ironsource.C3232q2.v)) {
                this.zza.zzd(zzedpVar.zza());
            }
        }
    }
}
