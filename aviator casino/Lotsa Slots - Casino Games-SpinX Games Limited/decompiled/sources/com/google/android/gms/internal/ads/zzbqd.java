package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbqd implements com.google.android.gms.internal.ads.zzbpq {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final com.google.android.gms.internal.ads.zzdzl zzb;
    private final com.google.android.gms.internal.ads.zzbya zzd;
    private final com.google.android.gms.internal.ads.zzekg zze;
    private final com.google.android.gms.internal.ads.zzctj zzf;
    private final com.google.android.gms.internal.ads.zzdbs zzg;
    private com.google.android.gms.ads.internal.util.client.zzu zzc = null;
    private com.google.android.gms.ads.internal.overlay.zzaa zzh = null;
    private final com.google.android.gms.internal.ads.zzhcg zzi = com.google.android.gms.internal.ads.zzcfr.zzh;

    public zzbqd(com.google.android.gms.ads.internal.zzb zzbVar, com.google.android.gms.internal.ads.zzbya zzbyaVar, com.google.android.gms.internal.ads.zzekg zzekgVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar, com.google.android.gms.internal.ads.zzctj zzctjVar, com.google.android.gms.internal.ads.zzdbs zzdbsVar) {
        this.zza = zzbVar;
        this.zzd = zzbyaVar;
        this.zze = zzekgVar;
        this.zzb = zzdzlVar;
        this.zzf = zzctjVar;
        this.zzg = zzdbsVar;
    }

    public static boolean zzb(java.util.Map map) {
        return "1".equals(map.get("custom_close"));
    }

    public static int zzc(java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if (androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE.equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    static android.net.Uri zzd(android.content.Context context, com.google.android.gms.internal.ads.zzbap zzbapVar, android.net.Uri uri, android.view.View view, android.app.Activity activity, com.google.android.gms.internal.ads.zzflc zzflcVar) {
        if (zzbapVar == null) {
            return uri;
        }
        try {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznw)).booleanValue() || zzflcVar == null) {
                if (zzbapVar.zze(uri)) {
                    uri = zzbapVar.zzd(uri, context, view, activity);
                }
            } else if (zzbapVar.zze(uri)) {
                uri = zzflcVar.zza(uri, context, view, activity);
            }
        } catch (com.google.android.gms.internal.ads.zzbaq unused) {
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
        }
        return uri;
    }

    static android.net.Uri zze(android.net.Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", java.lang.String.valueOf(android.os.SystemClock.uptimeMillis())).build();
            }
        } catch (java.lang.UnsupportedOperationException e) {
            java.lang.String uri2 = uri.toString();
            java.lang.String.valueOf(uri2);
            java.lang.String valueOf = java.lang.String.valueOf(uri2);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error adding click uptime parameter to url: ".concat(valueOf), e);
        }
        return uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0153, code lost:
    
        if (r0.getPackageName().equals(r1) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0177, code lost:
    
        zzl(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017e, code lost:
    
        if (android.text.TextUtils.isEmpty(r30) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0180, code lost:
    
        r0 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot open browser with null or empty url");
        zzm(7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x018b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x018c, code lost:
    
        r0 = zze(zzd(r10.getContext(), r10.zzS(), android.net.Uri.parse(r30), r10.zzE(), r10.zzj(), r10.zzT()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01ac, code lost:
    
        if (r12 == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b0, code lost:
    
        if (r29.zze == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01be, code lost:
    
        if (zzi(r31, r10.getContext(), r0.toString(), r13) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01c2, code lost:
    
        r29.zzh = new com.google.android.gms.internal.ads.zzbqa(r29);
        r1 = (com.google.android.gms.internal.ads.zzcmk) r31;
        r18 = r0.toString();
        r3 = r29.zzh;
        r4 = new android.os.Bundle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01e9, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfF)).booleanValue() == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f3, code lost:
    
        if (r32.containsKey("cct_init_h") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01f5, code lost:
    
        r4.putInt(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, java.lang.Integer.parseInt((java.lang.String) r32.get("cct_init_h")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0205, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0206, code lost:
    
        com.google.android.gms.ads.internal.util.zze.zzb("Invalid cct initial height parameter.", r0);
        com.google.android.gms.ads.internal.zzt.zzh().zzg(r0, "OpenGmsgHandler.getChromeCustomTabConfigBundle");
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x015a, code lost:
    
        if (com.google.android.gms.internal.ads.zzbjr.zza(r0) == false) goto L58;
     */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(java.lang.String str, com.google.android.gms.ads.internal.client.zza zzaVar, java.util.Map map, java.lang.String str2) {
        java.lang.String str3;
        boolean z;
        java.util.HashMap hashMap;
        java.lang.Object obj;
        java.lang.Object obj2;
        boolean z2;
        com.google.android.gms.internal.ads.zzdbs zzdbsVar;
        com.google.android.gms.internal.ads.zzcmk zzcmkVar;
        java.lang.String uri;
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar;
        android.os.Bundle bundle;
        com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) zzaVar;
        com.google.android.gms.internal.ads.zzfkf zzC = zzckuVar.zzC();
        com.google.android.gms.internal.ads.zzfki zzaC = zzckuVar.zzaC();
        boolean z3 = false;
        if (zzC == null || zzaC == null) {
            str3 = "";
            z = false;
        } else {
            java.lang.String str4 = zzaC.zzb;
            z = zzC.zzb();
            str3 = str4;
        }
        boolean z4 = (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmf)).booleanValue() && map.containsKey("sc") && ((java.lang.String) map.get("sc")).equals("0")) ? false : true;
        boolean z5 = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzok)).booleanValue() && map.containsKey("ig_cl") && ((java.lang.String) map.get("ig_cl")).equals("true");
        if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.e.equalsIgnoreCase(str2)) {
            if (zzckuVar.zzW()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzl(false);
                ((com.google.android.gms.internal.ads.zzcmk) zzaVar).zzaI(zzb(map), zzc(map), z4);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            zzl(false);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzns)).booleanValue() && java.util.Objects.equals(map.get("is_allowed_for_lock_screen"), "1")) {
                z3 = true;
            }
            if (str != null) {
                ((com.google.android.gms.internal.ads.zzcmk) zzaVar).zzaJ(zzb(map), zzc(map), str, z4, z3);
                return;
            } else {
                ((com.google.android.gms.internal.ads.zzcmk) zzaVar).zzaK(zzb(map), zzc(map), (java.lang.String) map.get("html"), (java.lang.String) map.get("baseurl"), z4);
                return;
            }
        }
        android.content.Intent intent = null;
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            android.content.Context context = zzckuVar.getContext();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfG)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                zzg(10);
            } else if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfA)).booleanValue()) {
                int i2 = com.google.android.gms.internal.ads.zzbjp.zza;
                java.lang.String packageName = androidx.browser.customtabs.CustomTabsClient.getPackageName(context, null);
                if (packageName != null) {
                }
                zzg(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzk(zzaVar, map, z, str3, z4, z5);
            return;
        }
        if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((java.lang.String) map.get("system_browser"))) {
            zzk(zzaVar, map, z, str3, z4, z5);
            return;
        }
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjy)).booleanValue()) {
                zzl(true);
                java.lang.String str5 = (java.lang.String) map.get("p");
                if (str5 == null) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Package name missing from open app action.");
                    return;
                }
                if (z && this.zze != null && zzi(zzaVar, zzckuVar.getContext(), str5, str3)) {
                    return;
                }
                android.content.pm.PackageManager packageManager = zzckuVar.getContext().getPackageManager();
                if (packageManager == null) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot get package manager from open app action.");
                    return;
                } else {
                    android.content.Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                    if (launchIntentForPackage != null) {
                        ((com.google.android.gms.internal.ads.zzcmk) zzaVar).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzh), z4, z5, str3);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        zzl(true);
        java.lang.String str6 = (java.lang.String) map.get("intent_url");
        if (!android.text.TextUtils.isEmpty(str6)) {
            try {
                intent = android.content.Intent.parseUri(str6, 0);
            } catch (java.net.URISyntaxException e) {
                java.lang.String.valueOf(str6);
                java.lang.String valueOf = java.lang.String.valueOf(str6);
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the url: ".concat(valueOf), e);
            }
        }
        android.content.Intent intent2 = intent;
        if (intent2 != null && intent2.getData() != null) {
            android.net.Uri data = intent2.getData();
            if (!android.net.Uri.EMPTY.equals(data)) {
                android.net.Uri zze = zze(zzd(zzckuVar.getContext(), zzckuVar.zzS(), data, zzckuVar.zzE(), zzckuVar.zzj(), zzckuVar.zzT()));
                if (!android.text.TextUtils.isEmpty(intent2.getType())) {
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjz)).booleanValue()) {
                        intent2.setDataAndType(zze, intent2.getType());
                    }
                }
                intent2.setData(zze);
            }
        }
        boolean z6 = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjU)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzop)).booleanValue() && (zzdbsVar = this.zzg) != null) {
            zzdbsVar.zzl();
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (z6) {
            hashMap = hashMap2;
            obj2 = "p";
            obj = "event_id";
            this.zzh = new com.google.android.gms.internal.ads.zzbqb(this, z4, zzaVar, hashMap, map);
            z2 = false;
        } else {
            hashMap = hashMap2;
            obj = "event_id";
            obj2 = "p";
            z2 = z4;
        }
        if (intent2 != null) {
            if (!z || this.zze == null || !zzi(zzaVar, zzckuVar.getContext(), intent2.getData().toString(), str3)) {
                ((com.google.android.gms.internal.ads.zzcmk) zzaVar).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(intent2, this.zzh), z2, z5, str3);
                return;
            } else {
                if (z6) {
                    java.util.HashMap hashMap3 = hashMap;
                    hashMap3.put((java.lang.String) map.get(obj), true);
                    ((com.google.android.gms.internal.ads.zzbsm) zzaVar).zze("openIntentAsync", hashMap3);
                    return;
                }
                return;
            }
        }
        java.util.HashMap hashMap4 = hashMap;
        java.lang.String uri2 = !android.text.TextUtils.isEmpty(str) ? zze(zzd(zzckuVar.getContext(), zzckuVar.zzS(), android.net.Uri.parse(str), zzckuVar.zzE(), zzckuVar.zzj(), zzckuVar.zzT())).toString() : str;
        if (!z || this.zze == null || !zzi(zzaVar, zzckuVar.getContext(), uri2, str3)) {
            ((com.google.android.gms.internal.ads.zzcmk) zzaVar).zzaH(new com.google.android.gms.ads.internal.overlay.zzc((java.lang.String) map.get(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT), uri2, (java.lang.String) map.get(com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_MALE), (java.lang.String) map.get(obj2), (java.lang.String) map.get("c"), (java.lang.String) map.get(com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_FEMALE), (java.lang.String) map.get("e"), this.zzh), z2, z5, str3);
            return;
        } else {
            if (z6) {
                hashMap4.put((java.lang.String) map.get(obj), true);
                ((com.google.android.gms.internal.ads.zzbsm) zzaVar).zze("openIntentAsync", hashMap4);
                return;
            }
            return;
        }
        if (map.containsKey("cct_bp")) {
            try {
                bundle.putInt("cbp", java.lang.Integer.parseInt((java.lang.String) map.get("cct_bp")));
            } catch (java.lang.NumberFormatException e2) {
                com.google.android.gms.ads.internal.util.zze.zzb("Invalid cct close button position parameter.", e2);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "OpenGmsgHandler.getChromeCustomTabConfigBundle");
            }
        }
        zzcmkVar.zzaH(new com.google.android.gms.ads.internal.overlay.zzc(null, uri, null, null, null, null, null, null, com.google.android.gms.dynamic.ObjectWrapper.wrap(zzaaVar).asBinder(), true, bundle), z4, z5, str3);
        zzcmkVar.zzaH(new com.google.android.gms.ads.internal.overlay.zzc(null, uri, null, null, null, null, null, null, com.google.android.gms.dynamic.ObjectWrapper.wrap(zzaaVar).asBinder(), true, bundle), z4, z5, str3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjO)).booleanValue() != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjJ)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjI)).booleanValue()) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzi(com.google.android.gms.ads.internal.client.zza zzaVar, android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzbzh zzbzhVar;
        com.google.android.gms.ads.internal.util.client.zzw zzwVar;
        com.google.android.gms.internal.ads.zzdzl zzdzlVar = this.zzb;
        if (zzdzlVar != null) {
            com.google.android.gms.internal.ads.zzekr.zzd(context, zzdzlVar, this.zze, str2, "offline_open");
        }
        if (com.google.android.gms.ads.internal.zzt.zzh().zzs(context)) {
            if (this.zzc == null) {
                this.zzc = new com.google.android.gms.ads.internal.util.client.zzu(context.getApplicationContext(), null);
            }
            this.zze.zzc(this.zzc, str2);
            return false;
        }
        com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) zzaVar;
        com.google.android.gms.internal.ads.zzfkf zzC = zzckuVar.zzC();
        boolean z = (zzC == null || (zzwVar = zzC.zzay) == null || zzwVar.zzc()) ? false : true;
        boolean z2 = (zzC == null || (zzbzhVar = zzC.zzad) == null || !zzbzhVar.zza || zzbzhVar.zzb == null || !zzbzhVar.zzc) ? false : true;
        if (!z) {
            if (z2) {
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzbo zzC2 = com.google.android.gms.ads.internal.util.zzs.zzC(context);
            com.google.android.gms.ads.internal.zzt.zzc();
            boolean areNotificationsEnabled = androidx.core.app.NotificationManagerCompat.from(context).areNotificationsEnabled();
            boolean zzh = com.google.android.gms.ads.internal.zzt.zzf().zzh(context, "offline_notification_channel");
            boolean z3 = zzckuVar.zzN().zzg() && zzckuVar.zzj() == null;
            if (!areNotificationsEnabled) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (!androidx.core.app.NotificationManagerCompat.from(context).areNotificationsEnabled()) {
                }
                zzj(context, str2, "notifications_disabled");
                return false;
            }
            if (zzh) {
                zzj(context, str2, "notification_channel_disabled");
                return false;
            }
            if (zzC2 == null) {
                zzj(context, str2, "work_manager_unavailable");
                return false;
            }
            if (z3) {
                zzj(context, str2, "ad_no_activity");
                return false;
            }
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjG)).booleanValue()) {
                zzj(context, str2, "notification_flow_disabled");
                return false;
            }
            if (zzckuVar.zzL() == null || zzckuVar.zzj() == null) {
                ((com.google.android.gms.internal.ads.zzcmk) zzaVar).zzaL(str2, str, 14);
            } else {
                com.google.android.gms.internal.ads.zzeks zze = com.google.android.gms.internal.ads.zzekt.zze();
                zze.zza(zzckuVar.zzj());
                zze.zzb(null);
                zze.zzc(str2);
                zze.zzd(str);
                try {
                    zzckuVar.zzL().zzG(zze.zze());
                } catch (java.lang.Exception e) {
                    zzj(context, str2, e.getMessage());
                    return false;
                }
            }
            zzaVar.onAdClicked();
            return true;
        }
        com.google.android.gms.internal.ads.zzdzl zzdzlVar2 = this.zzb;
        if (zzdzlVar2 != null) {
            com.google.android.gms.internal.ads.zzekr.zzd(context, zzdzlVar2, this.zze, str2, "onfs");
        }
        return false;
    }

    private final void zzj(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzekg zzekgVar = this.zze;
        zzekgVar.zzd(str);
        com.google.android.gms.internal.ads.zzdzl zzdzlVar = this.zzb;
        if (zzdzlVar != null) {
            com.google.android.gms.internal.ads.zzekr.zzk(context, zzdzlVar, zzekgVar, str, "dialog_not_shown", com.google.android.gms.internal.ads.zzgwp.zzb("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0108, code lost:
    
        if (com.google.android.gms.internal.ads.zzbqc.zzb(r2, r12, r13, r14, r15) == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0157, code lost:
    
        r22 = r7;
        r11 = r16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzk(com.google.android.gms.ads.internal.client.zza zzaVar, java.util.Map map, boolean z, java.lang.String str, boolean z2, boolean z3) {
        android.content.Intent intent;
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        android.content.pm.ResolveInfo zzb;
        com.google.android.gms.ads.internal.client.zza zzaVar2;
        boolean z4 = true;
        zzl(true);
        com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) zzaVar;
        android.content.Context context = zzckuVar.getContext();
        com.google.android.gms.internal.ads.zzbap zzS = zzckuVar.zzS();
        android.view.View zzE = zzckuVar.zzE();
        com.google.android.gms.internal.ads.zzflc zzT = zzckuVar.zzT();
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
        java.lang.String str2 = (java.lang.String) map.get("u");
        android.content.Intent intent2 = null;
        android.net.Uri build = null;
        try {
            if (!android.text.TextUtils.isEmpty(str2)) {
                android.net.Uri zze = zze(zzd(context, zzS, android.net.Uri.parse(str2), zzE, null, zzT));
                boolean parseBoolean = java.lang.Boolean.parseBoolean((java.lang.String) map.get("use_first_package"));
                boolean parseBoolean2 = java.lang.Boolean.parseBoolean((java.lang.String) map.get("use_running_process"));
                if (!java.lang.Boolean.parseBoolean((java.lang.String) map.get("use_custom_tabs"))) {
                    if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfw)).booleanValue()) {
                        z4 = false;
                    }
                }
                if (androidx.webkit.ProxyConfig.MATCH_HTTP.equalsIgnoreCase(zze.getScheme())) {
                    build = zze.buildUpon().scheme("https").build();
                } else if ("https".equalsIgnoreCase(zze.getScheme())) {
                    build = zze.buildUpon().scheme(androidx.webkit.ProxyConfig.MATCH_HTTP).build();
                }
                android.net.Uri uri = build;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                android.content.Intent zza = com.google.android.gms.internal.ads.zzbqc.zza(zze, context, zzS, zzE, zzT);
                android.content.Intent zza2 = com.google.android.gms.internal.ads.zzbqc.zza(uri, context, zzS, zzE, zzT);
                if (z4) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zzq(context, zza);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zzq(context, zza2);
                }
                java.util.ArrayList arrayList2 = arrayList;
                android.content.pm.ResolveInfo zzc = com.google.android.gms.internal.ads.zzbqc.zzc(zza, arrayList, context, zzS, zzE, zzT);
                if (zzc == null) {
                    if (zza2 != null && (zzb = com.google.android.gms.internal.ads.zzbqc.zzb(zza2, context, zzS, zzE, zzT)) != null) {
                        intent = com.google.android.gms.internal.ads.zzbqc.zzd(zza, zzb, context, zzS, zzE, zzT);
                    }
                    if (!arrayList2.isEmpty()) {
                        if (parseBoolean2 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                            int size = arrayList2.size();
                            int i = 0;
                            loop0: while (i < size) {
                                java.util.ArrayList arrayList3 = arrayList2;
                                android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) arrayList3.get(i);
                                java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                                do {
                                    int i2 = i + 1;
                                    if (it.hasNext()) {
                                    }
                                } while (!it.next().processName.equals(resolveInfo.activityInfo.packageName));
                                intent2 = com.google.android.gms.internal.ads.zzbqc.zzd(zza, resolveInfo, context, zzS, zzE, zzT);
                                break loop0;
                            }
                        }
                        java.util.ArrayList arrayList4 = arrayList2;
                        if (parseBoolean) {
                            intent2 = com.google.android.gms.internal.ads.zzbqc.zzd(zza, (android.content.pm.ResolveInfo) arrayList4.get(0), context, zzS, zzE, zzT);
                        }
                    }
                    intent = zza;
                    if (z || this.zze == null || intent == null) {
                        zzaVar2 = zzaVar;
                    } else {
                        zzaVar2 = zzaVar;
                        if (zzi(zzaVar2, zzckuVar.getContext(), intent.getData().toString(), str)) {
                            return;
                        }
                    }
                    ((com.google.android.gms.internal.ads.zzcmk) zzaVar2).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(intent, this.zzh), z2, z3, str);
                    return;
                }
                intent2 = com.google.android.gms.internal.ads.zzbqc.zzd(zza, zzc, context, zzS, zzE, zzT);
            }
            ((com.google.android.gms.internal.ads.zzcmk) zzaVar2).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(intent, this.zzh), z2, z3, str);
            return;
        } catch (android.content.ActivityNotFoundException e) {
            java.lang.String message = e.getMessage();
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            return;
        }
        intent = intent2;
        if (z) {
        }
        zzaVar2 = zzaVar;
    }

    private final void zzl(boolean z) {
        com.google.android.gms.internal.ads.zzbya zzbyaVar = this.zzd;
        if (zzbyaVar != null) {
            zzbyaVar.zzb(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzg(int i) {
        com.google.android.gms.internal.ads.zzdzl zzdzlVar;
        java.lang.String str;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfz)).booleanValue() || (zzdzlVar = this.zzb) == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzdzk zza = zzdzlVar.zza();
        zza.zzc("action", "cct_action");
        switch (i) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        zza.zzc("cct_open_status", str);
        zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzctj zzctjVar;
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        java.lang.String str = (java.lang.String) map.get("u");
        java.util.Map hashMap = new java.util.HashMap();
        com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) zzaVar;
        if (zzckuVar.zzC() != null) {
            hashMap = zzckuVar.zzC().zzaw;
        }
        java.lang.String zza = com.google.android.gms.internal.ads.zzceb.zza(str, zzckuVar.getContext(), true, hashMap);
        java.lang.String str2 = (java.lang.String) map.get("a");
        if (str2 == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar == null || zzbVar.zzb()) {
            com.google.android.gms.internal.ads.zzhbw.zzr((((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlw)).booleanValue() && (zzctjVar = this.zzf) != null && com.google.android.gms.internal.ads.zzctj.zzc(zza)) ? zzctjVar.zzb(zza, com.google.android.gms.ads.internal.client.zzay.zzh()) : com.google.android.gms.internal.ads.zzhbw.zza(zza), new com.google.android.gms.internal.ads.zzbpz(this, map, zzaVar, str2), this.zzi);
        } else {
            zzbVar.zzc(zza);
        }
    }
}
