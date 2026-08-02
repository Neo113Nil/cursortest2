package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.Ne, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0649Ne implements DialogInterface.OnCancelListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10796k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f10797l;

    public /* synthetic */ DialogInterfaceOnCancelListenerC0649Ne(int i, Object obj) {
        this.f10796k = i;
        this.f10797l = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f10796k) {
            case 0:
                ((JsResult) this.f10797l).cancel();
                break;
            case 1:
                ((JsPromptResult) this.f10797l).cancel();
                break;
            default:
                S2.d dVar = (S2.d) this.f10797l;
                if (dVar != null) {
                    dVar.a();
                    break;
                }
                break;
        }
    }
}
