package bZ;

import Sc.r;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: bZ.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5612f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC5607a f55785a;

    public C5612f(@NotNull InterfaceC5607a cdnChooserApi) {
        Intrinsics.checkNotNullParameter(cdnChooserApi, "cdnChooserApi");
        this.f55785a = cdnChooserApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C5610d c5610d;
        int i11;
        if (cVar instanceof C5610d) {
            c5610d = (C5610d) cVar;
            int i12 = c5610d.f55782f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c5610d.f55782f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c5610d.f55780d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c5610d.f55782f;
                if (i11 == 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return ((r) obj).getF26106a();
                }
                s.b(obj);
                C5611e c5611e = new C5611e(this, null);
                c5610d.f55782f = 1;
                Object a11 = mZ.e.a(c5611e, c5610d);
                return a11 == aVar ? aVar : a11;
            }
        }
        c5610d = new C5610d(this, cVar);
        Object obj2 = c5610d.f55780d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c5610d.f55782f;
        if (i11 == 0) {
        }
    }
}
