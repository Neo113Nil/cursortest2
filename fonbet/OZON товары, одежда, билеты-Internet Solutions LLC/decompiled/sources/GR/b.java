package GR;

import android.os.Parcel;
import android.view.View;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzh;
import java.util.List;
import org.joda.time.DateTime;
import ru.ozon.app.android.atoms.data.cell.CommonCellSettings;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapInfoV2WidgetHolder;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements D {
    public static int a(DateTime dateTime, int i11, int i12) {
        return (dateTime.hashCode() + i11) * i12;
    }

    public static int b(Paddings paddings, int i11, int i12) {
        return (paddings.hashCode() + i11) * i12;
    }

    public static int c(IconButtonV3DTO iconButtonV3DTO, int i11, int i12) {
        return (iconButtonV3DTO.hashCode() + i11) * i12;
    }

    public static Object d(zzbl zzblVar, int i11, List list, int i12) {
        zzh.zzh(zzblVar.name(), i11, list);
        return list.get(i12);
    }

    public static String e(StringBuilder sb2, Paddings paddings, String str, Paddings paddings2, String str2) {
        sb2.append(paddings);
        sb2.append(str);
        sb2.append(paddings2);
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder f(String str, OzonSpannableString ozonSpannableString, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append((Object) ozonSpannableString);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2;
    }

    public static void g(Parcel parcel, int i11, CommonCellSettings.LayoutPadding layoutPadding) {
        parcel.writeInt(i11);
        parcel.writeString(layoutPadding.name());
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 addInsetsListener$lambda$1;
        addInsetsListener$lambda$1 = HotelsMapInfoV2WidgetHolder.addInsetsListener$lambda$1(view, c5353y0);
        return addInsetsListener$lambda$1;
    }
}
