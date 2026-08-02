package U0;

import A1.W;
import C1.q;
import W5.AbstractC0486a1;
import Y4.D;
import android.util.Log;
import e1.k;
import g6.AbstractC1158g;
import g6.C1167p;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6384a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6385b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6386c;

    /* renamed from: d, reason: collision with root package name */
    public final q f6387d;

    public f(Object obj, String str, a aVar, int i7) {
        Collection collection;
        t6.h.e(obj, "value");
        k.o(i7, "verificationMode");
        this.f6384a = obj;
        this.f6385b = str;
        this.f6386c = i7;
        String b7 = g.b(obj, str);
        t6.h.e(b7, "message");
        q qVar = new q(b7);
        StackTraceElement[] stackTrace = qVar.getStackTrace();
        t6.h.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC0486a1.f(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            collection = C1167p.f13302a;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collection = AbstractC1158g.w0(stackTrace);
            } else if (length == 1) {
                collection = D.D(stackTrace[length2 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i8 = length2 - length; i8 < length2; i8++) {
                    arrayList.add(stackTrace[i8]);
                }
                collection = arrayList;
            }
        }
        qVar.setStackTrace((StackTraceElement[]) collection.toArray(new StackTraceElement[0]));
        this.f6387d = qVar;
    }

    @Override // U0.g
    public final Object a() {
        int e7 = t.e.e(this.f6386c);
        if (e7 == 0) {
            throw this.f6387d;
        }
        if (e7 != 1) {
            if (e7 == 2) {
                return null;
            }
            throw new W();
        }
        String b7 = g.b(this.f6384a, this.f6385b);
        t6.h.e(b7, "message");
        Log.d("f", b7);
        return null;
    }

    @Override // U0.g
    public final g d(String str, Function1 function1) {
        return this;
    }
}
