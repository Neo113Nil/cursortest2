package F2;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzbwf;

/* JADX INFO: renamed from: F2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0219b extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzbok f2653d;

    public C0219b(Context context, String str, zzbok zzbokVar) {
        this.f2651b = context;
        this.f2652c = str;
        this.f2653d = zzbokVar;
    }

    @Override // F2.r
    public final Object a() {
        C0247p.b(this.f2651b, "rewarded");
        return new e1();
    }

    @Override // F2.r
    public final Object b(InterfaceC0220b0 interfaceC0220b0) {
        return interfaceC0220b0.d0(new p105o3.b(this.f2651b), this.f2652c, this.f2653d, 250930000);
    }

    @Override // F2.r
    public final /* bridge */ /* synthetic */ Object c() {
        return zzbwf.zza(this.f2651b, this.f2652c, this.f2653d);
    }
}
