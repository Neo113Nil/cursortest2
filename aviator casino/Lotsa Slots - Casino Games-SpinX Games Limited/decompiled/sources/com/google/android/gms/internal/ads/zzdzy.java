package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdzy {
    private final com.google.android.gms.common.util.Clock zza;

    public zzdzy(com.google.android.gms.common.util.Clock clock) {
        this.zza = clock;
    }

    public final void zza(java.util.List list, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbks.zza.zze()).booleanValue()) {
            long currentTimeMillis = this.zza.currentTimeMillis();
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            android.util.JsonWriter jsonWriter = new android.util.JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name(com.ironsource.C4.a.d).value(currentTimeMillis);
                jsonWriter.name("source").value(str);
                jsonWriter.name(androidx.core.app.NotificationCompat.CATEGORY_EVENT).value(str2);
                jsonWriter.name("components").beginArray();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    java.lang.Object obj = objArr[i];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (java.io.IOException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("unable to log", e);
            }
            java.lang.String stringWriter2 = stringWriter.toString();
            java.lang.String.valueOf(stringWriter2);
            java.lang.String valueOf = java.lang.String.valueOf(stringWriter2);
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("AD-DBG ".concat(valueOf));
        }
    }
}
