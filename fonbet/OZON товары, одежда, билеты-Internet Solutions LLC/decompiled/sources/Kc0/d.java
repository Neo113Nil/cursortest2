package Kc0;

import C2.AbstractC2708c;
import C2.AbstractC2714i;
import C2.C2706a;
import C2.C2710e;
import C2.C2723s;
import C2.g0;
import C2.h0;
import C2.j0;
import C2.l0;
import Sc.InterfaceC4008j;
import Sc.r;
import Sc.s;
import Vb0.b;
import android.app.Activity;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.instantAuth.data.CredentialDTO;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2723s f15797a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Db0.f> f15798b;

    public d(@NotNull C2723s credentialManager, @NotNull InterfaceC4008j activityLifecycleCallback) {
        Intrinsics.checkNotNullParameter(credentialManager, "credentialManager");
        Intrinsics.checkNotNullParameter(activityLifecycleCallback, "activityLifecycleCallback");
        this.f15797a = credentialManager;
        this.f15798b = activityLifecycleCallback;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0027, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
    
        r0 = Sc.r.INSTANCE;
        r5 = Sc.s.a(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        a aVar;
        int i11;
        Throwable b11;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i12 = aVar.f15787f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f15787f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f15785d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f15787f;
                if (i11 != 0) {
                    s.b(obj);
                    r.Companion companion = r.INSTANCE;
                    C2723s c2723s = this.f15797a;
                    C2706a c2706a = new C2706a();
                    aVar.f15787f = 1;
                    if (c2723s.c(c2706a, aVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                Object a11 = Unit.f71690a;
                r.Companion companion2 = r.INSTANCE;
                b.a aVar3 = Vb0.b.f28514a;
                b11 = r.b(a11);
                if (b11 != null) {
                    b.a.c(aVar3, b11);
                }
                return Boolean.valueOf(!(a11 instanceof r.b));
            }
        }
        aVar = new a(this, cVar);
        Object obj2 = aVar.f15785d;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f15787f;
        if (i11 != 0) {
        }
        Object a112 = Unit.f71690a;
        r.Companion companion22 = r.INSTANCE;
        b.a aVar32 = Vb0.b.f28514a;
        b11 = r.b(a112);
        if (b11 != null) {
        }
        return Boolean.valueOf(!(a112 instanceof r.b));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(6:11|12|13|(1:15)|16|(1:21)(2:18|19))(2:23|24))(2:25|26))(3:30|31|(2:33|29)(1:34))|27))|37|6|7|(0)(0)|27) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r8 != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x002b, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        r0 = Sc.r.INSTANCE;
        r8 = Sc.s.a(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        b bVar;
        int i11;
        d dVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i12 = bVar.f15791g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f15791g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f15789e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f15791g;
                if (i11 != 0) {
                    s.b(obj);
                    r.Companion companion = r.INSTANCE;
                    Db0.f value = this.f15798b.getValue();
                    bVar.f15788d = this;
                    bVar.f15791g = 1;
                    obj = value.g(bVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    dVar = this;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        AbstractC2714i a11 = ((h0) obj).a();
                        Intrinsics.g(a11, "null cannot be cast to non-null type androidx.credentials.PasswordCredential");
                        Object a12 = (l0) a11;
                        r.Companion companion2 = r.INSTANCE;
                        b.a aVar2 = Vb0.b.f28514a;
                        Throwable b11 = r.b(a12);
                        if (b11 != null) {
                            b.a.c(aVar2, b11);
                        }
                        if (a12 instanceof r.b) {
                            return null;
                        }
                        return a12;
                    }
                    dVar = bVar.f15788d;
                    s.b(obj);
                }
                Activity activity = (Activity) obj;
                C2723s c2723s = dVar.f15797a;
                Intrinsics.f(activity);
                g0 g0Var = new g0(C7714v.a0(new j0(null)));
                bVar.f15788d = null;
                bVar.f15791g = 2;
                obj = c2723s.b(activity, g0Var, bVar);
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f15789e;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f15791g;
        if (i11 != 0) {
        }
        Activity activity2 = (Activity) obj2;
        C2723s c2723s2 = dVar.f15797a;
        Intrinsics.f(activity2);
        g0 g0Var2 = new g0(C7714v.a0(new j0(null)));
        bVar.f15788d = null;
        bVar.f15791g = 2;
        obj2 = c2723s2.b(activity2, g0Var2, bVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(6:11|12|13|(1:15)|16|17)(2:20|21))(2:22|23))(3:27|28|(2:30|26)(1:31))|24))|34|6|7|(0)(0)|24) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (r9 != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002a, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
    
        r9 = Sc.r.INSTANCE;
        r9 = Sc.s.a(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(@NotNull CredentialDTO credentialDTO, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        c cVar2;
        int i11;
        CredentialDTO credentialDTO2;
        d dVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i12 = cVar2.f15796h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar2.f15796h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cVar2.f15794f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = cVar2.f15796h;
                if (i11 != 0) {
                    s.b(obj);
                    r.Companion companion = r.INSTANCE;
                    Db0.f value = this.f15798b.getValue();
                    cVar2.f15792d = credentialDTO;
                    cVar2.f15793e = this;
                    cVar2.f15796h = 1;
                    obj = value.g(cVar2);
                    if (obj == aVar) {
                        return aVar;
                    }
                    credentialDTO2 = credentialDTO;
                    dVar = this;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        Object a11 = (AbstractC2708c) obj;
                        r.Companion companion2 = r.INSTANCE;
                        b.a aVar2 = Vb0.b.f28514a;
                        Throwable b11 = r.b(a11);
                        if (b11 != null) {
                            b.a.c(aVar2, b11);
                        }
                        return Boolean.valueOf(!(a11 instanceof r.b));
                    }
                    dVar = cVar2.f15793e;
                    credentialDTO2 = cVar2.f15792d;
                    s.b(obj);
                }
                Activity activity = (Activity) obj;
                C2723s c2723s = dVar.f15797a;
                Intrinsics.f(activity);
                C2710e c2710e = new C2710e(credentialDTO2.getPhone(), credentialDTO2.getPassword());
                cVar2.f15792d = null;
                cVar2.f15793e = null;
                cVar2.f15796h = 2;
                obj = c2723s.d(activity, c2710e, cVar2);
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f15794f;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar2.f15796h;
        if (i11 != 0) {
        }
        Activity activity2 = (Activity) obj2;
        C2723s c2723s2 = dVar.f15797a;
        Intrinsics.f(activity2);
        C2710e c2710e2 = new C2710e(credentialDTO2.getPhone(), credentialDTO2.getPassword());
        cVar2.f15792d = null;
        cVar2.f15793e = null;
        cVar2.f15796h = 2;
        obj2 = c2723s2.d(activity2, c2710e2, cVar2);
    }
}
