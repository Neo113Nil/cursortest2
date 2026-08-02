package d;

import P.C0315s;
import P.D;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c.InterfaceC0520G;
import game.betting133.sports1xbet.R;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final D f16821a = new D(new B1.h(14));

    public static InterfaceC0520G a(C0315s c0315s) {
        InterfaceC0520G interfaceC0520G = (InterfaceC0520G) c0315s.j(f16821a);
        Object obj = null;
        if (interfaceC0520G == null) {
            c0315s.X(1208426157);
            View view = (View) c0315s.j(AndroidCompositionLocals_androidKt.f);
            kotlin.jvm.internal.l.f("<this>", view);
            while (true) {
                if (view == null) {
                    interfaceC0520G = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                InterfaceC0520G interfaceC0520G2 = tag instanceof InterfaceC0520G ? (InterfaceC0520G) tag : null;
                if (interfaceC0520G2 != null) {
                    interfaceC0520G = interfaceC0520G2;
                    break;
                }
                Object v4 = G4.d.v(view);
                view = v4 instanceof View ? (View) v4 : null;
            }
        } else {
            c0315s.X(1208423708);
        }
        c0315s.q(false);
        if (interfaceC0520G != null) {
            c0315s.X(1208423789);
            c0315s.q(false);
            return interfaceC0520G;
        }
        c0315s.X(1208428160);
        Context context = (Context) c0315s.j(AndroidCompositionLocals_androidKt.f6943b);
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            if (context instanceof InterfaceC0520G) {
                obj = context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        InterfaceC0520G interfaceC0520G3 = (InterfaceC0520G) obj;
        c0315s.q(false);
        return interfaceC0520G3;
    }
}
