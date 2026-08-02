package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
final class zzb extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    private final android.graphics.drawable.Drawable zza;

    public zzb(android.content.Context context, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.google.android.libraries.places.R.drawable.about_tab_horizontal_divider, new android.view.ContextThemeWrapper(context, i).getTheme());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(drawable, "");
        this.zza = drawable;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recyclerView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        androidx.recyclerview.widget.RecyclerView.Adapter adapter = recyclerView.getAdapter();
        com.google.android.libraries.places.widget.internal.placedetails.zzl zzlVar = adapter instanceof com.google.android.libraries.places.widget.internal.placedetails.zzl ? (com.google.android.libraries.places.widget.internal.placedetails.zzl) adapter : null;
        if (zzlVar == null || !zzlVar.zza(childAdapterPosition)) {
            return;
        }
        rect.bottom = this.zza.getIntrinsicHeight();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recyclerView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        if (recyclerView.getAdapter() != null) {
            int paddingLeft = recyclerView.getPaddingLeft();
            int width = recyclerView.getWidth();
            int paddingRight = recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = recyclerView.getChildAt(i);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition != -1) {
                    androidx.recyclerview.widget.RecyclerView.Adapter adapter = recyclerView.getAdapter();
                    com.google.android.libraries.places.widget.internal.placedetails.zzl zzlVar = adapter instanceof com.google.android.libraries.places.widget.internal.placedetails.zzl ? (com.google.android.libraries.places.widget.internal.placedetails.zzl) adapter : null;
                    if (zzlVar != null && zzlVar.zza(childAdapterPosition)) {
                        android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(layoutParams, "");
                        int bottom = childAt.getBottom() + ((androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams).bottomMargin;
                        android.graphics.drawable.Drawable drawable = this.zza;
                        drawable.setBounds(paddingLeft, bottom, width - paddingRight, drawable.getIntrinsicHeight() + bottom);
                        drawable.draw(canvas);
                    }
                }
            }
        }
    }
}
