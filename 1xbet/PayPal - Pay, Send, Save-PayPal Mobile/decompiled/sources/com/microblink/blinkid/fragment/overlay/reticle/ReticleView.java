package com.microblink.blinkid.fragment.overlay.reticle;

/* loaded from: classes10.dex */
public class ReticleView extends androidx.appcompat.widget.AppCompatImageView {
    private android.graphics.drawable.Drawable Camera2StreamConfigurationMap;
    private android.graphics.drawable.Drawable getHighSpeedVideoFpsRangesFor;
    private android.graphics.drawable.Drawable getHighSpeedVideoSizes;

    public enum Type {
        HIDDEN,
        DEFAULT,
        SUCCESS,
        ERROR
    }

    public ReticleView(android.content.Context context) {
        this(context, null, 0);
    }

    private void getHighSpeedVideoFpsRanges(final android.graphics.drawable.Drawable drawable) {
        animate().cancel();
        if (drawable == getDrawable()) {
            animate().alpha(1.0f).setDuration(0L).start();
        } else if (drawable == this.Camera2StreamConfigurationMap) {
            animate().scaleX(0.0f).scaleY(0.0f).setDuration(200L).setListener(new com.microblink.blinkid.fragment.overlay.reticle.AnimationEndListener() { // from class: com.microblink.blinkid.fragment.overlay.reticle.ReticleView.1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator) {
                    com.microblink.blinkid.fragment.overlay.reticle.ReticleView.this.setImageDrawable(drawable);
                    com.microblink.blinkid.fragment.overlay.reticle.ReticleView.this.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new com.microblink.blinkid.fragment.overlay.reticle.AnimationEndListener() { // from class: com.microblink.blinkid.fragment.overlay.reticle.ReticleView.1.1
                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(android.animation.Animator animator2) {
                            com.microblink.blinkid.fragment.overlay.reticle.ReticleView.this.animate().alpha(0.0f).setDuration(100L).setListener(null).start();
                        }
                    }).start();
                }
            }).start();
        } else {
            animate().alpha(0.0f).setDuration(0L).setListener(new com.microblink.blinkid.fragment.overlay.reticle.AnimationEndListener() { // from class: com.microblink.blinkid.fragment.overlay.reticle.ReticleView.2
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator) {
                    com.microblink.blinkid.fragment.overlay.reticle.ReticleView.this.setImageDrawable(drawable);
                    com.microblink.blinkid.fragment.overlay.reticle.ReticleView.this.animate().alpha(1.0f).setDuration(0L).setListener(null).start();
                }
            }).start();
        }
    }

    public void setColors(int i, int i2) {
        android.graphics.drawable.Drawable drawable = this.getHighSpeedVideoSizes;
        android.graphics.PorterDuff.Mode mode = android.graphics.PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(i, mode);
        this.getHighSpeedVideoFpsRangesFor.setColorFilter(i2, mode);
    }

    public void setDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3) {
        this.getHighSpeedVideoSizes = drawable;
        this.Camera2StreamConfigurationMap = drawable2;
        this.getHighSpeedVideoFpsRangesFor = drawable3;
        setImageDrawable(drawable);
    }

    public void setType(com.microblink.blinkid.fragment.overlay.reticle.ReticleView.Type type) {
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            animate().cancel();
            animate().alpha(0.0f).setDuration(0L).start();
        } else if (ordinal == 1) {
            getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes);
        } else if (ordinal == 2) {
            getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap);
        } else {
            if (ordinal != 3) {
                return;
            }
            getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor);
        }
    }

    public ReticleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReticleView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
