package com.airbnb.lottie.model;

/* loaded from: classes7.dex */
public class KeyPath {
    public static final com.airbnb.lottie.model.KeyPath COMPOSITION = new com.airbnb.lottie.model.KeyPath("COMPOSITION");
    private final java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor;
    private com.airbnb.lottie.model.KeyPathElement getHighSpeedVideoSizes;

    public KeyPath(java.lang.String... strArr) {
        this.getHighSpeedVideoFpsRangesFor = java.util.Arrays.asList(strArr);
    }

    private KeyPath(com.airbnb.lottie.model.KeyPath keyPath) {
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(keyPath.getHighSpeedVideoFpsRangesFor);
        this.getHighSpeedVideoSizes = keyPath.getHighSpeedVideoSizes;
    }

    public com.airbnb.lottie.model.KeyPath addKey(java.lang.String str) {
        com.airbnb.lottie.model.KeyPath keyPath = new com.airbnb.lottie.model.KeyPath(this);
        keyPath.getHighSpeedVideoFpsRangesFor.add(str);
        return keyPath;
    }

    public com.airbnb.lottie.model.KeyPath resolve(com.airbnb.lottie.model.KeyPathElement keyPathElement) {
        com.airbnb.lottie.model.KeyPath keyPath = new com.airbnb.lottie.model.KeyPath(this);
        keyPath.getHighSpeedVideoSizes = keyPathElement;
        return keyPath;
    }

    public com.airbnb.lottie.model.KeyPathElement getResolvedElement() {
        return this.getHighSpeedVideoSizes;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r8.get(r8.size() - 1).equals("**") != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean fullyResolvesTo(java.lang.String str, int i) {
        if (i >= this.getHighSpeedVideoFpsRangesFor.size()) {
            return false;
        }
        boolean z = i == this.getHighSpeedVideoFpsRangesFor.size() - 1;
        java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor.get(i);
        if (!str2.equals("**")) {
            boolean z2 = str2.equals(str) || str2.equals("*");
            if (!z) {
                if (i == this.getHighSpeedVideoFpsRangesFor.size() - 2) {
                    java.util.List<java.lang.String> list = this.getHighSpeedVideoFpsRangesFor;
                }
            }
            return z2;
        }
        if (z || !this.getHighSpeedVideoFpsRangesFor.get(i + 1).equals(str)) {
            if (z) {
                return true;
            }
            int i2 = i + 1;
            if (i2 < this.getHighSpeedVideoFpsRangesFor.size() - 1) {
                return false;
            }
            return this.getHighSpeedVideoFpsRangesFor.get(i2).equals(str);
        }
        if (i != this.getHighSpeedVideoFpsRangesFor.size() - 2) {
            if (i == this.getHighSpeedVideoFpsRangesFor.size() - 3) {
                java.util.List<java.lang.String> list2 = this.getHighSpeedVideoFpsRangesFor;
                if (!list2.get(list2.size() - 1).equals("**")) {
                }
            }
            return false;
        }
        return true;
    }

    public boolean propagateToChildren(java.lang.String str, int i) {
        return "__container".equals(str) || i < this.getHighSpeedVideoFpsRangesFor.size() - 1 || this.getHighSpeedVideoFpsRangesFor.get(i).equals("**");
    }

    public java.lang.String keysToString() {
        return this.getHighSpeedVideoFpsRangesFor.toString();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.airbnb.lottie.model.KeyPath keyPath = (com.airbnb.lottie.model.KeyPath) obj;
            if (!this.getHighSpeedVideoFpsRangesFor.equals(keyPath.getHighSpeedVideoFpsRangesFor)) {
                return false;
            }
            com.airbnb.lottie.model.KeyPathElement keyPathElement = this.getHighSpeedVideoSizes;
            com.airbnb.lottie.model.KeyPathElement keyPathElement2 = keyPath.getHighSpeedVideoSizes;
            if (keyPathElement != null) {
                return keyPathElement.equals(keyPathElement2);
            }
            if (keyPathElement2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.getHighSpeedVideoFpsRangesFor.hashCode();
        com.airbnb.lottie.model.KeyPathElement keyPathElement = this.getHighSpeedVideoSizes;
        return (hashCode * 31) + (keyPathElement != null ? keyPathElement.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("KeyPath{keys=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(",resolved=");
        sb.append(this.getHighSpeedVideoSizes != null);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public int incrementDepthBy(java.lang.String str, int i) {
        if ("__container".equals(str)) {
            return 0;
        }
        if (this.getHighSpeedVideoFpsRangesFor.get(i).equals("**")) {
            return (i != this.getHighSpeedVideoFpsRangesFor.size() - 1 && this.getHighSpeedVideoFpsRangesFor.get(i + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean matches(java.lang.String str, int i) {
        if ("__container".equals(str)) {
            return true;
        }
        if (i >= this.getHighSpeedVideoFpsRangesFor.size()) {
            return false;
        }
        return this.getHighSpeedVideoFpsRangesFor.get(i).equals(str) || this.getHighSpeedVideoFpsRangesFor.get(i).equals("**") || this.getHighSpeedVideoFpsRangesFor.get(i).equals("*");
    }
}
