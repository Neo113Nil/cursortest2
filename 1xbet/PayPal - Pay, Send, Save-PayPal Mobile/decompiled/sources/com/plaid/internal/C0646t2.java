package com.plaid.internal;

/* renamed from: com.plaid.internal.t2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0646t2 implements com.plaid.internal.InterfaceC0655u2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.G2 f6574a;
    public final com.plaid.internal.Z2 b;
    public final com.plaid.internal.Y2 c;
    public final com.plaid.internal.y8 d;
    public final com.plaid.internal.C8 e;
    public final com.plaid.internal.x8 f;
    public final com.plaid.internal.B8 g;
    public final com.plaid.internal.A8 h;
    public final com.plaid.internal.A0 i;

    public C0646t2(com.plaid.internal.G2 g2, com.plaid.internal.Z2 z2, com.plaid.internal.Y2 y2, com.plaid.internal.y8 y8Var, com.plaid.internal.C8 c8, com.plaid.internal.x8 x8Var, com.plaid.internal.B8 b8, com.plaid.internal.A8 a8, com.plaid.internal.A0 a0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(g2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(z2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(y2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(y8Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c8, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(x8Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b8, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a8, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a0, "");
        this.f6574a = g2;
        this.b = z2;
        this.c = y2;
        this.d = y8Var;
        this.e = c8;
        this.f = x8Var;
        this.g = b8;
        this.h = a8;
        this.i = a0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
    
        if (r9.a(r10, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.plaid.internal.InterfaceC0655u2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput[] pane$PaneOutputArr, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.C0602o2 c0602o2;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        com.plaid.internal.Y2 y2;
        java.lang.Object a2;
        com.plaid.internal.C0646t2 c0646t2;
        com.plaid.internal.C0646t2 c0646t22;
        if (continuationImpl instanceof com.plaid.internal.C0602o2) {
            c0602o2 = (com.plaid.internal.C0602o2) continuationImpl;
            int i2 = c0602o2.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0602o2.f = i2 - 2147483648;
                obj = c0602o2.d;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0602o2.f;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    y2 = this.c;
                    com.plaid.internal.Z2 z2 = this.b;
                    c0602o2.f6516a = this;
                    c0602o2.b = pane$PaneOutputArr;
                    c0602o2.c = y2;
                    c0602o2.f = 1;
                    a2 = z2.a(c0602o2);
                    if (a2 != coroutine_suspended) {
                        c0646t2 = this;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    com.plaid.internal.Y2 y22 = c0602o2.c;
                    com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput[] pane$PaneOutputArr2 = c0602o2.b;
                    c0646t2 = c0602o2.f6516a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    y2 = y22;
                    pane$PaneOutputArr = pane$PaneOutputArr2;
                    a2 = obj;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    c0646t22 = c0602o2.f6516a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.N2 n2 = (com.plaid.internal.N2) obj;
                    com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                    com.plaid.internal.C0452a6.a.a("Next ".concat(java.lang.String.valueOf(n2)), true);
                    c0602o2.f6516a = null;
                    c0602o2.f = 3;
                }
                java.util.List list = kotlin.collections.ArraysKt.toList(pane$PaneOutputArr);
                c0602o2.f6516a = c0646t2;
                c0602o2.b = null;
                c0602o2.c = null;
                c0602o2.f = 2;
                obj = y2.a((com.plaid.internal.N2) a2, list, c0602o2);
                if (obj != coroutine_suspended) {
                    c0646t22 = c0646t2;
                    com.plaid.internal.N2 n22 = (com.plaid.internal.N2) obj;
                    com.plaid.internal.C0452a6.a aVar2 = com.plaid.internal.C0452a6.f5996a;
                    com.plaid.internal.C0452a6.a.a("Next ".concat(java.lang.String.valueOf(n22)), true);
                    c0602o2.f6516a = null;
                    c0602o2.f = 3;
                }
                return coroutine_suspended;
            }
        }
        c0602o2 = new com.plaid.internal.C0602o2(this, continuationImpl);
        obj = c0602o2.d;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0602o2.f;
        if (i != 0) {
        }
        java.util.List list2 = kotlin.collections.ArraysKt.toList(pane$PaneOutputArr);
        c0602o2.f6516a = c0646t2;
        c0602o2.b = null;
        c0602o2.c = null;
        c0602o2.f = 2;
        obj = y2.a((com.plaid.internal.N2) a2, list2, c0602o2);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
    
        if (r2.a(r9, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r9 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.plaid.internal.InterfaceC0655u2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.C0628r2 c0628r2;
        int i;
        com.plaid.internal.C0646t2 c0646t2;
        if (continuationImpl instanceof com.plaid.internal.C0628r2) {
            c0628r2 = (com.plaid.internal.C0628r2) continuationImpl;
            int i2 = c0628r2.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0628r2.d = i2 - 2147483648;
                java.lang.Object obj = c0628r2.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0628r2.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.Z2 z2 = this.b;
                    c0628r2.f6554a = this;
                    c0628r2.d = 1;
                    obj = z2.a(c0628r2);
                    if (obj != coroutine_suspended) {
                        c0646t2 = this;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    c0646t2 = c0628r2.f6554a;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    c0646t2 = c0628r2.f6554a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.N2 n2 = (com.plaid.internal.N2) obj;
                    com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                    com.plaid.internal.C0452a6.a.a("Start next ".concat(java.lang.String.valueOf(n2)), true);
                    c0628r2.f6554a = null;
                    c0628r2.d = 3;
                }
                com.plaid.internal.N2 n22 = (com.plaid.internal.N2) obj;
                com.plaid.internal.C0452a6.a aVar2 = com.plaid.internal.C0452a6.f5996a;
                com.plaid.internal.C0452a6.a.a("Start from ".concat(java.lang.String.valueOf(n22)), true);
                com.plaid.internal.Y2 y2 = c0646t2.c;
                c0628r2.f6554a = c0646t2;
                c0628r2.d = 2;
                obj = y2.a(n22, false, (kotlin.coroutines.jvm.internal.ContinuationImpl) c0628r2);
            }
        }
        c0628r2 = new com.plaid.internal.C0628r2(this, continuationImpl);
        java.lang.Object obj2 = c0628r2.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0628r2.d;
        if (i != 0) {
        }
        com.plaid.internal.N2 n222 = (com.plaid.internal.N2) obj2;
        com.plaid.internal.C0452a6.a aVar22 = com.plaid.internal.C0452a6.f5996a;
        com.plaid.internal.C0452a6.a.a("Start from ".concat(java.lang.String.valueOf(n222)), true);
        com.plaid.internal.Y2 y22 = c0646t2.c;
        c0628r2.f6554a = c0646t2;
        c0628r2.d = 2;
        obj2 = y22.a(n222, false, (kotlin.coroutines.jvm.internal.ContinuationImpl) c0628r2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
    
        if (r2.a(r10, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r10 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.plaid.internal.InterfaceC0655u2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.C0611p2 c0611p2;
        int i;
        com.plaid.internal.Y2 y2;
        com.plaid.internal.C0646t2 c0646t2;
        if (continuationImpl instanceof com.plaid.internal.C0611p2) {
            c0611p2 = (com.plaid.internal.C0611p2) continuationImpl;
            int i2 = c0611p2.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0611p2.e = i2 - 2147483648;
                java.lang.Object obj = c0611p2.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0611p2.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.Y2 y22 = this.c;
                    com.plaid.internal.Z2 z2 = this.b;
                    c0611p2.f6528a = this;
                    c0611p2.b = y22;
                    c0611p2.e = 1;
                    obj = z2.a(c0611p2);
                    if (obj != coroutine_suspended) {
                        y2 = y22;
                        c0646t2 = this;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    com.plaid.internal.Y2 y23 = c0611p2.b;
                    com.plaid.internal.C0646t2 c0646t22 = c0611p2.f6528a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    y2 = y23;
                    c0646t2 = c0646t22;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    c0646t2 = c0611p2.f6528a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.N2 n2 = (com.plaid.internal.N2) obj;
                    com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                    com.plaid.internal.C0452a6.a.a("Previous ".concat(java.lang.String.valueOf(n2)), true);
                    c0611p2.f6528a = null;
                    c0611p2.e = 3;
                }
                c0611p2.f6528a = c0646t2;
                c0611p2.b = null;
                c0611p2.e = 2;
                obj = y2.b((com.plaid.internal.N2) obj, c0611p2);
            }
        }
        c0611p2 = new com.plaid.internal.C0611p2(this, continuationImpl);
        java.lang.Object obj2 = c0611p2.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0611p2.e;
        if (i != 0) {
        }
        c0611p2.f6528a = c0646t2;
        c0611p2.b = null;
        c0611p2.e = 2;
        obj2 = y2.b((com.plaid.internal.N2) obj2, c0611p2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c5, code lost:
    
        if (r12.a(r13, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
    
        if (r13 != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.plaid.internal.InterfaceC0655u2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.plaid.internal.D6 d6, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.C0620q2 c0620q2;
        int i;
        com.plaid.internal.C0646t2 c0646t2;
        com.plaid.internal.N2 n2;
        com.plaid.internal.D6 d62;
        com.plaid.internal.C0646t2 c0646t22;
        com.plaid.internal.C0646t2 c0646t23;
        com.plaid.internal.N2 n22;
        if (continuationImpl instanceof com.plaid.internal.C0620q2) {
            c0620q2 = (com.plaid.internal.C0620q2) continuationImpl;
            int i2 = c0620q2.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0620q2.f = i2 - 2147483648;
                java.lang.Object obj = c0620q2.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0620q2.f;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.Z2 z2 = this.b;
                    c0620q2.f6543a = this;
                    c0620q2.b = d6;
                    c0620q2.f = 1;
                    obj = z2.a(c0620q2);
                    if (obj != coroutine_suspended) {
                        c0646t2 = this;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    d6 = c0620q2.b;
                    c0646t2 = c0620q2.f6543a;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    n22 = c0620q2.c;
                    d62 = c0620q2.b;
                    c0646t23 = c0620q2.f6543a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    n2 = n22;
                    c0646t22 = c0646t23;
                    com.plaid.internal.Y2 y2 = c0646t22.c;
                    c0620q2.f6543a = c0646t22;
                    c0620q2.b = null;
                    c0620q2.c = null;
                    c0620q2.f = 3;
                    obj = y2.a(n2, d62, c0620q2);
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    c0646t22 = c0620q2.f6543a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.N2 n23 = (com.plaid.internal.N2) obj;
                    com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                    com.plaid.internal.C0452a6.a.a("Resume next ".concat(java.lang.String.valueOf(n23)), true);
                    c0620q2.f6543a = null;
                    c0620q2.f = 4;
                }
                n2 = (com.plaid.internal.N2) obj;
                com.plaid.internal.C0452a6.a aVar2 = com.plaid.internal.C0452a6.f5996a;
                com.plaid.internal.C0452a6.a.a("Resume from ".concat(java.lang.String.valueOf(n2)), true);
                if (!(d6 instanceof com.plaid.internal.D6.a)) {
                    com.plaid.internal.y8 y8Var = c0646t2.d;
                    java.lang.String a2 = ((com.plaid.internal.D6.a) d6).a();
                    c0620q2.f6543a = c0646t2;
                    c0620q2.b = d6;
                    c0620q2.c = n2;
                    c0620q2.f = 2;
                    if (y8Var.a(a2, c0620q2) != coroutine_suspended) {
                        c0646t23 = c0646t2;
                        d62 = d6;
                        n22 = n2;
                        n2 = n22;
                        c0646t22 = c0646t23;
                        com.plaid.internal.Y2 y22 = c0646t22.c;
                        c0620q2.f6543a = c0646t22;
                        c0620q2.b = null;
                        c0620q2.c = null;
                        c0620q2.f = 3;
                        obj = y22.a(n2, d62, c0620q2);
                    }
                    return coroutine_suspended;
                }
                com.plaid.internal.C0646t2 c0646t24 = c0646t2;
                d62 = d6;
                c0646t22 = c0646t24;
                com.plaid.internal.Y2 y222 = c0646t22.c;
                c0620q2.f6543a = c0646t22;
                c0620q2.b = null;
                c0620q2.c = null;
                c0620q2.f = 3;
                obj = y222.a(n2, d62, c0620q2);
            }
        }
        c0620q2 = new com.plaid.internal.C0620q2(this, continuationImpl);
        java.lang.Object obj2 = c0620q2.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0620q2.f;
        if (i != 0) {
        }
        n2 = (com.plaid.internal.N2) obj2;
        com.plaid.internal.C0452a6.a aVar22 = com.plaid.internal.C0452a6.f5996a;
        com.plaid.internal.C0452a6.a.a("Resume from ".concat(java.lang.String.valueOf(n2)), true);
        if (!(d6 instanceof com.plaid.internal.D6.a)) {
        }
    }

    @Override // com.plaid.internal.InterfaceC0655u2
    public final void a(com.plaid.link.result.LinkResult linkResult) {
        com.plaid.internal.AbstractC0698z0 dVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkResult, "");
        com.plaid.internal.G2 g2 = this.f6574a;
        if (linkResult instanceof com.plaid.link.result.LinkSuccess) {
            dVar = new com.plaid.internal.AbstractC0698z0.j((com.plaid.link.result.LinkSuccess) linkResult);
        } else {
            if (!(linkResult instanceof com.plaid.link.result.LinkExit)) {
                throw new java.lang.IllegalArgumentException("Link result is not a valid result of LinkSuccess or LinkExit");
            }
            dVar = new com.plaid.internal.AbstractC0698z0.d((com.plaid.link.result.LinkExit) linkResult);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "");
        g2.f5792a.postValue(dVar);
    }

    @Override // com.plaid.internal.InterfaceC0655u2
    public final void a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.plaid.internal.G2 g2 = this.f6574a;
        com.plaid.internal.AbstractC0698z0.f fVar = new com.plaid.internal.AbstractC0698z0.f(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "");
        g2.f5792a.postValue(fVar);
    }

    @Override // com.plaid.internal.InterfaceC0655u2
    public final void a(com.plaid.internal.AbstractC0639s4 abstractC0639s4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractC0639s4, "");
        com.plaid.internal.G2 g2 = this.f6574a;
        com.plaid.internal.AbstractC0698z0.g gVar = new com.plaid.internal.AbstractC0698z0.g(abstractC0639s4);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "");
        g2.f5792a.postValue(gVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(5:18|19|(1:21)|22|(1:24))|11|12|13))|26|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        com.plaid.internal.L2.b(new com.plaid.internal.C0447a1("Failed to parse webview json"), null);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // com.plaid.internal.InterfaceC0655u2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.util.LinkedHashMap linkedHashMap, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.C0584m2 c0584m2;
        int i;
        if (continuationImpl instanceof com.plaid.internal.C0584m2) {
            c0584m2 = (com.plaid.internal.C0584m2) continuationImpl;
            int i2 = c0584m2.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0584m2.c = i2 - 2147483648;
                java.lang.Object obj = c0584m2.f6491a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0584m2.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.serialization.json.Json Json$default = kotlinx.serialization.json.JsonKt.Json$default(null, com.plaid.internal.C0593n2.f6505a, 1, null);
                    java.lang.String str = (java.lang.String) linkedHashMap.get(com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_WEBVIEW);
                    if (str == null) {
                        str = "";
                    }
                    com.plaid.internal.C0666v4 c0666v4 = (com.plaid.internal.C0666v4) Json$default.decodeFromString(com.plaid.internal.C0666v4.a.f6599a, str);
                    com.plaid.internal.N2 kVar = new com.plaid.internal.N2.k("", "", "", "", c0666v4.b, c0666v4.c, c0666v4.d, false, null, 1152);
                    c0584m2.c = 1;
                    if (a(kVar, c0584m2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        c0584m2 = new com.plaid.internal.C0584m2(this, continuationImpl);
        java.lang.Object obj2 = c0584m2.f6491a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0584m2.c;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00fe, code lost:
    
        if (r9.a(r8, r0) != r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ed, code lost:
    
        if (r4.a(r9, r0) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
    
        if (r9.a(r0) != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c0, code lost:
    
        if (r4.a(r9, r0) != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00aa, code lost:
    
        if (r4.a(r9, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.plaid.internal.N2 n2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.C0637s2 c0637s2;
        com.plaid.internal.C0646t2 c0646t2;
        com.plaid.internal.N2.k kVar;
        com.plaid.internal.A a2;
        kotlin.Unit unit;
        com.plaid.internal.N2.k kVar2;
        com.plaid.internal.G2 g2;
        if (continuationImpl instanceof com.plaid.internal.C0637s2) {
            c0637s2 = (com.plaid.internal.C0637s2) continuationImpl;
            int i = c0637s2.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0637s2.e = i - 2147483648;
                java.lang.Object obj = c0637s2.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (c0637s2.e) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (n2 instanceof com.plaid.internal.N2.k) {
                            com.plaid.internal.C8 c8 = this.e;
                            java.lang.String str = ((com.plaid.internal.N2.k) n2).f;
                            c0637s2.f6564a = this;
                            c0637s2.b = n2;
                            c0637s2.e = 1;
                            if (c8.a(str, c0637s2) != coroutine_suspended) {
                                c0646t2 = this;
                                kVar = (com.plaid.internal.N2.k) n2;
                                if (kVar.g.length() > 0) {
                                    com.plaid.internal.B8 b8 = c0646t2.g;
                                    java.lang.String str2 = kVar.g;
                                    c0637s2.f6564a = c0646t2;
                                    c0637s2.b = n2;
                                    c0637s2.e = 2;
                                    break;
                                }
                                a2 = ((com.plaid.internal.N2.k) n2).h;
                                if (a2 != null) {
                                    com.plaid.internal.x8 x8Var = c0646t2.f;
                                    c0637s2.f6564a = c0646t2;
                                    c0637s2.b = n2;
                                    c0637s2.e = 3;
                                    break;
                                } else {
                                    unit = null;
                                    if (unit == null) {
                                        com.plaid.internal.x8 x8Var2 = c0646t2.f;
                                        c0637s2.f6564a = c0646t2;
                                        c0637s2.b = n2;
                                        c0637s2.e = 4;
                                        break;
                                    }
                                    kVar2 = (com.plaid.internal.N2.k) n2;
                                    if (!kVar2.j) {
                                        com.plaid.internal.A8 a8 = c0646t2.h;
                                        boolean z = kVar2.i;
                                        c0637s2.f6564a = c0646t2;
                                        c0637s2.b = n2;
                                        c0637s2.e = 5;
                                        break;
                                    }
                                    com.plaid.internal.Z2 z2 = c0646t2.b;
                                    c0637s2.f6564a = c0646t2;
                                    c0637s2.b = n2;
                                    c0637s2.e = 6;
                                    break;
                                }
                            }
                            return coroutine_suspended;
                        }
                        c0646t2 = this;
                        com.plaid.internal.Z2 z22 = c0646t2.b;
                        c0637s2.f6564a = c0646t2;
                        c0637s2.b = n2;
                        c0637s2.e = 6;
                    case 1:
                        n2 = c0637s2.b;
                        c0646t2 = (com.plaid.internal.C0646t2) c0637s2.f6564a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        kVar = (com.plaid.internal.N2.k) n2;
                        if (kVar.g.length() > 0) {
                        }
                        a2 = ((com.plaid.internal.N2.k) n2).h;
                        if (a2 != null) {
                        }
                        break;
                    case 2:
                        n2 = c0637s2.b;
                        c0646t2 = (com.plaid.internal.C0646t2) c0637s2.f6564a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        a2 = ((com.plaid.internal.N2.k) n2).h;
                        if (a2 != null) {
                        }
                        break;
                    case 3:
                        n2 = c0637s2.b;
                        c0646t2 = (com.plaid.internal.C0646t2) c0637s2.f6564a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        unit = kotlin.Unit.INSTANCE;
                        if (unit == null) {
                        }
                        kVar2 = (com.plaid.internal.N2.k) n2;
                        if (!kVar2.j) {
                        }
                        com.plaid.internal.Z2 z222 = c0646t2.b;
                        c0637s2.f6564a = c0646t2;
                        c0637s2.b = n2;
                        c0637s2.e = 6;
                        break;
                    case 4:
                        n2 = c0637s2.b;
                        c0646t2 = (com.plaid.internal.C0646t2) c0637s2.f6564a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        kVar2 = (com.plaid.internal.N2.k) n2;
                        if (!kVar2.j) {
                        }
                        com.plaid.internal.Z2 z2222 = c0646t2.b;
                        c0637s2.f6564a = c0646t2;
                        c0637s2.b = n2;
                        c0637s2.e = 6;
                        break;
                    case 5:
                        n2 = c0637s2.b;
                        c0646t2 = (com.plaid.internal.C0646t2) c0637s2.f6564a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.plaid.internal.Z2 z22222 = c0646t2.b;
                        c0637s2.f6564a = c0646t2;
                        c0637s2.b = n2;
                        c0637s2.e = 6;
                        break;
                    case 6:
                        n2 = c0637s2.b;
                        c0646t2 = (com.plaid.internal.C0646t2) c0637s2.f6564a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.plaid.internal.G2 g22 = c0646t2.f6574a;
                        com.plaid.internal.A0 a0 = c0646t2.i;
                        c0637s2.f6564a = g22;
                        c0637s2.b = null;
                        c0637s2.e = 7;
                        java.lang.Object a3 = a0.a(n2, c0637s2);
                        if (a3 != coroutine_suspended) {
                            obj = a3;
                            g2 = g22;
                            com.plaid.internal.AbstractC0698z0 abstractC0698z0 = (com.plaid.internal.AbstractC0698z0) obj;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractC0698z0, "");
                            g2.f5792a.postValue(abstractC0698z0);
                            return kotlin.Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    case 7:
                        g2 = (com.plaid.internal.G2) c0637s2.f6564a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.plaid.internal.AbstractC0698z0 abstractC0698z02 = (com.plaid.internal.AbstractC0698z0) obj;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractC0698z02, "");
                        g2.f5792a.postValue(abstractC0698z02);
                        return kotlin.Unit.INSTANCE;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        c0637s2 = new com.plaid.internal.C0637s2(this, continuationImpl);
        java.lang.Object obj2 = c0637s2.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c0637s2.e) {
        }
    }
}
