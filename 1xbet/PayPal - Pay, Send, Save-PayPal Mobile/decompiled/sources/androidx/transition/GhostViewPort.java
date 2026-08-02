package androidx.transition;

/* loaded from: classes7.dex */
class GhostViewPort extends android.view.ViewGroup implements androidx.transition.GhostView {
    final android.view.View Camera2StreamConfigurationMap;
    android.view.ViewGroup getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    private android.graphics.Matrix getHighSpeedVideoFpsRangesFor;
    android.view.View getHighSpeedVideoSizes;
    private final android.view.ViewTreeObserver.OnPreDrawListener getInputFormats;

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    private GhostViewPort(android.view.View view) {
        super(view.getContext());
        this.getInputFormats = new android.view.ViewTreeObserver.OnPreDrawListener() { // from class: androidx.transition.GhostViewPort.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                androidx.transition.GhostViewPort.this.postInvalidateOnAnimation();
                if (androidx.transition.GhostViewPort.this.getHighResolutionOutputSizeshNQ4ISI == null || androidx.transition.GhostViewPort.this.getHighSpeedVideoSizes == null) {
                    return true;
                }
                androidx.transition.GhostViewPort.this.getHighResolutionOutputSizeshNQ4ISI.endViewTransition(androidx.transition.GhostViewPort.this.getHighSpeedVideoSizes);
                androidx.transition.GhostViewPort.this.getHighResolutionOutputSizeshNQ4ISI.postInvalidateOnAnimation();
                androidx.transition.GhostViewPort.this.getHighResolutionOutputSizeshNQ4ISI = null;
                androidx.transition.GhostViewPort.this.getHighSpeedVideoSizes = null;
                return true;
            }
        };
        this.Camera2StreamConfigurationMap = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    @Override // android.view.View, androidx.transition.GhostView
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (((androidx.transition.GhostViewPort) this.Camera2StreamConfigurationMap.getTag(androidx.transition.R.id.ghost_view)) == this) {
            androidx.transition.ViewUtils.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, i == 0 ? 4 : 0);
        }
    }

    @Override // androidx.transition.GhostView
    public final void getHighResolutionOutputSizeshNQ4ISI(android.view.ViewGroup viewGroup, android.view.View view) {
        this.getHighResolutionOutputSizeshNQ4ISI = viewGroup;
        this.getHighSpeedVideoSizes = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Camera2StreamConfigurationMap.setTag(androidx.transition.R.id.ghost_view, this);
        this.Camera2StreamConfigurationMap.getViewTreeObserver().addOnPreDrawListener(this.getInputFormats);
        androidx.transition.ViewUtils.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, 4);
        if (this.Camera2StreamConfigurationMap.getParent() != null) {
            ((android.view.View) this.Camera2StreamConfigurationMap.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.Camera2StreamConfigurationMap.getViewTreeObserver().removeOnPreDrawListener(this.getInputFormats);
        androidx.transition.ViewUtils.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, 0);
        this.Camera2StreamConfigurationMap.setTag(androidx.transition.R.id.ghost_view, null);
        if (this.Camera2StreamConfigurationMap.getParent() != null) {
            ((android.view.View) this.Camera2StreamConfigurationMap.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        androidx.transition.CanvasUtils.Camera2StreamConfigurationMap(canvas, true);
        canvas.setMatrix(this.getHighSpeedVideoFpsRangesFor);
        androidx.transition.ViewUtils.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, 0);
        this.Camera2StreamConfigurationMap.invalidate();
        androidx.transition.ViewUtils.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, 4);
        drawChild(canvas, this.Camera2StreamConfigurationMap, getDrawingTime());
        androidx.transition.CanvasUtils.Camera2StreamConfigurationMap(canvas, false);
    }

    private static void getHighSpeedVideoFpsRangesFor(android.view.View view, android.view.View view2) {
        androidx.transition.ViewUtils.getHighResolutionOutputSizeshNQ4ISI(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f3, code lost:
    
        if (androidx.transition.GhostViewHolder.Api21Impl.getHighSpeedVideoFpsRangesFor(r9) <= androidx.transition.GhostViewHolder.Api21Impl.getHighSpeedVideoFpsRangesFor(r10)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0112, code lost:
    
        r15 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0110, code lost:
    
        if (r14.size() != r7) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static androidx.transition.GhostViewPort Camera2StreamConfigurationMap(android.view.View view, android.view.ViewGroup viewGroup, android.graphics.Matrix matrix) {
        int i;
        androidx.transition.GhostViewHolder ghostViewHolder;
        if (!(view.getParent() instanceof android.view.ViewGroup)) {
            throw new java.lang.IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
        }
        androidx.transition.GhostViewHolder Camera2StreamConfigurationMap = androidx.transition.GhostViewHolder.Camera2StreamConfigurationMap(viewGroup);
        androidx.transition.GhostViewPort ghostViewPort = (androidx.transition.GhostViewPort) view.getTag(androidx.transition.R.id.ghost_view);
        if (ghostViewPort == null || (ghostViewHolder = (androidx.transition.GhostViewHolder) ghostViewPort.getParent()) == Camera2StreamConfigurationMap) {
            i = 0;
        } else {
            i = ghostViewPort.getHighSpeedVideoFpsRanges;
            ghostViewHolder.removeView(ghostViewPort);
            ghostViewPort = null;
        }
        if (ghostViewPort == null) {
            if (matrix == null) {
                matrix = new android.graphics.Matrix();
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) view.getParent();
                matrix.reset();
                androidx.transition.ViewUtils.getHighSpeedVideoFpsRangesFor(viewGroup2, matrix);
                matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
                androidx.transition.ViewUtils.Camera2StreamConfigurationMap(viewGroup, matrix);
            }
            ghostViewPort = new androidx.transition.GhostViewPort(view);
            ghostViewPort.getHighSpeedVideoFpsRangesFor = matrix;
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = new androidx.transition.GhostViewHolder(viewGroup);
            } else {
                if (!Camera2StreamConfigurationMap.getHighSpeedVideoSizes) {
                    throw new java.lang.IllegalStateException("This GhostViewHolder is detached!");
                }
                Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor.getOverlay().remove(Camera2StreamConfigurationMap);
                Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor.getOverlay().add(Camera2StreamConfigurationMap);
            }
            getHighSpeedVideoFpsRangesFor(viewGroup, Camera2StreamConfigurationMap);
            getHighSpeedVideoFpsRangesFor(viewGroup, ghostViewPort);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            androidx.transition.GhostViewHolder.getHighSpeedVideoSizes(ghostViewPort.Camera2StreamConfigurationMap, arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int childCount = Camera2StreamConfigurationMap.getChildCount() - 1;
            int i2 = 0;
            while (i2 <= childCount) {
                int i3 = (i2 + childCount) / 2;
                androidx.transition.GhostViewHolder.getHighSpeedVideoSizes(((androidx.transition.GhostViewPort) Camera2StreamConfigurationMap.getChildAt(i3)).Camera2StreamConfigurationMap, arrayList2);
                if (!arrayList.isEmpty() && !arrayList2.isEmpty() && arrayList.get(0) == arrayList2.get(0)) {
                    int min = java.lang.Math.min(arrayList.size(), arrayList2.size());
                    int i4 = 1;
                    while (true) {
                        if (i4 < min) {
                            android.view.View view2 = (android.view.View) arrayList.get(i4);
                            android.view.View view3 = (android.view.View) arrayList2.get(i4);
                            if (view2 != view3) {
                                android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) view2.getParent();
                                int childCount2 = viewGroup3.getChildCount();
                                if (androidx.transition.GhostViewHolder.Api21Impl.getHighSpeedVideoFpsRangesFor(view2) == androidx.transition.GhostViewHolder.Api21Impl.getHighSpeedVideoFpsRangesFor(view3)) {
                                    for (int i5 = 0; i5 < childCount2; i5++) {
                                        android.view.View childAt = viewGroup3.getChildAt(androidx.transition.ViewGroupUtils.getHighSpeedVideoFpsRangesFor(viewGroup3, i5));
                                        if (childAt != view2) {
                                            if (childAt == view3) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                i4++;
                            }
                        }
                        arrayList2.clear();
                    }
                }
                i2 = i3 + 1;
                arrayList2.clear();
            }
            if (i2 < 0 || i2 >= Camera2StreamConfigurationMap.getChildCount()) {
                Camera2StreamConfigurationMap.addView(ghostViewPort);
            } else {
                Camera2StreamConfigurationMap.addView(ghostViewPort, i2);
            }
            ghostViewPort.getHighSpeedVideoFpsRanges = i;
        } else if (matrix != null) {
            ghostViewPort.getHighSpeedVideoFpsRangesFor = matrix;
        }
        ghostViewPort.getHighSpeedVideoFpsRanges++;
        return ghostViewPort;
    }

    static void Camera2StreamConfigurationMap(android.view.View view) {
        androidx.transition.GhostViewPort ghostViewPort = (androidx.transition.GhostViewPort) view.getTag(androidx.transition.R.id.ghost_view);
        if (ghostViewPort != null) {
            int i = ghostViewPort.getHighSpeedVideoFpsRanges - 1;
            ghostViewPort.getHighSpeedVideoFpsRanges = i;
            if (i <= 0) {
                ((androidx.transition.GhostViewHolder) ghostViewPort.getParent()).removeView(ghostViewPort);
            }
        }
    }
}
