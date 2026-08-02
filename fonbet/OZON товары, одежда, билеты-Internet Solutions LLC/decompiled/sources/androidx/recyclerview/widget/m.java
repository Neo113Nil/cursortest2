package androidx.recyclerview.widget;

import Hj.C3143a;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.Y;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public class m extends RecyclerView.n implements RecyclerView.q {
    static final int ACTION_MODE_DRAG_MASK = 16711680;
    private static final int ACTION_MODE_IDLE_MASK = 255;
    static final int ACTION_MODE_SWIPE_MASK = 65280;
    public static final int ACTION_STATE_DRAG = 2;
    public static final int ACTION_STATE_IDLE = 0;
    public static final int ACTION_STATE_SWIPE = 1;
    private static final int ACTIVE_POINTER_ID_NONE = -1;
    public static final int ANIMATION_TYPE_DRAG = 8;
    public static final int ANIMATION_TYPE_SWIPE_CANCEL = 4;
    public static final int ANIMATION_TYPE_SWIPE_SUCCESS = 2;
    private static final boolean DEBUG = false;
    static final int DIRECTION_FLAG_COUNT = 8;
    public static final int DOWN = 2;
    public static final int END = 32;
    public static final int LEFT = 4;
    private static final int PIXELS_PER_SECOND = 1000;
    public static final int RIGHT = 8;
    public static final int START = 16;
    private static final String TAG = "ItemTouchHelper";
    public static final int UP = 1;

    @NonNull
    e mCallback;
    private RecyclerView.j mChildDrawingOrderCallback;
    private List<Integer> mDistances;
    private long mDragScrollStartTimeInMs;
    float mDx;
    float mDy;
    GestureDetectorCompat mGestureDetector;
    float mInitialTouchX;
    float mInitialTouchY;
    private f mItemTouchHelperGestureListener;
    private float mMaxSwipeVelocity;
    RecyclerView mRecyclerView;
    int mSelectedFlags;
    private float mSelectedStartX;
    private float mSelectedStartY;
    private int mSlop;
    private List<RecyclerView.C> mSwapTargets;
    private float mSwipeEscapeVelocity;
    private Rect mTmpRect;
    VelocityTracker mVelocityTracker;
    final List<View> mPendingCleanup = new ArrayList();
    private final float[] mTmpPosition = new float[2];
    RecyclerView.C mSelected = null;
    int mActivePointerId = -1;
    private int mActionState = 0;
    List<g> mRecoverAnimations = new ArrayList();
    final Runnable mScrollRunnable = new a();
    View mOverdrawChild = null;
    int mOverdrawChildPosition = -1;
    private final RecyclerView.s mOnItemTouchListener = new b();

    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            m mVar = m.this;
            if (mVar.mSelected == null || !mVar.scrollIfNecessary()) {
                return;
            }
            RecyclerView.C c11 = mVar.mSelected;
            if (c11 != null) {
                mVar.moveIfNecessary(c11);
            }
            mVar.mRecyclerView.removeCallbacks(mVar.mScrollRunnable);
            RecyclerView recyclerView = mVar.mRecyclerView;
            int i11 = Y.f42258g;
            recyclerView.postOnAnimation(this);
        }
    }

    final class b implements RecyclerView.s {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            int findPointerIndex;
            g findAnimation;
            m mVar = m.this;
            mVar.mGestureDetector.a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                mVar.mActivePointerId = motionEvent.getPointerId(0);
                mVar.mInitialTouchX = motionEvent.getX();
                mVar.mInitialTouchY = motionEvent.getY();
                mVar.obtainVelocityTracker();
                if (mVar.mSelected == null && (findAnimation = mVar.findAnimation(motionEvent)) != null) {
                    mVar.mInitialTouchX -= findAnimation.f45008i;
                    mVar.mInitialTouchY -= findAnimation.f45009j;
                    RecyclerView.C c11 = findAnimation.f45004e;
                    mVar.endRecoverAnimation(c11, true);
                    if (mVar.mPendingCleanup.remove(c11.itemView)) {
                        mVar.mCallback.clearView(mVar.mRecyclerView, c11);
                    }
                    mVar.select(c11, findAnimation.f45005f);
                    mVar.updateDxDy(motionEvent, mVar.mSelectedFlags, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                mVar.mActivePointerId = -1;
                mVar.select(null, 0);
            } else {
                int i11 = mVar.mActivePointerId;
                if (i11 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i11)) >= 0) {
                    mVar.checkSelectForSwipe(actionMasked, motionEvent, findPointerIndex);
                }
            }
            VelocityTracker velocityTracker = mVar.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return mVar.mSelected != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void onRequestDisallowInterceptTouchEvent(boolean z11) {
            if (z11) {
                m.this.select(null, 0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            m mVar = m.this;
            mVar.mGestureDetector.a(motionEvent);
            VelocityTracker velocityTracker = mVar.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (mVar.mActivePointerId == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(mVar.mActivePointerId);
            if (findPointerIndex >= 0) {
                mVar.checkSelectForSwipe(actionMasked, motionEvent, findPointerIndex);
            }
            RecyclerView.C c11 = mVar.mSelected;
            if (c11 == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (findPointerIndex >= 0) {
                        mVar.updateDxDy(motionEvent, mVar.mSelectedFlags, findPointerIndex);
                        mVar.moveIfNecessary(c11);
                        mVar.mRecyclerView.removeCallbacks(mVar.mScrollRunnable);
                        mVar.mScrollRunnable.run();
                        mVar.mRecyclerView.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == mVar.mActivePointerId) {
                        mVar.mActivePointerId = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        mVar.updateDxDy(motionEvent, mVar.mSelectedFlags, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = mVar.mVelocityTracker;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            mVar.select(null, 0);
            mVar.mActivePointerId = -1;
        }
    }

    final class c extends g {

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f44992n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ RecyclerView.C f44993o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(RecyclerView.C c11, int i11, float f7, float f11, float f12, float f13, int i12, RecyclerView.C c12) {
            super(c11, i11, f7, f11, f12, f13);
            this.f44992n = i12;
            this.f44993o = c12;
        }

        @Override // androidx.recyclerview.widget.m.g, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f45010k) {
                return;
            }
            int i11 = this.f44992n;
            RecyclerView.C c11 = this.f44993o;
            m mVar = m.this;
            if (i11 <= 0) {
                mVar.mCallback.clearView(mVar.mRecyclerView, c11);
            } else {
                mVar.mPendingCleanup.add(c11.itemView);
                this.f45007h = true;
                if (i11 > 0) {
                    mVar.postDispatchSwipe(this, i11);
                }
            }
            View view = mVar.mOverdrawChild;
            View view2 = c11.itemView;
            if (view == view2) {
                mVar.removeChildDrawingOrderCallbackIfNecessary(view2);
            }
        }
    }

    final class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f44995a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f44996b;

        d(g gVar, int i11) {
            this.f44995a = gVar;
            this.f44996b = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m mVar = m.this;
            RecyclerView recyclerView = mVar.mRecyclerView;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            g gVar = this.f44995a;
            if (gVar.f45010k || gVar.f45004e.getAdapterPosition() == -1) {
                return;
            }
            RecyclerView.l itemAnimator = mVar.mRecyclerView.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.isRunning(null)) && !mVar.hasRunningRecoverAnim()) {
                mVar.mCallback.onSwiped(gVar.f45004e, this.f44996b);
            } else {
                mVar.mRecyclerView.post(this);
            }
        }
    }

    public static abstract class e {
        private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
        static final int RELATIVE_DIR_FLAGS = 3158064;
        private static final Interpolator sDragScrollInterpolator = new a();
        private static final Interpolator sDragViewScrollCapInterpolator = new b();
        private int mCachedMaxScrollSpeed = -1;

        static class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f7) {
                return f7 * f7 * f7 * f7 * f7;
            }
        }

        static class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f7) {
                float f11 = f7 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            }
        }

        public static int convertToRelativeDirection(int i11, int i12) {
            int i13;
            int i14 = i11 & ABS_HORIZONTAL_DIR_FLAGS;
            if (i14 == 0) {
                return i11;
            }
            int i15 = i11 & (~i14);
            if (i12 == 0) {
                i13 = i14 << 2;
            } else {
                int i16 = i14 << 1;
                i15 |= (-789517) & i16;
                i13 = (i16 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
            }
            return i15 | i13;
        }

        @NonNull
        public static o getDefaultUIUtil() {
            return p.f45014a;
        }

        private int getMaxDragScroll(RecyclerView recyclerView) {
            if (this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.mCachedMaxScrollSpeed;
        }

        public static int makeFlag(int i11, int i12) {
            return i12 << (i11 * 8);
        }

        public static int makeMovementFlags(int i11, int i12) {
            return makeFlag(2, i11) | makeFlag(1, i12) | makeFlag(0, i12 | i11);
        }

        public boolean canDropOver(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.C c11, @NonNull RecyclerView.C c12) {
            return true;
        }

        public RecyclerView.C chooseDropTarget(@NonNull RecyclerView.C c11, @NonNull List<RecyclerView.C> list, int i11, int i12) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = c11.itemView.getWidth() + i11;
            int height = c11.itemView.getHeight() + i12;
            int left2 = i11 - c11.itemView.getLeft();
            int top2 = i12 - c11.itemView.getTop();
            int size = list.size();
            RecyclerView.C c12 = null;
            int i13 = -1;
            for (int i14 = 0; i14 < size; i14++) {
                RecyclerView.C c13 = list.get(i14);
                if (left2 > 0 && (right = c13.itemView.getRight() - width) < 0 && c13.itemView.getRight() > c11.itemView.getRight() && (abs4 = Math.abs(right)) > i13) {
                    c12 = c13;
                    i13 = abs4;
                }
                if (left2 < 0 && (left = c13.itemView.getLeft() - i11) > 0 && c13.itemView.getLeft() < c11.itemView.getLeft() && (abs3 = Math.abs(left)) > i13) {
                    c12 = c13;
                    i13 = abs3;
                }
                if (top2 < 0 && (top = c13.itemView.getTop() - i12) > 0 && c13.itemView.getTop() < c11.itemView.getTop() && (abs2 = Math.abs(top)) > i13) {
                    c12 = c13;
                    i13 = abs2;
                }
                if (top2 > 0 && (bottom = c13.itemView.getBottom() - height) < 0 && c13.itemView.getBottom() > c11.itemView.getBottom() && (abs = Math.abs(bottom)) > i13) {
                    c12 = c13;
                    i13 = abs;
                }
            }
            return c12;
        }

        public void clearView(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.C c11) {
            View view = c11.itemView;
            Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
            if (tag instanceof Float) {
                Y.H(view, ((Float) tag).floatValue());
            }
            view.setTag(R.id.item_touch_helper_previous_elevation, null);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        public int convertToAbsoluteDirection(int i11, int i12) {
            int i13;
            int i14 = i11 & RELATIVE_DIR_FLAGS;
            if (i14 == 0) {
                return i11;
            }
            int i15 = i11 & (~i14);
            if (i12 == 0) {
                i13 = i14 >> 2;
            } else {
                int i16 = i14 >> 1;
                i15 |= (-3158065) & i16;
                i13 = (i16 & RELATIVE_DIR_FLAGS) >> 2;
            }
            return i15 | i13;
        }

        final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.C c11) {
            int movementFlags = getMovementFlags(recyclerView, c11);
            int i11 = Y.f42258g;
            return convertToAbsoluteDirection(movementFlags, recyclerView.getLayoutDirection());
        }

        public long getAnimationDuration(@NonNull RecyclerView recyclerView, int i11, float f7, float f11) {
            RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i11 == 8 ? 200L : 250L : i11 == 8 ? itemAnimator.getMoveDuration() : itemAnimator.getRemoveDuration();
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(@NonNull RecyclerView.C c11) {
            return 0.5f;
        }

        public abstract int getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.C c11);

        public float getSwipeEscapeVelocity(float f7) {
            return f7;
        }

        public float getSwipeThreshold(@NonNull RecyclerView.C c11) {
            return 0.5f;
        }

        public float getSwipeVelocityThreshold(float f7) {
            return f7;
        }

        boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.C c11) {
            return (getAbsoluteMovementFlags(recyclerView, c11) & m.ACTION_MODE_DRAG_MASK) != 0;
        }

        boolean hasSwipeFlag(RecyclerView recyclerView, RecyclerView.C c11) {
            return (getAbsoluteMovementFlags(recyclerView, c11) & m.ACTION_MODE_SWIPE_MASK) != 0;
        }

        public int interpolateOutOfBoundsScroll(@NonNull RecyclerView recyclerView, int i11, int i12, int i13, long j11) {
            int interpolation = (int) (sDragScrollInterpolator.getInterpolation(j11 <= DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS ? j11 / 2000.0f : 1.0f) * ((int) (sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (Math.abs(i12) * 1.0f) / i11)) * ((int) Math.signum(i12)) * getMaxDragScroll(recyclerView))));
            return interpolation == 0 ? i12 > 0 ? 1 : -1 : interpolation;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public void onChildDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C c11, float f7, float f11, int i11, boolean z11) {
            View view = c11.itemView;
            if (z11 && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                Float valueOf = Float.valueOf(Y.k(view));
                int childCount = recyclerView.getChildCount();
                float f12 = 0.0f;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = recyclerView.getChildAt(i12);
                    if (childAt != view) {
                        float k11 = Y.k(childAt);
                        if (k11 > f12) {
                            f12 = k11;
                        }
                    }
                }
                Y.H(view, f12 + 1.0f);
                view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
            }
            view.setTranslationX(f7);
            view.setTranslationY(f11);
        }

        public void onChildDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, RecyclerView.C c11, float f7, float f11, int i11, boolean z11) {
            View view = c11.itemView;
        }

        void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C c11, List<g> list, int i11, float f7, float f11) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = list.get(i12);
                gVar.e();
                int save = canvas.save();
                onChildDraw(canvas, recyclerView, gVar.f45004e, gVar.f45008i, gVar.f45009j, gVar.f45005f, false);
                canvas.restoreToCount(save);
            }
            if (c11 != null) {
                int save2 = canvas.save();
                onChildDraw(canvas, recyclerView, c11, f7, f11, i11, true);
                canvas.restoreToCount(save2);
            }
        }

        void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C c11, List<g> list, int i11, float f7, float f11) {
            int size = list.size();
            boolean z11 = false;
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = list.get(i12);
                int save = canvas.save();
                onChildDrawOver(canvas, recyclerView, gVar.f45004e, gVar.f45008i, gVar.f45009j, gVar.f45005f, false);
                canvas.restoreToCount(save);
            }
            if (c11 != null) {
                int save2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, c11, f7, f11, i11, true);
                canvas.restoreToCount(save2);
            }
            for (int i13 = size - 1; i13 >= 0; i13--) {
                g gVar2 = list.get(i13);
                boolean z12 = gVar2.f45011l;
                if (z12 && !gVar2.f45007h) {
                    list.remove(i13);
                } else if (!z12) {
                    z11 = true;
                }
            }
            if (z11) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.C c11, @NonNull RecyclerView.C c12);

        /* JADX WARN: Multi-variable type inference failed */
        public void onMoved(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.C c11, int i11, @NonNull RecyclerView.C c12, int i12, int i13, int i14) {
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof i) {
                ((i) layoutManager).prepareForDrop(c11.itemView, c12.itemView, i13, i14);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(c12.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i12);
                }
                if (layoutManager.getDecoratedRight(c12.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i12);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(c12.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i12);
                }
                if (layoutManager.getDecoratedBottom(c12.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i12);
                }
            }
        }

        public void onSelectedChanged(RecyclerView.C c11, int i11) {
        }

        public abstract void onSwiped(@NonNull RecyclerView.C c11, int i11);
    }

    private class f extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a, reason: collision with root package name */
        private boolean f44998a = true;

        f() {
        }

        final void a() {
            this.f44998a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            m mVar;
            View findChildView;
            RecyclerView.C childViewHolder;
            if (this.f44998a && (findChildView = (mVar = m.this).findChildView(motionEvent)) != null && (childViewHolder = mVar.mRecyclerView.getChildViewHolder(findChildView)) != null && mVar.mCallback.hasDragFlag(mVar.mRecyclerView, childViewHolder)) {
                int pointerId = motionEvent.getPointerId(0);
                int i11 = mVar.mActivePointerId;
                if (pointerId == i11) {
                    int findPointerIndex = motionEvent.findPointerIndex(i11);
                    float x11 = motionEvent.getX(findPointerIndex);
                    float y11 = motionEvent.getY(findPointerIndex);
                    mVar.mInitialTouchX = x11;
                    mVar.mInitialTouchY = y11;
                    mVar.mDy = 0.0f;
                    mVar.mDx = 0.0f;
                    if (mVar.mCallback.isLongPressDragEnabled()) {
                        mVar.select(childViewHolder, 2);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class g implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final float f45000a;

        /* renamed from: b, reason: collision with root package name */
        final float f45001b;

        /* renamed from: c, reason: collision with root package name */
        final float f45002c;

        /* renamed from: d, reason: collision with root package name */
        final float f45003d;

        /* renamed from: e, reason: collision with root package name */
        final RecyclerView.C f45004e;

        /* renamed from: f, reason: collision with root package name */
        final int f45005f;

        /* renamed from: g, reason: collision with root package name */
        private final ValueAnimator f45006g;

        /* renamed from: h, reason: collision with root package name */
        boolean f45007h;

        /* renamed from: i, reason: collision with root package name */
        float f45008i;

        /* renamed from: j, reason: collision with root package name */
        float f45009j;

        /* renamed from: k, reason: collision with root package name */
        boolean f45010k = false;

        /* renamed from: l, reason: collision with root package name */
        boolean f45011l = false;

        /* renamed from: m, reason: collision with root package name */
        private float f45012m;

        g(RecyclerView.C c11, int i11, float f7, float f11, float f12, float f13) {
            this.f45005f = i11;
            this.f45004e = c11;
            this.f45000a = f7;
            this.f45001b = f11;
            this.f45002c = f12;
            this.f45003d = f13;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f45006g = ofFloat;
            ofFloat.addUpdateListener(new n(this));
            ofFloat.setTarget(c11.itemView);
            ofFloat.addListener(this);
            this.f45012m = 0.0f;
        }

        public final void a() {
            this.f45006g.cancel();
        }

        public final void b(long j11) {
            this.f45006g.setDuration(j11);
        }

        public final void c(float f7) {
            this.f45012m = f7;
        }

        public final void d() {
            this.f45004e.setIsRecyclable(false);
            this.f45006g.start();
        }

        public final void e() {
            float f7 = this.f45000a;
            float f11 = this.f45002c;
            RecyclerView.C c11 = this.f45004e;
            if (f7 == f11) {
                this.f45008i = c11.itemView.getTranslationX();
            } else {
                this.f45008i = C3143a.d(f11, f7, this.f45012m, f7);
            }
            float f12 = this.f45001b;
            float f13 = this.f45003d;
            if (f12 == f13) {
                this.f45009j = c11.itemView.getTranslationY();
            } else {
                this.f45009j = C3143a.d(f13, f12, this.f45012m, f12);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f45012m = 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f45011l) {
                this.f45004e.setIsRecyclable(true);
            }
            this.f45011l = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    public static abstract class h extends e {
        private int mDefaultDragDirs;
        private int mDefaultSwipeDirs;

        public h(int i11, int i12) {
            this.mDefaultSwipeDirs = i12;
            this.mDefaultDragDirs = i11;
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        void prepareForDrop(@NonNull View view, @NonNull View view2, int i11, int i12);
    }

    public m(@NonNull e eVar) {
        this.mCallback = eVar;
    }

    private void addChildDrawingOrderCallback() {
    }

    private int checkHorizontalSwipe(RecyclerView.C c11, int i11) {
        if ((i11 & 12) == 0) {
            return 0;
        }
        int i12 = this.mDx > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null && this.mActivePointerId > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.mCallback.getSwipeVelocityThreshold(this.mMaxSwipeVelocity));
            float xVelocity = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
            float yVelocity = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
            int i13 = xVelocity > 0.0f ? 8 : 4;
            float abs = Math.abs(xVelocity);
            if ((i13 & i11) != 0 && i12 == i13 && abs >= this.mCallback.getSwipeEscapeVelocity(this.mSwipeEscapeVelocity) && abs > Math.abs(yVelocity)) {
                return i13;
            }
        }
        float swipeThreshold = this.mCallback.getSwipeThreshold(c11) * this.mRecyclerView.getWidth();
        if ((i11 & i12) == 0 || Math.abs(this.mDx) <= swipeThreshold) {
            return 0;
        }
        return i12;
    }

    private int checkVerticalSwipe(RecyclerView.C c11, int i11) {
        if ((i11 & 3) == 0) {
            return 0;
        }
        int i12 = this.mDy > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null && this.mActivePointerId > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.mCallback.getSwipeVelocityThreshold(this.mMaxSwipeVelocity));
            float xVelocity = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
            float yVelocity = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
            int i13 = yVelocity > 0.0f ? 2 : 1;
            float abs = Math.abs(yVelocity);
            if ((i13 & i11) != 0 && i13 == i12 && abs >= this.mCallback.getSwipeEscapeVelocity(this.mSwipeEscapeVelocity) && abs > Math.abs(xVelocity)) {
                return i13;
            }
        }
        float swipeThreshold = this.mCallback.getSwipeThreshold(c11) * this.mRecyclerView.getHeight();
        if ((i11 & i12) == 0 || Math.abs(this.mDy) <= swipeThreshold) {
            return 0;
        }
        return i12;
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeItemDecoration(this);
        this.mRecyclerView.removeOnItemTouchListener(this.mOnItemTouchListener);
        this.mRecyclerView.removeOnChildAttachStateChangeListener(this);
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            this.mCallback.clearView(this.mRecyclerView, this.mRecoverAnimations.get(0).f45004e);
        }
        this.mRecoverAnimations.clear();
        this.mOverdrawChild = null;
        this.mOverdrawChildPosition = -1;
        releaseVelocityTracker();
        stopGestureDetection();
    }

    private List<RecyclerView.C> findSwapTargets(RecyclerView.C c11) {
        RecyclerView.C c12 = c11;
        List<RecyclerView.C> list = this.mSwapTargets;
        if (list == null) {
            this.mSwapTargets = new ArrayList();
            this.mDistances = new ArrayList();
        } else {
            list.clear();
            this.mDistances.clear();
        }
        int boundingBoxMargin = this.mCallback.getBoundingBoxMargin();
        int round = Math.round(this.mSelectedStartX + this.mDx) - boundingBoxMargin;
        int round2 = Math.round(this.mSelectedStartY + this.mDy) - boundingBoxMargin;
        int i11 = boundingBoxMargin * 2;
        int width = c12.itemView.getWidth() + round + i11;
        int height = c12.itemView.getHeight() + round2 + i11;
        int i12 = (round + width) / 2;
        int i13 = (round2 + height) / 2;
        RecyclerView.o layoutManager = this.mRecyclerView.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = layoutManager.getChildAt(i14);
            if (childAt != c12.itemView && childAt.getBottom() >= round2 && childAt.getTop() <= height && childAt.getRight() >= round && childAt.getLeft() <= width) {
                RecyclerView.C childViewHolder = this.mRecyclerView.getChildViewHolder(childAt);
                if (this.mCallback.canDropOver(this.mRecyclerView, this.mSelected, childViewHolder)) {
                    int abs = Math.abs(i12 - ((childAt.getRight() + childAt.getLeft()) / 2));
                    int abs2 = Math.abs(i13 - ((childAt.getBottom() + childAt.getTop()) / 2));
                    int i15 = (abs2 * abs2) + (abs * abs);
                    int size = this.mSwapTargets.size();
                    int i16 = 0;
                    for (int i17 = 0; i17 < size && i15 > this.mDistances.get(i17).intValue(); i17++) {
                        i16++;
                    }
                    this.mSwapTargets.add(i16, childViewHolder);
                    this.mDistances.add(i16, Integer.valueOf(i15));
                }
            }
            i14++;
            c12 = c11;
        }
        return this.mSwapTargets;
    }

    private RecyclerView.C findSwipedView(MotionEvent motionEvent) {
        View findChildView;
        RecyclerView.o layoutManager = this.mRecyclerView.getLayoutManager();
        int i11 = this.mActivePointerId;
        if (i11 == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i11);
        float x11 = motionEvent.getX(findPointerIndex) - this.mInitialTouchX;
        float y11 = motionEvent.getY(findPointerIndex) - this.mInitialTouchY;
        float abs = Math.abs(x11);
        float abs2 = Math.abs(y11);
        int i12 = this.mSlop;
        if (abs < i12 && abs2 < i12) {
            return null;
        }
        if (abs > abs2 && layoutManager.canScrollHorizontally()) {
            return null;
        }
        if ((abs2 <= abs || !layoutManager.canScrollVertically()) && (findChildView = findChildView(motionEvent)) != null) {
            return this.mRecyclerView.getChildViewHolder(findChildView);
        }
        return null;
    }

    private void getSelectedDxDy(float[] fArr) {
        if ((this.mSelectedFlags & 12) != 0) {
            fArr[0] = (this.mSelectedStartX + this.mDx) - this.mSelected.itemView.getLeft();
        } else {
            fArr[0] = this.mSelected.itemView.getTranslationX();
        }
        if ((this.mSelectedFlags & 3) != 0) {
            fArr[1] = (this.mSelectedStartY + this.mDy) - this.mSelected.itemView.getTop();
        } else {
            fArr[1] = this.mSelected.itemView.getTranslationY();
        }
    }

    private static boolean hitTest(View view, float f7, float f11, float f12, float f13) {
        return f7 >= f12 && f7 <= f12 + ((float) view.getWidth()) && f11 >= f13 && f11 <= f13 + ((float) view.getHeight());
    }

    private void releaseVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private void setupCallbacks() {
        this.mSlop = ViewConfiguration.get(this.mRecyclerView.getContext()).getScaledTouchSlop();
        this.mRecyclerView.addItemDecoration(this);
        this.mRecyclerView.addOnItemTouchListener(this.mOnItemTouchListener);
        this.mRecyclerView.addOnChildAttachStateChangeListener(this);
        startGestureDetection();
    }

    private void startGestureDetection() {
        this.mItemTouchHelperGestureListener = new f();
        this.mGestureDetector = new GestureDetectorCompat(this.mRecyclerView.getContext(), this.mItemTouchHelperGestureListener);
    }

    private void stopGestureDetection() {
        f fVar = this.mItemTouchHelperGestureListener;
        if (fVar != null) {
            fVar.a();
            this.mItemTouchHelperGestureListener = null;
        }
        if (this.mGestureDetector != null) {
            this.mGestureDetector = null;
        }
    }

    private int swipeIfNecessary(RecyclerView.C c11) {
        if (this.mActionState == 2) {
            return 0;
        }
        int movementFlags = this.mCallback.getMovementFlags(this.mRecyclerView, c11);
        e eVar = this.mCallback;
        RecyclerView recyclerView = this.mRecyclerView;
        int i11 = Y.f42258g;
        int convertToAbsoluteDirection = (eVar.convertToAbsoluteDirection(movementFlags, recyclerView.getLayoutDirection()) & ACTION_MODE_SWIPE_MASK) >> 8;
        if (convertToAbsoluteDirection == 0) {
            return 0;
        }
        int i12 = (movementFlags & ACTION_MODE_SWIPE_MASK) >> 8;
        if (Math.abs(this.mDx) > Math.abs(this.mDy)) {
            int checkHorizontalSwipe = checkHorizontalSwipe(c11, convertToAbsoluteDirection);
            if (checkHorizontalSwipe > 0) {
                return (i12 & checkHorizontalSwipe) == 0 ? e.convertToRelativeDirection(checkHorizontalSwipe, this.mRecyclerView.getLayoutDirection()) : checkHorizontalSwipe;
            }
            int checkVerticalSwipe = checkVerticalSwipe(c11, convertToAbsoluteDirection);
            if (checkVerticalSwipe > 0) {
                return checkVerticalSwipe;
            }
        } else {
            int checkVerticalSwipe2 = checkVerticalSwipe(c11, convertToAbsoluteDirection);
            if (checkVerticalSwipe2 > 0) {
                return checkVerticalSwipe2;
            }
            int checkHorizontalSwipe2 = checkHorizontalSwipe(c11, convertToAbsoluteDirection);
            if (checkHorizontalSwipe2 > 0) {
                return (i12 & checkHorizontalSwipe2) == 0 ? e.convertToRelativeDirection(checkHorizontalSwipe2, this.mRecyclerView.getLayoutDirection()) : checkHorizontalSwipe2;
            }
        }
        return 0;
    }

    public void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            destroyCallbacks();
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.mSwipeEscapeVelocity = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.mMaxSwipeVelocity = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            setupCallbacks();
        }
    }

    void checkSelectForSwipe(int i11, MotionEvent motionEvent, int i12) {
        RecyclerView.C findSwipedView;
        int absoluteMovementFlags;
        if (this.mSelected != null || i11 != 2 || this.mActionState == 2 || !this.mCallback.isItemViewSwipeEnabled() || this.mRecyclerView.getScrollState() == 1 || (findSwipedView = findSwipedView(motionEvent)) == null || (absoluteMovementFlags = (this.mCallback.getAbsoluteMovementFlags(this.mRecyclerView, findSwipedView) & ACTION_MODE_SWIPE_MASK) >> 8) == 0) {
            return;
        }
        float x11 = motionEvent.getX(i12);
        float y11 = motionEvent.getY(i12);
        float f7 = x11 - this.mInitialTouchX;
        float f11 = y11 - this.mInitialTouchY;
        float abs = Math.abs(f7);
        float abs2 = Math.abs(f11);
        int i13 = this.mSlop;
        if (abs >= i13 || abs2 >= i13) {
            if (abs > abs2) {
                if (f7 < 0.0f && (absoluteMovementFlags & 4) == 0) {
                    return;
                }
                if (f7 > 0.0f && (absoluteMovementFlags & 8) == 0) {
                    return;
                }
            } else {
                if (f11 < 0.0f && (absoluteMovementFlags & 1) == 0) {
                    return;
                }
                if (f11 > 0.0f && (absoluteMovementFlags & 2) == 0) {
                    return;
                }
            }
            this.mDy = 0.0f;
            this.mDx = 0.0f;
            this.mActivePointerId = motionEvent.getPointerId(0);
            select(findSwipedView, 1);
        }
    }

    void endRecoverAnimation(RecyclerView.C c11, boolean z11) {
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            g gVar = this.mRecoverAnimations.get(size);
            if (gVar.f45004e == c11) {
                gVar.f45010k |= z11;
                if (!gVar.f45011l) {
                    gVar.a();
                }
                this.mRecoverAnimations.remove(size);
                return;
            }
        }
    }

    g findAnimation(MotionEvent motionEvent) {
        if (this.mRecoverAnimations.isEmpty()) {
            return null;
        }
        View findChildView = findChildView(motionEvent);
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            g gVar = this.mRecoverAnimations.get(size);
            if (gVar.f45004e.itemView == findChildView) {
                return gVar;
            }
        }
        return null;
    }

    View findChildView(MotionEvent motionEvent) {
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        RecyclerView.C c11 = this.mSelected;
        if (c11 != null) {
            View view = c11.itemView;
            if (hitTest(view, x11, y11, this.mSelectedStartX + this.mDx, this.mSelectedStartY + this.mDy)) {
                return view;
            }
        }
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            g gVar = this.mRecoverAnimations.get(size);
            View view2 = gVar.f45004e.itemView;
            if (hitTest(view2, x11, y11, gVar.f45008i, gVar.f45009j)) {
                return view2;
            }
        }
        return this.mRecyclerView.findChildViewUnder(x11, y11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.A a11) {
        rect.setEmpty();
    }

    boolean hasRunningRecoverAnim() {
        int size = this.mRecoverAnimations.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!this.mRecoverAnimations.get(i11).f45011l) {
                return true;
            }
        }
        return false;
    }

    void moveIfNecessary(RecyclerView.C c11) {
        if (!this.mRecyclerView.isLayoutRequested() && this.mActionState == 2) {
            float moveThreshold = this.mCallback.getMoveThreshold(c11);
            int i11 = (int) (this.mSelectedStartX + this.mDx);
            int i12 = (int) (this.mSelectedStartY + this.mDy);
            if (Math.abs(i12 - c11.itemView.getTop()) >= c11.itemView.getHeight() * moveThreshold || Math.abs(i11 - c11.itemView.getLeft()) >= c11.itemView.getWidth() * moveThreshold) {
                List<RecyclerView.C> findSwapTargets = findSwapTargets(c11);
                if (findSwapTargets.size() == 0) {
                    return;
                }
                RecyclerView.C chooseDropTarget = this.mCallback.chooseDropTarget(c11, findSwapTargets, i11, i12);
                if (chooseDropTarget == null) {
                    this.mSwapTargets.clear();
                    this.mDistances.clear();
                    return;
                }
                int adapterPosition = chooseDropTarget.getAdapterPosition();
                int adapterPosition2 = c11.getAdapterPosition();
                if (this.mCallback.onMove(this.mRecyclerView, c11, chooseDropTarget)) {
                    this.mCallback.onMoved(this.mRecyclerView, c11, adapterPosition2, chooseDropTarget, adapterPosition, i11, i12);
                }
            }
        }
    }

    void obtainVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.mVelocityTracker = VelocityTracker.obtain();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onChildViewAttachedToWindow(@NonNull View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onChildViewDetachedFromWindow(@NonNull View view) {
        removeChildDrawingOrderCallbackIfNecessary(view);
        RecyclerView.C childViewHolder = this.mRecyclerView.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.C c11 = this.mSelected;
        if (c11 != null && childViewHolder == c11) {
            select(null, 0);
            return;
        }
        endRecoverAnimation(childViewHolder, false);
        if (this.mPendingCleanup.remove(childViewHolder.itemView)) {
            this.mCallback.clearView(this.mRecyclerView, childViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.A a11) {
        float f7;
        float f11;
        this.mOverdrawChildPosition = -1;
        if (this.mSelected != null) {
            getSelectedDxDy(this.mTmpPosition);
            float[] fArr = this.mTmpPosition;
            float f12 = fArr[0];
            f11 = fArr[1];
            f7 = f12;
        } else {
            f7 = 0.0f;
            f11 = 0.0f;
        }
        this.mCallback.onDraw(canvas, recyclerView, this.mSelected, this.mRecoverAnimations, this.mActionState, f7, f11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.A a11) {
        float f7;
        float f11;
        if (this.mSelected != null) {
            getSelectedDxDy(this.mTmpPosition);
            float[] fArr = this.mTmpPosition;
            float f12 = fArr[0];
            f11 = fArr[1];
            f7 = f12;
        } else {
            f7 = 0.0f;
            f11 = 0.0f;
        }
        this.mCallback.onDrawOver(canvas, recyclerView, this.mSelected, this.mRecoverAnimations, this.mActionState, f7, f11);
    }

    void postDispatchSwipe(g gVar, int i11) {
        this.mRecyclerView.post(new d(gVar, i11));
    }

    void removeChildDrawingOrderCallbackIfNecessary(View view) {
        if (view == this.mOverdrawChild) {
            this.mOverdrawChild = null;
            if (this.mChildDrawingOrderCallback != null) {
                this.mRecyclerView.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        if (r6 < 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bf, code lost:
    
        if (r6 > 0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean scrollIfNecessary() {
        int i11;
        int i12;
        int i13;
        if (this.mSelected == null) {
            this.mDragScrollStartTimeInMs = Long.MIN_VALUE;
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = this.mDragScrollStartTimeInMs;
        long j12 = j11 == Long.MIN_VALUE ? 0L : currentTimeMillis - j11;
        RecyclerView.o layoutManager = this.mRecyclerView.getLayoutManager();
        if (this.mTmpRect == null) {
            this.mTmpRect = new Rect();
        }
        layoutManager.calculateItemDecorationsForChild(this.mSelected.itemView, this.mTmpRect);
        if (layoutManager.canScrollHorizontally()) {
            int i14 = (int) (this.mSelectedStartX + this.mDx);
            int paddingLeft = (i14 - this.mTmpRect.left) - this.mRecyclerView.getPaddingLeft();
            float f7 = this.mDx;
            if ((f7 < 0.0f && paddingLeft < 0) || (f7 > 0.0f && (paddingLeft = ((this.mSelected.itemView.getWidth() + i14) + this.mTmpRect.right) - (this.mRecyclerView.getWidth() - this.mRecyclerView.getPaddingRight())) > 0)) {
                i11 = paddingLeft;
                if (layoutManager.canScrollVertically()) {
                    int i15 = (int) (this.mSelectedStartY + this.mDy);
                    i12 = (i15 - this.mTmpRect.top) - this.mRecyclerView.getPaddingTop();
                    float f11 = this.mDy;
                    if (f11 < 0.0f) {
                    }
                    if (f11 > 0.0f) {
                        i12 = ((this.mSelected.itemView.getHeight() + i15) + this.mTmpRect.bottom) - (this.mRecyclerView.getHeight() - this.mRecyclerView.getPaddingBottom());
                    }
                }
                i12 = 0;
                if (i11 != 0) {
                    i11 = this.mCallback.interpolateOutOfBoundsScroll(this.mRecyclerView, this.mSelected.itemView.getWidth(), i11, this.mRecyclerView.getWidth(), j12);
                }
                i13 = i11;
                if (i12 == 0) {
                    i12 = this.mCallback.interpolateOutOfBoundsScroll(this.mRecyclerView, this.mSelected.itemView.getHeight(), i12, this.mRecyclerView.getHeight(), j12);
                }
                if (i13 != 0 && i12 == 0) {
                    this.mDragScrollStartTimeInMs = Long.MIN_VALUE;
                    return false;
                }
                if (this.mDragScrollStartTimeInMs == Long.MIN_VALUE) {
                    this.mDragScrollStartTimeInMs = currentTimeMillis;
                }
                this.mRecyclerView.scrollBy(i13, i12);
                return true;
            }
        }
        i11 = 0;
        if (layoutManager.canScrollVertically()) {
        }
        i12 = 0;
        if (i11 != 0) {
        }
        i13 = i11;
        if (i12 == 0) {
        }
        if (i13 != 0) {
        }
        if (this.mDragScrollStartTimeInMs == Long.MIN_VALUE) {
        }
        this.mRecyclerView.scrollBy(i13, i12);
        return true;
    }

    void select(RecyclerView.C c11, int i11) {
        boolean z11;
        float signum;
        float f7;
        if (c11 == this.mSelected && i11 == this.mActionState) {
            return;
        }
        this.mDragScrollStartTimeInMs = Long.MIN_VALUE;
        int i12 = this.mActionState;
        endRecoverAnimation(c11, true);
        this.mActionState = i11;
        if (i11 == 2) {
            if (c11 == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.mOverdrawChild = c11.itemView;
            addChildDrawingOrderCallback();
        }
        int i13 = (1 << ((i11 * 8) + 8)) - 1;
        RecyclerView.C c12 = this.mSelected;
        boolean z12 = false;
        if (c12 != null) {
            if (c12.itemView.getParent() != null) {
                int swipeIfNecessary = i12 == 2 ? 0 : swipeIfNecessary(c12);
                releaseVelocityTracker();
                int i14 = 4;
                if (swipeIfNecessary == 1 || swipeIfNecessary == 2) {
                    signum = Math.signum(this.mDy) * this.mRecyclerView.getHeight();
                    f7 = 0.0f;
                } else if (swipeIfNecessary == 4 || swipeIfNecessary == 8 || swipeIfNecessary == 16 || swipeIfNecessary == 32) {
                    f7 = Math.signum(this.mDx) * this.mRecyclerView.getWidth();
                    signum = 0.0f;
                } else {
                    f7 = 0.0f;
                    signum = 0.0f;
                }
                if (i12 == 2) {
                    i14 = 8;
                } else if (swipeIfNecessary > 0) {
                    i14 = 2;
                }
                getSelectedDxDy(this.mTmpPosition);
                float[] fArr = this.mTmpPosition;
                int i15 = i14;
                float f11 = fArr[0];
                float f12 = fArr[1];
                z11 = false;
                c cVar = new c(c12, i12, f11, f12, f7, signum, swipeIfNecessary, c12);
                cVar.b(this.mCallback.getAnimationDuration(this.mRecyclerView, i15, f7 - f11, signum - f12));
                this.mRecoverAnimations.add(cVar);
                cVar.d();
                z12 = true;
            } else {
                z11 = false;
                removeChildDrawingOrderCallbackIfNecessary(c12.itemView);
                this.mCallback.clearView(this.mRecyclerView, c12);
                z12 = false;
            }
            this.mSelected = null;
        } else {
            z11 = false;
        }
        if (c11 != null) {
            this.mSelectedFlags = (this.mCallback.getAbsoluteMovementFlags(this.mRecyclerView, c11) & i13) >> (this.mActionState * 8);
            this.mSelectedStartX = c11.itemView.getLeft();
            this.mSelectedStartY = c11.itemView.getTop();
            this.mSelected = c11;
            if (i11 == 2) {
                c11.itemView.performHapticFeedback(z11 ? 1 : 0);
            }
        }
        ViewParent parent = this.mRecyclerView.getParent();
        if (parent != null) {
            if (this.mSelected != null) {
                z11 = true;
            }
            parent.requestDisallowInterceptTouchEvent(z11);
        }
        if (!z12) {
            this.mRecyclerView.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        this.mCallback.onSelectedChanged(this.mSelected, this.mActionState);
        this.mRecyclerView.invalidate();
    }

    public void startDrag(@NonNull RecyclerView.C c11) {
        if (!this.mCallback.hasDragFlag(this.mRecyclerView, c11)) {
            Log.e(TAG, "Start drag has been called but dragging is not enabled");
            return;
        }
        if (c11.itemView.getParent() != this.mRecyclerView) {
            Log.e(TAG, "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        obtainVelocityTracker();
        this.mDy = 0.0f;
        this.mDx = 0.0f;
        select(c11, 2);
    }

    public void startSwipe(@NonNull RecyclerView.C c11) {
        if (!this.mCallback.hasSwipeFlag(this.mRecyclerView, c11)) {
            Log.e(TAG, "Start swipe has been called but swiping is not enabled");
            return;
        }
        if (c11.itemView.getParent() != this.mRecyclerView) {
            Log.e(TAG, "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
            return;
        }
        obtainVelocityTracker();
        this.mDy = 0.0f;
        this.mDx = 0.0f;
        select(c11, 1);
    }

    void updateDxDy(MotionEvent motionEvent, int i11, int i12) {
        float x11 = motionEvent.getX(i12);
        float y11 = motionEvent.getY(i12);
        float f7 = x11 - this.mInitialTouchX;
        this.mDx = f7;
        this.mDy = y11 - this.mInitialTouchY;
        if ((i11 & 4) == 0) {
            this.mDx = Math.max(0.0f, f7);
        }
        if ((i11 & 8) == 0) {
            this.mDx = Math.min(0.0f, this.mDx);
        }
        if ((i11 & 1) == 0) {
            this.mDy = Math.max(0.0f, this.mDy);
        }
        if ((i11 & 2) == 0) {
            this.mDy = Math.min(0.0f, this.mDy);
        }
    }
}
