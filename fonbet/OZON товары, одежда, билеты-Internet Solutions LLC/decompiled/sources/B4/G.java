package B4;

import E0.C2942q;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f2503a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2504b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2505c;

    public G(Uri uri, String str, String str2) {
        this.f2503a = uri;
        this.f2504b = str;
        this.f2505c = str2;
    }

    public final String a() {
        return this.f2504b;
    }

    public final String b() {
        return this.f2505c;
    }

    public final Uri c() {
        return this.f2503a;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavDeepLinkRequest{");
        Uri uri = this.f2503a;
        if (uri != null) {
            sb2.append(" uri=");
            sb2.append(String.valueOf(uri));
        }
        String str = this.f2504b;
        if (str != null) {
            sb2.append(" action=");
            sb2.append(str);
        }
        String str2 = this.f2505c;
        if (str2 != null) {
            sb2.append(" mimetype=");
            sb2.append(str2);
        }
        return C2942q.c(sb2, " }", "sb.toString()");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public G(@NotNull Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        Intrinsics.checkNotNullParameter(intent, "intent");
    }
}
