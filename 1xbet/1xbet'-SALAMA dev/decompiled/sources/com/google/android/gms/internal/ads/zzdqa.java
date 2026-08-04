package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class zzdqa {
    public static Bundle zza(Pair... pairArr) {
        Bundle bundle = new Bundle();
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzco)).booleanValue()) {
            for (int i7 = 0; i7 < 2; i7++) {
                Pair pair = pairArr[i7];
                if (!TextUtils.isEmpty((CharSequence) pair.first) && ((Long) pair.second).longValue() > 0) {
                    bundle.putLong((String) pair.first, ((Long) pair.second).longValue());
                }
            }
        }
        return bundle;
    }
}
