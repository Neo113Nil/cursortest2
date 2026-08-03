package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgii extends com.google.android.gms.internal.ads.zzgix {
    private final android.content.Context zza;

    zzgii(com.google.android.gms.internal.ads.zzaxm zzaxmVar, com.google.android.gms.internal.ads.zzght zzghtVar, android.content.Context context, com.google.android.gms.internal.ads.zzgqh zzgqhVar) {
        super("oPdLdhb7u3yhL0H4stSlq4J5+zu0hSfWU/8UAjsk/lyj10+V9FvGXbYfhf9vKrdX", "5RX+K+L/30Yl3K6xXlprdD5z7VBWrJlQaCLdeoJJHfI=", zzaxmVar, zzghtVar, zzgqhVar.zza(115));
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    protected final void zza(java.lang.reflect.Method method, com.google.android.gms.internal.ads.zzaxm zzaxmVar) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        int i = 1;
        java.lang.Object[] objArr = (java.lang.Object[]) method.invoke("", this.zza);
        objArr.getClass();
        java.lang.Object[] objArr2 = objArr;
        synchronized (zzaxmVar) {
            zzaxmVar.zzO(((java.lang.Integer) objArr2[0]).intValue());
            zzaxmVar.zzd(((java.lang.Integer) objArr2[1]).intValue());
            zzaxmVar.zze(((java.lang.Integer) objArr2[2]).intValue());
            zzaxmVar.zzab(((java.lang.Integer) objArr2[3]).intValue());
            java.lang.Boolean bool = (java.lang.Boolean) objArr2[4];
            if (bool == null) {
                zzaxmVar.zzaf(3);
            } else {
                zzaxmVar.zzaf(true != bool.booleanValue() ? 1 : 2);
            }
            java.lang.Boolean bool2 = (java.lang.Boolean) objArr2[5];
            if (bool2 == null) {
                zzaxmVar.zzae(3);
            } else {
                if (true == bool2.booleanValue()) {
                    i = 2;
                }
                zzaxmVar.zzae(i);
            }
        }
    }
}
