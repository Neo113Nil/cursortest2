package com.google.android.gms.internal.ads;

import android.util.JsonReader;

/* loaded from: classes.dex */
public final class zzfah {
    private String zza;

    public zzfah(JsonReader jsonReader) {
        char c3;
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode != -1724546052) {
                if (hashCode == 3059181 && nextName.equals("code")) {
                    c3 = 0;
                }
                c3 = 65535;
            } else {
                if (nextName.equals("description")) {
                    c3 = 1;
                }
                c3 = 65535;
            }
            if (c3 == 0) {
                jsonReader.nextInt();
            } else if (c3 != 1) {
                jsonReader.skipValue();
            } else {
                str = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
        this.zza = str;
    }

    public final String zza() {
        return this.zza;
    }
}
