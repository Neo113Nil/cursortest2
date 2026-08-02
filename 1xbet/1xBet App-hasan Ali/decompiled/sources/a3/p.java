package a3;

import com.google.android.gms.internal.ads.AbstractC1400ot;
import com.google.android.gms.internal.ads.DD;
import com.google.android.gms.internal.ads.EnumC1818y6;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public final class p implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6602a;

    /* renamed from: b, reason: collision with root package name */
    public final n f6603b;

    public /* synthetic */ p(n nVar, int i) {
        this.f6602a = i;
        this.f6603b = nVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        char c5;
        switch (this.f6602a) {
            case 0:
                String str = this.f6603b.f6594a;
                switch (str.hashCode()) {
                    case -1999289321:
                        if (str.equals("NATIVE")) {
                            c5 = 2;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -1372958932:
                        if (str.equals("INTERSTITIAL")) {
                            c5 = 1;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 543046670:
                        if (str.equals("REWARDED")) {
                            c5 = 3;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1951953708:
                        if (str.equals("BANNER")) {
                            c5 = 0;
                            break;
                        }
                        c5 = 65535;
                        break;
                    default:
                        c5 = 65535;
                        break;
                }
                return c5 != 0 ? c5 != 1 ? c5 != 2 ? c5 != 3 ? EnumC1818y6.f16397l : EnumC1818y6.f16404s : EnumC1818y6.f16403r : EnumC1818y6.f16400o : EnumC1818y6.f16398m;
            case 1:
                String lowerCase = this.f6603b.f6594a.toLowerCase(Locale.ROOT);
                AbstractC1400ot.D(lowerCase);
                return lowerCase;
            case 2:
                n nVar = this.f6603b;
                nVar.getClass();
                HashSet hashSet = new HashSet();
                hashSet.add(nVar.f6594a.toLowerCase(Locale.ROOT));
                return hashSet;
            case 3:
                return this.f6603b.f6595b;
            default:
                return this.f6603b.f6596c;
        }
    }
}
