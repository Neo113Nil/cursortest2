package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class D extends RecyclerView.r {
    static final float MILLISECONDS_PER_INCH = 100.0f;
    private Scroller mGravityScroller;
    RecyclerView mRecyclerView;
    private final RecyclerView.t mScrollListener = new a();

    final class a extends RecyclerView.t {

        /* renamed from: a, reason: collision with root package name */
        boolean f44662a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i11) {
            super.onScrollStateChanged(recyclerView, i11);
            if (i11 == 0 && this.f44662a) {
                this.f44662a = false;
                D.this.snapToTargetExistingView();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            if (i11 == 0 && i12 == 0) {
                return;
            }
            this.f44662a = true;
        }
    }

    /* loaded from: classes8.dex */
    final class b extends r {
        b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.r
        protected final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return D.MILLISECONDS_PER_INCH / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.r, androidx.recyclerview.widget.RecyclerView.z
        protected final void onTargetFound(View view, RecyclerView.A a11, RecyclerView.z.a aVar) {
            D d11 = D.this;
            RecyclerView recyclerView = d11.mRecyclerView;
            if (recyclerView == null) {
                return;
            }
            int[] calculateDistanceToFinalSnap = d11.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view);
            int i11 = calculateDistanceToFinalSnap[0];
            int i12 = calculateDistanceToFinalSnap[1];
            int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i11), Math.abs(i12)));
            if (calculateTimeForDeceleration > 0) {
                aVar.d(i11, i12, this.mDecelerateInterpolator, calculateTimeForDeceleration);
            }
        }
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(null);
    }

    private void setupCallbacks() throws IllegalStateException {
        if (this.mRecyclerView.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.mRecyclerView.addOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(this);
    }

    private boolean snapFromFling(@NonNull RecyclerView.o oVar, int i11, int i12) {
        RecyclerView.z createScroller;
        int findTargetSnapPosition;
        if (!(oVar instanceof RecyclerView.z.b) || (createScroller = createScroller(oVar)) == null || (findTargetSnapPosition = findTargetSnapPosition(oVar, i11, i12)) == -1) {
            return false;
        }
        createScroller.setTargetPosition(findTargetSnapPosition);
        oVar.startSmoothScroll(createScroller);
        return true;
    }

    public void attachToRecyclerView(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            destroyCallbacks();
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            setupCallbacks();
            this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
            snapToTargetExistingView();
        }
    }

    public abstract int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.o oVar, @NonNull View view);

    public int[] calculateScrollDistance(int i11, int i12) {
        this.mGravityScroller.fling(0, 0, i11, i12, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE);
        return new int[]{this.mGravityScroller.getFinalX(), this.mGravityScroller.getFinalY()};
    }

    protected RecyclerView.z createScroller(RecyclerView.o oVar) {
        return createSnapScroller(oVar);
    }

    @Deprecated
    protected r createSnapScroller(RecyclerView.o oVar) {
        if (oVar instanceof RecyclerView.z.b) {
            return new b(this.mRecyclerView.getContext());
        }
        return null;
    }

    public abstract View findSnapView(RecyclerView.o oVar);

    public abstract int findTargetSnapPosition(RecyclerView.o oVar, int i11, int i12);

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean onFling(int i11, int i12) {
        RecyclerView.o layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager == null || this.mRecyclerView.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.mRecyclerView.getMinFlingVelocity();
        return (Math.abs(i12) > minFlingVelocity || Math.abs(i11) > minFlingVelocity) && snapFromFling(layoutManager, i11, i12);
    }

    void snapToTargetExistingView() {
        RecyclerView.o layoutManager;
        View findSnapView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (findSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int[] calculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, findSnapView);
        int i11 = calculateDistanceToFinalSnap[0];
        if (i11 == 0 && calculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.mRecyclerView.smoothScrollBy(i11, calculateDistanceToFinalSnap[1]);
    }
}
