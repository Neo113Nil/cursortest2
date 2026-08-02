package com.facebook.appevents;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class D implements Serializable {
    public static final a Companion = new a();
    private static final long serialVersionUID = 20160629001L;
    public final HashMap<C0689a, List<C0692d>> a;

    public static final class a {
    }

    public static final class b implements Serializable {
        public static final a Companion = new a();
        private static final long serialVersionUID = 20160629001L;
        public final HashMap<C0689a, List<C0692d>> a;

        public static final class a {
        }

        public b(HashMap<C0689a, List<C0692d>> proxyEvents) {
            Intrinsics.checkNotNullParameter(proxyEvents, "proxyEvents");
            this.a = proxyEvents;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new D(this.a);
        }
    }

    public D() {
        this.a = new HashMap<>();
    }

    private final Object writeReplace() throws ObjectStreamException {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            return new b(this.a);
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
            return null;
        }
    }

    public final void a(C0689a accessTokenAppIdPair, List<C0692d> appEvents) {
        HashMap<C0689a, List<C0692d>> hashMap = this.a;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            if (!hashMap.containsKey(accessTokenAppIdPair)) {
                hashMap.put(accessTokenAppIdPair, CollectionsKt.toMutableList((Collection) appEvents));
                return;
            }
            List<C0692d> list = hashMap.get(accessTokenAppIdPair);
            if (list != null) {
                list.addAll(appEvents);
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }

    public D(HashMap<C0689a, List<C0692d>> appEventMap) {
        Intrinsics.checkNotNullParameter(appEventMap, "appEventMap");
        HashMap<C0689a, List<C0692d>> hashMap = new HashMap<>();
        this.a = hashMap;
        hashMap.putAll(appEventMap);
    }
}
