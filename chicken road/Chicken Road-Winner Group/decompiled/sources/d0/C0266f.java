package d0;

import android.util.Log;
import e2.AbstractC0290e;
import e2.o;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.j;
import o2.l;

/* renamed from: d0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0266f extends X0.a {

    /* renamed from: g, reason: collision with root package name */
    public final Object f4831g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4832h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4833i;

    /* renamed from: j, reason: collision with root package name */
    public final i f4834j;

    public C0266f(Object value, String str, C0261a c0261a, int i3) {
        Collection collection;
        j.e(value, "value");
        B0.c.m(i3, "verificationMode");
        this.f4831g = value;
        this.f4832h = str;
        this.f4833i = i3;
        String message = X0.a.o(value, str);
        j.e(message, "message");
        i iVar = new i(message);
        StackTraceElement[] stackTrace = iVar.getStackTrace();
        j.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(B0.c.i(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            collection = o.f4877a;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collection = AbstractC0290e.Z(stackTrace);
            } else if (length == 1) {
                collection = X0.a.z(stackTrace[length2 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i4 = length2 - length; i4 < length2; i4++) {
                    arrayList.add(stackTrace[i4]);
                }
                collection = arrayList;
            }
        }
        iVar.setStackTrace((StackTraceElement[]) collection.toArray(new StackTraceElement[0]));
        this.f4834j = iVar;
    }

    @Override // X0.a
    public final Object k() {
        int b3 = M.j.b(this.f4833i);
        if (b3 == 0) {
            throw this.f4834j;
        }
        if (b3 != 1) {
            if (b3 == 2) {
                return null;
            }
            throw new T0.b();
        }
        String message = X0.a.o(this.f4831g, this.f4832h);
        j.e(message, "message");
        Log.d("f", message);
        return null;
    }

    @Override // X0.a
    public final X0.a E(String str, l lVar) {
        return this;
    }
}
