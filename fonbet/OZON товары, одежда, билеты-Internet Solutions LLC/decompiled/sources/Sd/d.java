package Sd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    private static final f f26132e = f.i("<root>");

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f26133f = Pattern.compile("\\.");

    /* renamed from: g, reason: collision with root package name */
    private static final Function1<String, f> f26134g = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f26135a;

    /* renamed from: b, reason: collision with root package name */
    private transient c f26136b;

    /* renamed from: c, reason: collision with root package name */
    private transient d f26137c;

    /* renamed from: d, reason: collision with root package name */
    private transient f f26138d;

    static class a implements Function1<String, f> {
        @Override // kotlin.jvm.functions.Function1
        public final f invoke(String str) {
            return f.e(str);
        }
    }

    d(@NotNull c cVar, @NotNull String str) {
        if (str == null) {
            a(0);
            throw null;
        }
        if (cVar == null) {
            a(1);
            throw null;
        }
        this.f26135a = str;
        this.f26136b = cVar;
    }

    private static /* synthetic */ void a(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                i12 = 2;
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        if (i11 != 1) {
            switch (i11) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 18:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "other";
                    break;
                case 17:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i11) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 18:
                objArr[1] = "toString";
                break;
        }
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
            case 16:
                objArr[2] = "startsWith";
                break;
            case 17:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                throw new IllegalStateException(format);
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    private void d() {
        String str = this.f26135a;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f26138d = f.e(str.substring(lastIndexOf + 1));
            this.f26137c = new d(str.substring(0, lastIndexOf));
        } else {
            this.f26138d = f.e(str);
            this.f26137c = c.f26129c.j();
        }
    }

    @NotNull
    public static d m(@NotNull f fVar) {
        if (fVar != null) {
            return new d(fVar.b(), c.f26129c.j(), fVar);
        }
        a(17);
        throw null;
    }

    @NotNull
    public final String b() {
        String str = this.f26135a;
        if (str != null) {
            return str;
        }
        a(4);
        throw null;
    }

    @NotNull
    public final d c(@NotNull f fVar) {
        String str;
        if (fVar == null) {
            a(9);
            throw null;
        }
        String str2 = this.f26135a;
        if (str2.isEmpty()) {
            str = fVar.b();
        } else {
            str = str2 + "." + fVar.b();
        }
        return new d(str, this, fVar);
    }

    public final boolean e() {
        return this.f26135a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f26135a.equals(((d) obj).f26135a);
    }

    public final boolean f() {
        return this.f26136b != null || b().indexOf(60) < 0;
    }

    @NotNull
    public final d g() {
        d dVar = this.f26137c;
        if (dVar != null) {
            if (dVar != null) {
                return dVar;
            }
            a(7);
            throw null;
        }
        if (this.f26135a.isEmpty()) {
            throw new IllegalStateException("root");
        }
        d();
        d dVar2 = this.f26137c;
        if (dVar2 != null) {
            return dVar2;
        }
        a(8);
        throw null;
    }

    @NotNull
    public final List<f> h() {
        List<f> list;
        String str = this.f26135a;
        if (str.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            String[] split = f26133f.split(str);
            Function1<String, f> transform = f26134g;
            Intrinsics.checkNotNullParameter(split, "<this>");
            Intrinsics.checkNotNullParameter(transform, "transform");
            ArrayList arrayList = new ArrayList(split.length);
            for (String str2 : split) {
                arrayList.add(((a) transform).invoke(str2));
            }
            list = arrayList;
        }
        if (list != null) {
            return list;
        }
        a(14);
        throw null;
    }

    public final int hashCode() {
        return this.f26135a.hashCode();
    }

    @NotNull
    public final f i() {
        f fVar = this.f26138d;
        if (fVar != null) {
            if (fVar != null) {
                return fVar;
            }
            a(10);
            throw null;
        }
        if (this.f26135a.isEmpty()) {
            throw new IllegalStateException("root");
        }
        d();
        f fVar2 = this.f26138d;
        if (fVar2 != null) {
            return fVar2;
        }
        a(11);
        throw null;
    }

    @NotNull
    public final f j() {
        if (this.f26135a.isEmpty()) {
            f fVar = f26132e;
            if (fVar != null) {
                return fVar;
            }
            a(12);
            throw null;
        }
        f i11 = i();
        if (i11 != null) {
            return i11;
        }
        a(13);
        throw null;
    }

    public final boolean k(@NotNull f fVar) {
        if (fVar == null) {
            a(15);
            throw null;
        }
        String str = this.f26135a;
        if (!str.isEmpty()) {
            int indexOf = str.indexOf(46);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            String b11 = fVar.b();
            if (indexOf == b11.length() && str.regionMatches(0, b11, 0, indexOf)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final c l() {
        c cVar = this.f26136b;
        if (cVar == null) {
            c cVar2 = new c(this);
            this.f26136b = cVar2;
            return cVar2;
        }
        if (cVar != null) {
            return cVar;
        }
        a(5);
        throw null;
    }

    @NotNull
    public final String toString() {
        String str = this.f26135a;
        if (str.isEmpty()) {
            str = f26132e.b();
        }
        if (str != null) {
            return str;
        }
        a(18);
        throw null;
    }

    public d(@NotNull String str) {
        if (str != null) {
            this.f26135a = str;
        } else {
            a(2);
            throw null;
        }
    }

    private d(@NotNull String str, d dVar, f fVar) {
        if (str != null) {
            this.f26135a = str;
            this.f26137c = dVar;
            this.f26138d = fVar;
            return;
        }
        a(3);
        throw null;
    }
}
