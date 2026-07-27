package K1;

import B0.l;
import B0.t;
import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import o1.u;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f1401a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1402b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1403c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1404d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1405e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1406f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1407g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i2 = s1.c.f11808a;
        u.i("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f1402b = str;
        this.f1401a = str2;
        this.f1403c = str3;
        this.f1404d = str4;
        this.f1405e = str5;
        this.f1406f = str6;
        this.f1407g = str7;
    }

    public static i a(Context context) {
        t tVar = new t(context);
        String g6 = tVar.g("google_app_id");
        if (TextUtils.isEmpty(g6)) {
            return null;
        }
        return new i(g6, tVar.g("google_api_key"), tVar.g("firebase_database_url"), tVar.g("ga_trackingId"), tVar.g("gcm_defaultSenderId"), tVar.g("google_storage_bucket"), tVar.g("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return u.j(this.f1402b, iVar.f1402b) && u.j(this.f1401a, iVar.f1401a) && u.j(this.f1403c, iVar.f1403c) && u.j(this.f1404d, iVar.f1404d) && u.j(this.f1405e, iVar.f1405e) && u.j(this.f1406f, iVar.f1406f) && u.j(this.f1407g, iVar.f1407g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1402b, this.f1401a, this.f1403c, this.f1404d, this.f1405e, this.f1406f, this.f1407g});
    }

    public final String toString() {
        l lVar = new l(this);
        lVar.c(this.f1402b, "applicationId");
        lVar.c(this.f1401a, "apiKey");
        lVar.c(this.f1403c, "databaseUrl");
        lVar.c(this.f1405e, "gcmSenderId");
        lVar.c(this.f1406f, "storageBucket");
        lVar.c(this.f1407g, "projectId");
        return lVar.toString();
    }
}
