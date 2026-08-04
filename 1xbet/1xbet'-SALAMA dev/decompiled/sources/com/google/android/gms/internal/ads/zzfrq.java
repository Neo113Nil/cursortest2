package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
final class zzfrq {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfsi zzc = new zzfsi("OverlayDisplayService");
    private static final Intent zzd = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    final zzfsh zza;
    private final String zze;

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.zzfrm] */
    public zzfrq(Context context) {
        if (zzfsk.zza(context)) {
            this.zza = new zzfsh(context.getApplicationContext(), zzc, "OverlayDisplayService", zzd, new Object() { // from class: com.google.android.gms.internal.ads.zzfrm
            });
        } else {
            this.zza = null;
        }
        this.zze = context.getPackageName();
    }

    public static /* synthetic */ void zza(zzfrq zzfrqVar, zzfrx zzfrxVar, int i7, zzfrv zzfrvVar) {
        try {
            zzfsh zzfshVar = zzfrqVar.zza;
            if (zzfshVar == null) {
                throw null;
            }
            zzfqh zzfqhVar = (zzfqh) zzfshVar.zzc();
            if (zzfqhVar == null) {
                return;
            }
            String str = zzfrqVar.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putInt("displayMode", i7);
            zzi(zzfrxVar.zzb(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfrb
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i8 = zzfrq.zzb;
                    bundle.putString("sessionToken", (String) obj);
                }
            });
            zzi(zzfrxVar.zza(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfrh
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i8 = zzfrq.zzb;
                    bundle.putString("appId", (String) obj);
                }
            });
            zzfqhVar.zzg(bundle, new zzfrp(zzfrqVar, zzfrvVar));
        } catch (RemoteException e7) {
            zzc.zzb(e7, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i7), zzfrqVar.zze);
        }
    }

    public static /* synthetic */ void zzb(zzfrq zzfrqVar, zzfqx zzfqxVar, zzfrv zzfrvVar) {
        try {
            zzfsh zzfshVar = zzfrqVar.zza;
            if (zzfshVar == null) {
                throw null;
            }
            zzfqh zzfqhVar = (zzfqh) zzfshVar.zzc();
            if (zzfqhVar == null) {
                return;
            }
            String str = zzfrqVar.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            zzi(zzfqxVar.zzb(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfrj
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i7 = zzfrq.zzb;
                    bundle.putString("sessionToken", (String) obj);
                }
            });
            zzi(zzfqxVar.zza(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfrk
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i7 = zzfrq.zzb;
                    bundle.putString("appId", (String) obj);
                }
            });
            zzfqhVar.zze(bundle, new zzfrp(zzfrqVar, zzfrvVar));
        } catch (RemoteException e7) {
            zzc.zzb(e7, "dismiss overlay display from: %s", zzfrqVar.zze);
        }
    }

    public static /* synthetic */ void zzc(zzfrq zzfrqVar, zzfrs zzfrsVar, zzfrv zzfrvVar) {
        try {
            zzfsh zzfshVar = zzfrqVar.zza;
            if (zzfshVar == null) {
                throw null;
            }
            zzfqh zzfqhVar = (zzfqh) zzfshVar.zzc();
            if (zzfqhVar == null) {
                return;
            }
            String str = zzfrqVar.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putBinder("windowToken", zzfrsVar.zzf());
            zzi(zzfrsVar.zzg(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfro
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i7 = zzfrq.zzb;
                    bundle.putString("adFieldEnifd", (String) obj);
                }
            });
            bundle.putInt("layoutGravity", zzfrsVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzfrsVar.zza());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt("windowWidthPx", zzfrsVar.zze());
            zzi(null, new Consumer() { // from class: com.google.android.gms.internal.ads.zzfrc
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i7 = zzfrq.zzb;
                    bundle.putString("deeplinkUrl", (String) obj);
                }
            });
            zzi(null, new Consumer() { // from class: com.google.android.gms.internal.ads.zzfrd
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i7 = zzfrq.zzb;
                    bundle.putString("sessionToken", (String) obj);
                }
            });
            zzi(zzfrsVar.zzh(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfre
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i7 = zzfrq.zzb;
                    bundle.putString("appId", (String) obj);
                }
            });
            zzi(null, new Consumer() { // from class: com.google.android.gms.internal.ads.zzfrf
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i7 = zzfrq.zzb;
                    bundle.putString("thirdPartyAuthCallerId", (String) obj);
                }
            });
            bundle.putBoolean("stableSessionToken", true);
            zzfqhVar.zzf(str, bundle, new zzfrp(zzfrqVar, zzfrvVar));
        } catch (RemoteException e7) {
            zzc.zzb(e7, "show overlay display from: %s", zzfrqVar.zze);
        }
    }

    public static /* synthetic */ boolean zzh(String str) {
        return !zzk(str);
    }

    private static void zzi(String str, Consumer consumer) {
        if (zzk(str)) {
            return;
        }
        str.getClass();
        consumer.accept(str.trim());
    }

    private static boolean zzj(zzfrv zzfrvVar, String str, List list) {
        if (list.stream().anyMatch(new Predicate() { // from class: com.google.android.gms.internal.ads.zzfrn
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return zzfrq.zzh((String) obj);
            }
        })) {
            return true;
        }
        zzc.zza(str, new Object[0]);
        zzfrt zzfrtVarZzc = zzfru.zzc();
        zzfrtVarZzc.zzb(8160);
        zzfrvVar.zza(zzfrtVarZzc.zzc());
        return false;
    }

    private static boolean zzk(String str) {
        return zzfty.zzc(str).trim().isEmpty();
    }

    public final void zzd() {
        if (this.zza == null) {
            return;
        }
        zzc.zzc("unbind LMD display overlay service", new Object[0]);
        this.zza.zzn();
    }

    public final void zze(final zzfqx zzfqxVar, final zzfrv zzfrvVar) {
        if (this.zza == null) {
            zzc.zza("error: %s", "Play Store not found.");
        } else if (zzj(zzfrvVar, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(zzfqxVar.zzb(), zzfqxVar.zza()))) {
            this.zza.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfrg
                @Override // java.lang.Runnable
                public final void run() {
                    zzfrq.zzb(this.zza, zzfqxVar, zzfrvVar);
                }
            });
        }
    }

    public final void zzf(final zzfrs zzfrsVar, final zzfrv zzfrvVar) {
        if (this.zza == null) {
            zzc.zza("error: %s", "Play Store not found.");
        } else if (zzj(zzfrvVar, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, zzfrsVar.zzh()))) {
            this.zza.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfrl
                @Override // java.lang.Runnable
                public final void run() {
                    zzfrq.zzc(this.zza, zzfrsVar, zzfrvVar);
                }
            });
        }
    }

    public final void zzg(final zzfrx zzfrxVar, final zzfrv zzfrvVar, final int i7) {
        if (this.zza == null) {
            zzc.zza("error: %s", "Play Store not found.");
        } else if (zzj(zzfrvVar, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(zzfrxVar.zzb(), zzfrxVar.zza()))) {
            this.zza.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfri
                @Override // java.lang.Runnable
                public final void run() {
                    zzfrq.zza(this.zza, zzfrxVar, i7, zzfrvVar);
                }
            });
        }
    }
}
