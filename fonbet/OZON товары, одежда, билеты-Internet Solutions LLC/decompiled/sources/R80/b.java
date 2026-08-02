package R80;

import T7.P;
import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final b f24792e = new b(Uri.EMPTY, false);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f24793a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f24794b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24795c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f24796d;

    public b(boolean z11, Uri uri, String str, @NotNull Map parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f24793a = z11;
        this.f24794b = uri;
        this.f24795c = str;
        this.f24796d = parameters;
    }

    public static b b(b bVar, boolean z11, Uri uri, String str, Map parameters, int i11) {
        if ((i11 & 1) != 0) {
            z11 = bVar.f24793a;
        }
        if ((i11 & 2) != 0) {
            uri = bVar.f24794b;
        }
        bVar.getClass();
        if ((i11 & 8) != 0) {
            str = bVar.f24795c;
        }
        if ((i11 & 16) != 0) {
            parameters = bVar.f24796d;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        return new b(z11, uri, str, parameters);
    }

    @NotNull
    public final Map<String, String> c() {
        return this.f24796d;
    }

    public final Uri d() {
        return this.f24794b;
    }

    public final boolean e() {
        return this.f24793a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f24793a == bVar.f24793a && Intrinsics.d(this.f24794b, bVar.f24794b) && Intrinsics.d(this.f24795c, bVar.f24795c) && Intrinsics.d(this.f24796d, bVar.f24796d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f24793a) * 31;
        Uri uri = this.f24794b;
        int hashCode2 = (hashCode + (uri == null ? 0 : uri.hashCode())) * 961;
        String str = this.f24795c;
        return this.f24796d.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeepResult(valid=");
        sb2.append(this.f24793a);
        sb2.append(", uri=");
        sb2.append(this.f24794b);
        sb2.append(", navResult=null, pathValue=");
        sb2.append(this.f24795c);
        sb2.append(", parameters=");
        return P.f(sb2, this.f24796d, ")");
    }

    public /* synthetic */ b(Uri uri, boolean z11) {
        this(z11, uri, null, new LinkedHashMap());
    }
}
