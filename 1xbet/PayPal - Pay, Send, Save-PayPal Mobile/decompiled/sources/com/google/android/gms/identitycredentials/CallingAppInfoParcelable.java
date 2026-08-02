package com.google.android.gms.identitycredentials;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018"}, d2 = {"Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;", "Landroid/os/Parcelable;", "", com.visa.cbp.ConsumerInfo.setSignature, "", "", "packageCertificates", "origin", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "list", "writeByteArrayList", "(Ljava/util/List;Landroid/os/Parcel;)V", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "Ljava/util/List;", "getPackageCertificates", "()Ljava/util/List;", "getOrigin", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CallingAppInfoParcelable implements android.os.Parcelable {
    private final java.lang.String origin;
    private final java.util.List<byte[]> packageCertificates;
    private final java.lang.String packageName;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.android.gms.identitycredentials.CallingAppInfoParcelable.Companion INSTANCE = new com.google.android.gms.identitycredentials.CallingAppInfoParcelable.Companion(null);
    public static final android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.CallingAppInfoParcelable> CREATOR = new android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.CallingAppInfoParcelable>() { // from class: com.google.android.gms.identitycredentials.CallingAppInfoParcelable$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.google.android.gms.identitycredentials.CallingAppInfoParcelable createFromParcel(android.os.Parcel source) {
            java.util.ArrayList readByteArrayList;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            java.lang.String readString = source.readString();
            readByteArrayList = com.google.android.gms.identitycredentials.CallingAppInfoParcelable.INSTANCE.readByteArrayList(source);
            java.lang.String readString2 = source.readString();
            if (readString == null || readByteArrayList == null) {
                return null;
            }
            return new com.google.android.gms.identitycredentials.CallingAppInfoParcelable(readString, readByteArrayList, readString2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.google.android.gms.identitycredentials.CallingAppInfoParcelable[] newArray(int size) {
            return new com.google.android.gms.identitycredentials.CallingAppInfoParcelable[size];
        }
    };

    private final void writeByteArrayList(java.util.List<byte[]> list, android.os.Parcel dest) {
        dest.writeInt(list.size());
        for (byte[] bArr : list) {
            dest.writeInt(bArr.length);
            dest.writeByteArray(bArr);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.packageName);
        writeByteArrayList(this.packageCertificates, dest);
        dest.writeString(this.origin);
    }

    public final java.lang.String getPackageName() {
        return this.packageName;
    }

    public final java.util.List<byte[]> getPackageCertificates() {
        return this.packageCertificates;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable$Companion;", "", "<init>", "()V", "Landroid/os/Parcel;", "source", "Ljava/util/ArrayList;", "", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "readByteArrayList", "(Landroid/os/Parcel;)Ljava/util/ArrayList;", "Landroid/os/Parcelable$Creator;", "Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;", "CREATOR", "Landroid/os/Parcelable$Creator;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public final java.util.ArrayList<byte[]> readByteArrayList(android.os.Parcel source) {
            int readInt = source.readInt();
            if (readInt < 0) {
                return null;
            }
            if (readInt == 0) {
                return new java.util.ArrayList<>();
            }
            java.util.ArrayList<byte[]> arrayList = new java.util.ArrayList<>(readInt);
            for (int i = 0; i < readInt; i++) {
                byte[] bArr = new byte[source.readInt()];
                source.readByteArray(bArr);
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final java.lang.String getOrigin() {
        return this.origin;
    }

    public CallingAppInfoParcelable(java.lang.String str, java.util.List<byte[]> list, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.packageName = str;
        this.packageCertificates = list;
        this.origin = str2;
    }
}
