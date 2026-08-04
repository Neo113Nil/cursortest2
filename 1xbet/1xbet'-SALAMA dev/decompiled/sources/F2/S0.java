package F2;

import com.google.android.gms.internal.ads.zzbld;
import com.google.android.gms.internal.ads.zzblg;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class S0 extends zzbld {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T0 f2632a;

    public /* synthetic */ S0(T0 t7) {
        this.f2632a = t7;
    }

    @Override // com.google.android.gms.internal.ads.zzble
    public final void zzb(List list) {
        int i7;
        ArrayList arrayList;
        synchronized (this.f2632a.f2634a) {
            T0 t7 = this.f2632a;
            t7.f2636c = false;
            t7.f2637d = true;
            arrayList = new ArrayList(this.f2632a.f2635b);
            this.f2632a.f2635b.clear();
        }
        zzblg zzblgVarA = T0.a(list);
        int size = arrayList.size();
        for (i7 = 0; i7 < size; i7++) {
            ((L5.U) arrayList.get(i7)).a(zzblgVarA);
        }
    }
}
