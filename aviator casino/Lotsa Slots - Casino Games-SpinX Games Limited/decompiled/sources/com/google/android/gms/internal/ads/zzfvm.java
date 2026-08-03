package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfvm {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final java.util.List zzb = new java.util.ArrayList();

    public final java.util.List zza() {
        return this.zzb;
    }

    public final void zzb(android.view.View view, com.google.android.gms.internal.ads.zzfur zzfurVar, java.lang.String str) {
        com.google.android.gms.internal.ads.zzfvl zzfvlVar;
        if (view == null) {
            throw new java.lang.IllegalArgumentException("FriendlyObstruction is null");
        }
        if (!zza.matcher("Ad overlay").matches()) {
            throw new java.lang.IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        java.util.List list = this.zzb;
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzfvlVar = null;
                break;
            } else {
                zzfvlVar = (com.google.android.gms.internal.ads.zzfvl) it.next();
                if (zzfvlVar.zza().get() == view) {
                    break;
                }
            }
        }
        if (zzfvlVar == null) {
            list.add(new com.google.android.gms.internal.ads.zzfvl(view, zzfurVar, "Ad overlay"));
        }
    }

    public final void zzc() {
        this.zzb.clear();
    }
}
