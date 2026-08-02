package com.google.android.gms.auth.blockstore.restorecredential.internal;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.blockstore.restorecredential.internal.d;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.internal.AbstractC0866h;
import com.google.android.gms.internal.auth_blockstore.zzab;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l extends AbstractC0866h<d> {
    public static final a Companion = new a();

    public static final class a {
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    @NonNull
    public final IInterface createServiceInterface(@NonNull IBinder binder) {
        d c0109a;
        Intrinsics.checkNotNullParameter(binder, "binder");
        int i = d.a.a;
        if (binder == null) {
            c0109a = null;
        } else {
            IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
            c0109a = queryLocalInterface instanceof d ? (d) queryLocalInterface : new d.a.C0109a(binder, "com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
        }
        Intrinsics.checkNotNullExpressionValue(c0109a, "asInterface(...)");
        return c0109a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final C0854d[] getApiFeatures() {
        C0854d[] ALL_FEATURES = zzab.zzl;
        Intrinsics.checkNotNullExpressionValue(ALL_FEATURES, "ALL_FEATURES");
        return ALL_FEATURES;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.blockstore.restorecredential.service.START_RESTORE_CRED";
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
