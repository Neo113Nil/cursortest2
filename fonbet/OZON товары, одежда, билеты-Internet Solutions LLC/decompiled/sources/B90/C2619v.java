package B90;

import android.graphics.RectF;
import android.os.Parcel;
import android.view.View;
import androidx.core.view.C5353y0;
import androidx.preference.Preference;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.molecules.view.tripRoute.TravelVerticalAirlineIconViewGroup;
import ru.ozon.host.config.debug.menu.HostConfigDebugMenuActivity;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import t40.EnumC9751a;
import y7.InterfaceC10852c;

/* renamed from: B90.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2619v implements Preference.d, androidx.core.view.D, InterfaceC10852c {
    public static int b(int i11, int i12, TextAtom textAtom) {
        return (textAtom.hashCode() + i11) * i12;
    }

    public static String c(StringBuilder sb2, double d11, String str) {
        sb2.append(d11);
        sb2.append(str);
        return sb2.toString();
    }

    public static void e(Parcel parcel, int i11, EnumC9751a enumC9751a) {
        parcel.writeInt(i11);
        parcel.writeString(enumC9751a.name());
    }

    @Override // y7.InterfaceC10852c
    public float a(RectF rectF) {
        float createAndBindLogoImageView$lambda$4$lambda$3;
        createAndBindLogoImageView$lambda$4$lambda$3 = TravelVerticalAirlineIconViewGroup.createAndBindLogoImageView$lambda$4$lambda$3(rectF);
        return createAndBindLogoImageView$lambda$4$lambda$3;
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        Thread.sleep(10000L);
        return true;
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        int i11 = HostConfigDebugMenuActivity.f97127i;
        androidx.core.graphics.d a11 = Ql.c.a(view, "view", c5353y0, "insets", 7);
        Intrinsics.checkNotNullExpressionValue(a11, "getInsets(...)");
        view.setPadding(a11.f42126a, a11.f42127b, a11.f42128c, a11.f42129d);
        return c5353y0;
    }
}
