package com.startapp.sdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* loaded from: classes.dex */
public final class ch implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3556a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f3557b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sf f3558c;

    public ch(Context context, com.startapp.sdk.components.a aVar, sf sfVar) {
        this.f3556a = context;
        this.f3557b = aVar;
        this.f3558c = sfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ag agVar = new ag(this.f3556a);
            agVar.a(this.f3556a, new AdPreferences());
            o8 o8Var = (o8) this.f3557b.f3366n.a();
            n8 n8Var = new n8(o8Var, agVar.a(MetaData.E().c0() + h0.f3812c));
            n8Var.f4097d = ((HttpClientConfig) o8Var.f.a()).a(agVar.f4676Z);
            r8 a3 = n8Var.a();
            if (a3 != null) {
                String str = a3.f4290b;
                if (!TextUtils.isEmpty(str)) {
                    String a4 = si.a(str, "@ct@", "@ct@");
                    String a5 = si.a(str, "@tsc@", "@tsc@");
                    String a6 = si.a(str, "@apc@", "@apc@");
                    try {
                        Integer valueOf = !TextUtils.isEmpty(a4) ? Integer.valueOf(Integer.parseInt(a4)) : null;
                        Long valueOf2 = !TextUtils.isEmpty(a5) ? Long.valueOf(Long.parseLong(a5)) : null;
                        Boolean valueOf3 = TextUtils.isEmpty(a6) ? null : Boolean.valueOf(Boolean.parseBoolean(a6));
                        if (valueOf != null || valueOf2 != null || valueOf3 != null) {
                            ((g6) this.f3557b.f3362j.a()).a(valueOf, valueOf2, valueOf3, false, true);
                        }
                    } catch (Throwable th) {
                        d9.a(th);
                    }
                }
            }
            rf edit = this.f3558c.edit();
            edit.a("shared_prefs_first_init", Boolean.FALSE);
            edit.f4299a.putBoolean("shared_prefs_first_init", false);
            edit.apply();
        } catch (Throwable th2) {
            d9.a(th2);
        }
    }
}
