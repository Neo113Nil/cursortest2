package Bl0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class r extends AbstractC7737t implements Function1<C2664z, CharSequence> {

    /* renamed from: b, reason: collision with root package name */
    public static final r f3990b = new r(1);

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(C2664z c2664z) {
        C2664z it = c2664z;
        Intrinsics.checkNotNullParameter(it, "it");
        return B3.D.c(new StringBuilder("'"), it.f4000a, '\'');
    }
}
