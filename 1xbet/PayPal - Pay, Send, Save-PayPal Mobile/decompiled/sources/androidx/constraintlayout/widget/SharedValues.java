package androidx.constraintlayout.widget;

/* loaded from: classes7.dex */
public class SharedValues {
    public static final int UNSET = -1;
    private android.util.SparseIntArray getHighSpeedVideoFpsRanges = new android.util.SparseIntArray();
    private java.util.HashMap<java.lang.Integer, java.util.HashSet<java.lang.ref.WeakReference<androidx.constraintlayout.widget.SharedValues.SharedValuesListener>>> getHighSpeedVideoFpsRangesFor = new java.util.HashMap<>();

    public interface SharedValuesListener {
        void onNewValue(int i, int i2, int i3);
    }

    public void addListener(int i, androidx.constraintlayout.widget.SharedValues.SharedValuesListener sharedValuesListener) {
        java.util.HashSet<java.lang.ref.WeakReference<androidx.constraintlayout.widget.SharedValues.SharedValuesListener>> hashSet = this.getHighSpeedVideoFpsRangesFor.get(java.lang.Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new java.util.HashSet<>();
            this.getHighSpeedVideoFpsRangesFor.put(java.lang.Integer.valueOf(i), hashSet);
        }
        hashSet.add(new java.lang.ref.WeakReference<>(sharedValuesListener));
    }

    public void removeListener(int i, androidx.constraintlayout.widget.SharedValues.SharedValuesListener sharedValuesListener) {
        java.util.HashSet<java.lang.ref.WeakReference<androidx.constraintlayout.widget.SharedValues.SharedValuesListener>> hashSet = this.getHighSpeedVideoFpsRangesFor.get(java.lang.Integer.valueOf(i));
        if (hashSet == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.ref.WeakReference<androidx.constraintlayout.widget.SharedValues.SharedValuesListener>> it = hashSet.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference<androidx.constraintlayout.widget.SharedValues.SharedValuesListener> next = it.next();
            androidx.constraintlayout.widget.SharedValues.SharedValuesListener sharedValuesListener2 = next.get();
            if (sharedValuesListener2 == null || sharedValuesListener2 == sharedValuesListener) {
                arrayList.add(next);
            }
        }
        hashSet.removeAll(arrayList);
    }

    public void removeListener(androidx.constraintlayout.widget.SharedValues.SharedValuesListener sharedValuesListener) {
        java.util.Iterator<java.lang.Integer> it = this.getHighSpeedVideoFpsRangesFor.keySet().iterator();
        while (it.hasNext()) {
            removeListener(it.next().intValue(), sharedValuesListener);
        }
    }

    public void clearListeners() {
        this.getHighSpeedVideoFpsRangesFor.clear();
    }

    public int getValue(int i) {
        return this.getHighSpeedVideoFpsRanges.get(i, -1);
    }

    public void fireNewValue(int i, int i2) {
        int i3 = this.getHighSpeedVideoFpsRanges.get(i, -1);
        if (i3 != i2) {
            this.getHighSpeedVideoFpsRanges.put(i, i2);
            java.util.HashSet<java.lang.ref.WeakReference<androidx.constraintlayout.widget.SharedValues.SharedValuesListener>> hashSet = this.getHighSpeedVideoFpsRangesFor.get(java.lang.Integer.valueOf(i));
            if (hashSet != null) {
                java.util.Iterator<java.lang.ref.WeakReference<androidx.constraintlayout.widget.SharedValues.SharedValuesListener>> it = hashSet.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    androidx.constraintlayout.widget.SharedValues.SharedValuesListener sharedValuesListener = it.next().get();
                    if (sharedValuesListener != null) {
                        sharedValuesListener.onNewValue(i, i2, i3);
                    } else {
                        z = true;
                    }
                }
                if (z) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator<java.lang.ref.WeakReference<androidx.constraintlayout.widget.SharedValues.SharedValuesListener>> it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        java.lang.ref.WeakReference<androidx.constraintlayout.widget.SharedValues.SharedValuesListener> next = it2.next();
                        if (next.get() == null) {
                            arrayList.add(next);
                        }
                    }
                    hashSet.removeAll(arrayList);
                }
            }
        }
    }
}
