package m3;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import k3.InterfaceC2035c;

/* loaded from: classes.dex */
public abstract class h extends AbstractC2095e implements InterfaceC2035c {

    /* renamed from: y, reason: collision with root package name */
    public final Set f18066y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(Context context, Looper looper, int i, C0.c cVar, k3.g gVar, k3.h hVar) {
        super(context, looper, r3, r4, i, new k(gVar), new k(hVar), (String) cVar.f814e);
        F a5 = F.a(context);
        j3.e eVar = j3.e.f17512d;
        v.e(gVar);
        v.e(hVar);
        Set set = (Set) cVar.f812c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f18066y = set;
    }

    @Override // k3.InterfaceC2035c
    public final Set d() {
        return m() ? this.f18066y : Collections.EMPTY_SET;
    }

    @Override // m3.AbstractC2095e
    public final Account p() {
        return null;
    }

    @Override // m3.AbstractC2095e
    public final Set s() {
        return this.f18066y;
    }
}
