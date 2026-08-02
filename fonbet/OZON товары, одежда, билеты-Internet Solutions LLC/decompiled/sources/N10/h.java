package N10;

import Kk.C3532b;
import Sc.InterfaceC3999a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f18436d = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f18437a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f18438b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final f f18439c;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private String f18440a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private f f18441b;

        public a() {
            f fVar;
            int i11 = h.f18436d;
            this.f18440a = "defaultStickyGroupTag";
            fVar = f.f18435a;
            this.f18441b = fVar;
        }

        @NotNull
        public final h a() {
            return new h(this.f18440a, this.f18441b);
        }
    }

    static {
        Intrinsics.checkNotNullParameter("defaultStickyGroupTag", "tag");
    }

    public /* synthetic */ h(String str, f fVar) {
        this(str, false, fVar);
    }

    public static h a(h hVar, String groupTag) {
        boolean z11 = hVar.f18438b;
        hVar.getClass();
        hVar.getClass();
        Intrinsics.checkNotNullParameter(groupTag, "groupTag");
        return new h(groupTag, z11);
    }

    @NotNull
    public final String b() {
        return this.f18437a;
    }

    public final boolean c() {
        return this.f18438b;
    }

    @NotNull
    public final f d() {
        return this.f18439c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f18437a, hVar.f18437a) && Intrinsics.d(this.f18439c, hVar.f18439c) && this.f18438b == hVar.f18438b;
    }

    public final int hashCode() {
        return C3532b.a((this.f18439c.hashCode() + (this.f18437a.hashCode() * 31)) * 961, 31, this.f18438b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @InterfaceC3999a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(String groupTag, boolean z11) {
        this(groupTag, z11, r0);
        f fVar;
        Intrinsics.checkNotNullParameter(groupTag, "groupTag");
        fVar = f.f18435a;
    }

    private h(String str, boolean z11, f fVar) {
        this.f18437a = str;
        this.f18438b = z11;
        this.f18439c = fVar;
    }

    public /* synthetic */ h(String str, int i11) {
        this(str, (i11 & 2) == 0);
    }
}
