package com.inmobi.media;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes6.dex */
public abstract class Vh {
    public static final void a(Sh priority, Function1 block) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(block, "block");
        int ordinal = priority.ordinal();
        if (ordinal == 0) {
            BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.e, null, null, new Th(block, null), 3, null);
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new Uh(block, null), 3, null);
        }
    }
}
