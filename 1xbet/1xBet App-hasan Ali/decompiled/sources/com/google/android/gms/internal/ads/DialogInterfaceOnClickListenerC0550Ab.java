package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.internal.ads.Ab, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0550Ab implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7593b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0550Ab(int i, Object obj) {
        this.f7592a = i;
        this.f7593b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f7592a) {
            case 0:
                ((C0558Bb) this.f7593b).t("User canceled the download.");
                break;
            default:
                ((JsPromptResult) this.f7593b).cancel();
                break;
        }
    }
}
