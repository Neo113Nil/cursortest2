package com.google.android.gms.internal.p002firebaseauthapi;

import android.support.v4.media.b;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.messaging.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class zzagt implements zzaez<zzagt> {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzagt";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagt zza(@NonNull String str) throws zzacn {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString(Constants.IPC_BUNDLE_KEY_SEND_ERROR));
            jSONObject.getInt("code");
            this.zzb = jSONObject.getString(io.flutter.plugins.firebase.crashlytics.Constants.MESSAGE);
            return this;
        } catch (NullPointerException | JSONException e) {
            e.getMessage();
            throw new zzacn(b.b("Failed to parse error for string [", str, "]"), e);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return !TextUtils.isEmpty(this.zzb);
    }
}
