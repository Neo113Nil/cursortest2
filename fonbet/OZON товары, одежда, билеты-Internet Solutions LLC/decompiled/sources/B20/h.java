package B20;

import B20.f;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class h extends AbstractC7737t implements Function1<Context, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public static final h f2213b = new h(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Context context) {
        Context it = context;
        Intrinsics.checkNotNullParameter(it, "it");
        throw new f.a("Внутренний краш из дебаг меню");
    }
}
