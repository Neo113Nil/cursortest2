package Kk;

import GZ.j;
import S7.q;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.z;
import h8.C6873a;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.atom.icon.IconView;

/* renamed from: Kk.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C3531a implements z.a {
    public static ConstraintLayout.b a(IconView iconView, int i11, int i12, int i13) {
        iconView.setId(i11);
        return new ConstraintLayout.b(i12, i13);
    }

    public static boolean c(j jVar, String str, String str2) {
        List<String> pathSegments = jVar.b().getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, str);
        return Intrinsics.d(C7714v.M(pathSegments), str2);
    }

    public static /* synthetic */ boolean d(AtomicReference atomicReference, org.joda.time.tz.b bVar) {
        while (!atomicReference.compareAndSet(null, bVar)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.internal.z.a
    public G b(q qVar) {
        return C6873a.c((g8.d) qVar);
    }
}
