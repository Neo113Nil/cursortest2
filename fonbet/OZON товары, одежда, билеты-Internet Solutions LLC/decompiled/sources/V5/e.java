package V5;

import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* loaded from: classes.dex */
final class e implements T5.f {

    /* renamed from: b, reason: collision with root package name */
    private final T5.f f28133b;

    /* renamed from: c, reason: collision with root package name */
    private final T5.f f28134c;

    e(T5.f fVar, T5.f fVar2) {
        this.f28133b = fVar;
        this.f28134c = fVar2;
    }

    @Override // T5.f
    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f28133b.equals(eVar.f28133b) && this.f28134c.equals(eVar.f28134c)) {
                return true;
            }
        }
        return false;
    }

    @Override // T5.f
    public final int hashCode() {
        return this.f28134c.hashCode() + (this.f28133b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f28133b + ", signature=" + this.f28134c + '}';
    }

    @Override // T5.f
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        this.f28133b.updateDiskCacheKey(messageDigest);
        this.f28134c.updateDiskCacheKey(messageDigest);
    }
}
