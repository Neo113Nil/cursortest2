package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzfkq implements zzfko {
    private final zzfko zza;

    public zzfkq(zzfko zzfkoVar) {
        this.zza = zzfkoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final JSONObject zza(View view) {
        JSONObject jSONObjectZza = zzfky.zza(0, 0, 0, 0);
        int iZzb = zzflb.zzb();
        int i7 = iZzb - 1;
        if (iZzb == 0) {
            throw null;
        }
        try {
            jSONObjectZza.put("noOutputDevice", i7 == 0);
        } catch (JSONException e7) {
            zzfkz.zza("Error with setting output device status", e7);
        }
        return jSONObjectZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzb(View view, JSONObject jSONObject, zzfkn zzfknVar, boolean z4, boolean z7) {
        ArrayList arrayList = new ArrayList();
        zzfkc zzfkcVarZza = zzfkc.zza();
        if (zzfkcVarZza != null) {
            Collection collectionZzb = zzfkcVarZza.zzb();
            int size = collectionZzb.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = collectionZzb.iterator();
            while (it.hasNext()) {
                View viewZzf = ((zzfjl) it.next()).zzf();
                if (viewZzf != null && viewZzf.isAttachedToWindow() && viewZzf.isShown()) {
                    View view2 = viewZzf;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewZzf.getRootView();
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
                                break;
                            }
                            break;
                        }
                        if (view2.getAlpha() == 0.0f) {
                            break;
                        }
                        Object parent = view2.getParent();
                        view2 = parent instanceof View ? (View) parent : null;
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
