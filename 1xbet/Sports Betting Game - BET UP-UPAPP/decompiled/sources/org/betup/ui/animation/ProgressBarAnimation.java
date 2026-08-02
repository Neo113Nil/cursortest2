package org.betup.ui.animation;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ProgressBar;

/* loaded from: classes2.dex */
public class ProgressBarAnimation extends Animation {
    private float from;
    private ProgressBar progressBar;
    private float to;

    public ProgressBarAnimation(ProgressBar progressBar, float from, float to) {
        this.progressBar = progressBar;
        this.from = from;
        this.to = to;
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        super.applyTransformation(interpolatedTime, t);
        float f = this.from;
        this.progressBar.setProgress((int) (f + ((this.to - f) * interpolatedTime)));
    }
}
