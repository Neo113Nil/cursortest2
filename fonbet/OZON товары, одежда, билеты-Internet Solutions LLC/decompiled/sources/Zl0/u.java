package Zl0;

import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mb.C8122a;
import org.jetbrains.annotations.NotNull;
import qb.C9017a;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final sb.b f36110a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final rb.b f36111b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Nl0.e f36112c;

    public u(@NotNull sb.b getCallingAppInfoUseCase, @NotNull rb.b packagesRepository, @NotNull Nl0.e arbiterRepository) {
        Intrinsics.checkNotNullParameter(getCallingAppInfoUseCase, "getCallingAppInfoUseCase");
        Intrinsics.checkNotNullParameter(packagesRepository, "packagesRepository");
        Intrinsics.checkNotNullParameter(arbiterRepository, "arbiterRepository");
        this.f36110a = getCallingAppInfoUseCase;
        this.f36111b = packagesRepository;
        this.f36112c = arbiterRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0052, B:14:0x0060, B:16:0x0071, B:19:0x0082, B:22:0x0091, B:23:0x00b6, B:25:0x00b7, B:26:0x00dd, B:27:0x00de, B:29:0x00e4, B:31:0x00e7, B:32:0x00f8, B:36:0x003f), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e4 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0052, B:14:0x0060, B:16:0x0071, B:19:0x0082, B:22:0x0091, B:23:0x00b6, B:25:0x00b7, B:26:0x00dd, B:27:0x00de, B:29:0x00e4, B:31:0x00e7, B:32:0x00f8, B:36:0x003f), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0052, B:14:0x0060, B:16:0x0071, B:19:0x0082, B:22:0x0091, B:23:0x00b6, B:25:0x00b7, B:26:0x00dd, B:27:0x00de, B:29:0x00e4, B:31:0x00e7, B:32:0x00f8, B:36:0x003f), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull C9017a c9017a, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        t tVar;
        int i11;
        C9017a c9017a2;
        u uVar;
        Object a11;
        Throwable b11;
        try {
            if (cVar instanceof t) {
                tVar = (t) cVar;
                int i12 = tVar.f36109h;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    tVar.f36109h = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = tVar.f36107f;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = tVar.f36109h;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        r.Companion companion = Sc.r.INSTANCE;
                        Nl0.e eVar = this.f36112c;
                        tVar.f36105d = c9017a;
                        tVar.f36106e = this;
                        tVar.f36109h = 1;
                        obj = eVar.c(tVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c9017a2 = c9017a;
                        uVar = this;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        uVar = tVar.f36106e;
                        c9017a2 = tVar.f36105d;
                        Sc.s.b(obj);
                    }
                    Za.a aVar2 = (Za.a) obj;
                    a11 = uVar.f36110a.a(c9017a2);
                    r.Companion companion2 = Sc.r.INSTANCE;
                    if (!(a11 instanceof r.b)) {
                        Za.a aVar3 = (Za.a) a11;
                        if (!Intrinsics.d(aVar2.a(), aVar3.a())) {
                            String message = "Package names mismatch! Saved host: " + aVar2.a() + ", caller: " + aVar3.a();
                            Intrinsics.checkNotNullParameter(message, "message");
                            throw new C8122a(message);
                        }
                        if (!Intrinsics.d(uVar.f36111b.getPackageName(), aVar3.a()) && !kotlin.text.h.D(aVar2.b(), aVar3.b(), true)) {
                            throw new IllegalStateException(("Saved host public key differs from caller public key. Expected: " + aVar2.b() + ", actual: " + aVar3.b()).toString());
                        }
                    }
                    b11 = Sc.r.b(a11);
                    if (b11 != null) {
                        return Unit.f71690a;
                    }
                    throw new IllegalStateException("Could not get calling host app info: " + c9017a2, b11);
                }
            }
            if (i11 != 0) {
            }
            Za.a aVar22 = (Za.a) obj;
            a11 = uVar.f36110a.a(c9017a2);
            r.Companion companion22 = Sc.r.INSTANCE;
            if (!(a11 instanceof r.b)) {
            }
            b11 = Sc.r.b(a11);
            if (b11 != null) {
            }
        } catch (Throwable th2) {
            r.Companion companion3 = Sc.r.INSTANCE;
            return Sc.s.a(th2);
        }
        tVar = new t(this, cVar);
        Object obj2 = tVar.f36107f;
        Wc.a aVar4 = Wc.a.COROUTINE_SUSPENDED;
        i11 = tVar.f36109h;
    }
}
