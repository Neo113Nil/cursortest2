package com.onesignal.location.internal.controller.impl;

import D4.InterfaceC0022w;
import E1.c;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.location.internal.controller.impl.GmsLocationController;
import e5.g;
import f4.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import l.q0;
import l1.f;
import l4.EnumC1260a;
import m1.InterfaceC1276c;
import m4.e;
import m4.h;
import n1.C1337x;
import n1.X;
import o1.u;
import r.C1392b;
import r.C1397g;
import r.C1398h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.location.internal.controller.impl.GmsLocationController$start$2$1$2", f = "GmsLocationController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class GmsLocationController$start$2$1$2 extends h implements InterfaceC1445p {
    final /* synthetic */ s $self;
    final /* synthetic */ q $wasSuccessful;
    int label;
    final /* synthetic */ GmsLocationController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GmsLocationController$start$2$1$2(s sVar, GmsLocationController gmsLocationController, q qVar, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.$self = sVar;
        this.this$0 = gmsLocationController;
        this.$wasSuccessful = qVar;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new GmsLocationController$start$2$1$2(this.$self, this.this$0, this.$wasSuccessful, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((GmsLocationController$start$2$1$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        IApplicationService iApplicationService;
        GmsLocationController.LocationHandlerThread locationHandlerThread;
        Location location;
        IApplicationService iApplicationService2;
        IFusedLocationApiWrapper iFusedLocationApiWrapper;
        IFusedLocationApiWrapper iFusedLocationApiWrapper2;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        GmsLocationController.GoogleApiClientListener googleApiClientListener = new GmsLocationController.GoogleApiClientListener((GmsLocationController) this.$self.f10741a);
        iApplicationService = this.this$0._applicationService;
        Context appContext = iApplicationService.getAppContext();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        C1392b c1392b = new C1392b();
        C1392b c1392b2 = new C1392b();
        Object obj2 = f.f11009c;
        E1.f fVar = F1.b.f675a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        appContext.getMainLooper();
        String packageName = appContext.getPackageName();
        String name = appContext.getClass().getName();
        m1.e eVar = c.f641a;
        u.h(eVar, "Api must not be null");
        Object obj3 = null;
        c1392b2.put(eVar, null);
        u.h(eVar.f11123a, "Base client builder must not be null");
        List emptyList = Collections.emptyList();
        hashSet2.addAll(emptyList);
        hashSet.addAll(emptyList);
        arrayList.add(googleApiClientListener);
        arrayList2.add(googleApiClientListener);
        locationHandlerThread = this.this$0.locationHandlerThread;
        Handler mHandler = locationHandlerThread.getMHandler();
        u.h(mHandler, "Handler must not be null");
        Looper looper = mHandler.getLooper();
        boolean z = true;
        u.a("must call addApi() to add at least one API", !c1392b2.isEmpty());
        F1.a aVar = F1.a.f674b;
        m1.e eVar2 = F1.b.f676b;
        if (c1392b2.containsKey(eVar2)) {
            aVar = (F1.a) c1392b2.getOrDefault(eVar2, null);
        }
        q0 q0Var = new q0(hashSet, c1392b, packageName, name, aVar);
        Map map = (Map) q0Var.f10943c;
        C1392b c1392b3 = new C1392b();
        C1392b c1392b4 = new C1392b();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ((C1398h) c1392b2.keySet()).iterator();
        while (true) {
            C1397g c1397g = (C1397g) it;
            if (!c1397g.hasNext()) {
                break;
            }
            m1.e eVar3 = (m1.e) c1397g.next();
            Object orDefault = c1392b2.getOrDefault(eVar3, obj3);
            boolean z5 = map.get(eVar3) != null ? z : false;
            c1392b3.put(eVar3, Boolean.valueOf(z5));
            X x5 = new X(eVar3, z5);
            arrayList3.add(x5);
            g gVar = eVar3.f11123a;
            u.g(gVar);
            C1392b c1392b5 = c1392b4;
            InterfaceC1276c f3 = gVar.f(appContext, looper, q0Var, orDefault, x5, x5);
            c1392b5.put(eVar3.f11124b, f3);
            f3.getClass();
            c1392b4 = c1392b5;
            c1392b3 = c1392b3;
            arrayList3 = arrayList3;
            map = map;
            z = true;
            obj3 = null;
        }
        C1392b c1392b6 = c1392b4;
        C1337x c1337x = new C1337x(appContext, new ReentrantLock(), looper, q0Var, c1392b3, arrayList, arrayList2, c1392b6, -1, C1337x.g(c1392b6.values(), true), arrayList3);
        Set set = GoogleApiClient.f4971a;
        synchronized (set) {
            set.add(c1337x);
        }
        GoogleApiClientCompatProxy googleApiClientCompatProxy = new GoogleApiClientCompatProxy(c1337x);
        l1.b blockingConnect = googleApiClientCompatProxy.blockingConnect();
        if (blockingConnect == null || !blockingConnect.b()) {
            StringBuilder sb = new StringBuilder("GMSLocationController connection to GoogleApiService failed: (");
            sb.append(blockingConnect != null ? new Integer(blockingConnect.f11000b) : null);
            sb.append(") ");
            sb.append(blockingConnect != null ? blockingConnect.f11002d : null);
            Logging.debug$default(sb.toString(), null, 2, null);
        } else {
            location = this.this$0.lastLocation;
            if (location == null) {
                iFusedLocationApiWrapper2 = this.this$0._fusedLocationApiWrapper;
                Location lastLocation = iFusedLocationApiWrapper2.getLastLocation(c1337x);
                if (lastLocation != null) {
                    this.this$0.setLocationAndFire(lastLocation);
                }
            }
            GmsLocationController gmsLocationController = (GmsLocationController) this.$self.f10741a;
            iApplicationService2 = this.this$0._applicationService;
            GmsLocationController gmsLocationController2 = (GmsLocationController) this.$self.f10741a;
            GoogleApiClient realInstance = googleApiClientCompatProxy.getRealInstance();
            iFusedLocationApiWrapper = this.this$0._fusedLocationApiWrapper;
            gmsLocationController.locationUpdateListener = new GmsLocationController.LocationUpdateListener(iApplicationService2, gmsLocationController2, realInstance, iFusedLocationApiWrapper);
            ((GmsLocationController) this.$self.f10741a).googleApiClient = googleApiClientCompatProxy;
            this.$wasSuccessful.f10739a = true;
        }
        return v.f5689a;
    }
}
