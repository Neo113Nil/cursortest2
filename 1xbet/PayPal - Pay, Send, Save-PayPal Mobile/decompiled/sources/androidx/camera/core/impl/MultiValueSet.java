package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public abstract class MultiValueSet<C> {
    private java.util.Set<C> getHighSpeedVideoFpsRangesFor = new java.util.HashSet();

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public abstract androidx.camera.core.impl.MultiValueSet<C> m1009clone();

    public void addAll(java.util.List<C> list) {
        this.getHighSpeedVideoFpsRangesFor.addAll(list);
    }

    public java.util.List<C> getAllItems() {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList(this.getHighSpeedVideoFpsRangesFor));
    }
}
