package com.google.android.material.divider;

/* loaded from: classes8.dex */
public class MaterialDividerItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_MaterialComponents_MaterialDivider;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    private int color;
    private android.graphics.drawable.Drawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private boolean lastItemDecorated;
    private int orientation;
    private final android.graphics.Rect tempRect;
    private int thickness;

    protected boolean shouldDrawDivider(int i, androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter) {
        return true;
    }

    public MaterialDividerItemDecoration(android.content.Context context, int i) {
        this(context, null, i);
    }

    public MaterialDividerItemDecoration(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, com.google.android.material.R.attr.materialDividerStyle, i);
    }

    public MaterialDividerItemDecoration(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        this.tempRect = new android.graphics.Rect();
        android.content.res.TypedArray obtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context, attributeSet, com.google.android.material.R.styleable.MaterialDivider, i, DEF_STYLE_RES, new int[0]);
        this.color = com.google.android.material.resources.MaterialResources.getColorStateList(context, obtainStyledAttributes, com.google.android.material.R.styleable.MaterialDivider_dividerColor).getDefaultColor();
        this.thickness = obtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.material_divider_thickness));
        this.insetStart = obtainStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.insetEnd = obtainStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.MaterialDivider_dividerInsetEnd, 0);
        this.lastItemDecorated = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.MaterialDivider_lastItemDecorated, true);
        obtainStyledAttributes.recycle();
        this.dividerDrawable = new android.graphics.drawable.ShapeDrawable();
        setDividerColor(this.color);
        setOrientation(i2);
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid orientation: ");
            sb.append(i);
            sb.append(". It should be either HORIZONTAL or VERTICAL");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.orientation = i;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public void setDividerThickness(int i) {
        this.thickness = i;
    }

    public void setDividerThicknessResource(android.content.Context context, int i) {
        setDividerThickness(context.getResources().getDimensionPixelSize(i));
    }

    public int getDividerThickness() {
        return this.thickness;
    }

    public void setDividerColor(int i) {
        this.color = i;
        android.graphics.drawable.Drawable wrap = androidx.core.graphics.drawable.DrawableCompat.wrap(this.dividerDrawable);
        this.dividerDrawable = wrap;
        androidx.core.graphics.drawable.DrawableCompat.setTint(wrap, i);
    }

    public void setDividerColorResource(android.content.Context context, int i) {
        setDividerColor(androidx.core.content.ContextCompat.getColor(context, i));
    }

    public int getDividerColor() {
        return this.color;
    }

    public void setDividerInsetStart(int i) {
        this.insetStart = i;
    }

    public void setDividerInsetStartResource(android.content.Context context, int i) {
        setDividerInsetStart(context.getResources().getDimensionPixelOffset(i));
    }

    public int getDividerInsetStart() {
        return this.insetStart;
    }

    public void setDividerInsetEnd(int i) {
        this.insetEnd = i;
    }

    public void setDividerInsetEndResource(android.content.Context context, int i) {
        setDividerInsetEnd(context.getResources().getDimensionPixelOffset(i));
    }

    public int getDividerInsetEnd() {
        return this.insetEnd;
    }

    public void setLastItemDecorated(boolean z) {
        this.lastItemDecorated = z;
    }

    public boolean isLastItemDecorated() {
        return this.lastItemDecorated;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (this.orientation == 1) {
            drawForVerticalOrientation(canvas, recyclerView);
        } else {
            drawForHorizontalOrientation(canvas, recyclerView);
        }
    }

    private void drawForVerticalOrientation(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView) {
        int width;
        int i;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i = 0;
        }
        boolean isLayoutRtl = com.google.android.material.internal.ViewUtils.isLayoutRtl(recyclerView);
        int i2 = isLayoutRtl ? this.insetEnd : this.insetStart;
        int i3 = isLayoutRtl ? this.insetStart : this.insetEnd;
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            android.view.View childAt = recyclerView.getChildAt(i4);
            if (shouldDrawDivider(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.tempRect);
                int round = this.tempRect.bottom + java.lang.Math.round(childAt.getTranslationY());
                this.dividerDrawable.setBounds(i + i2, round - this.thickness, width - i3, round);
                this.dividerDrawable.setAlpha(java.lang.Math.round(childAt.getAlpha() * 255.0f));
                this.dividerDrawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    private void drawForHorizontalOrientation(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView) {
        int height;
        int i;
        int i2;
        int i3;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i = 0;
        }
        int i4 = this.insetStart;
        int i5 = this.insetEnd;
        boolean isLayoutRtl = com.google.android.material.internal.ViewUtils.isLayoutRtl(recyclerView);
        int childCount = recyclerView.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = recyclerView.getChildAt(i6);
            if (shouldDrawDivider(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.tempRect);
                int round = java.lang.Math.round(childAt.getTranslationX());
                if (isLayoutRtl) {
                    i3 = this.tempRect.left + round;
                    i2 = this.thickness + i3;
                } else {
                    i2 = round + this.tempRect.right;
                    i3 = i2 - this.thickness;
                }
                this.dividerDrawable.setBounds(i3, i + i4, i2, height - i5);
                this.dividerDrawable.setAlpha(java.lang.Math.round(childAt.getAlpha() * 255.0f));
                this.dividerDrawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
        rect.set(0, 0, 0, 0);
        if (shouldDrawDivider(recyclerView, view)) {
            if (this.orientation == 1) {
                rect.bottom = this.thickness;
            } else if (com.google.android.material.internal.ViewUtils.isLayoutRtl(recyclerView)) {
                rect.left = this.thickness;
            } else {
                rect.right = this.thickness;
            }
        }
    }

    private boolean shouldDrawDivider(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        androidx.recyclerview.widget.RecyclerView.Adapter adapter = recyclerView.getAdapter();
        return childAdapterPosition != -1 && (!(adapter != null && childAdapterPosition == adapter.getItemCount() - 1) || this.lastItemDecorated) && shouldDrawDivider(childAdapterPosition, (androidx.recyclerview.widget.RecyclerView.Adapter<?>) adapter);
    }
}
