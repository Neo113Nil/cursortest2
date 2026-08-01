package com.fyber.inneractive.sdk.privacy;

import android.content.SharedPreferences;
import android.os.Handler;
import com.fyber.inneractive.sdk.util.r;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class b implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f5830a;

    public b(c cVar) {
        this.f5830a = cVar;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str != null) {
            if (str.startsWith("IABTCF_") || str.startsWith("IABGPP_")) {
                c cVar = this.f5830a;
                cVar.getClass();
                synchronized (c.g) {
                    if (cVar.c) {
                        String str2 = (String) cVar.b.get();
                        AtomicReference atomicReference = cVar.b;
                        if (str2 != null) {
                            str = str2 + "," + str;
                        }
                        atomicReference.set(str);
                        a aVar = cVar.d;
                        Handler handler = r.b;
                        handler.removeCallbacks(aVar);
                        handler.postDelayed(cVar.d, 100L);
                    }
                }
            }
        }
    }
}
