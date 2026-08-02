package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.core.view.Y;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class h extends C {
    private static TimeInterpolator sDefaultInterpolator;
    private ArrayList<RecyclerView.C> mPendingRemovals = new ArrayList<>();
    private ArrayList<RecyclerView.C> mPendingAdditions = new ArrayList<>();
    private ArrayList<j> mPendingMoves = new ArrayList<>();
    private ArrayList<i> mPendingChanges = new ArrayList<>();
    ArrayList<ArrayList<RecyclerView.C>> mAdditionsList = new ArrayList<>();
    ArrayList<ArrayList<j>> mMovesList = new ArrayList<>();
    ArrayList<ArrayList<i>> mChangesList = new ArrayList<>();
    ArrayList<RecyclerView.C> mAddAnimations = new ArrayList<>();
    ArrayList<RecyclerView.C> mMoveAnimations = new ArrayList<>();
    ArrayList<RecyclerView.C> mRemoveAnimations = new ArrayList<>();
    ArrayList<RecyclerView.C> mChangeAnimations = new ArrayList<>();

    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f44877a;

        a(ArrayList arrayList) {
            this.f44877a = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f44877a;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                h.this.animateMoveImpl(jVar.f44911a, jVar.f44912b, jVar.f44913c, jVar.f44914d, jVar.f44915e);
            }
            arrayList.clear();
            h.this.mMovesList.remove(arrayList);
        }
    }

    /* loaded from: classes8.dex */
    final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f44879a;

        b(ArrayList arrayList) {
            this.f44879a = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f44879a;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                h hVar = h.this;
                if (!hasNext) {
                    arrayList.clear();
                    hVar.mChangesList.remove(arrayList);
                    return;
                }
                hVar.animateChangeImpl((i) it.next());
            }
        }
    }

    final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f44881a;

        c(ArrayList arrayList) {
            this.f44881a = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f44881a;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                h hVar = h.this;
                if (!hasNext) {
                    arrayList.clear();
                    hVar.mAdditionsList.remove(arrayList);
                    return;
                }
                hVar.animateAddImpl((RecyclerView.C) it.next());
            }
        }
    }

    final class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.C f44883a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f44884b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f44885c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ h f44886d;

        d(View view, ViewPropertyAnimator viewPropertyAnimator, h hVar, RecyclerView.C c11) {
            this.f44886d = hVar;
            this.f44883a = c11;
            this.f44884b = viewPropertyAnimator;
            this.f44885c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f44884b.setListener(null);
            this.f44885c.setAlpha(1.0f);
            h hVar = this.f44886d;
            RecyclerView.C c11 = this.f44883a;
            hVar.dispatchRemoveFinished(c11);
            hVar.mRemoveAnimations.remove(c11);
            hVar.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.f44886d.dispatchRemoveStarting(this.f44883a);
        }
    }

    final class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.C f44887a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f44888b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f44889c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ h f44890d;

        e(View view, ViewPropertyAnimator viewPropertyAnimator, h hVar, RecyclerView.C c11) {
            this.f44890d = hVar;
            this.f44887a = c11;
            this.f44888b = view;
            this.f44889c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f44888b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f44889c.setListener(null);
            h hVar = this.f44890d;
            RecyclerView.C c11 = this.f44887a;
            hVar.dispatchAddFinished(c11);
            hVar.mAddAnimations.remove(c11);
            hVar.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.f44890d.dispatchAddStarting(this.f44887a);
        }
    }

    final class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.C f44891a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f44892b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f44893c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f44894d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f44895e;

        f(RecyclerView.C c11, int i11, View view, int i12, ViewPropertyAnimator viewPropertyAnimator) {
            this.f44891a = c11;
            this.f44892b = i11;
            this.f44893c = view;
            this.f44894d = i12;
            this.f44895e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            int i11 = this.f44892b;
            View view = this.f44893c;
            if (i11 != 0) {
                view.setTranslationX(0.0f);
            }
            if (this.f44894d != 0) {
                view.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f44895e.setListener(null);
            h hVar = h.this;
            RecyclerView.C c11 = this.f44891a;
            hVar.dispatchMoveFinished(c11);
            hVar.mMoveAnimations.remove(c11);
            hVar.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            h.this.dispatchMoveStarting(this.f44891a);
        }
    }

    /* loaded from: classes8.dex */
    final class g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f44897a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f44898b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f44899c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f44897a = iVar;
            this.f44898b = viewPropertyAnimator;
            this.f44899c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f44898b.setListener(null);
            View view = this.f44899c;
            view.setAlpha(1.0f);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            i iVar = this.f44897a;
            RecyclerView.C c11 = iVar.f44905a;
            h hVar = h.this;
            hVar.dispatchChangeFinished(c11, true);
            hVar.mChangeAnimations.remove(iVar.f44905a);
            hVar.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            h.this.dispatchChangeStarting(this.f44897a.f44905a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$h, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    final class C0817h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f44901a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f44902b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f44903c;

        C0817h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f44901a = iVar;
            this.f44902b = viewPropertyAnimator;
            this.f44903c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f44902b.setListener(null);
            View view = this.f44903c;
            view.setAlpha(1.0f);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            i iVar = this.f44901a;
            RecyclerView.C c11 = iVar.f44906b;
            h hVar = h.this;
            hVar.dispatchChangeFinished(c11, false);
            hVar.mChangeAnimations.remove(iVar.f44906b);
            hVar.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            h.this.dispatchChangeStarting(this.f44901a.f44906b, false);
        }
    }

    /* loaded from: classes8.dex */
    private static class i {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.C f44905a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.C f44906b;

        /* renamed from: c, reason: collision with root package name */
        public int f44907c;

        /* renamed from: d, reason: collision with root package name */
        public int f44908d;

        /* renamed from: e, reason: collision with root package name */
        public int f44909e;

        /* renamed from: f, reason: collision with root package name */
        public int f44910f;

        i(RecyclerView.C c11, RecyclerView.C c12, int i11, int i12, int i13, int i14) {
            this.f44905a = c11;
            this.f44906b = c12;
            this.f44907c = i11;
            this.f44908d = i12;
            this.f44909e = i13;
            this.f44910f = i14;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeInfo{oldHolder=");
            sb2.append(this.f44905a);
            sb2.append(", newHolder=");
            sb2.append(this.f44906b);
            sb2.append(", fromX=");
            sb2.append(this.f44907c);
            sb2.append(", fromY=");
            sb2.append(this.f44908d);
            sb2.append(", toX=");
            sb2.append(this.f44909e);
            sb2.append(", toY=");
            return Ek.a.d(sb2, this.f44910f, '}');
        }
    }

    private static class j {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.C f44911a;

        /* renamed from: b, reason: collision with root package name */
        public int f44912b;

        /* renamed from: c, reason: collision with root package name */
        public int f44913c;

        /* renamed from: d, reason: collision with root package name */
        public int f44914d;

        /* renamed from: e, reason: collision with root package name */
        public int f44915e;
    }

    private void animateRemoveImpl(RecyclerView.C c11) {
        View view = c11.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.mRemoveAnimations.add(c11);
        animate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new d(view, animate, this, c11)).start();
    }

    private void endChangeAnimation(List<i> list, RecyclerView.C c11) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (endChangeAnimationIfNecessary(iVar, c11) && iVar.f44905a == null && iVar.f44906b == null) {
                list.remove(iVar);
            }
        }
    }

    private void endChangeAnimationIfNecessary(i iVar) {
        RecyclerView.C c11 = iVar.f44905a;
        if (c11 != null) {
            endChangeAnimationIfNecessary(iVar, c11);
        }
        RecyclerView.C c12 = iVar.f44906b;
        if (c12 != null) {
            endChangeAnimationIfNecessary(iVar, c12);
        }
    }

    private void resetAnimation(RecyclerView.C c11) {
        if (sDefaultInterpolator == null) {
            sDefaultInterpolator = new ValueAnimator().getInterpolator();
        }
        c11.itemView.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(c11);
    }

    @Override // androidx.recyclerview.widget.C
    public boolean animateAdd(RecyclerView.C c11) {
        resetAnimation(c11);
        c11.itemView.setAlpha(0.0f);
        this.mPendingAdditions.add(c11);
        return true;
    }

    void animateAddImpl(RecyclerView.C c11) {
        View view = c11.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.mAddAnimations.add(c11);
        animate.alpha(1.0f).setDuration(getAddDuration()).setListener(new e(view, animate, this, c11)).start();
    }

    @Override // androidx.recyclerview.widget.C
    public boolean animateChange(RecyclerView.C c11, RecyclerView.C c12, int i11, int i12, int i13, int i14) {
        if (c11 == c12) {
            return animateMove(c11, i11, i12, i13, i14);
        }
        float translationX = c11.itemView.getTranslationX();
        float translationY = c11.itemView.getTranslationY();
        float alpha = c11.itemView.getAlpha();
        resetAnimation(c11);
        int i15 = (int) ((i13 - i11) - translationX);
        int i16 = (int) ((i14 - i12) - translationY);
        c11.itemView.setTranslationX(translationX);
        c11.itemView.setTranslationY(translationY);
        c11.itemView.setAlpha(alpha);
        if (c12 != null) {
            resetAnimation(c12);
            c12.itemView.setTranslationX(-i15);
            c12.itemView.setTranslationY(-i16);
            c12.itemView.setAlpha(0.0f);
        }
        this.mPendingChanges.add(new i(c11, c12, i11, i12, i13, i14));
        return true;
    }

    void animateChangeImpl(i iVar) {
        RecyclerView.C c11 = iVar.f44905a;
        View view = c11 == null ? null : c11.itemView;
        RecyclerView.C c12 = iVar.f44906b;
        View view2 = c12 != null ? c12.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(iVar.f44905a);
            duration.translationX(iVar.f44909e - iVar.f44907c);
            duration.translationY(iVar.f44910f - iVar.f44908d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.mChangeAnimations.add(iVar.f44906b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new C0817h(iVar, animate, view2)).start();
        }
    }

    @Override // androidx.recyclerview.widget.C
    public boolean animateMove(RecyclerView.C c11, int i11, int i12, int i13, int i14) {
        View view = c11.itemView;
        int translationX = i11 + ((int) view.getTranslationX());
        int translationY = i12 + ((int) c11.itemView.getTranslationY());
        resetAnimation(c11);
        int i15 = i13 - translationX;
        int i16 = i14 - translationY;
        if (i15 == 0 && i16 == 0) {
            dispatchMoveFinished(c11);
            return false;
        }
        if (i15 != 0) {
            view.setTranslationX(-i15);
        }
        if (i16 != 0) {
            view.setTranslationY(-i16);
        }
        ArrayList<j> arrayList = this.mPendingMoves;
        j jVar = new j();
        jVar.f44911a = c11;
        jVar.f44912b = translationX;
        jVar.f44913c = translationY;
        jVar.f44914d = i13;
        jVar.f44915e = i14;
        arrayList.add(jVar);
        return true;
    }

    void animateMoveImpl(RecyclerView.C c11, int i11, int i12, int i13, int i14) {
        View view = c11.itemView;
        int i15 = i13 - i11;
        int i16 = i14 - i12;
        if (i15 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i16 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.mMoveAnimations.add(c11);
        animate.setDuration(getMoveDuration()).setListener(new f(c11, i15, view, i16, animate)).start();
    }

    @Override // androidx.recyclerview.widget.C
    public boolean animateRemove(RecyclerView.C c11) {
        resetAnimation(c11);
        this.mPendingRemovals.add(c11);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.C c11, @NonNull List<Object> list) {
        return !list.isEmpty() || super.canReuseUpdatedViewHolder(c11, list);
    }

    void cancelAll(List<RecyclerView.C> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    void dispatchFinishedWhenDone() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void endAnimation(RecyclerView.C c11) {
        View view = c11.itemView;
        view.animate().cancel();
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.mPendingMoves.get(size).f44911a == c11) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(c11);
                this.mPendingMoves.remove(size);
            }
        }
        endChangeAnimation(this.mPendingChanges, c11);
        if (this.mPendingRemovals.remove(c11)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(c11);
        }
        if (this.mPendingAdditions.remove(c11)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(c11);
        }
        for (int size2 = this.mChangesList.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.mChangesList.get(size2);
            endChangeAnimation(arrayList, c11);
            if (arrayList.isEmpty()) {
                this.mChangesList.remove(size2);
            }
        }
        for (int size3 = this.mMovesList.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.mMovesList.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f44911a == c11) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(c11);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.mMovesList.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.mAdditionsList.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.C> arrayList3 = this.mAdditionsList.get(size5);
            if (arrayList3.remove(c11)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(c11);
                if (arrayList3.isEmpty()) {
                    this.mAdditionsList.remove(size5);
                }
            }
        }
        this.mRemoveAnimations.remove(c11);
        this.mAddAnimations.remove(c11);
        this.mChangeAnimations.remove(c11);
        this.mMoveAnimations.remove(c11);
        dispatchFinishedWhenDone();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void endAnimations() {
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.mPendingMoves.get(size);
            View view = jVar.f44911a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(jVar.f44911a);
            this.mPendingMoves.remove(size);
        }
        for (int size2 = this.mPendingRemovals.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.mPendingRemovals.get(size2));
            this.mPendingRemovals.remove(size2);
        }
        int size3 = this.mPendingAdditions.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C c11 = this.mPendingAdditions.get(size3);
            c11.itemView.setAlpha(1.0f);
            dispatchAddFinished(c11);
            this.mPendingAdditions.remove(size3);
        }
        for (int size4 = this.mPendingChanges.size() - 1; size4 >= 0; size4--) {
            endChangeAnimationIfNecessary(this.mPendingChanges.get(size4));
        }
        this.mPendingChanges.clear();
        if (isRunning()) {
            for (int size5 = this.mMovesList.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.mMovesList.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f44911a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(jVar2.f44911a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.mMovesList.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.mAdditionsList.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.C> arrayList2 = this.mAdditionsList.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.C c12 = arrayList2.get(size8);
                    c12.itemView.setAlpha(1.0f);
                    dispatchAddFinished(c12);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.mAdditionsList.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.mChangesList.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.mChangesList.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    endChangeAnimationIfNecessary(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.mChangesList.remove(arrayList3);
                    }
                }
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean isRunning() {
        return (this.mPendingAdditions.isEmpty() && this.mPendingChanges.isEmpty() && this.mPendingMoves.isEmpty() && this.mPendingRemovals.isEmpty() && this.mMoveAnimations.isEmpty() && this.mRemoveAnimations.isEmpty() && this.mAddAnimations.isEmpty() && this.mChangeAnimations.isEmpty() && this.mMovesList.isEmpty() && this.mAdditionsList.isEmpty() && this.mChangesList.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void runPendingAnimations() {
        boolean isEmpty = this.mPendingRemovals.isEmpty();
        boolean isEmpty2 = this.mPendingMoves.isEmpty();
        boolean isEmpty3 = this.mPendingChanges.isEmpty();
        boolean isEmpty4 = this.mPendingAdditions.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        Iterator<RecyclerView.C> it = this.mPendingRemovals.iterator();
        while (it.hasNext()) {
            animateRemoveImpl(it.next());
        }
        this.mPendingRemovals.clear();
        if (!isEmpty2) {
            ArrayList<j> arrayList = new ArrayList<>();
            arrayList.addAll(this.mPendingMoves);
            this.mMovesList.add(arrayList);
            this.mPendingMoves.clear();
            a aVar = new a(arrayList);
            if (isEmpty) {
                aVar.run();
            } else {
                View view = arrayList.get(0).f44911a.itemView;
                long removeDuration = getRemoveDuration();
                int i11 = Y.f42258g;
                view.postOnAnimationDelayed(aVar, removeDuration);
            }
        }
        if (!isEmpty3) {
            ArrayList<i> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.mPendingChanges);
            this.mChangesList.add(arrayList2);
            this.mPendingChanges.clear();
            b bVar = new b(arrayList2);
            if (isEmpty) {
                bVar.run();
            } else {
                View view2 = arrayList2.get(0).f44905a.itemView;
                long removeDuration2 = getRemoveDuration();
                int i12 = Y.f42258g;
                view2.postOnAnimationDelayed(bVar, removeDuration2);
            }
        }
        if (isEmpty4) {
            return;
        }
        ArrayList<RecyclerView.C> arrayList3 = new ArrayList<>();
        arrayList3.addAll(this.mPendingAdditions);
        this.mAdditionsList.add(arrayList3);
        this.mPendingAdditions.clear();
        c cVar = new c(arrayList3);
        if (isEmpty && isEmpty2 && isEmpty3) {
            cVar.run();
            return;
        }
        long max = Math.max(!isEmpty2 ? getMoveDuration() : 0L, isEmpty3 ? 0L : getChangeDuration()) + (!isEmpty ? getRemoveDuration() : 0L);
        View view3 = arrayList3.get(0).itemView;
        int i13 = Y.f42258g;
        view3.postOnAnimationDelayed(cVar, max);
    }

    private boolean endChangeAnimationIfNecessary(i iVar, RecyclerView.C c11) {
        boolean z11 = false;
        if (iVar.f44906b == c11) {
            iVar.f44906b = null;
        } else {
            if (iVar.f44905a != c11) {
                return false;
            }
            iVar.f44905a = null;
            z11 = true;
        }
        c11.itemView.setAlpha(1.0f);
        c11.itemView.setTranslationX(0.0f);
        c11.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(c11, z11);
        return true;
    }
}
