package Ve;

import Ae.C2399j;
import R2.InterfaceC3917k;
import Sc.InterfaceC4008j;
import W2.f;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.rk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4593rk implements Nh {

    /* renamed from: b, reason: collision with root package name */
    public final Context f31981b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4008j f31982c;

    public C4593rk(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31981b = context;
        this.f31982c = Sc.k.b(new C4418li(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(f.a key, kotlin.coroutines.jvm.internal.c cVar) {
        Mi mi2;
        int i11;
        if (cVar instanceof Mi) {
            mi2 = (Mi) cVar;
            int i12 = mi2.f29479f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                mi2.f29479f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = mi2.f29477d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = mi2.f29479f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    C4571qq c4571qq = (C4571qq) this.f31982c.getValue();
                    mi2.f29479f = 1;
                    c4571qq.getClass();
                    Intrinsics.checkNotNullParameter(key, "key");
                    obj = C2399j.w(new Ae.C(new C4396kp(((InterfaceC3917k) AbstractC4255g.f31066c.getValue(c4571qq.f31921a, AbstractC4255g.f31064a[0])).getData(), key), new Rp()), mi2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Boolean.valueOf(obj != null);
            }
        }
        mi2 = new Mi(this, cVar);
        Object obj2 = mi2.f29477d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = mi2.f29479f;
        if (i11 != 0) {
        }
        return Boolean.valueOf(obj2 != null);
    }
}
