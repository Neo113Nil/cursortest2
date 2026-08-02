package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import io.flutter.plugins.firebase.auth.Constants;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

@SourceDebugExtension({"SMAP\nAuthenticationToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthenticationToken.kt\ncom/facebook/AuthenticationToken\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,211:1\n1#2:212\n*E\n"})
/* renamed from: com.facebook.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0724m implements Parcelable {
    public final String a;
    public final String b;
    public final C0726o c;
    public final C0725n d;
    public final String e;
    public static final b Companion = new b();

    @JvmField
    public static final Parcelable.Creator<C0724m> CREATOR = new a();

    /* renamed from: com.facebook.m$a */
    public static final class a implements Parcelable.Creator<C0724m> {
        @Override // android.os.Parcelable.Creator
        public final C0724m createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new C0724m(source);
        }

        @Override // android.os.Parcelable.Creator
        public final C0724m[] newArray(int i) {
            return new C0724m[i];
        }
    }

    /* renamed from: com.facebook.m$b */
    public static final class b {
    }

    public C0724m(String token, String expectedNonce) {
        List split$default;
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(expectedNonce, "expectedNonce");
        com.facebook.internal.F.c(token, Constants.TOKEN);
        com.facebook.internal.F.c(expectedNonce, "expectedNonce");
        boolean z = false;
        split$default = StringsKt__StringsKt.split$default(token, new String[]{"."}, false, 0, 6, (Object) null);
        if (split$default.size() != 3) {
            throw new IllegalArgumentException("Invalid IdToken string");
        }
        String str = (String) split$default.get(0);
        String str2 = (String) split$default.get(1);
        String str3 = (String) split$default.get(2);
        this.a = token;
        this.b = expectedNonce;
        C0726o c0726o = new C0726o(str);
        this.c = c0726o;
        this.d = new C0725n(str2, expectedNonce);
        try {
            String b2 = com.facebook.internal.security.b.b(c0726o.c);
            if (b2 != null) {
                z = com.facebook.internal.security.b.c(com.facebook.internal.security.b.a(b2), str + '.' + str2, str3);
            }
        } catch (IOException | InvalidKeySpecException unused) {
        }
        if (!z) {
            throw new IllegalArgumentException("Invalid Signature");
        }
        this.e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0724m)) {
            return false;
        }
        C0724m c0724m = (C0724m) obj;
        return Intrinsics.areEqual(this.a, c0724m.a) && Intrinsics.areEqual(this.b, c0724m.b) && Intrinsics.areEqual(this.c, c0724m.c) && Intrinsics.areEqual(this.d, c0724m.d) && Intrinsics.areEqual(this.e, c0724m.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + androidx.compose.runtime.collection.a.a(androidx.compose.runtime.collection.a.a(527, 31, this.a), 31, this.b)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.a);
        dest.writeString(this.b);
        dest.writeParcelable(this.c, i);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e);
    }

    public C0724m(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String readString = parcel.readString();
        com.facebook.internal.F.e(readString, Constants.TOKEN);
        this.a = readString;
        String readString2 = parcel.readString();
        com.facebook.internal.F.e(readString2, "expectedNonce");
        this.b = readString2;
        Parcelable readParcelable = parcel.readParcelable(C0726o.class.getClassLoader());
        if (readParcelable != null) {
            this.c = (C0726o) readParcelable;
            Parcelable readParcelable2 = parcel.readParcelable(C0725n.class.getClassLoader());
            if (readParcelable2 != null) {
                this.d = (C0725n) readParcelable2;
                String readString3 = parcel.readString();
                com.facebook.internal.F.e(readString3, "signature");
                this.e = readString3;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
