package H30;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase;

/* loaded from: classes3.dex */
public final class m {
    public static final void a(@NotNull androidx.appcompat.app.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        d(gVar, false);
    }

    public static final void b(@NotNull FintechWebViewFragmentBase fintechWebViewFragmentBase) {
        Intrinsics.checkNotNullParameter(fintechWebViewFragmentBase, "<this>");
        androidx.fragment.app.r activity = fintechWebViewFragmentBase.getActivity();
        if (activity != null && (activity instanceof androidx.appcompat.app.g)) {
            d((androidx.appcompat.app.g) activity, false);
        }
    }

    public static final void c(@NotNull androidx.appcompat.app.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        d(gVar, true);
    }

    private static final void d(androidx.appcompat.app.g gVar, boolean z11) {
        View currentFocus = gVar.getCurrentFocus();
        if (currentFocus == null) {
            return;
        }
        Object systemService = gVar.getSystemService("input_method");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        if (z11) {
            inputMethodManager.showSoftInput(currentFocus, 1);
        } else {
            if (z11) {
                throw new Sc.o();
            }
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
            currentFocus.clearFocus();
        }
    }
}
