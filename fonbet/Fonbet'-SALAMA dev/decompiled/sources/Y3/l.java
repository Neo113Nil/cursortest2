package Y3;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.D;
import java.util.Arrays;
import w1.P2;
import w1.V0;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f7672a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7673b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7674c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7675d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7676e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7677f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7678g;

    public l(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i7 = m3.f.f15259a;
        D.k("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f7673b = str;
        this.f7672a = str2;
        this.f7674c = str3;
        this.f7675d = str4;
        this.f7676e = str5;
        this.f7677f = str6;
        this.f7678g = str7;
    }

    public static l a(Context context) {
        P2 p22 = new P2(context, 28);
        String C3 = p22.C("google_app_id");
        if (TextUtils.isEmpty(C3)) {
            return null;
        }
        return new l(C3, p22.C("google_api_key"), p22.C("firebase_database_url"), p22.C("ga_trackingId"), p22.C("gcm_defaultSenderId"), p22.C("google_storage_bucket"), p22.C("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return D.m(this.f7673b, lVar.f7673b) && D.m(this.f7672a, lVar.f7672a) && D.m(this.f7674c, lVar.f7674c) && D.m(this.f7675d, lVar.f7675d) && D.m(this.f7676e, lVar.f7676e) && D.m(this.f7677f, lVar.f7677f) && D.m(this.f7678g, lVar.f7678g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7673b, this.f7672a, this.f7674c, this.f7675d, this.f7676e, this.f7677f, this.f7678g});
    }

    public final String toString() {
        V0 v02 = new V0(this);
        v02.j(this.f7673b, "applicationId");
        v02.j(this.f7672a, "apiKey");
        v02.j(this.f7674c, "databaseUrl");
        v02.j(this.f7676e, "gcmSenderId");
        v02.j(this.f7677f, "storageBucket");
        v02.j(this.f7678g, "projectId");
        return v02.toString();
    }
}
