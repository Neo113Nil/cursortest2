package com.amplitude.amplitude_flutter;

import com.amplitude.core.platform.k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements k {
    public final String a;
    public final k.a b;

    public c(String library) {
        Intrinsics.checkNotNullParameter(library, "library");
        this.a = library;
        this.b = k.a.b;
    }

    @Override // com.amplitude.core.platform.k
    public final void b(com.amplitude.core.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
    }

    @Override // com.amplitude.core.platform.k
    public final com.amplitude.core.events.a f(com.amplitude.core.events.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.B;
        String str2 = this.a;
        if (str == null) {
            event.B = str2;
        } else {
            event.B = str2 + '_' + event.B;
        }
        Intrinsics.checkNotNullParameter(event, "event");
        return event;
    }

    @Override // com.amplitude.core.platform.k
    public final k.a getType() {
        return this.b;
    }
}
