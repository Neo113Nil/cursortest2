package p033e3;

import android.content.Context;
import com.google.android.gms.common.api.internal.C0787h;
import com.google.android.gms.common.api.o;
import java.util.Iterator;
import java.util.Set;
import p062i3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12671a = new a("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        h.e0(context).f0();
        Set set = o.f11208a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((o) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        C0787h.a();
    }
}
