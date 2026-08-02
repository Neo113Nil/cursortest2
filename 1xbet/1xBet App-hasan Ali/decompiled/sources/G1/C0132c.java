package G1;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;

@N("activity")
/* renamed from: G1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0132c extends O {

    /* renamed from: c, reason: collision with root package name */
    public final Activity f1888c;

    public C0132c(Context context) {
        Object obj;
        kotlin.jvm.internal.l.f("context", context);
        Iterator it = n4.i.M(context, C0131b.f1878m).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.f1888c = (Activity) obj;
    }

    @Override // G1.O
    public final y a() {
        return new C0130a(this);
    }

    @Override // G1.O
    public final y c(y yVar) {
        throw new IllegalStateException(L1.a.o(new StringBuilder("Destination "), ((C0130a) yVar).f1969p, " does not have an Intent set.").toString());
    }

    @Override // G1.O
    public final boolean f() {
        Activity activity = this.f1888c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
