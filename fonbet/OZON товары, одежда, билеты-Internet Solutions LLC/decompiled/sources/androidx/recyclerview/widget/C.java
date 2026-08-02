package androidx.recyclerview.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class C extends RecyclerView.l {
    boolean mSupportsChangeAnimations = true;

    public abstract boolean animateAdd(RecyclerView.C c11);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean animateAppearance(@NonNull RecyclerView.C c11, RecyclerView.l.c cVar, @NonNull RecyclerView.l.c cVar2) {
        int i11;
        int i12;
        return (cVar == null || ((i11 = cVar.f44738a) == (i12 = cVar2.f44738a) && cVar.f44739b == cVar2.f44739b)) ? animateAdd(c11) : animateMove(c11, i11, cVar.f44739b, i12, cVar2.f44739b);
    }

    public abstract boolean animateChange(RecyclerView.C c11, RecyclerView.C c12, int i11, int i12, int i13, int i14);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean animateChange(@NonNull RecyclerView.C c11, @NonNull RecyclerView.C c12, @NonNull RecyclerView.l.c cVar, @NonNull RecyclerView.l.c cVar2) {
        int i11;
        int i12;
        int i13 = cVar.f44738a;
        int i14 = cVar.f44739b;
        if (c12.shouldIgnore()) {
            int i15 = cVar.f44738a;
            i12 = cVar.f44739b;
            i11 = i15;
        } else {
            i11 = cVar2.f44738a;
            i12 = cVar2.f44739b;
        }
        return animateChange(c11, c12, i13, i14, i11, i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean animateDisappearance(@NonNull RecyclerView.C c11, @NonNull RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i11 = cVar.f44738a;
        int i12 = cVar.f44739b;
        View view = c11.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f44738a;
        int top = cVar2 == null ? view.getTop() : cVar2.f44739b;
        if (c11.isRemoved() || (i11 == left && i12 == top)) {
            return animateRemove(c11);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return animateMove(c11, i11, i12, left, top);
    }

    public abstract boolean animateMove(RecyclerView.C c11, int i11, int i12, int i13, int i14);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean animatePersistence(@NonNull RecyclerView.C c11, @NonNull RecyclerView.l.c cVar, @NonNull RecyclerView.l.c cVar2) {
        int i11 = cVar.f44738a;
        int i12 = cVar2.f44738a;
        if (i11 != i12 || cVar.f44739b != cVar2.f44739b) {
            return animateMove(c11, i11, cVar.f44739b, i12, cVar2.f44739b);
        }
        dispatchMoveFinished(c11);
        return false;
    }

    public abstract boolean animateRemove(RecyclerView.C c11);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.C c11) {
        return !this.mSupportsChangeAnimations || c11.isInvalid();
    }

    public final void dispatchAddFinished(RecyclerView.C c11) {
        onAddFinished(c11);
        dispatchAnimationFinished(c11);
    }

    public final void dispatchAddStarting(RecyclerView.C c11) {
        onAddStarting(c11);
    }

    public final void dispatchChangeFinished(RecyclerView.C c11, boolean z11) {
        onChangeFinished(c11, z11);
        dispatchAnimationFinished(c11);
    }

    public final void dispatchChangeStarting(RecyclerView.C c11, boolean z11) {
        onChangeStarting(c11, z11);
    }

    public final void dispatchMoveFinished(RecyclerView.C c11) {
        onMoveFinished(c11);
        dispatchAnimationFinished(c11);
    }

    public final void dispatchMoveStarting(RecyclerView.C c11) {
        onMoveStarting(c11);
    }

    public final void dispatchRemoveFinished(RecyclerView.C c11) {
        onRemoveFinished(c11);
        dispatchAnimationFinished(c11);
    }

    public final void dispatchRemoveStarting(RecyclerView.C c11) {
        onRemoveStarting(c11);
    }

    public void onAddFinished(RecyclerView.C c11) {
    }

    public void onAddStarting(RecyclerView.C c11) {
    }

    public void onChangeFinished(RecyclerView.C c11, boolean z11) {
    }

    public void onChangeStarting(RecyclerView.C c11, boolean z11) {
    }

    public void onMoveFinished(RecyclerView.C c11) {
    }

    public void onMoveStarting(RecyclerView.C c11) {
    }

    public void onRemoveFinished(RecyclerView.C c11) {
    }

    public void onRemoveStarting(RecyclerView.C c11) {
    }

    public void setSupportsChangeAnimations(boolean z11) {
        this.mSupportsChangeAnimations = z11;
    }
}
