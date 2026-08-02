package Bi;

import android.content.Context;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class o extends AbstractC7737t implements Function0<Context> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ComponentCallbacksC5392m f3840b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(ComponentCallbacksC5392m componentCallbacksC5392m) {
        super(0);
        this.f3840b = componentCallbacksC5392m;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Context invoke() {
        Context requireContext = this.f3840b.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return requireContext;
    }
}
