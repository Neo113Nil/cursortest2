package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
public class DividerItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    private static final int[] getHighSpeedVideoFpsRanges = {android.R.attr.listDivider};
    private android.graphics.drawable.Drawable getHighResolutionOutputSizeshNQ4ISI;
    private final android.graphics.Rect getHighSpeedVideoFpsRangesFor = new android.graphics.Rect();
    private int getHighSpeedVideoSizes;

    public DividerItemDecoration(android.content.Context context, int i) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(getHighSpeedVideoFpsRanges);
        this.getHighResolutionOutputSizeshNQ4ISI = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        setOrientation(i);
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new java.lang.IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.getHighSpeedVideoSizes = i;
    }

    public void setDrawable(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            throw new java.lang.IllegalArgumentException("Drawable cannot be null.");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = drawable;
    }

    public android.graphics.drawable.Drawable getDrawable() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
        int height;
        int i;
        int width;
        int i2;
        if (recyclerView.getLayoutManager() == null || this.getHighResolutionOutputSizeshNQ4ISI == null) {
            return;
        }
        int i3 = 0;
        if (this.getHighSpeedVideoSizes == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i2 = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(i2, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                i2 = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i3 < childCount) {
                android.view.View childAt = recyclerView.getChildAt(i3);
                recyclerView.getDecoratedBoundsWithMargins(childAt, this.getHighSpeedVideoFpsRangesFor);
                int round = this.getHighSpeedVideoFpsRangesFor.bottom + java.lang.Math.round(childAt.getTranslationY());
                this.getHighResolutionOutputSizeshNQ4ISI.setBounds(i2, round - this.getHighResolutionOutputSizeshNQ4ISI.getIntrinsicHeight(), width, round);
                this.getHighResolutionOutputSizeshNQ4ISI.draw(canvas);
                i3++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i3 < childCount2) {
            android.view.View childAt2 = recyclerView.getChildAt(i3);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt2, this.getHighSpeedVideoFpsRangesFor);
            int round2 = this.getHighSpeedVideoFpsRangesFor.right + java.lang.Math.round(childAt2.getTranslationX());
            this.getHighResolutionOutputSizeshNQ4ISI.setBounds(round2 - this.getHighResolutionOutputSizeshNQ4ISI.getIntrinsicWidth(), i, round2, height);
            this.getHighResolutionOutputSizeshNQ4ISI.draw(canvas);
            i3++;
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
        android.graphics.drawable.Drawable drawable = this.getHighResolutionOutputSizeshNQ4ISI;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.getHighSpeedVideoSizes == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }
}
