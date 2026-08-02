package T7;

import android.net.Uri;
import com.google.crypto.tink.internal.B;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: T7.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4029k implements B.b {
    public static Uri a(String str, String str2, String str3, String str4) {
        Uri build = new Uri.Builder().scheme(str).authority(str2).appendPath(str3).build();
        Intrinsics.checkNotNullExpressionValue(build, str4);
        return build;
    }

    @Override // com.google.crypto.tink.internal.B.b
    public Object e(He.g gVar) {
        return i8.c.c((C4028j) gVar);
    }
}
