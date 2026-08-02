package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfkq implements zzfko {
    private final zzfko zza;

    public zzfkq(zzfko zzfkoVar) {
        this.zza = zzfkoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final JSONObject zza(View view) {
        JSONObject zza = zzfky.zza(0, 0, 0, 0);
        int zzb = zzflb.zzb();
        int i7 = zzb - 1;
        if (zzb == 0) {
            throw null;
        }
        try {
            zza.put("noOutputDevice", i7 == 0);
        } catch (JSONException e7) {
            zzfkz.zza("Error with setting output device status", e7);
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzb(View view, JSONObject jSONObject, zzfkn zzfknVar, boolean z4, boolean z7) {
        ArrayList arrayList = new ArrayList();
        zzfkc zza = zzfkc.zza();
        if (zza != null) {
            Collection zzb = zza.zzb();
            int size = zzb.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = zzb.iterator();
            while (it.hasNext()) {
                View zzf = ((zzfjl) it.next()).zzf();
                if (zzf != null && zzf.isAttachedToWindow() && zzf.isShown()) {
                    View view2 = zzf;
                    while (true) {
                        if (view2 == null) {
                            View rootView = zzf.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z8 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i7 = size2 - 1;
                                    if (((View) arrayList.get(i7)).getZ() <= z8) {
                                        break;
                                    } else {
                                        size2 = i7;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        } else if (view2.getAlpha() != 0.0f) {
                            Object parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i8 = 0; i8 < size3; i8++) {
            zzfknVar.zza((View) arrayList.get(i8), this.zza, jSONObject, z7);
        }
    }
}
