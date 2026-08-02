package Cb0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b extends AbstractC7737t implements Function1<String, CharSequence> {
    public b() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.toString();
    }
}
