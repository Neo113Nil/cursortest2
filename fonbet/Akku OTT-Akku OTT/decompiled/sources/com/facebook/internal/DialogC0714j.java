package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.internal.J;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class DialogC0714j extends J {
    public static final a Companion = new a();
    public boolean p;

    /* renamed from: com.facebook.internal.j$a */
    public static final class a {
    }

    public static void g(DialogC0714j this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.cancel();
    }

    @Override // com.facebook.internal.J
    public final Bundle c(String str) {
        Bundle E = E.E(Uri.parse(str).getQuery());
        String string = E.getString("bridge_args");
        E.remove("bridge_args");
        if (!E.z(string)) {
            try {
                E.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", C0707c.a(new JSONObject(string)));
            } catch (JSONException unused) {
                com.facebook.w wVar = com.facebook.w.a;
            }
        }
        String string2 = E.getString("method_results");
        E.remove("method_results");
        if (!E.z(string2)) {
            try {
                E.putBundle("com.facebook.platform.protocol.RESULT_ARGS", C0707c.a(new JSONObject(string2)));
            } catch (JSONException unused2) {
                com.facebook.w wVar2 = com.facebook.w.a;
            }
        }
        E.remove("version");
        w wVar3 = w.a;
        int i = 0;
        if (!com.facebook.internal.instrument.crashshield.a.b(w.class)) {
            try {
                i = w.d[0].intValue();
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, w.class);
            }
        }
        E.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", i);
        return E;
    }

    @Override // com.facebook.internal.J, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        J.g gVar = this.d;
        if (!this.m || this.k || gVar == null || !gVar.isShown()) {
            super.cancel();
        } else {
            if (this.p) {
                return;
            }
            this.p = true;
            gVar.loadUrl("javascript:(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            new Handler(Looper.getMainLooper()).postDelayed(new androidx.media3.exoplayer.video.k(this, 1), 1500L);
        }
    }
}
