package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.an, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnCancelListenerC0768an implements DialogInterface.OnCancelListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12709k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BinderC0857cn f12710l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ S2.d f12711m;

    public /* synthetic */ DialogInterfaceOnCancelListenerC0768an(BinderC0857cn binderC0857cn, S2.d dVar, int i) {
        this.f12709k = i;
        this.f12710l = binderC0857cn;
        this.f12711m = dVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f12709k) {
            case 0:
                BinderC0857cn binderC0857cn = this.f12710l;
                binderC0857cn.f13041o.b(binderC0857cn.f13042p);
                HashMap hashMap = new HashMap();
                hashMap.put("dialog_action", "dismiss");
                binderC0857cn.y3(binderC0857cn.f13042p, "rtsdc", hashMap);
                S2.d dVar = this.f12711m;
                if (dVar != null) {
                    dVar.a();
                    break;
                }
                break;
            default:
                BinderC0857cn binderC0857cn2 = this.f12710l;
                binderC0857cn2.f13041o.b(binderC0857cn2.f13042p);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("dialog_action", "dismiss");
                binderC0857cn2.y3(binderC0857cn2.f13042p, "dialog_click", hashMap2);
                S2.d dVar2 = this.f12711m;
                if (dVar2 != null) {
                    dVar2.a();
                    break;
                }
                break;
        }
    }
}
