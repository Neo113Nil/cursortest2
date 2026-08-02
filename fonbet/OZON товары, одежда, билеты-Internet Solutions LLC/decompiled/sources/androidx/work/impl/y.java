package androidx.work.impl;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class y {
    public static final void a(@NotNull Context context) {
        String str;
        String[] strArr;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        Intrinsics.checkNotNullExpressionValue(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            androidx.work.o e11 = androidx.work.o.e();
            str = z.f45539a;
            e11.a(str, "Migrating WorkDatabase to the no-backup directory");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            Intrinsics.checkNotNullExpressionValue(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            Intrinsics.checkNotNullParameter(context, "context");
            File file = new File(C5473a.f45360a.a(context), "androidx.work.workdb");
            strArr = z.f45540b;
            int h11 = U.h(strArr.length);
            if (h11 < 16) {
                h11 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
            for (String str4 : strArr) {
                Pair pair = new Pair(new File(databasePath2.getPath() + str4), new File(file.getPath() + str4));
                linkedHashMap.put(pair.e(), pair.f());
            }
            for (Map.Entry entry : U.n(linkedHashMap, new Pair(databasePath2, file)).entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        androidx.work.o e12 = androidx.work.o.e();
                        str3 = z.f45539a;
                        e12.k(str3, "Over-writing contents of " + file3);
                    }
                    String str5 = file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed";
                    androidx.work.o e13 = androidx.work.o.e();
                    str2 = z.f45539a;
                    e13.a(str2, str5);
                }
            }
        }
    }
}
