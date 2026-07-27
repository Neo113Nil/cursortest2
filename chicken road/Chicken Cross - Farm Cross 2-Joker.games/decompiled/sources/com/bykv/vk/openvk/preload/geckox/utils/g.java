package com.bykv.vk.openvk.preload.geckox.utils;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ResVersionUtils.java */
/* loaded from: classes5.dex */
public final class g {
    public static Long a(File file) {
        File[] listFiles = file.listFiles(new FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.utils.g.1
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return file2.isDirectory();
            }
        });
        Long l = null;
        if (listFiles != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                try {
                    long longValue = Long.valueOf(file2.getName()).longValue();
                    if (l == null) {
                        l = Long.valueOf(longValue);
                    } else if (longValue > l.longValue()) {
                        l = Long.valueOf(longValue);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return l;
    }

    public static List<Long> b(File file) {
        File[] listFiles = file.listFiles(new FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.utils.g.2
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return file2.isDirectory();
            }
        });
        if (listFiles == null || listFiles.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : listFiles) {
            try {
                arrayList.add(Long.valueOf(Long.valueOf(file2.getName()).longValue()));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }
}
