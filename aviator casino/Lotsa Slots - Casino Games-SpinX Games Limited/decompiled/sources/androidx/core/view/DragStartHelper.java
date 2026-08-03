package androidx.core.view;

/* loaded from: classes.dex */
public class DragStartHelper {
    private boolean mDragging;
    private int mLastTouchX;
    private int mLastTouchY;
    private final androidx.core.view.DragStartHelper.OnDragStartListener mListener;
    private final android.view.View.OnLongClickListener mLongClickListener = new android.view.View.OnLongClickListener() { // from class: androidx.core.view.DragStartHelper$$ExternalSyntheticLambda0
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(android.view.View view) {
            return androidx.core.view.DragStartHelper.this.onLongClick(view);
        }
    };
    private final android.view.View.OnTouchListener mTouchListener = new android.view.View.OnTouchListener() { // from class: androidx.core.view.DragStartHelper$$ExternalSyntheticLambda1
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
            return androidx.core.view.DragStartHelper.this.onTouch(view, motionEvent);
        }
    };
    private final android.view.View mView;

    public interface OnDragStartListener {
        boolean onDragStart(android.view.View view, androidx.core.view.DragStartHelper dragStartHelper);
    }

    public DragStartHelper(android.view.View view, androidx.core.view.DragStartHelper.OnDragStartListener onDragStartListener) {
        this.mView = view;
        this.mListener = onDragStartListener;
    }

    public void attach() {
        this.mView.setOnLongClickListener(this.mLongClickListener);
        this.mView.setOnTouchListener(this.mTouchListener);
    }

    public void detach() {
        this.mView.setOnLongClickListener(null);
        this.mView.setOnTouchListener(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r2 != 3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mLastTouchX = x;
            this.mLastTouchY = y;
        } else {
            if (action != 1) {
                if (action == 2) {
                    if (androidx.core.view.MotionEventCompat.isFromSource(motionEvent, 8194) && (motionEvent.getButtonState() & 1) != 0 && !this.mDragging && (this.mLastTouchX != x || this.mLastTouchY != y)) {
                        this.mLastTouchX = x;
                        this.mLastTouchY = y;
                        boolean onDragStart = this.mListener.onDragStart(view, this);
                        this.mDragging = onDragStart;
                        return onDragStart;
                    }
                }
            }
            this.mDragging = false;
        }
        return false;
    }

    public boolean onLongClick(android.view.View view) {
        if (this.mDragging) {
            return true;
        }
        boolean onDragStart = this.mListener.onDragStart(view, this);
        this.mDragging = onDragStart;
        return onDragStart;
    }

    public void getTouchPosition(android.graphics.Point point) {
        point.set(this.mLastTouchX, this.mLastTouchY);
    }
}
