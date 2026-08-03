package com.ironsource;

/* loaded from: classes5.dex */
public interface Ge {

    /* renamed from: com.ironsource.Ge$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ void a(com.ironsource.Ge ge, java.lang.Runnable runnable, long j, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postOnUIThread");
            }
            if ((i & 2) != 0) {
                j = 0;
            }
            ge.a(runnable, j);
        }

        public static /* synthetic */ void a(com.ironsource.Ge ge, com.ironsource.AbstractRunnableC3136ke abstractRunnableC3136ke, long j, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
            }
            if ((i & 2) != 0) {
                j = 0;
            }
            ge.a(abstractRunnableC3136ke, j);
        }
    }

    com.ironsource.Ve a(android.content.Context context, java.lang.String str);

    com.ironsource.InterfaceC3362x7 a();

    java.lang.String a(android.content.Context context);

    void a(long j, com.ironsource.Ve.a aVar);

    void a(com.ironsource.De de);

    void a(com.ironsource.F1 f1);

    void a(com.ironsource.AbstractRunnableC3136ke abstractRunnableC3136ke);

    void a(com.ironsource.AbstractRunnableC3136ke abstractRunnableC3136ke, long j);

    void a(java.lang.Runnable runnable);

    void a(java.lang.Runnable runnable, long j);

    void a(java.lang.String str, java.lang.String str2);

    void b();

    void b(java.lang.Runnable runnable);

    boolean b(android.content.Context context);

    com.ironsource.C2953aa c();

    java.lang.String c(android.content.Context context);

    void c(java.lang.Runnable runnable);

    void d(java.lang.Runnable runnable);

    boolean d();

    void e();

    void e(java.lang.Runnable runnable);

    void f();

    com.ironsource.T9 g();
}
