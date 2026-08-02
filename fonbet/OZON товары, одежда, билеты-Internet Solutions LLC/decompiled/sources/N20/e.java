package N20;

import N20.d;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f18450a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f18451b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final d f18452c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<String, d> f18453d;

    /* renamed from: e, reason: collision with root package name */
    private final Q20.a f18454e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.Map] */
    public /* synthetic */ e(String str, String str2, d dVar, LinkedHashMap linkedHashMap, int i11) {
        this(str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? new d.a("") : dVar, (i11 & 8) != 0 ? U.c() : linkedHashMap, (Q20.a) null);
    }

    public static e a(e eVar, Q20.a aVar) {
        String key = eVar.f18450a;
        String currentLocale = eVar.f18451b;
        d currentValue = eVar.f18452c;
        Map<String, d> translations = eVar.f18453d;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(currentLocale, "currentLocale");
        Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        Intrinsics.checkNotNullParameter(translations, "translations");
        return new e(key, currentLocale, currentValue, translations, aVar);
    }

    @NotNull
    public final String b() {
        return this.f18451b;
    }

    @NotNull
    public final d c() {
        return this.f18452c;
    }

    @NotNull
    public final String d() {
        return this.f18450a;
    }

    public final Q20.a e() {
        return this.f18454e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f18450a, eVar.f18450a) && Intrinsics.d(this.f18451b, eVar.f18451b) && Intrinsics.d(this.f18452c, eVar.f18452c) && Intrinsics.d(this.f18453d, eVar.f18453d) && Intrinsics.d(this.f18454e, eVar.f18454e);
    }

    @NotNull
    public final Map<String, d> f() {
        return this.f18453d;
    }

    public final int hashCode() {
        int a11 = D40.c.a(this.f18453d, (this.f18452c.hashCode() + G.g.a(this.f18450a.hashCode() * 31, 31, this.f18451b)) * 31, 31);
        Q20.a aVar = this.f18454e;
        return a11 + (aVar == null ? 0 : aVar.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ResourceDetailsUiState(key=" + this.f18450a + ", currentLocale=" + this.f18451b + ", currentValue=" + this.f18452c + ", translations=" + this.f18453d + ", stub=" + this.f18454e + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull String key, @NotNull String currentLocale, @NotNull d currentValue, @NotNull Map<String, ? extends d> translations, Q20.a aVar) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(currentLocale, "currentLocale");
        Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        Intrinsics.checkNotNullParameter(translations, "translations");
        this.f18450a = key;
        this.f18451b = currentLocale;
        this.f18452c = currentValue;
        this.f18453d = translations;
        this.f18454e = aVar;
    }
}
