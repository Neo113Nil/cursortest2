package L00;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final byte[] f16108a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16109b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16110c;

    public static final class a {
        @NotNull
        public static h a(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return new h("application/json; charset=utf-8", bytes);
        }
    }

    public h(String str, byte[] bytes) {
        int length = bytes.length;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f16108a = bytes;
        this.f16109b = str;
        this.f16110c = length;
    }

    public final int a() {
        return this.f16110c;
    }

    @NotNull
    public final byte[] b() {
        return this.f16108a;
    }

    public final String c() {
        return this.f16109b;
    }
}
