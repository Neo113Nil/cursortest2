package androidx.browser.browseractions;

@java.lang.Deprecated
/* loaded from: classes5.dex */
class BrowserActionsFallbackMenuDialog extends android.app.Dialog {
    private final android.view.View getHighSpeedVideoFpsRanges;

    BrowserActionsFallbackMenuDialog(android.content.Context context, android.view.View view) {
        super(context);
        this.getHighSpeedVideoFpsRanges = view;
    }

    @Override // android.app.Dialog
    public void show() {
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        getHighSpeedVideoFpsRanges(true);
        super.show();
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        getHighSpeedVideoFpsRanges(false);
    }

    private void getHighSpeedVideoFpsRanges(final boolean z) {
        float f = z ? 0.0f : 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        long j = z ? 250L : 150L;
        this.getHighSpeedVideoFpsRanges.setScaleX(f);
        this.getHighSpeedVideoFpsRanges.setScaleY(f);
        this.getHighSpeedVideoFpsRanges.animate().scaleX(f2).scaleY(f2).setDuration(j).setInterpolator(new androidx.interpolator.view.animation.LinearOutSlowInInterpolator()).setListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.browser.browseractions.BrowserActionsFallbackMenuDialog.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                if (z) {
                    return;
                }
                androidx.browser.browseractions.BrowserActionsFallbackMenuDialog.super.dismiss();
            }
        }).start();
    }
}
