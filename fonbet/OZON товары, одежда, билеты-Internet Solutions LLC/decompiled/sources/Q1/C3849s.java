package Q1;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Q1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3849s extends AbstractC7737t implements Function0<InputMethodManager> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3850t f22915b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3849s(C3850t c3850t) {
        super(0);
        this.f22915b = c3850t;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InputMethodManager invoke() {
        View view;
        view = this.f22915b.f22916a;
        Object systemService = view.getContext().getSystemService("input_method");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }
}
