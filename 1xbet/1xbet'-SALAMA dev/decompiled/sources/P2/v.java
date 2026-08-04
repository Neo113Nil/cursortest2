package P2;

import F2.C0254t;
import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbuo;
import com.google.android.gms.internal.ads.zzdpy;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5564b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzbuo f5566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bundle f5567e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f5569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f5570h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f5565c = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f5568f = new Bundle();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    public v(JsonReader jsonReader, zzbuo zzbuoVar) throws IOException {
        Bundle bundle;
        byte b7;
        this.f5569g = -1L;
        this.f5570h = -1L;
        this.f5566d = zzbuoVar;
        HashMap map = new HashMap();
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            switch (strNextName == null ? "" : strNextName) {
                case "start_time":
                    b7 = 2;
                    break;
                case "params":
                    b7 = 0;
                    break;
                case "signal_dictionary":
                    b7 = 1;
                    break;
                case "end_time":
                    b7 = 3;
                    break;
                default:
                    b7 = -1;
                    break;
            }
            if (b7 == 0) {
                strNextString = jsonReader.nextString();
            } else if (b7 == 1) {
                map = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    map.put(jsonReader.nextName(), jsonReader.nextString());
                }
                jsonReader.endObject();
            } else if (b7 == 2) {
                this.f5569g = jsonReader.nextLong();
            } else if (b7 != 3) {
                jsonReader.skipValue();
            } else {
                this.f5570h = jsonReader.nextLong();
            }
        }
        this.f5563a = strNextString;
        jsonReader.endObject();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f5568f.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzco)).booleanValue() || zzbuoVar == null || (bundle = zzbuoVar.zzm) == null) {
            return;
        }
        bundle.putLong(zzdpy.GET_SIGNALS_SDKCORE_START.zza(), this.f5569g);
        zzbuoVar.zzm.putLong(zzdpy.GET_SIGNALS_SDKCORE_END.zza(), this.f5570h);
    }
}
