package Ke0;

import V.e;
import java.security.MessageDigest;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: Ke0.a$a, reason: collision with other inner class name */
    static final class C0304a extends AbstractC7737t implements Function1<Byte, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0304a f15944b = new C0304a(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Byte b11) {
            return e.b(new Object[]{Byte.valueOf(b11.byteValue())}, 1, "%02x", "format(...)");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r3 == null) goto L6;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(String str) {
        byte[] bArr;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        if (str != null) {
            bArr = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bArr, "getBytes(...)");
        }
        bArr = new byte[0];
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
        return C7705l.O(digest, "", C0304a.f15944b, 30);
    }
}
