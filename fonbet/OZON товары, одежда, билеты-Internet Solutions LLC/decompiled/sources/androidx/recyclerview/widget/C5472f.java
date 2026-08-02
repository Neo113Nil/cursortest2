package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5472f {

    /* renamed from: a, reason: collision with root package name */
    final RecyclerView.e f44867a;

    /* renamed from: b, reason: collision with root package name */
    final a f44868b = new a();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f44869c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.f$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        long f44870a = 0;

        /* renamed from: b, reason: collision with root package name */
        a f44871b;

        a() {
        }

        private void c() {
            if (this.f44871b == null) {
                this.f44871b = new a();
            }
        }

        final void a(int i11) {
            if (i11 < 64) {
                this.f44870a &= ~(1 << i11);
                return;
            }
            a aVar = this.f44871b;
            if (aVar != null) {
                aVar.a(i11 - 64);
            }
        }

        final int b(int i11) {
            a aVar = this.f44871b;
            if (aVar == null) {
                return i11 >= 64 ? Long.bitCount(this.f44870a) : Long.bitCount(this.f44870a & ((1 << i11) - 1));
            }
            if (i11 < 64) {
                return Long.bitCount(this.f44870a & ((1 << i11) - 1));
            }
            return Long.bitCount(this.f44870a) + aVar.b(i11 - 64);
        }

        final boolean d(int i11) {
            if (i11 < 64) {
                return (this.f44870a & (1 << i11)) != 0;
            }
            c();
            return this.f44871b.d(i11 - 64);
        }

        final void e(int i11, boolean z11) {
            if (i11 >= 64) {
                c();
                this.f44871b.e(i11 - 64, z11);
                return;
            }
            long j11 = this.f44870a;
            boolean z12 = (Long.MIN_VALUE & j11) != 0;
            long j12 = (1 << i11) - 1;
            this.f44870a = ((j11 & (~j12)) << 1) | (j11 & j12);
            if (z11) {
                h(i11);
            } else {
                a(i11);
            }
            if (z12 || this.f44871b != null) {
                c();
                this.f44871b.e(0, z12);
            }
        }

        final boolean f(int i11) {
            if (i11 >= 64) {
                c();
                return this.f44871b.f(i11 - 64);
            }
            long j11 = 1 << i11;
            long j12 = this.f44870a;
            boolean z11 = (j12 & j11) != 0;
            long j13 = j12 & (~j11);
            this.f44870a = j13;
            long j14 = j11 - 1;
            this.f44870a = (j13 & j14) | Long.rotateRight((~j14) & j13, 1);
            a aVar = this.f44871b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f44871b.f(0);
            }
            return z11;
        }

        final void g() {
            this.f44870a = 0L;
            a aVar = this.f44871b;
            if (aVar != null) {
                aVar.g();
            }
        }

        final void h(int i11) {
            if (i11 < 64) {
                this.f44870a |= 1 << i11;
            } else {
                c();
                this.f44871b.h(i11 - 64);
            }
        }

        public final String toString() {
            if (this.f44871b == null) {
                return Long.toBinaryString(this.f44870a);
            }
            return this.f44871b.toString() + "xx" + Long.toBinaryString(this.f44870a);
        }
    }

    C5472f(RecyclerView.e eVar) {
        this.f44867a = eVar;
    }

    private int f(int i11) {
        if (i11 < 0) {
            return -1;
        }
        int childCount = RecyclerView.this.getChildCount();
        int i12 = i11;
        while (i12 < childCount) {
            a aVar = this.f44868b;
            int b11 = i11 - (i12 - aVar.b(i12));
            if (b11 == 0) {
                while (aVar.d(i12)) {
                    i12++;
                }
                return i12;
            }
            i12 += b11;
        }
        return -1;
    }

    private void j(View view) {
        this.f44869c.add(view);
        RecyclerView.e eVar = this.f44867a;
        RecyclerView.C childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
        }
    }

    private void p(View view) {
        if (this.f44869c.remove(view)) {
            RecyclerView.e eVar = this.f44867a;
            RecyclerView.C childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }
    }

    final void a(View view, int i11, boolean z11) {
        RecyclerView recyclerView = RecyclerView.this;
        int childCount = i11 < 0 ? recyclerView.getChildCount() : f(i11);
        this.f44868b.e(childCount, z11);
        if (z11) {
            j(view);
        }
        recyclerView.addView(view, childCount);
        recyclerView.dispatchChildAttached(view);
    }

    final void b(View view, int i11, ViewGroup.LayoutParams layoutParams, boolean z11) {
        RecyclerView recyclerView = RecyclerView.this;
        int childCount = i11 < 0 ? recyclerView.getChildCount() : f(i11);
        this.f44868b.e(childCount, z11);
        if (z11) {
            j(view);
        }
        RecyclerView.C childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + recyclerView.exceptionLabel());
            }
            childViewHolderInt.clearTmpDetachFlag();
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    final void c(int i11) {
        RecyclerView.C childViewHolderInt;
        int f7 = f(i11);
        this.f44868b.f(f7);
        RecyclerView recyclerView = RecyclerView.this;
        View childAt = recyclerView.getChildAt(f7);
        if (childAt != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt)) != null) {
            if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + recyclerView.exceptionLabel());
            }
            childViewHolderInt.addFlags(256);
        }
        recyclerView.detachViewFromParent(f7);
    }

    final View d(int i11) {
        return RecyclerView.this.getChildAt(f(i11));
    }

    final int e() {
        return RecyclerView.this.getChildCount() - this.f44869c.size();
    }

    final View g(int i11) {
        return RecyclerView.this.getChildAt(i11);
    }

    final int h() {
        return RecyclerView.this.getChildCount();
    }

    final void i(View view) {
        int indexOfChild = RecyclerView.this.indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f44868b.h(indexOfChild);
            j(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    final int k(View view) {
        int indexOfChild = RecyclerView.this.indexOfChild(view);
        if (indexOfChild != -1) {
            a aVar = this.f44868b;
            if (!aVar.d(indexOfChild)) {
                return indexOfChild - aVar.b(indexOfChild);
            }
        }
        return -1;
    }

    final void l(View view) {
        RecyclerView.e eVar = this.f44867a;
        int indexOfChild = RecyclerView.this.indexOfChild(view);
        if (indexOfChild < 0) {
            return;
        }
        if (this.f44868b.f(indexOfChild)) {
            p(view);
        }
        eVar.a(indexOfChild);
    }

    final void m(int i11) {
        int f7 = f(i11);
        RecyclerView.e eVar = this.f44867a;
        View childAt = RecyclerView.this.getChildAt(f7);
        if (childAt == null) {
            return;
        }
        if (this.f44868b.f(f7)) {
            p(childAt);
        }
        eVar.a(f7);
    }

    final boolean n(View view) {
        RecyclerView.e eVar = this.f44867a;
        int indexOfChild = RecyclerView.this.indexOfChild(view);
        if (indexOfChild == -1) {
            p(view);
            return true;
        }
        a aVar = this.f44868b;
        if (!aVar.d(indexOfChild)) {
            return false;
        }
        aVar.f(indexOfChild);
        p(view);
        eVar.a(indexOfChild);
        return true;
    }

    final void o(View view) {
        int indexOfChild = RecyclerView.this.indexOfChild(view);
        if (indexOfChild < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        a aVar = this.f44868b;
        if (aVar.d(indexOfChild)) {
            aVar.a(indexOfChild);
            p(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public final String toString() {
        return this.f44868b.toString() + ", hidden list:" + this.f44869c.size();
    }
}
