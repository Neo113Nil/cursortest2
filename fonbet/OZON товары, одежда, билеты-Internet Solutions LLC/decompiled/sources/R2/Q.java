package R2;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.FileOutputStream;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class Q<T> extends J<T> implements o0<T> {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // R2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        P p11;
        int i11;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (cVar instanceof P) {
            p11 = (P) cVar;
            int i12 = p11.f24322h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                p11.f24322h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = p11.f24320f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = p11.f24322h;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    f();
                    FileOutputStream fileOutputStream3 = new FileOutputStream(g());
                    try {
                        a0<T> h11 = h();
                        l0 l0Var = new l0(fileOutputStream3);
                        p11.f24318d = fileOutputStream3;
                        p11.f24319e = fileOutputStream3;
                        p11.f24322h = 1;
                        if (((W2.h) h11).b(obj, l0Var, p11) == aVar) {
                            return aVar;
                        }
                        fileOutputStream2 = fileOutputStream3;
                        fileOutputStream = fileOutputStream2;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream3;
                        throw th;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream2 = p11.f24319e;
                    fileOutputStream = p11.f24318d;
                    try {
                        Sc.s.b(obj2);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            Vd0.b.a(fileOutputStream, th);
                            throw th4;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                Unit unit = Unit.f71690a;
                Vd0.b.a(fileOutputStream, null);
                return Unit.f71690a;
            }
        }
        p11 = new P(this, cVar);
        Object obj22 = p11.f24320f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = p11.f24322h;
        if (i11 != 0) {
        }
        fileOutputStream2.getFD().sync();
        Unit unit2 = Unit.f71690a;
        Vd0.b.a(fileOutputStream, null);
        return Unit.f71690a;
    }
}
