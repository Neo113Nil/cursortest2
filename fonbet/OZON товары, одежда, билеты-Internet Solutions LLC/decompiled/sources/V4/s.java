package V4;

import E0.C2942q;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public View f28063b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f28062a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<l> f28064c = new ArrayList<>();

    @Deprecated
    public s() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f28063b == sVar.f28063b && this.f28062a.equals(sVar.f28062a);
    }

    public final int hashCode() {
        return this.f28062a.hashCode() + (this.f28063b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder e11 = C2942q.e("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        e11.append(this.f28063b);
        e11.append("\n");
        String e12 = U7.d.e(e11.toString(), "    values:");
        HashMap hashMap = this.f28062a;
        for (String str : hashMap.keySet()) {
            e12 = e12 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return e12;
    }

    public s(@NonNull View view) {
        this.f28063b = view;
    }
}
