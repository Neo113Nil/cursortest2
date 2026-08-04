package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import Y4.D;
import android.os.Bundle;
import android.util.JsonReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p090m3.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzfaq {
    public final List zza;
    public final zzfai zzb;
    public final List zzc;
    public final zzbuo zzd;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public zzfaq(JsonReader jsonReader, zzbuo zzbuoVar) throws JSONException, IOException {
        Bundle bundle;
        Bundle bundle2;
        this.zzd = zzbuoVar;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzco)).booleanValue() && zzbuoVar != null && (bundle2 = zzbuoVar.zzm) != null) {
            p150v0.a.n(o.f1952C.j, bundle2, zzdpy.SERVER_RESPONSE_PARSE_START.zza());
        }
        ?? EmptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        zzfai zzfaiVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        EmptyList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            EmptyList.add(new zzfaf(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        zzfaiVar = new zzfai(jsonReader);
                        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcp)).booleanValue() && zzbuoVar != null && (bundle = zzbuoVar.zzm) != null) {
                            bundle.putLong(zzdpy.NORMALIZATION_AD_RESPONSE_START.zza(), zzfaiVar.zzs);
                            zzbuoVar.zzm.putLong(zzdpy.NORMALIZATION_AD_RESPONSE_END.zza(), zzfaiVar.zzt);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectF0 = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if ("name".equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectF0 = D.F0(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList.add(new zzfap(strNextString, jSONObjectF0));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.zzc = arrayList;
        this.zza = EmptyList;
        this.zzb = zzfaiVar == null ? new zzfai(new JsonReader(new StringReader("{}"))) : zzfaiVar;
    }

    public static zzfaq zza(Reader reader, zzbuo zzbuoVar) {
        try {
            try {
                zzfaq zzfaqVar = new zzfaq(new JsonReader(reader), zzbuoVar);
                c.d(reader);
                return zzfaqVar;
            } catch (Throwable th) {
                c.d(reader);
                throw th;
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e7) {
            throw new zzfaj("unable to parse ServerResponse", e7);
        }
    }
}
