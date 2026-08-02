package com.facetec.sdk;

/* loaded from: classes8.dex */
final class i extends android.widget.LinearLayout {
    public i(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setEnabled(false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        if (!isEnabled()) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            setAlpha(0.4f);
            postInvalidate();
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || motionEvent.getX() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() > getHeight()) {
            setAlpha(1.0f);
            postInvalidate();
        }
        return true;
    }

    public final void setOnClickRunnable(final java.lang.Runnable runnable) {
        setEnabled(true);
        setClickable(true);
        setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facetec.sdk.i$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.facetec.sdk.i.this.d(runnable, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(java.lang.Runnable runnable, android.view.View view) {
        if (isEnabled()) {
            setEnabled(false);
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
