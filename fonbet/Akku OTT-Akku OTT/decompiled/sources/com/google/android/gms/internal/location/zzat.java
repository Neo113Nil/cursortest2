package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.C0838l;
import com.google.android.gms.location.InterfaceC0928g;

/* loaded from: classes4.dex */
final class zzat implements C0838l.b<InterfaceC0928g> {
    final /* synthetic */ Location zza;

    public zzat(zzau zzauVar, Location location) {
        this.zza = location;
    }

    @Override // com.google.android.gms.common.api.internal.C0838l.b
    public final /* bridge */ /* synthetic */ void notifyListener(InterfaceC0928g interfaceC0928g) {
        interfaceC0928g.a();
    }

    @Override // com.google.android.gms.common.api.internal.C0838l.b
    public final void onNotifyListenerFailed() {
    }
}
