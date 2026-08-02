package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes6.dex */
public class KeyCache {
    java.util.HashMap<java.lang.Object, java.util.HashMap<java.lang.String, float[]>> getHighSpeedVideoFpsRanges = new java.util.HashMap<>();

    public void setFloatValue(java.lang.Object obj, java.lang.String str, int i, float f) {
        if (!this.getHighSpeedVideoFpsRanges.containsKey(obj)) {
            java.util.HashMap<java.lang.String, float[]> hashMap = new java.util.HashMap<>();
            float[] fArr = new float[i + 1];
            fArr[i] = f;
            hashMap.put(str, fArr);
            this.getHighSpeedVideoFpsRanges.put(obj, hashMap);
            return;
        }
        java.util.HashMap<java.lang.String, float[]> hashMap2 = this.getHighSpeedVideoFpsRanges.get(obj);
        if (hashMap2 == null) {
            hashMap2 = new java.util.HashMap<>();
        }
        if (!hashMap2.containsKey(str)) {
            float[] fArr2 = new float[i + 1];
            fArr2[i] = f;
            hashMap2.put(str, fArr2);
            this.getHighSpeedVideoFpsRanges.put(obj, hashMap2);
            return;
        }
        float[] fArr3 = hashMap2.get(str);
        if (fArr3 == null) {
            fArr3 = new float[0];
        }
        if (fArr3.length <= i) {
            fArr3 = java.util.Arrays.copyOf(fArr3, i + 1);
        }
        fArr3[i] = f;
        hashMap2.put(str, fArr3);
    }

    public float getFloatValue(java.lang.Object obj, java.lang.String str, int i) {
        java.util.HashMap<java.lang.String, float[]> hashMap;
        float[] fArr;
        if (this.getHighSpeedVideoFpsRanges.containsKey(obj) && (hashMap = this.getHighSpeedVideoFpsRanges.get(obj)) != null && hashMap.containsKey(str) && (fArr = hashMap.get(str)) != null && fArr.length > i) {
            return fArr[i];
        }
        return Float.NaN;
    }
}
