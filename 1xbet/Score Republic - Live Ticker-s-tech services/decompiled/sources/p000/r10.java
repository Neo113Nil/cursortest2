package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class r10 {

    /* JADX INFO: renamed from: a */
    public final String f6650a;

    /* JADX INFO: renamed from: b */
    public final String f6651b;

    /* JADX INFO: renamed from: c */
    public final String f6652c;

    /* JADX INFO: renamed from: d */
    public final String f6653d;

    /* JADX INFO: renamed from: e */
    public final String f6654e;

    /* JADX INFO: renamed from: f */
    public final String f6655f;

    /* JADX INFO: renamed from: g */
    public final String f6656g;

    public r10(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = ya1.f9257a;
        p80.m3865j("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f6651b = str;
        this.f6650a = str2;
        this.f6652c = str3;
        this.f6653d = str4;
        this.f6654e = str5;
        this.f6655f = str6;
        this.f6656g = str7;
    }

    /* JADX INFO: renamed from: a */
    public static r10 m4234a(Context context) {
        a81 a81Var = new a81(context);
        String strM81e = a81Var.m81e("google_app_id");
        if (TextUtils.isEmpty(strM81e)) {
            return null;
        }
        return new r10(strM81e, a81Var.m81e("google_api_key"), a81Var.m81e("firebase_database_url"), a81Var.m81e("ga_trackingId"), a81Var.m81e("gcm_defaultSenderId"), a81Var.m81e("google_storage_bucket"), a81Var.m81e("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r10)) {
            return false;
        }
        r10 r10Var = (r10) obj;
        return AbstractC0477mo.m3406e(this.f6651b, r10Var.f6651b) && AbstractC0477mo.m3406e(this.f6650a, r10Var.f6650a) && AbstractC0477mo.m3406e(this.f6652c, r10Var.f6652c) && AbstractC0477mo.m3406e(this.f6653d, r10Var.f6653d) && AbstractC0477mo.m3406e(this.f6654e, r10Var.f6654e) && AbstractC0477mo.m3406e(this.f6655f, r10Var.f6655f) && AbstractC0477mo.m3406e(this.f6656g, r10Var.f6656g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6651b, this.f6650a, this.f6652c, this.f6653d, this.f6654e, this.f6655f, this.f6656g});
    }

    public final String toString() {
        f50 f50Var = new f50(this);
        f50Var.m1627j(this.f6651b, "applicationId");
        f50Var.m1627j(this.f6650a, "apiKey");
        f50Var.m1627j(this.f6652c, "databaseUrl");
        f50Var.m1627j(this.f6654e, "gcmSenderId");
        f50Var.m1627j(this.f6655f, "storageBucket");
        f50Var.m1627j(this.f6656g, "projectId");
        return f50Var.toString();
    }
}
