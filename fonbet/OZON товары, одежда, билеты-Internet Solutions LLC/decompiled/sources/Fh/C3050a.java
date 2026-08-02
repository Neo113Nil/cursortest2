package Fh;

import Pj.C3828f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Fh.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3050a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3828f f9469a;

    public C3050a(@NotNull C3828f settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f9469a = settings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3050a) && Intrinsics.d(this.f9469a, ((C3050a) obj).f9469a);
    }

    public final int hashCode() {
        return this.f9469a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ToggleAddonWrapperPreset(settings=" + this.f9469a + ")";
    }
}
