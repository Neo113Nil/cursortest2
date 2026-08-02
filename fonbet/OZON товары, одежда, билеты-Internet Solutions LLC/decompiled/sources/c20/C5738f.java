package c20;

import B0.A0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c20.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C5738f extends AbstractC7737t implements Function1<ru.ozon.composer.ui.widget.l, CharSequence> {

    /* renamed from: b, reason: collision with root package name */
    public static final C5738f f56390b = new C5738f(1);

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(ru.ozon.composer.ui.widget.l lVar) {
        ru.ozon.composer.ui.widget.l it = lVar;
        Intrinsics.checkNotNullParameter(it, "it");
        return A0.b("item=[", C5735c.a(it), "]");
    }
}
