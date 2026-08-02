package p4;

import q4.C2313c;

/* renamed from: p4.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2284y {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC2259A f18836a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [q4.c] */
    /* JADX WARN: Type inference failed for: r0v7, types: [p4.x] */
    /* JADX WARN: Type inference failed for: r0v8, types: [p4.A] */
    /* JADX WARN: Type inference failed for: r0v9, types: [p4.x] */
    static {
        String str;
        ?? r02;
        int i = u4.s.f20115a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            w4.e eVar = D.f18743a;
            r02 = u4.m.f20109a;
            C2313c c2313c = r02.f18897p;
            if (!(r02 != 0)) {
                r02 = RunnableC2283x.f18834t;
            }
        } else {
            r02 = RunnableC2283x.f18834t;
        }
        f18836a = r02;
    }
}
