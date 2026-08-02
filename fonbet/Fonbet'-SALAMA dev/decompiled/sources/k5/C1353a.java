package k5;

import A5.o;
import A5.p;
import A5.q;
import A5.r;
import A5.s;
import android.content.ContentResolver;
import android.provider.Settings;
import t6.h;
import w5.C1782b;
import w5.InterfaceC1783c;

/* renamed from: k5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1353a implements InterfaceC1783c, q {

    /* renamed from: a, reason: collision with root package name */
    public s f14790a;

    /* renamed from: b, reason: collision with root package name */
    public ContentResolver f14791b;

    @Override // w5.InterfaceC1783c
    public final void onAttachedToEngine(C1782b c1782b) {
        h.e(c1782b, "flutterPluginBinding");
        this.f14791b = c1782b.f18075a.getContentResolver();
        s sVar = new s(c1782b.f18077c, "android_id");
        this.f14790a = sVar;
        sVar.b(this);
    }

    @Override // w5.InterfaceC1783c
    public final void onDetachedFromEngine(C1782b c1782b) {
        h.e(c1782b, "binding");
        s sVar = this.f14790a;
        if (sVar != null) {
            sVar.b(null);
        } else {
            h.h("channel");
            throw null;
        }
    }

    @Override // A5.q
    public final void onMethodCall(o oVar, r rVar) {
        h.e(oVar, "call");
        if (!h.a(oVar.f676a, "getId")) {
            ((p) rVar).notImplemented();
            return;
        }
        try {
            ContentResolver contentResolver = this.f14791b;
            if (contentResolver == null) {
                h.h("contentResolver");
                throw null;
            }
            ((p) rVar).success(Settings.Secure.getString(contentResolver, "android_id"));
        } catch (Exception e7) {
            ((p) rVar).error("ERROR_GETTING_ID", "Failed to get Android ID", e7.getLocalizedMessage());
        }
    }
}
