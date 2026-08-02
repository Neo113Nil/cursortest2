package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.collection.h;
import androidx.core.internal.view.SupportMenu;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class b {

    public static class a extends RuntimeException {
        public a(@NonNull String str, @NonNull Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    public static void A(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        throw new a(androidx.concurrent.futures.a.a(h.c("Expected size ", i2, i, " got ", " (0x"), Integer.toHexString(i), ")"), parcel);
    }

    public static void B(Parcel parcel, int i, int i2) {
        int x = x(parcel, i);
        if (x == i2) {
            return;
        }
        throw new a(androidx.concurrent.futures.a.a(h.c("Expected size ", i2, x, " got ", " (0x"), Integer.toHexString(x), ")"), parcel);
    }

    @NonNull
    public static BigDecimal a(@NonNull Parcel parcel, int i) {
        int x = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + x);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    @NonNull
    public static Bundle b(@NonNull Parcel parcel, int i) {
        int x = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + x);
        return readBundle;
    }

    @NonNull
    public static byte[] c(@NonNull Parcel parcel, int i) {
        int x = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + x);
        return createByteArray;
    }

    @NonNull
    public static int[] d(@NonNull Parcel parcel, int i) {
        int x = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + x);
        return createIntArray;
    }

    @NonNull
    public static ArrayList<Integer> e(@NonNull Parcel parcel, int i) {
        int x = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + x);
        return arrayList;
    }

    @NonNull
    public static <T extends Parcelable> T f(@NonNull Parcel parcel, int i, @NonNull Parcelable.Creator<T> creator) {
        int x = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + x);
        return createFromParcel;
    }

    @NonNull
    public static String g(@NonNull Parcel parcel, int i) {
        int x = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + x);
        return readString;
    }

    @NonNull
    public static String[] h(@NonNull Parcel parcel, int i) {
        int x = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + x);
        return createStringArray;
    }

    @NonNull
    public static ArrayList<String> i(@NonNull Parcel parcel, int i) {
        int x = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + x);
        return createStringArrayList;
    }

    @NonNull
    public static <T> T[] j(@NonNull Parcel parcel, int i, @NonNull Parcelable.Creator<T> creator) {
        int x = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + x);
        return tArr;
    }

    @NonNull
    public static <T> ArrayList<T> k(@NonNull Parcel parcel, int i, @NonNull Parcelable.Creator<T> creator) {
        int x = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + x);
        return createTypedArrayList;
    }

    public static void l(@NonNull Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new a(android.support.v4.media.a.a(i, "Overread allowed size end="), parcel);
        }
    }

    public static boolean m(@NonNull Parcel parcel, int i) {
        B(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    @NonNull
    public static Boolean n(@NonNull Parcel parcel, int i) {
        int x = x(parcel, i);
        if (x == 0) {
            return null;
        }
        A(parcel, x, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static double o(@NonNull Parcel parcel, int i) {
        B(parcel, i, 8);
        return parcel.readDouble();
    }

    @NonNull
    public static Double p(@NonNull Parcel parcel, int i) {
        int x = x(parcel, i);
        if (x == 0) {
            return null;
        }
        A(parcel, x, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float q(@NonNull Parcel parcel, int i) {
        B(parcel, i, 4);
        return parcel.readFloat();
    }

    @NonNull
    public static Float r(@NonNull Parcel parcel, int i) {
        int x = x(parcel, i);
        if (x == 0) {
            return null;
        }
        A(parcel, x, 4);
        return Float.valueOf(parcel.readFloat());
    }

    @NonNull
    public static IBinder s(@NonNull Parcel parcel, int i) {
        int x = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + x);
        return readStrongBinder;
    }

    public static int t(@NonNull Parcel parcel, int i) {
        B(parcel, i, 4);
        return parcel.readInt();
    }

    @NonNull
    public static Integer u(@NonNull Parcel parcel, int i) {
        int x = x(parcel, i);
        if (x == 0) {
            return null;
        }
        A(parcel, x, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long v(@NonNull Parcel parcel, int i) {
        B(parcel, i, 8);
        return parcel.readLong();
    }

    @NonNull
    public static Long w(@NonNull Parcel parcel, int i) {
        int x = x(parcel, i);
        if (x == 0) {
            return null;
        }
        A(parcel, x, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int x(@NonNull Parcel parcel, int i) {
        return (i & SupportMenu.CATEGORY_MASK) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void y(@NonNull Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + x(parcel, i));
    }

    public static int z(@NonNull Parcel parcel) {
        int readInt = parcel.readInt();
        int x = x(parcel, readInt);
        char c = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i = x + dataPosition;
        if (i < dataPosition || i > parcel.dataSize()) {
            throw new a(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.a.a("Size read is invalid start=", dataPosition, " end=", i), parcel);
        }
        return i;
    }
}
