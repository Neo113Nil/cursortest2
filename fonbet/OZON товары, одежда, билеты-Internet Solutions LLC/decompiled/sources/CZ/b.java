package CZ;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b extends c {

    /* renamed from: b, reason: collision with root package name */
    private final pZ.f f4570b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f4571c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4572d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ALL;
        public static final a CURRENT;

        static {
            a aVar = new a("ALL", 0);
            ALL = aVar;
            a aVar2 = new a("CURRENT", 1);
            CURRENT = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this((pZ.f) null, (a) (0 == true ? 1 : 0), 7);
    }

    @NotNull
    public final a a() {
        return this.f4571c;
    }

    public final pZ.f b() {
        return this.f4570b;
    }

    public final boolean c() {
        return this.f4572d;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CloseMiniAppDestination(close=");
        sb2.append(this.f4571c);
        sb2.append(", redirect=");
        sb2.append(this.f4570b);
        sb2.append(", saveState=");
        return Pk0.a.a(")", sb2, this.f4572d);
    }

    public /* synthetic */ b(pZ.f fVar, a aVar, int i11) {
        this((i11 & 1) != 0 ? null : fVar, (i11 & 2) != 0 ? a.CURRENT : aVar, (i11 & 4) != 0);
    }

    public b(pZ.f fVar, @NotNull a close, boolean z11) {
        Intrinsics.checkNotNullParameter(close, "close");
        this.f4570b = fVar;
        this.f4571c = close;
        this.f4572d = z11;
    }
}
