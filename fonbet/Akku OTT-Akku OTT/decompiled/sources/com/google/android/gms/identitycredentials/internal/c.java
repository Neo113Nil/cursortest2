package com.google.android.gms.identitycredentials.internal;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.internal.AbstractC0866h;
import com.google.android.gms.identitycredentials.internal.b;
import com.google.android.gms.internal.identity_credentials.zze;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends AbstractC0866h<b> {
    public static final a Companion = new a();

    public static final class a {
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    @NonNull
    public final IInterface createServiceInterface(@NonNull IBinder iBinder) {
        Intrinsics.checkNotNullParameter(iBinder, "iBinder");
        int i = b.a.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        return queryLocalInterface instanceof b ? (b) queryLocalInterface : new b.a.C0118a(iBinder, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final C0854d[] getApiFeatures() {
        C0854d[] ALL_FEATURES = zze.zzd;
        Intrinsics.checkNotNullExpressionValue(ALL_FEATURES, "ALL_FEATURES");
        return ALL_FEATURES;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final String getStartServiceAction() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
