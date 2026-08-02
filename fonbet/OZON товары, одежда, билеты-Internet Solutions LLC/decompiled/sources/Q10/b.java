package Q10;

import L3.m;
import O10.e;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.C5316f0;
import hd.C6915b;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class b extends LinearLayout implements a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f22923a;

    /* renamed from: b, reason: collision with root package name */
    private float f22924b;

    /* renamed from: c, reason: collision with root package name */
    private float f22925c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f22926d;

    /* renamed from: e, reason: collision with root package name */
    private int f22927e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context, @NotNull Function0<Unit> updateHeightListener) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(updateHeightListener, "updateHeightListener");
        this.f22923a = updateHeightListener;
        this.f22927e = -1;
        setId(R.id.stickyContainer);
        setOrientation(1);
    }

    private final int i() {
        if (this.f22926d) {
            this.f22926d = false;
            this.f22927e = -1;
            Integer j11 = j(this);
            if (j11 != null) {
                int intValue = j11.intValue();
                String b11 = O10.d.b(c(intValue)).b();
                while (intValue >= 0 && c.a(c(intValue), b11)) {
                    intValue--;
                }
                this.f22927e = intValue + 1;
            }
        }
        return this.f22927e;
    }

    private static Integer j(b bVar) {
        Integer valueOf = Integer.valueOf(bVar.getChildCount() - 1);
        if (bVar.getChildCount() > 0) {
            return valueOf;
        }
        return null;
    }

    private final float k(float f7) {
        return Math.max(0.0f, Math.min(l(), f7));
    }

    private final float l() {
        if (this.f22926d) {
            n();
        }
        return this.f22925c;
    }

    private void m(float f7) {
        Integer j11;
        float k11 = k(f7);
        float f11 = this.f22924b;
        if (f11 == k11) {
            return;
        }
        if (f11 != k11 && (j11 = j(this)) != null) {
            int intValue = j11.intValue();
            int c11 = C6915b.c(f11);
            int c12 = C6915b.c(k11);
            int childCount = getChildCount();
            int i11 = -1;
            int i12 = -1;
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (i11 != -1 && i12 != -1) {
                    break;
                }
                IntRange intRange = new IntRange(childAt.getTop(), childAt.getBottom(), 1);
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
        this.f22923a.invoke();
        if (k11 == l() && i() != 0 && i() > 0) {
            if (isLayoutRequested()) {
                Intrinsics.checkNotNullParameter(this, "<this>");
                post(new m(this, 5));
            }
            removeViews(0, i());
        }
        setTranslationY(-k11);
        this.f22924b = k11;
        if (k11 == 0.0f) {
            n();
        }
    }

    private final void n() {
        Integer j11;
        this.f22925c = 0.0f;
        if (i() == -1 || (j11 = j(this)) == null) {
            return;
        }
        int intValue = j11.intValue();
        if (intValue >= 0) {
            int i11 = 0;
            while (true) {
                View c11 = c(i11);
                if (i11 >= i() && !O10.d.b(c11).c()) {
                    break;
                }
                this.f22925c = l() + c11.getHeight();
                if (i11 == intValue) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        if (this.f22924b > l()) {
            m(k(this.f22924b));
        }
    }

    @Override // Q10.a
    public final void a() {
        if (!isEmpty()) {
            removeAllViews();
        }
        m(0.0f);
        this.f22925c = 0.0f;
        this.f22926d = true;
        this.f22927e = -1;
    }

    @Override // Q10.a
    public final void b(@NotNull List<? extends View> views) {
        Intrinsics.checkNotNullParameter(views, "views");
        Iterator<T> it = views.iterator();
        while (it.hasNext()) {
            addView((View) it.next(), getChildCount());
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
        return getMeasuredHeight() - this.f22924b;
    }

    @Override // Q10.a
    public final View e() {
        Integer j11 = j(this);
        if (j11 != null) {
            return c(j11.intValue());
        }
        return null;
    }

    @Override // Q10.a
    public final void f(@NotNull List<? extends View> views) {
        Intrinsics.checkNotNullParameter(views, "views");
        a();
        int i11 = 0;
        for (Object obj : views) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            addView((View) obj, i11);
            i11 = i12;
        }
    }

    @Override // Q10.a
    public final View g() {
        View view = (View) l.l(C5316f0.b(this));
        if (view == null) {
            return null;
        }
        e.a(view);
        return view;
    }

    @Override // Q10.a
    public final float getCurrentOffset() {
        return this.f22924b;
    }

    @Override // Q10.a
    public final void h(float f7, float f11) {
        this.f22925c = f7;
        m(f11);
    }

    @Override // Q10.a
    public final boolean isEmpty() {
        return getChildCount() == 0;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (z11 || this.f22926d) {
            n();
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.f22926d = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f22926d = true;
    }

    @Override // Q10.a
    public final void scrollBy(int i11) {
        m(this.f22924b + i11);
    }
}
