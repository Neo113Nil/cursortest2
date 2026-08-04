package Q2;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzbds;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5797a = (String) zzbds.zza.zze();

    public final String a(Map map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.f5797a).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }
}
