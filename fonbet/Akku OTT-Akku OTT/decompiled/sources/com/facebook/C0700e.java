package com.facebook;

import androidx.core.app.NotificationCompat;
import com.facebook.z;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0700e implements z.b {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ HashSet b;
    public final /* synthetic */ HashSet c;
    public final /* synthetic */ HashSet d;

    public /* synthetic */ C0700e(AtomicBoolean atomicBoolean, HashSet hashSet, HashSet hashSet2, HashSet hashSet3) {
        this.a = atomicBoolean;
        this.b = hashSet;
        this.c = hashSet2;
        this.d = hashSet3;
    }

    @Override // com.facebook.z.b
    public final void a(E response) {
        JSONArray optJSONArray;
        AtomicBoolean permissionsCallSucceeded = this.a;
        Intrinsics.checkNotNullParameter(permissionsCallSucceeded, "$permissionsCallSucceeded");
        HashSet permissions = this.b;
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        HashSet declinedPermissions = this.c;
        Intrinsics.checkNotNullParameter(declinedPermissions, "$declinedPermissions");
        HashSet expiredPermissions = this.d;
        Intrinsics.checkNotNullParameter(expiredPermissions, "$expiredPermissions");
        Intrinsics.checkNotNullParameter(response, "response");
        JSONObject jSONObject = response.d;
        if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("data")) == null) {
            return;
        }
        permissionsCallSucceeded.set(true);
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("permission");
                String status = optJSONObject.optString(NotificationCompat.CATEGORY_STATUS);
                if (!com.facebook.internal.E.z(optString) && !com.facebook.internal.E.z(status)) {
                    Intrinsics.checkNotNullExpressionValue(status, "status");
                    Locale locale = Locale.US;
                    String status2 = androidx.collection.a.c(locale, "US", status, locale, "this as java.lang.String).toLowerCase(locale)");
                    Intrinsics.checkNotNullExpressionValue(status2, "status");
                    int hashCode = status2.hashCode();
                    if (hashCode != -1309235419) {
                        if (hashCode != 280295099) {
                            if (hashCode == 568196142 && status2.equals("declined")) {
                                declinedPermissions.add(optString);
                            }
                        } else if (status2.equals("granted")) {
                            permissions.add(optString);
                        }
                    } else if (status2.equals("expired")) {
                        expiredPermissions.add(optString);
                    }
                }
            }
        }
    }
}
