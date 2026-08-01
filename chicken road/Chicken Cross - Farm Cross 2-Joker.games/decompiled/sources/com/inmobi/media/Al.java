package com.inmobi.media;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Al {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f6460a = new LinkedHashMap();

    public final void a(InterfaceC4195wl collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        if (!this.f6460a.containsKey(collector.a())) {
            this.f6460a.put(collector.a(), collector);
        } else {
            String str = "Duplicate collector ID '" + collector.a() + "'. Ignoring registration.";
        }
    }
}
