package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    protected final RecyclerView.o f45026a;

    /* renamed from: b, reason: collision with root package name */
    private int f45027b = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: c, reason: collision with root package name */
    final Rect f45028c = new Rect();

    static class a extends w {
        @Override // androidx.recyclerview.widget.w
        public final int d(View view) {
            return this.f45026a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.w
        public final int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f45026a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.w
        public final int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f45026a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.w
        public final int g(View view) {
            return this.f45026a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.w
        public final int h() {
            return this.f45026a.getWidth();
        }

        @Override // androidx.recyclerview.widget.w
        public final int i() {
            RecyclerView.o oVar = this.f45026a;
            return oVar.getWidth() - oVar.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.w
        public final int j() {
            return this.f45026a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.w
        public final int l() {
            return this.f45026a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.w
        public final int m() {
            return this.f45026a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.w
        public final int n() {
            return this.f45026a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.w
        public final int o() {
            RecyclerView.o oVar = this.f45026a;
            return (oVar.getWidth() - oVar.getPaddingLeft()) - oVar.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.w
        public final int q(View view) {
            RecyclerView.o oVar = this.f45026a;
            Rect rect = this.f45028c;
            oVar.getTransformedBoundingBox(view, true, rect);
            return rect.right;
        }

        @Override // androidx.recyclerview.widget.w
        public final int r(View view) {
            RecyclerView.o oVar = this.f45026a;
            Rect rect = this.f45028c;
            oVar.getTransformedBoundingBox(view, true, rect);
            return rect.left;
        }

        @Override // androidx.recyclerview.widget.w
        public final void s(int i11) {
            this.f45026a.offsetChildrenHorizontal(i11);
        }
    }

    static class b extends w {
        @Override // androidx.recyclerview.widget.w
        public final int d(View view) {
            return this.f45026a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.w
        public final int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f45026a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.w
        public final int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f45026a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.w
        public final int g(View view) {
            return this.f45026a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.w
        public final int h() {
            return this.f45026a.getHeight();
        }

        @Override // androidx.recyclerview.widget.w
        public final int i() {
            RecyclerView.o oVar = this.f45026a;
            return oVar.getHeight() - oVar.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.w
        public final int j() {
            return this.f45026a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.w
        public final int l() {
            return this.f45026a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.w
        public final int m() {
            return this.f45026a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.w
        public final int n() {
            return this.f45026a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.w
        public final int o() {
            RecyclerView.o oVar = this.f45026a;
            return (oVar.getHeight() - oVar.getPaddingTop()) - oVar.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.w
        public final int q(View view) {
            RecyclerView.o oVar = this.f45026a;
            Rect rect = this.f45028c;
            oVar.getTransformedBoundingBox(view, true, rect);
            return rect.bottom;
        }

        @Override // androidx.recyclerview.widget.w
        public final int r(View view) {
            RecyclerView.o oVar = this.f45026a;
            Rect rect = this.f45028c;
            oVar.getTransformedBoundingBox(view, true, rect);
            return rect.top;
        }

        @Override // androidx.recyclerview.widget.w
        public final void s(int i11) {
            this.f45026a.offsetChildrenVertical(i11);
        }
    }

    w(RecyclerView.o oVar) {
        this.f45026a = oVar;
    }

    public static w a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static w b(RecyclerView.o oVar, int i11) {
        if (i11 == 0) {
            return new a(oVar);
        }
        if (i11 == 1) {
            return new b(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static w c(RecyclerView.o oVar) {
        return new b(oVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public final RecyclerView.o k() {
        return this.f45026a;
    }

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public final int p() {
        if (Integer.MIN_VALUE == this.f45027b) {
            return 0;
        }
        return o() - this.f45027b;
    }

    public abstract int q(View view);

    public abstract int r(View view);

    public abstract void s(int i11);

    public final void t() {
        this.f45027b = o();
    }
}
