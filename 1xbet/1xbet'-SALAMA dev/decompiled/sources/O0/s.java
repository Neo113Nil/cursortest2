package O0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f4895b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f4894a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f4896c = new ArrayList();

    public s(View view) {
        this.f4895b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f4895b == sVar.f4895b && this.f4894a.equals(sVar.f4894a);
    }

    public final int hashCode() {
        return this.f4894a.hashCode() + (this.f4895b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbD = p136t.e.d("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbD.append(this.f4895b);
        sbD.append("\n");
        String strE = p031e1.k.e(sbD.toString(), "    values:");
        HashMap map = this.f4894a;
        for (String str : map.keySet()) {
            strE = strE + "    " + str + ": " + map.get(str) + "\n";
        }
        return strE;
    }
}
