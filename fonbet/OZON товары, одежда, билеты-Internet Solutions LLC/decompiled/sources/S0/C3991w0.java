package S0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: S0.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3991w0<T> extends k1<T> implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C3991w0<Object>> CREATOR = new a();

    /* renamed from: S0.w0$a */
    public static final class a implements Parcelable.ClassLoaderCreator<C3991w0<Object>> {
        @NotNull
        public static C3991w0 a(@NotNull Parcel parcel, ClassLoader classLoader) {
            l1 l1Var;
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            Object readValue = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            if (readInt == 0) {
                l1Var = C3980q0.f25505a;
            } else if (readInt == 1) {
                l1Var = D1.f25195a;
            } else {
                if (readInt != 2) {
                    throw new IllegalStateException(T7.E.a(readInt, "Unsupported MutableState policy ", " was restored"));
                }
                l1Var = S0.f25310a;
            }
            return new C3991w0(readValue, l1Var);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* bridge */ /* synthetic */ C3991w0<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return a(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i11) {
            return new C3991w0[i11];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return a(parcel, null);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i11) {
        int i12;
        parcel.writeValue(getValue());
        l1<T> a11 = a();
        if (Intrinsics.d(a11, C3980q0.f25505a)) {
            i12 = 0;
        } else if (Intrinsics.d(a11, D1.f25195a)) {
            i12 = 1;
        } else {
            if (!Intrinsics.d(a11, S0.f25310a)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i12 = 2;
        }
        parcel.writeInt(i12);
    }
}
