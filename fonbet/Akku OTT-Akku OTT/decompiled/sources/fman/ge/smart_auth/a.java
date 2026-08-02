package fman.ge.smart_auth;

import android.content.ContextWrapper;
import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAppSignatueHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSignatueHelper.kt\nfman/ge/smart_auth/AppSignatureHelper\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,78:1\n18#2:79\n12021#3,10:80\n14048#3:90\n14049#3:92\n12031#3:93\n1#4:91\n1661#5,3:94\n*S KotlinDebug\n*F\n+ 1 AppSignatueHelper.kt\nfman/ge/smart_auth/AppSignatureHelper\n*L\n45#1:79\n45#1:80,10\n45#1:90\n45#1:92\n45#1:93\n45#1:91\n46#1:94,3\n*E\n"})
/* loaded from: classes4.dex */
public final class a extends ContextWrapper {
    public static final C0148a Companion = new C0148a();

    /* renamed from: fman.ge.smart_auth.a$a, reason: collision with other inner class name */
    public static final class C0148a {
    }

    static {
        Intrinsics.checkNotNullExpressionValue(a.class.getSimpleName(), "getSimpleName(...)");
    }

    public static String a(String str, String str2) {
        String b = android.support.v4.media.session.f.b(str, " ", str2);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = b.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            Intrinsics.checkNotNull(digest);
            String encodeToString = Base64.encodeToString(ArraysKt.copyOfRange(digest, 0, 9), 3);
            Intrinsics.checkNotNull(encodeToString);
            String substring = encodeToString.substring(0, 11);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
