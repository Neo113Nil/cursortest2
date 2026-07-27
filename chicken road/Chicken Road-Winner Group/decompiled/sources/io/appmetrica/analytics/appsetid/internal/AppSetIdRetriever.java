package io.appmetrica.analytics.appsetid.internal;

import M0.a;
import V1.b;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import i1.AbstractC0336f;
import i1.C0337g;
import i1.C0341k;
import i1.InterfaceC0332b;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class AppSetIdRetriever implements IAppSetIdRetriever {

    /* renamed from: a, reason: collision with root package name */
    private final Object f5139a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f5140b = new ArrayList();

    public static final AppSetIdScope access$convertScope(AppSetIdRetriever appSetIdRetriever, int i3) {
        appSetIdRetriever.getClass();
        return i3 != 1 ? i3 != 2 ? AppSetIdScope.UNKNOWN : AppSetIdScope.DEVELOPER : AppSetIdScope.APP;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever
    public void retrieveAppSetId(Context context, final AppSetIdListener appSetIdListener) throws Throwable {
        C0341k t3 = new b(context).t();
        InterfaceC0332b interfaceC0332b = new InterfaceC0332b() { // from class: io.appmetrica.analytics.appsetid.internal.AppSetIdRetriever$retrieveAppSetId$onCompleteListener$1
            @Override // i1.InterfaceC0332b
            public void onComplete(Task task) {
                Object obj;
                List list;
                obj = AppSetIdRetriever.this.f5139a;
                AppSetIdRetriever appSetIdRetriever = AppSetIdRetriever.this;
                synchronized (obj) {
                    list = appSetIdRetriever.f5140b;
                    list.remove(this);
                }
                if (task.c()) {
                    appSetIdListener.onAppSetIdRetrieved(((a) task.b()).f963a, AppSetIdRetriever.access$convertScope(AppSetIdRetriever.this, ((a) task.b()).f964b));
                } else {
                    appSetIdListener.onFailure(task.a());
                }
            }
        };
        synchronized (this.f5139a) {
            this.f5140b.add(interfaceC0332b);
        }
        t3.f5023b.d(new C0337g(AbstractC0336f.f5012a, interfaceC0332b));
        t3.g();
    }
}
