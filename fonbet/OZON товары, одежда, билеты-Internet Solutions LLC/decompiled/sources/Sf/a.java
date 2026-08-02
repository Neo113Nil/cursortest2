package Sf;

import androidx.annotation.NonNull;
import org.maplibre.android.maps.MapLibreMap;

@Deprecated
/* loaded from: classes10.dex */
public abstract class a implements Comparable<a> {

    /* renamed from: a, reason: collision with root package name */
    private long f26192a = -1;

    /* renamed from: b, reason: collision with root package name */
    protected MapLibreMap f26193b;

    protected a() {
    }

    public final long a() {
        return this.f26192a;
    }

    public final void b(long j11) {
        this.f26192a = j11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull a aVar) {
        long j11 = this.f26192a;
        long j12 = aVar.f26192a;
        if (j11 < j12) {
            return 1;
        }
        return j11 > j12 ? -1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof a) && this.f26192a == ((a) obj).f26192a;
    }

    public final int hashCode() {
        long j11 = this.f26192a;
        return (int) (j11 ^ (j11 >>> 32));
    }
}
