package P2;

import com.google.android.gms.internal.ads.zzheg;
import com.google.android.gms.internal.ads.zzheo;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class q implements zzheg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0388n f5545b;

    public /* synthetic */ q(C0388n c0388n, int i7) {
        this.f5544a = i7;
        this.f5545b = c0388n;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        switch (this.f5544a) {
            case 0:
                String lowerCase = this.f5545b.f5535a.toLowerCase(Locale.ROOT);
                zzheo.zzb(lowerCase);
                return lowerCase;
            case 1:
                C0388n c0388n = this.f5545b;
                c0388n.getClass();
                HashSet hashSet = new HashSet();
                hashSet.add(c0388n.f5535a.toLowerCase(Locale.ROOT));
                return hashSet;
            case 2:
                return this.f5545b.f5536b;
            default:
                return this.f5545b.f5537c;
        }
    }
}
