package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.util.Base64Utils;
import java.util.Arrays;

/* renamed from: com.google.android.gms.fido.fido2.api.common.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0908m extends AbstractC0910n {

    @NonNull
    public static final Parcelable.Creator<C0908m> CREATOR = new C0();

    @NonNull
    public final C0919x a;

    @NonNull
    public final Uri b;

    @Nullable
    public final byte[] c;

    public C0908m(@NonNull C0919x c0919x, @NonNull Uri uri, @Nullable byte[] bArr) {
        C0875q.g(c0919x);
        this.a = c0919x;
        C0875q.g(uri);
        C0875q.b(uri.getScheme() != null, "origin scheme must be non-empty");
        C0875q.b(uri.getAuthority() != null, "origin authority must be non-empty");
        this.b = uri;
        C0875q.b(bArr == null || bArr.length == 32, "clientDataHash must be 32 bytes long");
        this.c = bArr;
    }

    public final boolean equals(@NonNull Object obj) {
        if (!(obj instanceof C0908m)) {
            return false;
        }
        C0908m c0908m = (C0908m) obj;
        return C0874p.a(this.a, c0908m.a) && C0874p.a(this.b, c0908m.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @NonNull
    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return androidx.concurrent.futures.a.a(androidx.datastore.preferences.protobuf.c.a("BrowserPublicKeyCredentialRequestOptions{\n publicKeyCredentialRequestOptions=", valueOf, ", \n origin=", valueOf2, ", \n clientDataHash="), Base64Utils.encodeUrlSafeNoPadding(this.c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 2, this.a, i, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 3, this.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 4, this.c, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
