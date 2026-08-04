package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import java.util.Arrays;
import p140t3.l;

/* JADX INFO: loaded from: classes.dex */
public class BrowserPublicKeyCredentialCreationOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator<BrowserPublicKeyCredentialCreationOptions> CREATOR = new l(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PublicKeyCredentialCreationOptions f11441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f11442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f11443c;

    public BrowserPublicKeyCredentialCreationOptions(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, Uri uri, byte[] bArr) {
        D.i(publicKeyCredentialCreationOptions);
        this.f11441a = publicKeyCredentialCreationOptions;
        D.i(uri);
        boolean z4 = true;
        D.a("origin scheme must be non-empty", uri.getScheme() != null);
        D.a("origin authority must be non-empty", uri.getAuthority() != null);
        this.f11442b = uri;
        if (bArr != null && bArr.length != 32) {
            z4 = false;
        }
        D.a("clientDataHash must be 32 bytes long", z4);
        this.f11443c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialCreationOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions = (BrowserPublicKeyCredentialCreationOptions) obj;
        return D.m(this.f11441a, browserPublicKeyCredentialCreationOptions.f11441a) && D.m(this.f11442b, browserPublicKeyCredentialCreationOptions.f11442b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11441a, this.f11442b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.r0(parcel, 2, this.f11441a, i7, false);
        Y4.D.r0(parcel, 3, this.f11442b, i7, false);
        Y4.D.l0(parcel, 4, this.f11443c, false);
        Y4.D.z0(iX0, parcel);
    }
}
