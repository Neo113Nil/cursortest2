package androidx.activity;

import android.window.BackEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.activity.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5034a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C5034a f36949a = new C5034a();

    @NotNull
    public final BackEvent a(float f7, float f11, float f12, int i11) {
        return new BackEvent(f7, f11, f12, i11);
    }

    public final float b(@NotNull BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(@NotNull BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(@NotNull BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(@NotNull BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
