package M;

import I4.j;
import P2.BinderC0386l;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbyc;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4520b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4521c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4523e;

    public /* synthetic */ b(BinderC0386l binderC0386l, zzbyc zzbycVar, int i7, Bundle bundle) {
        this.f4519a = 2;
        this.f4520b = binderC0386l;
        this.f4521c = zzbycVar;
        this.f4523e = i7;
        this.f4522d = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f4519a) {
            case 0:
                return e.a((String) this.f4520b, (Context) this.f4521c, (j) this.f4522d, this.f4523e);
            case 1:
                try {
                    return e.a((String) this.f4520b, (Context) this.f4521c, (j) this.f4522d, this.f4523e);
                } catch (Throwable unused) {
                    return new d(-3);
                }
            default:
                BinderC0386l binderC0386l = (BinderC0386l) this.f4520b;
                Context context = binderC0386l.f5516b;
                zzbyc zzbycVar = (zzbyc) this.f4521c;
                return binderC0386l.Z(context, zzbycVar.zza, zzbycVar.zzb, zzbycVar.zzc, zzbycVar.zzd, this.f4523e, zzbycVar.zzf, (Bundle) this.f4522d, zzbycVar);
        }
    }

    public /* synthetic */ b(String str, Context context, j jVar, int i7, int i8) {
        this.f4519a = i8;
        this.f4520b = str;
        this.f4521c = context;
        this.f4522d = jVar;
        this.f4523e = i7;
    }
}
