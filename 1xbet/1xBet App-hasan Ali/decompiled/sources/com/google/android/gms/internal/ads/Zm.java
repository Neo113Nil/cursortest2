package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class Zm implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12517a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12518b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12519c;

    public /* synthetic */ Zm(int i, Object obj, Object obj2) {
        this.f12517a = i;
        this.f12518b = obj;
        this.f12519c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f12517a) {
            case 0:
                BinderC0857cn binderC0857cn = (BinderC0857cn) this.f12518b;
                binderC0857cn.f13041o.b(binderC0857cn.f13042p);
                HashMap hashMap = new HashMap();
                hashMap.put("dialog_action", "dismiss");
                binderC0857cn.y3(binderC0857cn.f13042p, "rtsdc", hashMap);
                S2.d dVar = (S2.d) this.f12519c;
                if (dVar != null) {
                    dVar.a();
                    break;
                }
                break;
            case 1:
                BinderC0857cn binderC0857cn2 = (BinderC0857cn) this.f12518b;
                binderC0857cn2.f13041o.b(binderC0857cn2.f13042p);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("dialog_action", "dismiss");
                binderC0857cn2.y3(binderC0857cn2.f13042p, "dialog_click", hashMap2);
                S2.d dVar2 = (S2.d) this.f12519c;
                if (dVar2 != null) {
                    dVar2.a();
                    break;
                }
                break;
            default:
                ((JsPromptResult) this.f12518b).confirm(((EditText) this.f12519c).getText().toString());
                break;
        }
    }
}
