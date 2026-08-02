package com.google.android.datatransport.runtime.scheduling;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.datatransport.j;
import com.google.android.datatransport.runtime.backends.m;
import com.google.android.datatransport.runtime.i;
import com.google.android.datatransport.runtime.synchronization.b;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                final c cVar = (c) this.b;
                final com.google.android.datatransport.runtime.d dVar = (com.google.android.datatransport.runtime.d) this.c;
                String str = dVar.a;
                j jVar = (j) this.d;
                com.google.android.datatransport.runtime.b bVar = (com.google.android.datatransport.runtime.b) this.e;
                Logger logger = c.f;
                try {
                    m mVar = cVar.c.get(str);
                    if (mVar == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        jVar.a(new IllegalArgumentException(str2));
                    } else {
                        final com.google.android.datatransport.runtime.b a = mVar.a(bVar);
                        cVar.e.l(new b.a() { // from class: com.google.android.datatransport.runtime.scheduling.b
                            @Override // com.google.android.datatransport.runtime.synchronization.b.a
                            public final Object execute() {
                                i iVar = a;
                                c cVar2 = c.this;
                                com.google.android.datatransport.runtime.scheduling.persistence.d dVar2 = cVar2.d;
                                com.google.android.datatransport.runtime.d dVar3 = dVar;
                                dVar2.K(dVar3, iVar);
                                cVar2.a.a(dVar3, 1);
                                return null;
                            }
                        });
                        jVar.a(null);
                    }
                    break;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    jVar.a(e);
                    return;
                }
            default:
                ((WebViewClientProxyApi.WebViewClientImpl) this.b).lambda$onReceivedHttpError$5((WebView) this.c, (WebResourceRequest) this.d, (WebResourceResponse) this.e);
                break;
        }
    }
}
