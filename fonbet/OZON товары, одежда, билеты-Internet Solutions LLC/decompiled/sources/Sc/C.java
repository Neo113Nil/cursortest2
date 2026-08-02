package Sc;

import ed.InterfaceC6346b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003\u0088\u0001\u0004\u0092\u0001\u00020\u0005¨\u0006\u0006"}, d2 = {"LSc/C;", "", "b", "a", "data", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class C implements Comparable<C> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f26092a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0086Tø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0005\u001a\u00020\u00028\u0006X\u0086Tø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b\u0082\u0002\u0004\n\u0002\b!¨\u0006\n"}, d2 = {"LSc/C$a;", "", "LSc/C;", "MAX_VALUE", "J", "MIN_VALUE", "", "SIZE_BITS", "I", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sc.C$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    private /* synthetic */ C(long j11) {
        this.f26092a = j11;
    }

    public static final /* synthetic */ C a(long j11) {
        return new C(j11);
    }

    /* renamed from: b, reason: from getter */
    public final /* synthetic */ long getF26092a() {
        return this.f26092a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C c11) {
        long j11 = c11.f26092a;
        long j12 = this.f26092a ^ Long.MIN_VALUE;
        long j13 = j11 ^ Long.MIN_VALUE;
        if (j12 < j13) {
            return -1;
        }
        return j12 == j13 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C) {
            return this.f26092a == ((C) obj).f26092a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26092a);
    }

    @NotNull
    public final String toString() {
        long j11 = this.f26092a;
        if (j11 >= 0) {
            String l11 = Long.toString(j11, CharsKt.checkRadix(10));
            Intrinsics.checkNotNullExpressionValue(l11, "toString(...)");
            return l11;
        }
        long j12 = 10;
        long j13 = ((j11 >>> 1) / j12) << 1;
        long j14 = j11 - (j13 * j12);
        if (j14 >= j12) {
            j14 -= j12;
            j13++;
        }
        StringBuilder sb2 = new StringBuilder();
        String l12 = Long.toString(j13, CharsKt.checkRadix(10));
        Intrinsics.checkNotNullExpressionValue(l12, "toString(...)");
        sb2.append(l12);
        String l13 = Long.toString(j14, CharsKt.checkRadix(10));
        Intrinsics.checkNotNullExpressionValue(l13, "toString(...)");
        sb2.append(l13);
        return sb2.toString();
    }
}
