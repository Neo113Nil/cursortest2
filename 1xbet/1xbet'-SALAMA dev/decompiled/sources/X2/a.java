package X2;

import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.D;
import java.util.Arrays;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f7465c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7467b;

    static {
        V0 v6 = new V0(24, false);
        v6.f17568b = Boolean.FALSE;
        f7465c = new a(v6);
    }

    public a(V0 v6) {
        this.f7466a = ((Boolean) v6.f17568b).booleanValue();
        this.f7467b = (String) v6.f17569c;
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
