package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.b4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0381b4 {

    /* renamed from: a, reason: collision with root package name */
    public final Em f7026a;

    /* renamed from: b, reason: collision with root package name */
    public final U f7027b;

    public C0381b4(Em em, U u3) {
        this.f7026a = em;
        this.f7027b = u3;
    }

    public final C0355a4 a(HashMap hashMap) {
        AdvertisingIdsHolder a3;
        C0605jm e3 = this.f7026a.e();
        U u3 = this.f7027b;
        synchronized (u3) {
            a3 = u3.a(new C0468ee());
        }
        return new C0355a4(C0355a4.a(e3.f7645d), C0355a4.a(e3.f7642a), C0355a4.a(e3.f7643b), C0355a4.a(e3.f7650j), C0355a4.a(e3.f7649i), C0355a4.a(AbstractC0698nb.a(Jm.a(e3.f7651k))), C0355a4.a(AbstractC0698nb.a(hashMap)), new IdentifiersResult(a3.getGoogle().mAdTrackingInfo == null ? null : a3.getGoogle().mAdTrackingInfo.advId, a3.getGoogle().mStatus, a3.getGoogle().mErrorExplanation), new IdentifiersResult(a3.getHuawei().mAdTrackingInfo == null ? null : a3.getHuawei().mAdTrackingInfo.advId, a3.getHuawei().mStatus, a3.getHuawei().mErrorExplanation), new IdentifiersResult(a3.getYandex().mAdTrackingInfo == null ? null : a3.getYandex().mAdTrackingInfo.advId, a3.getYandex().mStatus, a3.getYandex().mErrorExplanation), C0355a4.a(AbstractC0698nb.a(e3.f7648h)), Kn.a(), e3.f7655o + e3.f7665z.f6002a, C0355a4.a(e3.f7654n.f), new Bundle());
    }
}
