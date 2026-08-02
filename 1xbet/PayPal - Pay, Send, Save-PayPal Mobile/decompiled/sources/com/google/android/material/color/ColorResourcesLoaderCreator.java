package com.google.android.material.color;

/* loaded from: classes8.dex */
final class ColorResourcesLoaderCreator {
    private static final java.lang.String TAG = "ColorResLoaderCreator";

    private ColorResourcesLoaderCreator() {
    }

    static android.content.res.loader.ResourcesLoader create(android.content.Context context, java.util.Map<java.lang.Integer, java.lang.Integer> map) {
        java.io.FileDescriptor fileDescriptor;
        try {
            byte[] create = com.google.android.material.color.ColorResourcesTableCreator.create(context, map);
            int length = create.length;
            if (create.length == 0) {
                return null;
            }
            try {
                fileDescriptor = android.system.Os.memfd_create("temp.arsc", 0);
                if (fileDescriptor == null) {
                    if (fileDescriptor != null) {
                        android.system.Os.close(fileDescriptor);
                    }
                    return null;
                }
                try {
                    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileDescriptor);
                    try {
                        fileOutputStream.write(create);
                        android.os.ParcelFileDescriptor dup = android.os.ParcelFileDescriptor.dup(fileDescriptor);
                        try {
                            android.content.res.loader.ResourcesLoader resourcesLoader = new android.content.res.loader.ResourcesLoader();
                            resourcesLoader.addProvider(android.content.res.loader.ResourcesProvider.loadFromTable(dup, null));
                            if (dup != null) {
                                dup.close();
                            }
                            fileOutputStream.close();
                            if (fileDescriptor != null) {
                                android.system.Os.close(fileDescriptor);
                            }
                            return resourcesLoader;
                        } finally {
                        }
                    } finally {
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (fileDescriptor != null) {
                        android.system.Os.close(fileDescriptor);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                fileDescriptor = null;
            }
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
