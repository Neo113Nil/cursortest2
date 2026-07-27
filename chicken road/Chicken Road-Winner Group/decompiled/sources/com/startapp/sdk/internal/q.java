package com.startapp.sdk.internal;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.simple.bloomfilter.codec.IOUtils;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4232a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f4233b;

    public q(Context context, ib ibVar, j5 j5Var) {
        this.f4232a = context;
        this.f4233b = ibVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, String str2) {
        boolean z3;
        Object systemService;
        AdDebuggerMetadata d3 = MetaData.E().d();
        if (d3 != null && d3.b()) {
            d9 d9Var = new d9(e9.f3617d);
            d9Var.f3574d = "adDebugInfo";
            d9Var.f3575e = str;
            d9Var.f3576g = str2;
            d9Var.a();
        }
        if (str == null && str2 == null) {
            Toast.makeText(this.f4232a, "Ad debug info not available", 0).show();
            return;
        }
        StringBuilder sb = new StringBuilder("Ad debug info");
        String str3 = IOUtils.LINE_SEPARATOR_UNIX;
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        if (str != null) {
            sb.append("url: ");
            sb.append(str);
        } else {
            str3 = "";
        }
        if (str2 != null) {
            sb.append(str3);
            sb.append("d: ");
            sb.append(str2);
        }
        try {
            systemService = this.f4232a.getSystemService("clipboard");
        } catch (Throwable unused) {
        }
        try {
            if (systemService instanceof ClipboardManager) {
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Ad debug info", sb));
                z3 = true;
                Toast.makeText(this.f4232a, "Ad debug info".concat(!z3 ? " copied to clipboard" : " printed to logcat"), 0).show();
                return;
            }
            Toast.makeText(this.f4232a, "Ad debug info".concat(!z3 ? " copied to clipboard" : " printed to logcat"), 0).show();
            return;
        } catch (Throwable unused2) {
            return;
        }
        z3 = false;
    }
}
