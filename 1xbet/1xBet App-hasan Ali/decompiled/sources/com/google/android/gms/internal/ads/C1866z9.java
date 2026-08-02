package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.z9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1866z9 implements InterfaceC1821y9 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16553k;

    /* renamed from: l, reason: collision with root package name */
    public final Ul f16554l;

    public C1866z9(Ul ul, int i) {
        this.f16553k = i;
        switch (i) {
            case 1:
                m3.v.f("The Inspector Manager must not be null", ul);
                this.f16554l = ul;
                break;
            default:
                m3.v.f("The Inspector Manager must not be null", ul);
                this.f16554l = ul;
                break;
        }
    }

    private final void a(Object obj, Map map) {
        if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
            return;
        }
        Ul ul = this.f16554l;
        String str = (String) map.get("persistentData");
        synchronized (ul) {
            ul.f11808x = str;
            P2.o.f4767B.f4774g.d().c(ul.f11808x);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1821y9
    public final void b(Object obj, Map map) {
        switch (this.f16553k) {
            case 0:
                a(obj, map);
                return;
            default:
                if (map == null || !map.containsKey("extras")) {
                    return;
                }
                long j5 = Long.MAX_VALUE;
                if (map.containsKey("expires")) {
                    try {
                        j5 = Long.parseLong((String) map.get("expires"));
                    } catch (NumberFormatException unused) {
                    }
                }
                Ul ul = this.f16554l;
                String str = (String) map.get("extras");
                synchronized (ul) {
                    ul.f11799o = str;
                    ul.f11801q = j5;
                    ul.j();
                }
                return;
        }
    }
}
