package androidx.compose.ui.platform;

import android.content.ClipData;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ClipData f40645a;

    public G0(@NotNull ClipData clipData) {
        this.f40645a = clipData;
    }

    @NotNull
    public final ClipData a() {
        return this.f40645a;
    }

    @NotNull
    public final void b() {
        this.f40645a.getDescription();
    }
}
