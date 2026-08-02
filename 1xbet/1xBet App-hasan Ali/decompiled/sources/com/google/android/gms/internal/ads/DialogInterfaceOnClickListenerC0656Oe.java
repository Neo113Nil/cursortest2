package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.Oe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0656Oe implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JsResult f10951b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0656Oe(JsResult jsResult, int i) {
        this.f10950a = i;
        this.f10951b = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f10950a) {
            case 0:
                this.f10951b.cancel();
                break;
            default:
                this.f10951b.confirm();
                break;
        }
    }
}
