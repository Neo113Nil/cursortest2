package Lh;

import com.google.android.gms.internal.mlkit_common.zzay;
import io.sentry.InterfaceC7217w1;
import io.sentry.U;
import io.sentry.protocol.t;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import r8.c;

/* loaded from: classes10.dex */
public final /* synthetic */ class b implements InterfaceC7217w1 {
    public static int a(int i11, String str, String str2) {
        return (str + str2 + i11).hashCode();
    }

    public static StringBuilder b(long j11, String str, String str2, List list) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j11);
        sb2.append(str2);
        sb2.append(list);
        return sb2;
    }

    public static c c(int i11, c.a aVar) {
        zzay zzayVar = new zzay();
        zzayVar.zza(i11);
        aVar.b(zzayVar.zzb());
        return aVar.a();
    }

    @Override // io.sentry.InterfaceC7217w1
    public void e(U it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.o(t.f68325b);
    }
}
