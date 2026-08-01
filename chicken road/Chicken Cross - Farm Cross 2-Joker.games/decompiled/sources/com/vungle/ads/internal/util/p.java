package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.vungle.ads.internal.g1;
import com.vungle.ads.internal.k1;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes7.dex */
public final class p {
    public static final p b = new p();

    /* renamed from: a, reason: collision with root package name */
    public Executor f12188a;

    public final void a(com.vungle.ads.internal.executor.j ioExecutor) {
        Intrinsics.checkNotNullParameter(ioExecutor, "ioExecutor");
        this.f12188a = ioExecutor;
    }

    public final void a(final String str, final g1 onImageLoaded) {
        Intrinsics.checkNotNullParameter(onImageLoaded, "onImageLoaded");
        if (this.f12188a == null) {
            boolean z = u.f12190a;
            Intrinsics.checkNotNullExpressionValue("p", "TAG");
            t.c("p", "ImageLoader not initialized.");
        } else if (str.length() == 0) {
            boolean z2 = u.f12190a;
            Intrinsics.checkNotNullExpressionValue("p", "TAG");
            t.c("p", "the uri is required.");
        } else {
            Executor executor = this.f12188a;
            if (executor != null) {
                executor.execute(new Runnable() { // from class: com.vungle.ads.internal.util.p$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        p.a(str, onImageLoaded);
                    }
                });
            }
        }
    }

    public static final void a(String str, Function1 onImageLoaded) {
        Intrinsics.checkNotNullParameter(onImageLoaded, "$onImageLoaded");
        if (StringsKt.startsWith$default(str, "file://", false, 2, (Object) null)) {
            String substring = str.substring(7);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            Bitmap decodeFile = BitmapFactory.decodeFile(substring);
            if (decodeFile != null) {
                onImageLoaded.invoke(decodeFile);
                return;
            }
            boolean z = u.f12190a;
            Intrinsics.checkNotNullExpressionValue("p", "TAG");
            t.c("p", "decode bitmap failed.");
        }
    }

    public static void a(String str, k1 onImageSizeLoaded) {
        Intrinsics.checkNotNullParameter(onImageSizeLoaded, "onImageSizeLoaded");
        if (str.length() != 0 && StringsKt.startsWith$default(str, "file://", false, 2, (Object) null)) {
            String substring = str.substring(7);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(substring, options);
            onImageSizeLoaded.invoke(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            return;
        }
        boolean z = u.f12190a;
        Intrinsics.checkNotNullExpressionValue("p", "TAG");
        t.c("p", "the valid uri is required.");
    }
}
