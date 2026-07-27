package H2;

import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import com.startapp.sdk.internal.ea;
import d2.C0279i;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements o2.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f545b;

    public /* synthetic */ o(int i3, Object obj) {
        this.f544a = i3;
        this.f545b = obj;
    }

    @Override // o2.l
    public final Object invoke(Object obj) {
        switch (this.f544a) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                p pVar = (p) this.f545b;
                if (booleanValue) {
                    h hVar = pVar.f550e;
                    if (hVar != null) {
                        hVar.a();
                    }
                } else {
                    pVar.d();
                }
                return C0279i.f4852a;
            default:
                return ea.a((InputMethodManager) this.f545b, (InputMethodInfo) obj);
        }
    }
}
