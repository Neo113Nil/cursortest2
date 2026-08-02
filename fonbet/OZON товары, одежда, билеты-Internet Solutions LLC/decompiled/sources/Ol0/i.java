package Ol0;

import R2.InterfaceC3917k;
import W2.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC3917k<W2.f> f20481a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final f.a<String> f20482b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final f.a<String> f20483c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final f.a<String> f20484d;

    public i(@NotNull InterfaceC3917k<W2.f> storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f20481a = storage;
        this.f20482b = W2.i.c("master_host_package");
        this.f20483c = W2.i.c("master_host_pub");
        this.f20484d = W2.i.c("master_default_host");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (Eb.g.d(r9, r2.f20484d, r8, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Za.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        h hVar;
        int i11;
        i iVar;
        boolean d11;
        int i12;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i13 = hVar.f20480i;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                hVar.f20480i = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = hVar.f20478g;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = hVar.f20480i;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    hVar.f20475d = this;
                    hVar.f20476e = aVar;
                    hVar.f20480i = 1;
                    obj = Eb.g.c(this.f20481a, this.f20484d, hVar);
                    if (obj != aVar2) {
                        iVar = this;
                    }
                    return aVar2;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i12 = hVar.f20477f;
                    Sc.s.b(obj);
                    return Boolean.valueOf(i12 != 0);
                }
                aVar = hVar.f20476e;
                iVar = hVar.f20475d;
                Sc.s.b(obj);
                d11 = Intrinsics.d((String) obj, aVar == null ? aVar.a() : null);
                int i14 = !d11 ? 1 : 0;
                if (!d11) {
                    InterfaceC3917k<W2.f> interfaceC3917k = iVar.f20481a;
                    String a11 = aVar != null ? aVar.a() : null;
                    hVar.f20475d = null;
                    hVar.f20476e = null;
                    hVar.f20477f = i14;
                    hVar.f20480i = 2;
                }
                i12 = i14;
                return Boolean.valueOf(i12 != 0);
            }
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.f20478g;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = hVar.f20480i;
        if (i11 != 0) {
        }
        d11 = Intrinsics.d((String) obj2, aVar == null ? aVar.a() : null);
        int i142 = !d11 ? 1 : 0;
        if (!d11) {
        }
        i12 = i142;
        return Boolean.valueOf(i12 != 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        g gVar;
        int i11;
        i iVar;
        String str;
        String str2;
        String str3;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i12 = gVar.f20474g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                gVar.f20474g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = gVar.f20472e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = gVar.f20474g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    gVar.f20471d = this;
                    gVar.f20474g = 1;
                    obj = Eb.g.c(this.f20481a, this.f20482b, gVar);
                    if (obj != aVar) {
                        iVar = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) gVar.f20471d;
                    Sc.s.b(obj);
                    str3 = (String) obj;
                    if (str3 != null) {
                        return null;
                    }
                    return new Za.a(str2, str3);
                }
                iVar = (i) gVar.f20471d;
                Sc.s.b(obj);
                str = (String) obj;
                if (str != null) {
                    return null;
                }
                InterfaceC3917k<W2.f> interfaceC3917k = iVar.f20481a;
                gVar.f20471d = str;
                gVar.f20474g = 2;
                Object c11 = Eb.g.c(interfaceC3917k, iVar.f20483c, gVar);
                if (c11 != aVar) {
                    str2 = str;
                    obj = c11;
                    str3 = (String) obj;
                    if (str3 != null) {
                    }
                }
                return aVar;
            }
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.f20472e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = gVar.f20474g;
        if (i11 != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
    }
}
