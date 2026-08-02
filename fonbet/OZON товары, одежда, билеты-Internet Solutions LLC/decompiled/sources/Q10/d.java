package Q10;

import H00.b;
import L3.m;
import N10.f;
import O10.e;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import hd.C6915b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class d extends ViewGroup implements a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f22928a;

    /* renamed from: b, reason: collision with root package name */
    private float f22929b;

    /* renamed from: c, reason: collision with root package name */
    private float f22930c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f22931d;

    /* renamed from: e, reason: collision with root package name */
    private int f22932e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context, @NotNull Function0<Unit> onHeightUpdated) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onHeightUpdated, "onHeightUpdated");
        this.f22928a = onHeightUpdated;
        this.f22932e = -1;
        setId(R.id.stickyContainer);
    }

    private final float j(float f7) {
        return h.d(f7, 0.0f, m());
    }

    private final int k() {
        if (this.f22931d) {
            this.f22931d = false;
            this.f22932e = -1;
            Integer l11 = l(this);
            if (l11 != null) {
                int intValue = l11.intValue();
                int i11 = intValue - 1;
                String b11 = O10.d.b(c(intValue)).b();
                while (i11 >= 0 && c.a(c(i11), b11)) {
                    i11--;
                }
                this.f22932e = i11 + 1;
            }
        }
        return this.f22932e;
    }

    private static Integer l(d dVar) {
        Integer valueOf = Integer.valueOf(dVar.getChildCount() - 1);
        if (dVar.getChildCount() != 0) {
            return valueOf;
        }
        return null;
    }

    private final float m() {
        if (this.f22931d) {
            o();
        }
        return this.f22930c;
    }

    private void n(float f7) {
        int k11;
        Integer l11;
        float j11 = j(f7);
        float f11 = this.f22929b;
        if (f11 == j11) {
            return;
        }
        if (f11 != j11 && (l11 = l(this)) != null) {
            int intValue = l11.intValue();
            int c11 = C6915b.c(f11);
            int c12 = C6915b.c(j11);
            int childCount = getChildCount();
            int i11 = -1;
            int i12 = -1;
            for (int i13 = 0; i13 < childCount; i13++) {
                View c13 = c(i13);
                if (i11 != -1 && i12 != -1) {
                    break;
                }
                int top = c13.getTop();
                O10.d.b(c13).d().getClass();
                int bottom = c13.getBottom();
                O10.d.b(c13).d().getClass();
                IntRange intRange = new IntRange(top, bottom, 1);
                int f71842a = intRange.getF71842a();
                if (c12 <= intRange.getF71843b() && f71842a <= c12) {
                    i11 = i13;
                }
                int f71842a2 = intRange.getF71842a();
                if (c11 <= intRange.getF71843b() && f71842a2 <= c11) {
                    i12 = i13;
                }
            }
            if (i12 != -1) {
                intValue = i12;
            }
            if (i11 != -1) {
                if (i11 >= intValue) {
                    O10.d.b(c(i11));
                } else if (i11 <= intValue) {
                    while (true) {
                        O10.d.b(c(i11));
                        if (i11 == intValue) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
            }
        }
        this.f22928a.invoke();
        if (j11 == m() && k() != 0 && (k11 = k()) > 0) {
            if (isLayoutRequested()) {
                Intrinsics.checkNotNullParameter(this, "<this>");
                post(new m(this, 5));
            }
            removeViews(0, k11);
        }
        setTranslationY(-j11);
        this.f22929b = j11;
        if (j11 == 0.0f) {
            o();
        }
    }

    private final void o() {
        Integer l11;
        this.f22930c = 0.0f;
        if (k() == -1 || (l11 = l(this)) == null) {
            return;
        }
        int intValue = l11.intValue();
        for (int i11 = 0; i11 <= intValue; i11++) {
            View c11 = c(i11);
            if (i11 >= k() && !O10.d.b(c11).c()) {
                break;
            }
            f d11 = O10.d.b(c11).d();
            float m11 = m();
            int height = c11.getHeight();
            d11.getClass();
            this.f22930c = m11 + height;
        }
        if (this.f22929b > m()) {
            n(j(this.f22929b));
        }
    }

    @Override // Q10.a
    public final void a() {
        if (!isEmpty()) {
            removeAllViews();
        }
        n(0.0f);
        this.f22930c = 0.0f;
        this.f22931d = true;
        this.f22932e = -1;
    }

    @Override // Q10.a
    public final void b(@NotNull List<? extends View> views) {
        Intrinsics.checkNotNullParameter(views, "views");
        int size = views.size();
        for (int i11 = 0; i11 < size; i11++) {
            addView(views.get(i11), getChildCount());
        }
    }

    @Override // Q10.a
    @NotNull
    public final View c(int i11) {
        View childAt = getChildAt(i11);
        Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
        e.a(childAt);
        return childAt;
    }

    @Override // Q10.a
    public final float d() {
        float i11 = i();
        View e11 = e();
        if (e11 != null) {
            O10.d.b(e11);
        }
        return i11 - 0;
    }

    @Override // Q10.a
    public final View e() {
        Integer l11 = l(this);
        if (l11 != null) {
            return c(l11.intValue());
        }
        return null;
    }

    @Override // Q10.a
    public final void f(@NotNull List<? extends View> views) {
        Intrinsics.checkNotNullParameter(views, "views");
        a();
        b(views);
    }

    @Override // Q10.a
    public final View g() {
        return c(0);
    }

    @Override // Q10.a
    public final float getCurrentOffset() {
        return this.f22929b;
    }

    @Override // Q10.a
    public final void h(float f7, float f11) {
        this.f22930c = f7;
        n(f11);
    }

    public final float i() {
        return getMeasuredHeight() - this.f22929b;
    }

    @Override // Q10.a
    public final boolean isEmpty() {
        return getChildCount() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    @SuppressLint({"DrawAllocation"})
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int intValue;
        int paddingLeft = ((getPaddingLeft() + (i13 + i11)) - getPaddingRight()) / 2;
        if (paddingLeft < 0 && H00.b.a() != b.a.C0214a.a()) {
            H00.b.a().logError(new IllegalStateException("У StickyViewGroup неправильно заданы размеры для рассчёта ширины"));
        }
        Integer l11 = l(this);
        if (l11 != null && (intValue = l11.intValue()) >= 0) {
            int i15 = 0;
            while (true) {
                View childAt = getChildAt(i15);
                Intrinsics.f(childAt);
                if (childAt.getVisibility() != 8) {
                    e.a(childAt);
                    f d11 = O10.d.b(childAt).d();
                    int measuredWidth = paddingLeft - (childAt.getMeasuredWidth() / 2);
                    int measuredWidth2 = childAt.getMeasuredWidth() + measuredWidth;
                    d11.getClass();
                    int measuredHeight = childAt.getMeasuredHeight() + i12;
                    childAt.layout(measuredWidth, i12, measuredWidth2, measuredHeight);
                    i12 = measuredHeight;
                }
                if (i15 == intValue) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        if (z11 || this.f22931d) {
            o();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        int intValue;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int size = View.MeasureSpec.getSize(i11);
        Integer l11 = l(this);
        int i13 = 0;
        if (l11 != null && (intValue = l11.intValue()) >= 0) {
            int i14 = 0;
            int i15 = 0;
            while (true) {
                View childAt = getChildAt(i14);
                Intrinsics.f(childAt);
                if (childAt.getVisibility() != 8) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    childAt.measure(ViewGroup.getChildMeasureSpec(i11, (marginLayoutParams != null ? marginLayoutParams.leftMargin + marginLayoutParams.rightMargin : 0) + paddingRight, childAt.getLayoutParams().width), ViewGroup.getChildMeasureSpec(i12, 0, childAt.getLayoutParams().height));
                    e.a(childAt);
                    O10.d.b(childAt).d().getClass();
                    i15 += childAt.getMeasuredHeight();
                }
                if (i14 == intValue) {
                    break;
                } else {
                    i14++;
                }
            }
            i13 = i15;
        }
        View e11 = e();
        if (e11 != null) {
            O10.d.b(e11);
        }
        setMeasuredDimension(size, i13);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.f22931d = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f22931d = true;
    }

    @Override // Q10.a
    public final void scrollBy(int i11) {
        n(this.f22929b + i11);
    }
}
