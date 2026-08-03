package com.unity3d.services.ads.adunit;

/* loaded from: classes5.dex */
public class AdUnitRelativeLayout extends android.widget.RelativeLayout {
    private android.view.InputEvent _lastInputEvent;
    private int _maxEvents;
    private final java.util.ArrayList<com.unity3d.services.ads.adunit.AdUnitMotionEvent> _motionEvents;
    private boolean _shouldCapture;

    public AdUnitRelativeLayout(android.content.Context context) {
        super(context);
        this._motionEvents = new java.util.ArrayList<>();
        this._maxEvents = 10000;
        this._shouldCapture = false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 6 || motionEvent.getActionMasked() == 5) {
            this._lastInputEvent = motionEvent;
        }
        if (!this._shouldCapture || this._motionEvents.size() >= this._maxEvents) {
            return false;
        }
        boolean z = (motionEvent.getFlags() & 1) != 0;
        synchronized (this._motionEvents) {
            this._motionEvents.add(new com.unity3d.services.ads.adunit.AdUnitMotionEvent(motionEvent.getActionMasked(), z, motionEvent.getToolType(0), motionEvent.getSource(), motionEvent.getDeviceId(), motionEvent.getX(0), motionEvent.getY(0), motionEvent.getEventTime(), motionEvent.getPressure(0), motionEvent.getSize(0)));
        }
        return false;
    }

    public void startCapture(int i) {
        this._maxEvents = i;
        this._shouldCapture = true;
    }

    public void endCapture() {
        this._shouldCapture = false;
    }

    public void clearCapture() {
        synchronized (this._motionEvents) {
            this._motionEvents.clear();
        }
    }

    public int getMaxEventCount() {
        return this._maxEvents;
    }

    public int getCurrentEventCount() {
        int size;
        synchronized (this._motionEvents) {
            size = this._motionEvents.size();
        }
        return size;
    }

    public android.util.SparseArray<android.util.SparseArray<com.unity3d.services.ads.adunit.AdUnitMotionEvent>> getEvents(android.util.SparseArray<java.util.ArrayList<java.lang.Integer>> sparseArray) {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        android.util.SparseArray<android.util.SparseArray<com.unity3d.services.ads.adunit.AdUnitMotionEvent>> sparseArray2 = new android.util.SparseArray<>();
        synchronized (this._motionEvents) {
            java.util.Iterator<com.unity3d.services.ads.adunit.AdUnitMotionEvent> it = this._motionEvents.iterator();
            while (it.hasNext()) {
                com.unity3d.services.ads.adunit.AdUnitMotionEvent next = it.next();
                java.util.ArrayList<java.lang.Integer> arrayList = sparseArray.get(next.getAction());
                if (arrayList != null) {
                    int intValue = arrayList.get(0).intValue();
                    if (sparseIntArray.get(next.getAction(), 0) == intValue) {
                        if (sparseArray2.get(next.getAction()) == null) {
                            sparseArray2.put(next.getAction(), new android.util.SparseArray<>());
                        }
                        sparseArray2.get(next.getAction()).put(intValue, next);
                        arrayList.remove(0);
                    }
                    sparseIntArray.put(next.getAction(), sparseIntArray.get(next.getAction()) + 1);
                }
            }
        }
        return sparseArray2;
    }

    public android.util.SparseIntArray getEventCount(java.util.ArrayList<java.lang.Integer> arrayList) {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        synchronized (this._motionEvents) {
            java.util.Iterator<com.unity3d.services.ads.adunit.AdUnitMotionEvent> it = this._motionEvents.iterator();
            while (it.hasNext()) {
                com.unity3d.services.ads.adunit.AdUnitMotionEvent next = it.next();
                java.util.Iterator<java.lang.Integer> it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        java.lang.Integer next2 = it2.next();
                        if (next.getAction() == next2.intValue()) {
                            sparseIntArray.put(next2.intValue(), sparseIntArray.get(next2.intValue(), 0) + 1);
                            break;
                        }
                    }
                }
            }
        }
        return sparseIntArray;
    }

    public android.view.InputEvent getLastInputEvent() {
        return this._lastInputEvent;
    }
}
