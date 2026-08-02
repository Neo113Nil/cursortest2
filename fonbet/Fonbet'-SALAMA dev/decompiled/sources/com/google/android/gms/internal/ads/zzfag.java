package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfag {
    public final int zza;
    public final int zzb;
    public final boolean zzc;

    public zzfag(int i7, int i8, boolean z4) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = z4;
    }

    public static List zza(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i7 = 0;
            int i8 = 0;
            boolean z4 = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i7 = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i8 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z4 = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new zzfag(i7, i8, z4));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
