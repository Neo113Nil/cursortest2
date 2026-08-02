package Sh;

import android.os.Parcel;
import androidx.fragment.app.ComponentCallbacksC5392m;
import com.google.android.gms.internal.mlkit_vision_common.zzae;
import java.util.ArrayList;
import r8.c;
import ru.ozon.app.android.action.custom.CustomActionHandler;

/* loaded from: classes10.dex */
public final /* synthetic */ class a {
    public static int a(Parcel parcel, ArrayList arrayList, int i11, int i12) {
        arrayList.add(Integer.valueOf(parcel.readInt()));
        return i11 + i12;
    }

    public static ComponentCallbacksC5392m b(CustomActionHandler.HandlerReferences handlerReferences) {
        return handlerReferences.getRefs().getContainer().c();
    }

    public static c c(int i11, c.a aVar) {
        zzae zzaeVar = new zzae();
        zzaeVar.zza(i11);
        aVar.b(zzaeVar.zzb());
        return aVar.a();
    }

    public static void d(Boolean bool, String str, String str2, String str3, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(bool);
        sb2.append(str3);
    }
}
