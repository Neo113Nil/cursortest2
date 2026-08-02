package Ig;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final long f12486a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f12487b;

    public a(long j11, @NotNull String messageString) {
        Intrinsics.checkNotNullParameter(messageString, "messageString");
        this.f12486a = j11;
        this.f12487b = messageString;
    }

    public final void a(int i11, @NotNull StringBuilder out) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.append("#");
        out.append((CharSequence) String.valueOf(i11));
        out.append(" ");
        out.append((CharSequence) String.valueOf(this.f12486a));
        out.append(" | ");
        out.append((CharSequence) this.f12487b);
        out.append("\n");
    }
}
