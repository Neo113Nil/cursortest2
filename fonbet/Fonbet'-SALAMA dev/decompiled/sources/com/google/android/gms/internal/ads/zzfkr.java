package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfkr implements zzfko {
    private final int[] zza = new int[2];

    @Override // com.google.android.gms.internal.ads.zzfko
    public final JSONObject zza(View view) {
        if (view == null) {
            return zzfky.zza(0, 0, 0, 0);
        }
        int[] iArr = this.zza;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        int[] iArr2 = this.zza;
        return zzfky.zza(iArr2[0], iArr2[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzb(View view, JSONObject jSONObject, zzfkn zzfknVar, boolean z4, boolean z7) {
        int i7;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z4) {
                for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                    zzfknVar.zza(viewGroup.getChildAt(i8), this, jSONObject, z7);
                }
                return;
            }
            HashMap hashMap = new HashMap();
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                View childAt = viewGroup.getChildAt(i9);
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                ArrayList arrayList3 = (ArrayList) hashMap.get((Float) arrayList2.get(i10));
                int size2 = arrayList3.size();
                int i11 = 0;
                while (true) {
                    i7 = i10 + 1;
                    if (i11 < size2) {
                        zzfknVar.zza((View) arrayList3.get(i11), this, jSONObject, z7);
                        i11++;
                    }
                }
                i10 = i7;
            }
        }
    }
}
