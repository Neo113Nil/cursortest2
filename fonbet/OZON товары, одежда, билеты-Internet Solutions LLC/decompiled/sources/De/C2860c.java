package De;

import android.os.Parcel;
import android.view.View;
import androidx.camera.core.impl.U0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C5353y0;
import com.google.crypto.tink.internal.AbstractC5887f;
import h8.C6873a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;

/* renamed from: De.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C2860c implements AbstractC5887f.a, androidx.core.view.D {
    public static U0 a(ArrayList arrayList, U0 u02) {
        arrayList.add(u02);
        return new U0();
    }

    public static ConstraintLayout.b b(PriceAtomView priceAtomView, int i11, int i12, int i13) {
        priceAtomView.setId(i11);
        return new ConstraintLayout.b(i12, i13);
    }

    public static List c(GZ.j jVar, String str) {
        List<String> pathSegments = jVar.b().getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, str);
        return pathSegments;
    }

    public static void e(Parcel parcel, int i11, Long l11) {
        parcel.writeInt(i11);
        parcel.writeLong(l11.longValue());
    }

    public static void f(Boolean bool, Integer num, String str, String str2, StringBuilder sb2) {
        sb2.append(num);
        sb2.append(str);
        sb2.append(bool);
        sb2.append(str2);
    }

    public static void g(String str, String str2, StringBuilder sb2, List list, List list2) {
        sb2.append(str);
        sb2.append(list);
        sb2.append(str2);
        sb2.append(list2);
    }

    public static /* synthetic */ boolean h(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AbstractC2861d abstractC2861d, AbstractC2861d abstractC2861d2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC2861d, null, abstractC2861d2)) {
            if (atomicReferenceFieldUpdater.get(abstractC2861d) != null) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.internal.AbstractC5887f.a
    public He.g d(com.google.crypto.tink.internal.F f7, S7.r rVar) {
        return C6873a.b(f7, rVar);
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        androidx.core.graphics.d a11 = Ql.c.a(view, "root", c5353y0, "insets", 7);
        Intrinsics.checkNotNullExpressionValue(a11, "getInsets(...)");
        androidx.core.graphics.d f7 = c5353y0.f(8);
        Intrinsics.checkNotNullExpressionValue(f7, "getInsets(...)");
        ru.ozon.android.messenger.utils.view.s.g(view, 0, 0, 0, c5353y0.p(8) ? f7.f42129d - a11.f42129d : f7.f42129d, 7);
        return C5353y0.f42353b;
    }
}
