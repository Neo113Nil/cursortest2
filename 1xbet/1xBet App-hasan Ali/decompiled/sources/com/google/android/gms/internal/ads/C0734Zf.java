package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Zf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0734Zf implements InterfaceC0699Uf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12504a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12505b;

    public /* synthetic */ C0734Zf(int i, Object obj) {
        this.f12504a = i;
        this.f12505b = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0699Uf
    public final void a(HashMap hashMap) {
        switch (this.f12504a) {
            case 0:
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.X9)).booleanValue()) {
                    AbstractC1400ot.X(Hw.r(((C1864z7) this.f12505b).a(true)), Throwable.class, new C0727Yf(0), AbstractC0613Id.f9539a);
                    return;
                }
                return;
            case 1:
                String str = (String) hashMap.get("render_in_browser");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                try {
                    ((Kq) this.f12505b).a(Boolean.parseBoolean(str));
                    return;
                } catch (Exception e3) {
                    throw new IllegalStateException("Invalid render_in_browser state", e3);
                }
            default:
                CookieManager cookieManager = (CookieManager) this.f12505b;
                if (cookieManager == null) {
                    return;
                }
                if (((String) hashMap.get("clear")) == null) {
                    String str2 = (String) hashMap.get("cookie");
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    cookieManager.setCookie((String) Q2.r.f5053d.f5056c.a(F7.f8740P0), str2);
                    return;
                }
                String str3 = (String) Q2.r.f5053d.f5056c.a(F7.f8740P0);
                String cookie = cookieManager.getCookie(str3);
                if (cookie != null) {
                    List i = Hq.e(new C1221ku(';')).i(cookie);
                    for (int i5 = 0; i5 < i.size(); i5++) {
                        String str4 = (String) i.get(i5);
                        Hq e5 = Hq.e(new C1221ku('='));
                        str4.getClass();
                        AbstractC1715vu abstractC1715vu = (AbstractC1715vu) ((InterfaceC1760wu) e5.f9491l).c(e5, str4);
                        if (!abstractC1715vu.hasNext()) {
                            throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
                        }
                        cookieManager.setCookie(str3, String.valueOf((String) abstractC1715vu.next()).concat(String.valueOf((String) Q2.r.f5053d.f5056c.a(F7.B0))));
                    }
                    return;
                }
                return;
        }
    }

    public C0734Zf() {
        this.f12504a = 2;
        P2.o.f4767B.f4773e.getClass();
        this.f12505b = Q1.j.f();
    }
}
