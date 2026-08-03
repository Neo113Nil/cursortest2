package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgrr {
    public static final /* synthetic */ int zzb = 0;
    private static final com.google.android.gms.internal.ads.zzgsj zzc = new com.google.android.gms.internal.ads.zzgsj("OverlayDisplayService");
    private static final android.content.Intent zzd = new android.content.Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    final com.google.android.gms.internal.ads.zzgsi zza;
    private final java.lang.String zze;

    zzgrr(android.content.Context context) {
        if (com.google.android.gms.internal.ads.zzgsl.zza(context)) {
            this.zza = new com.google.android.gms.internal.ads.zzgsi(context.getApplicationContext(), zzc, "OverlayDisplayService", zzd, com.google.android.gms.internal.ads.zzgrc.zza);
        } else {
            this.zza = null;
        }
        this.zze = context.getPackageName();
    }

    private static boolean zzh(java.lang.String str) {
        return com.google.android.gms.internal.ads.zzgua.zza(str).trim().isEmpty();
    }

    private static void zzi(java.lang.String str, com.google.android.gms.internal.ads.zzgrq zzgrqVar) {
        if (zzh(str)) {
            return;
        }
        str.getClass();
        zzgrqVar.zza(str.trim());
    }

    private static boolean zzj(com.google.android.gms.internal.ads.zzgrw zzgrwVar, java.lang.String str, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!zzh((java.lang.String) it.next())) {
                return true;
            }
        }
        zzc.zzc(str, new java.lang.Object[0]);
        com.google.android.gms.internal.ads.zzgru zzd2 = com.google.android.gms.internal.ads.zzgrv.zzd();
        zzd2.zzc(0);
        zzd2.zza(8160);
        zzgrwVar.zza(zzd2.zzd());
        return false;
    }

    final void zza(final com.google.android.gms.internal.ads.zzgrt zzgrtVar, final com.google.android.gms.internal.ads.zzgrw zzgrwVar) {
        com.google.android.gms.internal.ads.zzgsi zzgsiVar = this.zza;
        if (zzgsiVar == null) {
            zzc.zzc("error: %s", "Play Store not found.");
        } else if (zzj(zzgrwVar, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", java.util.Arrays.asList(null, zzgrtVar.zzb()))) {
            zzgsiVar.zza(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzgro
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzgrr.this.zze(zzgrtVar, zzgrwVar);
                }
            });
        }
    }

    final void zzb(final com.google.android.gms.internal.ads.zzgqy zzgqyVar, final com.google.android.gms.internal.ads.zzgrw zzgrwVar) {
        com.google.android.gms.internal.ads.zzgsi zzgsiVar = this.zza;
        if (zzgsiVar == null) {
            zzc.zzc("error: %s", "Play Store not found.");
        } else if (zzj(zzgrwVar, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", java.util.Arrays.asList(zzgqyVar.zza(), zzgqyVar.zzb()))) {
            zzgsiVar.zza(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzgrd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzgrr.this.zzf(zzgqyVar, zzgrwVar);
                }
            });
        }
    }

    final void zzc(final com.google.android.gms.internal.ads.zzgry zzgryVar, final com.google.android.gms.internal.ads.zzgrw zzgrwVar, final int i) {
        com.google.android.gms.internal.ads.zzgsi zzgsiVar = this.zza;
        if (zzgsiVar == null) {
            zzc.zzc("error: %s", "Play Store not found.");
        } else if (zzj(zzgrwVar, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", java.util.Arrays.asList(zzgryVar.zza(), zzgryVar.zzb()))) {
            zzgsiVar.zza(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzgrf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzgrr.this.zzg(zzgryVar, i, zzgrwVar);
                }
            });
        }
    }

    final void zzd() {
        com.google.android.gms.internal.ads.zzgsi zzgsiVar = this.zza;
        if (zzgsiVar == null) {
            return;
        }
        zzc.zza("unbind LMD display overlay service", new java.lang.Object[0]);
        zzgsiVar.zzb();
    }

    final /* synthetic */ void zze(com.google.android.gms.internal.ads.zzgrt zzgrtVar, com.google.android.gms.internal.ads.zzgrw zzgrwVar) {
        try {
            com.google.android.gms.internal.ads.zzgsi zzgsiVar = this.zza;
            zzgsiVar.getClass();
            com.google.android.gms.internal.ads.zzgsi zzgsiVar2 = zzgsiVar;
            com.google.android.gms.internal.ads.zzgqm zzgqmVar = (com.google.android.gms.internal.ads.zzgqm) zzgsiVar.zzc();
            if (zzgqmVar == null) {
                return;
            }
            java.lang.String str = this.zze;
            final android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("callerPackage", str);
            bundle.putBinder("windowToken", zzgrtVar.zza());
            zzi(zzgrtVar.zzj(), new com.google.android.gms.internal.ads.zzgrq() { // from class: com.google.android.gms.internal.ads.zzgrg
                @Override // com.google.android.gms.internal.ads.zzgrq
                public final /* synthetic */ void zza(java.lang.String str2) {
                    int i = com.google.android.gms.internal.ads.zzgrr.zzb;
                    bundle.putString("adFieldEnifd", str2);
                }
            });
            bundle.putInt("layoutGravity", zzgrtVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzgrtVar.zzd());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt("windowWidthPx", zzgrtVar.zzh());
            zzi(null, new com.google.android.gms.internal.ads.zzgrq() { // from class: com.google.android.gms.internal.ads.zzgrh
                @Override // com.google.android.gms.internal.ads.zzgrq
                public final /* synthetic */ void zza(java.lang.String str2) {
                    int i = com.google.android.gms.internal.ads.zzgrr.zzb;
                    bundle.putString("deeplinkUrl", str2);
                }
            });
            zzi(null, new com.google.android.gms.internal.ads.zzgrq() { // from class: com.google.android.gms.internal.ads.zzgri
                @Override // com.google.android.gms.internal.ads.zzgrq
                public final /* synthetic */ void zza(java.lang.String str2) {
                    int i = com.google.android.gms.internal.ads.zzgrr.zzb;
                    bundle.putString("sessionToken", str2);
                }
            });
            zzi(zzgrtVar.zzb(), new com.google.android.gms.internal.ads.zzgrq() { // from class: com.google.android.gms.internal.ads.zzgrj
                @Override // com.google.android.gms.internal.ads.zzgrq
                public final /* synthetic */ void zza(java.lang.String str2) {
                    int i = com.google.android.gms.internal.ads.zzgrr.zzb;
                    bundle.putString(com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID, str2);
                }
            });
            zzi(null, new com.google.android.gms.internal.ads.zzgrq() { // from class: com.google.android.gms.internal.ads.zzgrk
                @Override // com.google.android.gms.internal.ads.zzgrq
                public final /* synthetic */ void zza(java.lang.String str2) {
                    int i = com.google.android.gms.internal.ads.zzgrr.zzb;
                    bundle.putString("thirdPartyAuthCallerId", str2);
                }
            });
            bundle.putBoolean("stableSessionToken", true);
            zzgqmVar.zze(str, bundle, new com.google.android.gms.internal.ads.zzgrp(this, zzgrwVar));
        } catch (android.os.RemoteException e) {
            zzc.zzd(e, "show overlay display from: %s", this.zze);
        }
    }

    final /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzgqy zzgqyVar, com.google.android.gms.internal.ads.zzgrw zzgrwVar) {
        try {
            com.google.android.gms.internal.ads.zzgsi zzgsiVar = this.zza;
            zzgsiVar.getClass();
            com.google.android.gms.internal.ads.zzgsi zzgsiVar2 = zzgsiVar;
            com.google.android.gms.internal.ads.zzgqm zzgqmVar = (com.google.android.gms.internal.ads.zzgqm) zzgsiVar.zzc();
            if (zzgqmVar == null) {
                return;
            }
            java.lang.String str = this.zze;
            final android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("callerPackage", str);
            zzi(zzgqyVar.zza(), new com.google.android.gms.internal.ads.zzgrq() { // from class: com.google.android.gms.internal.ads.zzgrl
                @Override // com.google.android.gms.internal.ads.zzgrq
                public final /* synthetic */ void zza(java.lang.String str2) {
                    int i = com.google.android.gms.internal.ads.zzgrr.zzb;
                    bundle.putString("sessionToken", str2);
                }
            });
            zzi(zzgqyVar.zzb(), new com.google.android.gms.internal.ads.zzgrq() { // from class: com.google.android.gms.internal.ads.zzgrm
                @Override // com.google.android.gms.internal.ads.zzgrq
                public final /* synthetic */ void zza(java.lang.String str2) {
                    int i = com.google.android.gms.internal.ads.zzgrr.zzb;
                    bundle.putString(com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID, str2);
                }
            });
            zzgqmVar.zzf(bundle, new com.google.android.gms.internal.ads.zzgrp(this, zzgrwVar));
        } catch (android.os.RemoteException e) {
            zzc.zzd(e, "dismiss overlay display from: %s", this.zze);
        }
    }

    final /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzgry zzgryVar, int i, com.google.android.gms.internal.ads.zzgrw zzgrwVar) {
        try {
            com.google.android.gms.internal.ads.zzgsi zzgsiVar = this.zza;
            zzgsiVar.getClass();
            com.google.android.gms.internal.ads.zzgsi zzgsiVar2 = zzgsiVar;
            com.google.android.gms.internal.ads.zzgqm zzgqmVar = (com.google.android.gms.internal.ads.zzgqm) zzgsiVar.zzc();
            if (zzgqmVar == null) {
                return;
            }
            java.lang.String str = this.zze;
            final android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("callerPackage", str);
            bundle.putInt("displayMode", i);
            zzi(zzgryVar.zza(), new com.google.android.gms.internal.ads.zzgrq() { // from class: com.google.android.gms.internal.ads.zzgrn
                @Override // com.google.android.gms.internal.ads.zzgrq
                public final /* synthetic */ void zza(java.lang.String str2) {
                    int i2 = com.google.android.gms.internal.ads.zzgrr.zzb;
                    bundle.putString("sessionToken", str2);
                }
            });
            zzi(zzgryVar.zzb(), new com.google.android.gms.internal.ads.zzgrq() { // from class: com.google.android.gms.internal.ads.zzgre
                @Override // com.google.android.gms.internal.ads.zzgrq
                public final /* synthetic */ void zza(java.lang.String str2) {
                    int i2 = com.google.android.gms.internal.ads.zzgrr.zzb;
                    bundle.putString(com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID, str2);
                }
            });
            zzgqmVar.zzg(bundle, new com.google.android.gms.internal.ads.zzgrp(this, zzgrwVar));
        } catch (android.os.RemoteException e) {
            zzc.zzd(e, "switchDisplayMode overlay display to %d from: %s", java.lang.Integer.valueOf(i), this.zze);
        }
    }
}
