package A6;

import Sc.s;
import android.net.Uri;
import android.util.Base64;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.Scopes;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import z6.C10992a;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f501a = new a();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object c(a aVar, String str, C10992a c10992a, String str2, c cVar) {
        b bVar;
        int i11;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i12 = bVar.f505g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f505g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f503e;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f505g;
                if (i11 != 0) {
                    s.b(obj);
                    C10992a a11 = C10992a.a(c10992a, C7714v.a0(Scopes.OPEN_ID));
                    bVar.f502d = str2;
                    bVar.f505g = 1;
                    obj = aVar.a(str, a11);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = bVar.f502d;
                    s.b(obj);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append((String) obj);
                sb2.append("&access_type=offline");
                Intrinsics.checkNotNullParameter(str2, "<this>");
                Charset charset = Charsets.UTF_8;
                byte[] bytes = str2.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                String encodeToString = Base64.encodeToString(bytes, 2);
                Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(this.toByteArray(), Base64.NO_WRAP)");
                Intrinsics.checkNotNullParameter(encodeToString, "<this>");
                String encodeToUrl = URLEncoder.encode(encodeToString, charset.toString());
                Intrinsics.checkNotNullExpressionValue(encodeToUrl, "encodeToUrl");
                sb2.append("&permissions=" + encodeToUrl);
                String sb3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
                return sb3;
            }
        }
        bVar = new b(aVar, cVar);
        Object obj3 = bVar.f503e;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f505g;
        if (i11 != 0) {
        }
        StringBuilder sb22 = new StringBuilder();
        sb22.append((String) obj3);
        sb22.append("&access_type=offline");
        Intrinsics.checkNotNullParameter(str2, "<this>");
        Charset charset2 = Charsets.UTF_8;
        byte[] bytes2 = str2.getBytes(charset2);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        String encodeToString2 = Base64.encodeToString(bytes2, 2);
        Intrinsics.checkNotNullExpressionValue(encodeToString2, "encodeToString(this.toByteArray(), Base64.NO_WRAP)");
        Intrinsics.checkNotNullParameter(encodeToString2, "<this>");
        String encodeToUrl2 = URLEncoder.encode(encodeToString2, charset2.toString());
        Intrinsics.checkNotNullExpressionValue(encodeToUrl2, "encodeToUrl");
        sb22.append("&permissions=" + encodeToUrl2);
        String sb32 = sb22.toString();
        Intrinsics.checkNotNullExpressionValue(sb32, "StringBuilder().apply(builderAction).toString()");
        return sb32;
    }

    public final String a(@NotNull String str, @NotNull C10992a c10992a) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str + "aas/delegate?");
        sb2.append("client_id=" + c10992a.b());
        sb2.append("&client_secret=" + c10992a.c());
        sb2.append("&redirect_uri=" + Uri.encode(c10992a.d()));
        sb2.append("&scope=" + C7714v.V(c10992a.e(), "+", null, null, null, 62));
        sb2.append("&response_type=code");
        sb2.append("&state=" + c10992a.f());
        sb2.append("&timestamp=" + h.X(h.X(c10992a.g(), "+", "%2B", false), " ", "+", false));
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final Object b(@NotNull String str, @NotNull C10992a c10992a, @NotNull String str2, @NotNull d dVar) {
        return c(this, str, c10992a, str2, (c) dVar);
    }
}
