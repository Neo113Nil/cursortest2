package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class e2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bitmap f3610b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f3611c;

    public e2(String str, Bitmap bitmap, Context context) {
        this.f3609a = str;
        this.f3610b = bitmap;
        this.f3611c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f2.f3671a.put(this.f3609a.concat(".png"), this.f3610b);
        try {
            Context context = this.f3611c;
            String concat = this.f3609a.concat(".png");
            File file = new File(context.getCacheDir(), "StartIoImages");
            file.mkdirs();
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, concat));
            try {
                this.f3610b.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable unused) {
        }
    }
}
