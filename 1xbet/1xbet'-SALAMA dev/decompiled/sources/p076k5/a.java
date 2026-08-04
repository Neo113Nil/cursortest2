package p076k5;

import A5.o;
import A5.p;
import A5.q;
import A5.r;
import A5.s;
import android.content.ContentResolver;
import android.provider.Settings;
import p159w5.b;
import p159w5.c;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements c, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f14796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ContentResolver f14797b;

    @Override // p159w5.c
    public final void onAttachedToEngine(b bVar) {
        h.e(bVar, "flutterPluginBinding");
        this.f14797b = bVar.f18081a.getContentResolver();
        s sVar = new s(bVar.f18083c, "android_id");
        this.f14796a = sVar;
        sVar.b(this);
    }

    @Override // p159w5.c
    public final void onDetachedFromEngine(b bVar) {
        h.e(bVar, "binding");
        s sVar = this.f14796a;
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
            ContentResolver contentResolver = this.f14797b;
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
