package B6;

import android.os.Parcel;
import java.util.LinkedHashMap;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

/* loaded from: classes8.dex */
public final /* synthetic */ class b {
    public static int a(Parcel parcel, LinkedHashMap linkedHashMap, String str, int i11, int i12) {
        linkedHashMap.put(str, parcel.readString());
        return i11 + i12;
    }

    public static String b(StringBuilder sb2, AtomAction atomAction, String str) {
        sb2.append(atomAction);
        sb2.append(str);
        return sb2.toString();
    }

    public static void c(String str, String str2, String str3, StringBuilder sb2, OzonSpannableString ozonSpannableString) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append((Object) ozonSpannableString);
        sb2.append(str3);
    }
}
