package com.startapp.sdk.ads.nativead;

import android.graphics.Bitmap;
import com.startapp.sdk.internal.i2;

/* loaded from: classes.dex */
public final class c implements i2 {

    /* renamed from: a, reason: collision with root package name */
    public int f3014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f3015b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f3016c;

    public c(NativeAdDetails nativeAdDetails, Runnable runnable) {
        this.f3016c = nativeAdDetails;
        this.f3015b = runnable;
    }

    @Override // com.startapp.sdk.internal.i2
    public final void a(Bitmap bitmap, int i3) {
        if (i3 == 0) {
            this.f3016c.setImageBitmap(bitmap);
        } else {
            this.f3016c.setSecondaryImageBitmap(bitmap);
        }
        int i4 = this.f3014a + 1;
        this.f3014a = i4;
        if (i4 == 2) {
            this.f3015b.run();
        }
    }
}
