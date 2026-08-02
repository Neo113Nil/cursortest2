package Z8;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxa;
import com.google.mlkit.common.sdkinternal.AbstractC5949e;

/* loaded from: classes.dex */
public final class h extends AbstractC5949e {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.mlkit.common.sdkinternal.h f35700a;

    public h(com.google.mlkit.common.sdkinternal.h hVar) {
        this.f35700a = hVar;
    }

    @Override // com.google.mlkit.common.sdkinternal.AbstractC5949e
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        W8.b bVar = (W8.b) obj;
        com.google.mlkit.common.sdkinternal.h hVar = this.f35700a;
        Context b11 = hVar.b();
        zzwp zzb = zzxa.zzb(b.d());
        return new k(hVar, bVar, (n.b(b11) || GoogleApiAvailabilityLight.getInstance().getApkVersion(b11) >= 204500000) ? new n(b11, bVar, zzb) : new p(b11, bVar, zzb), zzb);
    }
}
