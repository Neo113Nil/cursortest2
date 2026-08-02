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
import m3.c;
import org.json.JSONException;
import org.json.JSONObject;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
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
    public zzfaq(JsonReader jsonReader, zzbuo zzbuoVar) {
        Bundle bundle;
        Bundle bundle2;
        this.zzd = zzbuoVar;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzco)).booleanValue() && zzbuoVar != null && (bundle2 = zzbuoVar.zzm) != null) {
            AbstractC1663a.n(o.f1952C.j, bundle2, zzdpy.SERVER_RESPONSE_PARSE_START.zza());
        }
        ?? emptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        zzfai zzfaiVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        emptyList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            emptyList.add(new zzfaf(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
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
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    JSONObject jSONObject = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if ("name".equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            jSONObject = D.F0(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new zzfap(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.zzc = arrayList;
        this.zza = emptyList;
        this.zzb = zzfaiVar == null ? new zzfai(new JsonReader(new StringReader("{}"))) : zzfaiVar;
    }

    public static zzfaq zza(Reader reader, zzbuo zzbuoVar) {
        try {
            try {
                return new zzfaq(new JsonReader(reader), zzbuoVar);
            } finally {
                c.d(reader);
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e7) {
            throw new zzfaj("unable to parse ServerResponse", e7);
        }
    }
}
