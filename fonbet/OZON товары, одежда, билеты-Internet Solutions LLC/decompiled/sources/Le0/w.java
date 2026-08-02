package Le0;

import android.annotation.SuppressLint;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.maps.MapView;

@SuppressLint({"ViewConstructor", "ClickableViewAccessibility"})
/* loaded from: classes3.dex */
public final class w extends MapView {
    public final void i(@NotNull View.OnTouchListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        super.setOnTouchListener(listener);
    }

    @Override // android.view.View
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
    }
}
