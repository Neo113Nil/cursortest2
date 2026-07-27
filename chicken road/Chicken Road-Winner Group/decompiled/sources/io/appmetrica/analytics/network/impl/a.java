package io.appmetrica.analytics.network.impl;

import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.k;

/* loaded from: classes.dex */
public final class a extends k implements o2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HttpsURLConnection f8839a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(HttpsURLConnection httpsURLConnection) {
        super(0);
        this.f8839a = httpsURLConnection;
    }

    @Override // o2.a
    public final Object invoke() {
        return this.f8839a.getInputStream();
    }
}
