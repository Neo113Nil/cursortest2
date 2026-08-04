package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import W5.AbstractC0486a1;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzckz implements zzckd {
    private final CookieManager zza = o.f1952C.f1959e.h();

    public zzckz(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzckd
    public final void zza(Map map) {
        String cookie;
        if (this.zza == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.zza.setCookie((String) C0254t.f2723d.f2726c.zzb(zzbby.zzbb), str);
            return;
        }
        String str2 = (String) C0254t.f2723d.f2726c.zzb(zzbby.zzbb);
        CookieManager cookieManager = this.zza;
        if (cookieManager == null || (cookie = cookieManager.getCookie(str2)) == null) {
            return;
        }
        List listZzf = zzftw.zzb(zzfss.zzc(';')).zzf(cookie);
        for (int i7 = 0; i7 < listZzf.size(); i7++) {
            CookieManager cookieManager2 = this.zza;
            Iterator it = zzftw.zzb(zzfss.zzc('=')).zzd((String) listZzf.get(i7)).iterator();
            it.getClass();
            if (!it.hasNext()) {
                throw new IndexOutOfBoundsException(AbstractC0486a1.f(0, "position (0) must be less than the number of elements that remained (", ")"));
            }
            cookieManager2.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) C0254t.f2723d.f2726c.zzb(zzbby.zzaN))));
        }
    }
}
