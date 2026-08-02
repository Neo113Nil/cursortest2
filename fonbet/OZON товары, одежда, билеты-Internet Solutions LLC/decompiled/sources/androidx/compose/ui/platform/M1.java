package androidx.compose.ui.platform;

import android.graphics.Rect;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class M1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final I1.r f40723a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Rect f40724b;

    public M1(@NotNull I1.r rVar, @NotNull Rect rect) {
        this.f40723a = rVar;
        this.f40724b = rect;
    }

    @NotNull
    public final Rect a() {
        return this.f40724b;
    }

    @NotNull
    public final I1.r b() {
        return this.f40723a;
    }
}
