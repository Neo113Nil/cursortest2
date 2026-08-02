package Fe;

import Ae.InterfaceC2395h;
import hg.InterfaceC6948a;
import io.reactivex.h;
import java.util.Arrays;
import java.util.ServiceConfigurationError;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import ze.EnumC11113a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final a[] f9428a;

    static {
        try {
            f9428a = (a[]) l.C(l.b(Arrays.asList(new a[0]).iterator())).toArray(new a[0]);
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    @NotNull
    public static final InterfaceC2395h a(@NotNull h hVar) {
        return new b(hVar, g.f71771a, -2, EnumC11113a.SUSPEND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [hg.a] */
    @NotNull
    public static final InterfaceC6948a b(@NotNull h hVar, @NotNull CoroutineContext coroutineContext) {
        a[] aVarArr = f9428a;
        int length = aVarArr.length;
        int i11 = 0;
        h hVar2 = hVar;
        while (i11 < length) {
            ?? a11 = aVarArr[i11].a();
            i11++;
            hVar2 = a11;
        }
        return hVar2;
    }
}
