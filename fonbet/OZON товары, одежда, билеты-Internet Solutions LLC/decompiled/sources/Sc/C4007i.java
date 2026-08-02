package Sc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LSc/i;", "", "e", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Sc.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4007i implements Comparable<C4007i> {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final C4007i f26099f = new C4007i(2, 0, 21);

    /* renamed from: a, reason: collision with root package name */
    private final int f26100a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26101b;

    /* renamed from: c, reason: collision with root package name */
    private final int f26102c;

    /* renamed from: d, reason: collision with root package name */
    private final int f26103d;

    public C4007i(int i11, int i12, int i13) {
        this.f26100a = i11;
        this.f26101b = i12;
        this.f26102c = i13;
        if (i11 >= 0 && i11 < 256 && i12 >= 0 && i12 < 256 && i13 >= 0 && i13 < 256) {
            this.f26103d = (i11 << 16) + (i12 << 8) + i13;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i11 + '.' + i12 + '.' + i13).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NotNull C4007i other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f26103d - other.f26103d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C4007i c4007i = obj instanceof C4007i ? (C4007i) obj : null;
        return c4007i != null && this.f26103d == c4007i.f26103d;
    }

    /* renamed from: hashCode, reason: from getter */
    public final int getF26103d() {
        return this.f26103d;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f26100a);
        sb2.append('.');
        sb2.append(this.f26101b);
        sb2.append('.');
        sb2.append(this.f26102c);
        return sb2.toString();
    }
}
