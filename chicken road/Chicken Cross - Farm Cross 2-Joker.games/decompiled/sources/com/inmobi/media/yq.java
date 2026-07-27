package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import com.unity3d.ads.BuildConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class yq {

    /* renamed from: a, reason: collision with root package name */
    public final Y9 f7513a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public yq(Y9 y9) {
        this.f7513a = y9;
    }

    public final void a(Ej ej, String str) {
        this.b.put(str, ej);
        Y9 y9 = this.f7513a;
        if (y9 != null) {
            ((Z9) y9).a("SiblingWebViewManager", "Registered bridge for WebView ID: " + str);
        }
    }

    public final void b(Function1 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        ConcurrentHashMap concurrentHashMap = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((Ej) entry.getValue()) instanceof Mj) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Ej ej = (Ej) ((Map.Entry) it.next()).getValue();
            Intrinsics.checkNotNull(ej, "null cannot be cast to non-null type com.inmobi.ads.containers.companions.RenderViewSibling");
            action.invoke((Mj) ej);
        }
    }

    public final void a(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.b.remove(id);
        Y9 y9 = this.f7513a;
        if (y9 != null) {
            ((Z9) y9).a("SiblingWebViewManager", "Unregistered bridge for WebView ID: " + id);
        }
    }

    public final void a(Function1 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Ej ej = (Ej) this.b.get(BuildConfig.FLAVOR);
        if (ej != null) {
            action.invoke(ej);
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (!Intrinsics.areEqual(entry.getKey(), BuildConfig.FLAVOR)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            action.invoke((Ej) ((Map.Entry) it.next()).getValue());
        }
    }

    public final Ej a(C3715fk route, Context context, short s, C3979p0 adMetaData, AdConfig adConfig) {
        C3715fk c3715fk;
        Ej mj;
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adMetaData, "adMetaData");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        if (s == 0) {
            Y9 y9 = this.f7513a;
            if (y9 != null) {
                ((Z9) y9).a("SiblingWebViewManager", "Creating standard WebView with ID: " + route.b);
            }
            mj = new Ej(context, adMetaData.o, adMetaData.p, adMetaData.q, adMetaData.r, 0L, adMetaData.s, adMetaData.t, route, this, adMetaData, adConfig, 80);
            c3715fk = route;
        } else if (s == 1) {
            Y9 y92 = this.f7513a;
            c3715fk = route;
            if (y92 != null) {
                ((Z9) y92).a("SiblingWebViewManager", "Creating Sibling WebView with ID: " + c3715fk.b);
            }
            mj = new Mj(context, adMetaData.o, adMetaData.t, C3979p0.a(adMetaData, null, 4194047), this, route, adConfig);
        } else {
            Y9 y93 = this.f7513a;
            if (y93 != null) {
                ((Z9) y93).b("SiblingWebViewManager", "Unsupported WebView type: " + ((int) s));
            }
            throw new IllegalArgumentException("Unsupported WebView type: " + ((int) s));
        }
        a(mj, c3715fk.b);
        return mj;
    }
}
