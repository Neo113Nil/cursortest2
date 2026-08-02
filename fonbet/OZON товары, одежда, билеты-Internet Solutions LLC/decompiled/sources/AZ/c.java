package AZ;

import AZ.a;
import De.p;
import De.q;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements a {
    public static String b(StringBuilder sb2, BadgeDTO badgeDTO, String str) {
        sb2.append(badgeDTO);
        sb2.append(str);
        return sb2.toString();
    }

    public static void c(StringBuilder sb2, String str, List list, String str2, boolean z11) {
        sb2.append(str);
        sb2.append(list);
        sb2.append(str2);
        sb2.append(z11);
    }

    public static /* synthetic */ void d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, p pVar, q qVar, q qVar2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(pVar, qVar, qVar2) && atomicReferenceFieldUpdater.get(pVar) == qVar) {
        }
    }

    @Override // AZ.a
    public void a(a.C0019a it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }
}
