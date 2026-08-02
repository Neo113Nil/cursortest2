package androidx.core.view;

/* loaded from: classes7.dex */
public class DragStartHelper {
    private int Camera2StreamConfigurationMap;
    private final androidx.core.view.DragStartHelper.OnDragStartListener getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private final android.view.View getOutputFormats;
    private final android.view.View.OnLongClickListener getHighResolutionOutputSizeshNQ4ISI = new android.view.View.OnLongClickListener() { // from class: androidx.core.view.DragStartHelper$$ExternalSyntheticLambda0
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(android.view.View view) {
            return androidx.core.view.DragStartHelper.this.onLongClick(view);
        }
    };
    private final android.view.View.OnTouchListener getHighSpeedVideoSizesFor = new android.view.View.OnTouchListener() { // from class: androidx.core.view.DragStartHelper$$ExternalSyntheticLambda1
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
            return androidx.core.view.DragStartHelper.this.onTouch(view, motionEvent);
        }
    };

    public interface OnDragStartListener {
        boolean onDragStart(android.view.View view, androidx.core.view.DragStartHelper dragStartHelper);
    }

    public DragStartHelper(android.view.View view, androidx.core.view.DragStartHelper.OnDragStartListener onDragStartListener) {
        this.getOutputFormats = view;
        this.getHighSpeedVideoFpsRanges = onDragStartListener;
    }

    public void attach() {
        this.getOutputFormats.setOnLongClickListener(this.getHighResolutionOutputSizeshNQ4ISI);
        this.getOutputFormats.setOnTouchListener(this.getHighSpeedVideoSizesFor);
    }

    public void detach() {
        this.getOutputFormats.setOnLongClickListener(null);
        this.getOutputFormats.setOnTouchListener(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r2 != 3) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.Camera2StreamConfigurationMap = x;
            this.getHighSpeedVideoSizes = y;
        } else {
            if (action != 1) {
                if (action == 2) {
                    if (androidx.core.view.MotionEventCompat.isFromSource(motionEvent, 8194) && (motionEvent.getButtonState() & 1) != 0 && !this.getHighSpeedVideoFpsRangesFor && (this.Camera2StreamConfigurationMap != x || this.getHighSpeedVideoSizes != y)) {
                        this.Camera2StreamConfigurationMap = x;
                        this.getHighSpeedVideoSizes = y;
                        boolean onDragStart = this.getHighSpeedVideoFpsRanges.onDragStart(view, this);
                        this.getHighSpeedVideoFpsRangesFor = onDragStart;
                        return onDragStart;
                    }
                }
            }
            this.getHighSpeedVideoFpsRangesFor = false;
        }
        return false;
    }

    public boolean onLongClick(android.view.View view) {
        if (this.getHighSpeedVideoFpsRangesFor) {
            return true;
        }
        boolean onDragStart = this.getHighSpeedVideoFpsRanges.onDragStart(view, this);
        this.getHighSpeedVideoFpsRangesFor = onDragStart;
        return onDragStart;
    }

    public void getTouchPosition(android.graphics.Point point) {
        point.set(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
    }
}
