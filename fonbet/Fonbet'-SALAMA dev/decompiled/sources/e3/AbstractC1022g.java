package e3;

import android.content.Context;
import com.google.android.gms.common.api.internal.C0831h;
import com.google.android.gms.common.api.o;
import i3.C1263a;
import java.util.Iterator;
import java.util.Set;

/* renamed from: e3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1022g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1263a f12665a = new C1263a("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        C1023h.e0(context).f0();
        Set set = o.f11208a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((o) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        C0831h.a();
    }
}
