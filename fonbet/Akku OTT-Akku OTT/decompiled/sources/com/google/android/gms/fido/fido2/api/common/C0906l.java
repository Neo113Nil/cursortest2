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

/* renamed from: com.google.android.gms.fido.fido2.api.common.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0906l extends AbstractC0910n {

    @NonNull
    public static final Parcelable.Creator<C0906l> CREATOR = new B0();

    @NonNull
    public final C0916u a;

    @NonNull
    public final Uri b;

    @Nullable
    public final byte[] c;

    public C0906l(@NonNull C0916u c0916u, @NonNull Uri uri, @Nullable byte[] bArr) {
        C0875q.g(c0916u);
        this.a = c0916u;
        C0875q.g(uri);
        C0875q.b(uri.getScheme() != null, "origin scheme must be non-empty");
        C0875q.b(uri.getAuthority() != null, "origin authority must be non-empty");
        this.b = uri;
        C0875q.b(bArr == null || bArr.length == 32, "clientDataHash must be 32 bytes long");
        this.c = bArr;
    }

    public final boolean equals(@NonNull Object obj) {
        if (!(obj instanceof C0906l)) {
            return false;
        }
        C0906l c0906l = (C0906l) obj;
        return C0874p.a(this.a, c0906l.a) && C0874p.a(this.b, c0906l.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @NonNull
    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return androidx.concurrent.futures.a.a(androidx.datastore.preferences.protobuf.c.a("BrowserPublicKeyCredentialCreationOptions{\n publicKeyCredentialCreationOptions=", valueOf, ", \n origin=", valueOf2, ", \n clientDataHash="), Base64Utils.encodeUrlSafeNoPadding(this.c), "}");
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
