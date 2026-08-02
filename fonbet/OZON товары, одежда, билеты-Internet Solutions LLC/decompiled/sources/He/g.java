package He;

import B0.A0;
import S7.q;
import Sc.o;
import Sc.r;
import Sc.s;
import Ve.C4515p;
import Ve.Em;
import Ve.H6;
import Ve.Wk;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class g {
    public static SharedPreferences a(H6 h62, Context context, int i11, Function0 sharedPreferencesCreation) {
        Object a11;
        Object a12;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesCreation, "sharedPreferencesCreation");
        int i12 = i11 + 1;
        if (i12 > 1) {
            Lm0.a.f17149a.e(Ej.b.a(i12, "Seamless SP count of try - "), new Object[0]);
        }
        if (10 == i12) {
            return null;
        }
        try {
            r.Companion companion = r.INSTANCE;
            a11 = (SharedPreferences) sharedPreferencesCreation.invoke();
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        boolean z11 = a11 instanceof r.b;
        if (z11 && i12 > 3) {
            try {
                context.getSharedPreferences(context.getPackageName() + h62.a(), 0).edit().clear().apply();
                a12 = Unit.f71690a;
            } catch (Throwable th3) {
                r.Companion companion3 = r.INSTANCE;
                a12 = s.a(th3);
            }
            if (a12 instanceof r.b) {
                Lm0.a.f17149a.e("SP result --- " + r.b(a12), new Object[0]);
            }
        }
        SharedPreferences sharedPreferences = (SharedPreferences) (z11 ? null : a11);
        return sharedPreferences == null ? h62.a(i12, sharedPreferencesCreation, context) : sharedPreferences;
    }

    public static String b() {
        switch (Em.a(Wk.f30290b)) {
            case 0:
                return A0.b("https://", C4515p.a("IyN8cAklNG04Lmk5Cjs7HzYjIWkWKDADfjs0CAwbfR5zF0BA"), "/");
            case 1:
                return A0.b("https://", C4515p.a("IyNlFCM7NAAAJT4aci5odBoCNSEAGDoWLwEgFAo8KSk1DT0WCS5AQA=="), "/");
            case 2:
            case 4:
                return A0.b("https://", C4515p.a("IyNlFCM7NAAAJT4aci5odBoCNSEAGDoWLwEgFAo8KSk1DX0CFixAQA=="), "/");
            case 3:
                return "https://api.mocki.io/v2/071c7c55/";
            case 5:
            case 6:
                return A0.b("https://", C4515p.a("IyNlFCM7NAAAJT4aci5odBoCNSEAGDoWLwEhFAo8KSk1DX0CFixAQA=="), "/");
            default:
                throw new o();
        }
    }

    public abstract Integer c();

    public abstract q d();
}
