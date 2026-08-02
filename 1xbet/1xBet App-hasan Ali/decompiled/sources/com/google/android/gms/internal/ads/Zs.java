package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Zs extends Xs {

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f12534c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f12535d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12536e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zs(Er er, HashSet hashSet, JSONObject jSONObject, long j5, int i) {
        super(er);
        this.f = i;
        this.f12534c = new HashSet(hashSet);
        this.f12535d = jSONObject;
        this.f12536e = j5;
    }

    @Override // com.google.android.gms.internal.ads.Xs
    /* renamed from: a */
    public final void onPostExecute(String str) {
        Hs hs;
        switch (this.f) {
            case 0:
                b(str);
                super.onPostExecute(str);
                break;
            default:
                if (!TextUtils.isEmpty(str) && (hs = Hs.f9492c) != null) {
                    for (C1893zs c1893zs : Collections.unmodifiableCollection(hs.f9493a)) {
                        if (this.f12534c.contains(c1893zs.f16780g)) {
                            Rs rs = c1893zs.f16778d;
                            if (this.f12536e >= rs.f11462c) {
                                rs.f11463d = 2;
                                AbstractC1668us.E(rs.a(), "setNativeViewHierarchy", str, rs.f11460a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
        }
    }

    public void b(String str) {
        Hs hs = Hs.f9492c;
        if (hs != null) {
            for (C1893zs c1893zs : Collections.unmodifiableCollection(hs.f9493a)) {
                if (this.f12534c.contains(c1893zs.f16780g)) {
                    Rs rs = c1893zs.f16778d;
                    if (this.f12536e >= rs.f11462c && rs.f11463d != 3) {
                        rs.f11463d = 3;
                        AbstractC1668us.E(rs.a(), "setNativeViewHierarchy", str, rs.f11460a);
                    }
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        switch (this.f) {
            case 0:
                return this.f12535d.toString();
            default:
                Er er = this.f12251b;
                JSONObject jSONObject = (JSONObject) er.f8617l;
                JSONObject jSONObject2 = this.f12535d;
                if (Us.e(jSONObject2, jSONObject)) {
                    return null;
                }
                er.f8617l = jSONObject2;
                return jSONObject2.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.Xs, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f) {
            case 0:
                String str = (String) obj;
                b(str);
                super.onPostExecute(str);
                break;
            default:
                onPostExecute((String) obj);
                break;
        }
    }
}
