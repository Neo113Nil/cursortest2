package com.inmobi.media;

import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.n9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3931n9 extends AbstractC4080sh {
    public final P7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3931n9(Gh dao) {
        super(dao);
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.d = new P7(dao, new C3903m9(this), this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d3, code lost:
    
        if (r8.a(r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        if (r8 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c8, code lost:
    
        if (a(r8, r10, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C3628ch c3628ch, EnumC3996ph enumC3996ph, InterfaceC3968oh interfaceC3968oh, ContinuationImpl continuationImpl) {
        C3873l9 c3873l9;
        int i;
        if (continuationImpl instanceof C3873l9) {
            c3873l9 = (C3873l9) continuationImpl;
            int i2 = c3873l9.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3873l9.c = i2 - Integer.MIN_VALUE;
                Object obj = c3873l9.f7220a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c3873l9.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (enumC3996ph == EnumC3996ph.c) {
                        AbstractC4080sh.a(c3628ch, interfaceC3968oh);
                        return Unit.INSTANCE;
                    }
                    if (AbstractC3824jh.a(c3628ch)) {
                        String str = "Ping resolved successfully: " + c3628ch.f7049a.b;
                        c3873l9.c = 1;
                        AbstractC4080sh.b(c3628ch, interfaceC3968oh);
                        Object a2 = this.f7376a.f6585a.a("pings", "id=?", new String[]{c3628ch.f7049a.b}, c3873l9);
                        if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            a2 = Unit.INSTANCE;
                        }
                        if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            a2 = Unit.INSTANCE;
                        }
                    } else {
                        String str2 = "Ping resolution failed: " + c3628ch.f7049a.b + ", Status Code: " + c3628ch.b + ", Error: " + c3628ch.c;
                        c3873l9.c = 2;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                P7 p7 = this.d;
                c3873l9.c = 3;
            }
        }
        c3873l9 = new C3873l9(this, continuationImpl);
        Object obj2 = c3873l9.f7220a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3873l9.c;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Vg vg, ContinuationImpl continuationImpl) {
        C3816j9 c3816j9;
        int i;
        if (continuationImpl instanceof C3816j9) {
            c3816j9 = (C3816j9) continuationImpl;
            int i2 = c3816j9.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3816j9.d = i2 - Integer.MIN_VALUE;
                Object obj = c3816j9.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c3816j9.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C3852kg c3852kg = this.c;
                    c3816j9.f7177a = vg;
                    c3816j9.d = 1;
                    obj = c3852kg.a(vg, c3816j9);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vg = c3816j9.f7177a;
                    ResultKt.throwOnFailure(obj);
                }
                Of of = (Of) obj;
                return new C3628ch(vg, of.c(), of.e());
            }
        }
        c3816j9 = new C3816j9(this, continuationImpl);
        Object obj2 = c3816j9.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3816j9.d;
        if (i != 0) {
        }
        Of of2 = (Of) obj2;
        return new C3628ch(vg, of2.c(), of2.e());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|(1:(1:(3:(1:(1:16)(2:13|14))(3:19|20|21)|17|18)(5:46|47|48|49|50))(4:57|58|59|60))(7:92|93|94|(1:96)(1:101)|97|(1:99)|33)|61|62|(1:64)(2:76|77)|(1:(1:(1:68)(2:69|70))(2:71|72))|73|(2:75|33)|50))|104|6|(0)(0)|61|62|(0)(0)|(0)|73|(0)|50|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0189, code lost:
    
        if (r0.a(r4) == r5) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01d6, code lost:
    
        if (r0.a(r4) == r5) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012b, code lost:
    
        if (a((com.inmobi.media.C3628ch) r0, r6, r3, r4) == r5) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0133, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0134, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0137, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0138, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Vg vg, ContinuationImpl continuationImpl) {
        C3844k9 c3844k9;
        Object obj;
        Object coroutine_suspended;
        int i;
        InterfaceC3968oh interfaceC3968oh;
        EnumC3996ph enumC3996ph;
        EnumC3996ph enumC3996ph2;
        int i2;
        Vg vg2 = vg;
        if (continuationImpl instanceof C3844k9) {
            c3844k9 = (C3844k9) continuationImpl;
            int i3 = c3844k9.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3844k9.f = i3 - Integer.MIN_VALUE;
                obj = c3844k9.d;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c3844k9.f;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        String str = "Resolving ping: " + vg2.b + " for ownerId: " + vg2.h;
                        WeakReference weakReference = (WeakReference) this.b.get(vg2.h);
                        InterfaceC3968oh interfaceC3968oh2 = weakReference != null ? (InterfaceC3968oh) weakReference.get() : null;
                        Intrinsics.checkNotNullParameter("in_progress", "<set-?>");
                        vg2.l = "in_progress";
                        c3844k9.f7199a = vg2;
                        c3844k9.b = interfaceC3968oh2;
                        c3844k9.f = 1;
                        Object a2 = a(vg2, c3844k9);
                        if (a2 != coroutine_suspended) {
                            interfaceC3968oh = interfaceC3968oh2;
                            obj = a2;
                        }
                    } catch (Error e) {
                        e = e;
                        enumC3996ph = null;
                        String str2 = "Error resolving ping: " + e.getMessage();
                        WeakReference weakReference2 = (WeakReference) this.b.get(vg2.h);
                        AbstractC4080sh.a(0, e.getMessage(), (short) 2251, vg2, System.currentTimeMillis(), weakReference2 != null ? (InterfaceC3968oh) weakReference2.get() : null);
                        if (enumC3996ph != EnumC3996ph.c) {
                            P7 p7 = this.d;
                            c3844k9.f7199a = null;
                            c3844k9.b = null;
                            c3844k9.c = null;
                            c3844k9.f = 5;
                        }
                        return Unit.INSTANCE;
                    } catch (Exception e2) {
                        e = e2;
                        enumC3996ph = null;
                        String str3 = "Error resolving ping: " + e.getMessage();
                        WeakReference weakReference3 = (WeakReference) this.b.get(vg2.h);
                        AbstractC4080sh.a(0, e.getMessage(), (short) 2250, vg2, System.currentTimeMillis(), weakReference3 != null ? (InterfaceC3968oh) weakReference3.get() : null);
                        if (enumC3996ph != EnumC3996ph.c) {
                            P7 p72 = this.d;
                            c3844k9.f7199a = null;
                            c3844k9.b = null;
                            c3844k9.c = null;
                            c3844k9.f = 4;
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    InterfaceC3968oh interfaceC3968oh3 = (InterfaceC3968oh) c3844k9.b;
                    Vg vg3 = c3844k9.f7199a;
                    try {
                        ResultKt.throwOnFailure(obj);
                        interfaceC3968oh = interfaceC3968oh3;
                        vg2 = vg3;
                    } catch (Error e3) {
                        e = e3;
                        vg2 = vg3;
                        enumC3996ph = null;
                        String str22 = "Error resolving ping: " + e.getMessage();
                        WeakReference weakReference22 = (WeakReference) this.b.get(vg2.h);
                        AbstractC4080sh.a(0, e.getMessage(), (short) 2251, vg2, System.currentTimeMillis(), weakReference22 != null ? (InterfaceC3968oh) weakReference22.get() : null);
                        if (enumC3996ph != EnumC3996ph.c) {
                        }
                        return Unit.INSTANCE;
                    } catch (Exception e4) {
                        e = e4;
                        vg2 = vg3;
                        enumC3996ph = null;
                        String str32 = "Error resolving ping: " + e.getMessage();
                        WeakReference weakReference32 = (WeakReference) this.b.get(vg2.h);
                        AbstractC4080sh.a(0, e.getMessage(), (short) 2250, vg2, System.currentTimeMillis(), weakReference32 != null ? (InterfaceC3968oh) weakReference32.get() : null);
                        if (enumC3996ph != EnumC3996ph.c) {
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            EnumC3996ph enumC3996ph3 = (EnumC3996ph) c3844k9.b;
                            Vg vg4 = c3844k9.f7199a;
                            try {
                                ResultKt.throwOnFailure(obj);
                            } catch (Error e5) {
                                e = e5;
                                enumC3996ph2 = enumC3996ph3;
                                vg2 = vg4;
                                enumC3996ph = enumC3996ph2;
                                String str222 = "Error resolving ping: " + e.getMessage();
                                WeakReference weakReference222 = (WeakReference) this.b.get(vg2.h);
                                AbstractC4080sh.a(0, e.getMessage(), (short) 2251, vg2, System.currentTimeMillis(), weakReference222 != null ? (InterfaceC3968oh) weakReference222.get() : null);
                                if (enumC3996ph != EnumC3996ph.c) {
                                }
                                return Unit.INSTANCE;
                            } catch (Exception e6) {
                                e = e6;
                                enumC3996ph2 = enumC3996ph3;
                                vg2 = vg4;
                                enumC3996ph = enumC3996ph2;
                                String str322 = "Error resolving ping: " + e.getMessage();
                                WeakReference weakReference322 = (WeakReference) this.b.get(vg2.h);
                                AbstractC4080sh.a(0, e.getMessage(), (short) 2250, vg2, System.currentTimeMillis(), weakReference322 != null ? (InterfaceC3968oh) weakReference322.get() : null);
                                if (enumC3996ph != EnumC3996ph.c) {
                                }
                                return Unit.INSTANCE;
                            }
                        } else {
                            if (i != 4 && i != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                    InterfaceC3968oh interfaceC3968oh4 = c3844k9.c;
                    enumC3996ph = (EnumC3996ph) c3844k9.b;
                    Vg vg5 = c3844k9.f7199a;
                    try {
                        ResultKt.throwOnFailure(obj);
                        interfaceC3968oh = interfaceC3968oh4;
                        vg2 = vg5;
                        enumC3996ph2 = enumC3996ph;
                        c3844k9.f7199a = vg2;
                        c3844k9.b = enumC3996ph2;
                        c3844k9.c = null;
                        c3844k9.f = 3;
                    } catch (Error e7) {
                        e = e7;
                        vg2 = vg5;
                        String str2222 = "Error resolving ping: " + e.getMessage();
                        WeakReference weakReference2222 = (WeakReference) this.b.get(vg2.h);
                        AbstractC4080sh.a(0, e.getMessage(), (short) 2251, vg2, System.currentTimeMillis(), weakReference2222 != null ? (InterfaceC3968oh) weakReference2222.get() : null);
                        if (enumC3996ph != EnumC3996ph.c) {
                        }
                        return Unit.INSTANCE;
                    } catch (Exception e8) {
                        e = e8;
                        vg2 = vg5;
                        String str3222 = "Error resolving ping: " + e.getMessage();
                        WeakReference weakReference3222 = (WeakReference) this.b.get(vg2.h);
                        AbstractC4080sh.a(0, e.getMessage(), (short) 2250, vg2, System.currentTimeMillis(), weakReference3222 != null ? (InterfaceC3968oh) weakReference3222.get() : null);
                        if (enumC3996ph != EnumC3996ph.c) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                enumC3996ph2 = (EnumC3996ph) obj;
                if (enumC3996ph2 != null) {
                    i2 = -1;
                } else {
                    try {
                        i2 = AbstractC3789i9.f7159a[enumC3996ph2.ordinal()];
                    } catch (Error e9) {
                        e = e9;
                        enumC3996ph = enumC3996ph2;
                        String str22222 = "Error resolving ping: " + e.getMessage();
                        WeakReference weakReference22222 = (WeakReference) this.b.get(vg2.h);
                        AbstractC4080sh.a(0, e.getMessage(), (short) 2251, vg2, System.currentTimeMillis(), weakReference22222 != null ? (InterfaceC3968oh) weakReference22222.get() : null);
                        if (enumC3996ph != EnumC3996ph.c) {
                        }
                        return Unit.INSTANCE;
                    } catch (Exception e10) {
                        e = e10;
                        enumC3996ph = enumC3996ph2;
                        String str32222 = "Error resolving ping: " + e.getMessage();
                        WeakReference weakReference32222 = (WeakReference) this.b.get(vg2.h);
                        AbstractC4080sh.a(0, e.getMessage(), (short) 2250, vg2, System.currentTimeMillis(), weakReference32222 != null ? (InterfaceC3968oh) weakReference32222.get() : null);
                        if (enumC3996ph != EnumC3996ph.c) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        AbstractC4080sh.a(0, "Database capacity exceeded for pings", (short) 2248, vg2, System.currentTimeMillis(), interfaceC3968oh);
                        return Unit.INSTANCE;
                    }
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                c3844k9.f7199a = vg2;
                c3844k9.b = enumC3996ph2;
                c3844k9.c = interfaceC3968oh;
                c3844k9.f = 2;
                obj = b(vg2, c3844k9);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c3844k9.f7199a = vg2;
                c3844k9.b = enumC3996ph2;
                c3844k9.c = null;
                c3844k9.f = 3;
            }
        }
        c3844k9 = new C3844k9(this, continuationImpl);
        obj = c3844k9.d;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3844k9.f;
        if (i != 0) {
        }
        enumC3996ph2 = (EnumC3996ph) obj;
        if (enumC3996ph2 != null) {
        }
        if (i2 != 1) {
        }
        c3844k9.f7199a = vg2;
        c3844k9.b = enumC3996ph2;
        c3844k9.c = interfaceC3968oh;
        c3844k9.f = 2;
        obj = b(vg2, c3844k9);
        if (obj == coroutine_suspended) {
        }
        c3844k9.f7199a = vg2;
        c3844k9.b = enumC3996ph2;
        c3844k9.c = null;
        c3844k9.f = 3;
    }
}
