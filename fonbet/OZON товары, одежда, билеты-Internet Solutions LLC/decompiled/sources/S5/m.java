package S5;

import V5.v;
import android.content.Context;
import android.graphics.Bitmap;
import c6.C5753e;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class m implements T5.m<k> {

    /* renamed from: b, reason: collision with root package name */
    private final T5.m<Bitmap> f25835b;

    public m(T5.m<Bitmap> mVar) {
        p6.k.c(mVar, "Argument must not be null");
        this.f25835b = mVar;
    }

    @Override // T5.f
    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f25835b.equals(((m) obj).f25835b);
        }
        return false;
    }

    @Override // T5.f
    public final int hashCode() {
        return this.f25835b.hashCode();
    }

    @Override // T5.m
    public final v<k> transform(Context context, v<k> vVar, int i11, int i12) {
        k kVar = vVar.get();
        C5753e c5753e = new C5753e(com.bumptech.glide.c.a(context).c(), kVar.c());
        T5.m<Bitmap> mVar = this.f25835b;
        v<Bitmap> transform = mVar.transform(context, c5753e, i11, i12);
        if (!c5753e.equals(transform)) {
            c5753e.a();
        }
        kVar.f(mVar, transform.get());
        return vVar;
    }

    @Override // T5.f
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f25835b.updateDiskCacheKey(messageDigest);
    }
}
