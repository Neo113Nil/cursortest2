package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
public class ItemTouchHelper extends androidx.recyclerview.widget.RecyclerView.ItemDecoration implements androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener {
    public static final int ACTION_STATE_DRAG = 2;
    public static final int ACTION_STATE_IDLE = 0;
    public static final int ACTION_STATE_SWIPE = 1;
    public static final int ANIMATION_TYPE_DRAG = 8;
    public static final int ANIMATION_TYPE_SWIPE_CANCEL = 4;
    public static final int ANIMATION_TYPE_SWIPE_SUCCESS = 2;
    public static final int DOWN = 2;
    public static final int END = 32;
    public static final int LEFT = 4;
    public static final int RIGHT = 8;
    public static final int START = 16;
    public static final int UP = 1;
    private float ArtificialStackFrames;
    long Camera2StreamConfigurationMap;
    android.view.VelocityTracker CoroutineDebuggingKt;
    private java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> _BOUNDARY;
    private java.util.List<java.lang.Integer> accessartificialFrame;
    private float b;
    private androidx.recyclerview.widget.ItemTouchHelper.ItemTouchHelperGestureListener coroutineCreation;
    private int getARTIFICIAL_FRAME_PACKAGE_NAME;
    androidx.recyclerview.widget.ItemTouchHelper.Callback getHighResolutionOutputSizeshNQ4ISI;
    float getHighSpeedVideoFpsRanges;
    float getInputFormats;
    androidx.core.view.GestureDetectorCompat getInputSizeshNQ4ISI;
    float getOutputFormats;
    float getOutputMinFrameDuration;
    androidx.recyclerview.widget.RecyclerView getOutputSizeshNQ4ISI;
    int getValidOutputFormatsForInputhNQ4ISI;
    float isOutputSupportedFor;
    android.graphics.Rect isOutputSupportedForhNQ4ISI;
    float toString;
    final java.util.List<android.view.View> getOutputStallDurationlomOqCM = new java.util.ArrayList();

