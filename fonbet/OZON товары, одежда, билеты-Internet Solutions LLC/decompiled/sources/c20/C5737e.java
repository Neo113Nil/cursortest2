package c20;

import B0.A0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c20.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C5737e extends AbstractC7737t implements Function1<ru.ozon.composer.ui.widget.l, CharSequence> {

    /* renamed from: b, reason: collision with root package name */
    public static final C5737e f56389b = new C5737e(1);

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(ru.ozon.composer.ui.widget.l lVar) {
        ru.ozon.composer.ui.widget.l it = lVar;
        Intrinsics.checkNotNullParameter(it, "it");
        return A0.b("item=[", C5735c.a(it), "]");
    }
}
