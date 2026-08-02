package T5;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p6.C8862b;

/* loaded from: classes.dex */
public final class i implements f {

    /* renamed from: b, reason: collision with root package name */
    private final C8862b f26669b = new C8862b();

    public final <T> T a(@NonNull h<T> hVar) {
        C8862b c8862b = this.f26669b;
        return c8862b.containsKey(hVar) ? (T) c8862b.get(hVar) : hVar.b();
    }

    public final void b(@NonNull i iVar) {
        this.f26669b.k(iVar.f26669b);
    }

    public final void c(@NonNull h hVar) {
        this.f26669b.remove(hVar);
    }

    @NonNull
    public final void d(@NonNull h hVar, @NonNull Object obj) {
        this.f26669b.put(hVar, obj);
    }

    @Override // T5.f
    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f26669b.equals(((i) obj).f26669b);
        }
        return false;
    }

    @Override // T5.f
    public final int hashCode() {
        return this.f26669b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f26669b + '}';
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // T5.f
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        int i11 = 0;
        while (true) {
            C8862b c8862b = this.f26669b;
            if (i11 >= c8862b.size()) {
                return;
            }
            ((h) c8862b.j(i11)).e(c8862b.n(i11), messageDigest);
            i11++;
        }
    }
}
