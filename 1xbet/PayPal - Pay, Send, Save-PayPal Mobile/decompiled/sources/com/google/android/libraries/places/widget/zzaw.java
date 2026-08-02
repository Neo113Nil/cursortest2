package com.google.android.libraries.places.widget;

/* loaded from: classes8.dex */
public final class zzaw extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    final /* synthetic */ com.google.android.libraries.places.widget.PlaceSearchFragment zza;

    zzaw(com.google.android.libraries.places.widget.PlaceSearchFragment placeSearchFragment) {
        this.zza = placeSearchFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r1 != false) goto L11;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
        int zzl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recyclerView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        int layoutDirection = recyclerView.getLayoutDirection();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int itemCount = state.getItemCount();
        boolean z = true;
        boolean z2 = layoutDirection == 1;
        if (childAdapterPosition != itemCount - 1) {
            z = z2;
        }
        if (childAdapterPosition != 0 || !z) {
            com.google.android.libraries.places.widget.PlaceSearchFragment placeSearchFragment = this.zza;
            android.content.Context requireContext = placeSearchFragment.requireContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
            zzl = placeSearchFragment.zzl();
            int[] iArr = com.google.android.libraries.places.R.styleable.PlacesMaterialThemeAttrs;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iArr, "");
            android.content.res.TypedArray obtainStyledAttributes = requireContext.obtainStyledAttributes(zzl, iArr);
            rect.set(0, 0, (int) obtainStyledAttributes.getDimension(com.google.android.libraries.places.R.styleable.PlacesMaterialThemeAttrs_placesSpacingMedium, placeSearchFragment.requireContext().getResources().getDimensionPixelSize(com.google.android.libraries.places.R.dimen.gmp_sys_measurement_spacing_medium)), 0);
            obtainStyledAttributes.recycle();
            return;
        }
        rect.set(0, 0, 0, 0);
    }
}
