package com.onesignal.common.threading;

import D4.AbstractC0024y;
import D4.E;
import D4.InterfaceC0022w;
import I4.o;
import K4.d;
import com.onesignal.debug.internal.logging.Logging;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.common.threading.ThreadUtilsKt$suspendifyOnMain$1", f = "ThreadUtils.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ThreadUtilsKt$suspendifyOnMain$1 extends h implements InterfaceC1441l {
    final /* synthetic */ InterfaceC1441l $block;
    int label;

    @e(c = "com.onesignal.common.threading.ThreadUtilsKt$suspendifyOnMain$1$1", f = "ThreadUtils.kt", l = {36}, m = "invokeSuspend")
    /* renamed from: com.onesignal.common.threading.ThreadUtilsKt$suspendifyOnMain$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends h implements InterfaceC1445p {
        final /* synthetic */ InterfaceC1441l $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC1441l interfaceC1441l, InterfaceC1218d interfaceC1218d) {
            super(2, interfaceC1218d);
            this.$block = interfaceC1441l;
        }

        @Override // m4.AbstractC1293a
        public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
            return new AnonymousClass1(this.$block, interfaceC1218d);
        }

        @Override // t4.InterfaceC1445p
        public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
            return ((AnonymousClass1) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
        }

        @Override // m4.AbstractC1293a
        public final Object invokeSuspend(Object obj) {
            EnumC1260a enumC1260a = EnumC1260a.f11058a;
            int i2 = this.label;
            if (i2 == 0) {
                g.y(obj);
                InterfaceC1441l interfaceC1441l = this.$block;
                this.label = 1;
                if (interfaceC1441l.invoke(this) == enumC1260a) {
                    return enumC1260a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.y(obj);
            }
            return v.f5689a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadUtilsKt$suspendifyOnMain$1(InterfaceC1441l interfaceC1441l, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.$block = interfaceC1441l;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new ThreadUtilsKt$suspendifyOnMain$1(this.$block, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                g.y(obj);
                d dVar = E.f459a;
                E4.e eVar = o.f1316a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, null);
                this.label = 1;
                if (AbstractC0024y.w(eVar, anonymousClass1, this) == enumC1260a) {
                    return enumC1260a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.y(obj);
            }
        } catch (Exception e3) {
            Logging.error("Exception in suspendifyOnMain", e3);
        }
        return v.f5689a;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((ThreadUtilsKt$suspendifyOnMain$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
