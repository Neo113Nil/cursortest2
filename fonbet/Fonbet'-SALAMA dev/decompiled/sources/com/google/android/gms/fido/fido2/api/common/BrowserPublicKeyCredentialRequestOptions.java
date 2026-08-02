package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import java.util.Arrays;
import t3.l;

/* loaded from: classes.dex */
public class BrowserPublicKeyCredentialRequestOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator<BrowserPublicKeyCredentialRequestOptions> CREATOR = new l(6);

    /* renamed from: a, reason: collision with root package name */
    public final PublicKeyCredentialRequestOptions f11444a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f11445b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f11446c;

    public BrowserPublicKeyCredentialRequestOptions(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, Uri uri, byte[] bArr) {
        D.i(publicKeyCredentialRequestOptions);
        this.f11444a = publicKeyCredentialRequestOptions;
        D.i(uri);
        boolean z4 = true;
        D.a("origin scheme must be non-empty", uri.getScheme() != null);
        D.a("origin authority must be non-empty", uri.getAuthority() != null);
        this.f11445b = uri;
        if (bArr != null && bArr.length != 32) {
            z4 = false;
        }
        D.a("clientDataHash must be 32 bytes long", z4);
        this.f11446c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialRequestOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) obj;
        return D.m(this.f11444a, browserPublicKeyCredentialRequestOptions.f11444a) && D.m(this.f11445b, browserPublicKeyCredentialRequestOptions.f11445b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11444a, this.f11445b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.r0(parcel, 2, this.f11444a, i7, false);
        Y4.D.r0(parcel, 3, this.f11445b, i7, false);
        Y4.D.l0(parcel, 4, this.f11446c, false);
        Y4.D.z0(x02, parcel);
    }
}
