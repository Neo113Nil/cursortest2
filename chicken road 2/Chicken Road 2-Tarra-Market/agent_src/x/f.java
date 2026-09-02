package x;

import L0.l;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import p.AbstractC0819i;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6765a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6766b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6767c;

    /* renamed from: d, reason: collision with root package name */
    public final j f6768d;

    public f(Object value, String str, C0856a c0856a, int i2) {
        Collection collection;
        kotlin.jvm.internal.j.e(value, "value");
        C0.g.i(i2, "verificationMode");
        this.f6765a = value;
        this.f6766b = str;
        this.f6767c = i2;
        String message = g.b(value, str);
        kotlin.jvm.internal.j.e(message, "message");
        j jVar = new j(message);
        StackTraceElement[] stackTrace = jVar.getStackTrace();
        kotlin.jvm.internal.j.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(("Requested element count " + length + " is less than zero.").toString());
        }
        if (length == 0) {
            collection = l.f214a;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collection = L0.c.Q(stackTrace);
            } else if (length == 1) {
                collection = V.a.p(stackTrace[length2 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i3 = length2 - length; i3 < length2; i3++) {
                    arrayList.add(stackTrace[i3]);
                }
                collection = arrayList;
            }
        }
        jVar.setStackTrace((StackTraceElement[]) collection.toArray(new StackTraceElement[0]));
        this.f6768d = jVar;
    }

    @Override // x.g
    public final Object a() {
        int c2 = AbstractC0819i.c(this.f6767c);
        if (c2 == 0) {
            throw this.f6768d;
        }
        if (c2 != 1) {
            if (c2 == 2) {
                return null;
            }
            throw new H.a();
        }
        String message = g.b(this.f6765a, this.f6766b);
        kotlin.jvm.internal.j.e(message, "message");
        Log.d("f", message);
        return null;
    }

    @Override // x.g
    public final g d(String str, U0.l lVar) {
        return this;
    }
}
