package a3;

import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC0613Id;
import com.google.android.gms.internal.ads.InterfaceC0764aj;

/* loaded from: classes.dex */
public final class v implements InterfaceC0764aj {

    /* renamed from: k, reason: collision with root package name */
    public final o f6627k;

    /* renamed from: l, reason: collision with root package name */
    public final int f6628l;

    /* renamed from: m, reason: collision with root package name */
    public final String f6629m;

    public v(o oVar, int i, String str) {
        this.f6627k = oVar;
        this.f6628l = i;
        this.f6629m = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0764aj
    public final void b(u uVar) {
        if (uVar == null || this.f6628l != 2 || TextUtils.isEmpty(this.f6629m)) {
            return;
        }
        D3.h hVar = new D3.h(14, this, uVar, false);
        T2.H h3 = T2.L.f5672l;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            hVar.run();
        } else {
            AbstractC0613Id.f9539a.execute(hVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0764aj
    public final void a(String str) {
    }
}
