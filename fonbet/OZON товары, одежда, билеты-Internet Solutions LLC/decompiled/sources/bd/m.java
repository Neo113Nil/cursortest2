package bd;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/FilesKt")
/* loaded from: classes.dex */
public class m extends l {
    private static final e e(e eVar) {
        File a11 = eVar.a();
        List<File> b11 = eVar.b();
        ArrayList arrayList = new ArrayList(b11.size());
        for (File file : b11) {
            String name = file.getName();
            if (!Intrinsics.d(name, ".")) {
                if (!Intrinsics.d(name, "..")) {
                    arrayList.add(file);
                } else if (arrayList.isEmpty() || Intrinsics.d(((File) C7714v.X(arrayList)).getName(), "..")) {
                    arrayList.add(file);
                } else {
                    Ej.b.b(1, arrayList);
                }
            }
        }
        return new e(a11, arrayList);
    }

    @NotNull
    public static File f(@NotNull File file, @NotNull File base) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        e e11 = e(i.c(file));
        e e12 = e(i.c(base));
        String str = null;
        if (Intrinsics.d(e11.a(), e12.a())) {
            int c11 = e12.c();
            int c12 = e11.c();
            int min = Math.min(c12, c11);
            int i11 = 0;
            while (i11 < min && Intrinsics.d(e11.b().get(i11), e12.b().get(i11))) {
                i11++;
            }
            StringBuilder sb2 = new StringBuilder();
            int i12 = c11 - 1;
            if (i11 <= i12) {
                while (!Intrinsics.d(e12.b().get(i12).getName(), "..")) {
                    sb2.append("..");
                    if (i12 != i11) {
                        sb2.append(File.separatorChar);
                    }
                    if (i12 != i11) {
                        i12--;
                    }
                }
            }
            if (i11 < c12) {
                if (i11 < c11) {
                    sb2.append(File.separatorChar);
                }
                List D11 = C7714v.D(e11.b(), i11);
                String separator = File.separator;
                Intrinsics.checkNotNullExpressionValue(separator, "separator");
                C7714v.U(D11, sb2, separator, null, null, null, 124);
            }
            str = sb2.toString();
        }
        if (str != null) {
            return new File(str);
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + base + '.');
    }
}
