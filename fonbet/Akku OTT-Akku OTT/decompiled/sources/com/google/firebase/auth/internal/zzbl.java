package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.safeparcel.e;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import io.flutter.plugins.firebase.crashlytics.Constants;

/* loaded from: classes4.dex */
public final class zzbl {

    @VisibleForTesting
    private static long zza = 3600000;
    private static final com.google.android.gms.internal.p002firebaseauthapi.zzah<String> zzb = com.google.android.gms.internal.p002firebaseauthapi.zzah.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", Constants.TIMESTAMP);
    private static final zzbl zzc = new zzbl();
    private Task<AuthResult> zzd;
    private Task<String> zze;
    private long zzf = 0;

    private zzbl() {
    }

    public static zzbl zzc() {
        return zzc;
    }

    @Nullable
    public final Task<AuthResult> zza() {
        if (DefaultClock.getInstance().currentTimeMillis() - this.zzf < zza) {
            return this.zzd;
        }
        return null;
    }

    @Nullable
    public final Task<String> zzb() {
        if (DefaultClock.getInstance().currentTimeMillis() - this.zzf < zza) {
            return this.zze;
        }
        return null;
    }

    private static void zza(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        com.google.android.gms.internal.p002firebaseauthapi.zzah<String> zzahVar = zzb;
        int size = zzahVar.size();
        int i = 0;
        while (i < size) {
            String str = zzahVar.get(i);
            i++;
            edit.remove(str);
        }
        edit.commit();
    }

    public final void zza(Context context) {
        C0875q.g(context);
        zza(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.zzd = null;
        this.zzf = 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
    
        if (r4.equals("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(FirebaseAuth firebaseAuth) {
        C0875q.g(firebaseAuth);
        char c = 0;
        SharedPreferences sharedPreferences = firebaseAuth.getApp().getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
        if (firebaseAuth.getApp().getName().equals(sharedPreferences.getString("firebaseAppName", ""))) {
            if (sharedPreferences.contains("verifyAssertionRequest")) {
                zzajb zzajbVar = (zzajb) e.a(Base64Utils.decodeUrlSafe(sharedPreferences.getString("verifyAssertionRequest", "")), zzajb.CREATOR);
                String string = sharedPreferences.getString("operation", "");
                String string2 = sharedPreferences.getString("tenantId", null);
                String string3 = sharedPreferences.getString("firebaseUserUid", "");
                this.zzf = sharedPreferences.getLong(Constants.TIMESTAMP, 0L);
                if (string2 != null) {
                    firebaseAuth.setTenantId(string2);
                    zzajbVar.zzb(string2);
                }
                string.getClass();
                switch (string.hashCode()) {
                    case -98509410:
                        break;
                    case 175006864:
                        if (string.equals("com.google.firebase.auth.internal.NONGMSCORE_LINK")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1450464913:
                        if (string.equals("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        if (firebaseAuth.getCurrentUser().getUid().equals(string3)) {
                            this.zzd = firebaseAuth.zzc(firebaseAuth.getCurrentUser(), com.google.firebase.auth.zze.zza(zzajbVar));
                            break;
                        } else {
                            this.zzd = null;
                            break;
                        }
                    case 1:
                        if (firebaseAuth.getCurrentUser().getUid().equals(string3)) {
                            this.zzd = firebaseAuth.zza(firebaseAuth.getCurrentUser(), com.google.firebase.auth.zze.zza(zzajbVar));
                            break;
                        } else {
                            this.zzd = null;
                            break;
                        }
                    case 2:
                        this.zzd = firebaseAuth.signInWithCredential(com.google.firebase.auth.zze.zza(zzajbVar));
                        break;
                    default:
                        this.zzd = null;
                        break;
                }
                zza(sharedPreferences);
                return;
            }
            if (sharedPreferences.contains("recaptchaToken")) {
                String string4 = sharedPreferences.getString("recaptchaToken", "");
                String string5 = sharedPreferences.getString("operation", "");
                this.zzf = sharedPreferences.getLong(Constants.TIMESTAMP, 0L);
                string5.getClass();
                this.zze = string5.equals("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA") ? Tasks.forResult(string4) : null;
                zza(sharedPreferences);
                return;
            }
            if (sharedPreferences.contains("statusCode")) {
                Status status = new Status(sharedPreferences.getInt("statusCode", 17062), sharedPreferences.getString("statusMessage", ""), null, null);
                this.zzf = sharedPreferences.getLong(Constants.TIMESTAMP, 0L);
                zza(sharedPreferences);
                this.zzd = Tasks.forException(zzaen.zza(status));
            }
        }
    }

    public static void zza(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.a);
        edit.putString("statusMessage", status.b);
        edit.putLong(Constants.TIMESTAMP, DefaultClock.getInstance().currentTimeMillis());
        edit.commit();
    }

    public static void zza(Context context, FirebaseAuth firebaseAuth) {
        C0875q.g(context);
        C0875q.g(firebaseAuth);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.getApp().getName());
        edit.commit();
    }

    public static void zza(Context context, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        C0875q.g(context);
        C0875q.g(firebaseAuth);
        C0875q.g(firebaseUser);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.getApp().getName());
        edit.putString("firebaseUserUid", firebaseUser.getUid());
        edit.commit();
    }

    public static void zza(Context context, zzajb zzajbVar, String str, @Nullable String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        Parcel obtain = Parcel.obtain();
        zzajbVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        edit.putString("verifyAssertionRequest", Base64Utils.encodeUrlSafe(marshall));
        edit.putString("operation", str);
        edit.putString("tenantId", str2);
        edit.putLong(Constants.TIMESTAMP, DefaultClock.getInstance().currentTimeMillis());
        edit.commit();
    }

    public static void zza(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("recaptchaToken", str);
        edit.putString("operation", str2);
        edit.putLong(Constants.TIMESTAMP, DefaultClock.getInstance().currentTimeMillis());
        edit.commit();
    }
}
