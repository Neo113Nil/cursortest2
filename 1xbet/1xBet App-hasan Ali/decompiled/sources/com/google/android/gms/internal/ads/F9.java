package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class F9 implements G9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8939a;

    /* renamed from: b, reason: collision with root package name */
    public final C0634Ld f8940b;

    public /* synthetic */ F9(C0634Ld c0634Ld, int i) {
        this.f8939a = i;
        this.f8940b = c0634Ld;
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final void a(JSONObject jSONObject) {
        switch (this.f8939a) {
            case 0:
                this.f8940b.b(jSONObject);
                break;
            default:
                C0634Ld c0634Ld = this.f8940b;
                try {
                    c0634Ld.b(jSONObject);
                    break;
                } catch (IllegalStateException unused) {
                    return;
                } catch (JSONException e3) {
                    c0634Ld.c(e3);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.G9
    public final void d(String str) {
        switch (this.f8939a) {
            case 0:
                this.f8940b.c(new C1650ua(str));
                break;
            default:
                C0634Ld c0634Ld = this.f8940b;
                try {
                    if (str == null) {
                        c0634Ld.c(new C1650ua());
                    } else {
                        c0634Ld.c(new C1650ua(str));
                    }
                    break;
                } catch (IllegalStateException unused) {
                    return;
                }
        }
    }
}
