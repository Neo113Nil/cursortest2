package We;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: We.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4868j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f33749a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f33750b;

    public C4868j(@NotNull String scheme, @NotNull Map<String, String> authParams) {
        String str;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(authParams, "authParams");
        this.f33750b = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : authParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                str = key.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            linkedHashMap.put(str, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f33749a = unmodifiableMap;
    }

    @NotNull
    public final Charset a() {
        String str = this.f33749a.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                Intrinsics.checkNotNullExpressionValue(forName, "Charset.forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        Intrinsics.checkNotNullExpressionValue(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    public final String b() {
        return this.f33749a.get("realm");
    }

    @NotNull
    public final String c() {
        return this.f33750b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4868j)) {
            return false;
        }
        C4868j c4868j = (C4868j) obj;
        return Intrinsics.d(c4868j.f33750b, this.f33750b) && Intrinsics.d(c4868j.f33749a, this.f33749a);
    }

    public final int hashCode() {
        return this.f33749a.hashCode() + G.g.a(899, 31, this.f33750b);
    }

    @NotNull
    public final String toString() {
        return this.f33750b + " authParams=" + this.f33749a;
    }
}
