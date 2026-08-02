package androidx.recyclerview.widget;

import Am.C2438a;
import B4.V;
import E0.C2942q;
import Ij.C3261b;
import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.collection.Z;
import androidx.core.view.C5305a;
import androidx.core.view.C5306a0;
import androidx.core.view.C5350x;
import androidx.core.view.C5354z;
import androidx.core.view.InterfaceC5352y;
import androidx.core.view.ScrollingView;
import androidx.core.view.Y;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.C5467a;
import androidx.recyclerview.widget.E;
import androidx.recyclerview.widget.F;
import androidx.recyclerview.widget.l;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import y2.q;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, InterfaceC5352y {
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final Interpolator sQuinticInterpolator;
    androidx.recyclerview.widget.A mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    g mAdapter;
    C5467a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private j mChildDrawingOrderCallback;
    C5472f mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;

    @NonNull
    private k mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    androidx.recyclerview.widget.l mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private s mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    l mItemAnimator;
    private l.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<n> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    o mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final w mObserver;
    private List<q> mOnChildAttachStateListeners;
    private r mOnFlingListener;
    private final ArrayList<s> mOnItemTouchListeners;
    final List<C> mPendingAccessibilityImportanceChange;
    private x mPendingSavedState;
    boolean mPostedAnimatorRunner;
    l.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final v mRecycler;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private t mScrollListener;
    private List<t> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C5354z mScrollingChildHelper;
    final A mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final B mViewFlinger;
    private final F.b mViewInfoProcessCallback;
    final F mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    public static class A {

        /* renamed from: a, reason: collision with root package name */
        int f44712a = -1;

        /* renamed from: b, reason: collision with root package name */
        int f44713b = 0;

        /* renamed from: c, reason: collision with root package name */
        int f44714c = 0;

        /* renamed from: d, reason: collision with root package name */
        int f44715d = 1;

        /* renamed from: e, reason: collision with root package name */
        int f44716e = 0;

        /* renamed from: f, reason: collision with root package name */
        boolean f44717f = false;

        /* renamed from: g, reason: collision with root package name */
        boolean f44718g = false;

        /* renamed from: h, reason: collision with root package name */
        boolean f44719h = false;

        /* renamed from: i, reason: collision with root package name */
        boolean f44720i = false;

        /* renamed from: j, reason: collision with root package name */
        boolean f44721j = false;

        /* renamed from: k, reason: collision with root package name */
        boolean f44722k = false;

        /* renamed from: l, reason: collision with root package name */
        int f44723l;

        /* renamed from: m, reason: collision with root package name */
        long f44724m;

        /* renamed from: n, reason: collision with root package name */
        int f44725n;

        final void a(int i11) {
            if ((this.f44715d & i11) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i11) + " but it is " + Integer.toBinaryString(this.f44715d));
        }

        public final int b() {
            return this.f44718g ? this.f44713b - this.f44714c : this.f44716e;
        }

        public final boolean c() {
            return this.f44712a != -1;
        }

        public final boolean d() {
            return this.f44718g;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("State{mTargetPosition=");
            sb2.append(this.f44712a);
            sb2.append(", mData=null, mItemCount=");
            sb2.append(this.f44716e);
            sb2.append(", mIsMeasuring=");
            sb2.append(this.f44720i);
            sb2.append(", mPreviousLayoutItemCount=");
            sb2.append(this.f44713b);
            sb2.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb2.append(this.f44714c);
            sb2.append(", mStructureChanged=");
            sb2.append(this.f44717f);
            sb2.append(", mInPreLayout=");
            sb2.append(this.f44718g);
            sb2.append(", mRunSimpleAnimations=");
            sb2.append(this.f44721j);
            sb2.append(", mRunPredictiveAnimations=");
            return V.d(sb2, this.f44722k, '}');
        }
    }

    class B implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private int f44726a;

        /* renamed from: b, reason: collision with root package name */
        private int f44727b;

        /* renamed from: c, reason: collision with root package name */
        OverScroller f44728c;

        /* renamed from: d, reason: collision with root package name */
        Interpolator f44729d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f44730e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f44731f;

        B() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f44729d = interpolator;
            this.f44730e = false;
            this.f44731f = false;
            this.f44728c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final void a(int i11, int i12) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.setScrollState(2);
            this.f44727b = 0;
            this.f44726a = 0;
            Interpolator interpolator = this.f44729d;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f44729d = interpolator2;
                this.f44728c = new OverScroller(recyclerView.getContext(), interpolator2);
            }
            this.f44728c.fling(0, 0, i11, i12, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE);
            b();
        }

        final void b() {
            if (this.f44730e) {
                this.f44731f = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            int i11 = Y.f42258g;
            recyclerView.postOnAnimation(this);
        }

        public final void c(int i11, int i12, Interpolator interpolator, int i13) {
            int i14;
            RecyclerView recyclerView = RecyclerView.this;
            if (i13 == Integer.MIN_VALUE) {
                int abs = Math.abs(i11);
                int abs2 = Math.abs(i12);
                boolean z11 = abs > abs2;
                int sqrt = (int) Math.sqrt(0);
                int sqrt2 = (int) Math.sqrt((i12 * i12) + (i11 * i11));
                int width = z11 ? recyclerView.getWidth() : recyclerView.getHeight();
                int i15 = width / 2;
                float f7 = width;
                float f11 = i15;
                float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f7) - 0.5f) * 0.47123894f)) * f11) + f11;
                if (sqrt > 0) {
                    i14 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
                } else {
                    if (!z11) {
                        abs = abs2;
                    }
                    i14 = (int) (((abs / f7) + 1.0f) * 300.0f);
                }
                i13 = Math.min(i14, 2000);
            }
            int i16 = i13;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f44729d != interpolator) {
                this.f44729d = interpolator;
                this.f44728c = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.f44727b = 0;
            this.f44726a = 0;
            recyclerView.setScrollState(2);
            this.f44728c.startScroll(0, 0, i11, i12, i16);
            b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i11;
            int i12;
            int i13;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                recyclerView.removeCallbacks(this);
                this.f44728c.abortAnimation();
                return;
            }
            this.f44731f = false;
            this.f44730e = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f44728c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i14 = currX - this.f44726a;
                int i15 = currY - this.f44727b;
                this.f44726a = currX;
                this.f44727b = currY;
                int i16 = i14;
                int[] iArr = recyclerView.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView.dispatchNestedPreScroll(i16, i15, iArr, null, 1)) {
                    int[] iArr2 = recyclerView.mReusableIntPair;
                    i16 -= iArr2[0];
                    i11 = i15 - iArr2[1];
                } else {
                    i11 = i15;
                }
                int i17 = i16;
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.considerReleasingGlowsOnScroll(i17, i11);
                }
                if (recyclerView.mAdapter != null) {
                    int[] iArr3 = recyclerView.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView.scrollStep(i17, i11, iArr3);
                    int[] iArr4 = recyclerView.mReusableIntPair;
                    int i18 = iArr4[0];
                    int i19 = iArr4[1];
                    i17 -= i18;
                    i11 -= i19;
                    z zVar = recyclerView.mLayout.mSmoothScroller;
                    if (zVar != null && !zVar.isPendingInitialRun() && zVar.isRunning()) {
                        int b11 = recyclerView.mState.b();
                        if (b11 == 0) {
                            zVar.stop();
                        } else if (zVar.getTargetPosition() >= b11) {
                            zVar.setTargetPosition(b11 - 1);
                            zVar.onAnimation(i18, i19);
                        } else {
                            zVar.onAnimation(i18, i19);
                        }
                    }
                    i13 = i19;
                    i12 = i18;
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                if (!recyclerView.mItemDecorations.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr5 = recyclerView.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView.dispatchNestedScroll(i12, i13, i17, i11, null, 1, iArr5);
                int[] iArr6 = recyclerView.mReusableIntPair;
                int i21 = i17 - iArr6[0];
                int i22 = i11 - iArr6[1];
                if (i12 != 0 || i13 != 0) {
                    recyclerView.dispatchOnScrolled(i12, i13);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                boolean z11 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i21 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i22 != 0));
                z zVar2 = recyclerView.mLayout.mSmoothScroller;
                if ((zVar2 == null || !zVar2.isPendingInitialRun()) && z11) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i23 = i21 < 0 ? -currVelocity : i21 > 0 ? currVelocity : 0;
                        if (i22 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i22 <= 0) {
                            currVelocity = 0;
                        }
                        recyclerView.absorbGlows(i23, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        l.b bVar = recyclerView.mPrefetchRegistry;
                        int[] iArr7 = bVar.f44983c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        bVar.f44984d = 0;
                    }
                } else {
                    b();
                    androidx.recyclerview.widget.l lVar = recyclerView.mGapWorker;
                    if (lVar != null) {
                        lVar.a(recyclerView, i12, i13);
                    }
                }
            }
            z zVar3 = recyclerView.mLayout.mSmoothScroller;
            if (zVar3 != null && zVar3.isPendingInitialRun()) {
                zVar3.onAnimation(0, 0);
            }
            this.f44730e = false;
            if (!this.f44731f) {
                recyclerView.setScrollState(0);
                recyclerView.stopNestedScroll(1);
            } else {
                recyclerView.removeCallbacks(this);
                int i24 = Y.f42258g;
                recyclerView.postOnAnimation(this);
            }
        }
    }

    public static abstract class C {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;

        @NonNull
        public final View itemView;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        C mShadowedHolder = null;
        C mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        v mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public C(@NonNull View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        void addFlags(int i11) {
            this.mFlags = i11 | this.mFlags;
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) != 0) {
                return false;
            }
            View view = this.itemView;
            int i11 = Y.f42258g;
            return view.hasTransientState();
        }

        void flagRemovedAndOffsetPosition(int i11, int i12, boolean z11) {
            addFlags(8);
            offsetPosition(i12, z11);
            this.mPosition = i11;
        }

        public final int getAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionFor(this);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i11 = this.mPreLayoutPosition;
            return i11 == -1 ? this.mPosition : i11;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i11 = this.mPreLayoutPosition;
            return i11 == -1 ? this.mPosition : i11;
        }

        List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        boolean hasAnyOfTheFlags(int i11) {
            return (i11 & this.mFlags) != 0;
        }

        boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) != 0) {
                return false;
            }
            View view = this.itemView;
            int i11 = Y.f42258g;
            return !view.hasTransientState();
        }

        boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        boolean isScrap() {
            return this.mScrapContainer != null;
        }

        boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        void offsetPosition(int i11, boolean z11) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z11) {
                this.mPreLayoutPosition += i11;
            }
            this.mPosition += i11;
            if (this.itemView.getLayoutParams() != null) {
                ((p) this.itemView.getLayoutParams()).f44749c = true;
            }
        }

        void onEnteredHiddenState(RecyclerView recyclerView) {
            int i11 = this.mPendingAccessibilityState;
            if (i11 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i11;
            } else {
                View view = this.itemView;
                int i12 = Y.f42258g;
                this.mWasImportantForAccessibilityBeforeHidden = view.getImportantForAccessibility();
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        void setFlags(int i11, int i12) {
            this.mFlags = (i11 & i12) | (this.mFlags & (~i12));
        }

        public final void setIsRecyclable(boolean z11) {
            int i11 = this.mIsRecyclableCount;
            int i12 = z11 ? i11 - 1 : i11 + 1;
            this.mIsRecyclableCount = i12;
            if (i12 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z11 && i12 == 1) {
                this.mFlags |= 16;
            } else if (z11 && i12 == 0) {
                this.mFlags &= -17;
            }
        }

        void setScrapContainer(v vVar, boolean z11) {
            this.mScrapContainer = vVar;
            this.mInChangeScrap = z11;
        }

        boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder e11 = C2942q.e(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            e11.append(Integer.toHexString(hashCode()));
            e11.append(" position=");
            e11.append(this.mPosition);
            e11.append(" id=");
            e11.append(this.mItemId);
            e11.append(", oldPos=");
            e11.append(this.mOldPosition);
            e11.append(", pLpos:");
            e11.append(this.mPreLayoutPosition);
            StringBuilder sb2 = new StringBuilder(e11.toString());
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        void unScrap() {
            this.mScrapContainer.q(this);
        }

        boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a, reason: case insensitive filesystem */
    final class RunnableC5464a implements Runnable {
        RunnableC5464a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            if (!recyclerView.mIsAttached) {
                recyclerView.requestLayout();
            } else if (recyclerView.mLayoutSuppressed) {
                recyclerView.mLayoutWasDefered = true;
            } else {
                recyclerView.consumePendingUpdateOperations();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b, reason: case insensitive filesystem */
    final class RunnableC5465b implements Runnable {
        RunnableC5465b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            l lVar = recyclerView.mItemAnimator;
            if (lVar != null) {
                lVar.runPendingAnimations();
            }
            recyclerView.mPostedAnimatorRunner = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c, reason: case insensitive filesystem */
    static class InterpolatorC5466c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f7) {
            float f11 = f7 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    final class d implements F.b {
        d() {
        }
    }

    final class e {
        e() {
        }

        public final void a(int i11) {
            RecyclerView recyclerView = RecyclerView.this;
            View childAt = recyclerView.getChildAt(i11);
            if (childAt != null) {
                recyclerView.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeViewAt(i11);
        }
    }

    final class f {
        f() {
        }

        final void a(C5467a.C0815a c0815a) {
            int i11 = c0815a.f44834a;
            RecyclerView recyclerView = RecyclerView.this;
            if (i11 == 1) {
                recyclerView.mLayout.onItemsAdded(recyclerView, c0815a.f44835b, c0815a.f44837d);
                return;
            }
            if (i11 == 2) {
                recyclerView.mLayout.onItemsRemoved(recyclerView, c0815a.f44835b, c0815a.f44837d);
            } else if (i11 == 4) {
                recyclerView.mLayout.onItemsUpdated(recyclerView, c0815a.f44835b, c0815a.f44837d, c0815a.f44836c);
            } else {
                if (i11 != 8) {
                    return;
                }
                recyclerView.mLayout.onItemsMoved(recyclerView, c0815a.f44835b, c0815a.f44837d, 1);
            }
        }
    }

    static class h extends Observable<i> {
        public final boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        public final void c(int i11, int i12) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i11, i12, 1);
            }
        }

        public final void d(int i11, int i12, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i11, i12, obj);
            }
        }

        public final void e(int i11, int i12) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i11, i12);
            }
        }

        public final void f(int i11, int i12) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i11, i12);
            }
        }
    }

    public static abstract class i {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i11, int i12) {
        }

        public void onItemRangeInserted(int i11, int i12) {
        }

        public void onItemRangeMoved(int i11, int i12, int i13) {
        }

        public void onItemRangeRemoved(int i11, int i12) {
        }

        public void onItemRangeChanged(int i11, int i12, Object obj) {
            onItemRangeChanged(i11, i12);
        }
    }

    /* loaded from: classes8.dex */
    public interface j {
    }

    public static class k {
        @NonNull
        protected EdgeEffect createEdgeEffect(@NonNull RecyclerView recyclerView, int i11) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class l {
        private b mListener = null;
        private ArrayList<a> mFinishedListeners = new ArrayList<>();
        private long mAddDuration = 120;
        private long mRemoveDuration = 120;
        private long mMoveDuration = 250;
        private long mChangeDuration = 250;

        /* loaded from: classes8.dex */
        public interface a {
            void a();
        }

        interface b {
        }

        public static class c {

            /* renamed from: a, reason: collision with root package name */
            public int f44738a;

            /* renamed from: b, reason: collision with root package name */
            public int f44739b;
        }

        static int buildAdapterChangeFlagsForAnimations(C c11) {
            int i11 = c11.mFlags;
            int i12 = i11 & 14;
            if (c11.isInvalid()) {
                return 4;
            }
            if ((i11 & 4) == 0) {
                int oldPosition = c11.getOldPosition();
                int adapterPosition = c11.getAdapterPosition();
                if (oldPosition != -1 && adapterPosition != -1 && oldPosition != adapterPosition) {
                    return i12 | 2048;
                }
            }
            return i12;
        }

        public abstract boolean animateAppearance(@NonNull C c11, c cVar, @NonNull c cVar2);

        public abstract boolean animateChange(@NonNull C c11, @NonNull C c12, @NonNull c cVar, @NonNull c cVar2);

        public abstract boolean animateDisappearance(@NonNull C c11, @NonNull c cVar, c cVar2);

        public abstract boolean animatePersistence(@NonNull C c11, @NonNull c cVar, @NonNull c cVar2);

        public abstract boolean canReuseUpdatedViewHolder(@NonNull C c11);

        public boolean canReuseUpdatedViewHolder(@NonNull C c11, @NonNull List<Object> list) {
            return canReuseUpdatedViewHolder(c11);
        }

        public final void dispatchAnimationFinished(@NonNull C c11) {
            onAnimationFinished(c11);
            b bVar = this.mListener;
            if (bVar != null) {
                m mVar = (m) bVar;
                mVar.getClass();
                c11.setIsRecyclable(true);
                if (c11.mShadowedHolder != null && c11.mShadowingHolder == null) {
                    c11.mShadowedHolder = null;
                }
                c11.mShadowingHolder = null;
                if (c11.shouldBeKeptAsChild()) {
                    return;
                }
                View view = c11.itemView;
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.removeAnimatingView(view) || !c11.isTmpDetached()) {
                    return;
                }
                recyclerView.removeDetachedView(c11.itemView, false);
            }
        }

        public final void dispatchAnimationsFinished() {
            int size = this.mFinishedListeners.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.mFinishedListeners.get(i11).a();
            }
            this.mFinishedListeners.clear();
        }

        public abstract void endAnimation(@NonNull C c11);

        public abstract void endAnimations();

        public long getAddDuration() {
            return this.mAddDuration;
        }

        public long getChangeDuration() {
            return this.mChangeDuration;
        }

        public long getMoveDuration() {
            return this.mMoveDuration;
        }

        public long getRemoveDuration() {
            return this.mRemoveDuration;
        }

        public abstract boolean isRunning();

        public final boolean isRunning(a aVar) {
            boolean isRunning = isRunning();
            if (aVar != null) {
                if (!isRunning) {
                    aVar.a();
                    return isRunning;
                }
                this.mFinishedListeners.add(aVar);
            }
            return isRunning;
        }

        @NonNull
        public c obtainHolderInfo() {
            return new c();
        }

        public void onAnimationFinished(@NonNull C c11) {
        }

        @NonNull
        public c recordPostLayoutInformation(@NonNull A a11, @NonNull C c11) {
            c obtainHolderInfo = obtainHolderInfo();
            obtainHolderInfo.getClass();
            View view = c11.itemView;
            obtainHolderInfo.f44738a = view.getLeft();
            obtainHolderInfo.f44739b = view.getTop();
            view.getRight();
            view.getBottom();
            return obtainHolderInfo;
        }

        @NonNull
        public c recordPreLayoutInformation(@NonNull A a11, @NonNull C c11, int i11, @NonNull List<Object> list) {
            c obtainHolderInfo = obtainHolderInfo();
            obtainHolderInfo.getClass();
            View view = c11.itemView;
            obtainHolderInfo.f44738a = view.getLeft();
            obtainHolderInfo.f44739b = view.getTop();
            view.getRight();
            view.getBottom();
            return obtainHolderInfo;
        }

        public abstract void runPendingAnimations();

        void setListener(b bVar) {
            this.mListener = bVar;
        }
    }

    private class m implements l.b {
        m() {
        }
    }

    public static abstract class n {
        @Deprecated
        public void getItemOffsets(@NonNull Rect rect, int i11, @NonNull RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull A a11) {
            getItemOffsets(rect, ((p) view.getLayoutParams()).f44747a.getLayoutPosition(), recyclerView);
        }

        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull A a11) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull A a11) {
            onDrawOver(canvas, recyclerView);
        }
    }

    public static abstract class o {
        boolean mAutoMeasure;
        C5472f mChildHelper;
        private int mHeight;
        private int mHeightMode;
        E mHorizontalBoundCheck;
        private final E.b mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;
        z mSmoothScroller;
        E mVerticalBoundCheck;
        private final E.b mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        final class a implements E.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.E.b
            public final int a() {
                return o.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.E.b
            public final int b() {
                o oVar = o.this;
                return oVar.getWidth() - oVar.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.E.b
            public final View c(int i11) {
                return o.this.getChildAt(i11);
            }

            @Override // androidx.recyclerview.widget.E.b
            public final int d(View view) {
                return o.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.E.b
            public final int e(View view) {
                return o.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }
        }

        final class b implements E.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.E.b
            public final int a() {
                return o.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.E.b
            public final int b() {
                o oVar = o.this;
                return oVar.getHeight() - oVar.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.E.b
            public final View c(int i11) {
                return o.this.getChildAt(i11);
            }

            @Override // androidx.recyclerview.widget.E.b
            public final int d(View view) {
                return o.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.E.b
            public final int e(View view) {
                return o.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i11, int i12);
        }

        /* loaded from: classes8.dex */
        public static class d {

            /* renamed from: a, reason: collision with root package name */
            public int f44743a;

            /* renamed from: b, reason: collision with root package name */
            public int f44744b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f44745c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f44746d;
        }

        public o() {
            a aVar = new a();
            this.mHorizontalBoundCheckCallback = aVar;
            b bVar = new b();
            this.mVerticalBoundCheckCallback = bVar;
            this.mHorizontalBoundCheck = new E(aVar);
            this.mVerticalBoundCheck = new E(bVar);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        private void addViewInt(View view, int i11, boolean z11) {
            C childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z11 || childViewHolderInt.isRemoved()) {
                Z<C, F.a> z12 = this.mRecyclerView.mViewInfoStore.f44672a;
                F.a aVar = z12.get(childViewHolderInt);
                if (aVar == null) {
                    aVar = F.a.a();
                    z12.put(childViewHolderInt, aVar);
                }
                aVar.f44675a |= 1;
            } else {
                this.mRecyclerView.mViewInfoStore.e(childViewHolderInt);
            }
            p pVar = (p) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.b(view, i11, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int k11 = this.mChildHelper.k(view);
                if (i11 == -1) {
                    i11 = this.mChildHelper.e();
                }
                if (k11 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.exceptionLabel());
                }
                if (k11 != i11) {
                    this.mRecyclerView.mLayout.moveView(k11, i11);
                }
            } else {
                this.mChildHelper.a(view, i11, false);
                pVar.f44749c = true;
                z zVar = this.mSmoothScroller;
                if (zVar != null && zVar.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
            if (pVar.f44750d) {
                childViewHolderInt.itemView.invalidate();
                pVar.f44750d = false;
            }
        }

        public static int chooseSize(int i11, int i12, int i13) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i12, i13) : size : Math.min(size, Math.max(i12, i13));
        }

        private void detachViewInternal(int i11, @NonNull View view) {
            this.mChildHelper.c(i11);
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
        
            if (r3 >= 0) goto L5;
         */
        @Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int getChildMeasureSpec(int i11, int i12, int i13, boolean z11) {
            int i14 = i11 - i12;
            int i15 = 0;
            int max = Math.max(0, i14);
            if (!z11) {
                if (i13 < 0) {
                    if (i13 == -1) {
                        i13 = max;
                    } else {
                        if (i13 == -2) {
                            i15 = LinearLayoutManager.INVALID_OFFSET;
                            i13 = max;
                        }
                        i13 = 0;
                    }
                }
                i15 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i13, i15);
        }

        private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width2 = rect.width() + left;
            int height2 = rect.height() + top;
            int i11 = left - paddingLeft;
            int min = Math.min(0, i11);
            int i12 = top - paddingTop;
            int min2 = Math.min(0, i12);
            int i13 = width2 - width;
            int max = Math.max(0, i13);
            int max2 = Math.max(0, height2 - height);
            if (getLayoutDirection() != 1) {
                if (min == 0) {
                    min = Math.min(i11, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i13);
            }
            if (min2 == 0) {
                min2 = Math.min(i12, max2);
            }
            return new int[]{max, min2};
        }

        public static d getProperties(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I4.a.f11972a, i11, i12);
            dVar.f44743a = obtainStyledAttributes.getInt(0, 1);
            dVar.f44744b = obtainStyledAttributes.getInt(10, 1);
            dVar.f44745c = obtainStyledAttributes.getBoolean(9, false);
            dVar.f44746d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i11, int i12) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i11 < width && rect.right - i11 > paddingLeft && rect.top - i12 < height && rect.bottom - i12 > paddingTop;
        }

        private static boolean isMeasurementUpToDate(int i11, int i12, int i13) {
            int mode = View.MeasureSpec.getMode(i12);
            int size = View.MeasureSpec.getSize(i12);
            if (i13 > 0 && i11 != i13) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i11;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i11;
            }
            return true;
        }

        private void scrapOrRecycleView(v vVar, int i11, View view) {
            C childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i11);
                vVar.l(childViewHolderInt);
            } else {
                detachViewAt(i11);
                vVar.m(view);
                this.mRecyclerView.mViewInfoStore.e(childViewHolderInt);
            }
        }

        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void attachView(@NonNull View view, int i11, p pVar) {
            C childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                Z<C, F.a> z11 = this.mRecyclerView.mViewInfoStore.f44672a;
                F.a aVar = z11.get(childViewHolderInt);
                if (aVar == null) {
                    aVar = F.a.a();
                    z11.put(childViewHolderInt, aVar);
                }
                aVar.f44675a |= 1;
            } else {
                this.mRecyclerView.mViewInfoStore.e(childViewHolderInt);
            }
            this.mChildHelper.b(view, i11, pVar, childViewHolderInt.isRemoved());
        }

        public void calculateItemDecorationsForChild(@NonNull View view, @NonNull Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(p pVar) {
            return pVar != null;
        }

        public void collectAdjacentPrefetchPositions(int i11, int i12, A a11, c cVar) {
        }

        public void collectInitialPrefetchPositions(int i11, c cVar) {
        }

        public int computeHorizontalScrollExtent(@NonNull A a11) {
            return 0;
        }

        public int computeHorizontalScrollOffset(@NonNull A a11) {
            return 0;
        }

        public int computeHorizontalScrollRange(@NonNull A a11) {
            return 0;
        }

        public int computeVerticalScrollExtent(@NonNull A a11) {
            return 0;
        }

        public int computeVerticalScrollOffset(@NonNull A a11) {
            return 0;
        }

        public int computeVerticalScrollRange(@NonNull A a11) {
            return 0;
        }

        public void detachAndScrapAttachedViews(@NonNull v vVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(vVar, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(@NonNull View view, @NonNull v vVar) {
            scrapOrRecycleView(vVar, this.mChildHelper.k(view), view);
        }

        public void detachAndScrapViewAt(int i11, @NonNull v vVar) {
            scrapOrRecycleView(vVar, i11, getChildAt(i11));
        }

        public void detachView(@NonNull View view) {
            int k11 = this.mChildHelper.k(view);
            if (k11 >= 0) {
                detachViewInternal(k11, view);
            }
        }

        public void detachViewAt(int i11) {
            detachViewInternal(i11, getChildAt(i11));
        }

        void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        void dispatchDetachedFromWindow(RecyclerView recyclerView, v vVar) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, vVar);
        }

        public void endAnimation(View view) {
            l lVar = this.mRecyclerView.mItemAnimator;
            if (lVar != null) {
                lVar.endAnimation(RecyclerView.getChildViewHolderInt(view));
            }
        }

        public View findContainingItemView(@NonNull View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.f44869c.contains(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        public View findViewByPosition(int i11) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                C childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i11 && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.f44718g || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public abstract p generateDefaultLayoutParams();

        public p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof p ? new p((p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new p((ViewGroup.MarginLayoutParams) layoutParams) : new p(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(@NonNull View view) {
            return ((p) view.getLayoutParams()).f44748b.bottom;
        }

        public View getChildAt(int i11) {
            C5472f c5472f = this.mChildHelper;
            if (c5472f != null) {
                return c5472f.d(i11);
            }
            return null;
        }

        public int getChildCount() {
            C5472f c5472f = this.mChildHelper;
            if (c5472f != null) {
                return c5472f.e();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int getColumnCountForAccessibility(@NonNull v vVar, @NonNull A a11) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.mAdapter == null || !canScrollHorizontally()) {
                return 1;
            }
            return this.mRecyclerView.mAdapter.getItemCount();
        }

        public int getDecoratedBottom(@NonNull View view) {
            return getBottomDecorationHeight(view) + view.getBottom();
        }

        public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(@NonNull View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(@NonNull View view) {
            Rect rect = ((p) view.getLayoutParams()).f44748b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(@NonNull View view) {
            Rect rect = ((p) view.getLayoutParams()).f44748b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(@NonNull View view) {
            return getRightDecorationWidth(view) + view.getRight();
        }

        public int getDecoratedTop(@NonNull View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.f44869c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(@NonNull View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLayoutDirection() {
            RecyclerView recyclerView = this.mRecyclerView;
            int i11 = Y.f42258g;
            return recyclerView.getLayoutDirection();
        }

        public int getLeftDecorationWidth(@NonNull View view) {
            return ((p) view.getLayoutParams()).f44748b.left;
        }

        public int getMinimumHeight() {
            RecyclerView recyclerView = this.mRecyclerView;
            int i11 = Y.f42258g;
            return recyclerView.getMinimumHeight();
        }

        public int getMinimumWidth() {
            RecyclerView recyclerView = this.mRecyclerView;
            int i11 = Y.f42258g;
            return recyclerView.getMinimumWidth();
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            int i11 = Y.f42258g;
            return recyclerView.getPaddingEnd();
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            int i11 = Y.f42258g;
            return recyclerView.getPaddingStart();
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(@NonNull View view) {
            return ((p) view.getLayoutParams()).f44747a.getLayoutPosition();
        }

        public int getRightDecorationWidth(@NonNull View view) {
            return ((p) view.getLayoutParams()).f44748b.right;
        }

        public int getRowCountForAccessibility(@NonNull v vVar, @NonNull A a11) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.mAdapter == null || !canScrollVertically()) {
                return 1;
            }
            return this.mRecyclerView.mAdapter.getItemCount();
        }

        public int getSelectionModeForAccessibility(@NonNull v vVar, @NonNull A a11) {
            return 0;
        }

        public int getTopDecorationHeight(@NonNull View view) {
            return ((p) view.getLayoutParams()).f44748b.top;
        }

        public void getTransformedBoundingBox(@NonNull View view, boolean z11, @NonNull Rect rect) {
            Matrix matrix;
            if (z11) {
                Rect rect2 = ((p) view.getLayoutParams()).f44748b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i11).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(@NonNull View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.mRecyclerView.exceptionLabel());
            }
            C childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(UserVerificationMethods.USER_VERIFY_PATTERN);
            this.mRecyclerView.mViewInfoStore.f(childViewHolderInt);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(@NonNull v vVar, @NonNull A a11) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            z zVar = this.mSmoothScroller;
            return zVar != null && zVar.isRunning();
        }

        public boolean isViewPartiallyVisible(@NonNull View view, boolean z11, boolean z12) {
            boolean z13 = this.mHorizontalBoundCheck.b(view) && this.mVerticalBoundCheck.b(view);
            return z11 ? z13 : !z13;
        }

        public void layoutDecorated(@NonNull View view, int i11, int i12, int i13, int i14) {
            Rect rect = ((p) view.getLayoutParams()).f44748b;
            view.layout(i11 + rect.left, i12 + rect.top, i13 - rect.right, i14 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(@NonNull View view, int i11, int i12, int i13, int i14) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.f44748b;
            view.layout(i11 + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i12 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i13 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i14 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        public void measureChild(@NonNull View view, int i11, int i12) {
            p pVar = (p) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i13 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i11;
            int i14 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i12;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i13, ((ViewGroup.MarginLayoutParams) pVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i14, ((ViewGroup.MarginLayoutParams) pVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, pVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(@NonNull View view, int i11, int i12) {
            p pVar = (p) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i13 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i11;
            int i14 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i12;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i13, ((ViewGroup.MarginLayoutParams) pVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i14, ((ViewGroup.MarginLayoutParams) pVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, pVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i11, int i12) {
            View childAt = getChildAt(i11);
            if (childAt != null) {
                detachViewAt(i11);
                attachView(childAt, i12);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i11 + this.mRecyclerView.toString());
            }
        }

        public void offsetChildrenHorizontal(int i11) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i11);
            }
        }

        public void offsetChildrenVertical(int i11) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i11);
            }
        }

        public void onAdapterChanged(g gVar, g gVar2) {
        }

        public boolean onAddFocusables(@NonNull RecyclerView recyclerView, @NonNull ArrayList<View> arrayList, int i11, int i12) {
            return false;
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public View onFocusSearchFailed(@NonNull View view, int i11, @NonNull v vVar, @NonNull A a11) {
            return null;
        }

        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        void onInitializeAccessibilityNodeInfo(y2.q qVar) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, qVar);
        }

        void onInitializeAccessibilityNodeInfoForItem(View view, y2.q qVar) {
            C childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved()) {
                return;
            }
            C5472f c5472f = this.mChildHelper;
            if (c5472f.f44869c.contains(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, qVar);
        }

        public View onInterceptFocusSearch(@NonNull View view, int i11) {
            return null;
        }

        public void onItemsAdded(@NonNull RecyclerView recyclerView, int i11, int i12) {
        }

        public void onItemsChanged(@NonNull RecyclerView recyclerView) {
        }

        public void onItemsMoved(@NonNull RecyclerView recyclerView, int i11, int i12, int i13) {
        }

        public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i11, int i12) {
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i11, int i12) {
        }

        public void onLayoutChildren(v vVar, A a11) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void onLayoutCompleted(A a11) {
        }

        public void onMeasure(@NonNull v vVar, @NonNull A a11, int i11, int i12) {
            this.mRecyclerView.defaultOnMeasure(i11, i12);
        }

        @Deprecated
        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull View view, View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i11) {
        }

        void onSmoothScrollerStopped(z zVar) {
            if (this.mSmoothScroller == zVar) {
                this.mSmoothScroller = null;
            }
        }

        boolean performAccessibilityAction(int i11, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i11, bundle);
        }

        public boolean performAccessibilityActionForItem(@NonNull v vVar, @NonNull A a11, @NonNull View view, int i11, Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                int i11 = Y.f42258g;
                recyclerView.postOnAnimation(runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.m(childCount);
            }
        }

        public void removeAndRecycleAllViews(@NonNull v vVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, vVar);
                }
            }
        }

        void removeAndRecycleScrapInt(v vVar) {
            ArrayList<C> arrayList;
            int size = vVar.f44755a.size();
            int i11 = size - 1;
            while (true) {
                arrayList = vVar.f44755a;
                if (i11 < 0) {
                    break;
                }
                View view = arrayList.get(i11).itemView;
                C childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(view, false);
                    }
                    l lVar = this.mRecyclerView.mItemAnimator;
                    if (lVar != null) {
                        lVar.endAnimation(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    C childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    childViewHolderInt2.mScrapContainer = null;
                    childViewHolderInt2.mInChangeScrap = false;
                    childViewHolderInt2.clearReturnedFromScrapFlag();
                    vVar.l(childViewHolderInt2);
                }
                i11--;
            }
            arrayList.clear();
            ArrayList<C> arrayList2 = vVar.f44756b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(@NonNull View view, @NonNull v vVar) {
            removeView(view);
            vVar.k(view);
        }

        public void removeAndRecycleViewAt(int i11, @NonNull v vVar) {
            View childAt = getChildAt(i11);
            removeViewAt(i11);
            vVar.k(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(@NonNull View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        public void removeView(View view) {
            this.mChildHelper.l(view);
        }

        public void removeViewAt(int i11) {
            if (getChildAt(i11) != null) {
                this.mChildHelper.m(i11);
            }
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z11) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z11, false);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public int scrollHorizontallyBy(int i11, v vVar, A a11) {
            return 0;
        }

        public void scrollToPosition(int i11) {
        }

        public int scrollVerticallyBy(int i11, v vVar, A a11) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z11) {
            this.mAutoMeasure = z11;
        }

        void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z11) {
            if (z11 != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z11;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.r();
                }
            }
        }

        void setMeasureSpecs(int i11, int i12) {
            this.mWidth = View.MeasureSpec.getSize(i11);
            int mode = View.MeasureSpec.getMode(i11);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i12);
            int mode2 = View.MeasureSpec.getMode(i12);
            this.mHeightMode = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.mHeight = 0;
        }

        public void setMeasuredDimension(Rect rect, int i11, int i12) {
            setMeasuredDimension(chooseSize(i11, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i12, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
        }

        void setMeasuredDimensionFromChildren(int i11, int i12) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i11, i12);
                return;
            }
            int i13 = LinearLayoutManager.INVALID_OFFSET;
            int i14 = Integer.MAX_VALUE;
            int i15 = Integer.MIN_VALUE;
            int i16 = Integer.MAX_VALUE;
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt = getChildAt(i17);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i18 = rect.left;
                if (i18 < i16) {
                    i16 = i18;
                }
                int i19 = rect.right;
                if (i19 > i13) {
                    i13 = i19;
                }
                int i21 = rect.top;
                if (i21 < i14) {
                    i14 = i21;
                }
                int i22 = rect.bottom;
                if (i22 > i15) {
                    i15 = i22;
                }
            }
            this.mRecyclerView.mTempRect.set(i16, i14, i13, i15);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i11, i12);
        }

        public void setMeasurementCacheEnabled(boolean z11) {
            this.mMeasurementCacheEnabled = z11;
        }

        void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        boolean shouldMeasureChild(View view, int i11, int i12, p pVar) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getWidth(), i11, ((ViewGroup.MarginLayoutParams) pVar).width) && isMeasurementUpToDate(view.getHeight(), i12, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        boolean shouldMeasureTwice() {
            return false;
        }

        boolean shouldReMeasureChild(View view, int i11, int i12, p pVar) {
            return (this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getMeasuredWidth(), i11, ((ViewGroup.MarginLayoutParams) pVar).width) && isMeasurementUpToDate(view.getMeasuredHeight(), i12, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, A a11, int i11) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void startSmoothScroll(z zVar) {
            z zVar2 = this.mSmoothScroller;
            if (zVar2 != null && zVar != zVar2 && zVar2.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = zVar;
            zVar.start(this.mRecyclerView, this);
        }

        public void stopIgnoringView(@NonNull View view) {
            C childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        void stopSmoothScroller() {
            z zVar = this.mSmoothScroller;
            if (zVar != null) {
                zVar.stop();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        public void addDisappearingView(View view, int i11) {
            addViewInt(view, i11, true);
        }

        public void addView(View view, int i11) {
            addViewInt(view, i11, false);
        }

        public void onDetachedFromWindow(RecyclerView recyclerView, v vVar) {
            onDetachedFromWindow(recyclerView);
        }

        public void onInitializeAccessibilityEvent(@NonNull v vVar, @NonNull A a11, @NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z11 = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z11 = false;
            }
            accessibilityEvent.setScrollable(z11);
            g gVar = this.mRecyclerView.mAdapter;
            if (gVar != null) {
                accessibilityEvent.setItemCount(gVar.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(@NonNull v vVar, @NonNull A a11, @NonNull y2.q qVar) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                qVar.a(8192);
                qVar.m0(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                qVar.a(4096);
                qVar.m0(true);
            }
            qVar.M(q.e.a(getRowCountForAccessibility(vVar, a11), getColumnCountForAccessibility(vVar, a11), getSelectionModeForAccessibility(vVar, a11), isLayoutHierarchical(vVar, a11)));
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i11, int i12, Object obj) {
            onItemsUpdated(recyclerView, i11, i12);
        }

        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull A a11, @NonNull View view, View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public boolean performAccessibilityAction(@NonNull v vVar, @NonNull A a11, int i11, Bundle bundle) {
            int height;
            int width;
            int i12;
            int i13;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return false;
            }
            if (i11 == 4096) {
                height = recyclerView.canScrollVertically(1) ? (getHeight() - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    i12 = height;
                    i13 = width;
                }
                i12 = height;
                i13 = 0;
            } else if (i11 != 8192) {
                i13 = 0;
                i12 = 0;
            } else {
                height = recyclerView.canScrollVertically(-1) ? -((getHeight() - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    width = -((getWidth() - getPaddingLeft()) - getPaddingRight());
                    i12 = height;
                    i13 = width;
                }
                i12 = height;
                i13 = 0;
            }
            if (i12 == 0 && i13 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i13, i12, null, LinearLayoutManager.INVALID_OFFSET, true);
            return true;
        }

        boolean performAccessibilityActionForItem(@NonNull View view, int i11, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i11, bundle);
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z11, boolean z12) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view, rect);
            int i11 = childRectangleOnScreenScrollAmount[0];
            int i12 = childRectangleOnScreenScrollAmount[1];
            if ((z12 && !isFocusedChildVisibleAfterScrolling(recyclerView, i11, i12)) || (i11 == 0 && i12 == 0)) {
                return false;
            }
            if (z11) {
                recyclerView.scrollBy(i11, i12);
            } else {
                recyclerView.smoothScrollBy(i11, i12);
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
        
            if (r5 == 1073741824) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int getChildMeasureSpec(int i11, int i12, int i13, int i14, boolean z11) {
            int max = Math.max(0, i11 - i13);
            if (z11) {
                if (i14 < 0) {
                    if (i14 == -1) {
                        if (i12 != Integer.MIN_VALUE) {
                            if (i12 != 0) {
                            }
                        }
                        i14 = max;
                    }
                    i12 = 0;
                    i14 = 0;
                }
                i12 = 1073741824;
            } else {
                if (i14 < 0) {
                    if (i14 != -1) {
                        if (i14 == -2) {
                            if (i12 == Integer.MIN_VALUE || i12 == 1073741824) {
                                i14 = max;
                                i12 = Integer.MIN_VALUE;
                            } else {
                                i14 = max;
                                i12 = 0;
                            }
                        }
                        i12 = 0;
                        i14 = 0;
                    }
                    i14 = max;
                }
                i12 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i14, i12);
        }

        public p generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public void onInitializeAccessibilityNodeInfoForItem(@NonNull v vVar, @NonNull A a11, @NonNull View view, @NonNull y2.q qVar) {
            qVar.N(q.f.f(canScrollVertically() ? getPosition(view) : 0, 1, canScrollHorizontally() ? getPosition(view) : 0, 1, false, false));
        }

        public void setMeasuredDimension(int i11, int i12) {
            this.mRecyclerView.setMeasuredDimension(i11, i12);
        }

        public void attachView(@NonNull View view, int i11) {
            attachView(view, i11, (p) view.getLayoutParams());
        }

        public void attachView(@NonNull View view) {
            attachView(view, -1);
        }
    }

    public interface q {
        void onChildViewAttachedToWindow(@NonNull View view);

        void onChildViewDetachedFromWindow(@NonNull View view);
    }

    public static abstract class r {
        public abstract boolean onFling(int i11, int i12);
    }

    /* loaded from: classes8.dex */
    public interface s {
        boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);

        void onRequestDisallowInterceptTouchEvent(boolean z11);

        void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);
    }

    public static abstract class t {
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i11) {
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i11, int i12) {
        }
    }

    public static class u {
        SparseArray<a> mScrap = new SparseArray<>();
        private int mAttachCount = 0;

        static class a {

            /* renamed from: a, reason: collision with root package name */
            final ArrayList<C> f44751a = new ArrayList<>();

            /* renamed from: b, reason: collision with root package name */
            int f44752b = 5;

            /* renamed from: c, reason: collision with root package name */
            long f44753c = 0;

            /* renamed from: d, reason: collision with root package name */
            long f44754d = 0;

            a() {
            }
        }

        private a getScrapDataForType(int i11) {
            a aVar = this.mScrap.get(i11);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.mScrap.put(i11, aVar2);
            return aVar2;
        }

        void attach() {
            this.mAttachCount++;
        }

        public void clear() {
            for (int i11 = 0; i11 < this.mScrap.size(); i11++) {
                this.mScrap.valueAt(i11).f44751a.clear();
            }
        }

        void detach() {
            this.mAttachCount--;
        }

        void factorInBindTime(int i11, long j11) {
            a scrapDataForType = getScrapDataForType(i11);
            scrapDataForType.f44754d = runningAverage(scrapDataForType.f44754d, j11);
        }

        void factorInCreateTime(int i11, long j11) {
            a scrapDataForType = getScrapDataForType(i11);
            scrapDataForType.f44753c = runningAverage(scrapDataForType.f44753c, j11);
        }

        public C getRecycledView(int i11) {
            a aVar = this.mScrap.get(i11);
            if (aVar == null) {
                return null;
            }
            ArrayList<C> arrayList = aVar.f44751a;
            if (arrayList.isEmpty()) {
                return null;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public int getRecycledViewCount(int i11) {
            return getScrapDataForType(i11).f44751a.size();
        }

        void onAdapterChanged(g gVar, g gVar2, boolean z11) {
            if (gVar != null) {
                detach();
            }
            if (!z11 && this.mAttachCount == 0) {
                clear();
            }
            if (gVar2 != null) {
                attach();
            }
        }

        public void putRecycledView(C c11) {
            int itemViewType = c11.getItemViewType();
            ArrayList<C> arrayList = getScrapDataForType(itemViewType).f44751a;
            if (this.mScrap.get(itemViewType).f44752b <= arrayList.size()) {
                return;
            }
            c11.resetInternal();
            arrayList.add(c11);
        }

        long runningAverage(long j11, long j12) {
            if (j11 == 0) {
                return j12;
            }
            return (j12 / 4) + ((j11 / 4) * 3);
        }

        public void setMaxRecycledViews(int i11, int i12) {
            a scrapDataForType = getScrapDataForType(i11);
            scrapDataForType.f44752b = i12;
            ArrayList<C> arrayList = scrapDataForType.f44751a;
            while (arrayList.size() > i12) {
                Ej.b.b(1, arrayList);
            }
        }

        boolean willBindInTime(int i11, long j11, long j12) {
            long j13 = getScrapDataForType(i11).f44754d;
            return j13 == 0 || j11 + j13 < j12;
        }

        boolean willCreateInTime(int i11, long j11, long j12) {
            long j13 = getScrapDataForType(i11).f44753c;
            return j13 == 0 || j11 + j13 < j12;
        }
    }

    public final class v {

        /* renamed from: a, reason: collision with root package name */
        final ArrayList<C> f44755a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList<C> f44756b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList<C> f44757c;

        /* renamed from: d, reason: collision with root package name */
        private final List<C> f44758d;

        /* renamed from: e, reason: collision with root package name */
        private int f44759e;

        /* renamed from: f, reason: collision with root package name */
        int f44760f;

        /* renamed from: g, reason: collision with root package name */
        u f44761g;

        public v() {
            ArrayList<C> arrayList = new ArrayList<>();
            this.f44755a = arrayList;
            this.f44756b = null;
            this.f44757c = new ArrayList<>();
            this.f44758d = Collections.unmodifiableList(arrayList);
            this.f44759e = 2;
            this.f44760f = 2;
        }

        private static void h(ViewGroup viewGroup, boolean z11) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    h((ViewGroup) childAt, true);
                }
            }
            if (z11) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private boolean o(@NonNull C c11, int i11, int i12, long j11) {
            RecyclerView recyclerView = RecyclerView.this;
            c11.mOwnerRecyclerView = recyclerView;
            int itemViewType = c11.getItemViewType();
            long nanoTime = recyclerView.getNanoTime();
            if (j11 != Long.MAX_VALUE && !this.f44761g.willBindInTime(itemViewType, nanoTime, j11)) {
                return false;
            }
            recyclerView.mAdapter.bindViewHolder(c11, i11);
            this.f44761g.factorInBindTime(c11.getItemViewType(), recyclerView.getNanoTime() - nanoTime);
            if (recyclerView.isAccessibilityEnabled()) {
                View view = c11.itemView;
                int i13 = Y.f42258g;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                androidx.recyclerview.widget.A a11 = recyclerView.mAccessibilityDelegate;
                if (a11 != null) {
                    C5305a a12 = a11.a();
                    if (a12 instanceof A.a) {
                        ((A.a) a12).b(view);
                    }
                    Y.C(view, a12);
                }
            }
            if (recyclerView.mState.f44718g) {
                c11.mPreLayoutPosition = i12;
            }
            return true;
        }

        final void a(@NonNull C c11, boolean z11) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(c11);
            View view = c11.itemView;
            RecyclerView recyclerView = RecyclerView.this;
            androidx.recyclerview.widget.A a11 = recyclerView.mAccessibilityDelegate;
            if (a11 != null) {
                C5305a a12 = a11.a();
                Y.C(view, a12 instanceof A.a ? ((A.a) a12).a(view) : null);
            }
            if (z11) {
                g gVar = recyclerView.mAdapter;
                if (gVar != null) {
                    gVar.onViewRecycled(c11);
                }
                if (recyclerView.mState != null) {
                    recyclerView.mViewInfoStore.f(c11);
                }
            }
            c11.mOwnerRecyclerView = null;
            e().putRecycledView(c11);
        }

        public final void b(int i11, @NonNull View view) {
            p pVar;
            C childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            RecyclerView recyclerView = RecyclerView.this;
            if (childViewHolderInt == null) {
                throw new IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter" + recyclerView.exceptionLabel());
            }
            int f7 = recyclerView.mAdapterHelper.f(i11, 0);
            if (f7 < 0 || f7 >= recyclerView.mAdapter.getItemCount()) {
                StringBuilder a11 = C2438a.a("Inconsistency detected. Invalid item position ", i11, "(offset:", ").state:", f7);
                a11.append(recyclerView.mState.b());
                a11.append(recyclerView.exceptionLabel());
                throw new IndexOutOfBoundsException(a11.toString());
            }
            o(childViewHolderInt, f7, i11, Long.MAX_VALUE);
            ViewGroup.LayoutParams layoutParams = childViewHolderInt.itemView.getLayoutParams();
            if (layoutParams == null) {
                pVar = (p) recyclerView.generateDefaultLayoutParams();
                childViewHolderInt.itemView.setLayoutParams(pVar);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                pVar = (p) layoutParams;
            } else {
                pVar = (p) recyclerView.generateLayoutParams(layoutParams);
                childViewHolderInt.itemView.setLayoutParams(pVar);
            }
            pVar.f44749c = true;
            pVar.f44747a = childViewHolderInt;
            pVar.f44750d = childViewHolderInt.itemView.getParent() == null;
        }

        public final void c() {
            this.f44755a.clear();
            i();
        }

        public final int d(int i11) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i11 >= 0 && i11 < recyclerView.mState.b()) {
                return !recyclerView.mState.f44718g ? i11 : recyclerView.mAdapterHelper.f(i11, 0);
            }
            StringBuilder f7 = P4.f.f(i11, "invalid position ", ". State item count is ");
            f7.append(recyclerView.mState.b());
            f7.append(recyclerView.exceptionLabel());
            throw new IndexOutOfBoundsException(f7.toString());
        }

        final u e() {
            if (this.f44761g == null) {
                this.f44761g = new u();
            }
            return this.f44761g;
        }

        @NonNull
        public final List<C> f() {
            return this.f44758d;
        }

        @NonNull
        public final View g(int i11) {
            return p(i11, Long.MAX_VALUE).itemView;
        }

        final void i() {
            ArrayList<C> arrayList = this.f44757c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                j(size);
            }
            arrayList.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                l.b bVar = RecyclerView.this.mPrefetchRegistry;
                int[] iArr = bVar.f44983c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f44984d = 0;
            }
        }

        final void j(int i11) {
            ArrayList<C> arrayList = this.f44757c;
            a(arrayList.get(i11), true);
            arrayList.remove(i11);
        }

        public final void k(@NonNull View view) {
            C childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean isTmpDetached = childViewHolderInt.isTmpDetached();
            RecyclerView recyclerView = RecyclerView.this;
            if (isTmpDetached) {
                recyclerView.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            l(childViewHolderInt);
            if (recyclerView.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            recyclerView.mItemAnimator.endAnimation(childViewHolderInt);
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x0092, code lost:
        
            r5 = r5 - 1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void l(C c11) {
            boolean z11;
            boolean isScrap = c11.isScrap();
            RecyclerView recyclerView = RecyclerView.this;
            boolean z12 = true;
            if (isScrap || c11.itemView.getParent() != null) {
                StringBuilder sb2 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(c11.isScrap());
                sb2.append(" isAttached:");
                sb2.append(c11.itemView.getParent() != null);
                sb2.append(recyclerView.exceptionLabel());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (c11.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + c11 + recyclerView.exceptionLabel());
            }
            if (c11.shouldIgnore()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.exceptionLabel());
            }
            boolean doesTransientStatePreventRecycling = c11.doesTransientStatePreventRecycling();
            g gVar = recyclerView.mAdapter;
            if ((gVar != null && doesTransientStatePreventRecycling && gVar.onFailedToRecycleView(c11)) || c11.isRecyclable()) {
                if (this.f44760f <= 0 || c11.hasAnyOfTheFlags(526)) {
                    z11 = false;
                } else {
                    ArrayList<C> arrayList = this.f44757c;
                    int size = arrayList.size();
                    if (size >= this.f44760f && size > 0) {
                        j(0);
                        size--;
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0) {
                        l.b bVar = recyclerView.mPrefetchRegistry;
                        int i11 = c11.mPosition;
                        if (bVar.f44983c != null) {
                            int i12 = bVar.f44984d * 2;
                            for (int i13 = 0; i13 < i12; i13 += 2) {
                                if (bVar.f44983c[i13] == i11) {
                                    break;
                                }
                            }
                        }
                        int i14 = size - 1;
                        loop1: while (i14 >= 0) {
                            int i15 = arrayList.get(i14).mPosition;
                            l.b bVar2 = recyclerView.mPrefetchRegistry;
                            if (bVar2.f44983c == null) {
                                break;
                            }
                            int i16 = bVar2.f44984d * 2;
                            for (int i17 = 0; i17 < i16; i17 += 2) {
                                if (bVar2.f44983c[i17] == i15) {
                                    break;
                                }
                            }
                            break loop1;
                        }
                        size = i14 + 1;
                    }
                    arrayList.add(size, c11);
                    z11 = true;
                }
                if (z11) {
                    z12 = false;
                } else {
                    a(c11, true);
                }
                r2 = z11;
            } else {
                z12 = false;
            }
            recyclerView.mViewInfoStore.f(c11);
            if (r2 || z12 || !doesTransientStatePreventRecycling) {
                return;
            }
            c11.mOwnerRecyclerView = null;
        }

        final void m(View view) {
            C childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean hasAnyOfTheFlags = childViewHolderInt.hasAnyOfTheFlags(12);
            RecyclerView recyclerView = RecyclerView.this;
            if (!hasAnyOfTheFlags && childViewHolderInt.isUpdated() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f44756b == null) {
                    this.f44756b = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f44756b.add(childViewHolderInt);
                return;
            }
            if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || recyclerView.mAdapter.hasStableIds()) {
                childViewHolderInt.setScrapContainer(this, false);
                this.f44755a.add(childViewHolderInt);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.exceptionLabel());
            }
        }

        public final void n(int i11) {
            this.f44759e = i11;
            r();
        }

        /* JADX WARN: Removed duplicated region for block: B:113:0x01df  */
        /* JADX WARN: Removed duplicated region for block: B:168:0x0336  */
        /* JADX WARN: Removed duplicated region for block: B:177:0x0383  */
        /* JADX WARN: Removed duplicated region for block: B:180:0x03a7 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:184:0x038f  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:217:0x031a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final C p(int i11, long j11) {
            C c11;
            boolean z11;
            boolean z12;
            boolean z13;
            C c12;
            boolean o11;
            ViewGroup.LayoutParams layoutParams;
            p pVar;
            RecyclerView findNestedRecyclerView;
            View view;
            C c13;
            boolean z14;
            int size;
            int f7;
            RecyclerView recyclerView = RecyclerView.this;
            if (i11 < 0 || i11 >= recyclerView.mState.b()) {
                StringBuilder a11 = C2438a.a("Invalid item position ", i11, "(", "). Item count:", i11);
                a11.append(recyclerView.mState.b());
                a11.append(recyclerView.exceptionLabel());
                throw new IndexOutOfBoundsException(a11.toString());
            }
            boolean z15 = false;
            boolean z16 = true;
            if (recyclerView.mState.f44718g) {
                ArrayList<C> arrayList = this.f44756b;
                if (arrayList != null && (size = arrayList.size()) != 0) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < size) {
                            c11 = this.f44756b.get(i12);
                            if (!c11.wasReturnedFromScrap() && c11.getLayoutPosition() == i11) {
                                c11.addFlags(32);
                                break;
                            }
                            i12++;
                        } else if (recyclerView.mAdapter.hasStableIds() && (f7 = recyclerView.mAdapterHelper.f(i11, 0)) > 0 && f7 < recyclerView.mAdapter.getItemCount()) {
                            long itemId = recyclerView.mAdapter.getItemId(f7);
                            for (int i13 = 0; i13 < size; i13++) {
                                C c14 = this.f44756b.get(i13);
                                if (!c14.wasReturnedFromScrap() && c14.getItemId() == itemId) {
                                    c14.addFlags(32);
                                    c11 = c14;
                                    break;
                                }
                            }
                        }
                    }
                    if (c11 != null) {
                        z11 = true;
                        ArrayList<C> arrayList2 = this.f44757c;
                        ArrayList<C> arrayList3 = this.f44755a;
                        if (c11 == null) {
                            int size2 = arrayList3.size();
                            for (int i14 = 0; i14 < size2; i14++) {
                                c13 = arrayList3.get(i14);
                                if (!c13.wasReturnedFromScrap() && c13.getLayoutPosition() == i11 && !c13.isInvalid() && (recyclerView.mState.f44718g || !c13.isRemoved())) {
                                    c13.addFlags(32);
                                    break;
                                }
                            }
                            ArrayList arrayList4 = recyclerView.mChildHelper.f44869c;
                            int size3 = arrayList4.size();
                            int i15 = 0;
                            while (true) {
                                if (i15 >= size3) {
                                    view = null;
                                    break;
                                }
                                view = (View) arrayList4.get(i15);
                                C childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                                if (childViewHolderInt.getLayoutPosition() == i11 && !childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved()) {
                                    break;
                                }
                                i15++;
                            }
                            if (view != null) {
                                c11 = RecyclerView.getChildViewHolderInt(view);
                                recyclerView.mChildHelper.o(view);
                                int k11 = recyclerView.mChildHelper.k(view);
                                if (k11 == -1) {
                                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + c11 + recyclerView.exceptionLabel());
                                }
                                recyclerView.mChildHelper.c(k11);
                                m(view);
                                c11.addFlags(8224);
                            } else {
                                int size4 = arrayList2.size();
                                for (int i16 = 0; i16 < size4; i16++) {
                                    c13 = arrayList2.get(i16);
                                    if (!c13.isInvalid() && c13.getLayoutPosition() == i11 && !c13.isAttachedToTransitionOverlay()) {
                                        arrayList2.remove(i16);
                                        c11 = c13;
                                    }
                                }
                                c11 = null;
                            }
                            if (c11 != null) {
                                if (c11.isRemoved()) {
                                    z14 = recyclerView.mState.f44718g;
                                } else {
                                    int i17 = c11.mPosition;
                                    if (i17 < 0 || i17 >= recyclerView.mAdapter.getItemCount()) {
                                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + c11 + recyclerView.exceptionLabel());
                                    }
                                    z14 = (recyclerView.mState.f44718g || recyclerView.mAdapter.getItemViewType(c11.mPosition) == c11.getItemViewType()) && (!recyclerView.mAdapter.hasStableIds() || c11.getItemId() == recyclerView.mAdapter.getItemId(c11.mPosition));
                                }
                                if (z14) {
                                    z11 = true;
                                } else {
                                    c11.addFlags(4);
                                    if (c11.isScrap()) {
                                        recyclerView.removeDetachedView(c11.itemView, false);
                                        c11.unScrap();
                                    } else if (c11.wasReturnedFromScrap()) {
                                        c11.clearReturnedFromScrapFlag();
                                    }
                                    l(c11);
                                    c11 = null;
                                }
                            }
                        }
                        if (c11 != null) {
                            int f11 = recyclerView.mAdapterHelper.f(i11, 0);
                            if (f11 < 0 || f11 >= recyclerView.mAdapter.getItemCount()) {
                                StringBuilder a12 = C2438a.a("Inconsistency detected. Invalid item position ", i11, "(offset:", ").state:", f11);
                                a12.append(recyclerView.mState.b());
                                a12.append(recyclerView.exceptionLabel());
                                throw new IndexOutOfBoundsException(a12.toString());
                            }
                            int itemViewType = recyclerView.mAdapter.getItemViewType(f11);
                            if (recyclerView.mAdapter.hasStableIds()) {
                                long itemId2 = recyclerView.mAdapter.getItemId(f11);
                                int size5 = arrayList3.size() - 1;
                                while (true) {
                                    if (size5 >= 0) {
                                        C c15 = arrayList3.get(size5);
                                        if (c15.getItemId() != itemId2 || c15.wasReturnedFromScrap()) {
                                            z12 = z16;
                                        } else {
                                            z12 = z16;
                                            if (itemViewType == c15.getItemViewType()) {
                                                c15.addFlags(32);
                                                if (c15.isRemoved() && !recyclerView.mState.f44718g) {
                                                    c15.setFlags(2, 14);
                                                }
                                                c11 = c15;
                                            } else {
                                                arrayList3.remove(size5);
                                                recyclerView.removeDetachedView(c15.itemView, false);
                                                C childViewHolderInt2 = RecyclerView.getChildViewHolderInt(c15.itemView);
                                                childViewHolderInt2.mScrapContainer = null;
                                                childViewHolderInt2.mInChangeScrap = false;
                                                childViewHolderInt2.clearReturnedFromScrapFlag();
                                                l(childViewHolderInt2);
                                            }
                                        }
                                        size5--;
                                        z16 = z12;
                                    } else {
                                        z12 = z16;
                                        int size6 = arrayList2.size() - 1;
                                        while (true) {
                                            if (size6 < 0) {
                                                break;
                                            }
                                            C c16 = arrayList2.get(size6);
                                            if (c16.getItemId() != itemId2 || c16.isAttachedToTransitionOverlay()) {
                                                size6--;
                                            } else if (itemViewType == c16.getItemViewType()) {
                                                arrayList2.remove(size6);
                                                c11 = c16;
                                            } else {
                                                j(size6);
                                            }
                                        }
                                        c11 = null;
                                    }
                                }
                                if (c11 != null) {
                                    c11.mPosition = f11;
                                    z11 = z12;
                                }
                            } else {
                                z12 = true;
                            }
                            if (c11 == null) {
                                C recycledView = e().getRecycledView(itemViewType);
                                if (recycledView != null) {
                                    recycledView.resetInternal();
                                    if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                        View view2 = recycledView.itemView;
                                        if (view2 instanceof ViewGroup) {
                                            h((ViewGroup) view2, false);
                                        }
                                    }
                                }
                                c11 = recycledView;
                            }
                            if (c11 == null) {
                                long nanoTime = recyclerView.getNanoTime();
                                if (j11 != Long.MAX_VALUE && !this.f44761g.willCreateInTime(itemViewType, nanoTime, j11)) {
                                    return null;
                                }
                                c11 = recyclerView.mAdapter.createViewHolder(recyclerView, itemViewType);
                                if (RecyclerView.ALLOW_THREAD_GAP_WORK && (findNestedRecyclerView = RecyclerView.findNestedRecyclerView(c11.itemView)) != null) {
                                    c11.mNestedRecyclerView = new WeakReference<>(findNestedRecyclerView);
                                }
                                this.f44761g.factorInCreateTime(itemViewType, recyclerView.getNanoTime() - nanoTime);
                            }
                        } else {
                            z12 = true;
                        }
                        z13 = z11;
                        c12 = c11;
                        if (z13 && !recyclerView.mState.f44718g && c12.hasAnyOfTheFlags(8192)) {
                            c12.setFlags(0, 8192);
                            if (recyclerView.mState.f44721j) {
                                recyclerView.recordAnimationInfoIfBouncedHiddenView(c12, recyclerView.mItemAnimator.recordPreLayoutInformation(recyclerView.mState, c12, l.buildAdapterChangeFlagsForAnimations(c12) | 4096, c12.getUnmodifiedPayloads()));
                            }
                        }
                        if (!recyclerView.mState.f44718g && c12.isBound()) {
                            c12.mPreLayoutPosition = i11;
                        } else if (c12.isBound() || c12.needsUpdate() || c12.isInvalid()) {
                            o11 = o(c12, recyclerView.mAdapterHelper.f(i11, 0), i11, j11);
                            layoutParams = c12.itemView.getLayoutParams();
                            if (layoutParams == null) {
                                pVar = (p) recyclerView.generateDefaultLayoutParams();
                                c12.itemView.setLayoutParams(pVar);
                            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                                pVar = (p) layoutParams;
                            } else {
                                pVar = (p) recyclerView.generateLayoutParams(layoutParams);
                                c12.itemView.setLayoutParams(pVar);
                            }
                            pVar.f44747a = c12;
                            if (z13 && o11) {
                                z15 = z12;
                            }
                            pVar.f44750d = z15;
                            return c12;
                        }
                        o11 = false;
                        layoutParams = c12.itemView.getLayoutParams();
                        if (layoutParams == null) {
                        }
                        pVar.f44747a = c12;
                        if (z13) {
                            z15 = z12;
                        }
                        pVar.f44750d = z15;
                        return c12;
                    }
                }
                c11 = null;
                if (c11 != null) {
                }
            } else {
                c11 = null;
            }
            z11 = false;
            ArrayList<C> arrayList22 = this.f44757c;
            ArrayList<C> arrayList32 = this.f44755a;
            if (c11 == null) {
            }
            if (c11 != null) {
            }
            z13 = z11;
            c12 = c11;
            if (z13) {
                c12.setFlags(0, 8192);
                if (recyclerView.mState.f44721j) {
                }
            }
            if (!recyclerView.mState.f44718g) {
            }
            if (c12.isBound()) {
            }
            o11 = o(c12, recyclerView.mAdapterHelper.f(i11, 0), i11, j11);
            layoutParams = c12.itemView.getLayoutParams();
            if (layoutParams == null) {
            }
            pVar.f44747a = c12;
            if (z13) {
            }
            pVar.f44750d = z15;
            return c12;
        }

        final void q(C c11) {
            if (c11.mInChangeScrap) {
                this.f44756b.remove(c11);
            } else {
                this.f44755a.remove(c11);
            }
            c11.mScrapContainer = null;
            c11.mInChangeScrap = false;
            c11.clearReturnedFromScrapFlag();
        }

        final void r() {
            o oVar = RecyclerView.this.mLayout;
            this.f44760f = this.f44759e + (oVar != null ? oVar.mPrefetchMaxCountObserved : 0);
            ArrayList<C> arrayList = this.f44757c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f44760f; size--) {
                j(size);
            }
        }
    }

    private class w extends i {
        w() {
        }

        final void a() {
            boolean z11 = RecyclerView.POST_UPDATES_ON_ANIMATION;
            RecyclerView recyclerView = RecyclerView.this;
            if (!z11 || !recyclerView.mHasFixedSize || !recyclerView.mIsAttached) {
                recyclerView.mAdapterUpdateDuringMeasure = true;
                recyclerView.requestLayout();
            } else {
                Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
                int i11 = Y.f42258g;
                recyclerView.postOnAnimation(runnable);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onChanged() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            recyclerView.mState.f44717f = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (recyclerView.mAdapterHelper.h()) {
                return;
            }
            recyclerView.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i11, int i12, Object obj) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            if (recyclerView.mAdapterHelper.j(i11, i12, obj)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeInserted(int i11, int i12) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            if (recyclerView.mAdapterHelper.k(i11, i12)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeMoved(int i11, int i12, int i13) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            if (recyclerView.mAdapterHelper.l(i11, i12, i13)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeRemoved(int i11, int i12) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            if (recyclerView.mAdapterHelper.m(i11, i12)) {
                a();
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class y implements s {
        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onRequestDisallowInterceptTouchEvent(boolean z11) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        }
    }

    public static abstract class z {
        private o mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private View mTargetView;
        private int mTargetPosition = -1;
        private final a mRecyclingAction = new a();

        public static class a {

            /* renamed from: d, reason: collision with root package name */
            private int f44768d = -1;

            /* renamed from: f, reason: collision with root package name */
            private boolean f44770f = false;

            /* renamed from: g, reason: collision with root package name */
            private int f44771g = 0;

            /* renamed from: a, reason: collision with root package name */
            private int f44765a = 0;

            /* renamed from: b, reason: collision with root package name */
            private int f44766b = 0;

            /* renamed from: c, reason: collision with root package name */
            private int f44767c = LinearLayoutManager.INVALID_OFFSET;

            /* renamed from: e, reason: collision with root package name */
            private Interpolator f44769e = null;

            final boolean a() {
                return this.f44768d >= 0;
            }

            public final void b(int i11) {
                this.f44768d = i11;
            }

            final void c(RecyclerView recyclerView) {
                int i11 = this.f44768d;
                if (i11 >= 0) {
                    this.f44768d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i11);
                    this.f44770f = false;
                    return;
                }
                if (!this.f44770f) {
                    this.f44771g = 0;
                    return;
                }
                Interpolator interpolator = this.f44769e;
                if (interpolator != null && this.f44767c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                int i12 = this.f44767c;
                if (i12 < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                recyclerView.mViewFlinger.c(this.f44765a, this.f44766b, interpolator, i12);
                int i13 = this.f44771g + 1;
                this.f44771g = i13;
                if (i13 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f44770f = false;
            }

            public final void d(int i11, int i12, Interpolator interpolator, int i13) {
                this.f44765a = i11;
                this.f44766b = i12;
                this.f44767c = i13;
                this.f44769e = interpolator;
                this.f44770f = true;
            }
        }

        public interface b {
            PointF computeScrollVectorForPosition(int i11);
        }

        public PointF computeScrollVectorForPosition(int i11) {
            Object layoutManager = getLayoutManager();
            if (layoutManager instanceof b) {
                return ((b) layoutManager).computeScrollVectorForPosition(i11);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View findViewByPosition(int i11) {
            return this.mRecyclerView.mLayout.findViewByPosition(i11);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        public o getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        protected void normalize(@NonNull PointF pointF) {
            float f7 = pointF.x;
            float f11 = pointF.y;
            float sqrt = (float) Math.sqrt((f11 * f11) + (f7 * f7));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        void onAnimation(int i11, int i12) {
            PointF computeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (computeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f7 = computeScrollVectorForPosition.x;
                if (f7 != 0.0f || computeScrollVectorForPosition.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f7), (int) Math.signum(computeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.c(recyclerView);
                    stop();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i11, i12, recyclerView.mState, this.mRecyclingAction);
                boolean a11 = this.mRecyclingAction.a();
                this.mRecyclingAction.c(recyclerView);
                if (a11 && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.b();
                }
            }
        }

        protected void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
            }
        }

        protected abstract void onSeekTargetStep(int i11, int i12, @NonNull A a11, @NonNull a aVar);

        protected abstract void onStart();

        protected abstract void onStop();

        protected abstract void onTargetFound(@NonNull View view, @NonNull A a11, @NonNull a aVar);

        public void setTargetPosition(int i11) {
            this.mTargetPosition = i11;
        }

        void start(RecyclerView recyclerView, o oVar) {
            B b11 = recyclerView.mViewFlinger;
            RecyclerView.this.removeCallbacks(b11);
            b11.f44728c.abortAnimation();
            if (this.mStarted) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = oVar;
            int i11 = this.mTargetPosition;
            if (i11 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.f44712a = i11;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.mViewFlinger.b();
            this.mStarted = true;
        }

        protected final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.f44712a = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }
    }

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new InterpolatorC5466c();
    }

    public RecyclerView(@NonNull Context context) {
        this(context, null);
    }

    private void addAnimatingView(C c11) {
        View view = c11.itemView;
        boolean z11 = view.getParent() == this;
        this.mRecycler.q(getChildViewHolder(view));
        if (c11.isTmpDetached()) {
            this.mChildHelper.b(view, -1, view.getLayoutParams(), true);
        } else if (z11) {
            this.mChildHelper.i(view);
        } else {
            this.mChildHelper.a(view, -1, true);
        }
    }

    private void animateChange(@NonNull C c11, @NonNull C c12, @NonNull l.c cVar, @NonNull l.c cVar2, boolean z11, boolean z12) {
        c11.setIsRecyclable(false);
        if (z11) {
            addAnimatingView(c11);
        }
        if (c11 != c12) {
            if (z12) {
                addAnimatingView(c12);
            }
            c11.mShadowedHolder = c12;
            addAnimatingView(c11);
            this.mRecycler.q(c11);
            c12.setIsRecyclable(false);
            c12.mShadowingHolder = c11;
        }
        if (this.mItemAnimator.animateChange(c11, c12, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    static void clearNestedRecyclerViewIfNotNested(@NonNull C c11) {
        WeakReference<RecyclerView> weakReference = c11.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == c11.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            c11.mNestedRecyclerView = null;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i11, int i12) {
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(o.class);
                try {
                    constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i11), Integer.valueOf(i12)};
                } catch (NoSuchMethodException e11) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e12) {
                        e12.initCause(e11);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e12);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((o) constructor.newInstance(objArr));
            } catch (ClassCastException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e13);
            } catch (ClassNotFoundException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e14);
            } catch (IllegalAccessException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e15);
            } catch (InstantiationException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e16);
            } catch (InvocationTargetException e17) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e17);
            }
        }
    }

    private boolean didChildRangeChange(int i11, int i12) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i11 && iArr[1] == i12) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i11 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i11 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        obtain.setContentChangeTypes(i11);
        sendAccessibilityEventUnchecked(obtain);
    }

    private void dispatchLayoutStep1() {
        F.a aVar;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f44720i = false;
        startInterceptRequestLayout();
        F f7 = this.mViewInfoStore;
        f7.f44672a.clear();
        f7.f44673b.a();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        A a11 = this.mState;
        a11.f44719h = a11.f44721j && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        a11.f44718g = a11.f44722k;
        a11.f44716e = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f44721j) {
            int e11 = this.mChildHelper.e();
            for (int i11 = 0; i11 < e11; i11++) {
                C childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i11));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    l.c recordPreLayoutInformation = this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt, l.buildAdapterChangeFlagsForAnimations(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads());
                    Z<C, F.a> z11 = this.mViewInfoStore.f44672a;
                    F.a aVar2 = z11.get(childViewHolderInt);
                    if (aVar2 == null) {
                        aVar2 = F.a.a();
                        z11.put(childViewHolderInt, aVar2);
                    }
                    aVar2.f44676b = recordPreLayoutInformation;
                    aVar2.f44675a |= 4;
                    if (this.mState.f44719h && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.f44673b.f(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f44722k) {
            saveOldPositions();
            A a12 = this.mState;
            boolean z12 = a12.f44717f;
            a12.f44717f = false;
            this.mLayout.onLayoutChildren(this.mRecycler, a12);
            this.mState.f44717f = z12;
            for (int i12 = 0; i12 < this.mChildHelper.e(); i12++) {
                C childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.d(i12));
                if (!childViewHolderInt2.shouldIgnore() && ((aVar = this.mViewInfoStore.f44672a.get(childViewHolderInt2)) == null || (aVar.f44675a & 4) == 0)) {
                    int buildAdapterChangeFlagsForAnimations = l.buildAdapterChangeFlagsForAnimations(childViewHolderInt2);
                    boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        buildAdapterChangeFlagsForAnimations |= 4096;
                    }
                    l.c recordPreLayoutInformation2 = this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt2, buildAdapterChangeFlagsForAnimations, childViewHolderInt2.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, recordPreLayoutInformation2);
                    } else {
                        Z<C, F.a> z13 = this.mViewInfoStore.f44672a;
                        F.a aVar3 = z13.get(childViewHolderInt2);
                        if (aVar3 == null) {
                            aVar3 = F.a.a();
                            z13.put(childViewHolderInt2, aVar3);
                        }
                        aVar3.f44675a |= 2;
                        aVar3.f44676b = recordPreLayoutInformation2;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f44715d = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.c();
        this.mState.f44716e = this.mAdapter.getItemCount();
        A a11 = this.mState;
        a11.f44714c = 0;
        a11.f44718g = false;
        this.mLayout.onLayoutChildren(this.mRecycler, a11);
        A a12 = this.mState;
        a12.f44717f = false;
        this.mPendingSavedState = null;
        a12.f44721j = a12.f44721j && this.mItemAnimator != null;
        a12.f44715d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        RecyclerView recyclerView;
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        A a11 = this.mState;
        a11.f44715d = 1;
        if (a11.f44721j) {
            for (int e11 = this.mChildHelper.e() - 1; e11 >= 0; e11--) {
                C childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(e11));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    l.c recordPostLayoutInformation = this.mItemAnimator.recordPostLayoutInformation(this.mState, childViewHolderInt);
                    C b11 = this.mViewInfoStore.f44673b.b(changedHolderKey);
                    if (b11 == null || b11.shouldIgnore()) {
                        this.mViewInfoStore.a(childViewHolderInt, recordPostLayoutInformation);
                    } else {
                        F.a aVar = this.mViewInfoStore.f44672a.get(b11);
                        boolean z11 = (aVar == null || (aVar.f44675a & 1) == 0) ? false : true;
                        F.a aVar2 = this.mViewInfoStore.f44672a.get(childViewHolderInt);
                        boolean z12 = (aVar2 == null || (aVar2.f44675a & 1) == 0) ? false : true;
                        if (z11 && b11 == childViewHolderInt) {
                            this.mViewInfoStore.a(childViewHolderInt, recordPostLayoutInformation);
                        } else {
                            l.c d11 = this.mViewInfoStore.d(b11);
                            this.mViewInfoStore.a(childViewHolderInt, recordPostLayoutInformation);
                            l.c c11 = this.mViewInfoStore.c(childViewHolderInt);
                            if (d11 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, b11);
                            } else {
                                animateChange(b11, childViewHolderInt, d11, c11, z11, z12);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            F f7 = recyclerView.mViewInfoStore;
            F.b bVar = recyclerView.mViewInfoProcessCallback;
            Z<C, F.a> z13 = f7.f44672a;
            for (int size = z13.size() - 1; size >= 0; size--) {
                C j11 = z13.j(size);
                F.a l11 = z13.l(size);
                int i11 = l11.f44675a;
                if ((i11 & 3) == 3) {
                    RecyclerView recyclerView2 = RecyclerView.this;
                    recyclerView2.mLayout.removeAndRecycleView(j11.itemView, recyclerView2.mRecycler);
                } else if ((i11 & 1) != 0) {
                    l.c cVar = l11.f44676b;
                    if (cVar == null) {
                        RecyclerView recyclerView3 = RecyclerView.this;
                        recyclerView3.mLayout.removeAndRecycleView(j11.itemView, recyclerView3.mRecycler);
                    } else {
                        l.c cVar2 = l11.f44677c;
                        RecyclerView recyclerView4 = RecyclerView.this;
                        recyclerView4.mRecycler.q(j11);
                        recyclerView4.animateDisappearance(j11, cVar, cVar2);
                    }
                } else if ((i11 & 14) == 14) {
                    RecyclerView.this.animateAppearance(j11, l11.f44676b, l11.f44677c);
                } else if ((i11 & 12) == 12) {
                    l.c cVar3 = l11.f44676b;
                    l.c cVar4 = l11.f44677c;
                    d dVar = (d) bVar;
                    dVar.getClass();
                    j11.setIsRecyclable(false);
                    RecyclerView recyclerView5 = RecyclerView.this;
                    if (recyclerView5.mDataSetHasChangedAfterLayout) {
                        if (recyclerView5.mItemAnimator.animateChange(j11, j11, cVar3, cVar4)) {
                            recyclerView5.postAnimationRunner();
                        }
                    } else if (recyclerView5.mItemAnimator.animatePersistence(j11, cVar3, cVar4)) {
                        recyclerView5.postAnimationRunner();
                    }
                } else if ((i11 & 4) != 0) {
                    l.c cVar5 = l11.f44676b;
                    RecyclerView recyclerView6 = RecyclerView.this;
                    recyclerView6.mRecycler.q(j11);
                    recyclerView6.animateDisappearance(j11, cVar5, null);
                } else if ((i11 & 8) != 0) {
                    RecyclerView.this.animateAppearance(j11, l11.f44676b, l11.f44677c);
                }
                l11.f44675a = 0;
                l11.f44676b = null;
                l11.f44677c = null;
                F.a.f44674d.b(l11);
            }
        } else {
            recyclerView = this;
        }
        recyclerView.mLayout.removeAndRecycleScrapInt(recyclerView.mRecycler);
        A a12 = recyclerView.mState;
        a12.f44713b = a12.f44716e;
        recyclerView.mDataSetHasChangedAfterLayout = false;
        recyclerView.mDispatchItemsChangedEvent = false;
        a12.f44721j = false;
        a12.f44722k = false;
        recyclerView.mLayout.mRequestedSimpleAnimations = false;
        ArrayList<C> arrayList = recyclerView.mRecycler.f44756b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = recyclerView.mLayout;
        if (oVar.mPrefetchMaxObservedInInitialPrefetch) {
            oVar.mPrefetchMaxCountObserved = 0;
            oVar.mPrefetchMaxObservedInInitialPrefetch = false;
            recyclerView.mRecycler.r();
        }
        recyclerView.mLayout.onLayoutCompleted(recyclerView.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        F f11 = recyclerView.mViewInfoStore;
        f11.f44672a.clear();
        f11.f44673b.a();
        int[] iArr = recyclerView.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        s sVar = this.mInterceptingOnItemTouchListener;
        if (sVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        sVar.onTouchEvent(this, motionEvent);
        int action = motionEvent.getAction();
        if (action != 3 && action != 1) {
            return true;
        }
        this.mInterceptingOnItemTouchListener = null;
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i11 = 0; i11 < size; i11++) {
            s sVar = this.mOnItemTouchListeners.get(i11);
            if (sVar.onInterceptTouchEvent(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = sVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int e11 = this.mChildHelper.e();
        if (e11 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i11 = Integer.MAX_VALUE;
        int i12 = LinearLayoutManager.INVALID_OFFSET;
        for (int i13 = 0; i13 < e11; i13++) {
            C childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i13));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i11) {
                    i11 = layoutPosition;
                }
                if (layoutPosition > i12) {
                    i12 = layoutPosition;
                }
            }
        }
        iArr[0] = i11;
        iArr[1] = i12;
    }

    static RecyclerView findNestedRecyclerView(@NonNull View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i11));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        C findViewHolderForAdapterPosition;
        A a11 = this.mState;
        int i11 = a11.f44723l;
        if (i11 == -1) {
            i11 = 0;
        }
        int b11 = a11.b();
        for (int i12 = i11; i12 < b11; i12++) {
            C findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i12);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            }
        }
        int min = Math.min(b11, i11);
        do {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
        } while (!findViewHolderForAdapterPosition.itemView.hasFocusable());
        return findViewHolderForAdapterPosition.itemView;
    }

    static C getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).f44747a;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.f44748b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private C5354z getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C5354z(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j11, C c11, C c12) {
        int e11 = this.mChildHelper.e();
        for (int i11 = 0; i11 < e11; i11++) {
            C childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i11));
            if (childViewHolderInt != c11 && getChangedHolderKey(childViewHolderInt) == j11) {
                g gVar = this.mAdapter;
                if (gVar == null || !gVar.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + c11 + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + c11 + exceptionLabel());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + c12 + " cannot be found but it is necessary for " + c11 + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int e11 = this.mChildHelper.e();
        for (int i11 = 0; i11 < e11; i11++) {
            C childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i11));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (Y.l(this) == 0) {
            Y.I(8, this);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C5472f(new e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i11) {
        int i12;
        if (view2 == null || view2 == this || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c11 = 65535;
        int i13 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i14 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i15 = rect2.left;
        if ((i14 < i15 || rect.right <= i15) && rect.right < rect2.right) {
            i12 = 1;
        } else {
            int i16 = rect.right;
            int i17 = rect2.right;
            i12 = ((i16 > i17 || i14 >= i17) && i14 > i15) ? -1 : 0;
        }
        int i18 = rect.top;
        int i19 = rect2.top;
        if ((i18 < i19 || rect.bottom <= i19) && rect.bottom < rect2.bottom) {
            c11 = 1;
        } else {
            int i21 = rect.bottom;
            int i22 = rect2.bottom;
            if ((i21 <= i22 && i18 < i22) || i18 <= i19) {
                c11 = 0;
            }
        }
        if (i11 == 1) {
            return c11 < 0 || (c11 == 0 && i12 * i13 <= 0);
        }
        if (i11 == 2) {
            return c11 > 0 || (c11 == 0 && i12 * i13 >= 0);
        }
        if (i11 == 17) {
            return i12 < 0;
        }
        if (i11 == 33) {
            return c11 < 0;
        }
        if (i11 == 66) {
            return i12 > 0;
        }
        if (i11 == 130) {
            return c11 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i11 + exceptionLabel());
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i11 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i11);
            int x11 = (int) (motionEvent.getX(i11) + 0.5f);
            this.mLastTouchX = x11;
            this.mInitialTouchX = x11;
            int y11 = (int) (motionEvent.getY(i11) + 0.5f);
            this.mLastTouchY = y11;
            this.mInitialTouchY = y11;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z11;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.q();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.o();
        } else {
            this.mAdapterHelper.c();
        }
        boolean z12 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f44721j = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z11 = this.mDataSetHasChangedAfterLayout) || z12 || this.mLayout.mRequestedSimpleAnimations) && (!z11 || this.mAdapter.hasStableIds());
        A a11 = this.mState;
        a11.f44722k = a11.f44721j && z12 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pullGlows(float f7, float f11, float f12, float f13) {
        boolean z11;
        boolean z12 = true;
        if (f11 < 0.0f) {
            ensureLeftGlow();
            androidx.core.widget.f.b(this.mLeftGlow, (-f11) / getWidth(), 1.0f - (f12 / getHeight()));
        } else {
            if (f11 <= 0.0f) {
                z11 = false;
                if (f13 >= 0.0f) {
                    ensureTopGlow();
                    androidx.core.widget.f.b(this.mTopGlow, (-f13) / getHeight(), f7 / getWidth());
                } else if (f13 > 0.0f) {
                    ensureBottomGlow();
                    androidx.core.widget.f.b(this.mBottomGlow, f13 / getHeight(), 1.0f - (f7 / getWidth()));
                } else {
                    z12 = z11;
                }
                if (z12 && f11 == 0.0f && f13 == 0.0f) {
                    return;
                }
                int i11 = Y.f42258g;
                postInvalidateOnAnimation();
            }
            ensureRightGlow();
            androidx.core.widget.f.b(this.mRightGlow, f11 / getWidth(), f12 / getHeight());
        }
        z11 = true;
        if (f13 >= 0.0f) {
        }
        if (z12) {
        }
        int i112 = Y.f42258g;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void recoverFocusFromState() {
        View findViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.f44869c.contains(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.e() == 0) {
                requestFocus();
                return;
            }
        }
        View view = null;
        C findViewHolderForItemId = (this.mState.f44724m == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f44724m);
        if (findViewHolderForItemId != null) {
            if (!this.mChildHelper.f44869c.contains(findViewHolderForItemId.itemView) && findViewHolderForItemId.itemView.hasFocusable()) {
                view = findViewHolderForItemId.itemView;
                if (view == null) {
                    int i11 = this.mState.f44725n;
                    if (i11 != -1 && (findViewById = view.findViewById(i11)) != null && findViewById.isFocusable()) {
                        view = findViewById;
                    }
                    view.requestFocus();
                    return;
                }
                return;
            }
        }
        if (this.mChildHelper.e() > 0) {
            view = findNextViewToFocus();
        }
        if (view == null) {
        }
    }

    private void releaseGlows() {
        boolean z11;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z11 = this.mLeftGlow.isFinished();
        } else {
            z11 = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z11 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z11 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z11 |= this.mBottomGlow.isFinished();
        }
        if (z11) {
            int i11 = Y.f42258g;
            postInvalidateOnAnimation();
        }
    }

    private void requestChildOnScreen(@NonNull View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.f44749c) {
                Rect rect = this.mTempRect;
                int i11 = rect.left;
                Rect rect2 = pVar.f44748b;
                rect.left = i11 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        A a11 = this.mState;
        a11.f44724m = -1L;
        a11.f44723l = -1;
        a11.f44725n = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        C findContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (findContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f44724m = this.mAdapter.hasStableIds() ? findContainingViewHolder.getItemId() : -1L;
        this.mState.f44723l = this.mDataSetHasChangedAfterLayout ? -1 : findContainingViewHolder.isRemoved() ? findContainingViewHolder.mOldPosition : findContainingViewHolder.getAdapterPosition();
        this.mState.f44725n = getDeepestFocusedViewWithId(findContainingViewHolder.itemView);
    }

    private void setAdapterInternal(g gVar, boolean z11, boolean z12) {
        g gVar2 = this.mAdapter;
        if (gVar2 != null) {
            gVar2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z11 || z12) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.q();
        g gVar3 = this.mAdapter;
        this.mAdapter = gVar;
        if (gVar != null) {
            gVar.registerAdapterDataObserver(this.mObserver);
            gVar.onAttachedToRecyclerView(this);
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.onAdapterChanged(gVar3, this.mAdapter);
        }
        v vVar = this.mRecycler;
        g gVar4 = this.mAdapter;
        vVar.c();
        vVar.e().onAdapterChanged(gVar3, gVar4, z11);
        this.mState.f44717f = true;
    }

    private void stopScrollersInternal() {
        B b11 = this.mViewFlinger;
        RecyclerView.this.removeCallbacks(b11);
        b11.f44728c.abortAnimation();
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.stopSmoothScroller();
        }
    }

    void absorbGlows(int i11, int i12) {
        if (i11 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i11);
            }
        }
        if (i12 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i12);
            }
        } else if (i12 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i12);
            }
        }
        if (i11 == 0 && i12 == 0) {
            return;
        }
        int i13 = Y.f42258g;
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i11, int i12) {
        o oVar = this.mLayout;
        if (oVar == null || !oVar.onAddFocusables(this, arrayList, i11, i12)) {
            super.addFocusables(arrayList, i11, i12);
        }
    }

    public void addItemDecoration(@NonNull n nVar, int i11) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i11 < 0) {
            this.mItemDecorations.add(nVar);
        } else {
            this.mItemDecorations.add(i11, nVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(@NonNull q qVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(qVar);
    }

    public void addOnItemTouchListener(@NonNull s sVar) {
        this.mOnItemTouchListeners.add(sVar);
    }

    public void addOnScrollListener(@NonNull t tVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(tVar);
    }

    void animateAppearance(@NonNull C c11, l.c cVar, @NonNull l.c cVar2) {
        c11.setIsRecyclable(false);
        if (this.mItemAnimator.animateAppearance(c11, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    void animateDisappearance(@NonNull C c11, @NonNull l.c cVar, l.c cVar2) {
        addAnimatingView(c11);
        c11.setIsRecyclable(false);
        if (this.mItemAnimator.animateDisappearance(c11, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        StringBuilder e11 = C3261b.e(str);
        e11.append(exceptionLabel());
        throw new IllegalStateException(e11.toString());
    }

    void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + exceptionLabel()));
        }
    }

    boolean canReuseUpdatedViewHolder(C c11) {
        l lVar = this.mItemAnimator;
        return lVar == null || lVar.canReuseUpdatedViewHolder(c11, c11.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.mLayout.checkLayoutParams((p) layoutParams);
    }

    void clearOldPositions() {
        int h11 = this.mChildHelper.h();
        for (int i11 = 0; i11 < h11; i11++) {
            C childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i11));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        v vVar = this.mRecycler;
        ArrayList<C> arrayList = vVar.f44757c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.get(i12).clearOldPosition();
        }
        ArrayList<C> arrayList2 = vVar.f44755a;
        int size2 = arrayList2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            arrayList2.get(i13).clearOldPosition();
        }
        ArrayList<C> arrayList3 = vVar.f44756b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i14 = 0; i14 < size3; i14++) {
                vVar.f44756b.get(i14).clearOldPosition();
            }
        }
    }

    public void clearOnScrollListeners() {
        List<t> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    void considerReleasingGlowsOnScroll(int i11, int i12) {
        boolean z11;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i11 <= 0) {
            z11 = false;
        } else {
            this.mLeftGlow.onRelease();
            z11 = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i11 < 0) {
            this.mRightGlow.onRelease();
            z11 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i12 > 0) {
            this.mTopGlow.onRelease();
            z11 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i12 < 0) {
            this.mBottomGlow.onRelease();
            z11 |= this.mBottomGlow.isFinished();
        }
        if (z11) {
            int i13 = Y.f42258g;
            postInvalidateOnAnimation();
        }
    }

    void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            dispatchLayout();
            return;
        }
        if (this.mAdapterHelper.h()) {
            if (!this.mAdapterHelper.g(4) || this.mAdapterHelper.g(11)) {
                if (this.mAdapterHelper.h()) {
                    dispatchLayout();
                    return;
                }
                return;
            }
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.o();
            if (!this.mLayoutWasDefered) {
                if (hasUpdatedView()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.b();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
        }
    }

    void defaultOnMeasure(int i11, int i12) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int i13 = Y.f42258g;
        setMeasuredDimension(o.chooseSize(i11, paddingRight, getMinimumWidth()), o.chooseSize(i12, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    void dispatchChildAttached(View view) {
        C childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        g gVar = this.mAdapter;
        if (gVar != null && childViewHolderInt != null) {
            gVar.onViewAttachedToWindow(childViewHolderInt);
        }
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewAttachedToWindow(view);
            }
        }
    }

    void dispatchChildDetached(View view) {
        C childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        g gVar = this.mAdapter;
        if (gVar != null && childViewHolderInt != null) {
            gVar.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewDetachedFromWindow(view);
            }
        }
    }

    void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        A a11 = this.mState;
        a11.f44720i = false;
        if (a11.f44715d == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else {
            C5467a c5467a = this.mAdapterHelper;
            if ((c5467a.f44830c.isEmpty() || c5467a.f44829b.isEmpty()) && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
                dispatchLayoutStep2();
            }
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f7, float f11, boolean z11) {
        return getScrollingChildHelper().a(f7, f11, z11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f7, float f11) {
        return getScrollingChildHelper().b(f7, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i11, i12, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr) {
        return getScrollingChildHelper().e(i11, i12, i13, i14, iArr);
    }

    void dispatchOnScrollStateChanged(int i11) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.onScrollStateChanged(i11);
        }
        onScrollStateChanged(i11);
        t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.onScrollStateChanged(this, i11);
        }
        List<t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i11);
            }
        }
    }

    void dispatchOnScrolled(int i11, int i12) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i11, scrollY - i12);
        onScrolled(i11, i12);
        t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.onScrolled(this, i11, i12);
        }
        List<t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i11, i12);
            }
        }
        this.mDispatchScrollCounter--;
    }

    void dispatchPendingImportantForAccessibilityChanges() {
        int i11;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            C c11 = this.mPendingAccessibilityImportanceChange.get(size);
            if (c11.itemView.getParent() == this && !c11.shouldIgnore() && (i11 = c11.mPendingAccessibilityState) != -1) {
                View view = c11.itemView;
                int i12 = Y.f42258g;
                view.setImportantForAccessibility(i11);
                c11.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z11;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z12 = false;
        for (int i11 = 0; i11 < size; i11++) {
            this.mItemDecorations.get(i11).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z11 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z11 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z11 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z11 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z12 = true;
            }
            z11 |= z12;
            canvas.restoreToCount(save4);
        }
        if ((z11 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.isRunning()) ? z11 : true) {
            int i12 = Y.f42258g;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j11) {
        return super.drawChild(canvas, view, j11);
    }

    void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect createEdgeEffect = this.mEdgeEffectFactory.createEdgeEffect(this, 3);
        this.mBottomGlow = createEdgeEffect;
        if (this.mClipToPadding) {
            createEdgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            createEdgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect createEdgeEffect = this.mEdgeEffectFactory.createEdgeEffect(this, 0);
        this.mLeftGlow = createEdgeEffect;
        if (this.mClipToPadding) {
            createEdgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            createEdgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect createEdgeEffect = this.mEdgeEffectFactory.createEdgeEffect(this, 2);
        this.mRightGlow = createEdgeEffect;
        if (this.mClipToPadding) {
            createEdgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            createEdgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect createEdgeEffect = this.mEdgeEffectFactory.createEdgeEffect(this, 1);
        this.mTopGlow = createEdgeEffect;
        if (this.mClipToPadding) {
            createEdgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            createEdgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    final void fillRemainingScrollValues(A a11) {
        if (getScrollState() != 2) {
            a11.getClass();
            return;
        }
        OverScroller overScroller = this.mViewFlinger.f44728c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        a11.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public View findChildViewUnder(float f7, float f11) {
        for (int e11 = this.mChildHelper.e() - 1; e11 >= 0; e11--) {
            View d11 = this.mChildHelper.d(e11);
            float translationX = d11.getTranslationX();
            float translationY = d11.getTranslationY();
            if (f7 >= d11.getLeft() + translationX && f7 <= d11.getRight() + translationX && f11 >= d11.getTop() + translationY && f11 <= d11.getBottom() + translationY) {
                return d11;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View findContainingItemView(@NonNull View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    public C findContainingViewHolder(@NonNull View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public C findViewHolderForAdapterPosition(int i11) {
        C c11 = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int h11 = this.mChildHelper.h();
        for (int i12 = 0; i12 < h11; i12++) {
            C childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i12));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionFor(childViewHolderInt) == i11) {
                C5472f c5472f = this.mChildHelper;
                if (!c5472f.f44869c.contains(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                c11 = childViewHolderInt;
            }
        }
        return c11;
    }

    public C findViewHolderForItemId(long j11) {
        g gVar = this.mAdapter;
        C c11 = null;
        if (gVar != null && gVar.hasStableIds()) {
            int h11 = this.mChildHelper.h();
            for (int i11 = 0; i11 < h11; i11++) {
                C childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i11));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j11) {
                    C5472f c5472f = this.mChildHelper;
                    if (!c5472f.f44869c.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    c11 = childViewHolderInt;
                }
            }
        }
        return c11;
    }

    public C findViewHolderForLayoutPosition(int i11) {
        return findViewHolderForPosition(i11, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    C findViewHolderForPosition(int i11, boolean z11) {
        C5472f c5472f;
        int h11 = this.mChildHelper.h();
        C c11 = null;
        for (int i12 = 0; i12 < h11; i12++) {
            C childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i12));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z11) {
                    if (childViewHolderInt.mPosition != i11) {
                        continue;
                    }
                    c5472f = this.mChildHelper;
                    if (c5472f.f44869c.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    c11 = childViewHolderInt;
                } else {
                    if (childViewHolderInt.getLayoutPosition() != i11) {
                        continue;
                    }
                    c5472f = this.mChildHelper;
                    if (c5472f.f44869c.contains(childViewHolderInt.itemView)) {
                    }
                }
            }
        }
        return c11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean fling(int i11, int i12) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.mLayoutSuppressed) {
            int canScrollHorizontally = oVar.canScrollHorizontally();
            boolean canScrollVertically = this.mLayout.canScrollVertically();
            if (canScrollHorizontally == 0 || Math.abs(i11) < this.mMinFlingVelocity) {
                i11 = 0;
            }
            if (!canScrollVertically || Math.abs(i12) < this.mMinFlingVelocity) {
                i12 = 0;
            }
            if (i11 != 0 || i12 != 0) {
                float f7 = i11;
                float f11 = i12;
                if (!dispatchNestedPreFling(f7, f11)) {
                    boolean z11 = canScrollHorizontally != 0 || canScrollVertically;
                    dispatchNestedFling(f7, f11, z11);
                    r rVar = this.mOnFlingListener;
                    if (rVar != null && rVar.onFling(i11, i12)) {
                        return true;
                    }
                    if (z11) {
                        if (canScrollVertically) {
                            canScrollHorizontally = (canScrollHorizontally == true ? 1 : 0) | 2;
                        }
                        startNestedScroll(canScrollHorizontally, 1);
                        int i13 = this.mMaxFlingVelocity;
                        int max = Math.max(-i13, Math.min(i11, i13));
                        int i14 = this.mMaxFlingVelocity;
                        this.mViewFlinger.a(max, Math.max(-i14, Math.min(i12, i14)));
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i11) {
        View view2;
        boolean z11;
        View onInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i11);
        if (onInterceptFocusSearch != null) {
            return onInterceptFocusSearch;
        }
        boolean z12 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z12 && (i11 == 2 || i11 == 1)) {
            if (this.mLayout.canScrollVertically()) {
                int i12 = i11 == 2 ? 130 : 33;
                z11 = focusFinder.findNextFocus(this, view, i12) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i11 = i12;
                }
            } else {
                z11 = false;
            }
            if (!z11 && this.mLayout.canScrollHorizontally()) {
                int i13 = (this.mLayout.getLayoutDirection() == 1) ^ (i11 == 2) ? 66 : 17;
                boolean z13 = focusFinder.findNextFocus(this, view, i13) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i11 = i13;
                }
                z11 = z13;
            }
            if (z11) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i11, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i11);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i11);
            if (findNextFocus == null && z12) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.onFocusSearchFailed(view, i11, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return isPreferredNextFocus(view, view2, i11) ? view2 : super.focusSearch(view, i11);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i11);
        }
        requestChildOnScreen(view2, null);
        return view;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.generateDefaultLayoutParams();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.mAdapter;
    }

    int getAdapterPositionFor(C c11) {
        if (c11.hasAnyOfTheFlags(524) || !c11.isBound()) {
            return -1;
        }
        C5467a c5467a = this.mAdapterHelper;
        int i11 = c11.mPosition;
        ArrayList<C5467a.C0815a> arrayList = c5467a.f44829b;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            C5467a.C0815a c0815a = arrayList.get(i12);
            int i13 = c0815a.f44834a;
            if (i13 != 1) {
                if (i13 == 2) {
                    int i14 = c0815a.f44835b;
                    if (i14 <= i11) {
                        int i15 = c0815a.f44837d;
                        if (i14 + i15 > i11) {
                            return -1;
                        }
                        i11 -= i15;
                    } else {
                        continue;
                    }
                } else if (i13 == 8) {
                    int i16 = c0815a.f44835b;
                    if (i16 == i11) {
                        i11 = c0815a.f44837d;
                    } else {
                        if (i16 < i11) {
                            i11--;
                        }
                        if (c0815a.f44837d <= i11) {
                            i11++;
                        }
                    }
                }
            } else if (c0815a.f44835b <= i11) {
                i11 += c0815a.f44837d;
            }
        }
        return i11;
    }

    @Override // android.view.View
    public int getBaseline() {
        o oVar = this.mLayout;
        return oVar != null ? oVar.getBaseline() : super.getBaseline();
    }

    long getChangedHolderKey(C c11) {
        return this.mAdapter.hasStableIds() ? c11.getItemId() : c11.mPosition;
    }

    public int getChildAdapterPosition(@NonNull View view) {
        C childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i11, int i12) {
        return super.getChildDrawingOrder(i11, i12);
    }

    public int getChildLayoutPosition(@NonNull View view) {
        C childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    public C getChildViewHolder(@NonNull View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public l getItemAnimator() {
        return this.mItemAnimator;
    }

    Rect getItemDecorInsetsForChild(View view) {
        p pVar = (p) view.getLayoutParams();
        boolean z11 = pVar.f44749c;
        Rect rect = pVar.f44748b;
        if (!z11 || (this.mState.f44718g && (pVar.f44747a.isUpdated() || pVar.f44747a.isInvalid()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i11).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i12 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i12 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f44749c = false;
        return rect;
    }

    @NonNull
    public n getItemDecorationAt(int i11) {
        int itemDecorationCount = getItemDecorationCount();
        if (i11 >= 0 && i11 < itemDecorationCount) {
            return this.mItemDecorations.get(i11);
        }
        throw new IndexOutOfBoundsException(i11 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public o getLayoutManager() {
        return this.mLayout;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public r getOnFlingListener() {
        return this.mOnFlingListener;
    }

    @NonNull
    public u getRecycledViewPool() {
        return this.mRecycler.e();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().h(0);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.h();
    }

    void initAdapterManager() {
        this.mAdapterHelper = new C5467a(new f());
    }

    void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
        Resources resources = getContext().getResources();
        new androidx.recyclerview.widget.k(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(ru.ozon.app.android.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(ru.ozon.app.android.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(ru.ozon.app.android.R.dimen.fastscroll_margin));
    }

    void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        l lVar = this.mItemAnimator;
        return lVar != null && lVar.isRunning();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().i();
    }

    void jumpToPositionForSmoothScroller(int i11) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i11);
        awakenScrollBars();
    }

    void markItemDecorInsetsDirty() {
        int h11 = this.mChildHelper.h();
        for (int i11 = 0; i11 < h11; i11++) {
            ((p) this.mChildHelper.g(i11).getLayoutParams()).f44749c = true;
        }
        ArrayList<C> arrayList = this.mRecycler.f44757c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            p pVar = (p) arrayList.get(i12).itemView.getLayoutParams();
            if (pVar != null) {
                pVar.f44749c = true;
            }
        }
    }

    void markKnownViewsInvalid() {
        int h11 = this.mChildHelper.h();
        for (int i11 = 0; i11 < h11; i11++) {
            C childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i11));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        v vVar = this.mRecycler;
        ArrayList<C> arrayList = vVar.f44757c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            C c11 = arrayList.get(i12);
            if (c11 != null) {
                c11.addFlags(6);
                c11.addChangePayload(null);
            }
        }
        g gVar = RecyclerView.this.mAdapter;
        if (gVar == null || !gVar.hasStableIds()) {
            vVar.i();
        }
    }

    public void offsetChildrenHorizontal(int i11) {
        int e11 = this.mChildHelper.e();
        for (int i12 = 0; i12 < e11; i12++) {
            this.mChildHelper.d(i12).offsetLeftAndRight(i11);
        }
    }

    public void offsetChildrenVertical(int i11) {
        int e11 = this.mChildHelper.e();
        for (int i12 = 0; i12 < e11; i12++) {
            this.mChildHelper.d(i12).offsetTopAndBottom(i11);
        }
    }

    void offsetPositionRecordsForInsert(int i11, int i12) {
        int h11 = this.mChildHelper.h();
        for (int i13 = 0; i13 < h11; i13++) {
            C childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i13));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i11) {
                childViewHolderInt.offsetPosition(i12, false);
                this.mState.f44717f = true;
            }
        }
        ArrayList<C> arrayList = this.mRecycler.f44757c;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            C c11 = arrayList.get(i14);
            if (c11 != null && c11.mPosition >= i11) {
                c11.offsetPosition(i12, true);
            }
        }
        requestLayout();
    }

    void offsetPositionRecordsForMove(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int h11 = this.mChildHelper.h();
        int i21 = -1;
        if (i11 < i12) {
            i14 = i11;
            i13 = i12;
            i15 = -1;
        } else {
            i13 = i11;
            i14 = i12;
            i15 = 1;
        }
        for (int i22 = 0; i22 < h11; i22++) {
            C childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i22));
            if (childViewHolderInt != null && (i19 = childViewHolderInt.mPosition) >= i14 && i19 <= i13) {
                if (i19 == i11) {
                    childViewHolderInt.offsetPosition(i12 - i11, false);
                } else {
                    childViewHolderInt.offsetPosition(i15, false);
                }
                this.mState.f44717f = true;
            }
        }
        v vVar = this.mRecycler;
        vVar.getClass();
        if (i11 < i12) {
            i17 = i11;
            i16 = i12;
        } else {
            i16 = i11;
            i21 = 1;
            i17 = i12;
        }
        ArrayList<C> arrayList = vVar.f44757c;
        int size = arrayList.size();
        for (int i23 = 0; i23 < size; i23++) {
            C c11 = arrayList.get(i23);
            if (c11 != null && (i18 = c11.mPosition) >= i17 && i18 <= i16) {
                if (i18 == i11) {
                    c11.offsetPosition(i12 - i11, false);
                } else {
                    c11.offsetPosition(i21, false);
                }
            }
        }
        requestLayout();
    }

    void offsetPositionRecordsForRemove(int i11, int i12, boolean z11) {
        int i13 = i11 + i12;
        int h11 = this.mChildHelper.h();
        for (int i14 = 0; i14 < h11; i14++) {
            C childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i14));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i15 = childViewHolderInt.mPosition;
                if (i15 >= i13) {
                    childViewHolderInt.offsetPosition(-i12, z11);
                    this.mState.f44717f = true;
                } else if (i15 >= i11) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i11 - 1, -i12, z11);
                    this.mState.f44717f = true;
                }
            }
        }
        v vVar = this.mRecycler;
        ArrayList<C> arrayList = vVar.f44757c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C c11 = arrayList.get(size);
            if (c11 != null) {
                int i16 = c11.mPosition;
                if (i16 >= i13) {
                    c11.offsetPosition(-i12, z11);
                } else if (i16 >= i11) {
                    c11.addFlags(8);
                    vVar.j(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onAttachedToWindow() {
        float f7;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<androidx.recyclerview.widget.l> threadLocal = androidx.recyclerview.widget.l.f44975e;
            androidx.recyclerview.widget.l lVar = threadLocal.get();
            this.mGapWorker = lVar;
            if (lVar == null) {
                this.mGapWorker = new androidx.recyclerview.widget.l();
                int i11 = Y.f42258g;
                Display display = getDisplay();
                if (!isInEditMode() && display != null) {
                    f7 = display.getRefreshRate();
                }
                f7 = 60.0f;
                androidx.recyclerview.widget.l lVar2 = this.mGapWorker;
                lVar2.f44979c = (long) (1.0E9f / f7);
                threadLocal.set(lVar2);
            }
            this.mGapWorker.f44977a.add(this);
        }
    }

    public void onChildAttachedToWindow(@NonNull View view) {
    }

    public void onChildDetachedFromWindow(@NonNull View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.l lVar;
        super.onDetachedFromWindow();
        l lVar2 = this.mItemAnimator;
        if (lVar2 != null) {
            lVar2.endAnimations();
        }
        stopScroll();
        this.mIsAttached = false;
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        while (F.a.f44674d.a() != null) {
        }
        if (!ALLOW_THREAD_GAP_WORK || (lVar = this.mGapWorker) == null) {
            return;
        }
        lVar.f44977a.remove(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.mItemDecorations.get(i11).onDraw(canvas, this, this.mState);
        }
    }

    void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f7;
        float f11;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f7 = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.mLayout.canScrollHorizontally()) {
                    f11 = motionEvent.getAxisValue(10);
                    if (f7 == 0.0f || f11 != 0.0f) {
                        scrollByInternal((int) (f11 * this.mScaledHorizontalScrollFactor), (int) (f7 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
                f11 = 0.0f;
                if (f7 == 0.0f) {
                }
                scrollByInternal((int) (f11 * this.mScaledHorizontalScrollFactor), (int) (f7 * this.mScaledVerticalScrollFactor), motionEvent);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.mLayout.canScrollVertically()) {
                        f7 = -axisValue;
                        f11 = 0.0f;
                        if (f7 == 0.0f) {
                        }
                        scrollByInternal((int) (f11 * this.mScaledHorizontalScrollFactor), (int) (f7 * this.mScaledVerticalScrollFactor), motionEvent);
                    } else if (this.mLayout.canScrollHorizontally()) {
                        f11 = axisValue;
                        f7 = 0.0f;
                        if (f7 == 0.0f) {
                        }
                        scrollByInternal((int) (f11 * this.mScaledHorizontalScrollFactor), (int) (f7 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
                f7 = 0.0f;
                f11 = 0.0f;
                if (f7 == 0.0f) {
                }
                scrollByInternal((int) (f11 * this.mScaledHorizontalScrollFactor), (int) (f7 * this.mScaledVerticalScrollFactor), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        o oVar = this.mLayout;
        if (oVar == null) {
            return false;
        }
        boolean canScrollHorizontally = oVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x11 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x11;
            this.mInitialTouchX = x11;
            int y11 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y11;
            this.mInitialTouchY = y11;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i11 = canScrollHorizontally;
            if (canScrollVertically) {
                i11 = (canScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i11, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x12 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y12 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i12 = x12 - this.mInitialTouchX;
                int i13 = y12 - this.mInitialTouchY;
                if (canScrollHorizontally == 0 || Math.abs(i12) <= this.mTouchSlop) {
                    z11 = false;
                } else {
                    this.mLastTouchX = x12;
                    z11 = true;
                }
                if (canScrollVertically && Math.abs(i13) > this.mTouchSlop) {
                    this.mLastTouchY = y12;
                    z11 = true;
                }
                if (z11) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x13 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x13;
            this.mInitialTouchX = x13;
            int y13 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y13;
            this.mInitialTouchY = y13;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        dispatchLayout();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        o oVar = this.mLayout;
        if (oVar == null) {
            defaultOnMeasure(i11, i12);
            return;
        }
        if (oVar.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i11);
            int mode2 = View.MeasureSpec.getMode(i12);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i11, i12);
            if ((mode == 1073741824 && mode2 == 1073741824) || this.mAdapter == null) {
                return;
            }
            if (this.mState.f44715d == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i11, i12);
            this.mState.f44720i = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i11, i12);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f44720i = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i11, i12);
                return;
            }
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i11, i12);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            A a11 = this.mState;
            if (a11.f44722k) {
                a11.f44718g = true;
            } else {
                this.mAdapterHelper.c();
                this.mState.f44718g = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f44722k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        g gVar = this.mAdapter;
        if (gVar != null) {
            this.mState.f44716e = gVar.getItemCount();
        } else {
            this.mState.f44716e = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i11, i12);
        stopInterceptRequestLayout(false);
        this.mState.f44718g = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i11, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i11, rect);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof x)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x xVar = (x) parcelable;
        this.mPendingSavedState = xVar;
        super.onRestoreInstanceState(xVar.a());
        o oVar = this.mLayout;
        if (oVar == null || (parcelable2 = this.mPendingSavedState.f44764c) == null) {
            return;
        }
        oVar.onRestoreInstanceState(parcelable2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        x xVar = new x(super.onSaveInstanceState());
        x xVar2 = this.mPendingSavedState;
        if (xVar2 != null) {
            xVar.f44764c = xVar2.f44764c;
            return xVar;
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            xVar.f44764c = oVar.onSaveInstanceState();
            return xVar;
        }
        xVar.f44764c = null;
        return xVar;
    }

    public void onScrollStateChanged(int i11) {
    }

    public void onScrolled(int i11, int i12) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 == i13 && i12 == i14) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (dispatchToOnItemTouchListeners(motionEvent)) {
            cancelScroll();
            return true;
        }
        o oVar = this.mLayout;
        if (oVar == null) {
            return false;
        }
        boolean canScrollHorizontally = oVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.mNestedOffsets;
        obtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked == 0) {
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x11 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x11;
            this.mInitialTouchX = x11;
            int y11 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y11;
            this.mInitialTouchY = y11;
            int i11 = canScrollHorizontally;
            if (canScrollVertically) {
                i11 = (canScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i11, 0);
        } else {
            if (actionMasked == 1) {
                this.mVelocityTracker.addMovement(obtain);
                this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
                float f7 = canScrollHorizontally != 0 ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                float f11 = canScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                if ((f7 == 0.0f && f11 == 0.0f) || !fling((int) f7, (int) f11)) {
                    setScrollState(0);
                }
                resetScroll();
                obtain.recycle();
                return true;
            }
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                if (findPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x12 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y12 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i12 = this.mLastTouchX - x12;
                int i13 = this.mLastTouchY - y12;
                if (this.mScrollState != 1) {
                    if (canScrollHorizontally != 0) {
                        i12 = i12 > 0 ? Math.max(0, i12 - this.mTouchSlop) : Math.min(0, i12 + this.mTouchSlop);
                        if (i12 != 0) {
                            z11 = true;
                            if (canScrollVertically) {
                                i13 = i13 > 0 ? Math.max(0, i13 - this.mTouchSlop) : Math.min(0, i13 + this.mTouchSlop);
                                if (i13 != 0) {
                                    z11 = true;
                                }
                            }
                            if (z11) {
                                setScrollState(1);
                            }
                        }
                    }
                    z11 = false;
                    if (canScrollVertically) {
                    }
                    if (z11) {
                    }
                }
                int i14 = i12;
                int i15 = i13;
                if (this.mScrollState == 1) {
                    int[] iArr3 = this.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    if (dispatchNestedPreScroll(canScrollHorizontally != 0 ? i14 : 0, canScrollVertically ? i15 : 0, iArr3, this.mScrollOffset, 0)) {
                        int[] iArr4 = this.mReusableIntPair;
                        i14 -= iArr4[0];
                        i15 -= iArr4[1];
                        int[] iArr5 = this.mNestedOffsets;
                        int i16 = iArr5[0];
                        int[] iArr6 = this.mScrollOffset;
                        iArr5[0] = i16 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int[] iArr7 = this.mScrollOffset;
                    this.mLastTouchX = x12 - iArr7[0];
                    this.mLastTouchY = y12 - iArr7[1];
                    if (scrollByInternal(canScrollHorizontally != 0 ? i14 : 0, canScrollVertically ? i15 : 0, motionEvent)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    androidx.recyclerview.widget.l lVar = this.mGapWorker;
                    if (lVar != null && (i14 != 0 || i15 != 0)) {
                        lVar.a(this, i14, i15);
                    }
                }
            } else if (actionMasked == 3) {
                cancelScroll();
            } else if (actionMasked == 5) {
                this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                int x13 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.mLastTouchX = x13;
                this.mInitialTouchX = x13;
                int y13 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.mLastTouchY = y13;
                this.mInitialTouchY = y13;
            } else if (actionMasked == 6) {
                onPointerUp(motionEvent);
            }
        }
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        return true;
    }

    void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        Runnable runnable = this.mItemAnimatorRunner;
        int i11 = Y.f42258g;
        postOnAnimation(runnable);
        this.mPostedAnimatorRunner = true;
    }

    void processDataSetCompletelyChanged(boolean z11) {
        this.mDispatchItemsChangedEvent = z11 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    void recordAnimationInfoIfBouncedHiddenView(C c11, l.c cVar) {
        c11.setFlags(0, 8192);
        if (this.mState.f44719h && c11.isUpdated() && !c11.isRemoved() && !c11.shouldIgnore()) {
            this.mViewInfoStore.f44673b.f(getChangedHolderKey(c11), c11);
        }
        Z<C, F.a> z11 = this.mViewInfoStore.f44672a;
        F.a aVar = z11.get(c11);
        if (aVar == null) {
            aVar = F.a.a();
            z11.put(c11, aVar);
        }
        aVar.f44676b = cVar;
        aVar.f44675a |= 4;
    }

    void removeAndRecycleViews() {
        l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.endAnimations();
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.c();
    }

    boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean n11 = this.mChildHelper.n(view);
        if (n11) {
            C childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.q(childViewHolderInt);
            this.mRecycler.l(childViewHolderInt);
        }
        stopInterceptRequestLayout(!n11);
        return n11;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z11) {
        C childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z11);
    }

    public void removeItemDecoration(@NonNull n nVar) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(nVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i11) {
        int itemDecorationCount = getItemDecorationCount();
        if (i11 >= 0 && i11 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i11));
            return;
        }
        throw new IndexOutOfBoundsException(i11 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(@NonNull q qVar) {
        List<q> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(qVar);
    }

    public void removeOnItemTouchListener(@NonNull s sVar) {
        this.mOnItemTouchListeners.remove(sVar);
        if (this.mInterceptingOnItemTouchListener == sVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(@NonNull t tVar) {
        List<t> list = this.mScrollListeners;
        if (list != null) {
            list.remove(tVar);
        }
    }

    void repositionShadowingViews() {
        C c11;
        int e11 = this.mChildHelper.e();
        for (int i11 = 0; i11 < e11; i11++) {
            View d11 = this.mChildHelper.d(i11);
            C childViewHolder = getChildViewHolder(d11);
            if (childViewHolder != null && (c11 = childViewHolder.mShadowingHolder) != null) {
                View view = c11.itemView;
                int left = d11.getLeft();
                int top = d11.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z11) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        int size = this.mOnItemTouchListeners.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.mOnItemTouchListeners.get(i11).onRequestDisallowInterceptTouchEvent(z11);
        }
        super.requestDisallowInterceptTouchEvent(z11);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    void saveOldPositions() {
        int h11 = this.mChildHelper.h();
        for (int i11 = 0; i11 < h11; i11++) {
            C childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i11));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i11, int i12) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean canScrollHorizontally = oVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (canScrollHorizontally || canScrollVertically) {
            if (!canScrollHorizontally) {
                i11 = 0;
            }
            if (!canScrollVertically) {
                i12 = 0;
            }
            scrollByInternal(i11, i12, null);
        }
    }

    boolean scrollByInternal(int i11, int i12, MotionEvent motionEvent) {
        int i13;
        int i14;
        int i15;
        int i16;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i11, i12, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            i15 = i11 - i17;
            i16 = i12 - i18;
            i14 = i18;
            i13 = i17;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i13, i14, i15, i16, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i19 = iArr4[0];
        int i21 = i15 - i19;
        int i22 = iArr4[1];
        int i23 = i16 - i22;
        boolean z11 = (i19 == 0 && i22 == 0) ? false : true;
        int i24 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i25 = iArr5[0];
        this.mLastTouchX = i24 - i25;
        int i26 = this.mLastTouchY;
        int i27 = iArr5[1];
        this.mLastTouchY = i26 - i27;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i25;
        iArr6[1] = iArr6[1] + i27;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C5350x.a(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i21, motionEvent.getY(), i23);
            }
            considerReleasingGlowsOnScroll(i11, i12);
        }
        if (i13 != 0 || i14 != 0) {
            dispatchOnScrolled(i13, i14);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z11 && i13 == 0 && i14 == 0) ? false : true;
    }

    void scrollStep(int i11, int i12, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        fillRemainingScrollValues(this.mState);
        int scrollHorizontallyBy = i11 != 0 ? this.mLayout.scrollHorizontallyBy(i11, this.mRecycler, this.mState) : 0;
        int scrollVerticallyBy = i12 != 0 ? this.mLayout.scrollVerticallyBy(i12, this.mRecycler, this.mState) : 0;
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = scrollHorizontallyBy;
            iArr[1] = scrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i11, int i12) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i11) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.scrollToPosition(i11);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.A a11) {
        this.mAccessibilityDelegate = a11;
        Y.C(this, a11);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = jVar;
        setChildrenDrawingOrderEnabled(jVar != null);
    }

    boolean setChildImportantForAccessibilityInternal(C c11, int i11) {
        if (isComputingLayout()) {
            c11.mPendingAccessibilityState = i11;
            this.mPendingAccessibilityImportanceChange.add(c11);
            return false;
        }
        View view = c11.itemView;
        int i12 = Y.f42258g;
        view.setImportantForAccessibility(i11);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z11) {
        if (z11 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z11;
        super.setClipToPadding(z11);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull k kVar) {
        kVar.getClass();
        this.mEdgeEffectFactory = kVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z11) {
        this.mHasFixedSize = z11;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.mItemAnimator;
        if (lVar2 != null) {
            lVar2.endAnimations();
            this.mItemAnimator.setListener(null);
        }
        this.mItemAnimator = lVar;
        if (lVar != null) {
            lVar.setListener(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i11) {
        this.mRecycler.n(i11);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z11) {
        suppressLayout(z11);
    }

    public void setLayoutManager(o oVar) {
        RecyclerView recyclerView;
        if (oVar == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            l lVar = this.mItemAnimator;
            if (lVar != null) {
                lVar.endAnimations();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.c();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            this.mRecycler.c();
        }
        C5472f c5472f = this.mChildHelper;
        c5472f.f44868b.g();
        ArrayList arrayList = c5472f.f44869c;
        int size = arrayList.size();
        while (true) {
            size--;
            recyclerView = RecyclerView.this;
            if (size < 0) {
                break;
            }
            C childViewHolderInt = getChildViewHolderInt((View) arrayList.get(size));
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.mLayout = oVar;
        if (oVar != null) {
            if (oVar.mRecyclerView != null) {
                throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.mRecyclerView.exceptionLabel());
            }
            oVar.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.r();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z11) {
        getScrollingChildHelper().j(z11);
    }

    public void setOnFlingListener(r rVar) {
        this.mOnFlingListener = rVar;
    }

    public void setRecycledViewPool(u uVar) {
        v vVar = this.mRecycler;
        u uVar2 = vVar.f44761g;
        if (uVar2 != null) {
            uVar2.detach();
        }
        vVar.f44761g = uVar;
        if (uVar == null || RecyclerView.this.getAdapter() == null) {
            return;
        }
        vVar.f44761g.attach();
    }

    void setScrollState(int i11) {
        if (i11 == this.mScrollState) {
            return;
        }
        this.mScrollState = i11;
        if (i11 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i11);
    }

    public void setScrollingTouchSlop(int i11) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i11 != 0) {
            if (i11 == 1) {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i11 + "; using default value");
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
        this.mEatenAccessibilityChangeFlags |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        return true;
    }

    public void smoothScrollBy(int i11, int i12) {
        smoothScrollBy(i11, i12, null);
    }

    public void smoothScrollToPosition(int i11) {
        if (this.mLayoutSuppressed) {
            return;
        }
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.smoothScrollToPosition(this, this.mState, i11);
        }
    }

    void startInterceptRequestLayout() {
        int i11 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i11;
        if (i11 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i11) {
        return getScrollingChildHelper().k(i11, 0);
    }

    void stopInterceptRequestLayout(boolean z11) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z11 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z11 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().l(0);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z11) {
        if (z11 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z11) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(g gVar, boolean z11) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, true, z11);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    void viewRangeUpdate(int i11, int i12, Object obj) {
        int i13;
        int i14;
        int h11 = this.mChildHelper.h();
        int i15 = i12 + i11;
        for (int i16 = 0; i16 < h11; i16++) {
            View g10 = this.mChildHelper.g(i16);
            C childViewHolderInt = getChildViewHolderInt(g10);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i14 = childViewHolderInt.mPosition) >= i11 && i14 < i15) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((p) g10.getLayoutParams()).f44749c = true;
            }
        }
        v vVar = this.mRecycler;
        ArrayList<C> arrayList = vVar.f44757c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C c11 = arrayList.get(size);
            if (c11 != null && (i13 = c11.mPosition) >= i11 && i13 < i15) {
                c11.addFlags(2);
                vVar.j(size);
            }
        }
    }

    public static abstract class g<VH extends C> {
        private final h mObservable = new h();
        private boolean mHasStableIds = false;

        public final void bindViewHolder(@NonNull VH vh2, int i11) {
            vh2.mPosition = i11;
            if (hasStableIds()) {
                vh2.mItemId = getItemId(i11);
            }
            vh2.setFlags(1, 519);
            onBindViewHolder(vh2, i11, vh2.getUnmodifiedPayloads());
            vh2.clearPayload();
            ViewGroup.LayoutParams layoutParams = vh2.itemView.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).f44749c = true;
            }
        }

        @NonNull
        public final VH createViewHolder(@NonNull ViewGroup viewGroup, int i11) {
            VH onCreateViewHolder = onCreateViewHolder(viewGroup, i11);
            if (onCreateViewHolder.itemView.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            onCreateViewHolder.mItemViewType = i11;
            return onCreateViewHolder;
        }

        public abstract int getItemCount();

        public long getItemId(int i11) {
            return -1L;
        }

        public int getItemViewType(int i11) {
            return 0;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i11) {
            this.mObservable.d(i11, 1, null);
        }

        public final void notifyItemInserted(int i11) {
            this.mObservable.e(i11, 1);
        }

        public final void notifyItemMoved(int i11, int i12) {
            this.mObservable.c(i11, i12);
        }

        public final void notifyItemRangeChanged(int i11, int i12) {
            this.mObservable.d(i11, i12, null);
        }

        public final void notifyItemRangeInserted(int i11, int i12) {
            this.mObservable.e(i11, i12);
        }

        public final void notifyItemRangeRemoved(int i11, int i12) {
            this.mObservable.f(i11, i12);
        }

        public final void notifyItemRemoved(int i11) {
            this.mObservable.f(i11, 1);
        }

        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(@NonNull VH vh2, int i11);

        public void onBindViewHolder(@NonNull VH vh2, int i11, @NonNull List<Object> list) {
            onBindViewHolder(vh2, i11);
        }

        @NonNull
        public abstract VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i11);

        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(@NonNull VH vh2) {
            return false;
        }

        public void onViewAttachedToWindow(@NonNull VH vh2) {
        }

        public void onViewDetachedFromWindow(@NonNull VH vh2) {
        }

        public void onViewRecycled(@NonNull VH vh2) {
        }

        public void registerAdapterDataObserver(@NonNull i iVar) {
            this.mObservable.registerObserver(iVar);
        }

        public void setHasStableIds(boolean z11) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z11;
        }

        public void unregisterAdapterDataObserver(@NonNull i iVar) {
            this.mObservable.unregisterObserver(iVar);
        }

        public final void notifyItemChanged(int i11, Object obj) {
            this.mObservable.d(i11, 1, obj);
        }

        public final void notifyItemRangeChanged(int i11, int i12, Object obj) {
            this.mObservable.d(i11, i12, obj);
        }
    }

    public RecyclerView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ru.ozon.app.android.R.attr.recyclerViewStyle);
    }

    public final void dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr, int i15, @NonNull int[] iArr2) {
        getScrollingChildHelper().d(i11, i12, i13, i14, iArr, i15, iArr2);
    }

    void onExitLayoutOrScroll(boolean z11) {
        int i11 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i11;
        if (i11 < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z11) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i11, int i12, Interpolator interpolator) {
        smoothScrollBy(i11, i12, interpolator, LinearLayoutManager.INVALID_OFFSET);
    }

    public RecyclerView(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mObserver = new w();
        this.mRecycler = new v();
        this.mViewInfoStore = new F();
        this.mUpdateChildViewsRunnable = new RunnableC5464a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new k();
        this.mItemAnimator = new androidx.recyclerview.widget.h();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new B();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new l.b() : null;
        this.mState = new A();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new m();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new RunnableC5465b();
        this.mViewInfoProcessCallback = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = C5306a0.a(viewConfiguration);
        this.mScaledVerticalScrollFactor = C5306a0.b(viewConfiguration);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.setListener(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        int i12 = Y.f42258g;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.A(this));
        int[] iArr = I4.a.f11972a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i11, 0);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i11, 0);
        }
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(1, true);
        boolean z11 = obtainStyledAttributes.getBoolean(3, false);
        this.mEnableFastScroller = z11;
        if (z11) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(6), obtainStyledAttributes.getDrawable(7), (StateListDrawable) obtainStyledAttributes.getDrawable(4), obtainStyledAttributes.getDrawable(5));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i11, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i11, 0);
        if (i13 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i11, 0);
        }
        boolean z12 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z12);
    }

    public boolean dispatchNestedPreScroll(int i11, int i12, int[] iArr, int[] iArr2, int i13) {
        return getScrollingChildHelper().c(i11, i12, iArr, iArr2, i13);
    }

    public void smoothScrollBy(int i11, int i12, Interpolator interpolator, int i13) {
        smoothScrollBy(i11, i12, interpolator, i13, false);
    }

    public boolean startNestedScroll(int i11, int i12) {
        return getScrollingChildHelper().k(i11, i12);
    }

    public void stopNestedScroll(int i11) {
        getScrollingChildHelper().l(i11);
    }

    public static class p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        C f44747a;

        /* renamed from: b, reason: collision with root package name */
        final Rect f44748b;

        /* renamed from: c, reason: collision with root package name */
        boolean f44749c;

        /* renamed from: d, reason: collision with root package name */
        boolean f44750d;

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f44748b = new Rect();
            this.f44749c = true;
            this.f44750d = false;
        }

        public final int a() {
            return this.f44747a.getAdapterPosition();
        }

        public final boolean b() {
            return this.f44747a.isRemoved();
        }

        public p(int i11, int i12) {
            super(i11, i12);
            this.f44748b = new Rect();
            this.f44749c = true;
            this.f44750d = false;
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f44748b = new Rect();
            this.f44749c = true;
            this.f44750d = false;
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f44748b = new Rect();
            this.f44749c = true;
            this.f44750d = false;
        }

        public p(p pVar) {
            super((ViewGroup.LayoutParams) pVar);
            this.f44748b = new Rect();
            this.f44749c = true;
            this.f44750d = false;
        }
    }

    public static class x extends O2.a {
        public static final Parcelable.Creator<x> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        Parcelable f44764c;

        static class a implements Parcelable.ClassLoaderCreator<x> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final x createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new x(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i11) {
                return new x[i11];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new x(parcel, null);
            }
        }

        x(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f44764c = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        @Override // O2.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeParcelable(this.f44764c, 0);
        }

        x(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    void smoothScrollBy(int i11, int i12, Interpolator interpolator, int i13, boolean z11) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!oVar.canScrollHorizontally()) {
            i11 = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i12 = 0;
        }
        if (i11 == 0 && i12 == 0) {
            return;
        }
        if (i13 != Integer.MIN_VALUE && i13 <= 0) {
            scrollBy(i11, i12);
            return;
        }
        if (z11) {
            int i14 = i11 != 0 ? 1 : 0;
            if (i12 != 0) {
                i14 |= 2;
            }
            startNestedScroll(i14, 1);
        }
        this.mViewFlinger.c(i11, i12, interpolator, i13);
    }

    public void addItemDecoration(@NonNull n nVar) {
        addItemDecoration(nVar, -1);
    }
}
