package androidx.media3.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l3.C7855a;
import x4.C10655a;

/* loaded from: classes8.dex */
final class a extends View {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f44207a;

    /* renamed from: b, reason: collision with root package name */
    private List<C7855a> f44208b;

    /* renamed from: c, reason: collision with root package name */
    private float f44209c;

    /* renamed from: d, reason: collision with root package name */
    private C10655a f44210d;

    /* renamed from: e, reason: collision with root package name */
    private float f44211e;

    public a(Context context) {
        super(context, null);
        this.f44207a = new ArrayList();
        this.f44208b = Collections.EMPTY_LIST;
        this.f44209c = 0.0533f;
        this.f44210d = C10655a.f105010g;
        this.f44211e = 0.08f;
    }

    public final void a(List list, C10655a c10655a, float f7, float f11) {
        this.f44208b = list;
        this.f44210d = c10655a;
        this.f44209c = f7;
        this.f44211e = f11;
        while (true) {
            ArrayList arrayList = this.f44207a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new w(getContext()));
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f11;
        List<C7855a> list = this.f44208b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i11 = paddingBottom - paddingTop;
        float f12 = this.f44209c;
        float f13 = -3.4028235E38f;
        float f14 = f12 == -3.4028235E38f ? -3.4028235E38f : f12 * i11;
        if (f14 <= 0.0f) {
            return;
        }
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            C7855a c7855a = list.get(i13);
            if (c7855a.f72614p != Integer.MIN_VALUE) {
                C7855a.C1210a a11 = c7855a.a();
                a11.k(f13);
                a11.l(LinearLayoutManager.INVALID_OFFSET);
                a11.p(null);
                int i14 = c7855a.f72604f;
                f7 = f13;
                float f15 = c7855a.f72603e;
                if (i14 == 0) {
                    a11.h(1.0f - f15, i12);
                } else {
                    a11.h((-f15) - 1.0f, 1);
                }
                int i15 = c7855a.f72605g;
                if (i15 == 0) {
                    a11.i(2);
                } else if (i15 == 2) {
                    a11.i(i12);
                }
                c7855a = a11.a();
            } else {
                f7 = f13;
            }
            float f16 = c7855a.f72613o;
            if (f16 != f7) {
                int i16 = c7855a.f72612n;
                if (i16 == 0) {
                    f11 = i11;
                } else if (i16 == 1) {
                    f11 = height;
                } else if (i16 == 2) {
                    ((w) this.f44207a.get(i13)).a(c7855a, this.f44210d, f14, f16, this.f44211e, canvas, paddingLeft, paddingTop, width, paddingBottom);
                    i13++;
                    size = size;
                    i12 = i12;
                    f13 = f7;
                }
                f16 *= f11;
                ((w) this.f44207a.get(i13)).a(c7855a, this.f44210d, f14, f16, this.f44211e, canvas, paddingLeft, paddingTop, width, paddingBottom);
                i13++;
                size = size;
                i12 = i12;
                f13 = f7;
            }
            f16 = f7;
            ((w) this.f44207a.get(i13)).a(c7855a, this.f44210d, f14, f16, this.f44211e, canvas, paddingLeft, paddingTop, width, paddingBottom);
            i13++;
            size = size;
            i12 = i12;
            f13 = f7;
        }
    }
}
