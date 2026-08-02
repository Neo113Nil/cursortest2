package O0;

import android.R;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import hd.C6915b;
import k1.C7459e;
import k1.C7464j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t0.s;

/* loaded from: classes8.dex */
public final class r extends View {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final int[] f19799f = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final int[] f19800g = new int[0];

    /* renamed from: a, reason: collision with root package name */
    private w f19801a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f19802b;

    /* renamed from: c, reason: collision with root package name */
    private Long f19803c;

    /* renamed from: d, reason: collision with root package name */
    private L3.m f19804d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC7737t f19805e;

    public static void a(r rVar) {
        w wVar = rVar.f19801a;
        if (wVar != null) {
            wVar.setState(f19800g);
        }
        rVar.f19804d = null;
    }

    private final void f(boolean z11) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f19804d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l11 = this.f19803c;
        long longValue = currentAnimationTimeMillis - (l11 != null ? l11.longValue() : 0L);
        if (z11 || longValue >= 5) {
            int[] iArr = z11 ? f19799f : f19800g;
            w wVar = this.f19801a;
            if (wVar != null) {
                wVar.setState(iArr);
            }
        } else {
            L3.m mVar = new L3.m(this, 2);
            this.f19804d = mVar;
            postDelayed(mVar, 50L);
        }
        this.f19803c = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(@NotNull s.b bVar, boolean z11, long j11, int i11, long j12, float f7, @NotNull Function0<Unit> function0) {
        if (this.f19801a == null || !Boolean.valueOf(z11).equals(this.f19802b)) {
            w wVar = new w(z11);
            setBackground(wVar);
            this.f19801a = wVar;
            this.f19802b = Boolean.valueOf(z11);
        }
        w wVar2 = this.f19801a;
        Intrinsics.f(wVar2);
        this.f19805e = (AbstractC7737t) function0;
        wVar2.b(i11);
        e(j11, j12, f7);
        if (z11) {
            wVar2.setHotspot(C7459e.g(bVar.a()), C7459e.h(bVar.a()));
        } else {
            wVar2.setHotspot(wVar2.getBounds().centerX(), wVar2.getBounds().centerY());
        }
        f(true);
    }

    public final void c() {
        this.f19805e = null;
        L3.m mVar = this.f19804d;
        if (mVar != null) {
            removeCallbacks(mVar);
            L3.m mVar2 = this.f19804d;
            Intrinsics.f(mVar2);
            mVar2.run();
        } else {
            w wVar = this.f19801a;
            if (wVar != null) {
                wVar.setState(f19800g);
            }
        }
        w wVar2 = this.f19801a;
        if (wVar2 == null) {
            return;
        }
        wVar2.setVisible(false, false);
        unscheduleDrawable(wVar2);
    }

    public final void d() {
        f(false);
    }

    public final void e(long j11, long j12, float f7) {
        w wVar = this.f19801a;
        if (wVar == null) {
            return;
        }
        wVar.a(f7, j12);
        Rect rect = new Rect(0, 0, C6915b.c(C7464j.f(j11)), C6915b.c(C7464j.d(j11)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        wVar.setBounds(rect);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NotNull Drawable drawable) {
        ?? r12 = this.f19805e;
        if (r12 != 0) {
            r12.invoke();
        }
    }

    @Override // android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}
