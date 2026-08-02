package com.google.android.material.dialog;

/* loaded from: classes8.dex */
public class InsetDialogOnTouchListener implements android.view.View.OnTouchListener {
    private final android.app.Dialog dialog;
    private final int leftInset;
    private final int prePieSlop;
    private final int topInset;

    public InsetDialogOnTouchListener(android.app.Dialog dialog, android.graphics.Rect rect) {
        this.dialog = dialog;
        this.leftInset = rect.left;
        this.topInset = rect.top;
        this.prePieSlop = android.view.ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.view.View findViewById = view.findViewById(android.R.id.content);
        int left = this.leftInset + findViewById.getLeft();
        int width = findViewById.getWidth();
        if (new android.graphics.RectF(left, this.topInset + findViewById.getTop(), width + left, findViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (android.os.Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            float f = (-this.prePieSlop) - 1;
            obtain.setLocation(f, f);
        }
        view.performClick();
        return this.dialog.onTouchEvent(obtain);
    }
}
