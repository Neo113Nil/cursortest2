package c20;

import c20.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
final class g extends AbstractC7737t implements Function1<k.a, CharSequence> {

    /* renamed from: b, reason: collision with root package name */
    public static final g f56391b = new g(1);

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(k.a aVar) {
        k.a it = aVar;
        Intrinsics.checkNotNullParameter(it, "it");
        return "chunk=[type=" + it.c() + ", item=[" + C5735c.a(it.b()) + "]]";
    }
}
