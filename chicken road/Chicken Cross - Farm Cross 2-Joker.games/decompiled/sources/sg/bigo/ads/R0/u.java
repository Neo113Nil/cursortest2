package sg.bigo.ads.R0;

import java.util.ArrayList;
import java.util.Random;
import sg.bigo.ads.K0.A;

/* loaded from: classes3.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final long f12524a = 30 * 1000;

    public static b a(ArrayList arrayList) {
        if (A.a(arrayList)) {
            return null;
        }
        b bVar = (b) (A.a(arrayList) ? null : arrayList.get(new Random().nextInt(arrayList.size())));
        if (bVar != null) {
            bVar.d = false;
        }
        return bVar;
    }

    public abstract b a(String str);

    public final String toString() {
        return super.toString();
    }
}
