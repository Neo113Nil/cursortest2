package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Fm extends com.inmobi.media.AbstractC2525k2 {
    public final kotlinx.coroutines.CoroutineScope b;
    public final com.inmobi.media.Gm c;
    public final kotlinx.coroutines.flow.MutableSharedFlow d;
    public final com.inmobi.media.C2799u9 e;
    public final java.util.ArrayList f;
    public final java.util.ArrayList g;
    public com.inmobi.media.InterfaceC2588mc h;
    public com.inmobi.media.O3 i;
    public android.view.ViewGroup j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fm(android.content.Context context, kotlinx.coroutines.CoroutineScope coroutineScope, com.inmobi.media.Gm videoExperienceModel, kotlinx.coroutines.flow.MutableSharedFlow mediaEventFlow, com.inmobi.media.C2799u9 c2799u9) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoExperienceModel, "videoExperienceModel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaEventFlow, "mediaEventFlow");
        this.b = coroutineScope;
        this.c = videoExperienceModel;
        this.d = mediaEventFlow;
        this.e = c2799u9;
        this.f = new java.util.ArrayList();
        this.g = new java.util.ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (b(r0) != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.inmobi.media.AbstractC2525k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2759sm c2759sm;
        int i;
        com.inmobi.media.Fm fm;
        if (continuationImpl instanceof com.inmobi.media.C2759sm) {
            c2759sm = (com.inmobi.media.C2759sm) continuationImpl;
            int i2 = c2759sm.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2759sm.d = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = c2759sm.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2759sm.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2799u9 c2799u9 = this.e;
                    if (c2799u9 != null) {
                        c2799u9.a("VideoExperienceManager", "load Called - mediaFiles count: " + this.c.c.size());
                    }
                    kotlinx.coroutines.MainCoroutineDispatcher main = kotlinx.coroutines.Dispatchers.getMain();
                    com.inmobi.media.C2785tm c2785tm = new com.inmobi.media.C2785tm(this, null);
                    c2759sm.f5452a = this;
                    c2759sm.d = 1;
                    obj = kotlinx.coroutines.BuildersKt.withContext(main, c2785tm, c2759sm);
                    if (obj != coroutine_suspended) {
                        fm = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                fm = c2759sm.f5452a;
                kotlin.ResultKt.throwOnFailure(obj);
                fm.h = (com.inmobi.media.InterfaceC2588mc) obj;
                c2759sm.f5452a = null;
                c2759sm.d = 2;
            }
        }
        c2759sm = new com.inmobi.media.C2759sm(this, continuationImpl);
        java.lang.Object obj2 = c2759sm.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2759sm.d;
        if (i != 0) {
        }
        fm.h = (com.inmobi.media.InterfaceC2588mc) obj2;
        c2759sm.f5452a = null;
        c2759sm.d = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x009a, code lost:
    
        if (r12 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4 A[LOOP:0: B:21:0x00ae->B:23:0x00b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2812um c2812um;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        java.util.Iterator it;
        com.inmobi.media.InterfaceC2588mc interfaceC2588mc;
        com.inmobi.media.Fm fm;
        com.inmobi.media.C2799u9 c2799u9;
        if (continuationImpl instanceof com.inmobi.media.C2812um) {
            c2812um = (com.inmobi.media.C2812um) continuationImpl;
            int i2 = c2812um.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2812um.d = i2 - Integer.MIN_VALUE;
                obj = c2812um.b;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2812um.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2799u9 c2799u92 = this.e;
                    if (c2799u92 != null) {
                        c2799u92.a("VideoExperienceManager", "loadVideoExperience - getting sorted media files");
                    }
                    c2812um.d = 1;
                    java.util.ArrayList mediaFiles = this.c.c;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it2 = mediaFiles.iterator();
                    while (it2.hasNext()) {
                        java.lang.Object next = it2.next();
                        com.inmobi.media.Gl gl = (com.inmobi.media.Gl) next;
                        if (android.webkit.URLUtil.isHttpUrl(gl.c) || android.webkit.URLUtil.isHttpsUrl(gl.c)) {
                            arrayList.add(next);
                        }
                    }
                    obj = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new com.inmobi.media.Mm(arrayList, com.inmobi.media.AbstractC2283am.a(this.c.f4731a) / 1000, this.c.d, null), c2812um);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        fm = c2812um.f5493a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        fm.j = (android.view.ViewGroup) obj;
                        c2799u9 = this.e;
                        if (c2799u9 != null) {
                            c2799u9.a("VideoExperienceManager", "Video Experience Load Success");
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.util.List list = (java.util.List) obj;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((com.inmobi.media.Gl) it.next()).c);
                }
                interfaceC2588mc = this.h;
                if (interfaceC2588mc == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
                    interfaceC2588mc = null;
                }
                c2812um.f5493a = this;
                c2812um.d = 2;
                obj = ((com.inmobi.media.C2275ae) interfaceC2588mc).a(arrayList2, c2812um);
                if (obj != coroutine_suspended) {
                    fm = this;
                    fm.j = (android.view.ViewGroup) obj;
                    c2799u9 = this.e;
                    if (c2799u9 != null) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
        }
        c2812um = new com.inmobi.media.C2812um(this, continuationImpl);
        obj = c2812um.b;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2812um.d;
        if (i != 0) {
        }
        java.util.List list2 = (java.util.List) obj;
        java.util.ArrayList arrayList22 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        it = list2.iterator();
        while (it.hasNext()) {
        }
        interfaceC2588mc = this.h;
        if (interfaceC2588mc == null) {
        }
        c2812um.f5493a = this;
        c2812um.d = 2;
        obj = ((com.inmobi.media.C2275ae) interfaceC2588mc).a(arrayList22, c2812um);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r8.b, null, null, new com.inmobi.media.C2864wm(r0, null, r8), 3, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        kotlinx.coroutines.Job launch$default;
        com.inmobi.media.C2799u9 c2799u9 = this.e;
        if (c2799u9 != null) {
            c2799u9.a("VideoExperienceManager", "observeCompanionAdEvents - setting up companion ad event observers");
        }
        if (this.c.b.isEmpty()) {
            return;
        }
        com.inmobi.media.C2799u9 c2799u92 = this.e;
        if (c2799u92 != null) {
            c2799u92.a("VideoExperienceManager", "observeCompanionAdEvents - collecting companion ad events");
        }
        com.inmobi.media.O3 o3 = this.i;
        if (o3 != null && (r0 = o3.d) != null && launch$default != null) {
            java.util.ArrayList activeJobs = this.f;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(launch$default, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeJobs, "activeJobs");
            activeJobs.add(launch$default);
        }
        com.inmobi.media.C2799u9 c2799u93 = this.e;
        if (c2799u93 != null) {
            c2799u93.a("VideoExperienceManager", "observeCompanionAdEvents - companion ad event observer setup complete");
        }
    }

    @Override // com.inmobi.media.AbstractC2525k2
    public final java.lang.Object a(android.widget.FrameLayout frameLayout, com.inmobi.media.C2747sc c2747sc) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.inmobi.media.C2730rm(this, frameLayout, null), c2747sc);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    @Override // com.inmobi.media.AbstractC2525k2
    public final void a(kotlinx.coroutines.flow.MutableStateFlow windowFlow) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowFlow, "windowFlow");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new com.inmobi.media.C2679pm(windowFlow, null, this), 3, null);
        java.util.ArrayList activeJobs = this.g;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(launch$default, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeJobs, "activeJobs");
        activeJobs.add(launch$default);
    }

    @Override // com.inmobi.media.AbstractC2525k2
    public final void a() {
        com.inmobi.media.C2799u9 c2799u9 = this.e;
        if (c2799u9 != null) {
            c2799u9.a("VideoExperienceManager", "destroy");
        }
        b();
        com.inmobi.media.InterfaceC2588mc interfaceC2588mc = this.h;
        if (interfaceC2588mc != null) {
            com.inmobi.media.C2275ae c2275ae = (com.inmobi.media.C2275ae) interfaceC2588mc;
            com.inmobi.media.C2799u9 c2799u92 = c2275ae.c;
            if (c2799u92 != null) {
                c2799u92.a("NativeMediaPlayer", "destroy called");
            }
            c2275ae.e = com.inmobi.media.Bg.h;
            com.inmobi.media.T4.a(c2275ae.d);
            c2275ae.k.b();
            com.inmobi.media.C2486ie c2486ie = c2275ae.i;
            c2486ie.g.removeAllViews();
            c2486ie.f.d();
            c2275ae.j.c();
            c2275ae.g.removeAllViews();
            c2275ae.h.release();
        }
        com.inmobi.media.T4.a(this.g);
        com.inmobi.media.O3 o3 = this.i;
        if (o3 != null) {
            o3.a();
        }
    }

    @Override // com.inmobi.media.AbstractC2525k2
    public final void b() {
        com.inmobi.media.T4.a(this.b, new com.inmobi.media.C2705qm(this, null));
        com.inmobi.media.InterfaceC2588mc interfaceC2588mc = this.h;
        if (interfaceC2588mc == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
            interfaceC2588mc = null;
        }
        com.inmobi.media.C2275ae c2275ae = (com.inmobi.media.C2275ae) interfaceC2588mc;
        c2275ae.j.c();
        com.inmobi.media.Gn gn = c2275ae.k;
        com.inmobi.media.Zj zj = gn.h;
        if (zj != null) {
            zj.b();
        }
        gn.d.set(false);
        com.inmobi.media.Fg fg = (com.inmobi.media.Fg) gn.i.d.getValue();
        fg.f.set(true);
        com.inmobi.media.L6.a(fg.e);
        fg.e = null;
        com.inmobi.media.T4.a(gn.e);
        com.inmobi.media.T4.a(c2275ae.d);
        com.inmobi.media.T4.a(this.f);
    }
}
