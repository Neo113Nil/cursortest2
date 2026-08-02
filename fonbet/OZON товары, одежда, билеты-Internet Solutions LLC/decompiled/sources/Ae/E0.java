package Ae;

import De.C2857A;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import ze.EnumC11113a;

/* loaded from: classes.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2857A f797a = new C2857A("NO_VALUE");

    @NotNull
    public static final C0 a(int i11, int i12, @NotNull EnumC11113a enumC11113a) {
        if (i11 < 0) {
            throw new IllegalArgumentException(Ej.b.a(i11, "replay cannot be negative, but was ").toString());
        }
        if (i12 < 0) {
            throw new IllegalArgumentException(Ej.b.a(i12, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i11 <= 0 && i12 <= 0 && enumC11113a != EnumC11113a.SUSPEND) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC11113a).toString());
        }
        int i13 = i12 + i11;
        if (i13 < 0) {
            i13 = Integer.MAX_VALUE;
        }
        return new C0(i11, i13, enumC11113a);
    }

    public static /* synthetic */ C0 b(int i11, int i12, EnumC11113a enumC11113a, int i13) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        if ((i13 & 4) != 0) {
            enumC11113a = EnumC11113a.SUSPEND;
        }
        return a(i11, i12, enumC11113a);
    }

    public static final void c(Object[] objArr, long j11, Object obj) {
        objArr[((int) j11) & (objArr.length - 1)] = obj;
    }

    @NotNull
    public static final <T> InterfaceC2395h<T> d(@NotNull B0<? extends T> b02, @NotNull CoroutineContext coroutineContext, int i11, @NotNull EnumC11113a enumC11113a) {
        return ((i11 == 0 || i11 == -3) && enumC11113a == EnumC11113a.SUSPEND) ? b02 : new Be.l(i11, b02, coroutineContext, enumC11113a);
    }
}
