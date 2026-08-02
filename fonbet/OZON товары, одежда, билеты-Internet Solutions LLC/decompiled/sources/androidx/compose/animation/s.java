package androidx.compose.animation;

import java.util.LinkedHashMap;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import l0.J;
import l0.a0;
import l0.g0;
import l0.k0;
import l0.n0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final s f38816a = new t(new n0((a0) null, (k0) null, (J) null, (g0) null, (LinkedHashMap) null, 63));

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final s f38817b = new t(new n0((a0) null, (k0) null, (J) null, (g0) null, (LinkedHashMap) null, 47));

    public /* synthetic */ s(int i11) {
        this();
    }

    @NotNull
    public abstract n0 b();

    @NotNull
    public final s c(@NotNull s sVar) {
        a0 c11 = sVar.b().c();
        if (c11 == null) {
            c11 = b().c();
        }
        k0 f7 = sVar.b().f();
        if (f7 == null) {
            f7 = b().f();
        }
        J a11 = sVar.b().a();
        if (a11 == null) {
            a11 = b().a();
        }
        g0 e11 = sVar.b().e();
        if (e11 == null) {
            e11 = b().e();
        }
        return new t(new n0(c11, f7, a11, e11, sVar.b().d() || b().d(), U.m(b().b(), sVar.b().b())));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s) && Intrinsics.d(((s) obj).b(), b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    @NotNull
    public final String toString() {
        if (equals(f38816a)) {
            return "ExitTransition.None";
        }
        if (equals(f38817b)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        n0 b11 = b();
        StringBuilder sb2 = new StringBuilder("ExitTransition: \nFade - ");
        a0 c11 = b11.c();
        sb2.append(c11 != null ? c11.toString() : null);
        sb2.append(",\nSlide - ");
        k0 f7 = b11.f();
        sb2.append(f7 != null ? f7.toString() : null);
        sb2.append(",\nShrink - ");
        J a11 = b11.a();
        sb2.append(a11 != null ? a11.toString() : null);
        sb2.append(",\nScale - ");
        g0 e11 = b11.e();
        sb2.append(e11 != null ? e11.toString() : null);
        sb2.append(",\nKeepUntilTransitionsFinished - ");
        sb2.append(b11.d());
        return sb2.toString();
    }

    private s() {
    }
}
