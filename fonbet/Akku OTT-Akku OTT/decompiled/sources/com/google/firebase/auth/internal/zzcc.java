package com.google.firebase.auth.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.collection.e;
import androidx.datastore.preferences.protobuf.c;
import com.google.android.gms.common.internal.C0875q;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.TotpSecret;

/* loaded from: classes4.dex */
public final class zzcc implements TotpSecret {
    private final String zza;
    private final String zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;
    private String zzf;
    private FirebaseAuth zzg;

    public zzcc(String str, String str2, int i, int i2, long j, String str3, FirebaseAuth firebaseAuth) {
        C0875q.e(str3, "sessionInfo cannot be empty.");
        C0875q.h(firebaseAuth, "firebaseAuth cannot be null.");
        C0875q.e(str, "sharedSecretKey cannot be empty. This is required to generate QR code URL.");
        this.zza = str;
        C0875q.e(str2, "hashAlgorithm cannot be empty.");
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = j;
        this.zzf = str3;
        this.zzg = firebaseAuth;
    }

    private final void zza(String str) {
        this.zzg.getApp().getApplicationContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456));
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final String generateQrCodeUrl() {
        FirebaseUser currentUser = this.zzg.getCurrentUser();
        C0875q.h(currentUser, "Current user cannot be null, since user is required to be logged in to enroll for TOTP MFA.");
        String email = currentUser.getEmail();
        C0875q.e(email, "Email cannot be empty, since verified email is required to use MFA.");
        return generateQrCodeUrl(email, this.zzg.getApp().getName());
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final int getCodeIntervalSeconds() {
        return this.zzd;
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final int getCodeLength() {
        return this.zzc;
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final long getEnrollmentCompletionDeadline() {
        return this.zze;
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final String getHashAlgorithm() {
        return this.zzb;
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final String getSessionInfo() {
        return this.zzf;
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final String getSharedSecretKey() {
        return this.zza;
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final void openInOtpApp(String str) {
        C0875q.e(str, "qrCodeUrl cannot be empty.");
        try {
            zza(str);
        } catch (ActivityNotFoundException unused) {
            zza("https://play.google.com/store/search?q=otpauth&c=apps");
        }
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final void openInOtpApp(String str, String str2, Activity activity) {
        C0875q.e(str, "QrCodeUrl cannot be empty.");
        C0875q.e(str2, "FallbackUrl cannot be empty.");
        C0875q.h(activity, "Activity cannot be null.");
        try {
            zza(str, activity);
        } catch (ActivityNotFoundException unused) {
            zza(str2, activity);
        }
    }

    private static void zza(String str, Activity activity) {
        C0875q.h(activity, "Activity cannot be null.");
        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456));
    }

    @Override // com.google.firebase.auth.TotpSecret
    public final String generateQrCodeUrl(String str, String str2) {
        C0875q.e(str, "accountName cannot be empty.");
        C0875q.e(str2, "issuer cannot be empty.");
        String str3 = this.zza;
        String str4 = this.zzb;
        int i = this.zzc;
        StringBuilder a = c.a("otpauth://totp/", str2, ":", str, "?secret=");
        e.d(a, str3, "&issuer=", str2, "&algorithm=");
        a.append(str4);
        a.append("&digits=");
        a.append(i);
        return a.toString();
    }
}
