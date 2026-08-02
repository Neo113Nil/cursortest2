package D40;

import Ve.C4543pr;
import android.os.Parcel;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.data.TestInfo;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.interfaces.CbottomElement2;
import ru.ozon.uni.atoms.data.common.Paddings;

/* loaded from: classes3.dex */
public final /* synthetic */ class b {
    public static C4543pr a(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, str2);
        return new C4543pr(str3);
    }

    public static String b(StringBuilder sb2, Paddings paddings, String str) {
        sb2.append(paddings);
        sb2.append(str);
        return sb2.toString();
    }

    public static CbottomElement2 c(String str, Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, str);
        return CbottomElement2.valueOf(parcel.readString());
    }

    public static void d(StringBuilder sb2, String str, String str2, TestInfo testInfo, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(testInfo);
        sb2.append(str3);
    }
}
