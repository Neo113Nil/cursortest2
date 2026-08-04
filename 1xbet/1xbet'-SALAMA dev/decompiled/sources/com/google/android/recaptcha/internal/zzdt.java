package com.google.android.recaptcha.internal;

import C6.o;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p050g6.i;
import p050g6.j;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class zzdt {
    public static final /* synthetic */ int zza = 0;
    private static final List zzb = zzf(i.M0("www.recaptcha.net", "www.gstatic.com/recaptcha", "www.gstatic.cn/recaptcha"));

    public static final boolean zza(Uri uri) {
        return zze(uri) && zzd(uri.toString());
    }

    public static final boolean zzb(String str) {
        Uri uri = Uri.parse(str);
        h.b(uri);
        return zze(uri) && zzd(uri.toString());
    }

    public static final boolean zzc(Uri uri) {
        return zze(uri);
    }

    private static final boolean zzd(String str) {
        List list = zzb;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (o.B0(str, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private static final boolean zze(Uri uri) {
        return (TextUtils.isEmpty(uri.toString()) || !"https".equals(uri.getScheme()) || TextUtils.isEmpty(uri.getHost())) ? false : true;
    }

    private static final List zzf(List list) {
        ArrayList arrayList = new ArrayList(j.N0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("https://" + ((String) it.next()) + "/");
        }
        return arrayList;
    }
}
