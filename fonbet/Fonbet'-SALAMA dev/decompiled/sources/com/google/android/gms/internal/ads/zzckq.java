package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.M;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
final class zzckq implements zzckd {
    @Override // com.google.android.gms.internal.ads.zzckd
    public final void zza(Map map) {
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkt)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ((M) o.f1952C.f1961g.zzi()).d(Boolean.parseBoolean(str));
    }
}
