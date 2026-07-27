package io.appmetrica.analytics.network.impl;

import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class a extends j implements InterfaceC1430a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HttpsURLConnection f9810a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(HttpsURLConnection httpsURLConnection) {
        super(0);
        this.f9810a = httpsURLConnection;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        return this.f9810a.getInputStream();
    }
}
