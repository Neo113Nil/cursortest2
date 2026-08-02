package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.fido.fido2.api.common.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0911o implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<C0911o> CREATOR = new D0();

    @NonNull
    public final Enum a;

    /* renamed from: com.google.android.gms.fido.fido2.api.common.o$a */
    public static class a extends Exception {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0911o(@NonNull InterfaceC0884a interfaceC0884a) {
        this.a = (Enum) interfaceC0884a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static C0911o h(int i) throws a {
        B b;
        if (i == -262) {
            b = B.RS1;
        } else {
            B[] values = B.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    for (EnumC0912p enumC0912p : EnumC0912p.values()) {
                        if (enumC0912p.a == i) {
                            b = enumC0912p;
                        }
                    }
                    throw new a(androidx.compose.runtime.u.a(i, "Algorithm with COSE value ", " not supported"));
                }
                B b2 = values[i2];
                if (b2.a == i) {
                    b = b2;
                    break;
                }
                i2++;
            }
        }
        return new C0911o(b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.fido.fido2.api.common.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.fido.fido2.api.common.a, java.lang.Enum] */
    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof C0911o) && this.a.a() == ((C0911o) obj).a.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @NonNull
    public final String toString() {
        return android.support.v4.media.b.b("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.a), "}");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.fido.fido2.api.common.a, java.lang.Enum] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(this.a.a());
    }
}
