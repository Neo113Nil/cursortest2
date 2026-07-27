package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* renamed from: com.inmobi.media.fn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3718fn {
    public static void a(boolean z) {
        AbstractC3914mk.d.set(z);
        if (z) {
            ((C4214xd) AbstractC3914mk.f.getValue()).b(new C3698f3(101, 6, (String) null));
        } else {
            ((C4214xd) AbstractC3914mk.f.getValue()).b(new C3698f3(102, 6, (String) null));
        }
        C3690en runnable = new C3690en(z, null);
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        BuildersKt__Builders_commonKt.launch$default(AbstractC3914mk.i, null, null, new C3886lk(runnable, null), 3, null);
    }
}
