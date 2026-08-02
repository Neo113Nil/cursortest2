package com.google.common.collect;

/* loaded from: classes9.dex */
final class Count implements java.io.Serializable {
    private int value;

    Count(int i) {
        this.value = i;
    }

    public final int get() {
        return this.value;
    }

    public final void add(int i) {
        this.value += i;
    }

    public final int addAndGet(int i) {
        int i2 = this.value + i;
        this.value = i2;
        return i2;
    }

    public final void set(int i) {
        this.value = i;
    }

    public final int getAndSet(int i) {
        int i2 = this.value;
        this.value = i;
        return i2;
    }

    public final int hashCode() {
        return this.value;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.common.collect.Count) && ((com.google.common.collect.Count) obj).value == this.value;
    }

    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.value);
    }
}
