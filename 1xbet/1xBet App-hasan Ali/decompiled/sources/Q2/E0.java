package Q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.E5;
import com.google.android.gms.internal.ads.F5;
import com.google.android.gms.internal.ads.Q9;
import com.google.android.gms.internal.ads.Ql;
import com.google.android.gms.internal.ads.U9;
import com.google.android.gms.internal.ads.V9;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class E0 extends E5 implements U9 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4914k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4915l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(int i, Object obj) {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        this.f4914k = i;
        this.f4915l = obj;
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(Q9.CREATOR);
        F5.b(parcel);
        x1(createTypedArrayList);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.U9
    public final void x1(List list) {
        int i;
        ArrayList arrayList;
        switch (this.f4914k) {
            case 0:
                synchronized (((F0) this.f4915l).f4917a) {
                    F0 f02 = (F0) this.f4915l;
                    f02.f4919c = false;
                    f02.f4920d = true;
                    arrayList = new ArrayList(((F0) this.f4915l).f4918b);
                    ((F0) this.f4915l).f4918b.clear();
                }
                V9 a5 = F0.a(list);
                int size = arrayList.size();
                for (i = 0; i < size; i++) {
                    ((P3.a) arrayList.get(i)).a(a5);
                }
                return;
            default:
                ((Ql) this.f4915l).b(list);
                return;
        }
    }
}
