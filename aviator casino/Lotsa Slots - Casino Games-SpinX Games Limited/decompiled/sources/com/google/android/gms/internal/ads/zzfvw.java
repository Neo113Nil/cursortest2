package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfvw implements com.google.android.gms.internal.ads.zzfvu {
    private final com.google.android.gms.internal.ads.zzfvu zza;

    public zzfvw(com.google.android.gms.internal.ads.zzfvu zzfvuVar) {
        this.zza = zzfvuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvu
    public final org.json.JSONObject zza(android.view.View view) {
        org.json.JSONObject zzb = com.google.android.gms.internal.ads.zzfwe.zzb(0, 0, 0, 0);
        int zzb2 = com.google.android.gms.internal.ads.zzfwh.zzb();
        int i = zzb2 - 1;
        if (zzb2 == 0) {
            throw null;
        }
        try {
            zzb.put("noOutputDevice", i == 0);
        } catch (org.json.JSONException e) {
            com.google.android.gms.internal.ads.zzfwf.zza("Error with setting output device status", e);
        }
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfvu
    public final void zzb(android.view.View view, org.json.JSONObject jSONObject, com.google.android.gms.internal.ads.zzfvt zzfvtVar, boolean z, boolean z2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.android.gms.internal.ads.zzfvi zza = com.google.android.gms.internal.ads.zzfvi.zza();
        if (zza != null) {
            java.util.Collection zzf = zza.zzf();
            int size = zzf.size();
            java.util.IdentityHashMap identityHashMap = new java.util.IdentityHashMap(size + size + 3);
            java.util.Iterator it = zzf.iterator();
            while (it.hasNext()) {
                android.view.View zzi = ((com.google.android.gms.internal.ads.zzfuo) it.next()).zzi();
                if (zzi != null && zzi.isAttachedToWindow() && zzi.isShown()) {
                    android.view.View view2 = zzi;
                    while (true) {
                        if (view2 == null) {
                            android.view.View rootView = zzi.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z3 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (((android.view.View) arrayList.get(i)).getZ() <= z3) {
                                        break;
                                    } else {
                                        size2 = i;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        } else {
                            if (view2.getAlpha() == 0.0f) {
                                break;
                            }
                            java.lang.Object parent = view2.getParent();
                            view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            zzfvtVar.zza((android.view.View) arrayList.get(i2), this.zza, jSONObject, z2);
        }
    }
}
