package Jc0;

import Kc0.l;
import Sc.InterfaceC4008j;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import dc0.C6154S;
import dc0.C6178x;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nc0.C8495f;
import nc0.q;
import org.jetbrains.annotations.NotNull;
import uc0.C10020a;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<l> f14612a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<c> f14613b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C8495f> f14614c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<q> f14615d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C6178x f14616e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C10020a> f14617f;

    public j(@NotNull InterfaceC4008j<l> firstLaunchRepository, @NotNull InterfaceC4008j<c> instantAuth, @NotNull InterfaceC4008j<C8495f> crossAppAuthenticator, @NotNull InterfaceC4008j<q> crossAppAutologinUseCase, @NotNull C6178x currentUserRepository, @NotNull InterfaceC4008j<C10020a> migrateSharedStoreUseCase) {
        Intrinsics.checkNotNullParameter(firstLaunchRepository, "firstLaunchRepository");
        Intrinsics.checkNotNullParameter(instantAuth, "instantAuth");
        Intrinsics.checkNotNullParameter(crossAppAuthenticator, "crossAppAuthenticator");
        Intrinsics.checkNotNullParameter(crossAppAutologinUseCase, "crossAppAutologinUseCase");
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        Intrinsics.checkNotNullParameter(migrateSharedStoreUseCase, "migrateSharedStoreUseCase");
        this.f14612a = firstLaunchRepository;
        this.f14613b = instantAuth;
        this.f14614c = crossAppAuthenticator;
        this.f14615d = crossAppAutologinUseCase;
        this.f14616e = currentUserRepository;
        this.f14617f = migrateSharedStoreUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b8, code lost:
    
        if (r5 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        if (r5.i(r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
    
        if (r5.e(r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        if (r5.i(r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        i iVar;
        j jVar;
        j jVar2;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i11 = iVar.f14611g;
            if ((i11 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                iVar.f14611g = i11 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = iVar.f14609e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                switch (iVar.f14611g) {
                    case 0:
                        s.b(obj);
                        l value = this.f14612a.getValue();
                        iVar.f14608d = this;
                        iVar.f14611g = 1;
                        obj = value.g(iVar);
                        if (obj != aVar) {
                            jVar = this;
                            if (((Boolean) obj).booleanValue()) {
                                l value2 = jVar.f14612a.getValue();
                                iVar.f14608d = jVar;
                                iVar.f14611g = 2;
                                break;
                            }
                            jVar.f14614c.getValue().w();
                            return Unit.f71690a;
                        }
                        return aVar;
                    case 1:
                        jVar = iVar.f14608d;
                        s.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                        jVar.f14614c.getValue().w();
                        return Unit.f71690a;
                    case 2:
                        jVar = iVar.f14608d;
                        s.b(obj);
                        C10020a value3 = jVar.f14617f.getValue();
                        iVar.f14608d = jVar;
                        iVar.f14611g = 3;
                        break;
                    case 3:
                        jVar = iVar.f14608d;
                        s.b(obj);
                        q value4 = jVar.f14615d.getValue();
                        iVar.f14608d = jVar;
                        iVar.f14611g = 4;
                        break;
                    case 4:
                        jVar = iVar.f14608d;
                        s.b(obj);
                        C6178x c6178x = jVar.f14616e;
                        iVar.f14608d = jVar;
                        iVar.f14611g = 5;
                        obj = c6178x.a(iVar);
                        break;
                    case 5:
                        jVar = iVar.f14608d;
                        s.b(obj);
                        if (((C6154S) obj).i()) {
                            c value5 = jVar.f14613b.getValue();
                            iVar.f14608d = jVar;
                            iVar.f14611g = 6;
                            if (value5.h(iVar) != aVar) {
                                jVar2 = jVar;
                                jVar = jVar2;
                            }
                            return aVar;
                        }
                        jVar.f14614c.getValue().w();
                        return Unit.f71690a;
                    case 6:
                        jVar2 = iVar.f14608d;
                        s.b(obj);
                        jVar = jVar2;
                        jVar.f14614c.getValue().w();
                        return Unit.f71690a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        iVar = new i(this, cVar);
        Object obj2 = iVar.f14609e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        switch (iVar.f14611g) {
        }
    }
}
