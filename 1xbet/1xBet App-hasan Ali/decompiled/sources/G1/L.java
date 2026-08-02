package G1;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class L extends M {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1870d;

    @Override // G1.M
    public final Object a(String str, Bundle bundle) {
        switch (this.f1870d) {
            case 0:
                Object j5 = L1.a.j(bundle, "bundle", str, "key", str);
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Float", j5);
                return (Float) j5;
            default:
                return (String) L1.a.j(bundle, "bundle", str, "key", str);
        }
    }

    @Override // G1.M
    public final String b() {
        switch (this.f1870d) {
            case 0:
                return "float";
            default:
                return "string";
        }
    }

    @Override // G1.M
    public final Object c(String str) {
        switch (this.f1870d) {
            case 0:
                return Float.valueOf(Float.parseFloat(str));
            default:
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // G1.M
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f1870d) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                kotlin.jvm.internal.l.f("key", str);
                bundle.putFloat(str, floatValue);
                break;
            default:
                kotlin.jvm.internal.l.f("key", str);
                bundle.putString(str, (String) obj);
                break;
        }
    }
}
