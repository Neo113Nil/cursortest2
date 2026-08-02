package C;

import T7.C4032n;
import android.content.SharedPreferences;
import com.google.crypto.tink.internal.z;
import m3.r;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import u3.InterfaceC9928b;

/* renamed from: C.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2702w implements z.a, r.a {
    public static String a(com.squareup.moshi.p pVar, StringBuilder sb2) {
        sb2.append(pVar.d());
        return sb2.toString();
    }

    public static String c(Object obj, String str, String str2) {
        return str + obj + str2;
    }

    public static StringBuilder d(long j11, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j11);
        sb2.append(str2);
        return sb2;
    }

    public static void e(SharedPreferences sharedPreferences, String str, boolean z11) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(str, z11);
        edit.apply();
    }

    public static boolean f(ProtoOneOfSignature protoOneOfSignature, kotlin.reflect.d dVar) {
        return dVar.equals(kotlin.jvm.internal.N.b(protoOneOfSignature.type()));
    }

    @Override // com.google.crypto.tink.internal.z.a
    public com.google.crypto.tink.internal.G b(S7.q qVar) {
        return U7.e.d((C4032n) qVar);
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }
}
