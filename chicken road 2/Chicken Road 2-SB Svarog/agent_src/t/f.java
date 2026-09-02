package t;

import F.AbstractC0010k;
import X.m;
import android.util.Log;
import f0.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import o.AbstractC0071c;

/* loaded from: classes.dex */
public final class f extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1260a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1261b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1262c;

    /* renamed from: d, reason: collision with root package name */
    public final j f1263d;

    public f(Object obj, String str, C0090a c0090a, int i2) {
        Collection collection;
        g0.h.e(obj, "value");
        AbstractC0010k.f("verificationMode", i2);
        this.f1260a = obj;
        this.f1261b = str;
        this.f1262c = i2;
        String b2 = h.b(obj, str);
        g0.h.e(b2, "message");
        j jVar = new j(b2);
        StackTraceElement[] stackTrace = jVar.getStackTrace();
        g0.h.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(("Requested element count " + length + " is less than zero.").toString());
        }
        if (length != 0) {
            int length2 = stackTrace.length;
            if (length >= length2) {
                int length3 = stackTrace.length;
                if (length3 != 0) {
                    if (length3 != 1) {
                        collection = new ArrayList(new X.b(stackTrace, false));
                    } else {
                        collection = Collections.singletonList(stackTrace[0]);
                        g0.h.d(collection, "singletonList(...)");
                    }
                }
            } else if (length == 1) {
                collection = Collections.singletonList(stackTrace[length2 - 1]);
                g0.h.d(collection, "singletonList(...)");
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i3 = length2 - length; i3 < length2; i3++) {
                    arrayList.add(stackTrace[i3]);
                }
                collection = arrayList;
            }
            jVar.setStackTrace((StackTraceElement[]) collection.toArray(new StackTraceElement[0]));
            this.f1263d = jVar;
        }
        collection = m.f402b;
        jVar.setStackTrace((StackTraceElement[]) collection.toArray(new StackTraceElement[0]));
        this.f1263d = jVar;
    }

    @Override // t.h
    public final Object a() {
        int a2 = AbstractC0071c.a(this.f1262c);
        if (a2 == 0) {
            throw this.f1263d;
        }
        if (a2 != 1) {
            if (a2 == 2) {
                return null;
            }
            throw new C.c();
        }
        String b2 = h.b(this.f1260a, this.f1261b);
        g0.h.e(b2, "message");
        Log.d("g", b2);
        return null;
    }

    @Override // t.h
    public final h d(String str, l lVar) {
        return this;
    }
}
