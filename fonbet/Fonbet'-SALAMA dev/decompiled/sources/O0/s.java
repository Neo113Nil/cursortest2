package O0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public final View f4895b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4894a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
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
        StringBuilder d7 = t.e.d("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        d7.append(this.f4895b);
        d7.append("\n");
        String e7 = e1.k.e(d7.toString(), "    values:");
        HashMap hashMap = this.f4894a;
        for (String str : hashMap.keySet()) {
            e7 = e7 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return e7;
    }
}
