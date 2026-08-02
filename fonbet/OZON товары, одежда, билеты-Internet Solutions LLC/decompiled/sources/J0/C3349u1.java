package J0;

import S0.C3969l;
import T7.C4033o;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.crypto.tink.internal.AbstractC5889h;
import io.sentry.android.core.util.a;
import j3.C7256L;
import kotlin.jvm.functions.Function2;
import m3.r;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import u3.InterfaceC9928b;

/* renamed from: J0.u1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3349u1 implements AbstractC5889h.a, a.InterfaceC1104a, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13418a;

    public /* synthetic */ C3349u1(int i11) {
        this.f13418a = i11;
    }

    public static int c(D1.H h11) {
        return h11.c0().h().getAggregateChildKindSet$ui_release();
    }

    public static int d(ButtonV3Atom.SmallIconButton smallIconButton, int i11, int i12) {
        return (smallIconButton.hashCode() + i11) * i12;
    }

    public static void e(int i11, Function2 function2, C3969l c3969l) {
        function2.invoke(c3969l, Integer.valueOf(i11));
        c3969l.f();
    }

    @Override // io.sentry.android.core.util.a.InterfaceC1104a
    public Object a(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i11 = applicationInfo.labelRes;
            if (i11 != 0) {
                return context.getString(i11);
            }
            CharSequence charSequence = applicationInfo.nonLocalizedLabel;
            return charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.google.crypto.tink.internal.AbstractC5889h.a
    public com.google.crypto.tink.internal.F b(He.g gVar, S7.r rVar) {
        switch (this.f13418a) {
            case 1:
                return T7.S.b((T7.N) gVar);
            default:
                return U7.g.c((C4033o) gVar, rVar);
        }
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }

    public /* synthetic */ C3349u1(InterfaceC9928b.a aVar, C7256L c7256l) {
        this.f13418a = 6;
    }
}
