package j4;

import Y3.i;
import b4.C0782b;
import b4.C0784d;
import com.google.android.gms.common.internal.D;
import com.google.firebase.auth.FirebaseAuth;
import d4.InterfaceC0964a;
import d4.InterfaceC0965b;
import f4.InterfaceC1089a;
import f4.InterfaceC1090b;
import f4.u;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import n4.F;

/* renamed from: j4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1315a implements N4.a, InterfaceC0964a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduledThreadPoolExecutor f14622b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F f14623c;

    public /* synthetic */ C1315a(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, F f7, int i7) {
        this.f14621a = i7;
        this.f14622b = scheduledThreadPoolExecutor;
        this.f14623c = f7;
    }

    @Override // N4.a
    public void b(N4.b bVar) {
        u uVar;
        switch (this.f14621a) {
            case 0:
                InterfaceC0965b interfaceC0965b = (InterfaceC0965b) bVar.get();
                C0784d c0784d = (C0784d) interfaceC0965b;
                c0784d.a(new C1315a(this.f14622b, this.f14623c, 1));
                return;
            default:
                InterfaceC1090b interfaceC1090b = (InterfaceC1090b) bVar.get();
                final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f14622b;
                final F f7 = this.f14623c;
                InterfaceC1089a interfaceC1089a = new InterfaceC1089a() { // from class: j4.d
                    @Override // f4.InterfaceC1089a
                    public final void a(O4.b bVar2) {
                        scheduledThreadPoolExecutor.execute(new io.sentry.cache.f(6, f7, bVar2));
                    }
                };
                FirebaseAuth firebaseAuth = (FirebaseAuth) interfaceC1090b;
                CopyOnWriteArrayList copyOnWriteArrayList = firebaseAuth.f11851c;
                copyOnWriteArrayList.add(interfaceC1089a);
                synchronized (firebaseAuth) {
                    if (firebaseAuth.f11871x == null) {
                        i iVar = firebaseAuth.f11849a;
                        D.i(iVar);
                        firebaseAuth.f11871x = new u(iVar);
                    }
                    uVar = firebaseAuth.f11871x;
                }
                uVar.a(copyOnWriteArrayList.size());
                return;
        }
    }

    @Override // d4.InterfaceC0964a
    public void e(C0782b c0782b) {
        this.f14622b.execute(new io.sentry.cache.f(5, this.f14623c, c0782b));
    }
}
