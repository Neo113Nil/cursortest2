package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public abstract class llIIlIlIlI {
    public final android.content.SharedPreferences llIIlIlIIl;

    public llIIlIlIlI(java.lang.String str, android.content.Context context) {
        this.llIIlIlIIl = context.getSharedPreferences(str, 0);
    }

    public final void llIIlIlIIl(java.lang.String str, java.lang.String str2) {
        this.llIIlIlIIl.edit().putString(str, str2).apply();
    }

    public final void llIIlIlIIl(long j) {
        this.llIIlIlIIl.edit().putLong("com.microblink.blinkid.baltazar.preferences.lease", j).apply();
    }

    public final void llIIlIlIIl(java.lang.Boolean bool) {
        this.llIIlIlIIl.edit().putBoolean("com.microblink.blinkid.baltazar.preferences.licenceUnlocked", bool.booleanValue()).apply();
    }
}
