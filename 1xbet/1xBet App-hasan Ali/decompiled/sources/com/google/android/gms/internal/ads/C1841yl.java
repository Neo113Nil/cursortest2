package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import Q2.InterfaceC0347a;
import android.content.Context;
import android.os.SystemClock;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.yl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1841yl implements K2.d, InterfaceC1434pi, InterfaceC0347a, Mh, Vh, Wh, InterfaceC0808bi, Ph, Hr {

    /* renamed from: k, reason: collision with root package name */
    public final List f16470k;

    /* renamed from: l, reason: collision with root package name */
    public final C1751wl f16471l;

    /* renamed from: m, reason: collision with root package name */
    public long f16472m;

    public C1841yl(C1751wl c1751wl, C0554Af c0554Af) {
        this.f16471l = c1751wl;
        this.f16470k = Collections.singletonList(c0554Af);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1434pi
    public final void B0(Sq sq) {
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void C(BinderC1652uc binderC1652uc, String str, String str2) {
        E(Mh.class, "onRewarded", binderC1652uc, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1434pi
    public final void D(C1428pc c1428pc) {
        P2.o.f4767B.f4776j.getClass();
        this.f16472m = SystemClock.elapsedRealtime();
        E(InterfaceC1434pi.class, "onAdRequest", new Object[0]);
    }

    public final void E(Class cls, String str, Object... objArr) {
        String simpleName = cls.getSimpleName();
        List list = this.f16470k;
        String concat = "Event-".concat(simpleName);
        C1751wl c1751wl = this.f16471l;
        c1751wl.getClass();
        if (((Boolean) AbstractC1146j8.f14087a.s()).booleanValue()) {
            c1751wl.f16151a.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(currentTimeMillis);
                jsonWriter.name("source").value(concat);
                jsonWriter.name("event").value(str);
                jsonWriter.name("components").beginArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj = objArr[i];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e3) {
                U2.j.g("unable to log", e3);
            }
            U2.j.h("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
        }
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void a() {
        E(Mh.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void b() {
        E(Mh.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void c() {
        E(Mh.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.Wh
    public final void d(Context context) {
        E(Wh.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void i() {
        E(Mh.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.Wh
    public final void j(Context context) {
        E(Wh.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0808bi
    public final void j0() {
        P2.o.f4767B.f4776j.getClass();
        T2.G.m("Ad Request Latency : " + (SystemClock.elapsedRealtime() - this.f16472m));
        E(InterfaceC0808bi.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.Hr
    public final void k(Dr dr, String str) {
        E(Fr.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.Ph
    public final void l0(C0387u0 c0387u0) {
        E(Ph.class, "onAdFailedToLoad", Integer.valueOf(c0387u0.f5058k), c0387u0.f5059l, c0387u0.f5060m);
    }

    @Override // com.google.android.gms.internal.ads.Hr
    public final void o(Dr dr, String str) {
        E(Fr.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void p() {
        E(Mh.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.Hr
    public final void q(Dr dr, String str, Throwable th) {
        E(Fr.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.Vh
    public final void t() {
        E(Vh.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.Wh
    public final void u(Context context) {
        E(Wh.class, "onPause", context);
    }

    @Override // K2.d
    public final void w(String str, String str2) {
        E(K2.d.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.Hr
    public final void y(String str) {
        E(Fr.class, "onTaskCreated", str);
    }

    @Override // Q2.InterfaceC0347a
    public final void z() {
        E(InterfaceC0347a.class, "onAdClicked", new Object[0]);
    }
}
