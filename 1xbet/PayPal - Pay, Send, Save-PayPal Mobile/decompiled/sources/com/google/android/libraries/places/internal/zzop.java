package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzop {
    public static final void zza(final android.view.View view, final android.view.View view2, final android.content.Context context, int i, final int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        final int i3 = 48;
        view2.post(new java.lang.Runnable(context, view, i3, i2, view2) { // from class: com.google.android.libraries.places.internal.zzon
            private final /* synthetic */ android.content.Context zza;
            private final /* synthetic */ android.view.View zzb;
            private final /* synthetic */ int zzc;
            private final /* synthetic */ android.view.View zzd;

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                float f = this.zza.getResources().getDisplayMetrics().density;
                android.graphics.Rect rect = new android.graphics.Rect();
                android.view.View view3 = this.zzb;
                view3.getHitRect(rect);
                float height = rect.height() / f;
                float width = rect.width() / f;
                int i4 = width < 48.0f ? (int) (((48.0f - width) * f) / 2.0f) : 0;
                float f2 = this.zzc;
                int i5 = height < f2 ? (int) (((f2 - height) * f) / 2.0f) : 0;
                android.view.View view4 = this.zzd;
                rect.set(rect.left - i4, rect.top - i5, rect.right + i4, rect.bottom + i5);
                view4.setTouchDelegate(new android.view.TouchDelegate(rect, view3));
            }

            {
                this.zzc = i2;
                this.zzd = view2;
            }
        });
    }

    public static final void zzb(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        view.setAccessibilityDelegate(new com.google.android.libraries.places.internal.zzoo());
    }
}
