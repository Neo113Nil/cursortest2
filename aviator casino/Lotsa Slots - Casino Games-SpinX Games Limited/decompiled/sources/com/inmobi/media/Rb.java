package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Rb {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4937a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;
    public final java.lang.ref.WeakReference f;
    public final java.util.concurrent.atomic.AtomicBoolean g;

    public Rb(android.content.Context context, java.lang.String url, long j, long j2, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        this.f4937a = url;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = i2;
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(context);
        this.f = weakReference;
        this.g = new java.util.concurrent.atomic.AtomicBoolean(false);
        android.content.Context context2 = (android.content.Context) weakReference.get();
        if (context2 != null) {
            kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2273ac.f5097a;
            com.inmobi.media.Zb.a(new com.inmobi.media.Qb(this, context2, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(android.content.Context context, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Nb nb;
        int i;
        android.content.Context context2;
        java.util.Iterator it;
        if (continuationImpl instanceof com.inmobi.media.Nb) {
            nb = (com.inmobi.media.Nb) continuationImpl;
            int i2 = nb.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nb.e = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = nb.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nb.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.g.get()) {
                        return kotlin.Unit.INSTANCE;
                    }
                    com.inmobi.media.Fb fb = (com.inmobi.media.Fb) com.inmobi.media.Gb.f4724a.getValue();
                    nb.f4853a = context;
                    nb.e = 1;
                    obj = fb.a(nb);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = nb.b;
                        context2 = nb.f4853a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        while (it.hasNext()) {
                            com.inmobi.media.C2904yb c2904yb = (com.inmobi.media.C2904yb) it.next();
                            java.lang.String str = this.f4937a;
                            nb.f4853a = context2;
                            nb.b = it;
                            nb.e = 2;
                            if (b(str, c2904yb, nb) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    context = nb.f4853a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                context2 = context;
                it = ((java.util.List) obj).iterator();
                while (it.hasNext()) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        nb = new com.inmobi.media.Nb(this, continuationImpl);
        java.lang.Object obj2 = nb.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nb.e;
        if (i != 0) {
        }
        context2 = context;
        it = ((java.util.List) obj2).iterator();
        while (it.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0137, code lost:
    
        if (a(r2, r4) == r5) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0107, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r11, r4) != r5) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b2, code lost:
    
        if (r6 == r5) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x011b -> B:20:0x0122). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(java.lang.String str, com.inmobi.media.C2904yb c2904yb, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Pb pb;
        java.lang.Object coroutine_suspended;
        int i;
        java.lang.Object a2;
        com.inmobi.media.Ve ve;
        java.lang.String str2;
        com.inmobi.media.C2904yb c2904yb2;
        com.inmobi.media.Pb pb2;
        java.lang.Object obj;
        int i2;
        com.inmobi.media.C2904yb c2904yb3;
        com.inmobi.media.Fb fb;
        java.lang.String str3 = str;
        com.inmobi.media.C2904yb c2904yb4 = c2904yb;
        if (continuationImpl instanceof com.inmobi.media.Pb) {
            pb = (com.inmobi.media.Pb) continuationImpl;
            int i3 = pb.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pb.f = i3 - Integer.MIN_VALUE;
                java.lang.Object obj2 = pb.d;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pb.f;
                int i4 = 1;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    if (this.g.get()) {
                        return kotlin.Unit.INSTANCE;
                    }
                    if (c2904yb4.d != 0 && java.lang.System.currentTimeMillis() - c2904yb4.d < this.b) {
                        return kotlin.Unit.INSTANCE;
                    }
                    pb.f4894a = str3;
                    pb.b = c2904yb4;
                    pb.f = 1;
                    a2 = a(str3, c2904yb4, pb);
                } else if (i == 1) {
                    com.inmobi.media.C2904yb c2904yb5 = pb.b;
                    java.lang.String str4 = pb.f4894a;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    a2 = obj2;
                    c2904yb4 = c2904yb5;
                    str3 = str4;
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            c2904yb2 = pb.c;
                            c2904yb4 = pb.b;
                            str2 = pb.f4894a;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            com.inmobi.media.C2904yb c2904yb6 = c2904yb4;
                            com.inmobi.media.C2904yb c2904yb7 = c2904yb2;
                            pb.f4894a = str2;
                            pb.b = c2904yb6;
                            pb.c = null;
                            pb.f = 4;
                            java.lang.Object a3 = a(str2, c2904yb7, pb);
                            if (a3 != coroutine_suspended) {
                                c2904yb4 = c2904yb6;
                                str3 = str2;
                                pb2 = pb;
                                obj = a3;
                                i4 = 1;
                                com.inmobi.media.Pb pb3 = pb2;
                                ve = (com.inmobi.media.Ve) obj;
                                pb = pb3;
                                if (ve == null) {
                                }
                                c2904yb3 = new com.inmobi.media.C2904yb(c2904yb4.f5568a, c2904yb4.b, i2, java.lang.System.currentTimeMillis(), false, 0, 48);
                                fb = (com.inmobi.media.Fb) com.inmobi.media.Gb.f4724a.getValue();
                                pb.f4894a = str3;
                                pb.b = c2904yb4;
                                pb.c = c2904yb3;
                                pb.f = 2;
                                if (fb.b(c2904yb3, pb) != coroutine_suspended) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        if (i != 4) {
                            if (i != 5) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj2);
                            return kotlin.Unit.INSTANCE;
                        }
                        com.inmobi.media.C2904yb c2904yb8 = pb.b;
                        java.lang.String str5 = pb.f4894a;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        pb2 = pb;
                        obj = obj2;
                        c2904yb4 = c2904yb8;
                        str3 = str5;
                        i4 = 1;
                        com.inmobi.media.Pb pb32 = pb2;
                        ve = (com.inmobi.media.Ve) obj;
                        pb = pb32;
                        if (!(ve == null && com.inmobi.media.AbstractC2889xl.a(ve) == i4) && (i2 = c2904yb4.c + i4) < this.d) {
                            c2904yb3 = new com.inmobi.media.C2904yb(c2904yb4.f5568a, c2904yb4.b, i2, java.lang.System.currentTimeMillis(), false, 0, 48);
                            fb = (com.inmobi.media.Fb) com.inmobi.media.Gb.f4724a.getValue();
                            pb.f4894a = str3;
                            pb.b = c2904yb4;
                            pb.c = c2904yb3;
                            pb.f = 2;
                            if (fb.b(c2904yb3, pb) != coroutine_suspended) {
                                str2 = str3;
                                c2904yb2 = c2904yb3;
                                long j = this.b;
                                pb.f4894a = str2;
                                pb.b = c2904yb4;
                                pb.c = c2904yb2;
                                pb.f = 3;
                            }
                        } else {
                            pb.f4894a = null;
                            pb.b = null;
                            pb.f = 5;
                        }
                        return coroutine_suspended;
                    }
                    c2904yb2 = pb.c;
                    c2904yb4 = pb.b;
                    str2 = pb.f4894a;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    long j2 = this.b;
                    pb.f4894a = str2;
                    pb.b = c2904yb4;
                    pb.c = c2904yb2;
                    pb.f = 3;
                }
                ve = (com.inmobi.media.Ve) a2;
                if (ve == null) {
                }
                c2904yb3 = new com.inmobi.media.C2904yb(c2904yb4.f5568a, c2904yb4.b, i2, java.lang.System.currentTimeMillis(), false, 0, 48);
                fb = (com.inmobi.media.Fb) com.inmobi.media.Gb.f4724a.getValue();
                pb.f4894a = str3;
                pb.b = c2904yb4;
                pb.c = c2904yb3;
                pb.f = 2;
                if (fb.b(c2904yb3, pb) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        }
        pb = new com.inmobi.media.Pb(this, continuationImpl);
        java.lang.Object obj22 = pb.d;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pb.f;
        int i42 = 1;
        if (i != 0) {
        }
        ve = (com.inmobi.media.Ve) a2;
        if (ve == null) {
        }
        c2904yb3 = new com.inmobi.media.C2904yb(c2904yb4.f5568a, c2904yb4.b, i2, java.lang.System.currentTimeMillis(), false, 0, 48);
        fb = (com.inmobi.media.Fb) com.inmobi.media.Gb.f4724a.getValue();
        pb.f4894a = str3;
        pb.b = c2904yb4;
        pb.c = c2904yb3;
        pb.f = 2;
        if (fb.b(c2904yb3, pb) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String url, com.inmobi.media.C2904yb data, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Ob ob;
        int i;
        try {
            if (continuationImpl instanceof com.inmobi.media.Ob) {
                ob = (com.inmobi.media.Ob) continuationImpl;
                int i2 = ob.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ob.c = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = ob.f4874a;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = ob.c;
                    if (i == 0) {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.B9 b9 = (com.inmobi.media.B9) com.inmobi.media.Pe.h.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "loggingUrl");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                    com.inmobi.media.Te te = new com.inmobi.media.Te(url, null, null, new com.inmobi.media.W6(data.f5568a), null, 54);
                    ob.c = 1;
                    java.lang.Object a2 = b9.f4618a.a(te, ob);
                    return a2 == coroutine_suspended ? coroutine_suspended : a2;
                }
            }
            if (i == 0) {
            }
        } catch (java.lang.IllegalStateException unused) {
            return null;
        }
        ob = new com.inmobi.media.Ob(this, continuationImpl);
        java.lang.Object obj2 = ob.f4874a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ob.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b7, code lost:
    
        if (r7 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b9, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0055, code lost:
    
        if (r7.a(r6, r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00b7 -> B:11:0x00ba). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.inmobi.media.C2904yb c2904yb, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Mb mb;
        int i;
        android.content.Context context;
        java.util.List emptyList;
        java.util.Iterator it;
        if (continuationImpl instanceof com.inmobi.media.Mb) {
            mb = (com.inmobi.media.Mb) continuationImpl;
            int i2 = mb.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mb.e = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = mb.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mb.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.AbstractC2299bc.a(c2904yb.f5568a);
                    com.inmobi.media.Fb fb = (com.inmobi.media.Fb) com.inmobi.media.Gb.f4724a.getValue();
                    java.lang.String str = c2904yb.f5568a;
                    mb.e = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.lang.String str2 = mb.b;
                        it = mb.f4835a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            com.inmobi.media.AbstractC2299bc.a(str2);
                        }
                        if (it.hasNext()) {
                            str2 = (java.lang.String) it.next();
                            com.inmobi.media.Fb fb2 = (com.inmobi.media.Fb) com.inmobi.media.Gb.f4724a.getValue();
                            mb.f4835a = it;
                            mb.b = str2;
                            mb.e = 2;
                            obj = fb2.b(str2, mb);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                context = (android.content.Context) this.f.get();
                if (context != null) {
                    kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2273ac.f5097a;
                    java.lang.String directoryPath = com.inmobi.media.Zb.a(context);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directoryPath, "directoryPath");
                    java.io.File file = new java.io.File(directoryPath);
                    if (file.exists() && file.isDirectory()) {
                        java.lang.String[] list = file.list();
                        if (list == null || (emptyList = kotlin.collections.ArraysKt.toList(list)) == null) {
                            emptyList = kotlin.collections.CollectionsKt.emptyList();
                        }
                    } else {
                        emptyList = kotlin.collections.CollectionsKt.emptyList();
                    }
                    it = emptyList.iterator();
                    if (it.hasNext()) {
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        mb = new com.inmobi.media.Mb(this, continuationImpl);
        java.lang.Object obj2 = mb.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mb.e;
        if (i != 0) {
        }
        context = (android.content.Context) this.f.get();
        if (context != null) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
