package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.wo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0944wo implements InterfaceC0918vo {

    /* renamed from: a, reason: collision with root package name */
    public final H8 f8600a;

    public C0944wo() {
        this(new H8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0918vo
    public final byte[] a(S8 s8, C0756ph c0756ph) {
        if (!((C0459e5) c0756ph.f8078l).B() && !TextUtils.isEmpty(s8.f6568b)) {
            try {
                JSONObject jSONObject = new JSONObject(s8.f6568b);
                jSONObject.remove("preloadInfo");
                s8.f6568b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.f8600a.a(s8, c0756ph);
    }

    public C0944wo(H8 h8) {
        this.f8600a = h8;
    }
}
