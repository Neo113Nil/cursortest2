package Dc0;

import android.view.WindowManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class A extends AbstractC7737t implements Function0<WindowManager> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f6410b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A(q qVar) {
        super(0);
        this.f6410b = qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final WindowManager invoke() {
        WindowManager windowManager = this.f6410b.requireActivity().getWindowManager();
        Intrinsics.checkNotNullExpressionValue(windowManager, "getWindowManager(...)");
        return windowManager;
    }
}
