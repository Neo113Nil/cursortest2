package D40;

import De.x;
import android.os.Parcel;
import android.view.View;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import m3.r;
import ru.ozon.android.ozonLogger.android.debug.OzonLoggerDebugActivity;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import u3.InterfaceC9928b;
import ze.C11115c;
import ze.m;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements D, r.a {
    public /* synthetic */ c(InterfaceC9928b.a aVar, int i11) {
    }

    public static int a(Map map, int i11, int i12) {
        return (map.hashCode() + i11) * i12;
    }

    public static StringBuilder b(String str, long j11, String str2, IconDTO iconDTO) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j11);
        sb2.append(str2);
        sb2.append(iconDTO);
        return sb2;
    }

    public static void c(Parcel parcel, int i11, Boolean bool) {
        parcel.writeInt(i11);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void d(StringBuilder sb2, Integer num, String str, Float f7, String str2) {
        sb2.append(num);
        sb2.append(str);
        sb2.append(f7);
        sb2.append(str2);
    }

    public static void e(StringBuilder sb2, CommonAtomLabelDTO commonAtomLabelDTO, String str, CommonAtomLabelDTO commonAtomLabelDTO2, String str2) {
        sb2.append(commonAtomLabelDTO);
        sb2.append(str);
        sb2.append(commonAtomLabelDTO2);
        sb2.append(str2);
    }

    public static /* synthetic */ boolean f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C11115c c11115c, x xVar, m mVar) {
        while (!atomicReferenceFieldUpdater.compareAndSet(c11115c, xVar, mVar)) {
            if (atomicReferenceFieldUpdater.get(c11115c) != xVar) {
                return false;
            }
        }
        return true;
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        int i11 = OzonLoggerDebugActivity.f92032h;
        androidx.core.graphics.d a11 = Ql.c.a(view, "view", c5353y0, "insets", 7);
        Intrinsics.checkNotNullExpressionValue(a11, "getInsets(...)");
        view.setPadding(a11.f42126a, a11.f42127b, a11.f42128c, a11.f42129d);
        return c5353y0;
    }
}
