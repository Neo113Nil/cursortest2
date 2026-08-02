package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public class EmailAuthCredential extends AuthCredential {

    @NonNull
    public static final Parcelable.Creator<EmailAuthCredential> CREATOR = new zzf();
    private String zza;

    @Nullable
    private String zzb;

    @Nullable
    private final String zzc;

    @Nullable
    private String zzd;
    private boolean zze;

    public EmailAuthCredential(String str, String str2) {
        this(str, str2, null, null, false);
    }

    @Override // com.google.firebase.auth.AuthCredential
    @NonNull
    public String getProvider() {
        return "password";
    }

    @Override // com.google.firebase.auth.AuthCredential
    @NonNull
    public String getSignInMethod() {
        return !TextUtils.isEmpty(this.zzb) ? "password" : "emailLink";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.l(parcel, 1, this.zza, false);
        c.l(parcel, 2, this.zzb, false);
        c.l(parcel, 3, this.zzc, false);
        c.l(parcel, 4, this.zzd, false);
        boolean z = this.zze;
        c.s(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        c.r(parcel, q);
    }

    @Override // com.google.firebase.auth.AuthCredential
    @NonNull
    public final AuthCredential zza() {
        return new EmailAuthCredential(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    @Nullable
    public final String zzb() {
        return this.zzd;
    }

    @NonNull
    public final String zzc() {
        return this.zza;
    }

    @Nullable
    public final String zzd() {
        return this.zzb;
    }

    @Nullable
    public final String zze() {
        return this.zzc;
    }

    public final boolean zzf() {
        return !TextUtils.isEmpty(this.zzc);
    }

    public final boolean zzg() {
        return this.zze;
    }

    public EmailAuthCredential(String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z) {
        C0875q.d(str);
        this.zza = str;
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = z;
    }

    @NonNull
    public final EmailAuthCredential zza(@NonNull FirebaseUser firebaseUser) {
        this.zzd = firebaseUser.zze();
        this.zze = true;
        return this;
    }

    public static boolean zza(@NonNull String str) {
        ActionCodeUrl parseLink;
        return (TextUtils.isEmpty(str) || (parseLink = ActionCodeUrl.parseLink(str)) == null || parseLink.getOperation() != 4) ? false : true;
    }
}
