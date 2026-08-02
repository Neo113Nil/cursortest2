package a3;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.C1428pc;
import com.google.android.gms.internal.ads.F7;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final String f6620a;

    /* renamed from: b, reason: collision with root package name */
    public String f6621b;

    /* renamed from: d, reason: collision with root package name */
    public final C1428pc f6623d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle f6624e;

    /* renamed from: g, reason: collision with root package name */
    public final long f6625g;

    /* renamed from: h, reason: collision with root package name */
    public final long f6626h;

    /* renamed from: c, reason: collision with root package name */
    public String f6622c = null;
    public final Bundle f = new Bundle();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public u(JsonReader jsonReader, C1428pc c1428pc) {
        Bundle bundle;
        char c5;
        this.f6625g = -1L;
        this.f6626h = -1L;
        this.f6623d = c1428pc;
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            switch (nextName.hashCode()) {
                case -1573145462:
                    if (nextName.equals("start_time")) {
                        c5 = 2;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -995427962:
                    if (nextName.equals("params")) {
                        c5 = 0;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -271442291:
                    if (nextName.equals("signal_dictionary")) {
                        c5 = 1;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1725551537:
                    if (nextName.equals("end_time")) {
                        c5 = 3;
                        break;
                    }
                    c5 = 65535;
                    break;
                default:
                    c5 = 65535;
                    break;
            }
            if (c5 == 0) {
                str = jsonReader.nextString();
            } else if (c5 == 1) {
                hashMap = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    hashMap.put(jsonReader.nextName(), jsonReader.nextString());
                }
                jsonReader.endObject();
            } else if (c5 == 2) {
                this.f6625g = jsonReader.nextLong();
            } else if (c5 != 3) {
                jsonReader.skipValue();
            } else {
                this.f6626h = jsonReader.nextLong();
            }
        }
        this.f6620a = str;
        jsonReader.endObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.f8805b2)).booleanValue() || c1428pc == null || (bundle = c1428pc.f15007w) == null) {
            return;
        }
        bundle.putLong("get-signals-sdkcore-start", this.f6625g);
        bundle.putLong("get-signals-sdkcore-end", this.f6626h);
    }
}
