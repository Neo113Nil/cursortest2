package com.google.android.gms.common;

import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final /* synthetic */ class q implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ w c;

    public /* synthetic */ q(boolean z, String str, w wVar) {
        this.a = z;
        this.b = str;
        this.c = wVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z = this.a;
        String str = this.b;
        w wVar = this.c;
        String str2 = (z || !z.a(str, wVar, true, false).a) ? "not allowed" : "debug cert rejected";
        MessageDigest zza = AndroidUtilsLight.zza("SHA-256");
        C0875q.g(zza);
        return str2 + ": pkg=" + str + ", sha256=" + Hex.bytesToStringLowercase(zza.digest(wVar.c)) + ", atk=" + z + ", ver=12451000.false";
    }
}
