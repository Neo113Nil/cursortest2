package Ve;

import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Fa {

    /* renamed from: a, reason: collision with root package name */
    public String f28983a;

    /* renamed from: b, reason: collision with root package name */
    public String f28984b;

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V8 a(Intent intent) {
        boolean z11;
        String str;
        Intrinsics.checkNotNullParameter(intent, "intent");
        V8 v82 = new V8(null, null, null, null, 63);
        if (intent.getData() == null) {
            return v82;
        }
        Uri data = intent.getData();
        Intrinsics.f(data);
        String queryParameter = data.getQueryParameter("state");
        if (intent.getData() != null) {
            Uri data2 = intent.getData();
            Intrinsics.f(data2);
            if (data2.getQueryParameter("code") != null && kotlin.text.h.D(this.f28983a, queryParameter, false)) {
                z11 = true;
                v82.f30183a = Boolean.valueOf(z11);
                if (z11) {
                    Uri data3 = intent.getData();
                    Intrinsics.f(data3);
                    if (Intrinsics.d(data3.getQueryParameter("error"), "null")) {
                        str = kotlin.text.h.D(this.f28983a, data3.getQueryParameter("state"), false) ? "invalid_state" : "internal_error";
                    } else {
                        str = data3.getQueryParameter("error");
                    }
                    v82.f30187e = str;
                    Uri data4 = intent.getData();
                    Intrinsics.f(data4);
                    v82.f30188f = data4.getQueryParameter("error_code");
                } else {
                    v82.f30184b = queryParameter;
                    v82.f30185c = this.f28984b;
                    Uri data5 = intent.getData();
                    Intrinsics.f(data5);
                    v82.f30186d = data5.getQueryParameter("code");
                }
                this.f28983a = null;
                this.f28984b = null;
                return v82;
            }
        }
        z11 = false;
        v82.f30183a = Boolean.valueOf(z11);
        if (z11) {
        }
        this.f28983a = null;
        this.f28984b = null;
        return v82;
    }
}
