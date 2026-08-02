package org.betup.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import ru.dimorinny.floatingtextbutton.FloatingTextButton;

/* loaded from: classes4.dex */
public class OvalFloatingButton extends FloatingTextButton {
    private boolean animating;

    public OvalFloatingButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void hide() {
        if (this.animating) {
            return;
        }
        this.animating = true;
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.01f, 1.0f, 0.01f, 1, 1.0f, 1, 1.0f);
        scaleAnimation.setDuration(150L);
        scaleAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: org.betup.ui.views.OvalFloatingButton.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                OvalFloatingButton.this.setVisibility(8);
                OvalFloatingButton.this.animating = false;
            }
        });
        startAnimation(scaleAnimation);
    }

    public void show() {
        if (this.animating) {
            return;
        }
        this.animating = true;
        setVisibility(0);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.01f, 1.0f, 0.01f, 1.0f, 1, 1.0f, 1, 1.0f);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: org.betup.ui.views.OvalFloatingButton.2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                OvalFloatingButton.this.animating = false;
            }
        });
        scaleAnimation.setDuration(150L);
        startAnimation(scaleAnimation);
    }
}
