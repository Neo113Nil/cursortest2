package C;

import android.content.Context;
import android.os.Parcel;
import com.google.crypto.tink.internal.x;
import h8.C6873a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final /* synthetic */ class J implements x.a {
    public static String a(Context context, String str, GZ.j jVar, String str2, String str3) {
        Intrinsics.checkNotNullParameter(context, str);
        Intrinsics.checkNotNullParameter(jVar, str2);
        String uri = jVar.b().toString();
        Intrinsics.checkNotNullExpressionValue(uri, str3);
        return uri;
    }

    public static String b(Integer num, String str) {
        return str + num;
    }

    public static Iterator c(Parcel parcel, int i11, List list) {
        parcel.writeInt(i11);
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static Iterator e(Map map, Parcel parcel, int i11) {
        parcel.writeInt(i11);
        parcel.writeInt(map.size());
        return map.entrySet().iterator();
    }

    @Override // com.google.crypto.tink.internal.x.a
    public S7.q d(com.google.crypto.tink.internal.G g10) {
        return C6873a.a(g10);
    }
}
