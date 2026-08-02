package We;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: We.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4864f {

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    public static final C4864f f33717n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    public static final C4864f f33718o;

    /* renamed from: p, reason: collision with root package name */
    public static final b f33719p = new b();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f33720a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f33721b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33722c;

    /* renamed from: d, reason: collision with root package name */
    private final int f33723d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f33724e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f33725f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f33726g;

    /* renamed from: h, reason: collision with root package name */
    private final int f33727h;

    /* renamed from: i, reason: collision with root package name */
    private final int f33728i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f33729j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f33730k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f33731l;

    /* renamed from: m, reason: collision with root package name */
    private String f33732m;

    /* renamed from: We.f$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f33733a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f33734b;

        /* renamed from: c, reason: collision with root package name */
        private int f33735c = -1;

        /* renamed from: d, reason: collision with root package name */
        private int f33736d = -1;

        /* renamed from: e, reason: collision with root package name */
        private boolean f33737e;

        @NotNull
        public final C4864f a() {
            return new C4864f(this.f33733a, this.f33734b, this.f33735c, -1, false, false, false, this.f33736d, -1, this.f33737e, false, false, null);
        }

        @NotNull
        public final void b(int i11) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (i11 < 0) {
                throw new IllegalArgumentException(Ej.b.a(i11, "maxAge < 0: ").toString());
            }
            long seconds = timeUnit.toSeconds(i11);
            this.f33735c = seconds <= ((long) Integer.MAX_VALUE) ? (int) seconds : Integer.MAX_VALUE;
        }

        @NotNull
        public final void c() {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            long j11 = Integer.MAX_VALUE;
            long seconds = timeUnit.toSeconds(j11);
            this.f33736d = seconds <= j11 ? (int) seconds : Integer.MAX_VALUE;
        }

        @NotNull
        public final void d() {
            this.f33733a = true;
        }

        @NotNull
        public final void e() {
            this.f33734b = true;
        }

        @NotNull
        public final void f() {
            this.f33737e = true;
        }
    }

    /* renamed from: We.f$b */
    public static final class b {
        /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x012c  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0131  */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static C4864f a(@NotNull z zVar) {
            int i11;
            int i12;
            int i13;
            String str;
            int length;
            z headers = zVar;
            Intrinsics.checkNotNullParameter(headers, "headers");
            int size = headers.size();
            boolean z11 = true;
            boolean z12 = true;
            int i14 = 0;
            String str2 = null;
            boolean z13 = false;
            boolean z14 = false;
            int i15 = -1;
            int i16 = -1;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            int i17 = -1;
            int i18 = -1;
            boolean z18 = false;
            boolean z19 = false;
            boolean z21 = false;
            while (i14 < size) {
                String e11 = headers.e(i14);
                String indexOfNonWhitespace = headers.k(i14);
                if (kotlin.text.h.D(e11, "Cache-Control", z11)) {
                    if (str2 == null) {
                        str2 = indexOfNonWhitespace;
                        i11 = 0;
                        while (i11 < indexOfNonWhitespace.length()) {
                            int length2 = indexOfNonWhitespace.length();
                            boolean z22 = z11;
                            int i19 = i11;
                            while (true) {
                                if (i19 >= length2) {
                                    i12 = size;
                                    i19 = indexOfNonWhitespace.length();
                                    break;
                                }
                                i12 = size;
                                if (kotlin.text.h.u("=,;", indexOfNonWhitespace.charAt(i19))) {
                                    break;
                                }
                                i19++;
                                size = i12;
                            }
                            String substring = indexOfNonWhitespace.substring(i11, i19);
                            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            if (substring == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                            }
                            String obj = kotlin.text.h.z0(substring).toString();
                            if (i19 != indexOfNonWhitespace.length()) {
                                i13 = i14;
                                if (indexOfNonWhitespace.charAt(i19) != ',' && indexOfNonWhitespace.charAt(i19) != ';') {
                                    int i21 = i19 + 1;
                                    byte[] bArr = Ye.b.f34900a;
                                    Intrinsics.checkNotNullParameter(indexOfNonWhitespace, "$this$indexOfNonWhitespace");
                                    int length3 = indexOfNonWhitespace.length();
                                    while (true) {
                                        if (i21 >= length3) {
                                            i21 = indexOfNonWhitespace.length();
                                            break;
                                        }
                                        char charAt = indexOfNonWhitespace.charAt(i21);
                                        int i22 = length3;
                                        if (charAt != ' ' && charAt != '\t') {
                                            break;
                                        }
                                        i21++;
                                        length3 = i22;
                                    }
                                    if (i21 >= indexOfNonWhitespace.length() || indexOfNonWhitespace.charAt(i21) != '\"') {
                                        int length4 = indexOfNonWhitespace.length();
                                        int i23 = i21;
                                        while (true) {
                                            if (i23 >= length4) {
                                                length = indexOfNonWhitespace.length();
                                                break;
                                            }
                                            int i24 = length4;
                                            int i25 = i23;
                                            if (kotlin.text.h.u(",;", indexOfNonWhitespace.charAt(i23))) {
                                                length = i25;
                                                break;
                                            }
                                            i23 = i25 + 1;
                                            length4 = i24;
                                        }
                                        String substring2 = indexOfNonWhitespace.substring(i21, length);
                                        Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                        if (substring2 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                                        }
                                        str = kotlin.text.h.z0(substring2).toString();
                                        i11 = length;
                                    } else {
                                        int i26 = i21 + 1;
                                        int I11 = kotlin.text.h.I('\"', i26, 4, indexOfNonWhitespace);
                                        str = indexOfNonWhitespace.substring(i26, I11);
                                        Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                        i11 = I11 + 1;
                                    }
                                    if (!"no-cache".equalsIgnoreCase(obj)) {
                                        z13 = z22;
                                    } else if ("no-store".equalsIgnoreCase(obj)) {
                                        z14 = z22;
                                    } else {
                                        if ("max-age".equalsIgnoreCase(obj)) {
                                            i15 = Ye.b.C(-1, str);
                                        } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                            i16 = Ye.b.C(-1, str);
                                        } else if ("private".equalsIgnoreCase(obj)) {
                                            z15 = z22;
                                        } else if ("public".equalsIgnoreCase(obj)) {
                                            z16 = z22;
                                        } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                            z17 = z22;
                                        } else if ("max-stale".equalsIgnoreCase(obj)) {
                                            i17 = Ye.b.C(Integer.MAX_VALUE, str);
                                        } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                            i18 = Ye.b.C(-1, str);
                                        } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                            z18 = z22;
                                        } else if ("no-transform".equalsIgnoreCase(obj)) {
                                            z19 = z22;
                                        } else if ("immutable".equalsIgnoreCase(obj)) {
                                            z21 = z22;
                                        }
                                        z11 = z22;
                                        size = i12;
                                        i14 = i13;
                                    }
                                    z11 = z22;
                                    size = i12;
                                    i14 = i13;
                                }
                            } else {
                                i13 = i14;
                            }
                            i11 = i19 + 1;
                            str = null;
                            if (!"no-cache".equalsIgnoreCase(obj)) {
                            }
                            z11 = z22;
                            size = i12;
                            i14 = i13;
                        }
                        i14++;
                        headers = zVar;
                        z11 = z11;
                        size = size;
                    }
                } else if (!kotlin.text.h.D(e11, "Pragma", z11)) {
                    continue;
                    i14++;
                    headers = zVar;
                    z11 = z11;
                    size = size;
                }
                z12 = false;
                i11 = 0;
                while (i11 < indexOfNonWhitespace.length()) {
                }
                i14++;
                headers = zVar;
                z11 = z11;
                size = size;
            }
            return new C4864f(z13, z14, i15, i16, z15, z16, z17, i17, i18, z18, z19, z21, !z12 ? null : str2);
        }
    }

    static {
        a aVar = new a();
        aVar.d();
        f33717n = aVar.a();
        a aVar2 = new a();
        aVar2.f();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar2.c();
        f33718o = aVar2.a();
    }

    public C4864f(boolean z11, boolean z12, int i11, int i12, boolean z13, boolean z14, boolean z15, int i13, int i14, boolean z16, boolean z17, boolean z18, String str) {
        this.f33720a = z11;
        this.f33721b = z12;
        this.f33722c = i11;
        this.f33723d = i12;
        this.f33724e = z13;
        this.f33725f = z14;
        this.f33726g = z15;
        this.f33727h = i13;
        this.f33728i = i14;
        this.f33729j = z16;
        this.f33730k = z17;
        this.f33731l = z18;
        this.f33732m = str;
    }

    public final boolean a() {
        return this.f33724e;
    }

    public final boolean b() {
        return this.f33725f;
    }

    public final int c() {
        return this.f33722c;
    }

    public final int d() {
        return this.f33727h;
    }

    public final int e() {
        return this.f33728i;
    }

    public final boolean f() {
        return this.f33726g;
    }

    public final boolean g() {
        return this.f33720a;
    }

    public final boolean h() {
        return this.f33721b;
    }

    public final boolean i() {
        return this.f33729j;
    }

    @NotNull
    public final String toString() {
        String str = this.f33732m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f33720a) {
            sb2.append("no-cache, ");
        }
        if (this.f33721b) {
            sb2.append("no-store, ");
        }
        int i11 = this.f33722c;
        if (i11 != -1) {
            sb2.append("max-age=");
            sb2.append(i11);
            sb2.append(", ");
        }
        int i12 = this.f33723d;
        if (i12 != -1) {
            sb2.append("s-maxage=");
            sb2.append(i12);
            sb2.append(", ");
        }
        if (this.f33724e) {
            sb2.append("private, ");
        }
        if (this.f33725f) {
            sb2.append("public, ");
        }
        if (this.f33726g) {
            sb2.append("must-revalidate, ");
        }
        int i13 = this.f33727h;
        if (i13 != -1) {
            sb2.append("max-stale=");
            sb2.append(i13);
            sb2.append(", ");
        }
        int i14 = this.f33728i;
        if (i14 != -1) {
            sb2.append("min-fresh=");
            sb2.append(i14);
            sb2.append(", ");
        }
        if (this.f33729j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f33730k) {
            sb2.append("no-transform, ");
        }
        if (this.f33731l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        this.f33732m = sb3;
        return sb3;
    }
}
