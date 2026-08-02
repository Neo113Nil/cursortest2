package com.sun.jna;

/* loaded from: classes5.dex */
public class WeakMemoryHolder {
    java.lang.ref.ReferenceQueue<java.lang.Object> getHighSpeedVideoFpsRangesFor = new java.lang.ref.ReferenceQueue<>();
    java.util.IdentityHashMap<java.lang.ref.Reference<java.lang.Object>, com.sun.jna.Memory> getHighSpeedVideoSizes = new java.util.IdentityHashMap<>();

    public void put(java.lang.Object obj, com.sun.jna.Memory memory) {
        synchronized (this) {
            clean();
            this.getHighSpeedVideoSizes.put(new java.lang.ref.WeakReference(obj, this.getHighSpeedVideoFpsRangesFor), memory);
        }
    }

    public void clean() {
        synchronized (this) {
            while (true) {
                java.lang.ref.Reference<? extends java.lang.Object> poll = this.getHighSpeedVideoFpsRangesFor.poll();
                if (poll != null) {
                    this.getHighSpeedVideoSizes.remove(poll);
                }
            }
        }
    }
}
