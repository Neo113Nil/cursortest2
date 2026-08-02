package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import io.flutter.plugins.firebase.auth.Constants;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q extends C0708d {
    public static final a Companion = new a();

    public static final class a {
        public static Uri a(Bundle bundle, String action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (Intrinsics.areEqual(action, Constants.SIGN_IN_METHOD_OAUTH)) {
                return E.a(A.b(), "oauth/authorize", bundle);
            }
            return E.a(A.b(), com.facebook.w.d() + "/dialog/" + action, bundle);
        }
    }
}
