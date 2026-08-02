package Sd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f implements Comparable<f> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f26140a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f26141b;

    private f(@NotNull String str, boolean z11) {
        if (str == null) {
            a(0);
            throw null;
        }
        this.f26140a = str;
        this.f26141b = z11;
    }

    private static /* synthetic */ void a(int i11) {
        String str = (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) ? 2 : 3];
        if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
        }
        if (i11 == 1) {
            objArr[1] = "asString";
        } else if (i11 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i11 == 3 || i11 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @NotNull
    public static f e(@NotNull String str) {
        if (str != null) {
            return str.startsWith("<") ? i(str) : f(str);
        }
        a(9);
        throw null;
    }

    @NotNull
    public static f f(@NotNull String str) {
        if (str != null) {
            return new f(str, false);
        }
        a(5);
        throw null;
    }

    public static boolean h(@NotNull String str) {
        if (str == null) {
            a(6);
            throw null;
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt == '.' || charAt == '/' || charAt == '\\') {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static f i(@NotNull String str) {
        if (str == null) {
            a(8);
            throw null;
        }
        if (str.startsWith("<")) {
            return new f(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': ".concat(str));
    }

    @NotNull
    public final String b() {
        String str = this.f26140a;
        if (str != null) {
            return str;
        }
        a(1);
        throw null;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(f fVar) {
        return this.f26140a.compareTo(fVar.f26140a);
    }

    @NotNull
    public final String d() {
        if (this.f26141b) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String b11 = b();
        if (b11 != null) {
            return b11;
        }
        a(2);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f26141b == fVar.f26141b && this.f26140a.equals(fVar.f26140a);
    }

    public final boolean g() {
        return this.f26141b;
    }

    public final int hashCode() {
        return (this.f26140a.hashCode() * 31) + (this.f26141b ? 1 : 0);
    }

    public final String toString() {
        return this.f26140a;
    }
}
