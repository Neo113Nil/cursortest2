package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLNumber extends androidx.constraintlayout.core.parser.CLElement {
    float getHighSpeedVideoFpsRangesFor;

    public CLNumber(char[] cArr) {
        super(cArr);
        this.getHighSpeedVideoFpsRangesFor = Float.NaN;
    }

    public CLNumber(float f) {
        super(null);
        this.getHighSpeedVideoFpsRangesFor = f;
    }

    public static androidx.constraintlayout.core.parser.CLElement allocate(char[] cArr) {
        return new androidx.constraintlayout.core.parser.CLNumber(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toJSON() {
        float f = getFloat();
        int i = (int) f;
        return ((float) i) == f ? "".concat(java.lang.String.valueOf(i)) : "".concat(java.lang.String.valueOf(f));
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected java.lang.String toFormattedJSON(int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        addIndent(sb, i);
        float f = getFloat();
        int i3 = (int) f;
        if (i3 == f) {
            sb.append(i3);
        } else {
            sb.append(f);
        }
        return sb.toString();
    }

    public boolean isInt() {
        float f = getFloat();
        return ((float) ((int) f)) == f;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int getInt() {
        if (java.lang.Float.isNaN(this.getHighSpeedVideoFpsRangesFor) && hasContent()) {
            this.getHighSpeedVideoFpsRangesFor = java.lang.Integer.parseInt(content());
        }
        return (int) this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public float getFloat() {
        if (java.lang.Float.isNaN(this.getHighSpeedVideoFpsRangesFor) && hasContent()) {
            this.getHighSpeedVideoFpsRangesFor = java.lang.Float.parseFloat(content());
        }
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void putValue(float f) {
        this.getHighSpeedVideoFpsRangesFor = f;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.constraintlayout.core.parser.CLNumber)) {
            return false;
        }
        float f = getFloat();
        float f2 = ((androidx.constraintlayout.core.parser.CLNumber) obj).getFloat();
        return (java.lang.Float.isNaN(f) && java.lang.Float.isNaN(f2)) || f == f2;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int hashCode() {
        int hashCode = super.hashCode();
        float f = this.getHighSpeedVideoFpsRangesFor;
        return (hashCode * 31) + (f != 0.0f ? java.lang.Float.floatToIntBits(f) : 0);
    }
}
