package com.plaid.internal;

/* renamed from: com.plaid.internal.k6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0570k6 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.Z2 f6464a;
    public final com.plaid.internal.Y2 b;
    public final com.plaid.internal.N5 c;
    public final com.plaid.internal.C0457b1 d;
    public final com.plaid.internal.C0588m6 e;
    public final com.plaid.internal.L7 f;
    public com.plaid.link.SubmissionData g;

    @javax.inject.Inject
    public C0570k6(com.plaid.internal.Z2 z2, com.plaid.internal.Y2 y2, com.plaid.internal.N5 n5, com.plaid.internal.C0457b1 c0457b1, com.plaid.internal.C0588m6 c0588m6, com.plaid.internal.L7 l7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(z2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(y2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(n5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0457b1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0588m6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l7, "");
        this.f6464a = z2;
        this.b = y2;
        this.c = n5;
        this.d = c0457b1;
        this.e = c0588m6;
        this.f = l7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r11, r2, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b2, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r11, r2, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d2, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.plaid.internal.C0543h6(r2, r11, r10, null), r0) == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.plaid.link.OnLoadCallback onLoadCallback, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.C0516e6 c0516e6;
        int i;
        com.plaid.internal.C0570k6 c0570k6;
        if (continuationImpl instanceof com.plaid.internal.C0516e6) {
            c0516e6 = (com.plaid.internal.C0516e6) continuationImpl;
            int i2 = c0516e6.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0516e6.e = i2 - 2147483648;
                java.lang.Object obj = c0516e6.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0516e6.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    c0516e6.f6403a = this;
                    c0516e6.b = onLoadCallback;
                    c0516e6.e = 1;
                    obj = a(c0516e6);
                    if (obj != coroutine_suspended) {
                        c0570k6 = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2 && i != 3 && i != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                    com.plaid.internal.C0452a6.a.a("Preload link complete", true);
                    return kotlin.Unit.INSTANCE;
                }
                onLoadCallback = c0516e6.b;
                c0570k6 = c0516e6.f6403a;
                kotlin.ResultKt.throwOnFailure(obj);
                com.plaid.internal.AbstractC0606o6 abstractC0606o6 = (com.plaid.internal.AbstractC0606o6) obj;
                if (kotlinx.coroutines.JobKt.isActive(c0516e6.getContext())) {
                    return kotlin.Unit.INSTANCE;
                }
                com.plaid.internal.C0452a6.a aVar2 = com.plaid.internal.C0452a6.f5996a;
                com.plaid.internal.C0452a6.a.a("Preload Link ".concat(java.lang.String.valueOf(abstractC0606o6)), true);
                if (!kotlin.jvm.internal.Intrinsics.areEqual(abstractC0606o6, com.plaid.internal.AbstractC0606o6.a.f6519a)) {
                    if (abstractC0606o6 instanceof com.plaid.internal.AbstractC0606o6.d) {
                        if (onLoadCallback != null) {
                            kotlinx.coroutines.MainCoroutineDispatcher main = kotlinx.coroutines.Dispatchers.getMain();
                            com.plaid.internal.C0525f6 c0525f6 = new com.plaid.internal.C0525f6(onLoadCallback, null);
                            c0516e6.f6403a = null;
                            c0516e6.b = null;
                            c0516e6.e = 2;
                        }
                    } else if (abstractC0606o6 instanceof com.plaid.internal.AbstractC0606o6.b) {
                        if (onLoadCallback != null) {
                            kotlinx.coroutines.MainCoroutineDispatcher main2 = kotlinx.coroutines.Dispatchers.getMain();
                            com.plaid.internal.C0534g6 c0534g6 = new com.plaid.internal.C0534g6(onLoadCallback, null);
                            c0516e6.f6403a = null;
                            c0516e6.b = null;
                            c0516e6.e = 3;
                        }
                    } else if (abstractC0606o6 instanceof com.plaid.internal.AbstractC0606o6.c) {
                        java.lang.String a2 = ((com.plaid.internal.AbstractC0606o6.c) abstractC0606o6).a();
                        c0516e6.f6403a = null;
                        c0516e6.b = null;
                        c0516e6.e = 4;
                    }
                }
                com.plaid.internal.C0452a6.a aVar3 = com.plaid.internal.C0452a6.f5996a;
                com.plaid.internal.C0452a6.a.a("Preload link complete", true);
                return kotlin.Unit.INSTANCE;
            }
        }
        c0516e6 = new com.plaid.internal.C0516e6(this, continuationImpl);
        java.lang.Object obj2 = c0516e6.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0516e6.e;
        if (i != 0) {
        }
        com.plaid.internal.AbstractC0606o6 abstractC0606o62 = (com.plaid.internal.AbstractC0606o6) obj2;
        if (kotlinx.coroutines.JobKt.isActive(c0516e6.getContext())) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b4, code lost:
    
        if (r2.a(r10, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        if (r10 != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.C0552i6 c0552i6;
        int i;
        com.plaid.internal.C0570k6 c0570k6;
        if (continuationImpl instanceof com.plaid.internal.C0552i6) {
            c0552i6 = (com.plaid.internal.C0552i6) continuationImpl;
            int i2 = c0552i6.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0552i6.d = i2 - 2147483648;
                java.lang.Object obj = c0552i6.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0552i6.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!kotlinx.coroutines.JobKt.isActive(c0552i6.getContext())) {
                        return kotlin.Unit.INSTANCE;
                    }
                    com.plaid.internal.Z2 z2 = this.f6464a;
                    c0552i6.f6443a = this;
                    c0552i6.d = 1;
                    obj = z2.a(c0552i6);
                    if (obj != coroutine_suspended) {
                        c0570k6 = this;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    c0570k6 = c0552i6.f6443a;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    c0570k6 = c0552i6.f6443a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.N2 n2 = (com.plaid.internal.N2) obj;
                    if (!kotlinx.coroutines.JobKt.isActive(c0552i6.getContext())) {
                        return kotlin.Unit.INSTANCE;
                    }
                    com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                    com.plaid.internal.C0452a6.a.a("Preload workflow complete ".concat(java.lang.String.valueOf(n2)), true);
                    com.plaid.internal.Z2 z22 = c0570k6.f6464a;
                    c0552i6.f6443a = null;
                    c0552i6.d = 3;
                }
                com.plaid.internal.N2 n22 = (com.plaid.internal.N2) obj;
                if (kotlinx.coroutines.JobKt.isActive(c0552i6.getContext())) {
                    return kotlin.Unit.INSTANCE;
                }
                com.plaid.internal.C0452a6.a aVar2 = com.plaid.internal.C0452a6.f5996a;
                com.plaid.internal.C0452a6.a.a("Preload workflow from ".concat(java.lang.String.valueOf(n22)), true);
                com.plaid.internal.Y2 y2 = c0570k6.b;
                c0552i6.f6443a = c0570k6;
                c0552i6.d = 2;
                obj = y2.a(n22, true, (kotlin.coroutines.jvm.internal.ContinuationImpl) c0552i6);
            }
        }
        c0552i6 = new com.plaid.internal.C0552i6(this, continuationImpl);
        java.lang.Object obj2 = c0552i6.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0552i6.d;
        if (i != 0) {
        }
        com.plaid.internal.N2 n222 = (com.plaid.internal.N2) obj2;
        if (kotlinx.coroutines.JobKt.isActive(c0552i6.getContext())) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r1.toBoolean() == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.C0507d6 c0507d6;
        int i;
        com.plaid.internal.C0570k6 c0570k6;
        com.plaid.internal.N2 n2;
        if (continuationImpl instanceof com.plaid.internal.C0507d6) {
            c0507d6 = (com.plaid.internal.C0507d6) continuationImpl;
            int i2 = c0507d6.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0507d6.d = i2 - 2147483648;
                java.lang.Object obj = c0507d6.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0507d6.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.Z2 z2 = this.f6464a;
                    c0507d6.f6394a = this;
                    c0507d6.d = 1;
                    obj = z2.a(c0507d6);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c0570k6 = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0570k6 = c0507d6.f6394a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                n2 = (com.plaid.internal.N2) obj;
                if (!(n2 instanceof com.plaid.internal.N2.b)) {
                    return com.plaid.internal.AbstractC0606o6.a.f6519a;
                }
                if (!(n2 instanceof com.plaid.internal.N2.k)) {
                    return com.plaid.internal.AbstractC0606o6.d.f6521a;
                }
                com.plaid.internal.N2.k kVar = (com.plaid.internal.N2.k) n2;
                if (!kVar.k) {
                    com.plaid.internal.C0457b1 c0457b1 = c0570k6.d;
                    com.plaid.internal.EnumC0467c1 enumC0467c1 = com.plaid.internal.EnumC0467c1.BACKEND_DETERMINES;
                    if (enumC0467c1.isSet()) {
                        com.plaid.internal.C0457b1 c0457b12 = c0570k6.d;
                    }
                    return com.plaid.internal.AbstractC0606o6.d.f6521a;
                }
                if (kVar.j) {
                    return new com.plaid.internal.AbstractC0606o6.b(kVar.f);
                }
                return new com.plaid.internal.AbstractC0606o6.c(kVar.f);
            }
        }
        c0507d6 = new com.plaid.internal.C0507d6(this, continuationImpl);
        java.lang.Object obj2 = c0507d6.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0507d6.d;
        if (i != 0) {
        }
        n2 = (com.plaid.internal.N2) obj2;
        if (!(n2 instanceof com.plaid.internal.N2.b)) {
        }
    }
}
