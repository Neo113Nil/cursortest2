package T2;

import com.google.android.gms.internal.ads.C1565sf;
import com.google.android.gms.internal.ads.DD;

/* loaded from: classes.dex */
public final class D implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5633a;

    /* renamed from: b, reason: collision with root package name */
    public final C1565sf f5634b;

    public /* synthetic */ D(C1565sf c1565sf, int i) {
        this.f5633a = i;
        this.f5634b = c1565sf;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final /* bridge */ /* synthetic */ Object d() {
        switch (this.f5633a) {
            case 0:
                return new C(this.f5634b.a());
            default:
                return new a3.z(this.f5634b.a());
        }
    }
}
