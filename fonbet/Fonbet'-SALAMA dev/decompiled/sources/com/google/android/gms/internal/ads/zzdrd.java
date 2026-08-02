package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import android.util.JsonWriter;
import io.sentry.protocol.Message;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import m3.InterfaceC1436a;

/* loaded from: classes.dex */
public final class zzdrd {
    private final InterfaceC1436a zza;

    public zzdrd(InterfaceC1436a interfaceC1436a) {
        this.zza = interfaceC1436a;
    }

    public final void zza(List list, String str, String str2, Object... objArr) {
        if (((Boolean) zzbea.zza.zze()).booleanValue()) {
            ((m3.b) this.zza).getClass();
            long currentTimeMillis = System.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(currentTimeMillis);
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
            String valueOf = String.valueOf(stringWriter.toString());
            int i9 = J.f3546b;
            j.f("AD-DBG ".concat(valueOf));
        }
    }
}
