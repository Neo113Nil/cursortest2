package com.google.android.gms.internal.ads;

import E2.o;
import I2.J;
import I2.P;
import J2.j;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbjs implements zzbiz {
    private final Context zza;

    public zzbjs(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
            return;
        }
        J.k("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
        if (map.containsKey("title")) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
        }
        try {
            P p5 = o.f1952C.f1957c;
            P.p(this.zza, intent);
        } catch (RuntimeException e7) {
            j.h("Failed to open Share Sheet", e7);
            o.f1952C.f1961g.zzw(e7, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}
