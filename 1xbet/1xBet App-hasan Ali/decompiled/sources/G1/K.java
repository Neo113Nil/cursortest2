package G1;

import a.AbstractC0444a;
import android.os.Bundle;
import o4.AbstractC2234l;

/* loaded from: classes.dex */
public final class K extends M {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1869d;

    public K(int i, boolean z3) {
        this.f1869d = i;
    }

    @Override // G1.M
    public final Object a(String str, Bundle bundle) {
        switch (this.f1869d) {
            case 0:
                return (Boolean) L1.a.j(bundle, "bundle", str, "key", str);
            case 1:
                Object j5 = L1.a.j(bundle, "bundle", str, "key", str);
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Int", j5);
                return (Integer) j5;
            default:
                Object j6 = L1.a.j(bundle, "bundle", str, "key", str);
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Long", j6);
                return (Long) j6;
        }
    }

    @Override // G1.M
    public final String b() {
        switch (this.f1869d) {
            case 0:
                return "boolean";
            case 1:
                return "integer";
            default:
                return "long";
        }
    }

    @Override // G1.M
    public final Object c(String str) {
        boolean z3;
        int parseInt;
        String str2;
        long parseLong;
        switch (this.f1869d) {
            case 0:
                if (str.equals("true")) {
                    z3 = true;
                } else {
                    if (!str.equals("false")) {
                        throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                    }
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 1:
                if (AbstractC2234l.x0(str, "0x", false)) {
                    String substring = str.substring(2);
                    kotlin.jvm.internal.l.e("substring(...)", substring);
                    AbstractC0444a.k(16);
                    parseInt = Integer.parseInt(substring, 16);
                } else {
                    parseInt = Integer.parseInt(str);
                }
                return Integer.valueOf(parseInt);
            default:
                if (AbstractC2234l.r0(str, "L", false)) {
                    str2 = str.substring(0, str.length() - 1);
                    kotlin.jvm.internal.l.e("substring(...)", str2);
                } else {
                    str2 = str;
                }
                if (AbstractC2234l.x0(str, "0x", false)) {
                    String substring2 = str2.substring(2);
                    kotlin.jvm.internal.l.e("substring(...)", substring2);
                    AbstractC0444a.k(16);
                    parseLong = Long.parseLong(substring2, 16);
                } else {
                    parseLong = Long.parseLong(str2);
                }
                return Long.valueOf(parseLong);
        }
    }

    @Override // G1.M
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f1869d) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                kotlin.jvm.internal.l.f("key", str);
                bundle.putBoolean(str, booleanValue);
                break;
            case 1:
                int intValue = ((Number) obj).intValue();
                kotlin.jvm.internal.l.f("key", str);
                bundle.putInt(str, intValue);
                break;
            default:
                long longValue = ((Number) obj).longValue();
                kotlin.jvm.internal.l.f("key", str);
                bundle.putLong(str, longValue);
                break;
        }
    }
}