    /* renamed from: a, reason: collision with root package name */
    private final float[] f2750a = new float[2];
    androidx.recyclerview.widget.RecyclerView.ViewHolder unwrapAs = null;
    int getHighSpeedVideoFpsRangesFor = -1;
    private int coroutineBoundary = 0;
    java.util.List<androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation> getOutputSizes = new java.util.ArrayList();
    final java.lang.Runnable getOutputStallDuration = new java.lang.Runnable() { // from class: androidx.recyclerview.widget.ItemTouchHelper.1
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00c9, code lost:
        
            if (r2 <= 0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0082, code lost:
        
            if (r12 <= 0) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0107 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            int i;
            int i2;
            int i3;
            if (androidx.recyclerview.widget.ItemTouchHelper.this.unwrapAs != null) {
                androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper = androidx.recyclerview.widget.ItemTouchHelper.this;
                if (itemTouchHelper.unwrapAs == null) {
                    itemTouchHelper.Camera2StreamConfigurationMap = Long.MIN_VALUE;
                    return;
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long j = itemTouchHelper.Camera2StreamConfigurationMap;
                long j2 = j == Long.MIN_VALUE ? 0L : currentTimeMillis - j;
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = itemTouchHelper.getOutputSizeshNQ4ISI.getLayoutManager();
                if (itemTouchHelper.isOutputSupportedForhNQ4ISI == null) {
                    itemTouchHelper.isOutputSupportedForhNQ4ISI = new android.graphics.Rect();
                }
                layoutManager.calculateItemDecorationsForChild(itemTouchHelper.unwrapAs.itemView, itemTouchHelper.isOutputSupportedForhNQ4ISI);
                if (layoutManager.canScrollHorizontally()) {
                    int i4 = (int) (itemTouchHelper.isOutputSupportedFor + itemTouchHelper.getHighSpeedVideoFpsRanges);
                    i = (i4 - itemTouchHelper.isOutputSupportedForhNQ4ISI.left) - itemTouchHelper.getOutputSizeshNQ4ISI.getPaddingLeft();
                    float f = itemTouchHelper.getHighSpeedVideoFpsRanges;
                    if (f >= 0.0f || i >= 0) {
                        if (f > 0.0f) {
                            i = ((i4 + itemTouchHelper.unwrapAs.itemView.getWidth()) + itemTouchHelper.isOutputSupportedForhNQ4ISI.right) - (itemTouchHelper.getOutputSizeshNQ4ISI.getWidth() - itemTouchHelper.getOutputSizeshNQ4ISI.getPaddingRight());
                        }
                    }
                    if (layoutManager.canScrollVertically()) {
                        int i5 = (int) (itemTouchHelper.toString + itemTouchHelper.getOutputMinFrameDuration);
                        int paddingTop = (i5 - itemTouchHelper.isOutputSupportedForhNQ4ISI.top) - itemTouchHelper.getOutputSizeshNQ4ISI.getPaddingTop();
                        float f2 = itemTouchHelper.getOutputMinFrameDuration;
                        if (f2 < 0.0f && paddingTop < 0) {
                            i2 = paddingTop;
                        } else if (f2 > 0.0f) {
                            i2 = ((i5 + itemTouchHelper.unwrapAs.itemView.getHeight()) + itemTouchHelper.isOutputSupportedForhNQ4ISI.bottom) - (itemTouchHelper.getOutputSizeshNQ4ISI.getHeight() - itemTouchHelper.getOutputSizeshNQ4ISI.getPaddingBottom());
                        }
                        if (i != 0) {
                            i = itemTouchHelper.getHighResolutionOutputSizeshNQ4ISI.interpolateOutOfBoundsScroll(itemTouchHelper.getOutputSizeshNQ4ISI, itemTouchHelper.unwrapAs.itemView.getWidth(), i, itemTouchHelper.getOutputSizeshNQ4ISI.getWidth(), j2);
                        }
                        int i6 = i;
                        if (i2 != 0) {
                            i3 = i6;
                            i2 = itemTouchHelper.getHighResolutionOutputSizeshNQ4ISI.interpolateOutOfBoundsScroll(itemTouchHelper.getOutputSizeshNQ4ISI, itemTouchHelper.unwrapAs.itemView.getHeight(), i2, itemTouchHelper.getOutputSizeshNQ4ISI.getHeight(), j2);
                        } else {
                            i3 = i6;
                        }
                        if (i3 == 0 || i2 != 0) {
                            if (itemTouchHelper.Camera2StreamConfigurationMap == Long.MIN_VALUE) {
                                itemTouchHelper.Camera2StreamConfigurationMap = currentTimeMillis;
                            }
                            itemTouchHelper.getOutputSizeshNQ4ISI.scrollBy(i3, i2);
                            if (androidx.recyclerview.widget.ItemTouchHelper.this.unwrapAs != null) {
                                androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper2 = androidx.recyclerview.widget.ItemTouchHelper.this;
                                itemTouchHelper2.getHighResolutionOutputSizeshNQ4ISI(itemTouchHelper2.unwrapAs);
                            }
                            androidx.recyclerview.widget.ItemTouchHelper.this.getOutputSizeshNQ4ISI.removeCallbacks(androidx.recyclerview.widget.ItemTouchHelper.this.getOutputStallDuration);
                            androidx.core.view.ViewCompat.postOnAnimation(androidx.recyclerview.widget.ItemTouchHelper.this.getOutputSizeshNQ4ISI, this);
                        }
                        itemTouchHelper.Camera2StreamConfigurationMap = Long.MIN_VALUE;
                        return;
                    }
                    i2 = 0;
                    if (i != 0) {
                    }
                    int i62 = i;
                    if (i2 != 0) {
                    }
                    if (i3 == 0) {
                    }
                    if (itemTouchHelper.Camera2StreamConfigurationMap == Long.MIN_VALUE) {
                    }
                    itemTouchHelper.getOutputSizeshNQ4ISI.scrollBy(i3, i2);
                    if (androidx.recyclerview.widget.ItemTouchHelper.this.unwrapAs != null) {
                    }
                    androidx.recyclerview.widget.ItemTouchHelper.this.getOutputSizeshNQ4ISI.removeCallbacks(androidx.recyclerview.widget.ItemTouchHelper.this.getOutputStallDuration);
                    androidx.core.view.ViewCompat.postOnAnimation(androidx.recyclerview.widget.ItemTouchHelper.this.getOutputSizeshNQ4ISI, this);
                }
                i = 0;
                if (layoutManager.canScrollVertically()) {
                }
                i2 = 0;
                if (i != 0) {
                }
                int i622 = i;
                if (i2 != 0) {
                }
                if (i3 == 0) {
                }
                if (itemTouchHelper.Camera2StreamConfigurationMap == Long.MIN_VALUE) {
                }
                itemTouchHelper.getOutputSizeshNQ4ISI.scrollBy(i3, i2);
                if (androidx.recyclerview.widget.ItemTouchHelper.this.unwrapAs != null) {
                }
                androidx.recyclerview.widget.ItemTouchHelper.this.getOutputSizeshNQ4ISI.removeCallbacks(androidx.recyclerview.widget.ItemTouchHelper.this.getOutputStallDuration);
                androidx.core.view.ViewCompat.postOnAnimation(androidx.recyclerview.widget.ItemTouchHelper.this.getOutputSizeshNQ4ISI, this);
            }
        }
    };
    androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback getHighSpeedVideoSizes = null;
    android.view.View getHighSpeedVideoSizesFor = null;
    int getOutputMinFrameDurationlomOqCM = -1;
    private final androidx.recyclerview.widget.RecyclerView.OnItemTouchListener _CREATION = new androidx.recyclerview.widget.RecyclerView.OnItemTouchListener() { // from class: androidx.recyclerview.widget.ItemTouchHelper.2
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
            int findPointerIndex;
            androidx.recyclerview.widget.ItemTouchHelper.this.getInputSizeshNQ4ISI.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation recoverAnimation = null;
            if (actionMasked == 0) {
                androidx.recyclerview.widget.ItemTouchHelper.this.getHighSpeedVideoFpsRangesFor = motionEvent.getPointerId(0);
                androidx.recyclerview.widget.ItemTouchHelper.this.getInputFormats = motionEvent.getX();
                androidx.recyclerview.widget.ItemTouchHelper.this.getOutputFormats = motionEvent.getY();
                androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper = androidx.recyclerview.widget.ItemTouchHelper.this;
                android.view.VelocityTracker velocityTracker = itemTouchHelper.CoroutineDebuggingKt;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                itemTouchHelper.CoroutineDebuggingKt = android.view.VelocityTracker.obtain();
                if (androidx.recyclerview.widget.ItemTouchHelper.this.unwrapAs == null) {
                    androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper2 = androidx.recyclerview.widget.ItemTouchHelper.this;
                    if (!itemTouchHelper2.getOutputSizes.isEmpty()) {
                        android.view.View highSpeedVideoFpsRangesFor = itemTouchHelper2.getHighSpeedVideoFpsRangesFor(motionEvent);
                        int size = itemTouchHelper2.getOutputSizes.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation recoverAnimation2 = itemTouchHelper2.getOutputSizes.get(size);
                            if (recoverAnimation2.getOutputMinFrameDurationlomOqCM.itemView == highSpeedVideoFpsRangesFor) {
                                recoverAnimation = recoverAnimation2;
                                break;
                            }
                            size--;
                        }
                    }
                    if (recoverAnimation != null) {
                        androidx.recyclerview.widget.ItemTouchHelper.this.getInputFormats -= recoverAnimation.isOutputSupportedFor;
                        androidx.recyclerview.widget.ItemTouchHelper.this.getOutputFormats -= recoverAnimation.unwrapAs;
                        androidx.recyclerview.widget.ItemTouchHelper.this.Camera2StreamConfigurationMap(recoverAnimation.getOutputMinFrameDurationlomOqCM, true);
                        if (androidx.recyclerview.widget.ItemTouchHelper.this.getOutputStallDurationlomOqCM.remove(recoverAnimation.getOutputMinFrameDurationlomOqCM.itemView)) {
                            androidx.recyclerview.widget.ItemTouchHelper.this.getHighResolutionOutputSizeshNQ4ISI.clearView(androidx.recyclerview.widget.ItemTouchHelper.this.getOutputSizeshNQ4ISI, recoverAnimation.getOutputMinFrameDurationlomOqCM);
                        }
                        androidx.recyclerview.widget.ItemTouchHelper.this.getHighResolutionOutputSizeshNQ4ISI(recoverAnimation.getOutputMinFrameDurationlomOqCM, recoverAnimation.getHighResolutionOutputSizeshNQ4ISI);
                        androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper3 = androidx.recyclerview.widget.ItemTouchHelper.this;
                        itemTouchHelper3.getHighSpeedVideoSizes(motionEvent, itemTouchHelper3.getValidOutputFormatsForInputhNQ4ISI, 0);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                androidx.recyclerview.widget.ItemTouchHelper.this.getHighSpeedVideoFpsRangesFor = -1;
                androidx.recyclerview.widget.ItemTouchHelper.this.getHighResolutionOutputSizeshNQ4ISI(null, 0);
            } else if (androidx.recyclerview.widget.ItemTouchHelper.this.getHighSpeedVideoFpsRangesFor != -1 && (findPointerIndex = motionEvent.findPointerIndex(androidx.recyclerview.widget.ItemTouchHelper.this.getHighSpeedVideoFpsRangesFor)) >= 0) {
                androidx.recyclerview.widget.ItemTouchHelper.this.getHighResolutionOutputSizeshNQ4ISI(actionMasked, motionEvent, findPointerIndex);
            }
            if (androidx.recyclerview.widget.ItemTouchHelper.this.CoroutineDebuggingKt != null) {
                androidx.recyclerview.widget.ItemTouchHelper.this.CoroutineDebuggingKt.addMovement(motionEvent);
            }
            return androidx.recyclerview.widget.ItemTouchHelper.this.unwrapAs != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
            androidx.recyclerview.widget.ItemTouchHelper.this.getInputSizeshNQ4ISI.onTouchEvent(motionEvent);
            if (androidx.recyclerview.widget.ItemTouchHelper.this.CoroutineDebuggingKt != null) {
                androidx.recyclerview.widget.ItemTouchHelper.this.CoroutineDebuggingKt.addMovement(motionEvent);
            }
            if (androidx.recyclerview.widget.ItemTouchHelper.this.getHighSpeedVideoFpsRangesFor != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(androidx.recyclerview.widget.ItemTouchHelper.this.getHighSpeedVideoFpsRangesFor);
                if (findPointerIndex >= 0) {
                    androidx.recyclerview.widget.ItemTouchHelper.this.getHighResolutionOutputSizeshNQ4ISI(actionMasked, motionEvent, findPointerIndex);
                }
                androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = androidx.recyclerview.widget.ItemTouchHelper.this.unwrapAs;
                if (viewHolder != null) {
                    if (actionMasked != 1) {
                        if (actionMasked == 2) {
                            if (findPointerIndex >= 0) {
                                androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper = androidx.recyclerview.widget.ItemTouchHelper.this;
                                itemTouchHelper.getHighSpeedVideoSizes(motionEvent, itemTouchHelper.getValidOutputFormatsForInputhNQ4ISI, findPointerIndex);
                                androidx.recyclerview.widget.ItemTouchHelper.this.getHighResolutionOutputSizeshNQ4ISI(viewHolder);
                                androidx.recyclerview.widget.ItemTouchHelper.this.getOutputSizeshNQ4ISI.removeCallbacks(androidx.recyclerview.widget.ItemTouchHelper.this.getOutputStallDuration);
                                androidx.recyclerview.widget.ItemTouchHelper.this.getOutputStallDuration.run();
                                androidx.recyclerview.widget.ItemTouchHelper.this.getOutputSizeshNQ4ISI.invalidate();
                                return;
                            }
                            return;
                        }
                        if (actionMasked != 3) {
                            if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == androidx.recyclerview.widget.ItemTouchHelper.this.getHighSpeedVideoFpsRangesFor) {
                                    androidx.recyclerview.widget.ItemTouchHelper.this.getHighSpeedVideoFpsRangesFor = motionEvent.getPointerId(actionIndex != 0 ? 0 : 1);
                                    androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper2 = androidx.recyclerview.widget.ItemTouchHelper.this;
                                    itemTouchHelper2.getHighSpeedVideoSizes(motionEvent, itemTouchHelper2.getValidOutputFormatsForInputhNQ4ISI, actionIndex);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (androidx.recyclerview.widget.ItemTouchHelper.this.CoroutineDebuggingKt != null) {
                            androidx.recyclerview.widget.ItemTouchHelper.this.CoroutineDebuggingKt.clear();
                        }
                    }
                    androidx.recyclerview.widget.ItemTouchHelper.this.getHighResolutionOutputSizeshNQ4ISI(null, 0);
                    androidx.recyclerview.widget.ItemTouchHelper.this.getHighSpeedVideoFpsRangesFor = -1;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z) {
            if (z) {
                androidx.recyclerview.widget.ItemTouchHelper.this.getHighResolutionOutputSizeshNQ4ISI(null, 0);
            }
        }
    };

    public interface ViewDropHandler {
        void prepareForDrop(android.view.View view, android.view.View view2, int i, int i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewAttachedToWindow(android.view.View view) {
    }

    public ItemTouchHelper(androidx.recyclerview.widget.ItemTouchHelper.Callback callback) {
        this.getHighResolutionOutputSizeshNQ4ISI = callback;
    }

    private static boolean getHighSpeedVideoSizes(android.view.View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    public void attachToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.getOutputSizeshNQ4ISI;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeItemDecoration(this);
                this.getOutputSizeshNQ4ISI.removeOnItemTouchListener(this._CREATION);
                this.getOutputSizeshNQ4ISI.removeOnChildAttachStateChangeListener(this);
                int size = this.getOutputSizes.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation recoverAnimation = this.getOutputSizes.get(0);
                    recoverAnimation.getOutputSizeshNQ4ISI.cancel();
                    this.getHighResolutionOutputSizeshNQ4ISI.clearView(this.getOutputSizeshNQ4ISI, recoverAnimation.getOutputMinFrameDurationlomOqCM);
                }
                this.getOutputSizes.clear();
                this.getHighSpeedVideoSizesFor = null;
                this.getOutputMinFrameDurationlomOqCM = -1;
                android.view.VelocityTracker velocityTracker = this.CoroutineDebuggingKt;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.CoroutineDebuggingKt = null;
                }
                androidx.recyclerview.widget.ItemTouchHelper.ItemTouchHelperGestureListener itemTouchHelperGestureListener = this.coroutineCreation;
                if (itemTouchHelperGestureListener != null) {
                    itemTouchHelperGestureListener.getHighSpeedVideoFpsRangesFor = false;
                    this.coroutineCreation = null;
                }
                if (this.getInputSizeshNQ4ISI != null) {
                    this.getInputSizeshNQ4ISI = null;
                }
            }
            this.getOutputSizeshNQ4ISI = recyclerView;
            if (recyclerView != null) {
                android.content.res.Resources resources = recyclerView.getResources();
                this.b = resources.getDimension(androidx.recyclerview.R.dimen.item_touch_helper_swipe_escape_velocity);
                this.ArtificialStackFrames = resources.getDimension(androidx.recyclerview.R.dimen.item_touch_helper_swipe_escape_max_velocity);
                this.getARTIFICIAL_FRAME_PACKAGE_NAME = android.view.ViewConfiguration.get(this.getOutputSizeshNQ4ISI.getContext()).getScaledTouchSlop();
                this.getOutputSizeshNQ4ISI.addItemDecoration(this);
                this.getOutputSizeshNQ4ISI.addOnItemTouchListener(this._CREATION);
                this.getOutputSizeshNQ4ISI.addOnChildAttachStateChangeListener(this);
                this.coroutineCreation = new androidx.recyclerview.widget.ItemTouchHelper.ItemTouchHelperGestureListener();
                this.getInputSizeshNQ4ISI = new androidx.core.view.GestureDetectorCompat(this.getOutputSizeshNQ4ISI.getContext(), this.coroutineCreation);
            }
        }
    }

    private void getHighSpeedVideoFpsRanges(float[] fArr) {
        if ((this.getValidOutputFormatsForInputhNQ4ISI & 12) != 0) {
            fArr[0] = (this.isOutputSupportedFor + this.getHighSpeedVideoFpsRanges) - this.unwrapAs.itemView.getLeft();
        } else {
            fArr[0] = this.unwrapAs.itemView.getTranslationX();
        }
        if ((this.getValidOutputFormatsForInputhNQ4ISI & 3) != 0) {
            fArr[1] = (this.toString + this.getOutputMinFrameDuration) - this.unwrapAs.itemView.getTop();
        } else {
            fArr[1] = this.unwrapAs.itemView.getTranslationY();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
        float f;
        float f2;
        if (this.unwrapAs != null) {
            getHighSpeedVideoFpsRanges(this.f2750a);
            float[] fArr = this.f2750a;
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        androidx.recyclerview.widget.ItemTouchHelper.Callback callback = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = this.unwrapAs;
        java.util.List<androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation> list = this.getOutputSizes;
        int i = this.coroutineBoundary;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation recoverAnimation = list.get(i2);
            int save = canvas.save();
            callback.onChildDrawOver(canvas, recyclerView, recoverAnimation.getOutputMinFrameDurationlomOqCM, recoverAnimation.isOutputSupportedFor, recoverAnimation.unwrapAs, recoverAnimation.getHighResolutionOutputSizeshNQ4ISI, false);
            canvas.restoreToCount(save);
            i2++;
            list = list;
            i = i;
            size = size;
        }
        int i3 = size;
        int i4 = i;
        java.util.List<androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation> list2 = list;
        if (viewHolder != null) {
            int save2 = canvas.save();
            callback.onChildDrawOver(canvas, recyclerView, viewHolder, f, f2, i4, true);
            canvas.restoreToCount(save2);
        }
        boolean z = false;
        for (int i5 = i3 - 1; i5 >= 0; i5--) {
            androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation recoverAnimation2 = list2.get(i5);
            if (recoverAnimation2.getOutputFormats && !recoverAnimation2.getInputFormats) {
                list2.remove(i5);
            } else if (!recoverAnimation2.getOutputFormats) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
        float f;
        float f2;
        this.getOutputMinFrameDurationlomOqCM = -1;
        if (this.unwrapAs != null) {
            getHighSpeedVideoFpsRanges(this.f2750a);
            float[] fArr = this.f2750a;
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        androidx.recyclerview.widget.ItemTouchHelper.Callback callback = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = this.unwrapAs;
        java.util.List<androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation> list = this.getOutputSizes;
        int i = this.coroutineBoundary;
        int i2 = 0;
        for (int size = list.size(); i2 < size; size = size) {
            androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation recoverAnimation = list.get(i2);
            float f4 = recoverAnimation.getOutputMinFrameDuration;
            float f5 = recoverAnimation.getOutputStallDurationlomOqCM;
            if (f4 == f5) {
                recoverAnimation.isOutputSupportedFor = recoverAnimation.getOutputMinFrameDurationlomOqCM.itemView.getTranslationX();
            } else {
                recoverAnimation.isOutputSupportedFor = f4 + (recoverAnimation.getInputSizeshNQ4ISI * (f5 - f4));
            }
            float f6 = recoverAnimation.getOutputSizes;
            float f7 = recoverAnimation.getOutputStallDuration;
            if (f6 == f7) {
                recoverAnimation.unwrapAs = recoverAnimation.getOutputMinFrameDurationlomOqCM.itemView.getTranslationY();
            } else {
                recoverAnimation.unwrapAs = f6 + (recoverAnimation.getInputSizeshNQ4ISI * (f7 - f6));
            }
            int save = canvas.save();
            callback.onChildDraw(canvas, recyclerView, recoverAnimation.getOutputMinFrameDurationlomOqCM, recoverAnimation.isOutputSupportedFor, recoverAnimation.unwrapAs, recoverAnimation.getHighResolutionOutputSizeshNQ4ISI, false);
            canvas.restoreToCount(save);
            i2++;
        }
        if (viewHolder != null) {
            int save2 = canvas.save();
            callback.onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, true);
            canvas.restoreToCount(save2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void getHighResolutionOutputSizeshNQ4ISI(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        boolean z;
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2;
        float f;
        float signum;
        if (viewHolder == this.unwrapAs && i == this.coroutineBoundary) {
            return;
        }
        this.Camera2StreamConfigurationMap = Long.MIN_VALUE;
        int i3 = this.coroutineBoundary;
        Camera2StreamConfigurationMap(viewHolder, true);
        this.coroutineBoundary = i;
        if (i == 2) {
            if (viewHolder == null) {
                throw new java.lang.IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.getHighSpeedVideoSizesFor = viewHolder.itemView;
        }
        final androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder3 = this.unwrapAs;
        boolean z2 = false;
        if (viewHolder3 != null) {
            if (viewHolder3.itemView.getParent() != null) {
                int highSpeedVideoFpsRangesFor = i3 == 2 ? 0 : getHighSpeedVideoFpsRangesFor(viewHolder3);
                android.view.VelocityTracker velocityTracker = this.CoroutineDebuggingKt;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.CoroutineDebuggingKt = null;
                }
                if (highSpeedVideoFpsRangesFor == 1 || highSpeedVideoFpsRangesFor == 2) {
                    f = 0.0f;
                    signum = java.lang.Math.signum(this.getOutputMinFrameDuration) * this.getOutputSizeshNQ4ISI.getHeight();
                } else if (highSpeedVideoFpsRangesFor == 4 || highSpeedVideoFpsRangesFor == 8 || highSpeedVideoFpsRangesFor == 16 || highSpeedVideoFpsRangesFor == 32) {
                    signum = 0.0f;
                    f = java.lang.Math.signum(this.getHighSpeedVideoFpsRanges) * this.getOutputSizeshNQ4ISI.getWidth();
                } else {
                    f = 0.0f;
                    signum = 0.0f;
                }
                int i4 = i3 == 2 ? 8 : highSpeedVideoFpsRangesFor > 0 ? 2 : 4;
                getHighSpeedVideoFpsRanges(this.f2750a);
                float[] fArr = this.f2750a;
                float f2 = fArr[0];
                float f3 = fArr[1];
                final int i5 = highSpeedVideoFpsRangesFor;
                i2 = 0;
                androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation recoverAnimation = new androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation(viewHolder3, i4, i3, f2, f3, f, signum) { // from class: androidx.recyclerview.widget.ItemTouchHelper.3
                    @Override // androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(android.animation.Animator animator) {
                        super.onAnimationEnd(animator);
                        if (this.getHighSpeedVideoSizesFor) {
                            return;
                        }
                        if (i5 <= 0) {
                            androidx.recyclerview.widget.ItemTouchHelper.this.getHighResolutionOutputSizeshNQ4ISI.clearView(androidx.recyclerview.widget.ItemTouchHelper.this.getOutputSizeshNQ4ISI, viewHolder3);
                        } else {
                            androidx.recyclerview.widget.ItemTouchHelper.this.getOutputStallDurationlomOqCM.add(viewHolder3.itemView);
                            this.getInputFormats = true;
                            final int i6 = i5;
                            if (i6 > 0) {
                                final androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper = androidx.recyclerview.widget.ItemTouchHelper.this;
                                itemTouchHelper.getOutputSizeshNQ4ISI.post(new java.lang.Runnable() { // from class: androidx.recyclerview.widget.ItemTouchHelper.4
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        if (androidx.recyclerview.widget.ItemTouchHelper.this.getOutputSizeshNQ4ISI == null || !androidx.recyclerview.widget.ItemTouchHelper.this.getOutputSizeshNQ4ISI.isAttachedToWindow() || this.getHighSpeedVideoSizesFor || this.getOutputMinFrameDurationlomOqCM.getAbsoluteAdapterPosition() == -1) {
                                            return;
                                        }
                                        androidx.recyclerview.widget.RecyclerView.ItemAnimator itemAnimator = androidx.recyclerview.widget.ItemTouchHelper.this.getOutputSizeshNQ4ISI.getItemAnimator();
                                        if (itemAnimator == null || !itemAnimator.isRunning(null)) {
                                            androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper2 = androidx.recyclerview.widget.ItemTouchHelper.this;
                                            int size = itemTouchHelper2.getOutputSizes.size();
                                            for (int i7 = 0; i7 < size; i7++) {
                                                if (itemTouchHelper2.getOutputSizes.get(i7).getOutputFormats) {
                                                }
                                            }
                                            androidx.recyclerview.widget.ItemTouchHelper.this.getHighResolutionOutputSizeshNQ4ISI.onSwiped(this.getOutputMinFrameDurationlomOqCM, i6);
                                            return;
                                        }
                                        androidx.recyclerview.widget.ItemTouchHelper.this.getOutputSizeshNQ4ISI.post(this);
                                    }
                                });
                            }
                        }
                        if (androidx.recyclerview.widget.ItemTouchHelper.this.getHighSpeedVideoSizesFor == viewHolder3.itemView) {
                            androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper2 = androidx.recyclerview.widget.ItemTouchHelper.this;
                            if (viewHolder3.itemView == itemTouchHelper2.getHighSpeedVideoSizesFor) {
                                itemTouchHelper2.getHighSpeedVideoSizesFor = null;
                                if (itemTouchHelper2.getHighSpeedVideoSizes != null) {
                                    itemTouchHelper2.getOutputSizeshNQ4ISI.setChildDrawingOrderCallback(null);
                                }
                            }
                        }
                    }
                };
                recoverAnimation.getOutputSizeshNQ4ISI.setDuration(this.getHighResolutionOutputSizeshNQ4ISI.getAnimationDuration(this.getOutputSizeshNQ4ISI, i4, f - f2, signum - f3));
                this.getOutputSizes.add(recoverAnimation);
                recoverAnimation.getOutputMinFrameDurationlomOqCM.setIsRecyclable(false);
                recoverAnimation.getOutputSizeshNQ4ISI.start();
                viewHolder2 = null;
                z2 = true;
            } else {
                i2 = 0;
                if (viewHolder3.itemView == this.getHighSpeedVideoSizesFor) {
                    viewHolder2 = null;
                    this.getHighSpeedVideoSizesFor = null;
                    if (this.getHighSpeedVideoSizes != null) {
                        this.getOutputSizeshNQ4ISI.setChildDrawingOrderCallback(null);
                    }
                } else {
                    viewHolder2 = null;
                }
                this.getHighResolutionOutputSizeshNQ4ISI.clearView(this.getOutputSizeshNQ4ISI, viewHolder3);
                z2 = false;
            }
            this.unwrapAs = viewHolder2;
        } else {
            i2 = 0;
        }
        if (viewHolder != null) {
            androidx.recyclerview.widget.ItemTouchHelper.Callback callback = this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.recyclerview.widget.RecyclerView recyclerView = this.getOutputSizeshNQ4ISI;
            z = true;
            this.getValidOutputFormatsForInputhNQ4ISI = (callback.convertToAbsoluteDirection(callback.getMovementFlags(recyclerView, viewHolder), androidx.core.view.ViewCompat.getLayoutDirection(recyclerView)) & ((1 << ((i * 8) + 8)) - 1)) >> (this.coroutineBoundary * 8);
            this.isOutputSupportedFor = viewHolder.itemView.getLeft();
            this.toString = viewHolder.itemView.getTop();
            this.unwrapAs = viewHolder;
            if (i == 2) {
                viewHolder.itemView.performHapticFeedback(i2);
            }
        } else {
            z = true;
        }
        android.view.ViewParent parent = this.getOutputSizeshNQ4ISI.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(this.unwrapAs != null ? z : i2);
        }
        if (!z2) {
            this.getOutputSizeshNQ4ISI.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        this.getHighResolutionOutputSizeshNQ4ISI.onSelectedChanged(this.unwrapAs, this.coroutineBoundary);
        this.getOutputSizeshNQ4ISI.invalidate();
    }

    final void getHighResolutionOutputSizeshNQ4ISI(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        int i;
        int i2;
        int i3;
        if (this.getOutputSizeshNQ4ISI.isLayoutRequested() || this.coroutineBoundary != 2) {
            return;
        }
        float moveThreshold = this.getHighResolutionOutputSizeshNQ4ISI.getMoveThreshold(viewHolder);
        int i4 = (int) (this.isOutputSupportedFor + this.getHighSpeedVideoFpsRanges);
        int i5 = (int) (this.toString + this.getOutputMinFrameDuration);
        if (java.lang.Math.abs(i5 - viewHolder.itemView.getTop()) >= viewHolder.itemView.getHeight() * moveThreshold || java.lang.Math.abs(i4 - viewHolder.itemView.getLeft()) >= viewHolder.itemView.getWidth() * moveThreshold) {
            java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> list = this._BOUNDARY;
            if (list == null) {
                this._BOUNDARY = new java.util.ArrayList();
                this.accessartificialFrame = new java.util.ArrayList();
            } else {
                list.clear();
                this.accessartificialFrame.clear();
            }
            int boundingBoxMargin = this.getHighResolutionOutputSizeshNQ4ISI.getBoundingBoxMargin();
            int round = java.lang.Math.round(this.isOutputSupportedFor + this.getHighSpeedVideoFpsRanges) - boundingBoxMargin;
            int round2 = java.lang.Math.round(this.toString + this.getOutputMinFrameDuration) - boundingBoxMargin;
            int i6 = boundingBoxMargin * 2;
            int width = viewHolder.itemView.getWidth() + round + i6;
            int height = viewHolder.itemView.getHeight() + round2 + i6;
            int i7 = (round + width) / 2;
            int i8 = (round2 + height) / 2;
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.getOutputSizeshNQ4ISI.getLayoutManager();
            int childCount = layoutManager.getChildCount();
            int i9 = 0;
            while (i9 < childCount) {
                android.view.View childAt = layoutManager.getChildAt(i9);
                if (childAt == viewHolder.itemView || childAt.getBottom() < round2 || childAt.getTop() > height || childAt.getRight() < round || childAt.getLeft() > width) {
                    i = i7;
                    i2 = round;
                    i3 = round2;
                } else {
                    androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolder = this.getOutputSizeshNQ4ISI.getChildViewHolder(childAt);
                    i2 = round;
                    i3 = round2;
                    if (this.getHighResolutionOutputSizeshNQ4ISI.canDropOver(this.getOutputSizeshNQ4ISI, this.unwrapAs, childViewHolder)) {
                        int abs = java.lang.Math.abs(i7 - ((childAt.getLeft() + childAt.getRight()) / 2));
                        int abs2 = java.lang.Math.abs(i8 - ((childAt.getTop() + childAt.getBottom()) / 2));
                        int i10 = (abs * abs) + (abs2 * abs2);
                        int size = this._BOUNDARY.size();
                        int i11 = 0;
                        int i12 = 0;
                        while (true) {
                            i = i7;
                            if (i12 >= size || i10 <= this.accessartificialFrame.get(i12).intValue()) {
                                break;
                            }
                            i11++;
                            i12++;
                            i7 = i;
                        }
                        this._BOUNDARY.add(i11, childViewHolder);
                        this.accessartificialFrame.add(i11, java.lang.Integer.valueOf(i10));
                    } else {
                        i = i7;
                    }
                }
                i9++;
                round = i2;
                round2 = i3;
                i7 = i;
            }
            java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> list2 = this._BOUNDARY;
            if (list2.size() != 0) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder chooseDropTarget = this.getHighResolutionOutputSizeshNQ4ISI.chooseDropTarget(viewHolder, list2, i4, i5);
                if (chooseDropTarget == null) {
                    this._BOUNDARY.clear();
                    this.accessartificialFrame.clear();
                    return;
                }
                int absoluteAdapterPosition = chooseDropTarget.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = viewHolder.getAbsoluteAdapterPosition();
                if (this.getHighResolutionOutputSizeshNQ4ISI.onMove(this.getOutputSizeshNQ4ISI, viewHolder, chooseDropTarget)) {
                    this.getHighResolutionOutputSizeshNQ4ISI.onMoved(this.getOutputSizeshNQ4ISI, viewHolder, absoluteAdapterPosition2, chooseDropTarget, absoluteAdapterPosition, i4, i5);
                }
            }
        }
    }

    final void Camera2StreamConfigurationMap(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, boolean z) {
        for (int size = this.getOutputSizes.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation recoverAnimation = this.getOutputSizes.get(size);
            if (recoverAnimation.getOutputMinFrameDurationlomOqCM == viewHolder) {
                recoverAnimation.getHighSpeedVideoSizesFor |= z;
                if (!recoverAnimation.getOutputFormats) {
                    recoverAnimation.getOutputSizeshNQ4ISI.cancel();
                }
                this.getOutputSizes.remove(size);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
        rect.setEmpty();
    }

    final void getHighResolutionOutputSizeshNQ4ISI(int i, android.view.MotionEvent motionEvent, int i2) {
        android.view.View highSpeedVideoFpsRangesFor;
        if (this.unwrapAs == null && i == 2 && this.coroutineBoundary != 2 && this.getHighResolutionOutputSizeshNQ4ISI.isItemViewSwipeEnabled() && this.getOutputSizeshNQ4ISI.getScrollState() != 1) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.getOutputSizeshNQ4ISI.getLayoutManager();
            int i3 = this.getHighSpeedVideoFpsRangesFor;
            androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = null;
            if (i3 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i3);
                float x = motionEvent.getX(findPointerIndex);
                float f = this.getInputFormats;
                float y = motionEvent.getY(findPointerIndex);
                float f2 = this.getOutputFormats;
                float abs = java.lang.Math.abs(x - f);
                float abs2 = java.lang.Math.abs(y - f2);
                float f3 = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
                if ((abs >= f3 || abs2 >= f3) && ((abs <= abs2 || !layoutManager.canScrollHorizontally()) && ((abs2 <= abs || !layoutManager.canScrollVertically()) && (highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(motionEvent)) != null))) {
                    viewHolder = this.getOutputSizeshNQ4ISI.getChildViewHolder(highSpeedVideoFpsRangesFor);
                }
            }
            if (viewHolder != null) {
                androidx.recyclerview.widget.ItemTouchHelper.Callback callback = this.getHighResolutionOutputSizeshNQ4ISI;
                androidx.recyclerview.widget.RecyclerView recyclerView = this.getOutputSizeshNQ4ISI;
                int convertToAbsoluteDirection = (callback.convertToAbsoluteDirection(callback.getMovementFlags(recyclerView, viewHolder), androidx.core.view.ViewCompat.getLayoutDirection(recyclerView)) & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                if (convertToAbsoluteDirection != 0) {
                    float x2 = motionEvent.getX(i2);
                    float y2 = motionEvent.getY(i2);
                    float f4 = x2 - this.getInputFormats;
                    float f5 = y2 - this.getOutputFormats;
                    float abs3 = java.lang.Math.abs(f4);
                    float abs4 = java.lang.Math.abs(f5);
                    float f6 = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
                    if (abs3 >= f6 || abs4 >= f6) {
                        if (abs3 > abs4) {
                            if (f4 < 0.0f && (convertToAbsoluteDirection & 4) == 0) {
                                return;
                            }
                            if (f4 > 0.0f && (convertToAbsoluteDirection & 8) == 0) {
                                return;
                            }
                        } else {
                            if (f5 < 0.0f && (convertToAbsoluteDirection & 1) == 0) {
                                return;
                            }
                            if (f5 > 0.0f && (convertToAbsoluteDirection & 2) == 0) {
                                return;
                            }
                        }
                        this.getOutputMinFrameDuration = 0.0f;
                        this.getHighSpeedVideoFpsRanges = 0.0f;
                        this.getHighSpeedVideoFpsRangesFor = motionEvent.getPointerId(0);
                        getHighResolutionOutputSizeshNQ4ISI(viewHolder, 1);
                    }
                }
            }
        }
    }

    final android.view.View getHighSpeedVideoFpsRangesFor(android.view.MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = this.unwrapAs;
        if (viewHolder != null) {
            android.view.View view = viewHolder.itemView;
            if (getHighSpeedVideoSizes(view, x, y, this.isOutputSupportedFor + this.getHighSpeedVideoFpsRanges, this.toString + this.getOutputMinFrameDuration)) {
                return view;
            }
        }
        for (int size = this.getOutputSizes.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation recoverAnimation = this.getOutputSizes.get(size);
            android.view.View view2 = recoverAnimation.getOutputMinFrameDurationlomOqCM.itemView;
            if (getHighSpeedVideoSizes(view2, x, y, recoverAnimation.isOutputSupportedFor, recoverAnimation.unwrapAs)) {
                return view2;
            }
        }
        return this.getOutputSizeshNQ4ISI.findChildViewUnder(x, y);
    }

    public void startDrag(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        androidx.recyclerview.widget.ItemTouchHelper.Callback callback = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.getOutputSizeshNQ4ISI;
        if ((callback.convertToAbsoluteDirection(callback.getMovementFlags(recyclerView, viewHolder), androidx.core.view.ViewCompat.getLayoutDirection(recyclerView)) & 16711680) == 0 || viewHolder.itemView.getParent() != this.getOutputSizeshNQ4ISI) {
            return;
        }
        android.view.VelocityTracker velocityTracker = this.CoroutineDebuggingKt;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.CoroutineDebuggingKt = android.view.VelocityTracker.obtain();
        this.getOutputMinFrameDuration = 0.0f;
        this.getHighSpeedVideoFpsRanges = 0.0f;
        getHighResolutionOutputSizeshNQ4ISI(viewHolder, 2);
    }

    public void startSwipe(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        androidx.recyclerview.widget.ItemTouchHelper.Callback callback = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.getOutputSizeshNQ4ISI;
        if ((callback.convertToAbsoluteDirection(callback.getMovementFlags(recyclerView, viewHolder), androidx.core.view.ViewCompat.getLayoutDirection(recyclerView)) & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) == 0 || viewHolder.itemView.getParent() != this.getOutputSizeshNQ4ISI) {
            return;
        }
        android.view.VelocityTracker velocityTracker = this.CoroutineDebuggingKt;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.CoroutineDebuggingKt = android.view.VelocityTracker.obtain();
        this.getOutputMinFrameDuration = 0.0f;
        this.getHighSpeedVideoFpsRanges = 0.0f;
        getHighResolutionOutputSizeshNQ4ISI(viewHolder, 1);
    }

    final void getHighSpeedVideoSizes(android.view.MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.getInputFormats;
        this.getHighSpeedVideoFpsRanges = f;
        this.getOutputMinFrameDuration = y - this.getOutputFormats;
        if ((i & 4) == 0) {
            this.getHighSpeedVideoFpsRanges = java.lang.Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.getHighSpeedVideoFpsRanges = java.lang.Math.min(0.0f, this.getHighSpeedVideoFpsRanges);
        }
        if ((i & 1) == 0) {
            this.getOutputMinFrameDuration = java.lang.Math.max(0.0f, this.getOutputMinFrameDuration);
        }
        if ((i & 2) == 0) {
            this.getOutputMinFrameDuration = java.lang.Math.min(0.0f, this.getOutputMinFrameDuration);
        }
    }

    private int getHighSpeedVideoFpsRangesFor(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        if (this.coroutineBoundary == 2) {
            return 0;
        }
        int movementFlags = this.getHighResolutionOutputSizeshNQ4ISI.getMovementFlags(this.getOutputSizeshNQ4ISI, viewHolder);
        int convertToAbsoluteDirection = (this.getHighResolutionOutputSizeshNQ4ISI.convertToAbsoluteDirection(movementFlags, androidx.core.view.ViewCompat.getLayoutDirection(this.getOutputSizeshNQ4ISI)) & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
        if (convertToAbsoluteDirection == 0) {
            return 0;
        }
        int i = (movementFlags & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
        if (java.lang.Math.abs(this.getHighSpeedVideoFpsRanges) > java.lang.Math.abs(this.getOutputMinFrameDuration)) {
            int highSpeedVideoSizes = getHighSpeedVideoSizes(viewHolder, convertToAbsoluteDirection);
            if (highSpeedVideoSizes > 0) {
                return (i & highSpeedVideoSizes) == 0 ? androidx.recyclerview.widget.ItemTouchHelper.Callback.convertToRelativeDirection(highSpeedVideoSizes, androidx.core.view.ViewCompat.getLayoutDirection(this.getOutputSizeshNQ4ISI)) : highSpeedVideoSizes;
            }
            int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(viewHolder, convertToAbsoluteDirection);
            if (Camera2StreamConfigurationMap > 0) {
                return Camera2StreamConfigurationMap;
            }
        } else {
            int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(viewHolder, convertToAbsoluteDirection);
            if (Camera2StreamConfigurationMap2 > 0) {
                return Camera2StreamConfigurationMap2;
            }
            int highSpeedVideoSizes2 = getHighSpeedVideoSizes(viewHolder, convertToAbsoluteDirection);
            if (highSpeedVideoSizes2 > 0) {
                return (i & highSpeedVideoSizes2) == 0 ? androidx.recyclerview.widget.ItemTouchHelper.Callback.convertToRelativeDirection(highSpeedVideoSizes2, androidx.core.view.ViewCompat.getLayoutDirection(this.getOutputSizeshNQ4ISI)) : highSpeedVideoSizes2;
            }
        }
        return 0;
    }

    private int getHighSpeedVideoSizes(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.getHighSpeedVideoFpsRanges > 0.0f ? 8 : 4;
        android.view.VelocityTracker velocityTracker = this.CoroutineDebuggingKt;
        if (velocityTracker != null && this.getHighSpeedVideoFpsRangesFor >= 0) {
            velocityTracker.computeCurrentVelocity(1000, this.getHighResolutionOutputSizeshNQ4ISI.getSwipeVelocityThreshold(this.ArtificialStackFrames));
            float xVelocity = this.CoroutineDebuggingKt.getXVelocity(this.getHighSpeedVideoFpsRangesFor);
            float yVelocity = this.CoroutineDebuggingKt.getYVelocity(this.getHighSpeedVideoFpsRangesFor);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float abs = java.lang.Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && abs >= this.getHighResolutionOutputSizeshNQ4ISI.getSwipeEscapeVelocity(this.b) && abs > java.lang.Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.getOutputSizeshNQ4ISI.getWidth();
        float swipeThreshold = this.getHighResolutionOutputSizeshNQ4ISI.getSwipeThreshold(viewHolder);
        if ((i & i2) == 0 || java.lang.Math.abs(this.getHighSpeedVideoFpsRanges) <= width * swipeThreshold) {
            return 0;
        }
        return i2;
    }

    private int Camera2StreamConfigurationMap(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.getOutputMinFrameDuration > 0.0f ? 2 : 1;
        android.view.VelocityTracker velocityTracker = this.CoroutineDebuggingKt;
        if (velocityTracker != null && this.getHighSpeedVideoFpsRangesFor >= 0) {
            velocityTracker.computeCurrentVelocity(1000, this.getHighResolutionOutputSizeshNQ4ISI.getSwipeVelocityThreshold(this.ArtificialStackFrames));
            float xVelocity = this.CoroutineDebuggingKt.getXVelocity(this.getHighSpeedVideoFpsRangesFor);
            float yVelocity = this.CoroutineDebuggingKt.getYVelocity(this.getHighSpeedVideoFpsRangesFor);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float abs = java.lang.Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && abs >= this.getHighResolutionOutputSizeshNQ4ISI.getSwipeEscapeVelocity(this.b) && abs > java.lang.Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.getOutputSizeshNQ4ISI.getHeight();
        float swipeThreshold = this.getHighResolutionOutputSizeshNQ4ISI.getSwipeThreshold(viewHolder);
        if ((i & i2) == 0 || java.lang.Math.abs(this.getOutputMinFrameDuration) <= height * swipeThreshold) {
            return 0;
        }
        return i2;
    }

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$5, reason: invalid class name */
    class AnonymousClass5 implements androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback {
        final /* synthetic */ androidx.recyclerview.widget.ItemTouchHelper getHighSpeedVideoSizes;

        @Override // androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback
        public int onGetChildDrawingOrder(int i, int i2) {
            if (this.getHighSpeedVideoSizes.getHighSpeedVideoSizesFor == null) {
                return i2;
            }
            int i3 = this.getHighSpeedVideoSizes.getOutputMinFrameDurationlomOqCM;
            if (i3 == -1) {
                i3 = this.getHighSpeedVideoSizes.getOutputSizeshNQ4ISI.indexOfChild(this.getHighSpeedVideoSizes.getHighSpeedVideoSizesFor);
                this.getHighSpeedVideoSizes.getOutputMinFrameDurationlomOqCM = i3;
            }
            return i2 == i + (-1) ? i3 : i2 < i3 ? i2 : i2 + 1;
        }
    }

    public static abstract class Callback {
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        private int getHighResolutionOutputSizeshNQ4ISI = -1;
        private static final android.view.animation.Interpolator getHighSpeedVideoFpsRangesFor = new android.view.animation.Interpolator() { // from class: androidx.recyclerview.widget.ItemTouchHelper.Callback.1
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        };
        private static final android.view.animation.Interpolator Camera2StreamConfigurationMap = new android.view.animation.Interpolator() { // from class: androidx.recyclerview.widget.ItemTouchHelper.Callback.2
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };

        public static int convertToRelativeDirection(int i, int i2) {
            int i3;
            int i4 = i & 789516;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= (-789517) & i6;
                i3 = (i6 & 789516) << 2;
            }
            return i5 | i3;
        }

        public static int makeFlag(int i, int i2) {
            return i2 << (i * 8);
        }

        public boolean canDropOver(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2) {
            return true;
        }

        public int convertToAbsoluteDirection(int i, int i2) {
            int i3;
            int i4 = i & 3158064;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= (-3158065) & i6;
                i3 = (i6 & 3158064) >> 2;
            }
            return i5 | i3;
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        public abstract int getMovementFlags(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder);

        public float getSwipeEscapeVelocity(float f) {
            return f;
        }

        public float getSwipeThreshold(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        public float getSwipeVelocityThreshold(float f) {
            return f;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public abstract boolean onMove(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2);

        public abstract void onSwiped(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i);

        public static androidx.recyclerview.widget.ItemTouchUIUtil getDefaultUIUtil() {
            return androidx.recyclerview.widget.ItemTouchUIUtilImpl.getHighSpeedVideoSizes;
        }

        public static int makeMovementFlags(int i, int i2) {
            int makeFlag = makeFlag(0, i2 | i);
            return makeFlag(2, i) | makeFlag(1, i2) | makeFlag;
        }

        public androidx.recyclerview.widget.RecyclerView.ViewHolder chooseDropTarget(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> list, int i, int i2) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = viewHolder.itemView.getWidth();
            int height = viewHolder.itemView.getHeight();
            int left2 = i - viewHolder.itemView.getLeft();
            int top2 = i2 - viewHolder.itemView.getTop();
            int size = list.size();
            androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder3 = list.get(i4);
                if (left2 > 0 && (right = viewHolder3.itemView.getRight() - (width + i)) < 0 && viewHolder3.itemView.getRight() > viewHolder.itemView.getRight() && (abs4 = java.lang.Math.abs(right)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs4;
                }
                if (left2 < 0 && (left = viewHolder3.itemView.getLeft() - i) > 0 && viewHolder3.itemView.getLeft() < viewHolder.itemView.getLeft() && (abs3 = java.lang.Math.abs(left)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs3;
                }
                if (top2 < 0 && (top = viewHolder3.itemView.getTop() - i2) > 0 && viewHolder3.itemView.getTop() < viewHolder.itemView.getTop() && (abs2 = java.lang.Math.abs(top)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs2;
                }
                if (top2 > 0 && (bottom = viewHolder3.itemView.getBottom() - (i2 + height)) < 0 && viewHolder3.itemView.getBottom() > viewHolder.itemView.getBottom() && (abs = java.lang.Math.abs(bottom)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs;
                }
            }
            return viewHolder2;
        }

        public void onSelectedChanged(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder != null) {
                androidx.recyclerview.widget.ItemTouchUIUtilImpl.getHighSpeedVideoSizes.onSelected(viewHolder.itemView);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onMoved(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof androidx.recyclerview.widget.ItemTouchHelper.ViewDropHandler) {
                ((androidx.recyclerview.widget.ItemTouchHelper.ViewDropHandler) layoutManager).prepareForDrop(viewHolder.itemView, viewHolder2.itemView, i3, i4);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(viewHolder2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedRight(viewHolder2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(viewHolder2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedBottom(viewHolder2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
        }

        public void clearView(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            androidx.recyclerview.widget.ItemTouchUIUtilImpl.getHighSpeedVideoSizes.clearView(viewHolder.itemView);
        }

        public void onChildDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            androidx.recyclerview.widget.ItemTouchUIUtilImpl.getHighSpeedVideoSizes.onDraw(canvas, recyclerView, viewHolder.itemView, f, f2, i, z);
        }

        public void onChildDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            androidx.recyclerview.widget.ItemTouchUIUtilImpl.getHighSpeedVideoSizes.onDrawOver(canvas, recyclerView, viewHolder.itemView, f, f2, i, z);
        }

        public long getAnimationDuration(androidx.recyclerview.widget.RecyclerView recyclerView, int i, float f, float f2) {
            androidx.recyclerview.widget.RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i == 8 ? 200L : 250L;
            }
            if (i == 8) {
                return itemAnimator.getMoveDuration();
            }
            return itemAnimator.getRemoveDuration();
        }

        public int interpolateOutOfBoundsScroll(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2, int i3, long j) {
            if (this.getHighResolutionOutputSizeshNQ4ISI == -1) {
                this.getHighResolutionOutputSizeshNQ4ISI = recyclerView.getResources().getDimensionPixelSize(androidx.recyclerview.R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            int signum = (int) (((int) (((int) java.lang.Math.signum(i2)) * this.getHighResolutionOutputSizeshNQ4ISI * Camera2StreamConfigurationMap.getInterpolation(java.lang.Math.min(1.0f, (java.lang.Math.abs(i2) * 1.0f) / i)))) * getHighSpeedVideoFpsRangesFor.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f));
            return signum == 0 ? i2 > 0 ? 1 : -1 : signum;
        }
    }

    public static abstract class SimpleCallback extends androidx.recyclerview.widget.ItemTouchHelper.Callback {
        private int getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;

        public SimpleCallback(int i, int i2) {
            this.getHighSpeedVideoFpsRanges = i2;
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        public void setDefaultSwipeDirs(int i) {
            this.getHighSpeedVideoFpsRanges = i;
        }

        public void setDefaultDragDirs(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        public int getSwipeDirs(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            return this.getHighSpeedVideoFpsRanges;
        }

        public int getDragDirs(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
            return makeMovementFlags(getDragDirs(recyclerView, viewHolder), getSwipeDirs(recyclerView, viewHolder));
        }
    }

    class ItemTouchHelperGestureListener extends android.view.GestureDetector.SimpleOnGestureListener {
        boolean getHighSpeedVideoFpsRangesFor = true;

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(android.view.MotionEvent motionEvent) {
            return true;
        }

        ItemTouchHelperGestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(android.view.MotionEvent motionEvent) {
            android.view.View highSpeedVideoFpsRangesFor;
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolder;
            if (!this.getHighSpeedVideoFpsRangesFor || (highSpeedVideoFpsRangesFor = androidx.recyclerview.widget.ItemTouchHelper.this.getHighSpeedVideoFpsRangesFor(motionEvent)) == null || (childViewHolder = androidx.recyclerview.widget.ItemTouchHelper.this.getOutputSizeshNQ4ISI.getChildViewHolder(highSpeedVideoFpsRangesFor)) == null) {
                return;
            }
            androidx.recyclerview.widget.ItemTouchHelper.Callback callback = androidx.recyclerview.widget.ItemTouchHelper.this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.recyclerview.widget.RecyclerView recyclerView = androidx.recyclerview.widget.ItemTouchHelper.this.getOutputSizeshNQ4ISI;
            if ((callback.convertToAbsoluteDirection(callback.getMovementFlags(recyclerView, childViewHolder), androidx.core.view.ViewCompat.getLayoutDirection(recyclerView)) & 16711680) == 0 || motionEvent.getPointerId(0) != androidx.recyclerview.widget.ItemTouchHelper.this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            int findPointerIndex = motionEvent.findPointerIndex(androidx.recyclerview.widget.ItemTouchHelper.this.getHighSpeedVideoFpsRangesFor);
            float x = motionEvent.getX(findPointerIndex);
            float y = motionEvent.getY(findPointerIndex);
            androidx.recyclerview.widget.ItemTouchHelper.this.getInputFormats = x;
            androidx.recyclerview.widget.ItemTouchHelper.this.getOutputFormats = y;
            androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper = androidx.recyclerview.widget.ItemTouchHelper.this;
            itemTouchHelper.getOutputMinFrameDuration = 0.0f;
            itemTouchHelper.getHighSpeedVideoFpsRanges = 0.0f;
            if (androidx.recyclerview.widget.ItemTouchHelper.this.getHighResolutionOutputSizeshNQ4ISI.isLongPressDragEnabled()) {
                androidx.recyclerview.widget.ItemTouchHelper.this.getHighResolutionOutputSizeshNQ4ISI(childViewHolder, 2);
            }
        }
    }

    static class RecoverAnimation implements android.animation.Animator.AnimatorListener {
        final int getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        boolean getInputFormats;
        float getInputSizeshNQ4ISI;
        final float getOutputMinFrameDuration;
        final androidx.recyclerview.widget.RecyclerView.ViewHolder getOutputMinFrameDurationlomOqCM;
        final float getOutputSizes;
        final android.animation.ValueAnimator getOutputSizeshNQ4ISI;
        final float getOutputStallDuration;
        final float getOutputStallDurationlomOqCM;
        float isOutputSupportedFor;
        float unwrapAs;
        boolean getHighSpeedVideoSizesFor = false;
        boolean getOutputFormats = false;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
        }

        RecoverAnimation(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i, int i2, float f, float f2, float f3, float f4) {
            this.getHighResolutionOutputSizeshNQ4ISI = i2;
            this.getHighSpeedVideoFpsRanges = i;
            this.getOutputMinFrameDurationlomOqCM = viewHolder;
            this.getOutputMinFrameDuration = f;
            this.getOutputSizes = f2;
            this.getOutputStallDurationlomOqCM = f3;
            this.getOutputStallDuration = f4;
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            this.getOutputSizeshNQ4ISI = ofFloat;
            ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation.this.getInputSizeshNQ4ISI = valueAnimator.getAnimatedFraction();
                }
            });
            ofFloat.setTarget(viewHolder.itemView);
            ofFloat.addListener(this);
            this.getInputSizeshNQ4ISI = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            if (!this.getOutputFormats) {
                this.getOutputMinFrameDurationlomOqCM.setIsRecyclable(true);
            }
            this.getOutputFormats = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            this.getInputSizeshNQ4ISI = 1.0f;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewDetachedFromWindow(android.view.View view) {
        if (view == this.getHighSpeedVideoSizesFor) {
            this.getHighSpeedVideoSizesFor = null;
            if (this.getHighSpeedVideoSizes != null) {
                this.getOutputSizeshNQ4ISI.setChildDrawingOrderCallback(null);
            }
        }
        androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolder = this.getOutputSizeshNQ4ISI.getChildViewHolder(view);
        if (childViewHolder != null) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = this.unwrapAs;
            if (viewHolder != null && childViewHolder == viewHolder) {
                getHighResolutionOutputSizeshNQ4ISI(null, 0);
                return;
            }
            Camera2StreamConfigurationMap(childViewHolder, false);
            if (this.getOutputStallDurationlomOqCM.remove(childViewHolder.itemView)) {
                this.getHighResolutionOutputSizeshNQ4ISI.clearView(this.getOutputSizeshNQ4ISI, childViewHolder);
            }
        }
    }
}
