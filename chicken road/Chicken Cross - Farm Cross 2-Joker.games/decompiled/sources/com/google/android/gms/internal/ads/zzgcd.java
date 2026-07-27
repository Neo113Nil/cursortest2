package com.google.android.gms.internal.ads;

import androidx.datastore.core.Serializer;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgcd implements Serializer {
    public static final zzgcd zza = new zzgcd();
    private static final zzgca zzb;

    static {
        zzgca zzd = zzgca.zzd();
        Intrinsics.checkNotNullExpressionValue(zzd, "getDefaultInstance(...)");
        zzb = zzd;
    }

    private zzgcd() {
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object getDefaultValue() {
        return zzb;
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream inputStream, Continuation continuation) {
        try {
            zzgca zzc = zzgca.zzc(inputStream);
            Intrinsics.checkNotNull(zzc);
            return zzc;
        } catch (Exception unused) {
            return zzb;
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, Continuation continuation) {
        ((zzgca) obj).zzaO(outputStream);
        return Unit.INSTANCE;
    }
}
