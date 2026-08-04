package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import android.util.JsonWriter;
import io.sentry.protocol.Message;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzdrd {
    private final p090m3.a zza;

    public zzdrd(p090m3.a aVar) {
        this.zza = aVar;
    }

    public final void zza(List list, String str, String str2, Object... objArr) {
        if (((Boolean) zzbea.zza.zze()).booleanValue()) {
            ((p090m3.b) this.zza).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(jCurrentTimeMillis);
                jsonWriter.name("source").value(str);
                jsonWriter.name("event").value(str2);
                jsonWriter.name("components").beginArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name(Message.JsonKeys.PARAMS).beginArray();
                int length = objArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    Object obj = objArr[i7];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e7) {
                int i8 = J.f3546b;
                j.e("unable to log", e7);
            }
            String strValueOf = String.valueOf(stringWriter.toString());
            int i9 = J.f3546b;
            j.f("AD-DBG ".concat(strValueOf));
        }
    }
}
