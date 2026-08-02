package com.airbnb.lottie.model;

/* loaded from: classes7.dex */
public class MutablePair<T> {
    T getHighResolutionOutputSizeshNQ4ISI;
    T getHighSpeedVideoSizes;

    public void set(T t, T t2) {
        this.getHighResolutionOutputSizeshNQ4ISI = t;
        this.getHighSpeedVideoSizes = t2;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.core.util.Pair)) {
            return false;
        }
        androidx.core.util.Pair pair = (androidx.core.util.Pair) obj;
        F f = pair.first;
        java.lang.Object obj2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (f == obj2 || (f != 0 && f.equals(obj2))) {
            S s = pair.second;
            java.lang.Object obj3 = this.getHighSpeedVideoSizes;
            if (s == obj3) {
                return true;
            }
            if (s != 0 && s.equals(obj3)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        T t = this.getHighResolutionOutputSizeshNQ4ISI;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.getHighSpeedVideoSizes;
        return hashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Pair{");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(" ");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append("}");
        return sb.toString();
    }
}
