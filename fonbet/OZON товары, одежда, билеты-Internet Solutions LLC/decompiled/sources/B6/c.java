package B6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class c implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f2951a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f2952b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f2953c;

    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = b.a(parcel, linkedHashMap, parcel.readString(), i11, 1);
            }
            return new c(readString, readString2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i11) {
            return new c[i11];
        }
    }

    public c(@NotNull String code, @NotNull String state, @NotNull LinkedHashMap params) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f2951a = code;
        this.f2952b = state;
        this.f2953c = params;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i11) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f2951a);
        out.writeString(this.f2952b);
        LinkedHashMap linkedHashMap = this.f2953c;
        out.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            out.writeString((String) entry.getKey());
            out.writeString((String) entry.getValue());
        }
    }
}
