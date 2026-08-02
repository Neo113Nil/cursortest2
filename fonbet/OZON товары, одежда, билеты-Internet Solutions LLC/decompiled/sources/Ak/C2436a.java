package Ak;

import GZ.j;
import android.content.Context;
import j3.t;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import m3.r;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import u3.InterfaceC9928b;

/* renamed from: Ak.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C2436a implements r.a {
    public /* synthetic */ C2436a(InterfaceC9928b.a aVar, t tVar) {
    }

    public static String a(Context context, String str, j jVar, String str2) {
        Intrinsics.checkNotNullParameter(context, str);
        Intrinsics.checkNotNullParameter(jVar, str2);
        return jVar.b().toString();
    }

    public static String b(String str, List list, String str2, String str3, List list2) {
        return str + list + str2 + list2 + str3;
    }

    public static StringBuilder c(long j11, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j11);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder d(String str, String str2, String str3, String str4, TextAtom textAtom) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(textAtom);
        sb2.append(str4);
        return sb2;
    }

    public static void e(String str, String str2, StringBuilder sb2, boolean z11, boolean z12) {
        sb2.append(str);
        sb2.append(z11);
        sb2.append(str2);
        sb2.append(z12);
    }

    public static void f(StringBuilder sb2, Float f7, String str, List list, String str2) {
        sb2.append(f7);
        sb2.append(str);
        sb2.append(list);
        sb2.append(str2);
    }

    public static /* synthetic */ boolean g(AtomicReference atomicReference, Throwable th2, Throwable th3) {
        while (!atomicReference.compareAndSet(th2, th3)) {
            if (atomicReference.get() != th2) {
                return false;
            }
        }
        return true;
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }
}
