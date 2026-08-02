package com.google.android.gms.internal.ads;

import Q2.C0379q;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ng, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0651Ng implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10800a;

    /* renamed from: b, reason: collision with root package name */
    public final Hh f10801b;

    public /* synthetic */ C0651Ng(Hh hh, int i) {
        this.f10800a = i;
        this.f10801b = hh;
    }

    public Boolean a() {
        boolean z3 = true;
        if (this.f10801b.a().a() == null) {
            if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.n5)).booleanValue()) {
                z3 = false;
            }
        }
        return Boolean.valueOf(z3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L20;
     */
    @Override // com.google.android.gms.internal.ads.ID
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d() {
        String valueOf;
        switch (this.f10800a) {
            case 0:
                return a();
            case 1:
                return this.f10801b.a().f12107o.f17003l == 3 ? EnumC1818y6.f16408w : EnumC1818y6.f16404s;
            case 2:
                return this.f10801b.a().f12107o.f17003l == 3 ? "rewarded_interstitial" : "rewarded";
            case 3:
                Wq a5 = this.f10801b.a();
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.P6)).booleanValue()) {
                    Q2.X0 x02 = a5.f12098d;
                    String str = x02.f4955H;
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            valueOf = new JSONObject(str).getString("request_id");
                            break;
                        } catch (JSONException unused) {
                        }
                    }
                    Q2.M m5 = x02.f4950C;
                    if (m5 != null) {
                        try {
                            valueOf = new JSONObject(m5.f4931k).getString("request_id");
                            break;
                        } catch (JSONException unused2) {
                        }
                    }
                }
                valueOf = String.valueOf(C0379q.f.f5052e.nextInt() & Integer.MAX_VALUE);
                AbstractC1400ot.D(valueOf);
                return valueOf;
            case 4:
                return new Mo(2, this.f10801b.a());
            default:
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                return new So(c0606Hd, this.f10801b.a(), 1);
        }
    }
}
