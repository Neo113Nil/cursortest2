package androidx.transition;

/* loaded from: classes7.dex */
class FloatArrayEvaluator implements android.animation.TypeEvaluator<float[]> {
    private float[] getHighSpeedVideoFpsRanges;

    @Override // android.animation.TypeEvaluator
    public /* bridge */ /* synthetic */ float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float[] fArr5 = this.getHighSpeedVideoFpsRanges;
        if (fArr5 == null) {
            fArr5 = new float[fArr3.length];
        }
        for (int i = 0; i < fArr5.length; i++) {
            float f2 = fArr3[i];
            fArr5[i] = f2 + ((fArr4[i] - f2) * f);
        }
        return fArr5;
    }

    FloatArrayEvaluator(float[] fArr) {
        this.getHighSpeedVideoFpsRanges = fArr;
    }
}
