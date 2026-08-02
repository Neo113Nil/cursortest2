package Dc0;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class z extends AbstractC7737t implements Function0<Context> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f6557b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(q qVar) {
        super(0);
        this.f6557b = qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Context invoke() {
        Context requireContext = this.f6557b.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return requireContext;
    }
}
