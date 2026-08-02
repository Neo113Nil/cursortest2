package androidx.fragment.app.strictmode;

import android.util.Pair;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import com.facebook.D;
import com.facebook.E;
import com.facebook.z;
import com.tekartik.sqflite.d;
import com.tekartik.sqflite.operation.c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                FragmentStrictMode.handlePolicyViolation$lambda$0((FragmentStrictMode.Policy) this.b, (Violation) this.c);
                break;
            case 1:
                ArrayList callbacks = (ArrayList) this.b;
                D requests = (D) this.c;
                Intrinsics.checkNotNullParameter(callbacks, "$callbacks");
                Intrinsics.checkNotNullParameter(requests, "$requests");
                Iterator it = callbacks.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    z.b bVar = (z.b) pair.first;
                    Object obj = pair.second;
                    Intrinsics.checkNotNullExpressionValue(obj, "pair.second");
                    bVar.a((E) obj);
                }
                Iterator it2 = requests.d.iterator();
                while (it2.hasNext()) {
                    ((D.a) it2.next()).a(requests);
                }
                break;
            default:
                ((d) this.b).c((c) this.c);
                break;
        }
    }
}
