package Cb0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c extends AbstractC7737t implements Function1<zb0.e, CharSequence> {
    public c() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(zb0.e it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getName();
    }
}
