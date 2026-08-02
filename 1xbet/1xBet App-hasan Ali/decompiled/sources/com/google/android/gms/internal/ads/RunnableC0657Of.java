package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import s3.BinderC2361b;

/* renamed from: com.google.android.gms.internal.ads.Of, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0657Of implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10952k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BinderC0671Qf f10953l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Runnable f10954m;

    public /* synthetic */ RunnableC0657Of(BinderC0671Qf binderC0671Qf, Runnable runnable, int i) {
        this.f10952k = i;
        this.f10953l = binderC0671Qf;
        this.f10954m = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Yq yq;
        switch (this.f10952k) {
            case 0:
                BinderC0671Qf binderC0671Qf = this.f10953l;
                binderC0671Qf.getClass();
                m3.v.c("Adapters must be initialized on the main thread.");
                HashMap hashMap = P2.o.f4767B.f4774g.d().t().f7596c;
                if (hashMap.isEmpty()) {
                    return;
                }
                Runnable runnable = this.f10954m;
                if (runnable != null) {
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        U2.j.j("Could not initialize rewarded ads.", th);
                        return;
                    }
                }
                if (((InterfaceC0624Ka) ((AtomicReference) binderC0671Qf.f11209m.f13161a.f13188n).get()) != null) {
                    HashMap hashMap2 = new HashMap();
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        for (C0589Fa c0589Fa : ((C0596Ga) it.next()).f9189a) {
                            String str = c0589Fa.f8952b;
                            for (String str2 : c0589Fa.f8951a) {
                                if (!hashMap2.containsKey(str2)) {
                                    hashMap2.put(str2, new ArrayList());
                                }
                                if (str != null) {
                                    ((List) hashMap2.get(str2)).add(str);
                                }
                            }
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : hashMap2.entrySet()) {
                        String str3 = (String) entry.getKey();
                        try {
                            C1394on a5 = binderC0671Qf.f11210n.a(str3, jSONObject);
                            if (a5 != null) {
                                C0950er c0950er = (C0950er) a5.f14849b;
                                boolean a6 = c0950er.a();
                                InterfaceC0638Ma interfaceC0638Ma = c0950er.f13363a;
                                if (!a6) {
                                    try {
                                        if (interfaceC0638Ma.G()) {
                                            try {
                                                interfaceC0638Ma.R1(new BinderC2361b(binderC0671Qf.f11207k), (In) a5.f14850c, (List) entry.getValue());
                                                U2.j.d("Initialized rewarded video mediation adapter " + str3);
                                            } finally {
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } catch (Yq e3) {
                            U2.j.j("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e3);
                        }
                    }
                    return;
                }
                return;
            default:
                AbstractC0613Id.f.execute(new RunnableC0657Of(this.f10953l, this.f10954m, 0));
                return;
        }
    }
}
