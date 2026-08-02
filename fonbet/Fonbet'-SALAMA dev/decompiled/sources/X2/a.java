package X2;

import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.D;
import java.util.Arrays;
import w1.V0;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: c, reason: collision with root package name */
    public static final a f7465c;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7466a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7467b;

    static {
        V0 v02 = new V0(24, false);
        v02.f17562b = Boolean.FALSE;
        f7465c = new a(v02);
    }

    public a(V0 v02) {
        this.f7466a = ((Boolean) v02.f17562b).booleanValue();
        this.f7467b = (String) v02.f17563c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return D.m(null, null) && this.f7466a == aVar.f7466a && D.m(this.f7467b, aVar.f7467b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f7466a), this.f7467b});
    }
}
