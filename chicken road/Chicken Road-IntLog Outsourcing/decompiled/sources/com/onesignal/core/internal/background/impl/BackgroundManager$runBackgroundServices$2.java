package com.onesignal.core.internal.background.impl;

import D4.AbstractC0024y;
import D4.E;
import D4.InterfaceC0022w;
import com.onesignal.core.internal.background.IBackgroundService;
import com.onesignal.debug.internal.logging.Logging;
import e5.g;
import f4.v;
import java.util.Iterator;
import java.util.List;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.core.internal.background.impl.BackgroundManager$runBackgroundServices$2", f = "BackgroundManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BackgroundManager$runBackgroundServices$2 extends h implements InterfaceC1445p {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BackgroundManager this$0;

    @e(c = "com.onesignal.core.internal.background.impl.BackgroundManager$runBackgroundServices$2$1", f = "BackgroundManager.kt", l = {120}, m = "invokeSuspend")
    /* renamed from: com.onesignal.core.internal.background.impl.BackgroundManager$runBackgroundServices$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends h implements InterfaceC1445p {
        Object L$0;
        int label;
        final /* synthetic */ BackgroundManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BackgroundManager backgroundManager, InterfaceC1218d interfaceC1218d) {
            super(2, interfaceC1218d);
            this.this$0 = backgroundManager;
        }

        @Override // m4.AbstractC1293a
        public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
            return new AnonymousClass1(this.this$0, interfaceC1218d);
        }

        @Override // t4.InterfaceC1445p
        public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
            return ((AnonymousClass1) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
        }

        @Override // m4.AbstractC1293a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            List list;
            Iterator it;
            EnumC1260a enumC1260a = EnumC1260a.f11058a;
            int i2 = this.label;
            if (i2 == 0) {
                g.y(obj);
                obj2 = this.this$0.lock;
                BackgroundManager backgroundManager = this.this$0;
                synchronized (obj2) {
                    backgroundManager.nextScheduledSyncTimeMs = 0L;
                }
                list = this.this$0._backgroundServices;
                it = list.iterator();
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$0;
                g.y(obj);
            }
            while (it.hasNext()) {
                IBackgroundService iBackgroundService = (IBackgroundService) it.next();
                this.L$0 = it;
                this.label = 1;
                if (iBackgroundService.backgroundRun(this) == enumC1260a) {
                    return enumC1260a;
                }
            }
            this.this$0.scheduleBackground();
            return v.f5689a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundManager$runBackgroundServices$2(BackgroundManager backgroundManager, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = backgroundManager;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        BackgroundManager$runBackgroundServices$2 backgroundManager$runBackgroundServices$2 = new BackgroundManager$runBackgroundServices$2(this.this$0, interfaceC1218d);
        backgroundManager$runBackgroundServices$2.L$0 = obj;
        return backgroundManager$runBackgroundServices$2;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((BackgroundManager$runBackgroundServices$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        InterfaceC0022w interfaceC0022w = (InterfaceC0022w) this.L$0;
        Logging.debug$default("OSBackground sync, calling initWithContext", null, 2, null);
        BackgroundManager backgroundManager = this.this$0;
        backgroundManager.backgroundSyncJob = AbstractC0024y.n(interfaceC0022w, E.f460b, 0, new AnonymousClass1(backgroundManager, null), 2);
        return v.f5689a;
    }
}
