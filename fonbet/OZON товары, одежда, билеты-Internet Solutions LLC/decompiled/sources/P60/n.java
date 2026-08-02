package P60;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final long f21902a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f21903b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final b f21904c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final a f21905d;

    /* renamed from: e, reason: collision with root package name */
    private final String f21906e;

    /* renamed from: f, reason: collision with root package name */
    private final Uri f21907f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a DEEP_LINK;
        public static final a PACKAGE;

        static {
            a aVar = new a("PACKAGE", 0);
            PACKAGE = aVar;
            a aVar2 = new a("DEEP_LINK", 1);
            DEEP_LINK = aVar2;
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

    public n(long j11, @NotNull String packageName, @NotNull b appType, @NotNull a source, String str, Uri uri) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f21902a = j11;
        this.f21903b = packageName;
        this.f21904c = appType;
        this.f21905d = source;
        this.f21906e = str;
        this.f21907f = uri;
    }

    @NotNull
    public final b a() {
        return this.f21904c;
    }

    public final Uri b() {
        return this.f21907f;
    }

    public final long c() {
        return this.f21902a;
    }

    @NotNull
    public final String d() {
        return this.f21903b;
    }

    @NotNull
    public final String e() {
        return this.f21904c.a() + this.f21902a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f21902a == nVar.f21902a && Intrinsics.d(this.f21903b, nVar.f21903b) && this.f21904c == nVar.f21904c && this.f21905d == nVar.f21905d && Intrinsics.d(this.f21906e, nVar.f21906e) && Intrinsics.d(this.f21907f, nVar.f21907f);
    }

    @NotNull
    public final a f() {
        return this.f21905d;
    }

    public final int hashCode() {
        int hashCode = (this.f21905d.hashCode() + ((this.f21904c.hashCode() + G.g.a(Long.hashCode(this.f21902a) * 31, 31, this.f21903b)) * 31)) * 31;
        String str = this.f21906e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.f21907f;
        return hashCode2 + (uri != null ? uri.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "InstalledBankApp(memberId=" + this.f21902a + ", packageName=" + this.f21903b + ", appType=" + this.f21904c + ", source=" + this.f21905d + ", matchedScheme=" + this.f21906e + ", matchedUri=" + this.f21907f + ")";
    }
}
