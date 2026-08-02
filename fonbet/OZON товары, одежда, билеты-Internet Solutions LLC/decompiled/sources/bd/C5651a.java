package bd;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbd/a;", "Lbd/f;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bd.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5651a extends f {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5651a(File file, File file2, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        super(file, file2, str);
        file2 = (i11 & 2) != 0 ? null : file2;
        str = (i11 & 4) != 0 ? null : str;
        Intrinsics.checkNotNullParameter(file, "file");
    }
}
