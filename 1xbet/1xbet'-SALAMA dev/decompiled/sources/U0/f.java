package U0;

import A1.W;
import C1.q;
import W5.AbstractC0486a1;
import Y4.D;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import p031e1.k;
import p050g6.p;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f6387d;

    public f(Object obj, String str, a aVar, int i7) {
        Collection collectionD;
        t6.h.e(obj, "value");
        k.o(i7, "verificationMode");
        this.f6384a = obj;
        this.f6385b = str;
        this.f6386c = i7;
        String strB = g.b(obj, str);
        t6.h.e(strB, "message");
        q qVar = new q(strB);
        StackTraceElement[] stackTrace = qVar.getStackTrace();
        t6.h.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC0486a1.f(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            collectionD = p.f13308a;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collectionD = p050g6.g.w0(stackTrace);
            } else if (length == 1) {
                collectionD = D.D(stackTrace[length2 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i8 = length2 - length; i8 < length2; i8++) {
                    arrayList.add(stackTrace[i8]);
                }
                collectionD = arrayList;
            }
        }
        qVar.setStackTrace((StackTraceElement[]) collectionD.toArray(new StackTraceElement[0]));
        this.f6387d = qVar;
    }

    @Override // U0.g
    public final Object a() throws q {
        int iE = p136t.e.e(this.f6386c);
        if (iE == 0) {
            throw this.f6387d;
        }
        if (iE != 1) {
            if (iE == 2) {
                return null;
            }
            throw new W();
        }
        String strB = g.b(this.f6384a, this.f6385b);
        t6.h.e(strB, "message");
        Log.d("f", strB);
        return null;
    }

    @Override // U0.g
    public final g d(String str, Function1 function1) {
        return this;
    }
}
