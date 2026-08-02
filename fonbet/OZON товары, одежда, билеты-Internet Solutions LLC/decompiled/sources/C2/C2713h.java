package C2;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: C2.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2713h extends AbstractC2708c {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2713h(@NotNull String jsonString) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", r0);
        Intrinsics.checkNotNullParameter(jsonString, "registrationResponseJson");
        Intrinsics.checkNotNullParameter(jsonString, "registrationResponseJson");
        Bundle bundle = new Bundle();
        bundle.putString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", jsonString);
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        if (jsonString.length() != 0) {
            try {
                new JSONObject(jsonString);
                return;
            } catch (Exception unused) {
            }
        }
        throw new IllegalArgumentException("registrationResponseJson must not be empty, and must be a valid JSON");
    }
}
