package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l1.C7803V;
import l1.InterfaceC7802U;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public interface O0 {
    void A(int i11);

    int B();

    void C(float f7);

    void D(float f7);

    void E(Outline outline);

    void F(@NotNull C7803V c7803v, l1.s0 s0Var, @NotNull Function1<? super InterfaceC7802U, Unit> function1);

    int G();

    void H(boolean z11);

    boolean I(int i11, int i12, int i13, int i14);

    boolean J();

    int K();

    void L(int i11);

    void M(int i11);

    void c(float f7);

    void d(float f7);

    void e(float f7);

    void f(float f7);

    float getAlpha();

    float getElevation();

    int getHeight();

    int getLeft();

    int getWidth();

    void h(float f7);

    void j(float f7);

    void k(float f7);

    void l(l1.z0 z0Var);

    void n(float f7);

    void q(int i11);

    boolean r();

    void s();

    void setAlpha(float f7);

    void t(@NotNull Canvas canvas);

    void u(boolean z11);

    void v(float f7);

    void w(int i11);

    boolean x();

    boolean y();

    void z(@NotNull Matrix matrix);
}
