package Q90;

import Kk.C3532b;
import T7.P;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final EnumC0453a f23047a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f23048b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f23049c;

    /* renamed from: d, reason: collision with root package name */
    private final String f23050d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f23051e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: Q90.a$a, reason: collision with other inner class name */
    public static final class EnumC0453a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC0453a[] $VALUES;
        public static final EnumC0453a PREFS_GET;
        public static final EnumC0453a SOURCE_FEATURES_ERROR;
        public static final EnumC0453a SOURCE_FEATURES_SUCCESS;

        static {
            EnumC0453a enumC0453a = new EnumC0453a("PREFS_GET", 0);
            PREFS_GET = enumC0453a;
            EnumC0453a enumC0453a2 = new EnumC0453a("SOURCE_FEATURES_SUCCESS", 1);
            SOURCE_FEATURES_SUCCESS = enumC0453a2;
            EnumC0453a enumC0453a3 = new EnumC0453a("SOURCE_FEATURES_ERROR", 2);
            SOURCE_FEATURES_ERROR = enumC0453a3;
            EnumC0453a[] enumC0453aArr = {enumC0453a, enumC0453a2, enumC0453a3};
            $VALUES = enumC0453aArr;
            $ENTRIES = Xc.b.a(enumC0453aArr);
        }

        private EnumC0453a() {
            throw null;
        }

        public static EnumC0453a valueOf(String str) {
            return (EnumC0453a) Enum.valueOf(EnumC0453a.class, str);
        }

        public static EnumC0453a[] values() {
            return (EnumC0453a[]) $VALUES.clone();
        }
    }

    public a() {
        throw null;
    }

    public a(EnumC0453a type, boolean z11, Integer num, String str, Map features, int i11) {
        num = (i11 & 4) != 0 ? null : num;
        features = (i11 & 16) != 0 ? U.c() : features;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(features, "features");
        this.f23047a = type;
        this.f23048b = z11;
        this.f23049c = num;
        this.f23050d = str;
        this.f23051e = features;
    }

    public final String a() {
        return this.f23050d;
    }

    @NotNull
    public final Map<String, String> b() {
        return this.f23051e;
    }

    public final Integer c() {
        return this.f23049c;
    }

    @NotNull
    public final EnumC0453a d() {
        return this.f23047a;
    }

    public final boolean e() {
        return this.f23048b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f23047a == aVar.f23047a && this.f23048b == aVar.f23048b && Intrinsics.d(this.f23049c, aVar.f23049c) && Intrinsics.d(this.f23050d, aVar.f23050d) && Intrinsics.d(this.f23051e, aVar.f23051e);
    }

    public final int hashCode() {
        int a11 = C3532b.a(this.f23047a.hashCode() * 31, 31, this.f23048b);
        Integer num = this.f23049c;
        int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f23050d;
        return this.f23051e.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CacheAnalyticData(type=");
        sb2.append(this.f23047a);
        sb2.append(", isSuccess=");
        sb2.append(this.f23048b);
        sb2.append(", length=");
        sb2.append(this.f23049c);
        sb2.append(", errorDescription=");
        sb2.append(this.f23050d);
        sb2.append(", features=");
        return P.f(sb2, this.f23051e, ")");
    }
}
