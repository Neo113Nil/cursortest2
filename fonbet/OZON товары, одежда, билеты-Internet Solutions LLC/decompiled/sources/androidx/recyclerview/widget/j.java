package androidx.recyclerview.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes8.dex */
public class j extends RecyclerView.n {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f44936d = {R.attr.listDivider};

    /* renamed from: a, reason: collision with root package name */
    private Drawable f44937a;

    /* renamed from: b, reason: collision with root package name */
    private int f44938b;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f44939c = new Rect();

    public j(Context context, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f44936d);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f44937a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f44938b = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.A a11) {
        Drawable drawable = this.f44937a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f44938b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.A a11) {
        int height;
        int i11;
        int width;
        int i12;
        if (recyclerView.getLayoutManager() == null || this.f44937a == null) {
            return;
        }
        int i13 = this.f44938b;
        Rect rect = this.f44939c;
        int i14 = 0;
        if (i13 == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i12 = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(i12, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                i12 = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i14 < childCount) {
                View childAt = recyclerView.getChildAt(i14);
                recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
                int round = Math.round(childAt.getTranslationY()) + rect.bottom;
                this.f44937a.setBounds(i12, round - this.f44937a.getIntrinsicHeight(), width, round);
                this.f44937a.draw(canvas);
                i14++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i11 = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i11, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i11 = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i14 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i14);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt2, rect);
            int round2 = Math.round(childAt2.getTranslationX()) + rect.right;
            this.f44937a.setBounds(round2 - this.f44937a.getIntrinsicWidth(), i11, round2, height);
            this.f44937a.draw(canvas);
            i14++;
        }
        canvas.restore();
    }

    public final void setDrawable(@NonNull Drawable drawable) {
        this.f44937a = drawable;
    }
}
