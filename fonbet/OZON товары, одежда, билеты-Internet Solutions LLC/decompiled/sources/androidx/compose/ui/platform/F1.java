package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.platform.H1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l1.C7803V;
import l1.C7844u;
import l1.InterfaceC7802U;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class F1 implements O0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final RenderNode f40643a = EY.a.a();

    @Override // androidx.compose.ui.platform.O0
    public final void A(int i11) {
        this.f40643a.offsetLeftAndRight(i11);
    }

    @Override // androidx.compose.ui.platform.O0
    public final int B() {
        int bottom;
        bottom = this.f40643a.getBottom();
        return bottom;
    }

    @Override // androidx.compose.ui.platform.O0
    public final void C(float f7) {
        this.f40643a.setPivotX(f7);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void D(float f7) {
        this.f40643a.setPivotY(f7);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void E(Outline outline) {
        this.f40643a.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void F(@NotNull C7803V c7803v, l1.s0 s0Var, @NotNull Function1<? super InterfaceC7802U, Unit> function1) {
        RecordingCanvas beginRecording;
        beginRecording = this.f40643a.beginRecording();
        Canvas v11 = c7803v.a().v();
        c7803v.a().w(beginRecording);
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
        this.f40643a.endRecording();
    }

    @Override // androidx.compose.ui.platform.O0
    public final int G() {
        int right;
        right = this.f40643a.getRight();
        return right;
    }

    @Override // androidx.compose.ui.platform.O0
    public final void H(boolean z11) {
        this.f40643a.setClipToOutline(z11);
    }

    @Override // androidx.compose.ui.platform.O0
    public final boolean I(int i11, int i12, int i13, int i14) {
        boolean position;
        position = this.f40643a.setPosition(i11, i12, i13, i14);
        return position;
    }

    @Override // androidx.compose.ui.platform.O0
    public final boolean J() {
        boolean clipToBounds;
        clipToBounds = this.f40643a.getClipToBounds();
        return clipToBounds;
    }

    @Override // androidx.compose.ui.platform.O0
    public final int K() {
        int top;
        top = this.f40643a.getTop();
        return top;
    }

    @Override // androidx.compose.ui.platform.O0
    public final void L(int i11) {
        this.f40643a.setAmbientShadowColor(i11);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void M(int i11) {
        this.f40643a.setSpotShadowColor(i11);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void c(float f7) {
        this.f40643a.setTranslationY(f7);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void d(float f7) {
        this.f40643a.setCameraDistance(f7);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void e(float f7) {
        this.f40643a.setRotationX(f7);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void f(float f7) {
        this.f40643a.setRotationY(f7);
    }

    @Override // androidx.compose.ui.platform.O0
    public final float getAlpha() {
        float alpha;
        alpha = this.f40643a.getAlpha();
        return alpha;
    }

    @Override // androidx.compose.ui.platform.O0
    public final float getElevation() {
        float elevation;
        elevation = this.f40643a.getElevation();
        return elevation;
    }

    @Override // androidx.compose.ui.platform.O0
    public final int getHeight() {
        int height;
        height = this.f40643a.getHeight();
        return height;
    }

    @Override // androidx.compose.ui.platform.O0
    public final int getLeft() {
        int left;
        left = this.f40643a.getLeft();
        return left;
    }

    @Override // androidx.compose.ui.platform.O0
    public final int getWidth() {
        int width;
        width = this.f40643a.getWidth();
        return width;
    }

    @Override // androidx.compose.ui.platform.O0
    public final void h(float f7) {
        this.f40643a.setRotationZ(f7);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void j(float f7) {
        this.f40643a.setScaleX(f7);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void k(float f7) {
        this.f40643a.setScaleY(f7);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void l(l1.z0 z0Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            G1.f40646a.a(this.f40643a, z0Var);
        }
    }

    @Override // androidx.compose.ui.platform.O0
    public final void n(float f7) {
        this.f40643a.setTranslationX(f7);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void q(int i11) {
        RenderNode renderNode = this.f40643a;
        if (i11 == 1) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (i11 == 2) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.ui.platform.O0
    public final boolean r() {
        boolean hasDisplayList;
        hasDisplayList = this.f40643a.hasDisplayList();
        return hasDisplayList;
    }

    @Override // androidx.compose.ui.platform.O0
    public final void s() {
        this.f40643a.discardDisplayList();
    }

    @Override // androidx.compose.ui.platform.O0
    public final void setAlpha(float f7) {
        this.f40643a.setAlpha(f7);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void t(@NotNull Canvas canvas) {
        canvas.drawRenderNode(this.f40643a);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void u(boolean z11) {
        this.f40643a.setClipToBounds(z11);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void v(float f7) {
        this.f40643a.setElevation(f7);
    }

    @Override // androidx.compose.ui.platform.O0
    public final void w(int i11) {
        this.f40643a.offsetTopAndBottom(i11);
    }

    @Override // androidx.compose.ui.platform.O0
    public final boolean x() {
        boolean hasOverlappingRendering;
        hasOverlappingRendering = this.f40643a.setHasOverlappingRendering(true);
        return hasOverlappingRendering;
    }

    @Override // androidx.compose.ui.platform.O0
    public final boolean y() {
        boolean clipToOutline;
        clipToOutline = this.f40643a.getClipToOutline();
        return clipToOutline;
    }

    @Override // androidx.compose.ui.platform.O0
    public final void z(@NotNull Matrix matrix) {
        this.f40643a.getMatrix(matrix);
    }
}
