package P2;

import com.google.android.gms.internal.ads.zzbdi;
import com.google.android.gms.internal.ads.zzbed;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class y extends R2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0375a f5578b;

    public y(C0375a c0375a, String str) {
        this.f5577a = str;
        this.f5578b = c0375a;
    }

    @Override // R2.b
    public final void onFailure(String str) {
        int i7 = 0;
        int i8 = I2.J.f3546b;
        J2.j.g("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        boolean booleanValue = ((Boolean) zzbed.zzb.zze()).booleanValue();
        C0375a c0375a = this.f5578b;
        String concat = booleanValue ? ",\"as\":".concat(c0375a.f5469k.a().toString()) : "";
        Locale locale = Locale.getDefault();
        zzbdi zzbdiVar = zzbed.zzd;
        String format = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", this.f5577a, str, Long.valueOf(((Boolean) zzbdiVar.zze()).booleanValue() ? ((Long) zzbed.zzg.zze()).longValue() : 0L), concat);
        if (((Boolean) zzbdiVar.zze()).booleanValue()) {
            try {
                c0375a.f5467h.execute(new x(this, format, i7));
            } catch (RuntimeException e7) {
                E2.o.f1952C.f1961g.zzv(e7, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
            }
        } else {
            c0375a.f5461b.evaluateJavascript(format, null);
        }
        if (((Boolean) zzbed.zzb.zze()).booleanValue() && ((Boolean) zzbed.zzc.zze()).booleanValue()) {
            E e8 = c0375a.f5470l;
            e8.getClass();
            e8.f5417c.execute(new D(e8, i7));
        }
    }

    @Override // R2.b
    public final void onSuccess(R2.a aVar) {
        String format;
        String str = this.f5577a;
        C0375a c0375a = this.f5578b;
        String str2 = aVar.f6014a.f2645b;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", str);
            jSONObject.put("signal", str2);
            jSONObject.put("sdk_ttl_ms", ((Boolean) zzbed.zzd.zze()).booleanValue() ? ((Long) zzbed.zzg.zze()).longValue() : 0L);
            if (((Boolean) zzbed.zzb.zze()).booleanValue()) {
                jSONObject.put("as", c0375a.f5469k.a());
            }
            format = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            String concat = ((Boolean) zzbed.zzb.zze()).booleanValue() ? ",\"as\":".concat(c0375a.f5469k.a().toString()) : "";
            format = String.format(Locale.getDefault(), "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str, aVar.f6014a.f2645b, Long.valueOf(((Boolean) zzbed.zzd.zze()).booleanValue() ? ((Long) zzbed.zzg.zze()).longValue() : 0L), concat);
        }
        if (((Boolean) zzbed.zzd.zze()).booleanValue()) {
            try {
                c0375a.f5467h.execute(new x(this, format, 1));
            } catch (RuntimeException e7) {
                E2.o.f1952C.f1961g.zzv(e7, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
            }
        } else {
            c0375a.f5461b.evaluateJavascript(format, null);
        }
        if (((Boolean) zzbed.zzb.zze()).booleanValue() && ((Boolean) zzbed.zzc.zze()).booleanValue()) {
            E e8 = c0375a.f5470l;
            e8.getClass();
            e8.f5417c.execute(new D(e8, 0));
        }
    }
}
