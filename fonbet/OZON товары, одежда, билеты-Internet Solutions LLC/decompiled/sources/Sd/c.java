package Sd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f26129c = new c("");

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f26130a;

    /* renamed from: b, reason: collision with root package name */
    private transient c f26131b;

    public c(@NotNull String str) {
        if (str != null) {
            this.f26130a = new d(this, str);
        } else {
            a(1);
            throw null;
        }
    }

    private static /* synthetic */ void a(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i12 = 2;
                break;
            case 8:
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "other";
                break;
            case 14:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i11) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i11) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
            case 13:
                objArr[2] = "startsWith";
                break;
            case 14:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(format);
            case 8:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @NotNull
    public static c k(@NotNull f fVar) {
        if (fVar != null) {
            return new c(d.m(fVar));
        }
        a(14);
        throw null;
    }

    @NotNull
    public final String b() {
        String b11 = this.f26130a.b();
        if (b11 != null) {
            return b11;
        }
        a(4);
        throw null;
    }

    @NotNull
    public final c c(@NotNull f fVar) {
        if (fVar != null) {
            return new c(this.f26130a.c(fVar), this);
        }
        a(8);
        throw null;
    }

    public final boolean d() {
        return this.f26130a.e();
    }

    @NotNull
    public final c e() {
        c cVar = this.f26131b;
        if (cVar != null) {
            return cVar;
        }
        d dVar = this.f26130a;
        if (dVar.e()) {
            throw new IllegalStateException("root");
        }
        c cVar2 = new c(dVar.g());
        this.f26131b = cVar2;
        return cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f26130a.equals(((c) obj).f26130a);
    }

    @NotNull
    public final List<f> f() {
        List<f> h11 = this.f26130a.h();
        if (h11 != null) {
            return h11;
        }
        a(11);
        throw null;
    }

    @NotNull
    public final f g() {
        f i11 = this.f26130a.i();
        if (i11 != null) {
            return i11;
        }
        a(9);
        throw null;
    }

    @NotNull
    public final f h() {
        return this.f26130a.j();
    }

    public final int hashCode() {
        return this.f26130a.hashCode();
    }

    public final boolean i(@NotNull f fVar) {
        if (fVar != null) {
            return this.f26130a.k(fVar);
        }
        a(12);
        throw null;
    }

    @NotNull
    public final d j() {
        d dVar = this.f26130a;
        if (dVar != null) {
            return dVar;
        }
        a(5);
        throw null;
    }

    public final String toString() {
        return this.f26130a.toString();
    }

    public c(@NotNull d dVar) {
        if (dVar != null) {
            this.f26130a = dVar;
        } else {
            a(2);
            throw null;
        }
    }

    private c(@NotNull d dVar, c cVar) {
        this.f26130a = dVar;
        this.f26131b = cVar;
    }
}
