package U50;

import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public interface d extends c {
    @NotNull
    NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull String str);
}
