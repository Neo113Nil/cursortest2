package com.onesignal.user.internal.jwt;

import com.onesignal.IUserJwtInvalidatedListener;
import com.onesignal.UserJwtInvalidatedEvent;
import com.onesignal.common.events.EventProducer;
import com.onesignal.debug.internal.logging.Logging;
import e5.g;
import f4.AbstractC0432i;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.user.internal.jwt.JwtTokenStore$invalidateJwt$2", f = "JwtTokenStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class JwtTokenStore$invalidateJwt$2 extends h implements InterfaceC1441l {
    final /* synthetic */ String $externalId;
    int label;
    final /* synthetic */ JwtTokenStore this$0;

    /* renamed from: com.onesignal.user.internal.jwt.JwtTokenStore$invalidateJwt$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements InterfaceC1441l {
        final /* synthetic */ String $externalId;
        final /* synthetic */ JwtTokenStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(JwtTokenStore jwtTokenStore, String str) {
            super(1);
            this.this$0 = jwtTokenStore;
            this.$externalId = str;
        }

        @Override // t4.InterfaceC1441l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IUserJwtInvalidatedListener) obj);
            return v.f5689a;
        }

        public final void invoke(IUserJwtInvalidatedListener listener) {
            Object l2;
            i.e(listener, "listener");
            try {
                listener.onUserJwtInvalidated(new UserJwtInvalidatedEvent(this.$externalId));
                l2 = v.f5689a;
            } catch (Throwable th) {
                l2 = g.l(th);
            }
            String str = this.$externalId;
            Throwable a6 = AbstractC0432i.a(l2);
            if (a6 != null) {
                Logging.warn("JwtTokenStore: IUserJwtInvalidatedListener threw for externalId=" + str, a6);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JwtTokenStore$invalidateJwt$2(JwtTokenStore jwtTokenStore, String str, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = jwtTokenStore;
        this.$externalId = str;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new JwtTokenStore$invalidateJwt$2(this.this$0, this.$externalId, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EventProducer eventProducer;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        eventProducer = this.this$0.publicInvalidatedListeners;
        eventProducer.fire(new AnonymousClass1(this.this$0, this.$externalId));
        return v.f5689a;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((JwtTokenStore$invalidateJwt$2) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
