package com.google.android.gms.internal.ads;

import E2.o;
import I2.J;
import I2.P;
import J2.j;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
final class zzbid implements zzbiz {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        zzceb zzcebVar = (zzceb) obj;
        WindowManager windowManager = (WindowManager) zzcebVar.getContext().getSystemService("window");
        P p5 = o.f1952C.f1957c;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i7 = displayMetrics.widthPixels;
        int i8 = displayMetrics.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) zzcebVar).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        AbstractC1663a.k(iArr[1], hashMap, "yInPixels", i7, "windowWidthInPixels");
        hashMap.put("windowHeightInPixels", Integer.valueOf(i8));
        zzcebVar.zzd("locationReady", hashMap);
        int i9 = J.f3546b;
        j.g("GET LOCATION COMPILED");
    }
}
