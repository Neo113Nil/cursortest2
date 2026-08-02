package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
public final class zzcf extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final androidx.constraintlayout.widget.ConstraintLayout zza;
    private final android.widget.ImageView zzb;
    private final android.widget.TextView zzc;
    private final android.widget.TextView zzd;
    private final com.google.android.libraries.places.widget.internal.placedetails.RatingStarsView zze;
    private final android.widget.TextView zzf;
    private final android.widget.TextView zzg;
    private final android.widget.ImageView zzh;
    private final android.widget.TextView zzi;
    private final android.widget.TextView zzj;
    private final android.widget.TextView zzk;
    private final android.view.View zzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcf(android.view.View view) {
        super(view);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        android.view.View findViewById = view.findViewById(com.google.android.libraries.places.R.id.author_attribution);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.zza = (androidx.constraintlayout.widget.ConstraintLayout) findViewById;
        android.view.View findViewById2 = view.findViewById(com.google.android.libraries.places.R.id.author_image);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.zzb = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.google.android.libraries.places.R.id.author_name);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.zzc = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = view.findViewById(com.google.android.libraries.places.R.id.publish_time);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.zzd = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = view.findViewById(com.google.android.libraries.places.R.id.rating_stars);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.zze = (com.google.android.libraries.places.widget.internal.placedetails.RatingStarsView) findViewById5;
        android.view.View findViewById6 = view.findViewById(com.google.android.libraries.places.R.id.review_text);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.zzf = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = view.findViewById(com.google.android.libraries.places.R.id.visit_date);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById7, "");
        this.zzg = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = view.findViewById(com.google.android.libraries.places.R.id.review_options);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById8, "");
        this.zzh = (android.widget.ImageView) findViewById8;
        android.view.View findViewById9 = view.findViewById(com.google.android.libraries.places.R.id.translated_by_google);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById9, "");
        this.zzi = (android.widget.TextView) findViewById9;
        android.view.View findViewById10 = view.findViewById(com.google.android.libraries.places.R.id.see_original);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById10, "");
        this.zzj = (android.widget.TextView) findViewById10;
        android.view.View findViewById11 = view.findViewById(com.google.android.libraries.places.R.id.see_translation);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById11, "");
        this.zzk = (android.widget.TextView) findViewById11;
        android.view.View findViewById12 = view.findViewById(com.google.android.libraries.places.R.id.translation_options);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById12, "");
        this.zzl = findViewById12;
    }

    public final android.view.View zzl() {
        return this.zzl;
    }

    public final android.widget.TextView zzk() {
        return this.zzk;
    }

    public final android.widget.TextView zzj() {
        return this.zzj;
    }

    public final android.widget.TextView zzi() {
        return this.zzi;
    }

    public final android.widget.ImageView zzh() {
        return this.zzh;
    }

    public final android.widget.TextView zzg() {
        return this.zzg;
    }

    public final android.widget.TextView zzf() {
        return this.zzf;
    }

    public final com.google.android.libraries.places.widget.internal.placedetails.RatingStarsView zze() {
        return this.zze;
    }

    public final android.widget.TextView zzd() {
        return this.zzd;
    }

    public final android.widget.TextView zzc() {
        return this.zzc;
    }

    public final android.widget.ImageView zzb() {
        return this.zzb;
    }

    public final androidx.constraintlayout.widget.ConstraintLayout zza() {
        return this.zza;
    }
}
