package A0;

import K0.C0201f;
import K0.C0203h;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import e2.C1930k;
import java.util.List;

/* renamed from: A0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036j implements E0 {

    /* renamed from: a, reason: collision with root package name */
    public final ClipboardManager f514a;

    public C0036j(Context context) {
        Object systemService = context.getSystemService("clipboard");
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.content.ClipboardManager", systemService);
        this.f514a = (ClipboardManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(C0203h c0203h) {
        List list = X3.v.f6090k;
        List list2 = c0203h.f2830m;
        boolean isEmpty = (list2 == null ? list : list2).isEmpty();
        String str = c0203h.f2829l;
        if (!isEmpty) {
            SpannableString spannableString = new SpannableString(str);
            C1930k c1930k = new C1930k(2, false);
            c1930k.f16910l = Parcel.obtain();
            if (list2 != null) {
                list = list2;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C0201f c0201f = (C0201f) list.get(i);
                K0.G g5 = (K0.G) c0201f.f2823a;
                ((Parcel) c1930k.f16910l).recycle();
                c1930k.f16910l = Parcel.obtain();
                long b3 = g5.f2764a.b();
                long j5 = i0.p.f17293g;
                byte b5 = 1;
                if (!i0.p.c(b3, j5)) {
                    c1930k.e((byte) 1);
                    c1930k.j(g5.f2764a.b());
                }
                long j6 = W0.o.f6021c;
                long j7 = g5.f2765b;
                if (!W0.o.a(j7, j6)) {
                    c1930k.e((byte) 2);
                    c1930k.i(j7);
                }
                O0.l lVar = g5.f2766c;
                if (lVar != null) {
                    c1930k.e((byte) 3);
                    ((Parcel) c1930k.f16910l).writeInt(lVar.f4033k);
                }
                O0.j jVar = g5.f2767d;
                if (jVar != null) {
                    c1930k.e((byte) 4);
                    int i5 = jVar.f4024a;
                    c1930k.e((i5 != 0 && i5 == 1) ? (byte) 1 : (byte) 0);
                }
                O0.k kVar = g5.f2768e;
                if (kVar != null) {
                    c1930k.e((byte) 5);
                    int i6 = kVar.f4025a;
                    if (i6 != 0) {
                        if (i6 != 65535) {
                            if (i6 == 1) {
                                b5 = 2;
                            } else if (i6 == 2) {
                                b5 = 3;
                            }
                        }
                        c1930k.e(b5);
                    }
                    b5 = 0;
                    c1930k.e(b5);
                }
                String str2 = g5.f2769g;
                if (str2 != null) {
                    c1930k.e((byte) 6);
                    ((Parcel) c1930k.f16910l).writeString(str2);
                }
                long j8 = g5.f2770h;
                if (!W0.o.a(j8, j6)) {
                    c1930k.e((byte) 7);
                    c1930k.i(j8);
                }
                V0.a aVar = g5.i;
                if (aVar != null) {
                    c1930k.e((byte) 8);
                    c1930k.f(aVar.f5925a);
                }
                V0.p pVar = g5.f2771j;
                if (pVar != null) {
                    c1930k.e((byte) 9);
                    c1930k.f(pVar.f5951a);
                    c1930k.f(pVar.f5952b);
                }
                long j9 = g5.f2773l;
                if (!i0.p.c(j9, j5)) {
                    c1930k.e((byte) 10);
                    c1930k.j(j9);
                }
                V0.l lVar2 = g5.f2774m;
                if (lVar2 != null) {
                    c1930k.e((byte) 11);
                    ((Parcel) c1930k.f16910l).writeInt(lVar2.f5947a);
                }
                i0.I i7 = g5.f2775n;
                if (i7 != null) {
                    c1930k.e((byte) 12);
                    c1930k.j(i7.f17245a);
                    long j10 = i7.f17246b;
                    c1930k.f(Float.intBitsToFloat((int) (j10 >> 32)));
                    c1930k.f(Float.intBitsToFloat((int) (j10 & 4294967295L)));
                    c1930k.f(i7.f17247c);
                }
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) c1930k.f16910l).marshall(), 0)), c0201f.f2824b, c0201f.f2825c, 33);
            }
            str = spannableString;
        }
        this.f514a.setPrimaryClip(ClipData.newPlainText("plain text", str));
    }
}
