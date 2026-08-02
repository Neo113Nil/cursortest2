package Jj;

import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface b extends Parcelable {

    public static final class a implements b {

        @NotNull
        public static final Parcelable.Creator<a> CREATOR = new C0282a();

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final int[] f14816a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final GradientDrawable.Orientation f14817b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final float[] f14818c;

        /* renamed from: Jj.b$a$a, reason: collision with other inner class name */
        public static final class C0282a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new a(parcel.createIntArray(), GradientDrawable.Orientation.valueOf(parcel.readString()), parcel.createFloatArray());
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        public a(@NotNull int[] colors, @NotNull GradientDrawable.Orientation orientation, @NotNull float[] positions) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            Intrinsics.checkNotNullParameter(orientation, "orientation");
            Intrinsics.checkNotNullParameter(positions, "positions");
            this.f14816a = colors;
            this.f14817b = orientation;
            this.f14818c = positions;
        }

        @Override // Jj.b
        public final void applyTo(@NotNull GradientDrawable drawable) {
            Intrinsics.checkNotNullParameter(drawable, "drawable");
            int i11 = Build.VERSION.SDK_INT;
            int[] iArr = this.f14816a;
            if (i11 >= 29) {
                drawable.setColors(iArr, this.f14818c);
            } else {
                drawable.setColors(iArr);
            }
            drawable.setOrientation(this.f14817b);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!a.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.android.uikitsdk.Color.Gradient");
            a aVar = (a) obj;
            return Arrays.equals(this.f14816a, aVar.f14816a) && this.f14817b == aVar.f14817b && Arrays.equals(this.f14818c, aVar.f14818c);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f14818c) + ((this.f14817b.hashCode() + (Arrays.hashCode(this.f14816a) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeIntArray(this.f14816a);
            dest.writeString(this.f14817b.name());
            dest.writeFloatArray(this.f14818c);
        }
    }

    /* renamed from: Jj.b$b, reason: collision with other inner class name */
    public static final class C0283b implements b {

        @NotNull
        public static final Parcelable.Creator<C0283b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final int f14819a;

        /* renamed from: Jj.b$b$a */
        public static final class a implements Parcelable.Creator<C0283b> {
            @Override // android.os.Parcelable.Creator
            public final C0283b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new C0283b(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final C0283b[] newArray(int i11) {
                return new C0283b[i11];
            }
        }

        public C0283b(int i11) {
            this.f14819a = i11;
        }

        @Override // Jj.b
        public final void applyTo(@NotNull GradientDrawable drawable) {
            Intrinsics.checkNotNullParameter(drawable, "drawable");
            int i11 = this.f14819a;
            drawable.setColors(new int[]{i11, i11});
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f14819a);
        }
    }

    void applyTo(@NotNull GradientDrawable gradientDrawable);
}
