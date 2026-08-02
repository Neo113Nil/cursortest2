package G5;

import H5.i;
import O5.c;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private final AssetManager f9719d;

    /* renamed from: a, reason: collision with root package name */
    private final i<String> f9716a = new i<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f9717b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f9718c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private String f9720e = ".ttf";

    public a(Drawable.Callback callback) {
        if (callback instanceof View) {
            this.f9719d = ((View) callback).getContext().getAssets();
        } else {
            c.c("LottieDrawable must be inside of a view for images to work.");
            this.f9719d = null;
        }
    }

    public final Typeface a(H5.c cVar) {
        String a11 = cVar.a();
        String c11 = cVar.c();
        i<String> iVar = this.f9716a;
        iVar.a(a11, c11);
        HashMap hashMap = this.f9717b;
        Typeface typeface = (Typeface) hashMap.get(iVar);
        if (typeface != null) {
            return typeface;
        }
        String a12 = cVar.a();
        HashMap hashMap2 = this.f9718c;
        Typeface typeface2 = (Typeface) hashMap2.get(a12);
        if (typeface2 == null) {
            if (cVar.d() != null) {
                typeface2 = cVar.d();
            } else {
                typeface2 = Typeface.createFromAsset(this.f9719d, "fonts/" + a12 + this.f9720e);
                hashMap2.put(a12, typeface2);
            }
        }
        String c12 = cVar.c();
        boolean contains = c12.contains("Italic");
        boolean contains2 = c12.contains("Bold");
        int i11 = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        if (typeface2.getStyle() != i11) {
            typeface2 = Typeface.create(typeface2, i11);
        }
        hashMap.put(iVar, typeface2);
        return typeface2;
    }

    public final void b(String str) {
        this.f9720e = str;
    }
}
