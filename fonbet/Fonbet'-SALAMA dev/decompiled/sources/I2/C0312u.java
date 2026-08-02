package I2;

import A1.x0;
import com.google.android.gms.internal.ads.zzaqg;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import w1.P2;

/* renamed from: I2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0312u extends zzaqg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte[] f3650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f3651b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J2.g f3652c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0312u(int i7, String str, C0313v c0313v, P2 p22, byte[] bArr, HashMap hashMap, J2.g gVar) {
        super(i7, str, c0313v, p22);
        this.f3650a = bArr;
        this.f3651b = hashMap;
        this.f3652c = gVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final Map zzl() {
        HashMap hashMap = this.f3651b;
        return hashMap == null ? Collections.emptyMap() : hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final byte[] zzx() {
        byte[] bArr = this.f3650a;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaqg, com.google.android.gms.internal.ads.zzapb
    /* renamed from: zzz */
    public final void zzo(String str) {
        J2.g gVar = this.f3652c;
        if (J2.g.c() && str != null) {
            gVar.d("onNetworkResponseBody", new x0(str.getBytes(), 5));
        }
        super.zzo(str);
    }
}
