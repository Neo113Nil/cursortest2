package com.csdcorp.speech_to_text;

import com.facebook.appevents.iap.o;
import com.facebook.appevents.iap.u;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
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
                b bVar = (b) this.b;
                bVar.b.error((String) this.c, (String) this.d, this.e);
                break;
            default:
                o this$0 = (o) this.b;
                Class<?> cls = this$0.n;
                Runnable completionHandler = (Runnable) this.c;
                u.b productType = (u.b) this.d;
                ArrayList productIds = (ArrayList) this.e;
                if (!com.facebook.internal.instrument.crashshield.a.b(o.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(completionHandler, "$completionHandler");
                        Intrinsics.checkNotNullParameter(productType, "$productType");
                        Intrinsics.checkNotNullParameter(productIds, "$productIds");
                        Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new o.b(this$0, new Object[]{completionHandler}));
                        Object e = this$0.e(productType, productIds);
                        if (e != null) {
                            Class<?> cls2 = this$0.b;
                            Method method = this$0.v;
                            Object obj = null;
                            if (!com.facebook.internal.instrument.crashshield.a.b(this$0)) {
                                try {
                                    obj = this$0.a;
                                } catch (Throwable th) {
                                    com.facebook.internal.instrument.crashshield.a.a(th, this$0);
                                }
                            }
                            u.d(method, cls2, obj, e, newProxyInstance);
                            break;
                        }
                    } catch (Throwable th2) {
                        com.facebook.internal.instrument.crashshield.a.a(th2, o.class);
                    }
                }
                break;
        }
    }
}
