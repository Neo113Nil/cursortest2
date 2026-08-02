package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.core.internal.view.SupportMenu;
import java.util.List;

/* loaded from: classes4.dex */
public final class c {
    public static void a(@NonNull Parcel parcel, int i, @NonNull Boolean bool) {
        if (bool == null) {
            return;
        }
        s(parcel, i, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void b(@NonNull Parcel parcel, int i, @NonNull Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                s(parcel, i, 0);
            }
        } else {
            int q = q(parcel, i);
            parcel.writeBundle(bundle);
            r(parcel, q);
        }
    }

    public static void c(@NonNull Parcel parcel, int i, @NonNull byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                s(parcel, i, 0);
            }
        } else {
            int q = q(parcel, i);
            parcel.writeByteArray(bArr);
            r(parcel, q);
        }
    }

    public static void d(@NonNull Parcel parcel, int i, @NonNull Double d) {
        if (d == null) {
            return;
        }
        s(parcel, i, 8);
        parcel.writeDouble(d.doubleValue());
    }

    public static void e(@NonNull Parcel parcel, int i, @NonNull Float f) {
        if (f == null) {
            return;
        }
        s(parcel, i, 4);
        parcel.writeFloat(f.floatValue());
    }

    public static void f(@NonNull Parcel parcel, int i, @NonNull IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int q = q(parcel, i);
        parcel.writeStrongBinder(iBinder);
        r(parcel, q);
    }

    public static void g(@NonNull Parcel parcel, int i, @NonNull int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                s(parcel, i, 0);
            }
        } else {
            int q = q(parcel, i);
            parcel.writeIntArray(iArr);
            r(parcel, q);
        }
    }

    public static void h(@NonNull Parcel parcel, int i, @NonNull List list) {
        if (list == null) {
            return;
        }
        int q = q(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) list.get(i2)).intValue());
        }
        r(parcel, q);
    }

    public static void i(@NonNull Parcel parcel, int i, @NonNull Integer num) {
        if (num == null) {
            return;
        }
        s(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static void j(@NonNull Parcel parcel, int i, @NonNull Long l) {
        if (l == null) {
            return;
        }
        s(parcel, i, 8);
        parcel.writeLong(l.longValue());
    }

    public static void k(@NonNull Parcel parcel, int i, @NonNull Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                s(parcel, i, 0);
            }
        } else {
            int q = q(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            r(parcel, q);
        }
    }

    public static void l(@NonNull Parcel parcel, int i, @NonNull String str, boolean z) {
        if (str == null) {
            if (z) {
                s(parcel, i, 0);
            }
        } else {
            int q = q(parcel, i);
            parcel.writeString(str);
            r(parcel, q);
        }
    }

    public static void m(@NonNull Parcel parcel, int i, @NonNull String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                s(parcel, i, 0);
            }
        } else {
            int q = q(parcel, i);
            parcel.writeStringArray(strArr);
            r(parcel, q);
        }
    }

    public static void n(@NonNull Parcel parcel, int i, @NonNull List list) {
        if (list == null) {
            return;
        }
        int q = q(parcel, i);
        parcel.writeStringList(list);
        r(parcel, q);
    }

    public static void o(@NonNull Parcel parcel, int i, @NonNull Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int q = q(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        r(parcel, q);
    }

    public static <T extends Parcelable> void p(@NonNull Parcel parcel, int i, @NonNull List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                s(parcel, i, 0);
                return;
            }
            return;
        }
        int q = q(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                t.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        r(parcel, q);
    }

    public static int q(Parcel parcel, int i) {
        parcel.writeInt(i | SupportMenu.CATEGORY_MASK);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void r(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static void s(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }
}
