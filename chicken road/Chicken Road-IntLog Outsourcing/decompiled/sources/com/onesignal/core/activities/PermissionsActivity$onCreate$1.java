package com.onesignal.core.activities;

import D4.InterfaceC0022w;
import G4.o;
import G4.p;
import G4.u;
import G4.x;
import H4.n;
import H4.s;
import com.onesignal.core.internal.permissions.PermissionsViewModel;
import e5.g;
import f4.v;
import io.appmetrica.analytics.impl.C0793l9;
import k4.C1224j;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.core.activities.PermissionsActivity$onCreate$1", f = "PermissionsActivity.kt", l = {C0793l9.f8689K}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PermissionsActivity$onCreate$1 extends h implements InterfaceC1445p {
    int label;
    final /* synthetic */ PermissionsActivity this$0;

    @e(c = "com.onesignal.core.activities.PermissionsActivity$onCreate$1$1", f = "PermissionsActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.onesignal.core.activities.PermissionsActivity$onCreate$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends h implements InterfaceC1445p {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ PermissionsActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PermissionsActivity permissionsActivity, InterfaceC1218d interfaceC1218d) {
            super(2, interfaceC1218d);
            this.this$0 = permissionsActivity;
        }

        @Override // m4.AbstractC1293a
        public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, interfaceC1218d);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // t4.InterfaceC1445p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC1218d) obj2);
        }

        @Override // m4.AbstractC1293a
        public final Object invokeSuspend(Object obj) {
            EnumC1260a enumC1260a = EnumC1260a.f11058a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
            if (this.Z$0) {
                this.this$0.finishActivity();
            }
            return v.f5689a;
        }

        public final Object invoke(boolean z, InterfaceC1218d interfaceC1218d) {
            return ((AnonymousClass1) create(Boolean.valueOf(z), interfaceC1218d)).invokeSuspend(v.f5689a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionsActivity$onCreate$1(PermissionsActivity permissionsActivity, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = permissionsActivity;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new PermissionsActivity$onCreate$1(this.this$0, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((PermissionsActivity$onCreate$1) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        PermissionsViewModel viewModel;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        v vVar = v.f5689a;
        if (i2 == 0) {
            g.y(obj);
            viewModel = this.this$0.getViewModel();
            u shouldFinish = viewModel.getShouldFinish();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            int i3 = p.f1098a;
            Object i6 = x.b(new n(new o(anonymousClass1, null), shouldFinish, C1224j.f10720a, -2, 1), 0).i(s.f1200a, this);
            if (i6 != enumC1260a) {
                i6 = vVar;
            }
            if (i6 != enumC1260a) {
                i6 = vVar;
            }
            if (i6 == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        return vVar;
    }
}
