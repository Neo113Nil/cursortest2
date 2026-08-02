package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public abstract class zzua {
    public static final com.google.android.libraries.places.internal.zzua zzc = new com.google.android.libraries.places.internal.zztw();
    public static final com.google.android.libraries.places.internal.zzua zzd = new com.google.android.libraries.places.internal.zztw();

    static com.google.android.libraries.places.internal.zzua zzc(com.google.android.libraries.places.internal.zzua zzuaVar, com.google.android.libraries.places.internal.zzua zzuaVar2) {
        com.google.android.libraries.places.internal.zzua zzuaVar3;
        com.google.android.libraries.places.internal.zzua zzuaVar4;
        if (zzuaVar != null) {
            if (zzuaVar2 == null || zzuaVar == (zzuaVar3 = zzc) || zzuaVar2 == (zzuaVar4 = zzd)) {
                return zzuaVar;
            }
            if (zzuaVar2 != zzuaVar3 && zzuaVar != zzuaVar4) {
                return new com.google.android.libraries.places.internal.zztx(zzuaVar, zzuaVar2);
            }
        }
        return zzuaVar2;
    }

    protected abstract void zzb();

    protected zzua() {
    }
}
