package com.datadog.trace.api;

/* loaded from: classes3.dex */
public final class Pair<T, U> {
    private final U getHighSpeedVideoFpsRangesFor;
    private final T getHighSpeedVideoSizes;

    public static <T, U> com.datadog.trace.api.Pair<T, U> of(T t, U u) {
        return new com.datadog.trace.api.Pair<>(t, u);
    }

    private Pair(T t, U u) {
        this.getHighSpeedVideoSizes = t;
        this.getHighSpeedVideoFpsRangesFor = u;
    }

    public final T getLeft() {
        return this.getHighSpeedVideoSizes;
    }

    public final U getRight() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean hasLeft() {
        return this.getHighSpeedVideoSizes != null;
    }

    public final boolean hasRight() {
        return this.getHighSpeedVideoFpsRangesFor != null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.datadog.trace.api.Pair)) {
            return false;
        }
        com.datadog.trace.api.Pair pair = (com.datadog.trace.api.Pair) obj;
        return java.util.Objects.equals(this.getHighSpeedVideoSizes, pair.getHighSpeedVideoSizes) && java.util.Objects.equals(this.getHighSpeedVideoFpsRangesFor, pair.getHighSpeedVideoFpsRangesFor);
    }

    public final int hashCode() {
        T t = this.getHighSpeedVideoSizes;
        int hashCode = t == null ? 0 : t.hashCode();
        U u = this.getHighSpeedVideoFpsRangesFor;
        return (hashCode * 31) + (u != null ? u.hashCode() : 0);
    }
}
