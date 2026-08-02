package androidx.compose.ui.platform;

import K1.C3422b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface I0 {
    default G0 a() {
        return null;
    }

    default boolean b() {
        C3422b text = getText();
        return text != null && text.length() > 0;
    }

    void c(@NotNull C3422b c3422b);

    C3422b getText();
}
