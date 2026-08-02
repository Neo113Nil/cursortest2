package Ve;

import android.os.Parcel;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import l3.C7856b;
import m3.r;
import qc.InterfaceC9021c;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.account.adult.presenter.AdultVO;
import u3.InterfaceC9928b;

/* loaded from: classes10.dex */
public final /* synthetic */ class Om implements OnFailureListener, InterfaceC9021c, r.a {
    public /* synthetic */ Om(InterfaceC9928b.a aVar, C7856b c7856b) {
    }

    public static String a(String str, StringBuilder sb2, ArrayList arrayList) {
        sb2.append(arrayList);
        sb2.append(str);
        return sb2.toString();
    }

    public static void b(Parcel parcel, int i11, Float f7) {
        parcel.writeInt(i11);
        parcel.writeFloat(f7.floatValue());
    }

    @Override // qc.InterfaceC9021c
    public Object apply(Object obj, Object obj2) {
        AdultVO observeItem$lambda$0;
        observeItem$lambda$0 = AdultDelegate.observeItem$lambda$0((Boolean) obj, (AdultVO) obj2);
        return observeItem$lambda$0;
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }
}
