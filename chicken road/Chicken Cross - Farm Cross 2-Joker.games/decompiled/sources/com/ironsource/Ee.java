package com.ironsource;

import android.content.Context;
import com.ironsource.Te;

/* loaded from: classes6.dex */
public interface Ee {
    static /* synthetic */ void a(Ee ee, Runnable runnable, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postOnUIThread");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        ee.a(runnable, j);
    }

    Te a(Context context, String str);

    InterfaceC4673u7 a();

    String a(Context context);

    void a(long j, Te.a aVar);

    void a(Be be);

    void a(D1 d1);

    void a(Runnable runnable);

    void a(Runnable runnable, long j);

    void a(String str, String str2);

    void b();

    void b(Runnable runnable);

    boolean b(Context context);

    C4293aa c();

    String c(Context context);

    void c(Runnable runnable);

    void d(Runnable runnable);

    boolean d();

    void e();

    void f();

    T9 g();
}
