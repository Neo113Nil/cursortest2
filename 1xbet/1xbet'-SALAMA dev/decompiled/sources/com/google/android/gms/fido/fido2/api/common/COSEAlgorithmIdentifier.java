package com.google.android.gms.fido.fido2.api.common;

import W5.AbstractC0486a1;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p140t3.d;
import p140t3.e;
import p140t3.h;
import p140t3.l;

/* JADX INFO: loaded from: classes.dex */
public class COSEAlgorithmIdentifier implements Parcelable {
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new l(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enum f11447a;

    /* JADX WARN: Multi-variable type inference failed */
    public COSEAlgorithmIdentifier(p140t3.a aVar) {
        this.f11447a = (Enum) aVar;
    }

    public static COSEAlgorithmIdentifier a(int i7) throws d {
        p140t3.a aVar;
        if (i7 != -262) {
            for (h hVar : h.values()) {
                if (hVar.f16458a == i7) {
                    aVar = hVar;
                }
            }
            for (e eVar : e.values()) {
                if (eVar.f16455a == i7) {
                    aVar = eVar;
                }
            }
            throw new d(AbstractC0486a1.f(i7, "Algorithm with COSE value ", " not supported"));
        }
        aVar = h.RS1;
        return new COSEAlgorithmIdentifier(aVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Enum, t3.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, t3.a] */
    public final boolean equals(Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.f11447a.a() == ((COSEAlgorithmIdentifier) obj).f11447a.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11447a});
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Enum, t3.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f11447a.a());
    }
}
