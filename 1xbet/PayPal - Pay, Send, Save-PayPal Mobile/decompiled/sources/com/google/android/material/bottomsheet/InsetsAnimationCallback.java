package com.google.android.material.bottomsheet;

/* loaded from: classes8.dex */
class InsetsAnimationCallback extends androidx.core.view.WindowInsetsAnimationCompat.Callback {
    private int startTranslationY;
    private int startY;
    private final int[] tmpLocation;
    private final android.view.View view;

    public InsetsAnimationCallback(android.view.View view) {
        super(0);
        this.tmpLocation = new int[2];
        this.view = view;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onPrepare(androidx.core.view.WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.view.getLocationOnScreen(this.tmpLocation);
        this.startY = this.tmpLocation[1];
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat onStart(androidx.core.view.WindowInsetsAnimationCompat windowInsetsAnimationCompat, androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        this.view.getLocationOnScreen(this.tmpLocation);
        int i = this.startY - this.tmpLocation[1];
        this.startTranslationY = i;
        this.view.setTranslationY(i);
        return boundsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public androidx.core.view.WindowInsetsCompat onProgress(androidx.core.view.WindowInsetsCompat windowInsetsCompat, java.util.List<androidx.core.view.WindowInsetsAnimationCompat> list) {
        java.util.Iterator<androidx.core.view.WindowInsetsAnimationCompat> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((it.next().getTypeMask() & androidx.core.view.WindowInsetsCompat.Type.ime()) != 0) {
                this.view.setTranslationY(com.google.android.material.animation.AnimationUtils.lerp(this.startTranslationY, 0, r0.getInterpolatedFraction()));
                break;
            }
        }
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onEnd(androidx.core.view.WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.view.setTranslationY(0.0f);
    }
}
