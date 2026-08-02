package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.H1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l1.C7803V;
import l1.C7844u;
import l1.InterfaceC7802U;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.v1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5292v1 implements O0 {

    /* renamed from: g, reason: collision with root package name */
    private static boolean f41030g = true;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final RenderNode f41031a;

    /* renamed from: b, reason: collision with root package name */
    private int f41032b;

    /* renamed from: c, reason: collision with root package name */
    private int f41033c;

    /* renamed from: d, reason: collision with root package name */
    private int f41034d;

    /* renamed from: e, reason: collision with root package name */
    private int f41035e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f41036f;

    public C5292v1(@NotNull AndroidComposeView androidComposeView) {
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        this.f41031a = create;
        if (f41030g) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                J1 j12 = J1.f40667a;
                j12.c(create, j12.a(create));
                j12.d(create, j12.b(create));
            }
            I1.f40664a.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            f41030g = false;
        }
    }

    @Override // androidx.compose.ui.platform.O0
    public final void A(int i11) {
        this.f41032b += i11;
        this.f41034d += i11;
        this.f41031a.offsetLeftAndRight(i11);
    }

    @Override // androidx.compose.ui.platform.O0
    public final int B() {
        return this.f41035e;
    }

    @Override // androidx.compose.ui.platform.O0
    public final void C(float f7) {
        this.f41031a.setPivotX(f7);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void D(float f7) {
        this.f41031a.setPivotY(f7);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void E(Outline outline) {
        this.f41031a.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void F(@NotNull C7803V c7803v, l1.s0 s0Var, @NotNull Function1<? super InterfaceC7802U, Unit> function1) {
        DisplayListCanvas start = this.f41031a.start(getWidth(), getHeight());
        Canvas v11 = c7803v.a().v();
        c7803v.a().w((Canvas) start);
        C7844u a11 = c7803v.a();
        if (s0Var != null) {
            a11.save();
            a11.u(s0Var);
        }
        ((H1.b) function1).invoke(a11);
        if (s0Var != null) {
            a11.p();
        }
        c7803v.a().w(v11);
        this.f41031a.end(start);
    }

    @Override // androidx.compose.ui.platform.O0
    public final int G() {
        return this.f41034d;
    }

    @Override // androidx.compose.ui.platform.O0
    public final void H(boolean z11) {
        this.f41031a.setClipToOutline(z11);
    }

    @Override // androidx.compose.ui.platform.O0
    public final boolean I(int i11, int i12, int i13, int i14) {
        this.f41032b = i11;
        this.f41033c = i12;
        this.f41034d = i13;
        this.f41035e = i14;
        return this.f41031a.setLeftTopRightBottom(i11, i12, i13, i14);
    }

    @Override // androidx.compose.ui.platform.O0
    public final boolean J() {
        return this.f41036f;
    }

    @Override // androidx.compose.ui.platform.O0
    public final int K() {
        return this.f41033c;
    }

    @Override // androidx.compose.ui.platform.O0
    public final void L(int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            J1.f40667a.c(this.f41031a, i11);
        }
    }

    @Override // androidx.compose.ui.platform.O0
    public final void M(int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            J1.f40667a.d(this.f41031a, i11);
        }
    }

    @Override // androidx.compose.ui.platform.O0
    public final void c(float f7) {
        this.f41031a.setTranslationY(f7);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void d(float f7) {
        this.f41031a.setCameraDistance(-f7);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void e(float f7) {
        this.f41031a.setRotationX(f7);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void f(float f7) {
        this.f41031a.setRotationY(f7);
    }

    @Override // androidx.compose.ui.platform.O0
    public final float getAlpha() {
        return this.f41031a.getAlpha();
    }

    @Override // androidx.compose.ui.platform.O0
    public final float getElevation() {
        return this.f41031a.getElevation();
    }

    @Override // androidx.compose.ui.platform.O0
    public final int getHeight() {
        return this.f41035e - this.f41033c;
    }

    @Override // androidx.compose.ui.platform.O0
    public final int getLeft() {
        return this.f41032b;
    }

    @Override // androidx.compose.ui.platform.O0
    public final int getWidth() {
        return this.f41034d - this.f41032b;
    }

    @Override // androidx.compose.ui.platform.O0
    public final void h(float f7) {
        this.f41031a.setRotation(f7);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void j(float f7) {
        this.f41031a.setScaleX(f7);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void k(float f7) {
        this.f41031a.setScaleY(f7);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void l(l1.z0 z0Var) {
    }

    @Override // androidx.compose.ui.platform.O0
    public final void n(float f7) {
        this.f41031a.setTranslationX(f7);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void q(int i11) {
        if (i11 == 1) {
            this.f41031a.setLayerType(2);
            this.f41031a.setHasOverlappingRendering(true);
        } else if (i11 == 2) {
            this.f41031a.setLayerType(0);
            this.f41031a.setHasOverlappingRendering(false);
        } else {
            this.f41031a.setLayerType(0);
            this.f41031a.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.ui.platform.O0
    public final boolean r() {
        return this.f41031a.isValid();
    }

    @Override // androidx.compose.ui.platform.O0
    public final void s() {
        I1.f40664a.a(this.f41031a);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void setAlpha(float f7) {
        this.f41031a.setAlpha(f7);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void t(@NotNull Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f41031a);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void u(boolean z11) {
        this.f41036f = z11;
        this.f41031a.setClipToBounds(z11);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void v(float f7) {
        this.f41031a.setElevation(f7);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void w(int i11) {
        this.f41033c += i11;
        this.f41035e += i11;
        this.f41031a.offsetTopAndBottom(i11);
    }

    @Override // androidx.compose.ui.platform.O0
    public final boolean x() {
        return this.f41031a.setHasOverlappingRendering(true);
    }

    @Override // androidx.compose.ui.platform.O0
    public final boolean y() {
        return this.f41031a.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.O0
    public final void z(@NotNull Matrix matrix) {
        this.f41031a.getMatrix(matrix);
    }
}
