package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/google/android/gms/identitycredentials/GetCredentialRequest;", "Lcom/google/android/gms/common/internal/safeparcel/a;", "Lcom/google/android/gms/common/internal/ReflectedParcelable;", "Companion", "a", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GetCredentialRequest extends com.google.android.gms.common.internal.safeparcel.a implements ReflectedParcelable {
    public final List<e> a;
    public final Bundle b;
    public final String c;
    public final ResultReceiver d;

    @JvmField
    public static final Parcelable.Creator<GetCredentialRequest> CREATOR = new h();

    public GetCredentialRequest(@NonNull ArrayList credentialOptions, @NonNull Bundle data, String str, @NonNull ResultReceiver resultReceiver) {
        Intrinsics.checkNotNullParameter(credentialOptions, "credentialOptions");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(resultReceiver, "resultReceiver");
        this.a = credentialOptions;
        this.b = data;
        this.c = str;
        this.d = resultReceiver;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int q = com.google.android.gms.common.internal.safeparcel.c.q(dest, 20293);
        com.google.android.gms.common.internal.safeparcel.c.p(dest, 1, this.a, false);
        com.google.android.gms.common.internal.safeparcel.c.b(dest, 2, this.b, false);
        com.google.android.gms.common.internal.safeparcel.c.l(dest, 3, this.c, false);
        com.google.android.gms.common.internal.safeparcel.c.k(dest, 4, this.d, i, false);
        com.google.android.gms.common.internal.safeparcel.c.r(dest, q);
    }
}
