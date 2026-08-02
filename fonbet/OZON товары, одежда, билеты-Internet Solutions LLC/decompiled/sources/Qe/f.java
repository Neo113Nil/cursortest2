package Qe;

import Sc.A;
import Sc.C;
import Sc.F;
import Sc.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class f extends d {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23338c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull j writer, boolean z11) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f23338c = z11;
    }

    @Override // Qe.d
    public final void e(byte b11) {
        if (this.f23338c) {
            y.Companion companion = y.INSTANCE;
            k(String.valueOf(b11 & 255));
        } else {
            y.Companion companion2 = y.INSTANCE;
            i(String.valueOf(b11 & 255));
        }
    }

    @Override // Qe.d
    public final void g(int i11) {
        if (this.f23338c) {
            A.Companion companion = A.INSTANCE;
            k(Integer.toUnsignedString(i11));
        } else {
            A.Companion companion2 = A.INSTANCE;
            i(Integer.toUnsignedString(i11));
        }
    }

    @Override // Qe.d
    public final void h(long j11) {
        if (this.f23338c) {
            C.Companion companion = C.INSTANCE;
            k(Long.toUnsignedString(j11));
        } else {
            C.Companion companion2 = C.INSTANCE;
            i(Long.toUnsignedString(j11));
        }
    }

    @Override // Qe.d
    public final void j(short s11) {
        if (this.f23338c) {
            F.Companion companion = F.INSTANCE;
            k(String.valueOf(s11 & 65535));
        } else {
            F.Companion companion2 = F.INSTANCE;
            i(String.valueOf(s11 & 65535));
        }
    }
}
