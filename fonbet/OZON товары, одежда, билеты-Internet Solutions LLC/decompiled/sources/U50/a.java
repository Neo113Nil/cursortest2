package U50;

import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public interface a extends c {
    void handle(WeakReference<FintechWebView> weakReference, @NotNull String str, @NotNull Function1<? super NativeResult, Unit> function1);
}
