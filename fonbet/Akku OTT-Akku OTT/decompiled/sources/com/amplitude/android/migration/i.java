package com.amplitude.android.migration;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i {
    public final com.amplitude.id.h a;
    public final com.amplitude.id.h b;
    public final com.amplitude.common.a c;

    public i(com.amplitude.id.h source, com.amplitude.id.h destination, com.amplitude.common.a logger) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.a = source;
        this.b = destination;
        this.c = logger;
    }

    public final void a() {
        com.amplitude.common.a aVar = this.c;
        try {
            com.amplitude.id.c load = this.a.load();
            aVar.c("Loaded old identity: " + load);
            String str = load.a;
            com.amplitude.id.h hVar = this.b;
            if (str != null) {
                hVar.a(str);
            }
            String str2 = load.b;
            if (str2 != null) {
                hVar.b(str2);
            }
        } catch (Exception e) {
            aVar.b("Unable to migrate file identity storage: " + e.getMessage());
        }
    }
}
