package s1;

import A5.o;
import A5.p;
import A5.q;
import A5.r;
import A5.s;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import w5.C1782b;
import w5.InterfaceC1783c;

/* renamed from: s1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1586a implements InterfaceC1783c, q {

    /* renamed from: a, reason: collision with root package name */
    public s f16095a;

    /* renamed from: b, reason: collision with root package name */
    public Context f16096b;

    @Override // w5.InterfaceC1783c
    public final void onAttachedToEngine(C1782b c1782b) {
        s sVar = new s(c1782b.f18077c, "ump_outdate");
        this.f16095a = sVar;
        sVar.b(this);
        this.f16096b = c1782b.f18075a;
    }

    @Override // w5.InterfaceC1783c
    public final void onDetachedFromEngine(C1782b c1782b) {
        this.f16095a.b(null);
    }

    @Override // A5.q
    public final void onMethodCall(o oVar, r rVar) {
        boolean z4 = true;
        String str = oVar.f676a;
        str.getClass();
        if (!str.equals("deleteTCString")) {
            ((p) rVar).notImplemented();
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f16096b);
        String string = defaultSharedPreferences.getString("IABTCF_TCString", null);
        if (string != null) {
            long j = 0;
            for (int i7 = 0; i7 < string.substring(1, 7).length(); i7++) {
                j = (j * 64) + "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".indexOf(r1.charAt(i7));
            }
            long currentTimeMillis = (System.currentTimeMillis() - (j * 100)) / 86400000;
            System.err.println("GDPR Days Ago:" + currentTimeMillis);
            if (currentTimeMillis > 365) {
                defaultSharedPreferences.edit().remove("IABTCF_TCString").apply();
                ((p) rVar).success(Boolean.valueOf(z4));
            }
        }
        z4 = false;
        ((p) rVar).success(Boolean.valueOf(z4));
    }
}
