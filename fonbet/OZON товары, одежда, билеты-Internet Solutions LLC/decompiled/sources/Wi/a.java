package Wi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

/* loaded from: classes10.dex */
public final class a extends RecyclerView.n {

    /* renamed from: h, reason: collision with root package name */
    private static final float f33876h;

    /* renamed from: i, reason: collision with root package name */
    private static final float f33877i;

    /* renamed from: j, reason: collision with root package name */
    private static final int f33878j;

    /* renamed from: k, reason: collision with root package name */
    private static final int f33879k;

    /* renamed from: a, reason: collision with root package name */
    private final int f33880a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final RectF f33881b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final RectF f33882c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Rect f33883d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Rect f33884e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Rect f33885f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Path f33886g;

    static {
        float pxF = UiExtKt.toPxF(24);
        f33876h = pxF;
        f33877i = pxF * 2;
        f33878j = UiExtKt.toPx(16);
        f33879k = UiExtKt.toPx(4);
    }

    public a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f33880a = UiExtKt.toPx(2, context);
        this.f33881b = new RectF();
        this.f33882c = new RectF();
        this.f33883d = new Rect();
        this.f33884e = new Rect();
        this.f33885f = new Rect();
        this.f33886g = new Path();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.o layoutManager = parent.getLayoutManager();
        StaggeredGridLayoutManager staggeredGridLayoutManager = layoutManager instanceof StaggeredGridLayoutManager ? (StaggeredGridLayoutManager) layoutManager : null;
        if (staggeredGridLayoutManager != null) {
            int o11 = staggeredGridLayoutManager.o();
            int i11 = o11 - 1;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            StaggeredGridLayoutManager.c cVar = layoutParams instanceof StaggeredGridLayoutManager.c ? (StaggeredGridLayoutManager.c) layoutParams : null;
            if (cVar != null) {
                int childAdapterPosition = parent.getChildAdapterPosition(view);
                if (cVar.d()) {
                    if (view.getId() == R.id.container) {
                        int i12 = f33878j;
                        outRect.set(i12, 0, i12, 0);
                        return;
                    }
                    return;
                }
                int i13 = childAdapterPosition < o11 ? f33879k : 0;
                int c11 = cVar.c();
                int i14 = this.f33880a;
                if (c11 == 0) {
                    outRect.set(0, i13, 0, i14);
                    return;
                }
                if (c11 == i11) {
                    outRect.set(i14, i13, 0, i14);
                } else if (c11 == -1) {
                    outRect.setEmpty();
                } else {
                    outRect.set(i14, i13, 0, i14);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        RecyclerView.C childViewHolder;
        RecyclerView.C childViewHolder2;
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.o layoutManager = parent.getLayoutManager();
        StaggeredGridLayoutManager staggeredGridLayoutManager = layoutManager instanceof StaggeredGridLayoutManager ? (StaggeredGridLayoutManager) layoutManager : null;
        if (staggeredGridLayoutManager != null) {
            Rect rect = this.f33883d;
            rect.setEmpty();
            Rect rect2 = this.f33884e;
            rect2.setEmpty();
            Rect rect3 = this.f33885f;
            rect3.setEmpty();
            int o11 = staggeredGridLayoutManager.o();
            Intrinsics.checkNotNullParameter(parent, "<this>");
            Intrinsics.checkNotNullParameter(parent, "<this>");
            int i11 = 0;
            View childAt = parent.getChildAt(0);
            RectF rectF = this.f33882c;
            int i12 = 1;
            if (childAt == null || (childViewHolder2 = parent.getChildViewHolder(childAt)) == null || childViewHolder2.getItemViewType() != 3) {
                rectF.setEmpty();
            } else {
                parent.getDecoratedBoundsWithMargins(childAt, rect);
                rectF.set(rect);
                rect.setEmpty();
                childAt = parent.getChildAt(1);
                i11 = 1;
            }
            if (childAt != null && (childViewHolder = parent.getChildViewHolder(childAt)) != null && childViewHolder.getItemViewType() == 4) {
                if (rectF.isEmpty()) {
                    parent.getDecoratedBoundsWithMargins(childAt, rect);
                    rectF.set(rect);
                } else {
                    RectF rectF2 = new RectF();
                    parent.getDecoratedBoundsWithMargins(childAt, rect);
                    rectF2.set(rect);
                    rectF.union(rectF2);
                }
                i11++;
                childAt = parent.getChildAt(i11);
            }
            if (childAt != null) {
                childAt.getHitRect(rect);
            }
            Integer valueOf = childAt != null ? Integer.valueOf(parent.getChildAdapterPosition(childAt)) : null;
            float f7 = f33876h;
            if (valueOf == null || valueOf.intValue() - i11 != 0) {
                rect.top = (int) (rect.top - f7);
            }
            int childCount = parent.getChildCount();
            while (i11 < childCount) {
                View childAt2 = parent.getChildAt(i11);
                Intrinsics.f(childAt2);
                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                int i13 = i12;
                StaggeredGridLayoutManager.c cVar = layoutParams instanceof StaggeredGridLayoutManager.c ? (StaggeredGridLayoutManager.c) layoutParams : null;
                if (cVar == null || cVar.c() != o11 - 1) {
                    ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                    StaggeredGridLayoutManager.c cVar2 = layoutParams2 instanceof StaggeredGridLayoutManager.c ? (StaggeredGridLayoutManager.c) layoutParams2 : null;
                    if (cVar2 != null) {
                        i12 = i13;
                        if (cVar2.d() == i12) {
                        }
                    } else {
                        i12 = i13;
                    }
                    if (i11 != parent.getChildCount() - i12) {
                        i11++;
                    }
                } else {
                    i12 = i13;
                }
                childAt2.getHitRect(rect3);
                break;
            }
            Intrinsics.checkNotNullParameter(parent, "<this>");
            int childCount2 = parent.getChildCount() - i12;
            Intrinsics.checkNotNullParameter(parent, "<this>");
            View childAt3 = parent.getChildAt(childCount2);
            if (childAt3 != null) {
                childAt3.getHitRect(rect2);
            }
            if (rect.bottom > rect2.bottom) {
                rect2 = rect;
            } else if (childAt3 == null || parent.getChildAdapterPosition(childAt3) != state.b() - 1) {
                rect2.bottom = (int) (rect2.bottom + f7);
            }
            RectF rectF3 = this.f33881b;
            rectF3.set(rect.left, rect.top, rect3.right, rect2.bottom);
            Path path = this.f33886g;
            path.reset();
            Path.Direction direction = Path.Direction.CW;
            path.addRect(rectF, direction);
            path.addRoundRect(rectF3, f7, f7, direction);
            c11.clipPath(path);
            path.reset();
            float f11 = rect2.right;
            float f12 = rect2.bottom;
            path.moveTo(f11, parent.getHeight());
            float f13 = f33877i;
            path.arcTo(f11 - f13, f12 - f13, f11, f12, 90.0f, -90.0f, false);
            path.lineTo(f11, f12);
            path.lineTo(f11 - f7, f12);
            c11.clipOutPath(path);
        }
    }
}
