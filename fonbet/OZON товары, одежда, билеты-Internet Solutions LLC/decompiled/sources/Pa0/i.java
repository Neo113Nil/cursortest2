package Pa0;

import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kb0.EnumC7626a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class i implements Oa0.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ib.a<Fa0.a> f22135a;

    public i(@NotNull Ib.a<Fa0.a> lazyDataSource) {
        Intrinsics.checkNotNullParameter(lazyDataSource, "lazyDataSource");
        this.f22135a = lazyDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Oa0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        h hVar;
        int i11;
        boolean z11;
        EnumC7626a enumC7626a;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i12 = hVar.f22134f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                hVar.f22134f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = hVar.f22132d;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = hVar.f22134f;
                z11 = true;
                if (i11 != 0) {
                    s.b(obj);
                    Fa0.a aVar = this.f22135a.get();
                    hVar.f22134f = 1;
                    obj = aVar.c(hVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                enumC7626a = (EnumC7626a) obj;
                if (enumC7626a != EnumC7626a.Prod && enumC7626a != EnumC7626a.CnProd) {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }
        }
        hVar = new h(this, cVar);
        Object obj3 = hVar.f22132d;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = hVar.f22134f;
        z11 = true;
        if (i11 != 0) {
        }
        enumC7626a = (EnumC7626a) obj3;
        if (enumC7626a != EnumC7626a.Prod) {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }
}
