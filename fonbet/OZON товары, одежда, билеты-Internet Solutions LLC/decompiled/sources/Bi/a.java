package Bi;

import WZ.t;
import android.animation.ValueAnimator;
import android.os.Parcel;
import android.widget.LinearLayout;
import j3.C7255K;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import m3.r;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import u3.InterfaceC9928b;

/* loaded from: classes10.dex */
public final /* synthetic */ class a implements r.a {
    public /* synthetic */ a(InterfaceC9928b.a aVar, C7255K c7255k) {
    }

    public static int a(CommonControlSettings commonControlSettings, int i11, int i12) {
        return (commonControlSettings.hashCode() + i11) * i12;
    }

    public static Object b(ValueAnimator valueAnimator, String str, String str2) {
        Intrinsics.checkNotNullParameter(valueAnimator, str);
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.g(animatedValue, str2);
        return animatedValue;
    }

    public static Iterator c(List list, Parcel parcel) {
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static void d(int i11, int i12, TextAtomV2View textAtomV2View) {
        textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(i11, i12));
    }

    public static void e(long j11, String str, StringBuilder sb2) {
        sb2.append((Object) C7807Z.v(j11));
        sb2.append(str);
    }

    public static void f(StringBuilder sb2, String str, String str2, String str3, t tVar) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(tVar);
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }
}
