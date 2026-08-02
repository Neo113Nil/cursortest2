package com.google.android.libraries.places.widget.internal.placedetails;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/google/android/libraries/places/widget/internal/placedetails/RatingStarsView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "stars", "", "Landroid/widget/ImageView;", "[Landroid/widget/ImageView;", "setRating", "", "rating", "", "StarsModel", "java.com.google.android.libraries.places.widget.internal.placedetails_rating_stars_view_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RatingStarsView extends android.widget.FrameLayout {
    private final android.widget.ImageView[] zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingStarsView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.view.LayoutInflater.from(context).inflate(com.google.android.libraries.places.R.layout.rating_stars_view, this);
        android.view.View findViewById = findViewById(com.google.android.libraries.places.R.id.rating_star_1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        android.view.View findViewById2 = findViewById(com.google.android.libraries.places.R.id.rating_star_2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        android.view.View findViewById3 = findViewById(com.google.android.libraries.places.R.id.rating_star_3);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        android.view.View findViewById4 = findViewById(com.google.android.libraries.places.R.id.rating_star_4);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        android.view.View findViewById5 = findViewById(com.google.android.libraries.places.R.id.rating_star_5);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.zza = new android.widget.ImageView[]{(android.widget.ImageView) findViewById, (android.widget.ImageView) findViewById2, (android.widget.ImageView) findViewById3, (android.widget.ImageView) findViewById4, (android.widget.ImageView) findViewById5};
    }

    public final void zza(double d) {
        com.google.android.libraries.places.widget.internal.placedetails.zzbs zza = com.google.android.libraries.places.widget.internal.placedetails.zzbr.zza(d);
        android.widget.ImageView[] imageViewArr = this.zza;
        int length = imageViewArr.length;
        for (int i = 0; i < 5; i++) {
            imageViewArr[i].setImageDrawable(getResources().getDrawable(zza.zza(i), getContext().getTheme()));
        }
    }

    public /* synthetic */ RatingStarsView(android.content.Context context, android.util.AttributeSet attributeSet, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RatingStarsView(android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }
}
