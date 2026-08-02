package androidx.swiperefreshlayout.widget;

import P.C0364u;
import P.I;
import P.InterfaceC0362s;
import P.InterfaceC0363t;
import P.U;
import P.r;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class l extends ViewGroup implements InterfaceC0363t, InterfaceC0362s {
    private static final int ALPHA_ANIMATION_DURATION = 300;
    private static final int ANIMATE_TO_START_DURATION = 200;
    private static final int ANIMATE_TO_TRIGGER_DURATION = 200;
    static final int CIRCLE_DIAMETER = 40;
    static final int CIRCLE_DIAMETER_LARGE = 56;
    private static final float DECELERATE_INTERPOLATION_FACTOR = 2.0f;
    public static final int DEFAULT = 1;
    private static final int DEFAULT_CIRCLE_TARGET = 64;
    public static final int DEFAULT_SLINGSHOT_DISTANCE = -1;
    private static final float DRAG_RATE = 0.5f;
    private static final int INVALID_POINTER = -1;
    public static final int LARGE = 0;
    private static final int[] LAYOUT_ATTRS = {R.attr.enabled};
    private static final String LOG_TAG = "l";
    private static final int MAX_ALPHA = 255;
    private static final float MAX_PROGRESS_ANGLE = 0.8f;
    private static final int SCALE_DOWN_DURATION = 150;
    private static final int STARTING_PROGRESS_ALPHA = 76;
    private int mActivePointerId;
    private Animation mAlphaMaxAnimation;
    private Animation mAlphaStartAnimation;
    private final Animation mAnimateToCorrectPosition;
    private final Animation mAnimateToStartPosition;
    private i mChildScrollUpCallback;
    private int mCircleDiameter;
    a mCircleView;
    private int mCircleViewIndex;
    int mCurrentTargetOffsetTop;
    int mCustomSlingshotDistance;
    private final DecelerateInterpolator mDecelerateInterpolator;
    private boolean mEnableLegacyRequestDisallowInterceptTouch;
    protected int mFrom;
    private float mInitialDownY;
    private float mInitialMotionY;
    private boolean mIsBeingDragged;
    j mListener;
    private int mMediumAnimationDuration;
    private boolean mNestedScrollInProgress;
    private final r mNestedScrollingChildHelper;
    private final C0364u mNestedScrollingParentHelper;
    private final int[] mNestedScrollingV2ConsumedCompat;
    boolean mNotify;
    protected int mOriginalOffsetTop;
    private final int[] mParentOffsetInWindow;
    private final int[] mParentScrollConsumed;
    e mProgress;
    private Animation.AnimationListener mRefreshListener;
    boolean mRefreshing;
    private boolean mReturningToStart;
    boolean mScale;
    private Animation mScaleAnimation;
    private Animation mScaleDownAnimation;
    private Animation mScaleDownToStartAnimation;
    int mSpinnerOffsetEnd;
    float mStartingScale;
    private View mTarget;
    private float mTotalDragDistance;
    private float mTotalUnconsumed;
    private int mTouchSlop;
    boolean mUsingCustomStart;

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRefreshing = false;
        this.mTotalDragDistance = -1.0f;
        this.mParentScrollConsumed = new int[2];
        this.mParentOffsetInWindow = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mActivePointerId = -1;
        this.mCircleViewIndex = -1;
        this.mRefreshListener = new f(this, 0);
        this.mAnimateToCorrectPosition = new h(this, 0);
        this.mAnimateToStartPosition = new h(this, 4);
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.mMediumAnimationDuration = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.mDecelerateInterpolator = new DecelerateInterpolator(DECELERATE_INTERPOLATION_FACTOR);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.mCircleDiameter = (int) (displayMetrics.density * 40.0f);
        a aVar = new a(getContext());
        float f7 = aVar.getContext().getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = aVar.getContext().obtainStyledAttributes(M0.a.f4538a);
        aVar.f9800b = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = U.f5037a;
        I.s(aVar, f7 * 4.0f);
        shapeDrawable.getPaint().setColor(aVar.f9800b);
        aVar.setBackground(shapeDrawable);
        this.mCircleView = aVar;
        e eVar = new e(getContext());
        this.mProgress = eVar;
        eVar.c(1);
        this.mCircleView.setImageDrawable(this.mProgress);
        this.mCircleView.setVisibility(8);
        addView(this.mCircleView);
        setChildrenDrawingOrderEnabled(true);
        int i7 = (int) (displayMetrics.density * 64.0f);
        this.mSpinnerOffsetEnd = i7;
        this.mTotalDragDistance = i7;
        this.mNestedScrollingParentHelper = new C0364u();
        this.mNestedScrollingChildHelper = new r(this);
        setNestedScrollingEnabled(true);
        int i8 = -this.mCircleDiameter;
        this.mCurrentTargetOffsetTop = i8;
        this.mOriginalOffsetTop = i8;
        moveToStart(1.0f);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, LAYOUT_ATTRS);
        setEnabled(obtainStyledAttributes2.getBoolean(0, true));
        obtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i7) {
        this.mCircleView.getBackground().setAlpha(i7);
        this.mProgress.setAlpha(i7);
    }

    public final void a() {
        if (this.mTarget == null) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (!childAt.equals(this.mCircleView)) {
                    this.mTarget = childAt;
                    return;
                }
            }
        }
    }

    public final void b(float f7) {
        if (f7 > this.mTotalDragDistance) {
            d(true, true);
            return;
        }
        this.mRefreshing = false;
        e eVar = this.mProgress;
        d dVar = eVar.f9828a;
        dVar.f9809e = 0.0f;
        dVar.f9810f = 0.0f;
        eVar.invalidateSelf();
        boolean z4 = this.mScale;
        f fVar = !z4 ? new f(this, 1) : null;
        int i7 = this.mCurrentTargetOffsetTop;
        if (z4) {
            this.mFrom = i7;
            this.mStartingScale = this.mCircleView.getScaleX();
            h hVar = new h(this, 1);
            this.mScaleDownToStartAnimation = hVar;
            hVar.setDuration(150L);
            if (fVar != null) {
                this.mCircleView.f9799a = fVar;
            }
            this.mCircleView.clearAnimation();
            this.mCircleView.startAnimation(this.mScaleDownToStartAnimation);
        } else {
            this.mFrom = i7;
            this.mAnimateToStartPosition.reset();
            this.mAnimateToStartPosition.setDuration(200L);
            this.mAnimateToStartPosition.setInterpolator(this.mDecelerateInterpolator);
            if (fVar != null) {
                this.mCircleView.f9799a = fVar;
            }
            this.mCircleView.clearAnimation();
            this.mCircleView.startAnimation(this.mAnimateToStartPosition);
        }
        e eVar2 = this.mProgress;
        d dVar2 = eVar2.f9828a;
        if (dVar2.f9817n) {
            dVar2.f9817n = false;
        }
        eVar2.invalidateSelf();
    }

    public final void c(float f7) {
        Animation animation;
        Animation animation2;
        e eVar = this.mProgress;
        d dVar = eVar.f9828a;
        if (!dVar.f9817n) {
            dVar.f9817n = true;
        }
        eVar.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f7 / this.mTotalDragDistance));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f7) - this.mTotalDragDistance;
        int i7 = this.mCustomSlingshotDistance;
        if (i7 <= 0) {
            i7 = this.mUsingCustomStart ? this.mSpinnerOffsetEnd - this.mOriginalOffsetTop : this.mSpinnerOffsetEnd;
        }
        float f8 = i7;
        double max2 = Math.max(0.0f, Math.min(abs, f8 * DECELERATE_INTERPOLATION_FACTOR) / f8) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * DECELERATE_INTERPOLATION_FACTOR;
        int i8 = this.mOriginalOffsetTop + ((int) ((f8 * min) + (f8 * pow * DECELERATE_INTERPOLATION_FACTOR)));
        if (this.mCircleView.getVisibility() != 0) {
            this.mCircleView.setVisibility(0);
        }
        if (!this.mScale) {
            this.mCircleView.setScaleX(1.0f);
            this.mCircleView.setScaleY(1.0f);
        }
        if (this.mScale) {
            setAnimationProgress(Math.min(1.0f, f7 / this.mTotalDragDistance));
        }
        if (f7 < this.mTotalDragDistance) {
            if (this.mProgress.f9828a.f9823t > STARTING_PROGRESS_ALPHA && ((animation2 = this.mAlphaStartAnimation) == null || !animation2.hasStarted() || animation2.hasEnded())) {
                g gVar = new g(this, this.mProgress.f9828a.f9823t, STARTING_PROGRESS_ALPHA);
                gVar.setDuration(300L);
                a aVar = this.mCircleView;
                aVar.f9799a = null;
                aVar.clearAnimation();
                this.mCircleView.startAnimation(gVar);
                this.mAlphaStartAnimation = gVar;
            }
        } else if (this.mProgress.f9828a.f9823t < MAX_ALPHA && ((animation = this.mAlphaMaxAnimation) == null || !animation.hasStarted() || animation.hasEnded())) {
            g gVar2 = new g(this, this.mProgress.f9828a.f9823t, MAX_ALPHA);
            gVar2.setDuration(300L);
            a aVar2 = this.mCircleView;
            aVar2.f9799a = null;
            aVar2.clearAnimation();
            this.mCircleView.startAnimation(gVar2);
            this.mAlphaMaxAnimation = gVar2;
        }
        float f9 = max * MAX_PROGRESS_ANGLE;
        e eVar2 = this.mProgress;
        float min2 = Math.min(MAX_PROGRESS_ANGLE, f9);
        d dVar2 = eVar2.f9828a;
        dVar2.f9809e = 0.0f;
        dVar2.f9810f = min2;
        eVar2.invalidateSelf();
        e eVar3 = this.mProgress;
        float min3 = Math.min(1.0f, max);
        d dVar3 = eVar3.f9828a;
        if (min3 != dVar3.f9819p) {
            dVar3.f9819p = min3;
        }
        eVar3.invalidateSelf();
        float f10 = ((pow * DECELERATE_INTERPOLATION_FACTOR) + ((max * 0.4f) - 0.25f)) * DRAG_RATE;
        e eVar4 = this.mProgress;
        eVar4.f9828a.f9811g = f10;
        eVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i8 - this.mCurrentTargetOffsetTop);
    }

    public boolean canChildScrollUp() {
        i iVar = this.mChildScrollUpCallback;
        if (iVar != null) {
            return iVar.canChildScrollUp(this, this.mTarget);
        }
        View view = this.mTarget;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    public final void d(boolean z4, boolean z7) {
        if (this.mRefreshing != z4) {
            this.mNotify = z7;
            a();
            this.mRefreshing = z4;
            if (!z4) {
                startScaleDownAnimation(this.mRefreshListener);
                return;
            }
            int i7 = this.mCurrentTargetOffsetTop;
            Animation.AnimationListener animationListener = this.mRefreshListener;
            this.mFrom = i7;
            this.mAnimateToCorrectPosition.reset();
            this.mAnimateToCorrectPosition.setDuration(200L);
            this.mAnimateToCorrectPosition.setInterpolator(this.mDecelerateInterpolator);
            if (animationListener != null) {
                this.mCircleView.f9799a = animationListener;
            }
            this.mCircleView.clearAnimation();
            this.mCircleView.startAnimation(this.mAnimateToCorrectPosition);
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f7, float f8, boolean z4) {
        return this.mNestedScrollingChildHelper.a(f7, f8, z4);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f7, float f8) {
        return this.mNestedScrollingChildHelper.b(f7, f8);
    }

    public boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2, int i9) {
        return i9 == 0 && dispatchNestedPreScroll(i7, i8, iArr, iArr2);
    }

    public void dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        if (i11 == 0) {
            this.mNestedScrollingChildHelper.d(i7, i8, i9, i10, iArr, i11, iArr2);
        }
    }

    public final void e(float f7) {
        float f8 = this.mInitialDownY;
        float f9 = f7 - f8;
        int i7 = this.mTouchSlop;
        if (f9 <= i7 || this.mIsBeingDragged) {
            return;
        }
        this.mInitialMotionY = f8 + i7;
        this.mIsBeingDragged = true;
        this.mProgress.setAlpha(STARTING_PROGRESS_ALPHA);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i7, int i8) {
        int i9 = this.mCircleViewIndex;
        return i9 < 0 ? i8 : i8 == i7 + (-1) ? i9 : i8 >= i9 ? i8 + 1 : i8;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0364u c0364u = this.mNestedScrollingParentHelper;
        return c0364u.f5111b | c0364u.f5110a;
    }

    public int getProgressCircleDiameter() {
        return this.mCircleDiameter;
    }

    public int getProgressViewEndOffset() {
        return this.mSpinnerOffsetEnd;
    }

    public int getProgressViewStartOffset() {
        return this.mOriginalOffsetTop;
    }

    public boolean hasNestedScrollingParent(int i7) {
        return i7 == 0 && hasNestedScrollingParent();
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.mNestedScrollingChildHelper.f5105d;
    }

    public boolean isRefreshing() {
        return this.mRefreshing;
    }

    public void moveToStart(float f7) {
        setTargetOffsetTopAndBottom((this.mFrom + ((int) ((this.mOriginalOffsetTop - r0) * f7))) - this.mCircleView.getTop());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        reset();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a();
        int actionMasked = motionEvent.getActionMasked();
        if (this.mReturningToStart && actionMasked == 0) {
            this.mReturningToStart = false;
        }
        if (!isEnabled() || this.mReturningToStart || canChildScrollUp() || this.mRefreshing || this.mNestedScrollInProgress) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i7 = this.mActivePointerId;
                    if (i7 == -1) {
                        Log.e(LOG_TAG, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i7);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    e(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
                            this.mActivePointerId = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        }
                    }
                }
            }
            this.mIsBeingDragged = false;
            this.mActivePointerId = -1;
        } else {
            setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.mCircleView.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.mActivePointerId = pointerId;
            this.mIsBeingDragged = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.mInitialDownY = motionEvent.getY(findPointerIndex2);
        }
        return this.mIsBeingDragged;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.mTarget == null) {
            a();
        }
        View view = this.mTarget;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.mCircleView.getMeasuredWidth();
        int measuredHeight2 = this.mCircleView.getMeasuredHeight();
        int i11 = measuredWidth / 2;
        int i12 = measuredWidth2 / 2;
        int i13 = this.mCurrentTargetOffsetTop;
        this.mCircleView.layout(i11 - i12, i13, i11 + i12, measuredHeight2 + i13);
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (this.mTarget == null) {
            a();
        }
        View view = this.mTarget;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.mCircleView.measure(View.MeasureSpec.makeMeasureSpec(this.mCircleDiameter, 1073741824), View.MeasureSpec.makeMeasureSpec(this.mCircleDiameter, 1073741824));
        this.mCircleViewIndex = -1;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            if (getChildAt(i9) == this.mCircleView) {
                this.mCircleViewIndex = i9;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f7, float f8, boolean z4) {
        return dispatchNestedFling(f7, f8, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f7, float f8) {
        return dispatchNestedPreFling(f7, f8);
    }

    @Override // P.InterfaceC0362s
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr, int i9) {
        if (i9 == 0) {
            onNestedPreScroll(view, i7, i8, iArr);
        }
    }

    @Override // P.InterfaceC0363t
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        if (i11 != 0) {
            return;
        }
        int i12 = iArr[1];
        dispatchNestedScroll(i7, i8, i9, i10, this.mParentOffsetInWindow, i11, iArr);
        int i13 = i10 - (iArr[1] - i12);
        if ((i13 == 0 ? i10 + this.mParentOffsetInWindow[1] : i13) >= 0 || canChildScrollUp()) {
            return;
        }
        float abs = this.mTotalUnconsumed + Math.abs(r1);
        this.mTotalUnconsumed = abs;
        c(abs);
        iArr[1] = iArr[1] + i13;
    }

    @Override // P.InterfaceC0362s
    public void onNestedScrollAccepted(View view, View view2, int i7, int i8) {
        if (i8 == 0) {
            onNestedScrollAccepted(view, view2, i7);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SwipeRefreshLayout$SavedState swipeRefreshLayout$SavedState = (SwipeRefreshLayout$SavedState) parcelable;
        super.onRestoreInstanceState(swipeRefreshLayout$SavedState.getSuperState());
        setRefreshing(swipeRefreshLayout$SavedState.f9798a);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new SwipeRefreshLayout$SavedState(super.onSaveInstanceState(), this.mRefreshing);
    }

    @Override // P.InterfaceC0362s
    public boolean onStartNestedScroll(View view, View view2, int i7, int i8) {
        if (i8 == 0) {
            return onStartNestedScroll(view, view2, i7);
        }
        return false;
    }

    @Override // P.InterfaceC0362s
    public void onStopNestedScroll(View view, int i7) {
        if (i7 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.mReturningToStart && actionMasked == 0) {
            this.mReturningToStart = false;
        }
        if (!isEnabled() || this.mReturningToStart || canChildScrollUp() || this.mRefreshing || this.mNestedScrollInProgress) {
            return false;
        }
        if (actionMasked == 0) {
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.mIsBeingDragged = false;
        } else {
            if (actionMasked == 1) {
                int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                if (findPointerIndex < 0) {
                    Log.e(LOG_TAG, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.mIsBeingDragged) {
                    float y4 = (motionEvent.getY(findPointerIndex) - this.mInitialMotionY) * DRAG_RATE;
                    this.mIsBeingDragged = false;
                    b(y4);
                }
                this.mActivePointerId = -1;
                return false;
            }
            if (actionMasked == 2) {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.mActivePointerId);
                if (findPointerIndex2 < 0) {
                    Log.e(LOG_TAG, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y5 = motionEvent.getY(findPointerIndex2);
                e(y5);
                if (this.mIsBeingDragged) {
                    float f7 = (y5 - this.mInitialMotionY) * DRAG_RATE;
                    if (f7 <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    c(f7);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(LOG_TAG, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    int actionIndex2 = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex2) == this.mActivePointerId) {
                        this.mActivePointerId = motionEvent.getPointerId(actionIndex2 == 0 ? 1 : 0);
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z4) {
        ViewParent parent;
        View view = this.mTarget;
        if (view != null) {
            WeakHashMap weakHashMap = U.f5037a;
            if (!I.p(view)) {
                if (this.mEnableLegacyRequestDisallowInterceptTouch || (parent = getParent()) == null) {
                    return;
                }
                parent.requestDisallowInterceptTouchEvent(z4);
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    public void reset() {
        this.mCircleView.clearAnimation();
        this.mProgress.stop();
        this.mCircleView.setVisibility(8);
        setColorViewAlpha(MAX_ALPHA);
        if (this.mScale) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.mCurrentTargetOffsetTop);
        }
        this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
    }

    public void setAnimationProgress(float f7) {
        this.mCircleView.setScaleX(f7);
        this.mCircleView.setScaleY(f7);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        a();
        e eVar = this.mProgress;
        d dVar = eVar.f9828a;
        dVar.f9813i = iArr;
        dVar.a(0);
        dVar.a(0);
        eVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            iArr2[i7] = G.h.getColor(context, iArr[i7]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i7) {
        this.mTotalDragDistance = i7;
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        if (z4) {
            return;
        }
        reset();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z4) {
        this.mEnableLegacyRequestDisallowInterceptTouch = z4;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        r rVar = this.mNestedScrollingChildHelper;
        if (rVar.f5105d) {
            WeakHashMap weakHashMap = U.f5037a;
            I.z(rVar.f5104c);
        }
        rVar.f5105d = z4;
    }

    public void setOnChildScrollUpCallback(i iVar) {
        this.mChildScrollUpCallback = iVar;
    }

    public void setOnRefreshListener(j jVar) {
        this.mListener = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i7) {
        setProgressBackgroundColorSchemeResource(i7);
    }

    public void setProgressBackgroundColorSchemeColor(int i7) {
        this.mCircleView.setBackgroundColor(i7);
    }

    public void setProgressBackgroundColorSchemeResource(int i7) {
        setProgressBackgroundColorSchemeColor(G.h.getColor(getContext(), i7));
    }

    public void setProgressViewEndTarget(boolean z4, int i7) {
        this.mSpinnerOffsetEnd = i7;
        this.mScale = z4;
        this.mCircleView.invalidate();
    }

    public void setProgressViewOffset(boolean z4, int i7, int i8) {
        this.mScale = z4;
        this.mOriginalOffsetTop = i7;
        this.mSpinnerOffsetEnd = i8;
        this.mUsingCustomStart = true;
        reset();
        this.mRefreshing = false;
    }

    public void setRefreshing(boolean z4) {
        if (!z4 || this.mRefreshing == z4) {
            d(z4, false);
            return;
        }
        this.mRefreshing = z4;
        setTargetOffsetTopAndBottom((!this.mUsingCustomStart ? this.mSpinnerOffsetEnd + this.mOriginalOffsetTop : this.mSpinnerOffsetEnd) - this.mCurrentTargetOffsetTop);
        this.mNotify = false;
        Animation.AnimationListener animationListener = this.mRefreshListener;
        this.mCircleView.setVisibility(0);
        this.mProgress.setAlpha(MAX_ALPHA);
        h hVar = new h(this, 2);
        this.mScaleAnimation = hVar;
        hVar.setDuration(this.mMediumAnimationDuration);
        if (animationListener != null) {
            this.mCircleView.f9799a = animationListener;
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleAnimation);
    }

    public void setSize(int i7) {
        if (i7 == 0 || i7 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i7 == 0) {
                this.mCircleDiameter = (int) (displayMetrics.density * 56.0f);
            } else {
                this.mCircleDiameter = (int) (displayMetrics.density * 40.0f);
            }
            this.mCircleView.setImageDrawable(null);
            this.mProgress.c(i7);
            this.mCircleView.setImageDrawable(this.mProgress);
        }
    }

    public void setSlingshotDistance(int i7) {
        this.mCustomSlingshotDistance = i7;
    }

    public void setTargetOffsetTopAndBottom(int i7) {
        this.mCircleView.bringToFront();
        a aVar = this.mCircleView;
        WeakHashMap weakHashMap = U.f5037a;
        aVar.offsetTopAndBottom(i7);
        this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
    }

    public boolean startNestedScroll(int i7, int i8) {
        return i8 == 0 && startNestedScroll(i7);
    }

    public void startScaleDownAnimation(Animation.AnimationListener animationListener) {
        h hVar = new h(this, 3);
        this.mScaleDownAnimation = hVar;
        hVar.setDuration(150L);
        a aVar = this.mCircleView;
        aVar.f9799a = animationListener;
        aVar.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleDownAnimation);
    }

    public void stopNestedScroll(int i7) {
        if (i7 == 0) {
            stopNestedScroll();
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return this.mNestedScrollingChildHelper.c(i7, i8, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.mNestedScrollingChildHelper.f(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
        if (i8 > 0) {
            float f7 = this.mTotalUnconsumed;
            if (f7 > 0.0f) {
                float f8 = i8;
                if (f8 > f7) {
                    iArr[1] = (int) f7;
                    this.mTotalUnconsumed = 0.0f;
                } else {
                    this.mTotalUnconsumed = f7 - f8;
                    iArr[1] = i8;
                }
                c(this.mTotalUnconsumed);
            }
        }
        if (this.mUsingCustomStart && i8 > 0 && this.mTotalUnconsumed == 0.0f && Math.abs(i8 - iArr[1]) > 0) {
            this.mCircleView.setVisibility(8);
        }
        int[] iArr2 = this.mParentScrollConsumed;
        if (dispatchNestedPreScroll(i7 - iArr[0], i8 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i7) {
        this.mNestedScrollingParentHelper.f5110a = i7;
        startNestedScroll(i7 & 2);
        this.mTotalUnconsumed = 0.0f;
        this.mNestedScrollInProgress = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i7) {
        return (!isEnabled() || this.mReturningToStart || this.mRefreshing || (i7 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.mNestedScrollingParentHelper.f5110a = 0;
        this.mNestedScrollInProgress = false;
        float f7 = this.mTotalUnconsumed;
        if (f7 > 0.0f) {
            b(f7);
            this.mTotalUnconsumed = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i7) {
        return this.mNestedScrollingChildHelper.g(i7, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.mNestedScrollingChildHelper.h(0);
    }

    public boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr, int i11) {
        return i11 == 0 && this.mNestedScrollingChildHelper.d(i7, i8, i9, i10, iArr, i11, null);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return this.mNestedScrollingChildHelper.d(i7, i8, i9, i10, iArr, 0, null);
    }

    @Override // P.InterfaceC0362s
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10, int i11) {
        onNestedScroll(view, i7, i8, i9, i10, i11, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        onNestedScroll(view, i7, i8, i9, i10, 0, this.mNestedScrollingV2ConsumedCompat);
    }
}
