package sg.bigo.ads.d;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: sg.bigo.ads.d.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5055a extends sg.bigo.ads.U.e {
    public static long g;
    public String e;
    public JSONObject f;

    public C5055a(Context context) {
        super(context);
    }

    @Override // sg.bigo.ads.U.e
    public final String a() {
        return "bigo_app.dat";
    }

    @Override // sg.bigo.ads.U.e
    public final String b() {
        return "bigo_app.dat";
    }

    @Override // sg.bigo.ads.U.g
    public final void a(Parcel parcel) {
        this.e = parcel.dataAvail() > 0 ? parcel.readString() : "";
        try {
            String readString = parcel.dataAvail() > 0 ? parcel.readString() : "";
            if (TextUtils.isEmpty(readString)) {
                return;
            }
            this.f = new JSONObject(readString);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // sg.bigo.ads.U.g
    public final void b(Parcel parcel) {
        parcel.writeString(this.e);
        JSONObject jSONObject = this.f;
        parcel.writeString(jSONObject == null ? "" : jSONObject.toString());
    }
}
