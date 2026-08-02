package Nh;

import android.os.Parcel;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

/* loaded from: classes10.dex */
public final /* synthetic */ class a {
    public static int a(RecyclerView recyclerView, String str, RecyclerView.A a11, String str2, View view) {
        Intrinsics.checkNotNullParameter(recyclerView, str);
        Intrinsics.checkNotNullParameter(a11, str2);
        return recyclerView.getChildAdapterPosition(view);
    }

    public static int b(ImageDTO imageDTO, int i11, int i12) {
        return (imageDTO.hashCode() + i11) * i12;
    }

    public static String c(int i11, String str, String str2, String str3, String str4) {
        return str + i11 + str2 + str3 + str4;
    }

    public static String d(String str, String str2, String str3, String str4, Map map) {
        return str + str2 + str3 + map + str4;
    }

    public static String e(String str, String str2, NotificationDTO notificationDTO) {
        return str + notificationDTO + str2;
    }

    public static void f(Parcel parcel, int i11, Integer num) {
        parcel.writeInt(i11);
        parcel.writeInt(num.intValue());
    }

    public static void g(String str, String str2, String str3, StringBuilder sb2, List list) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(list);
    }

    public static void h(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }
}
