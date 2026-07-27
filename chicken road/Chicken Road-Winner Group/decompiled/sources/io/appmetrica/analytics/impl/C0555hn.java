package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.hn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0555hn extends kotlin.jvm.internal.k implements o2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0580in f7458a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0555hn(C0580in c0580in) {
        super(0);
        this.f7458a = c0580in;
    }

    @Override // o2.a
    public final Object invoke() {
        HashMap hashMap = new HashMap();
        C0580in c0580in = this.f7458a;
        String a3 = c0580in.f7552a.a();
        if (a3 != null) {
        }
        String a4 = c0580in.f7553b.a();
        if (a4 != null) {
            hashMap.put(AdRevenueConstants.PLUGIN_SUPPORTED_SOURCES_KEY, a4);
        }
        return hashMap;
    }
}
