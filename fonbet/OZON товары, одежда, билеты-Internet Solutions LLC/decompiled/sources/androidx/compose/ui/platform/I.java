package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewStructure;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class I {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final I f40663a = new I();

    public final void a(@NotNull ViewStructure viewStructure, @NotNull View view) {
        viewStructure.setClassName(view.getAccessibilityClassName().toString());
    }
}
