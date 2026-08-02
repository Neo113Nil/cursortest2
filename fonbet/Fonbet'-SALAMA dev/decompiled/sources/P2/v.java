package P2;

import F2.C0254t;
import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbuo;
import com.google.android.gms.internal.ads.zzdpy;
import io.sentry.protocol.Message;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final String f5563a;

    /* renamed from: b, reason: collision with root package name */
    public String f5564b;

    /* renamed from: d, reason: collision with root package name */
    public final zzbuo f5566d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle f5567e;

    /* renamed from: g, reason: collision with root package name */
    public final long f5569g;

    /* renamed from: h, reason: collision with root package name */
    public final long f5570h;

    /* renamed from: c, reason: collision with root package name */
    public String f5565c = null;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f5568f = new Bundle();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public v(JsonReader jsonReader, zzbuo zzbuoVar) {
        Bundle bundle;
        char c3;
        this.f5569g = -1L;
        this.f5570h = -1L;
        this.f5566d = zzbuoVar;
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            switch (nextName.hashCode()) {
                case -1573145462:
                    if (nextName.equals("start_time")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -995427962:
                    if (nextName.equals(Message.JsonKeys.PARAMS)) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -271442291:
                    if (nextName.equals("signal_dictionary")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1725551537:
                    if (nextName.equals("end_time")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            if (c3 == 0) {
                str = jsonReader.nextString();
            } else if (c3 == 1) {
                hashMap = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    hashMap.put(jsonReader.nextName(), jsonReader.nextString());
                }
                jsonReader.endObject();
            } else if (c3 == 2) {
                this.f5569g = jsonReader.nextLong();
            } else if (c3 != 3) {
                jsonReader.skipValue();
            } else {
                this.f5570h = jsonReader.nextLong();
            }
        }
        this.f5563a = str;
        jsonReader.endObject();
        for (Map.Entry entry : hashMap.entrySet()) {
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
