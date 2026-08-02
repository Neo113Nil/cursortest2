package com.odehbros.flutter_file_downloader.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {
    public static final a a;
    public static final a b;
    public static final a c;
    public static final /* synthetic */ a[] d;

    static {
        a aVar = new a("activityMissing", 0);
        a = aVar;
        a aVar2 = new a("permissionDefinitionsNotFound", 1);
        b = aVar2;
        a aVar3 = new a("permissionDenied", 2);
        c = aVar3;
        d = new a[]{aVar, aVar2, aVar3, new a("permissionRequestInProgress", 3)};
    }

    public a() {
        throw null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) d.clone();
    }

    public final String a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "Activity is missing. This might happen when running a certain function from the background that requires a UI element (e.g. requesting permissions).";
        }
        if (ordinal == 1) {
            return "No storage permission is defined in the manifest. Make sure that WRITE_EXTERNAL_STORAGE is defined in the manifest.";
        }
        if (ordinal == 2) {
            return "User denied permissions to access the device's files.";
        }
        if (ordinal == 3) {
            return "Already listening for storage updates. If you want to restart listening please cancel other subscriptions first";
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "ACTIVITY_MISSING";
        }
        if (ordinal == 1) {
            return "PERMISSION_DEFINITIONS_NOT_FOUND";
        }
        if (ordinal == 2) {
            return "PERMISSION_DENIED";
        }
        if (ordinal == 3) {
            return "PERMISSION_REQUEST_IN_PROGRESS";
        }
        throw new IndexOutOfBoundsException();
    }
}
