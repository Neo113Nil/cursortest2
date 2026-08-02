package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class e extends com.google.android.gms.common.internal.safeparcel.a {
    public final String a;
    public final Bundle b;
    public final Bundle c;
    public final String d;
    public final String e;
    public final String f;
    public static final a Companion = new a();

    @JvmField
    public static final Parcelable.Creator<e> CREATOR = new f();

    public static final class a {
    }

    public e(@NonNull String type, @NonNull Bundle credentialRetrievalData, @NonNull Bundle candidateQueryData, @NonNull String requestMatcher, @NonNull String requestType, @NonNull String protocolType) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(credentialRetrievalData, "credentialRetrievalData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(requestMatcher, "requestMatcher");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(protocolType, "protocolType");
        this.a = type;
        this.b = credentialRetrievalData;
        this.c = candidateQueryData;
        this.d = requestMatcher;
        this.e = requestType;
        this.f = protocolType;
        boolean z = (StringsKt.isBlank(requestType) || StringsKt.isBlank(protocolType)) ? false : true;
        boolean z2 = !StringsKt.isBlank(type) && requestType.length() == 0 && protocolType.length() == 0;
        if (!z && !z2) {
            throw new IllegalArgumentException(androidx.concurrent.futures.a.a(androidx.datastore.preferences.protobuf.c.a("Either type: ", type, ", or requestType: ", requestType, " and protocolType: "), protocolType, " must be specified, but at least one contains an invalid blank value."));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int q = com.google.android.gms.common.internal.safeparcel.c.q(dest, 20293);
        com.google.android.gms.common.internal.safeparcel.c.l(dest, 1, this.a, false);
        com.google.android.gms.common.internal.safeparcel.c.b(dest, 2, this.b, false);
        com.google.android.gms.common.internal.safeparcel.c.b(dest, 3, this.c, false);
        com.google.android.gms.common.internal.safeparcel.c.l(dest, 4, this.d, false);
        com.google.android.gms.common.internal.safeparcel.c.l(dest, 5, this.e, false);
        com.google.android.gms.common.internal.safeparcel.c.l(dest, 6, this.f, false);
        com.google.android.gms.common.internal.safeparcel.c.r(dest, q);
    }
}
