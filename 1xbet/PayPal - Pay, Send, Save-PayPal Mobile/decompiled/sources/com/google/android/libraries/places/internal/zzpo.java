package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzpo extends com.bumptech.glide.request.target.ImageViewTarget {
    private final android.widget.ImageView zza;
    private final kotlin.jvm.functions.Function1 zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzpo(android.widget.ImageView imageView, kotlin.jvm.functions.Function1 function1) {
        super(imageView);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageView, "");
        this.zza = imageView;
        this.zzb = function1;
    }

    public final void onLoadFailed(android.graphics.drawable.Drawable drawable) {
        kotlin.jvm.functions.Function1 function1 = this.zzb;
        if (function1 != null) {
            function1.invoke(this.zza);
        }
    }

    public final /* synthetic */ void setResource(java.lang.Object obj) {
        final android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        this.zza.post(new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzpn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.libraries.places.internal.zzpo.this.zza.setImageBitmap(bitmap);
            }
        });
    }
}
