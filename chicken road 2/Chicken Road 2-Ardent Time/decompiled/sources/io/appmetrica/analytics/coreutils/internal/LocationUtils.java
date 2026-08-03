package io.appmetrica.analytics.coreutils.internal;

/* loaded from: classes.dex */
public final class LocationUtils {
    public static final io.appmetrica.analytics.coreutils.internal.LocationUtils INSTANCE = new io.appmetrica.analytics.coreutils.internal.LocationUtils();

    private LocationUtils() {
    }

    public static final android.location.Location bytesToLocation(byte[] bArr) {
        if (bArr != null) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                android.location.Location location = (android.location.Location) obtain.readValue(android.location.Location.class.getClassLoader());
                obtain.recycle();
                return location;
            } catch (java.lang.Throwable unused) {
                obtain.recycle();
            }
        }
        return null;
    }

    public static final byte[] locationToBytes(android.location.Location location) {
        if (location != null) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            try {
                obtain.writeValue(location);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                return marshall;
            } catch (java.lang.Throwable unused) {
                obtain.recycle();
            }
        }
        return null;
    }
}
