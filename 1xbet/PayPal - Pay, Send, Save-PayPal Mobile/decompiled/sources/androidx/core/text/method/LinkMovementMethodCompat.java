package androidx.core.text.method;

/* loaded from: classes7.dex */
public class LinkMovementMethodCompat extends android.text.method.LinkMovementMethod {
    private static androidx.core.text.method.LinkMovementMethodCompat getHighSpeedVideoFpsRanges;

    private LinkMovementMethodCompat() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r0 <= r3.getLineRight(r1)) goto L17;
     */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(android.widget.TextView textView, android.text.Spannable spannable, android.view.MotionEvent motionEvent) {
        int action;
        if (android.os.Build.VERSION.SDK_INT < 35 && ((action = motionEvent.getAction()) == 1 || action == 0)) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            int totalPaddingTop = textView.getTotalPaddingTop();
            int scrollX = textView.getScrollX();
            int scrollY = (y - totalPaddingTop) + textView.getScrollY();
            android.text.Layout layout = textView.getLayout();
            if (scrollY >= 0 && scrollY <= layout.getHeight()) {
                int lineForVertical = layout.getLineForVertical(scrollY);
                float f = (x - totalPaddingLeft) + scrollX;
                if (f >= layout.getLineLeft(lineForVertical)) {
                }
            }
            android.text.Selection.removeSelection(spannable);
            return android.text.method.Touch.onTouchEvent(textView, spannable, motionEvent);
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }

    public static androidx.core.text.method.LinkMovementMethodCompat getInstance() {
        if (getHighSpeedVideoFpsRanges == null) {
            getHighSpeedVideoFpsRanges = new androidx.core.text.method.LinkMovementMethodCompat();
        }
        return getHighSpeedVideoFpsRanges;
    }
}
