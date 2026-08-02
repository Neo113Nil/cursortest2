package com.google.android.gms.fido.fido2.api.common;

import W5.AbstractC0486a1;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t3.InterfaceC1607a;
import t3.d;
import t3.e;
import t3.h;
import t3.l;

/* loaded from: classes.dex */
public class COSEAlgorithmIdentifier implements Parcelable {
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new l(7);

    /* renamed from: a, reason: collision with root package name */
    public final Enum f11447a;

    /* JADX WARN: Multi-variable type inference failed */
    public COSEAlgorithmIdentifier(InterfaceC1607a interfaceC1607a) {
        this.f11447a = (Enum) interfaceC1607a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static COSEAlgorithmIdentifier a(int i7) {
        h hVar;
        if (i7 == -262) {
            hVar = h.RS1;
        } else {
            h[] values = h.values();
            int length = values.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    for (e eVar : e.values()) {
                        if (eVar.f16449a == i7) {
                            hVar = eVar;
                        }
                    }
                    throw new d(AbstractC0486a1.f(i7, "Algorithm with COSE value ", " not supported"));
                }
                h hVar2 = values[i8];
                if (hVar2.f16452a == i7) {
                    hVar = hVar2;
                    break;
                }
                i8++;
            }
        }
        return new COSEAlgorithmIdentifier(hVar);
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
