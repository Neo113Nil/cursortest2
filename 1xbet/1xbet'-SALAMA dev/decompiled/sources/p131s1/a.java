package p131s1;

import A5.o;
import A5.p;
import A5.q;
import A5.r;
import A5.s;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import p159w5.b;
import p159w5.c;

/* JADX INFO: loaded from: classes.dex */
public class a implements c, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f16101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f16102b;

    @Override // p159w5.c
    public final void onAttachedToEngine(b bVar) {
        s sVar = new s(bVar.f18083c, "ump_outdate");
        this.f16101a = sVar;
        sVar.b(this);
        this.f16102b = bVar.f18081a;
    }

    @Override // p159w5.c
    public final void onDetachedFromEngine(b bVar) {
        this.f16101a.b(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    @Override // A5.q
    public final void onMethodCall(o oVar, r rVar) {
        boolean z4 = true;
        String str = oVar.f676a;
        str.getClass();
        if (!str.equals("deleteTCString")) {
            ((p) rVar).notImplemented();
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f16102b);
        String string = defaultSharedPreferences.getString("IABTCF_TCString", null);
        if (string == null) {
            z4 = false;
        } else {
            String strSubstring = string.substring(1, 7);
            long jIndexOf = 0;
            for (int i7 = 0; i7 < strSubstring.length(); i7++) {
                jIndexOf = (jIndexOf * 64) + ((long) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".indexOf(strSubstring.charAt(i7)));
            }
            long jCurrentTimeMillis = (System.currentTimeMillis() - (jIndexOf * 100)) / 86400000;
            System.err.println("GDPR Days Ago:" + jCurrentTimeMillis);
            if (jCurrentTimeMillis > 365) {
                defaultSharedPreferences.edit().remove("IABTCF_TCString").apply();
            } else {
                z4 = false;
            }
        }
        ((p) rVar).success(Boolean.valueOf(z4));
    }
}
