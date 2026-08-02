package B4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC5434v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: B4.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2582k implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C2582k> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f2652a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2653b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f2654c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Bundle f2655d;

    /* renamed from: B4.k$a */
    public static final class a implements Parcelable.Creator<C2582k> {
        @Override // android.os.Parcelable.Creator
        public final C2582k createFromParcel(Parcel inParcel) {
            Intrinsics.checkNotNullParameter(inParcel, "inParcel");
            return new C2582k(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C2582k[] newArray(int i11) {
            return new C2582k[i11];
        }
    }

    public C2582k(@NotNull C2581j entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f2652a = entry.e();
        this.f2653b = entry.d().m();
        this.f2654c = entry.c();
        Bundle bundle = new Bundle();
        this.f2655d = bundle;
        entry.i(bundle);
    }

    public final int a() {
        return this.f2653b;
    }

    @NotNull
    public final C2581j b(@NotNull Context context, @NotNull H destination, @NotNull AbstractC5434v.b hostLifecycleState, C2596z c2596z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        Bundle bundle = this.f2654c;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        String id2 = this.f2652a;
        Intrinsics.checkNotNullParameter(id2, "id");
        return new C2581j(context, destination, bundle, hostLifecycleState, c2596z, id2, this.f2655d, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final String getId() {
        return this.f2652a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i11) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f2652a);
        parcel.writeInt(this.f2653b);
        parcel.writeBundle(this.f2654c);
        parcel.writeBundle(this.f2655d);
    }

    public C2582k(@NotNull Parcel inParcel) {
        Intrinsics.checkNotNullParameter(inParcel, "inParcel");
        String readString = inParcel.readString();
        Intrinsics.f(readString);
        this.f2652a = readString;
        this.f2653b = inParcel.readInt();
        this.f2654c = inParcel.readBundle(C2582k.class.getClassLoader());
        Bundle readBundle = inParcel.readBundle(C2582k.class.getClassLoader());
        Intrinsics.f(readBundle);
        this.f2655d = readBundle;
    }
}
