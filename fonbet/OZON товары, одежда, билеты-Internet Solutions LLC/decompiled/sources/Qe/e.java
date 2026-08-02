package Qe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class e extends d {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23337c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull j writer, boolean z11) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f23337c = z11;
    }

    @Override // Qe.d
    public final void k(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f23337c) {
            super.k(value);
        } else {
            i(value);
        }
    }
}
