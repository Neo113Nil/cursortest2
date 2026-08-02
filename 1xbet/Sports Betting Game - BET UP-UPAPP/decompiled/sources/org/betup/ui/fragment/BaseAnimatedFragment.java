package org.betup.ui.fragment;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes4.dex */
public abstract class BaseAnimatedFragment extends BaseFragmentWithProfileInfo {
    private boolean loaded;

    @Override // org.betup.ui.fragment.BaseFragmentWithProfileInfo, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("SLIDERTEST", "ANIMATED FRAGMENT CREATED " + getClass().getName());
        this.loaded = false;
    }

    @Override // org.betup.ui.fragment.BaseFragmentWithProfileInfo
    protected boolean callUserReadyAfterFetch() {
        return this.loaded;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("SLIDERTEST", "ACTIVITY CREATED " + (savedInstanceState != null) + " " + this.loaded + " " + getClass().getName());
        if (savedInstanceState == null || this.loaded) {
            return;
        }
        Log.d("SLIDERTEST", "ON READY!!! activityCreated");
        this.loaded = true;
        onUserReady(getProfileIfFetched(), getProfileIfFetched() != null);
    }

    @Override // androidx.fragment.app.Fragment
    public Animator onCreateAnimator(int transit, boolean enter, int nextAnim) {
        Log.d("SLIDERTEST", "ON CREATE ANIMATOR " + this.loaded + " " + getClass().getName());
        this.loaded = false;
        if (nextAnim == 0) {
            return null;
        }
        Animator loadAnimator = AnimatorInflater.loadAnimator(getActivity(), nextAnim);
        if (enter) {
            loadAnimator.addListener(new Animator.AnimatorListener() { // from class: org.betup.ui.fragment.BaseAnimatedFragment.1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animation) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animation) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animation) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    BaseAnimatedFragment.this.loaded = true;
                    Log.d("SLIDERTEST", "ON READY!!! onCreateAnimator");
                    if (BaseAnimatedFragment.this.isActive()) {
                        boolean z = BaseAnimatedFragment.this.getProfileIfFetched() != null;
                        BaseAnimatedFragment baseAnimatedFragment = BaseAnimatedFragment.this;
                        baseAnimatedFragment.onUserReady(baseAnimatedFragment.getProfileIfFetched(), z);
                    }
                }
            });
        }
        return loadAnimator;
    }

    public boolean isLoaded() {
        return this.loaded;
    }
}
