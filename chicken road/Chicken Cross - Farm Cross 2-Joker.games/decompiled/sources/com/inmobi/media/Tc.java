package com.inmobi.media;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes6.dex */
public abstract class Tc {
    public static final boolean a(String tag, String data, String filePath) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        try {
            a(filePath);
            File file = new File(filePath);
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bytes = data.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
            return true;
        } catch (IOException | RuntimeException unused) {
            return false;
        }
    }

    public static final String b(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        File file = new File(filePath);
        if (file.exists() && file.isFile()) {
            try {
                return FilesKt.readText$default(file, null, 1, null);
            } catch (Exception unused) {
                String str = "error while reading - " + filePath;
            }
        }
        return null;
    }

    public static final void a(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        File file = new File(filePath);
        if (file.exists() && file.delete()) {
            String str = "file " + file.getName() + " deleted";
        }
    }
}
