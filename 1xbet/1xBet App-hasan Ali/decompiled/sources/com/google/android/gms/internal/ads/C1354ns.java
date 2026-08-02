package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.function.Consumer;

/* renamed from: com.google.android.gms.internal.ads.ns, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1354ns implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14727b;

    public /* synthetic */ C1354ns(int i, Object obj) {
        this.f14726a = i;
        this.f14727b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f14726a) {
            case 0:
                ((C1390oj) this.f14727b).k("plaay_ts", Long.toString(((Long) obj).longValue()));
                break;
            case 1:
                ((C1390oj) this.f14727b).k("gqi", (String) obj);
                break;
            case 2:
                ((C1390oj) this.f14727b).k("action", (String) obj);
                break;
            case 3:
                ((C1390oj) this.f14727b).k("gqi", (String) obj);
                break;
            default:
                Bundle bundle = new Bundle();
                bundle.putString("mediaUrl", (String) obj);
                ((C0634Ld) this.f14727b).b(bundle);
                break;
        }
    }
}
