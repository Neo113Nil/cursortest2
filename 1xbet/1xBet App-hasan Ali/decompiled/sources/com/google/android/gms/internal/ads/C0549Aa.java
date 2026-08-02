package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Aa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0549Aa implements G9 {

    /* renamed from: a, reason: collision with root package name */
    public final C1471qa f7589a;

    /* renamed from: b, reason: collision with root package name */
    public final C0634Ld f7590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P2.c f7591c;

    public C0549Aa(P2.c cVar, C1471qa c1471qa, C0634Ld c0634Ld) {
        this.f7591c = cVar;
        this.f7589a = c1471qa;
        this.f7590b = c0634Ld;
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final void a(JSONObject jSONObject) {
        C1471qa c1471qa = this.f7589a;
        C0634Ld c0634Ld = this.f7590b;
        try {
            try {
                c0634Ld.b(((InterfaceC1695va) this.f7591c.f4717b).d(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e3) {
                c0634Ld.c(e3);
            }
        } finally {
            c1471qa.q();
        }
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final void d(String str) {
        C1471qa c1471qa = this.f7589a;
        C0634Ld c0634Ld = this.f7590b;
        try {
            if (str == null) {
                c0634Ld.c(new C1650ua());
            } else {
                c0634Ld.c(new C1650ua(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            c1471qa.q();
            throw th;
        }
        c1471qa.q();
    }
}
