package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Mg {
    public static final void a(com.inmobi.media.Jg priority, kotlin.jvm.functions.Function1 block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priority, "priority");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        int ordinal = priority.ordinal();
        if (ordinal == 0) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.d, null, null, new com.inmobi.media.Kg(block, null), 3, null);
        } else {
            if (ordinal != 1) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.c, null, null, new com.inmobi.media.Lg(block, null), 3, null);
        }
    }
}
