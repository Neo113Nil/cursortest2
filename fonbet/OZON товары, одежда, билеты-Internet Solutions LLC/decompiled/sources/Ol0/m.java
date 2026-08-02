package Ol0;

import R2.InterfaceC3917k;
import W2.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC3917k<W2.f> f20494a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final f.a<Boolean> f20495b;

    public m(@NotNull InterfaceC3917k<W2.f> storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f20494a = storage;
        this.f20495b = W2.i.a("test_mode_enabled");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        if (Eb.g.d(r6, r2.f20495b, false, r0) == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        l lVar;
        int i11;
        m mVar;
        ?? booleanValue;
        int i12;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i13 = lVar.f20493h;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                lVar.f20493h = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = lVar.f20491f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = lVar.f20493h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    lVar.f20489d = this;
                    lVar.f20493h = 1;
                    obj = Eb.g.c(this.f20494a, this.f20495b, lVar);
                    if (obj != aVar) {
                        mVar = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i12 = lVar.f20490e;
                    Sc.s.b(obj);
                    return Boolean.valueOf(i12 != 0);
                }
                mVar = lVar.f20489d;
                Sc.s.b(obj);
                Boolean bool = (Boolean) obj;
                booleanValue = bool == null ? bool.booleanValue() : 0;
                if (booleanValue != 0) {
                    InterfaceC3917k<W2.f> interfaceC3917k = mVar.f20494a;
                    lVar.f20489d = null;
                    lVar.f20490e = booleanValue;
                    lVar.f20493h = 2;
                }
                i12 = booleanValue;
                return Boolean.valueOf(i12 != 0);
            }
        }
        lVar = new l(this, cVar);
        Object obj2 = lVar.f20491f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = lVar.f20493h;
        if (i11 != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        if (bool2 == null) {
        }
        if (booleanValue != 0) {
        }
        i12 = booleanValue;
        return Boolean.valueOf(i12 != 0);
    }
}
