package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class zzcbu implements zzbiz {
    private final Consumer zza;

    public zzcbu(Consumer consumer) {
        this.zza = consumer;
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if (str == null) {
            int i7 = J.f3546b;
            j.g("Action missing from video GMSG.");
        } else if (str.equals("src")) {
            String str2 = (String) map.get("src");
            if (str2 != null) {
                this.zza.accept(str2);
            } else {
                int i8 = J.f3546b;
                j.g("src missing from video GMSG.");
            }
        }
    }
}
