package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.startapp.sdk.internal.j2;
import com.startapp.sdk.internal.si;
import com.startapp.startappsdk.R;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ImageResourceConfig implements Serializable {
    private static final long serialVersionUID = -8927634568015374287L;

    /* renamed from: a, reason: collision with root package name */
    public volatile transient Bitmap f3146a;
    private int height;
    private String imageUrlSecured;
    private String name;
    private int width;

    public static Drawable a(Context context) {
        Drawable drawable = context.getDrawable(R.drawable.io_start_info);
        return drawable != null ? drawable : new ColorDrawable(-1728053248);
    }

    public final Drawable b(Context context) {
        Bitmap bitmap;
        return (this.imageUrlSecured == null || (bitmap = this.f3146a) == null) ? a(context) : new BitmapDrawable(context.getResources(), bitmap);
    }

    public final String c() {
        return this.name;
    }

    public final int d() {
        return this.width;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ImageResourceConfig imageResourceConfig = (ImageResourceConfig) obj;
            if (this.width == imageResourceConfig.width && this.height == imageResourceConfig.height && si.a((Object) this.imageUrlSecured, (Object) imageResourceConfig.imageUrlSecured) && si.a((Object) this.name, (Object) imageResourceConfig.name)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.imageUrlSecured, Integer.valueOf(this.width), Integer.valueOf(this.height), this.name};
        WeakHashMap weakHashMap = si.f4343a;
        return Arrays.deepHashCode(objArr);
    }

    public final void c(Context context) {
        String str = this.imageUrlSecured;
        if (str == null) {
            return;
        }
        j2 j2Var = new j2(context, str, new F1.b(17, this), 0);
        j2Var.f3890b = true;
        j2Var.a();
    }

    public final int a() {
        return this.height;
    }

    public final /* synthetic */ void a(Bitmap bitmap, int i3) {
        this.f3146a = bitmap;
    }

    public final String b() {
        return this.imageUrlSecured;
    }
}
