package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.n;
import com.fyber.inneractive.sdk.config.w0;
import com.fyber.inneractive.sdk.util.o;
import com.fyber.inneractive.sdk.util.s0;
import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes4.dex */
public final class c extends b {
    @Override // com.fyber.inneractive.sdk.response.b
    public final void a(String str, w0 w0Var) {
        f fVar = (f) this.f5907a;
        if (TextUtils.isEmpty(fVar.z) && w0Var != null) {
            fVar.z = w0Var.b;
        }
        if (str == null) {
            str = null;
        } else {
            s0 s0Var = s0.c;
            s0Var.getClass();
            int indexOf = str.indexOf(38);
            if (indexOf >= 0) {
                StringWriter stringWriter = new StringWriter((int) ((str.length() * 0.1d) + str.length()));
                try {
                    s0Var.a(stringWriter, str, indexOf);
                } catch (IOException unused) {
                }
                str = stringWriter.toString();
            }
        }
        int i = n.f5271a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.assetResponse");
        if (!TextUtils.isEmpty(property)) {
            String b = o.b(property);
            if (!TextUtils.isEmpty(b)) {
                str = b;
            }
        }
        fVar.M = str;
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final e a() {
        f fVar = new f();
        this.f5907a = fVar;
        return fVar;
    }
}
