package com.amplitude.core.utilities.http;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface h {
    void a(j jVar, Object obj, String str);

    void b(k kVar, Object obj, String str);

    void c(c cVar, Object obj, String str);

    default Boolean d(a response, Object events, String eventsString) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        if (response instanceof i) {
            g((i) response, events, eventsString);
            return null;
        }
        if (response instanceof b) {
            return Boolean.valueOf(f((b) response, events, eventsString));
        }
        if (response instanceof g) {
            e((g) response, events, eventsString);
            return Boolean.TRUE;
        }
        if (response instanceof k) {
            b((k) response, events, eventsString);
            return Boolean.TRUE;
        }
        if (response instanceof j) {
            a((j) response, events, eventsString);
            return Boolean.TRUE;
        }
        c((c) response, events, eventsString);
        return Boolean.TRUE;
    }

    void e(g gVar, Object obj, String str);

    boolean f(b bVar, Object obj, String str);

    void g(i iVar, Object obj, String str);
}
