package p069j4;

import N4.b;
import Y3.i;
import com.google.android.gms.common.internal.D;
import com.google.firebase.auth.FirebaseAuth;
import io.sentry.cache.f;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p014b4.d;
import p042f4.InterfaceC0892a;
import p042f4.InterfaceC0893b;
import p042f4.u;
import p098n4.F;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements N4.a, p026d4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduledThreadPoolExecutor f14628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F f14629c;

    public /* synthetic */ a(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, F f7, int i7) {
        this.f14627a = i7;
        this.f14628b = scheduledThreadPoolExecutor;
        this.f14629c = f7;
    }

    @Override // N4.a
    public void b(b bVar) {
        u uVar;
        switch (this.f14627a) {
            case 0:
                p026d4.b bVar2 = (p026d4.b) bVar.get();
                d dVar = (d) bVar2;
                dVar.a(new a(this.f14628b, this.f14629c, 1));
                return;
            default:
                InterfaceC0893b interfaceC0893b = (InterfaceC0893b) bVar.get();
                final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f14628b;
                final F f7 = this.f14629c;
                InterfaceC0892a interfaceC0892a = new InterfaceC0892a() { // from class: j4.d
                    @Override // p042f4.InterfaceC0892a
                    public final void a(O4.b bVar3) {
                        scheduledThreadPoolExecutor.execute(new f(6, f7, bVar3));
                    }
                };
                FirebaseAuth firebaseAuth = (FirebaseAuth) interfaceC0893b;
                CopyOnWriteArrayList copyOnWriteArrayList = firebaseAuth.f11851c;
                copyOnWriteArrayList.add(interfaceC0892a);
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

    @Override // p026d4.a
    public void e(p014b4.b bVar) {
        this.f14628b.execute(new f(5, this.f14629c, bVar));
    }
}
