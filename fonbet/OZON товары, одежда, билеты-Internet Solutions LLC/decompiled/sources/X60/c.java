package X60;

import Sc.o;
import Sc.s;
import a70.InterfaceC4958a;
import androidx.recyclerview.widget.LinearLayoutManager;
import e70.EnumC6314a;
import e70.InterfaceC6317d;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4958a f34148a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Z60.a f34149b;

    public c(@NotNull InterfaceC4958a remoteDataSource, @NotNull Z60.a localDataSource) {
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        this.f34148a = remoteDataSource;
        this.f34149b = localDataSource;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c7, code lost:
    
        if (r12 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0082, code lost:
    
        if (r12 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a5, code lost:
    
        if (r12 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // X60.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull String str, @NotNull String str2, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        b bVar;
        int i11;
        Object obj;
        String str3;
        c cVar2;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i12 = bVar.f34147i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f34147i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = bVar.f34145g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f34147i;
                if (i11 != 0) {
                    s.b(obj2);
                    bVar.f34142d = this;
                    bVar.f34143e = str;
                    bVar.f34144f = str2;
                    bVar.f34147i = 1;
                    Object r11 = this.f34149b.r(str, bVar);
                    if (r11 != aVar) {
                        obj = r11;
                        str3 = str2;
                        cVar2 = this;
                    }
                    return aVar;
                }
                if (i11 == 1) {
                    String str4 = bVar.f34144f;
                    str = bVar.f34143e;
                    c cVar3 = bVar.f34142d;
                    s.b(obj2);
                    str3 = str4;
                    cVar2 = cVar3;
                    obj = obj2;
                } else {
                    if (i11 == 2) {
                        s.b(obj2);
                        String str5 = (String) obj2;
                        return str5 != null ? new InterfaceC6317d.b(str5) : new InterfaceC6317d.a(EnumC6314a.NOT_FOUND);
                    }
                    if (i11 != 3) {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj2);
                        return (InterfaceC6317d) obj2;
                    }
                    str = bVar.f34143e;
                    cVar2 = bVar.f34142d;
                    s.b(obj2);
                    InterfaceC6317d interfaceC6317d = (InterfaceC6317d) obj2;
                    if (interfaceC6317d instanceof InterfaceC6317d.a) {
                        return interfaceC6317d;
                    }
                    if (!(interfaceC6317d instanceof InterfaceC6317d.b)) {
                        throw new o();
                    }
                    Z60.a aVar2 = cVar2.f34149b;
                    InputStream inputStream = (InputStream) ((InterfaceC6317d.b) interfaceC6317d).a();
                    bVar.f34142d = null;
                    bVar.f34143e = null;
                    bVar.f34147i = 4;
                    obj2 = aVar2.q(str, inputStream, bVar);
                }
                if (((Boolean) obj).booleanValue()) {
                    InterfaceC4958a interfaceC4958a = cVar2.f34148a;
                    bVar.f34142d = cVar2;
                    bVar.f34143e = str;
                    bVar.f34144f = null;
                    bVar.f34147i = 3;
                    obj2 = interfaceC4958a.d(str3, bVar);
                } else {
                    Z60.a aVar3 = cVar2.f34149b;
                    bVar.f34142d = null;
                    bVar.f34143e = null;
                    bVar.f34144f = null;
                    bVar.f34147i = 2;
                    obj2 = aVar3.o(str);
                }
                return aVar;
            }
        }
        bVar = new b(this, cVar);
        Object obj22 = bVar.f34145g;
        Wc.a aVar4 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f34147i;
        if (i11 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return aVar4;
    }
}
