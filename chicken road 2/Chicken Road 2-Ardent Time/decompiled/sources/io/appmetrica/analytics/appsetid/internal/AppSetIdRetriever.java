package io.appmetrica.analytics.appsetid.internal;

/* loaded from: classes.dex */
public final class AppSetIdRetriever implements io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.Object f3441a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    private final java.util.ArrayList f3442b = new java.util.ArrayList();

    public static final io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope access$convertScope(io.appmetrica.analytics.appsetid.internal.AppSetIdRetriever appSetIdRetriever, int i2) {
        appSetIdRetriever.getClass();
        return i2 != 1 ? i2 != 2 ? io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope.UNKNOWN : io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope.DEVELOPER : io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope.APP;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever
    public void retrieveAppSetId(android.content.Context context, final io.appmetrica.analytics.appsetid.internal.AppSetIdListener appSetIdListener) {
        D0.m mVar;
        o0.i iVar = new o0.i(context);
        x0.g gVar = (x0.g) iVar.f8148b;
        if (gVar.f8414j.b(gVar.f8413i, 212800000) == 0) {
            K.a aVar = new K.a();
            aVar.f942e = new m0.d[]{j0.c.f7941a};
            aVar.f941d = new f1.L();
            aVar.f940c = false;
            aVar.f939b = 27601;
            mVar = gVar.b(0, aVar.a());
        } else {
            n0.d dVar = new n0.d(new com.google.android.gms.common.api.Status(17, null, null, null));
            D0.m mVar2 = new D0.m();
            mVar2.e(dVar);
            mVar = mVar2;
        }
        Z0.h hVar = new Z0.h(29, iVar);
        mVar.getClass();
        D0.l lVar = D0.e.f195a;
        D0.m mVar3 = new D0.m();
        mVar.f214b.c(new D0.g(lVar, hVar, mVar3));
        mVar.h();
        D0.a aVar2 = new D0.a() { // from class: io.appmetrica.analytics.appsetid.internal.AppSetIdRetriever$retrieveAppSetId$onCompleteListener$1
            @Override // D0.a
            public void onComplete(com.google.android.gms.tasks.Task task) {
                java.lang.Object obj;
                java.util.List list;
                obj = io.appmetrica.analytics.appsetid.internal.AppSetIdRetriever.this.f3441a;
                io.appmetrica.analytics.appsetid.internal.AppSetIdRetriever appSetIdRetriever = io.appmetrica.analytics.appsetid.internal.AppSetIdRetriever.this;
                synchronized (obj) {
                    list = appSetIdRetriever.f3442b;
                    list.remove(this);
                }
                if (task.d()) {
                    appSetIdListener.onAppSetIdRetrieved(((j0.C0916a) task.c()).f7937a, io.appmetrica.analytics.appsetid.internal.AppSetIdRetriever.access$convertScope(io.appmetrica.analytics.appsetid.internal.AppSetIdRetriever.this, ((j0.C0916a) task.c()).f7938b));
                } else {
                    appSetIdListener.onFailure(task.b());
                }
            }
        };
        synchronized (this.f3441a) {
            this.f3442b.add(aVar2);
        }
        mVar3.f214b.c(new D0.g(lVar, aVar2));
        mVar3.h();
    }
}
