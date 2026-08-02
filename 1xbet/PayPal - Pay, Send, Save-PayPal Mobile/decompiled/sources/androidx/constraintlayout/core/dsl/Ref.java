package androidx.constraintlayout.core.dsl;

/* loaded from: classes6.dex */
public class Ref {
    private float getHighResolutionOutputSizeshNQ4ISI;
    private float getHighSpeedVideoFpsRanges;
    private float getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;

    private Ref(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = Float.NaN;
        this.getHighSpeedVideoFpsRangesFor = Float.NaN;
        this.getHighSpeedVideoFpsRanges = Float.NaN;
        this.getHighSpeedVideoSizes = str;
    }

    private Ref(java.lang.String str, float f, float f2, float f3) {
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = f;
        this.getHighSpeedVideoFpsRangesFor = f2;
        this.getHighSpeedVideoFpsRanges = f3;
    }

    public java.lang.String getId() {
        return this.getHighSpeedVideoSizes;
    }

    public void setId(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
    }

    public float getWeight() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setWeight(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
    }

    public float getPreMargin() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setPreMargin(float f) {
        this.getHighSpeedVideoFpsRangesFor = f;
    }

    public float getPostMargin() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setPostMargin(float f) {
        this.getHighSpeedVideoFpsRanges = f;
    }

    public static float parseFloat(java.lang.Object obj) {
        try {
            return java.lang.Float.parseFloat(obj.toString());
        } catch (java.lang.Exception unused) {
            return Float.NaN;
        }
    }

    public static androidx.constraintlayout.core.dsl.Ref parseStringToRef(java.lang.String str) {
        java.lang.String[] split = str.replaceAll("[\\[\\]\\']", "").split(",");
        if (split.length == 0) {
            return null;
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        for (int i = 0; i < split.length && i < 4; i++) {
            objArr[i] = split[i];
        }
        return new androidx.constraintlayout.core.dsl.Ref(objArr[0].toString().replace("'", ""), parseFloat(objArr[1]), parseFloat(objArr[2]), parseFloat(objArr[3]));
    }

    public static void addStringToReferences(java.lang.String str, java.util.ArrayList<androidx.constraintlayout.core.dsl.Ref> arrayList) {
        java.lang.Object obj;
        if (str == null || str.length() == 0) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (charAt != ' ' && charAt != '\'') {
                if (charAt == ',') {
                    if (i < 3) {
                        objArr[i] = sb.toString();
                        sb.setLength(0);
                        i++;
                    }
                    if (i2 == 1 && (obj = objArr[0]) != null) {
                        arrayList.add(new androidx.constraintlayout.core.dsl.Ref(obj.toString()));
                        objArr[0] = null;
                        i = 0;
                    }
                } else if (charAt == '[') {
                    i2++;
                } else if (charAt != ']') {
                    sb.append(charAt);
                } else if (i2 > 0) {
                    i2--;
                    objArr[i] = sb.toString();
                    sb.setLength(0);
                    java.lang.Object obj2 = objArr[0];
                    if (obj2 != null) {
                        arrayList.add(new androidx.constraintlayout.core.dsl.Ref(obj2.toString(), parseFloat(objArr[1]), parseFloat(objArr[2]), parseFloat(objArr[3])));
                        java.util.Arrays.fill(objArr, (java.lang.Object) null);
                        i = 0;
                    }
                }
            }
        }
    }

    public java.lang.String toString() {
        java.lang.String str = this.getHighSpeedVideoSizes;
        if (str == null || str.length() == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        boolean z = (java.lang.Float.isNaN(this.getHighResolutionOutputSizeshNQ4ISI) && java.lang.Float.isNaN(this.getHighSpeedVideoFpsRangesFor) && java.lang.Float.isNaN(this.getHighSpeedVideoFpsRanges)) ? false : true;
        if (z) {
            sb.append("[");
        }
        sb.append("'");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append("'");
        if (!java.lang.Float.isNaN(this.getHighSpeedVideoFpsRanges)) {
            sb.append(",");
            sb.append(!java.lang.Float.isNaN(this.getHighResolutionOutputSizeshNQ4ISI) ? this.getHighResolutionOutputSizeshNQ4ISI : 0.0f);
            sb.append(",");
            sb.append(java.lang.Float.isNaN(this.getHighSpeedVideoFpsRangesFor) ? 0.0f : this.getHighSpeedVideoFpsRangesFor);
            sb.append(",");
            sb.append(this.getHighSpeedVideoFpsRanges);
        } else if (!java.lang.Float.isNaN(this.getHighSpeedVideoFpsRangesFor)) {
            sb.append(",");
            sb.append(java.lang.Float.isNaN(this.getHighResolutionOutputSizeshNQ4ISI) ? 0.0f : this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(",");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
        } else if (!java.lang.Float.isNaN(this.getHighResolutionOutputSizeshNQ4ISI)) {
            sb.append(",");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        }
        if (z) {
            sb.append("]");
        }
        sb.append(",");
        return sb.toString();
    }
}
