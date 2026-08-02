package com.amplitude.core.platform;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.C1086c;

@SourceDebugExtension({"SMAP\nEventPipeline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventPipeline.kt\ncom/amplitude/core/platform/EventPipeline\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,211:1\n1#2:212\n*E\n"})
/* loaded from: classes3.dex */
public final class b {
    public static final a Companion = new a();
    public final com.amplitude.core.b a;
    public final AtomicInteger b;
    public final com.amplitude.core.utilities.http.e c;
    public final com.amplitude.core.utilities.o d;
    public final com.amplitude.core.k e;
    public final C1086c f;
    public final kotlinx.coroutines.channels.b g;
    public final kotlinx.coroutines.channels.b h;
    public boolean i;
    public boolean j;
    public final AtomicInteger k;
    public final Lazy l;

    public static final class a {
    }

    public b(com.amplitude.core.b amplitude) {
        AtomicInteger eventCount = new AtomicInteger(0);
        com.amplitude.android.h hVar = amplitude.a;
        com.amplitude.core.utilities.http.d httpClient = new com.amplitude.core.utilities.http.d(hVar, amplitude.i());
        com.amplitude.core.utilities.o retryUploadHandler = new com.amplitude.core.utilities.o(hVar.k, 6);
        com.amplitude.core.k storage = amplitude.j();
        C1086c scope = amplitude.c;
        kotlinx.coroutines.channels.b writeChannel = kotlinx.coroutines.channels.j.a(Integer.MAX_VALUE, null, 6);
        kotlinx.coroutines.channels.b uploadChannel = kotlinx.coroutines.channels.j.a(Integer.MAX_VALUE, null, 6);
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        Intrinsics.checkNotNullParameter(eventCount, "eventCount");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(retryUploadHandler, "retryUploadHandler");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(writeChannel, "writeChannel");
        Intrinsics.checkNotNullParameter(uploadChannel, "uploadChannel");
        this.a = amplitude;
        this.b = eventCount;
        this.c = httpClient;
        this.d = retryUploadHandler;
        this.e = storage;
        this.f = scope;
        this.g = writeChannel;
        this.h = uploadChannel;
        this.k = new AtomicInteger(1);
        this.l = LazyKt.lazy(new d(this));
        this.i = false;
        this.j = false;
        try {
            Runtime.getRuntime().addShutdownHook(new c(this));
        } catch (IllegalStateException unused) {
        }
    }

    public final void a(com.amplitude.core.events.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        event.N++;
        this.g.c(new n(o.a, event));
    }
}
