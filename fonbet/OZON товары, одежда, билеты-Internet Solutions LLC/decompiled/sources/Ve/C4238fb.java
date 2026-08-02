package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.DeprecatedPaymentMethod;
import spay.sdk.domain.model.HelperScenario;
import spay.sdk.domain.model.MerchantData;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.request.CreateOtpSdkRequestBody;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* renamed from: Ve.fb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4238fb implements Y9 {

    /* renamed from: a, reason: collision with root package name */
    public final Ib f31017a;

    /* renamed from: b, reason: collision with root package name */
    public final Vm f31018b;

    /* renamed from: c, reason: collision with root package name */
    public final Te f31019c;

    /* renamed from: d, reason: collision with root package name */
    public C4263g7 f31020d;

    public C4238fb(Ib sPayStorage, Vm sPayDataContract, Te metricFacade) {
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(metricFacade, "metricFacade");
        this.f31017a = sPayStorage;
        this.f31018b = sPayDataContract;
        this.f31019c = metricFacade;
    }

    public final void a(AbstractC4182dc abstractC4182dc, long j11) {
        AbstractC4245fi sm2;
        boolean z11 = false;
        if (abstractC4182dc instanceof C4578r5) {
            sm2 = new U1(abstractC4182dc, j11);
        } else {
            if (abstractC4182dc instanceof C4289h4 ? true : abstractC4182dc instanceof M4 ? true : abstractC4182dc instanceof Z6) {
                sm2 = new U1(abstractC4182dc, j11);
            } else {
                if (abstractC4182dc instanceof V5 ? true : abstractC4182dc instanceof C4723w6) {
                    sm2 = new Sm("Системная или внутренняя ошибка");
                } else if (abstractC4182dc instanceof C4467n9) {
                    sm2 = new U1(abstractC4182dc, j11);
                } else if (abstractC4182dc instanceof C7) {
                    sm2 = new U1(abstractC4182dc, j11);
                } else {
                    if (!(abstractC4182dc instanceof P9 ? true : abstractC4182dc instanceof C4670ua ? true : abstractC4182dc instanceof Va ? true : abstractC4182dc instanceof C4812zb ? true : abstractC4182dc instanceof K8 ? true : abstractC4182dc instanceof C4293h8)) {
                        throw new Sc.o();
                    }
                    sm2 = new Sm("Системная или внутренняя ошибка");
                }
            }
            z11 = true;
        }
        C4673ud c4673ud = (C4673ud) this.f31017a;
        c4673ud.b(Fh.a(c4673ud.a(), sm2, null, z11, 2));
    }

    /* JADX WARN: Type inference failed for: r12v74, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r12v76, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    public final void b(Ki action) {
        Pn pn2;
        Pn pn3;
        boolean booleanValue;
        boolean booleanValue2;
        AbstractC4245fi c4459n1;
        AbstractC4245fi c4537pl;
        AbstractC4245fi abstractC4245fi;
        Intrinsics.checkNotNullParameter(action, "action");
        boolean z11 = action instanceof X9;
        Ib ib2 = this.f31017a;
        if (z11) {
            ((C4673ud) ib2).c(C4539pn.f31810a);
            return;
        }
        C4112b0 c4112b0 = null;
        if (action instanceof Xd) {
            C4673ud c4673ud = (C4673ud) ib2;
            Xd xd2 = (Xd) action;
            c4673ud.b(Fh.a(c4673ud.a(), new F3(xd2.f30352a, xd2.f30353b), null, false, 2));
            return;
        }
        if (action instanceof Oc) {
            Oc oc2 = (Oc) action;
            ((C4673ud) ib2).c(new C4144c3(oc2.f29610a, null, oc2.f29611b, 2));
            return;
        }
        if (action instanceof Hb) {
            ((C4673ud) ib2).c(C4775y2.f32532a);
            return;
        }
        if (action instanceof C4441mc) {
            C4441mc c4441mc = (C4441mc) action;
            c4441mc.getClass();
            ((C4673ud) ib2).c(new C4144c3(Xe.f30354a, c4441mc.f31579a, false, 4));
            return;
        }
        if (action instanceof C4825zo) {
            ((C4673ud) ib2).c(C4362jk.f31374a);
            return;
        }
        if (action instanceof E2) {
            M1.b bVar = ((E2) action).f28896a;
            if (!(bVar instanceof C4594rl)) {
                if (!(bVar instanceof C4420lk) && !(bVar instanceof Nk)) {
                    throw new Sc.o();
                }
                r2 = true;
            }
            C4673ud c4673ud2 = (C4673ud) ib2;
            c4673ud2.b(Fh.a(c4673ud2.a(), new C4694v5(bVar), null, r2, 2));
            return;
        }
        if (action instanceof O0) {
            AbstractC4245fi abstractC4245fi2 = ((O0) action).f29576a;
            if ((abstractC4245fi2 instanceof Sm) || (abstractC4245fi2 instanceof Jr) || (abstractC4245fi2 instanceof C4761xg) || (abstractC4245fi2 instanceof Cb) || (abstractC4245fi2 instanceof C4346j4) || (abstractC4245fi2 instanceof Ya)) {
                C4673ud c4673ud3 = (C4673ud) ib2;
                c4673ud3.b(Fh.a(c4673ud3.a(), abstractC4245fi2, null, true, 2));
                return;
            }
            return;
        }
        if (action instanceof C4209eb) {
            C4673ud c4673ud4 = (C4673ud) ib2;
            c4673ud4.b(Fh.a(c4673ud4.a(), new Bq(((C4209eb) action).f30923a), null, false, 2));
            return;
        }
        if (action instanceof C4085a2) {
            M1.b bVar2 = ((C4085a2) action).f30624a;
            if (bVar2 instanceof Sd) {
                ErrorEntity errorEntity = ((Sd) bVar2).f29970a;
                abstractC4245fi = errorEntity instanceof ErrorEntity.NotEnoughMoneyForPayment ? new To(C4149c8.f30785a) : new Cb(errorEntity);
                r2 = true;
            } else if (bVar2 instanceof C4731we) {
                abstractC4245fi = C4268gc.f31102a;
            } else {
                if (!(bVar2 instanceof Ze)) {
                    throw new Sc.o();
                }
                abstractC4245fi = Ic.f29225a;
            }
            C4673ud c4673ud5 = (C4673ud) ib2;
            c4673ud5.b(Fh.a(c4673ud5.a(), abstractC4245fi, null, r2, 2));
            return;
        }
        if (action instanceof C4285h0) {
            Lf.a aVar = ((C4285h0) action).f31131a;
            if (aVar instanceof C4649ti) {
                c4537pl = Lk.f29431a;
            } else {
                if (!(aVar instanceof Ui)) {
                    throw new Sc.o();
                }
                c4537pl = new C4537pl(((Ui) aVar).f30129b);
                r2 = true;
            }
            C4673ud c4673ud6 = (C4673ud) ib2;
            c4673ud6.b(Fh.a(c4673ud6.a(), c4537pl, null, r2, 2));
            return;
        }
        if (action instanceof K3) {
            ((C4673ud) ib2).c(new C4379k8(((K3) action).f29333a));
            return;
        }
        if (action instanceof C4520p4) {
            ((C4673ud) ib2).c(new N8(((C4520p4) action).f31761a));
            return;
        }
        if (action instanceof C4213ef) {
            ((C4673ud) ib2).c(new Ye(((C4213ef) action).f30926a));
            return;
        }
        if (action instanceof C4398kr) {
            C4398kr c4398kr = (C4398kr) action;
            a(c4398kr.f31476a, c4398kr.f31477b);
            return;
        }
        if (action instanceof Gq) {
            C4673ud c4673ud7 = (C4673ud) ib2;
            c4673ud7.b(Fh.a(c4673ud7.a(), new C4554q9(((Gq) action).f29094a), null, true, 2));
            return;
        }
        if (action instanceof C4128bg) {
            ((C4673ud) ib2).c(C4816zf.f32653a);
            return;
        }
        if (action instanceof C4698v9) {
            C4673ud c4673ud8 = (C4673ud) ib2;
            c4673ud8.b(Fh.a(c4673ud8.a(), new Sm("Не удалось пройти аутентификацию"), null, true, 2));
            return;
        }
        if (action instanceof Nr) {
            C4673ud c4673ud9 = (C4673ud) ib2;
            c4673ud9.b(Fh.a(c4673ud9.a(), new S9(((Nr) action).f29575a), null, true, 2));
            return;
        }
        if (action instanceof C4800z) {
            a(((C4800z) action).f32614a, 45000L);
            return;
        }
        if (action instanceof E6) {
            ((E6) action).f28908a.invoke();
            return;
        }
        if (action instanceof C4176d6) {
            ((C4176d6) action).f30856a.invoke();
            return;
        }
        boolean z12 = action instanceof C4263g7;
        Vm vm = this.f31018b;
        if (z12) {
            C4263g7 c4263g7 = (C4263g7) action;
            Boolean bool = c4263g7.f31092c;
            C4112b0 c4112b02 = c4263g7.f31093d;
            ListOfCardsResponseBody.PaymentToolInfo.Tool tool = c4263g7.f31091b;
            Boolean bool2 = c4263g7.f31090a;
            if (bool != null && bool2 != null && tool != null) {
                this.f31020d = new C4263g7(bool2, tool, bool, c4112b02);
            }
            if (bool2 != null) {
                booleanValue = bool2.booleanValue();
            } else {
                C4263g7 c4263g72 = this.f31020d;
                Boolean bool3 = c4263g72 != null ? c4263g72.f31090a : null;
                Intrinsics.f(bool3);
                booleanValue = bool3.booleanValue();
            }
            if (tool == null) {
                C4263g7 c4263g73 = this.f31020d;
                tool = c4263g73 != null ? c4263g73.f31091b : null;
                Intrinsics.f(tool);
            }
            Boolean bool4 = c4263g7.f31092c;
            if (bool4 != null) {
                booleanValue2 = bool4.booleanValue();
            } else {
                C4263g7 c4263g74 = this.f31020d;
                Boolean bool5 = c4263g74 != null ? c4263g74.f31092c : null;
                Intrinsics.f(bool5);
                booleanValue2 = bool5.booleanValue();
            }
            if (c4112b02 == null) {
                C4263g7 c4263g75 = this.f31020d;
                if (c4263g75 != null) {
                    c4112b0 = c4263g75.f31093d;
                }
            } else {
                c4112b0 = c4112b02;
            }
            if (booleanValue) {
                C4654tn c4654tn = (C4654tn) vm;
                if (c4654tn.f32146o) {
                    ErrorEntity.DoubleOtpCall sPayApiError = ErrorEntity.DoubleOtpCall.INSTANCE;
                    Intrinsics.checkNotNullParameter(sPayApiError, "sPayApiError");
                }
                c4654tn.f32146o = true;
                MerchantData merchantData = c4654tn.f32130G;
                if (merchantData == null) {
                    throw L3.f29386a;
                }
                c4459n1 = new Y5(new Mf(merchantData.getAuthorization(), new CreateOtpSdkRequestBody(merchantData.getOrderId(), c4654tn.k(), tool.getPaymentId())), new Da(this, tool, booleanValue2, c4112b0));
            } else {
                c4459n1 = ((PayStrategy) ((C4654tn) vm).f32129F.getValue()) instanceof DeprecatedPaymentMethod ? new C4459n1(tool, booleanValue2) : new I0(tool, booleanValue2, c4112b0);
            }
            ((C4673ud) ib2).c(c4459n1);
            return;
        }
        if (action instanceof Wm) {
            C4673ud c4673ud10 = (C4673ud) ib2;
            c4673ud10.c(new Bq(new W6()));
            Wm wm = (Wm) action;
            c4673ud10.b(Fh.a(c4673ud10.a(), new C4216ei(wm.f30295a, wm.f30296b), null, false, 2));
            return;
        }
        if (action instanceof C4360ji) {
            C4673ud c4673ud11 = (C4673ud) ib2;
            c4673ud11.b(Fh.a(c4673ud11.a(), new Sm("Системная или внутренняя ошибка"), null, true, 2));
            return;
        }
        if (action instanceof Ae) {
            ((C4673ud) ib2).c(new Gh(((Ae) action).f28602a));
            return;
        }
        if (action instanceof S8) {
            C4673ud c4673ud12 = (C4673ud) ib2;
            c4673ud12.b(Fh.a(c4673ud12.a(), C4471nd.f31654a, null, true, 2));
            return;
        }
        if (action instanceof C4632t1) {
            Lf.a aVar2 = ((C4632t1) action).f32078a;
            if (aVar2 instanceof I9) {
                pn3 = new Pn(Ck.f28773b);
            } else {
                if (aVar2 instanceof C4439ma) {
                    pn2 = new Pn(new C4277gl(((C4439ma) aVar2).f31573b));
                } else if (aVar2 instanceof Oa) {
                    pn2 = new Pn(new Gl(((Oa) aVar2).f29606b));
                } else if (aVar2 instanceof C4265g9) {
                    pn2 = new Pn(new Aj(((C4265g9) aVar2).f31099b));
                } else {
                    if (!(aVar2 instanceof C8)) {
                        throw new Sc.o();
                    }
                    pn2 = new Pn(new C4132bk(((C8) aVar2).f28745b));
                }
                pn3 = pn2;
            }
            C4673ud c4673ud13 = (C4673ud) ib2;
            Fh a11 = c4673ud13.a();
            AbstractC4335im abstractC4335im = pn3.f29733a;
            c4673ud13.b(Fh.a(a11, pn3, null, (abstractC4335im instanceof C4132bk) || (abstractC4335im instanceof Aj), 2));
            return;
        }
        if (action instanceof C4288h3) {
            E e11 = ((C4288h3) action).f31139a;
            boolean z13 = e11 instanceof C4787ye;
            Te te2 = this.f31019c;
            if (z13) {
                te2.b(new Bi(Ap.RS_FAIL_REVOKE_TOKEN_SDK, Ur.PROFILE_VIEW, Pe.RS_GOOD, null, null, null, null, 120));
                e11.c().invoke();
                return;
            } else {
                te2.b(new Bi(Ap.RS_GOOD_REVOKE_TOKEN_SDK, Ur.PROFILE_VIEW, Pe.RS_GOOD, null, null, null, null, 120));
                e11.c().invoke();
                return;
            }
        }
        if (Intrinsics.d(action, B5.f28668a)) {
            ((C4673ud) ib2).c(P4.f29666a);
            return;
        }
        if (action instanceof Lh) {
            ((C4673ud) ib2).c(C4100ah.f30676a);
            return;
        }
        if (action instanceof L7) {
            C4673ud c4673ud14 = (C4673ud) ib2;
            Fh a12 = c4673ud14.a();
            ((L7) action).getClass();
            c4673ud14.b(Fh.a(a12, null, null, false, 3));
            return;
        }
        if (action instanceof Ca) {
            ((C4673ud) ib2).c(new To(((Ca) action).f28752a));
            return;
        }
        if (action instanceof Df) {
            ((C4654tn) vm).f32155x = HelperScenario.BNPL;
            ((C4673ud) ib2).c(C4775y2.f32532a);
            return;
        }
        if (action instanceof Xo) {
            ((C4673ud) ib2).c(F7.f28973a);
            return;
        }
        if (action instanceof C4553q8) {
            String id2 = ((C4553q8) action).f31847a;
            C4654tn c4654tn2 = (C4654tn) vm;
            c4654tn2.getClass();
            Intrinsics.checkNotNullParameter(id2, "id");
            c4654tn2.f32157z.setValue(id2);
            return;
        }
        if (action instanceof V4) {
            ((C4673ud) ib2).c(C4807z6.f32625a);
            return;
        }
        if (action instanceof Vn) {
            ((C4673ud) ib2).c(new Ij(((Vn) action).f30213a));
            return;
        }
        if (Intrinsics.d(action, C4683un.f32233a)) {
            ((C4673ud) ib2).c(C4275gj.f31115a);
            return;
        }
        if (action instanceof Dp) {
            Dp dp = (Dp) action;
            C4673ud c4673ud15 = (C4673ud) ib2;
            c4673ud15.b(Fh.a(c4673ud15.a(), new C4755xa(dp.f28882a, dp.f28883b), null, true, 2));
            return;
        }
        if (action instanceof C4282gq) {
            C4654tn c4654tn3 = (C4654tn) vm;
            c4654tn3.c(EnumC4711vm.f32308a);
            MerchantData merchantData2 = c4654tn3.f32130G;
            if (merchantData2 == null) {
                throw L3.f29386a;
            }
            PayStrategy.PayOnline status = new PayStrategy.PayOnline(((C4282gq) action).f31129a ? merchantData2.getBindingId() : null);
            c4654tn3.getClass();
            Intrinsics.checkNotNullParameter(status, "status");
            c4654tn3.f32128E.setValue(status);
            ((C4673ud) ib2).b(new Fh(F7.f28973a, 6));
            return;
        }
        if (action instanceof C4644td) {
            C4673ud c4673ud16 = (C4673ud) ib2;
            c4673ud16.b(Fh.a(c4673ud16.a(), new C4148c7(((C4644td) action).f32099a), null, false, 2));
        } else if (action instanceof C4244fh) {
            C4673ud c4673ud17 = (C4673ud) ib2;
            C4244fh c4244fh = (C4244fh) action;
            c4673ud17.b(Fh.a(c4673ud17.a(), new C4655to(c4244fh.f31037a, c4244fh.f31038b), null, false, 2));
        } else if (action instanceof Dg) {
            C4673ud c4673ud18 = (C4673ud) ib2;
            Dg dg2 = (Dg) action;
            c4673ud18.b(Fh.a(c4673ud18.a(), new Wf(dg2.f28863a, dg2.f28864b), null, false, 2));
        }
    }
}
