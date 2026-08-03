package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzelh implements com.google.android.gms.internal.ads.zzeli {
    static /* synthetic */ com.google.android.gms.internal.ads.zzeln zzl(java.lang.String str, java.lang.String str2, java.lang.String str3, com.google.android.gms.internal.ads.zzelj zzeljVar, java.lang.String str4, android.webkit.WebView webView, java.lang.String str5, java.lang.String str6, com.google.android.gms.internal.ads.zzelk zzelkVar) {
        com.google.android.gms.internal.ads.zzfuy zza = com.google.android.gms.internal.ads.zzfuy.zza("Google", str2);
        com.google.android.gms.internal.ads.zzfux zzn = zzn("javascript");
        com.google.android.gms.internal.ads.zzfup zzp = zzp(zzeljVar.toString());
        com.google.android.gms.internal.ads.zzfux zzfuxVar = com.google.android.gms.internal.ads.zzfux.NONE;
        if (zzn == zzfuxVar) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzp == null) {
            java.lang.String valueOf = java.lang.String.valueOf(zzeljVar);
            java.lang.String.valueOf(valueOf);
            java.lang.String valueOf2 = java.lang.String.valueOf(valueOf);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse creative type: ".concat(valueOf2));
            return null;
        }
        com.google.android.gms.internal.ads.zzfux zzn2 = zzn(str4);
        if (zzp != com.google.android.gms.internal.ads.zzfup.VIDEO || zzn2 != zzfuxVar) {
            com.google.android.gms.internal.ads.zzfum zza2 = com.google.android.gms.internal.ads.zzfum.zza(zza, webView, str5, "");
            return new com.google.android.gms.internal.ads.zzeln(com.google.android.gms.internal.ads.zzfuk.zze(com.google.android.gms.internal.ads.zzful.zza(zzp, zzo(zzelkVar.toString()), zzn, zzn2, true), zza2), zza2);
        }
        java.lang.String.valueOf(str4);
        java.lang.String valueOf3 = java.lang.String.valueOf(str4);
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Video events owner unknown for video creative: ".concat(valueOf3));
        return null;
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzeln zzm(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.google.android.gms.internal.ads.zzelj zzeljVar, android.webkit.WebView webView, java.lang.String str5, java.lang.String str6, com.google.android.gms.internal.ads.zzelk zzelkVar) {
        com.google.android.gms.internal.ads.zzfuy zza = com.google.android.gms.internal.ads.zzfuy.zza(str, str2);
        com.google.android.gms.internal.ads.zzfux zzn = zzn("javascript");
        com.google.android.gms.internal.ads.zzfux zzn2 = zzn(str4);
        com.google.android.gms.internal.ads.zzfup zzp = zzp(zzeljVar.toString());
        com.google.android.gms.internal.ads.zzfux zzfuxVar = com.google.android.gms.internal.ads.zzfux.NONE;
        if (zzn == zzfuxVar) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzp == null) {
            java.lang.String valueOf = java.lang.String.valueOf(zzeljVar);
            java.lang.String.valueOf(valueOf);
            java.lang.String valueOf2 = java.lang.String.valueOf(valueOf);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse creative type: ".concat(valueOf2));
            return null;
        }
        if (zzp != com.google.android.gms.internal.ads.zzfup.VIDEO || zzn2 != zzfuxVar) {
            com.google.android.gms.internal.ads.zzfum zzb = com.google.android.gms.internal.ads.zzfum.zzb(zza, webView, str5, "");
            return new com.google.android.gms.internal.ads.zzeln(com.google.android.gms.internal.ads.zzfuk.zze(com.google.android.gms.internal.ads.zzful.zza(zzp, zzo(zzelkVar.toString()), zzn, zzn2, true), zzb), zzb);
        }
        java.lang.String.valueOf(str4);
        java.lang.String valueOf3 = java.lang.String.valueOf(str4);
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Video events owner unknown for video creative: ".concat(valueOf3));
        return null;
    }

    private static com.google.android.gms.internal.ads.zzfux zzn(java.lang.String str) {
        return "native".equals(str) ? com.google.android.gms.internal.ads.zzfux.NATIVE : "javascript".equals(str) ? com.google.android.gms.internal.ads.zzfux.JAVASCRIPT : com.google.android.gms.internal.ads.zzfux.NONE;
    }

    private static com.google.android.gms.internal.ads.zzfus zzo(java.lang.String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c = 1;
            }
            c = 65535;
        }
        return c != 0 ? c != 1 ? c != 2 ? com.google.android.gms.internal.ads.zzfus.UNSPECIFIED : com.google.android.gms.internal.ads.zzfus.ONE_PIXEL : com.google.android.gms.internal.ads.zzfus.DEFINED_BY_JAVASCRIPT : com.google.android.gms.internal.ads.zzfus.BEGIN_TO_RENDER;
    }

    private static com.google.android.gms.internal.ads.zzfup zzp(java.lang.String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("video")) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0) {
            return com.google.android.gms.internal.ads.zzfup.HTML_DISPLAY;
        }
        if (c == 1) {
            return com.google.android.gms.internal.ads.zzfup.NATIVE_DISPLAY;
        }
        if (c != 2) {
            return null;
        }
        return com.google.android.gms.internal.ads.zzfup.VIDEO;
    }

    private static final java.lang.Object zzq(com.google.android.gms.internal.ads.zzelg zzelgVar) {
        try {
            return zzelgVar.zza();
        } catch (java.lang.RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "omid exception");
            return null;
        }
    }

    private static final void zzr(java.lang.Runnable runnable) {
        try {
            runnable.run();
        } catch (java.lang.RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeli
    public final boolean zza(final android.content.Context context) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgk)).booleanValue()) {
            java.lang.Boolean bool = (java.lang.Boolean) zzq(new com.google.android.gms.internal.ads.zzelg() { // from class: com.google.android.gms.internal.ads.zzelf
                @Override // com.google.android.gms.internal.ads.zzelg
                public final /* synthetic */ java.lang.Object zza() {
                    if (com.google.android.gms.internal.ads.zzfui.zzb()) {
                        return true;
                    }
                    com.google.android.gms.internal.ads.zzfui.zza(context);
                    return java.lang.Boolean.valueOf(com.google.android.gms.internal.ads.zzfui.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzeli
    public final java.lang.String zzb(android.content.Context context) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgk)).booleanValue()) {
            return (java.lang.String) zzq(com.google.android.gms.internal.ads.zzekw.zza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzeli
    public final com.google.android.gms.internal.ads.zzeln zzc(final java.lang.String str, final android.webkit.WebView webView, java.lang.String str2, java.lang.String str3, final java.lang.String str4, final com.google.android.gms.internal.ads.zzelk zzelkVar, final com.google.android.gms.internal.ads.zzelj zzeljVar, final java.lang.String str5) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgk)).booleanValue() || !com.google.android.gms.internal.ads.zzfui.zzb()) {
            return null;
        }
        final java.lang.String str6 = "javascript";
        final java.lang.String str7 = "Google";
        final java.lang.String str8 = "";
        return (com.google.android.gms.internal.ads.zzeln) zzq(new com.google.android.gms.internal.ads.zzelg(str7, str, str6, zzeljVar, str4, webView, str5, str8, zzelkVar) { // from class: com.google.android.gms.internal.ads.zzekx
            private final /* synthetic */ java.lang.String zzb;
            private final /* synthetic */ com.google.android.gms.internal.ads.zzelj zzd;
            private final /* synthetic */ java.lang.String zze;
            private final /* synthetic */ android.webkit.WebView zzf;
            private final /* synthetic */ java.lang.String zzg;
            private final /* synthetic */ com.google.android.gms.internal.ads.zzelk zzi;
            private final /* synthetic */ java.lang.String zza = "Google";
            private final /* synthetic */ java.lang.String zzc = "javascript";
            private final /* synthetic */ java.lang.String zzh = "";

            {
                this.zzb = str;
                this.zzd = zzeljVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzelkVar;
            }

            @Override // com.google.android.gms.internal.ads.zzelg
            public final /* synthetic */ java.lang.Object zza() {
                return com.google.android.gms.internal.ads.zzelh.zzl(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeli
    public final com.google.android.gms.internal.ads.zzeln zzd(final java.lang.String str, final android.webkit.WebView webView, java.lang.String str2, java.lang.String str3, final java.lang.String str4, final java.lang.String str5, final com.google.android.gms.internal.ads.zzelk zzelkVar, final com.google.android.gms.internal.ads.zzelj zzeljVar, final java.lang.String str6) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgk)).booleanValue() || !com.google.android.gms.internal.ads.zzfui.zzb()) {
            return null;
        }
        final java.lang.String str7 = "";
        final java.lang.String str8 = "javascript";
        return (com.google.android.gms.internal.ads.zzeln) zzq(new com.google.android.gms.internal.ads.zzelg(str5, str, str8, str4, zzeljVar, webView, str6, str7, zzelkVar) { // from class: com.google.android.gms.internal.ads.zzeky
            private final /* synthetic */ java.lang.String zza;
            private final /* synthetic */ java.lang.String zzb;
            private final /* synthetic */ java.lang.String zzd;
            private final /* synthetic */ com.google.android.gms.internal.ads.zzelj zze;
            private final /* synthetic */ android.webkit.WebView zzf;
            private final /* synthetic */ java.lang.String zzg;
            private final /* synthetic */ com.google.android.gms.internal.ads.zzelk zzi;
            private final /* synthetic */ java.lang.String zzc = "javascript";
            private final /* synthetic */ java.lang.String zzh = "";

            {
                this.zzd = str4;
                this.zze = zzeljVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzelkVar;
            }

            @Override // com.google.android.gms.internal.ads.zzelg
            public final /* synthetic */ java.lang.Object zza() {
                return com.google.android.gms.internal.ads.zzelh.zzm(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeli
    public final void zze(final com.google.android.gms.internal.ads.zzfuk zzfukVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgk)).booleanValue() && com.google.android.gms.internal.ads.zzfui.zzb()) {
            java.util.Objects.requireNonNull(zzfukVar);
            zzr(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzekv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzfuk.this.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeli
    public final void zzf(final com.google.android.gms.internal.ads.zzfuk zzfukVar) {
        zzr(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzekz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgk)).booleanValue() && com.google.android.gms.internal.ads.zzfui.zzb()) {
                    com.google.android.gms.internal.ads.zzfuk.this.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeli
    public final void zzg(final com.google.android.gms.internal.ads.zzfuk zzfukVar, final android.view.View view) {
        zzr(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzela
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgk)).booleanValue() && com.google.android.gms.internal.ads.zzfui.zzb()) {
                    com.google.android.gms.internal.ads.zzfuk.this.zzd(view, com.google.android.gms.internal.ads.zzfur.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeli
    public final void zzh(final com.google.android.gms.internal.ads.zzfuk zzfukVar, final android.view.View view) {
        zzr(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzelb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgk)).booleanValue() && com.google.android.gms.internal.ads.zzfui.zzb()) {
                    com.google.android.gms.internal.ads.zzfuk.this.zzb(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeli
    public final com.google.android.gms.internal.ads.zzfuw zzi(final com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, final android.webkit.WebView webView, boolean z) {
        final boolean z2 = true;
        return (com.google.android.gms.internal.ads.zzfuw) zzq(new com.google.android.gms.internal.ads.zzelg(webView, z2) { // from class: com.google.android.gms.internal.ads.zzelc
            private final /* synthetic */ android.webkit.WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzelg
            public final /* synthetic */ java.lang.Object zza() {
                com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel2 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.this;
                int i = versionInfoParcel2.buddyApkVersion;
                int i2 = versionInfoParcel2.clientJarVersion;
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 1 + java.lang.String.valueOf(i2).length());
                sb.append(i);
                sb.append(".");
                sb.append(i2);
                return com.google.android.gms.internal.ads.zzfuw.zza(com.google.android.gms.internal.ads.zzfuy.zza("Google", sb.toString()), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeli
    public final void zzj(final com.google.android.gms.internal.ads.zzfuw zzfuwVar, final com.google.android.gms.internal.ads.zzfuv zzfuvVar) {
        zzr(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzeld
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzfuw.this.zzb(zzfuvVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeli
    public final void zzk(final com.google.android.gms.internal.ads.zzfuw zzfuwVar, final android.view.View view) {
        zzr(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzele
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzfuw.this.zzd(view, com.google.android.gms.internal.ads.zzfur.NOT_VISIBLE, "Ad overlay");
            }
        });
    }
}
