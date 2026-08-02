package Pc0;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f22158a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f22159b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final EnumC0438b f22160c;

    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new b(parcel.readString(), parcel.readString(), EnumC0438b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i11) {
            return new b[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: Pc0.b$b, reason: collision with other inner class name */
    public static final class EnumC0438b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC0438b[] $VALUES;
        public static final EnumC0438b ACCOUNT_MERGE;
        public static final EnumC0438b ENTRY;
        public static final EnumC0438b FINTECH_RECOVERY_CAMERA;
        public static final EnumC0438b OTP;
        public static final EnumC0438b OTP_FLOW;
        public static final EnumC0438b PAGE_AGREEMENT_WITH_CONDITIONS;
        public static final EnumC0438b PAGE_NOTIFICATION;
        public static final EnumC0438b PAGE_SOCIAL_ADDITIONAL_INFO;
        public static final EnumC0438b PHONE_ACCESS;
        public static final EnumC0438b PHONE_ACCESS_OTP_FLOW;
        public static final EnumC0438b RESTORE_ACCESS;
        public static final EnumC0438b WEBVIEW;

        static {
            EnumC0438b enumC0438b = new EnumC0438b("ENTRY", 0);
            ENTRY = enumC0438b;
            EnumC0438b enumC0438b2 = new EnumC0438b("PHONE_ACCESS", 1);
            PHONE_ACCESS = enumC0438b2;
            EnumC0438b enumC0438b3 = new EnumC0438b("PHONE_ACCESS_OTP_FLOW", 2);
            PHONE_ACCESS_OTP_FLOW = enumC0438b3;
            EnumC0438b enumC0438b4 = new EnumC0438b("OTP", 3);
            OTP = enumC0438b4;
            EnumC0438b enumC0438b5 = new EnumC0438b("OTP_FLOW", 4);
            OTP_FLOW = enumC0438b5;
            EnumC0438b enumC0438b6 = new EnumC0438b("WEBVIEW", 5);
            WEBVIEW = enumC0438b6;
            EnumC0438b enumC0438b7 = new EnumC0438b("RESTORE_ACCESS", 6);
            RESTORE_ACCESS = enumC0438b7;
            EnumC0438b enumC0438b8 = new EnumC0438b("FINTECH_RECOVERY_CAMERA", 7);
            FINTECH_RECOVERY_CAMERA = enumC0438b8;
            EnumC0438b enumC0438b9 = new EnumC0438b("ACCOUNT_MERGE", 8);
            ACCOUNT_MERGE = enumC0438b9;
            EnumC0438b enumC0438b10 = new EnumC0438b("PAGE_NOTIFICATION", 9);
            PAGE_NOTIFICATION = enumC0438b10;
            EnumC0438b enumC0438b11 = new EnumC0438b("PAGE_SOCIAL_ADDITIONAL_INFO", 10);
            PAGE_SOCIAL_ADDITIONAL_INFO = enumC0438b11;
            EnumC0438b enumC0438b12 = new EnumC0438b("PAGE_AGREEMENT_WITH_CONDITIONS", 11);
            PAGE_AGREEMENT_WITH_CONDITIONS = enumC0438b12;
            EnumC0438b[] enumC0438bArr = {enumC0438b, enumC0438b2, enumC0438b3, enumC0438b4, enumC0438b5, enumC0438b6, enumC0438b7, enumC0438b8, enumC0438b9, enumC0438b10, enumC0438b11, enumC0438b12};
            $VALUES = enumC0438bArr;
            $ENTRIES = Xc.b.a(enumC0438bArr);
        }

        private EnumC0438b() {
            throw null;
        }

        public static EnumC0438b valueOf(String str) {
            return (EnumC0438b) Enum.valueOf(EnumC0438b.class, str);
        }

        public static EnumC0438b[] values() {
            return (EnumC0438b[]) $VALUES.clone();
        }
    }

    public b(@NotNull String screenId, @NotNull String link, @NotNull EnumC0438b screenType) {
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        this.f22158a = screenId;
        this.f22159b = link;
        this.f22160c = screenType;
    }

    public static b a(b bVar, String link) {
        String screenId = bVar.f22158a;
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Intrinsics.checkNotNullParameter(link, "link");
        EnumC0438b screenType = bVar.f22160c;
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        return new b(screenId, link, screenType);
    }

    @NotNull
    public final String b() {
        return this.f22159b;
    }

    @NotNull
    public final String c() {
        return this.f22158a;
    }

    @NotNull
    public final EnumC0438b d() {
        return this.f22160c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f22158a, bVar.f22158a) && Intrinsics.d(this.f22159b, bVar.f22159b) && this.f22160c == bVar.f22160c;
    }

    public final int hashCode() {
        return this.f22160c.hashCode() + G.g.a(this.f22158a.hashCode() * 31, 31, this.f22159b);
    }

    @NotNull
    public final String toString() {
        return "AuthBackStackEntry(screenId=" + this.f22158a + ", link=" + this.f22159b + ", screenType=" + this.f22160c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f22158a);
        dest.writeString(this.f22159b);
        dest.writeString(this.f22160c.name());
    }
}
