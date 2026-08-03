package com.google.android.gms.common.internal.safeparcel;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public final class SafeParcelableSerializer {
    private SafeParcelableSerializer() {
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> T deserializeFromBytes(byte[] bArr, android.os.Parcelable.Creator<T> creator) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(creator);
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> T deserializeFromIntentExtra(android.content.Intent intent, java.lang.String str, android.os.Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (T) deserializeFromBytes(byteArrayExtra, creator);
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> T deserializeFromString(java.lang.String str, android.os.Parcelable.Creator<T> creator) {
        return (T) deserializeFromBytes(com.google.android.gms.common.util.Base64Utils.decodeUrlSafe(str), creator);
    }

    @java.lang.Deprecated
    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> java.util.ArrayList<T> deserializeIterableFromBundle(android.os.Bundle bundle, java.lang.String str, android.os.Parcelable.Creator<T> creator) {
        java.util.ArrayList arrayList = (java.util.ArrayList) bundle.getSerializable(str);
        if (arrayList == null) {
            return null;
        }
        com.ironsource.sdk.controller.FeaturesManager.a aVar = (java.util.ArrayList<T>) new java.util.ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            aVar.add(deserializeFromBytes((byte[]) arrayList.get(i), creator));
        }
        return aVar;
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> java.util.ArrayList<T> deserializeIterableFromBundleSafe(android.os.Bundle bundle, java.lang.String str, android.os.Parcelable.Creator<T> creator) {
        return deserializeIterableFromBytes(bundle.getByteArray(str), creator);
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> java.util.ArrayList<T> deserializeIterableFromBytes(byte[] bArr, android.os.Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        try {
            java.util.ArrayList<T> arrayList = new java.util.ArrayList<>();
            obtain.readTypedList(arrayList, creator);
            return arrayList;
        } finally {
            obtain.recycle();
        }
    }

    @java.lang.Deprecated
    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> java.util.ArrayList<T> deserializeIterableFromIntentExtra(android.content.Intent intent, java.lang.String str, android.os.Parcelable.Creator<T> creator) {
        java.util.ArrayList arrayList = (java.util.ArrayList) intent.getSerializableExtra(str);
        if (arrayList == null) {
            return null;
        }
        com.ironsource.sdk.controller.FeaturesManager.a aVar = (java.util.ArrayList<T>) new java.util.ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            aVar.add(deserializeFromBytes((byte[]) arrayList.get(i), creator));
        }
        return aVar;
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> java.util.ArrayList<T> deserializeIterableFromIntentExtraSafe(android.content.Intent intent, java.lang.String str, android.os.Parcelable.Creator<T> creator) {
        return deserializeIterableFromBytes(intent.getByteArrayExtra(str), creator);
    }

    @java.lang.Deprecated
    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> void serializeIterableToBundle(java.lang.Iterable<T> iterable, android.os.Bundle bundle, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(serializeToBytes(it.next()));
        }
        bundle.putSerializable(str, arrayList);
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> void serializeIterableToBundleSafe(java.lang.Iterable<T> iterable, android.os.Bundle bundle, java.lang.String str) {
        bundle.putByteArray(str, serializeIterableToBytes(iterable));
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> byte[] serializeIterableToBytes(java.lang.Iterable<T> iterable) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            obtain.writeTypedList(com.google.android.gms.internal.common.zzah.zzo(iterable));
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    @java.lang.Deprecated
    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> void serializeIterableToIntentExtra(java.lang.Iterable<T> iterable, android.content.Intent intent, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(serializeToBytes(it.next()));
        }
        intent.putExtra(str, arrayList);
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> void serializeIterableToIntentExtraSafe(java.lang.Iterable<T> iterable, android.content.Intent intent, java.lang.String str) {
        intent.putExtra(str, serializeIterableToBytes(iterable));
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> byte[] serializeToBytes(T t) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        t.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> void serializeToIntentExtra(T t, android.content.Intent intent, java.lang.String str) {
        intent.putExtra(str, serializeToBytes(t));
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> java.lang.String serializeToString(T t) {
        return com.google.android.gms.common.util.Base64Utils.encodeUrlSafe(serializeToBytes(t));
    }
}
