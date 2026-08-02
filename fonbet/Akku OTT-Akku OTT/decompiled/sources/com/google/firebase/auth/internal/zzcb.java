package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.logging.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuthProvider;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorGenerator;
import com.google.firebase.auth.TotpMultiFactorInfo;
import defpackage.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzcb {
    private Context zza;
    private String zzb;
    private SharedPreferences zzc;
    private a zzd;

    public zzcb(Context context, String str) {
        C0875q.g(context);
        C0875q.d(str);
        this.zzb = str;
        this.zza = context.getApplicationContext();
        this.zzc = this.zza.getSharedPreferences(g.a("com.google.firebase.auth.api.Store.", this.zzb), 0);
        this.zzd = new a("StorageHelpers", new String[0]);
    }

    private final void zzb(String str) {
        this.zzc.edit().remove(str).apply();
    }

    @Nullable
    private final String zzd(FirebaseUser firebaseUser) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        if (!(firebaseUser instanceof zzaf)) {
            return null;
        }
        zzaf zzafVar = (zzaf) firebaseUser;
        try {
            jSONObject.put("cachedTokenState", zzafVar.zze());
            jSONObject.put("applicationName", zzafVar.zza().getName());
            jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
            if (zzafVar.zzj() != null) {
                JSONArray jSONArray = new JSONArray();
                List<zzab> zzj = zzafVar.zzj();
                int size = zzj.size();
                if (zzj.size() > 30) {
                    this.zzd.b("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(zzj.size()));
                    size = 30;
                }
                int i = 0;
                boolean z2 = false;
                while (true) {
                    z = true;
                    if (i >= size) {
                        break;
                    }
                    zzab zzabVar = zzj.get(i);
                    if (zzabVar.getProviderId().equals(FirebaseAuthProvider.PROVIDER_ID)) {
                        z2 = true;
                    }
                    if (i == size - 1 && !z2) {
                        break;
                    }
                    jSONArray.put(zzabVar.zzb());
                    i++;
                }
                if (!z2) {
                    for (int i2 = size - 1; i2 < zzj.size() && i2 >= 0; i2++) {
                        zzab zzabVar2 = zzj.get(i2);
                        if (zzabVar2.getProviderId().equals(FirebaseAuthProvider.PROVIDER_ID)) {
                            jSONArray.put(zzabVar2.zzb());
                            break;
                        }
                        if (i2 == zzj.size() - 1) {
                            jSONArray.put(zzabVar2.zzb());
                        }
                    }
                    z = z2;
                    if (!z) {
                        this.zzd.b("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", Integer.valueOf(zzj.size()), Integer.valueOf(size));
                        if (zzj.size() < 5) {
                            StringBuilder sb = new StringBuilder("Provider user info list:\n");
                            Iterator<zzab> it = zzj.iterator();
                            while (it.hasNext()) {
                                sb.append("Provider - " + it.next().getProviderId() + "\n");
                            }
                            this.zzd.b(sb.toString(), new Object[0]);
                        }
                    }
                }
                jSONObject.put("userInfos", jSONArray);
            }
            jSONObject.put("anonymous", zzafVar.isAnonymous());
            jSONObject.put("version", ExifInterface.GPS_MEASUREMENT_2D);
            if (zzafVar.getMetadata() != null) {
                jSONObject.put("userMetadata", ((zzah) zzafVar.getMetadata()).zza());
            }
            List<MultiFactorInfo> enrolledFactors = ((zzaj) zzafVar.getMultiFactor()).getEnrolledFactors();
            if (enrolledFactors != null && !enrolledFactors.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i3 = 0; i3 < enrolledFactors.size(); i3++) {
                    jSONArray2.put(enrolledFactors.get(i3).toJson());
                }
                jSONObject.put("userMultiFactorInfo", jSONArray2);
            }
            List<com.google.firebase.auth.zzan> zzf = zzafVar.zzf();
            if (zzf != null && !zzf.isEmpty()) {
                JSONArray jSONArray3 = new JSONArray();
                for (int i4 = 0; i4 < zzf.size(); i4++) {
                    jSONArray3.put(com.google.firebase.auth.zzan.zza(zzf.get(i4)));
                }
                jSONObject.put("passkeyInfo", jSONArray3);
            }
            return jSONObject.toString();
        } catch (Exception e) {
            this.zzd.b("Failed to turn object into JSON", new Object[0]);
            throw new zzaao(e);
        }
    }

    @Nullable
    public final FirebaseUser zza() {
        String zza = zza("com.google.firebase.auth.FIREBASE_USER");
        if (!TextUtils.isEmpty(zza)) {
            try {
                JSONObject jSONObject = new JSONObject(zza);
                if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                    return zza(jSONObject);
                }
            } catch (Exception unused) {
                this.zzd.b("Failed to restore user data from persistent storage.", new Object[0]);
                return null;
            }
        }
        return null;
    }

    public final void zzc(FirebaseUser firebaseUser) {
        C0875q.g(firebaseUser);
        String zzd = zzd(firebaseUser);
        if (TextUtils.isEmpty(zzd)) {
            return;
        }
        zza("com.google.firebase.auth.FIREBASE_USER", zzd);
    }

    public final void zzb() {
        zzb("com.google.firebase.auth.FIREBASE_USER");
    }

    public final void zzb(FirebaseUser firebaseUser) {
        C0875q.g(firebaseUser);
        zzb(g.a("com.google.firebase.auth.GET_TOKEN_RESPONSE.", firebaseUser.getUid()));
    }

    @Nullable
    public final zzahv zza(FirebaseUser firebaseUser) {
        C0875q.g(firebaseUser);
        String zza = zza(g.a("com.google.firebase.auth.GET_TOKEN_RESPONSE.", firebaseUser.getUid()));
        if (zza == null) {
            return null;
        }
        try {
            return zzahv.zzb(zza);
        } catch (zzaao unused) {
            this.zzd.b("Failed to restore token data from persistent storage.", new Object[0]);
            return null;
        }
    }

    @Nullable
    private final zzaf zza(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        MultiFactorInfo zza;
        zzah zza2;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z = jSONObject.getBoolean("anonymous");
            String str = ExifInterface.GPS_MEASUREMENT_2D;
            String string3 = jSONObject.getString("version");
            if (string3 != null) {
                str = string3;
            }
            JSONArray jSONArray3 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray3.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(zzab.zza(jSONArray3.getString(i)));
            }
            zzaf zzafVar = new zzaf(FirebaseApp.getInstance(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                zzafVar.zza(zzahv.zzb(string));
            }
            if (!z) {
                zzafVar.zzb();
            }
            zzafVar.zza(str);
            if (jSONObject.has("userMetadata") && (zza2 = zzah.zza(jSONObject.getJSONObject("userMetadata"))) != null) {
                zzafVar.zza(zza2);
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray2 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i2));
                    String optString = jSONObject2.optString(MultiFactorInfo.FACTOR_ID_KEY);
                    if ("phone".equals(optString)) {
                        zza = PhoneMultiFactorInfo.zza(jSONObject2);
                    } else {
                        zza = Objects.equals(optString, TotpMultiFactorGenerator.FACTOR_ID) ? TotpMultiFactorInfo.zza(jSONObject2) : null;
                    }
                    arrayList2.add(zza);
                }
                zzafVar.zzc(arrayList2);
            }
            if (jSONObject.has("passkeyInfo") && (jSONArray = jSONObject.getJSONArray("passkeyInfo")) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    arrayList3.add(com.google.firebase.auth.zzan.zza(new JSONObject(jSONArray.getString(i3))));
                }
                zzafVar.zzb(arrayList3);
            }
            return zzafVar;
        } catch (zzaao | ArrayIndexOutOfBoundsException | IllegalArgumentException | JSONException unused) {
            this.zzd.getClass();
            return null;
        }
    }

    @Nullable
    private final String zza(String str) {
        String string = this.zzc.getString(str, null);
        if (string != null) {
            return string.startsWith("ENCRYPTED:") ? zzby.zza(this.zza, this.zzb).zza(string.substring(10)) : string;
        }
        return null;
    }

    private final void zza(String str, String str2) {
        String zzb = zzby.zza(this.zza, this.zzb).zzb(str2);
        if (zzb != null) {
            this.zzc.edit().putString(str, "ENCRYPTED:".concat(zzb)).apply();
        }
    }

    public final void zza(FirebaseUser firebaseUser, zzahv zzahvVar) {
        C0875q.g(firebaseUser);
        C0875q.g(zzahvVar);
        zza(g.a("com.google.firebase.auth.GET_TOKEN_RESPONSE.", firebaseUser.getUid()), zzahvVar.zzf());
    }
}
