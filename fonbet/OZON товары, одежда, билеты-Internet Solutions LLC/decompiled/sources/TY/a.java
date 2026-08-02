package TY;

import android.os.Parcel;
import android.view.View;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import m3.r;
import ru.ozon.uni.atoms.data.text.TextDTO;
import u3.InterfaceC9928b;
import v1.C10181f;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements D, r.a {
    public /* synthetic */ a(Object obj) {
    }

    public static int a(int i11, int i12, int i13) {
        return zbtk.zbD(i11) + i12 + i13;
    }

    public static StringBuilder b(String str, long j11, String str2, TextDTO textDTO) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j11);
        sb2.append(str2);
        sb2.append(textDTO);
        return sb2;
    }

    public static void c(int i11, int i12, int i13, int i14, int i15) {
        C10181f.a(i11);
        C10181f.a(i12);
        C10181f.a(i13);
        C10181f.a(i14);
        C10181f.a(i15);
    }

    public static void d(Parcel parcel, int i11, Double d11) {
        parcel.writeInt(i11);
        parcel.writeDouble(d11.doubleValue());
    }

    public static void e(StringBuilder sb2, Long l11, String str, Long l12, String str2) {
        sb2.append(l11);
        sb2.append(str);
        sb2.append(l12);
        sb2.append(str2);
    }

    public static /* synthetic */ void f(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(obj, null) && atomicReference.get() == obj) {
        }
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        androidx.core.graphics.d a11 = Ql.c.a(view, "view", c5353y0, "insets", 7);
        Intrinsics.checkNotNullExpressionValue(a11, "insets.getInsets(WindowI…Compat.Type.systemBars())");
        view.setPadding(view.getPaddingLeft(), a11.f42127b, view.getPaddingRight(), a11.f42129d);
        return c5353y0;
    }
}
