package com.inmobi.media;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes6.dex */
public final class Bo extends G2 {
    public final CoroutineScope b;
    public final Co c;
    public final MutableSharedFlow d;
    public final Z9 e;
    public final ArrayList f;
    public final ArrayList g;
    public InterfaceC3679ed h;
    public C3868l4 i;
    public ViewGroup j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bo(Context context, CoroutineScope coroutineScope, Co videoExperienceModel, MutableSharedFlow mediaEventFlow, Z9 z9) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(videoExperienceModel, "videoExperienceModel");
        Intrinsics.checkNotNullParameter(mediaEventFlow, "mediaEventFlow");
        this.b = coroutineScope;
        this.c = videoExperienceModel;
        this.d = mediaEventFlow;
        this.e = z9;
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        if (b(r0) != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.inmobi.media.G2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        C3975oo c3975oo;
        int i;
        Bo bo;
        if (continuationImpl instanceof C3975oo) {
            c3975oo = (C3975oo) continuationImpl;
            int i2 = c3975oo.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3975oo.d = i2 - Integer.MIN_VALUE;
                Object obj = c3975oo.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c3975oo.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Z9 z9 = this.e;
                    if (z9 != null) {
                        z9.a("VideoExperienceManager", "load Called - mediaFiles count: " + this.c.c.size());
                    }
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    C4003po c4003po = new C4003po(this, null);
                    c3975oo.f7294a = this;
                    c3975oo.d = 1;
                    obj = BuildersKt.withContext(main, c4003po, c3975oo);
                    if (obj != coroutine_suspended) {
                        bo = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                bo = c3975oo.f7294a;
                ResultKt.throwOnFailure(obj);
                bo.h = (InterfaceC3679ed) obj;
                c3975oo.f7294a = null;
                c3975oo.d = 2;
            }
        }
        c3975oo = new C3975oo(this, continuationImpl);
        Object obj2 = c3975oo.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3975oo.d;
        if (i != 0) {
        }
        bo.h = (InterfaceC3679ed) obj2;
        c3975oo.f7294a = null;
        c3975oo.d = 2;
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
    public final Object b(ContinuationImpl continuationImpl) {
        C4031qo c4031qo;
        Object obj;
        Object coroutine_suspended;
        int i;
        Iterator it;
        InterfaceC3679ed interfaceC3679ed;
        Bo bo;
        Z9 z9;
        if (continuationImpl instanceof C4031qo) {
            c4031qo = (C4031qo) continuationImpl;
            int i2 = c4031qo.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4031qo.d = i2 - Integer.MIN_VALUE;
                obj = c4031qo.b;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4031qo.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Z9 z92 = this.e;
                    if (z92 != null) {
                        z92.a("VideoExperienceManager", "loadVideoExperience - getting sorted media files");
                    }
                    c4031qo.d = 1;
                    ArrayList mediaFiles = this.c.c;
                    Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = mediaFiles.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        Bn bn = (Bn) next;
                        if (URLUtil.isHttpUrl(bn.c) || URLUtil.isHttpsUrl(bn.c)) {
                            arrayList.add(next);
                        }
                    }
                    obj = CoroutineScopeKt.coroutineScope(new Io(arrayList, Vn.a(this.c.f6501a) / 1000, this.c.d, null), c4031qo);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bo = c4031qo.f7335a;
                        ResultKt.throwOnFailure(obj);
                        bo.j = (ViewGroup) obj;
                        z9 = this.e;
                        if (z9 != null) {
                            z9.a("VideoExperienceManager", "Video Experience Load Success");
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                List list = (List) obj;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((Bn) it.next()).c);
                }
                interfaceC3679ed = this.h;
                if (interfaceC3679ed == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
                    interfaceC3679ed = null;
                }
                c4031qo.f7335a = this;
                c4031qo.d = 2;
                obj = ((Te) interfaceC3679ed).a(arrayList2, c4031qo);
                if (obj != coroutine_suspended) {
                    bo = this;
                    bo.j = (ViewGroup) obj;
                    z9 = this.e;
                    if (z9 != null) {
                    }
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
        }
        c4031qo = new C4031qo(this, continuationImpl);
        obj = c4031qo.b;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4031qo.d;
        if (i != 0) {
        }
        List list2 = (List) obj;
        ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        it = list2.iterator();
        while (it.hasNext()) {
        }
        interfaceC3679ed = this.h;
        if (interfaceC3679ed == null) {
        }
        c4031qo.f7335a = this;
        c4031qo.d = 2;
        obj = ((Te) interfaceC3679ed).a(arrayList22, c4031qo);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r8.b, null, null, new com.inmobi.media.C4087so(r0, null, r8), 3, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        Job launch$default;
        Z9 z9 = this.e;
        if (z9 != null) {
            z9.a("VideoExperienceManager", "observeCompanionAdEvents - setting up companion ad event observers");
        }
        if (this.c.b.isEmpty()) {
            return;
        }
        Z9 z92 = this.e;
        if (z92 != null) {
            z92.a("VideoExperienceManager", "observeCompanionAdEvents - collecting companion ad events");
        }
        C3868l4 c3868l4 = this.i;
        if (c3868l4 != null && (r0 = c3868l4.d) != null && launch$default != null) {
            ArrayList activeJobs = this.f;
            Intrinsics.checkNotNullParameter(launch$default, "<this>");
            Intrinsics.checkNotNullParameter(activeJobs, "activeJobs");
            activeJobs.add(launch$default);
        }
        Z9 z93 = this.e;
        if (z93 != null) {
            z93.a("VideoExperienceManager", "observeCompanionAdEvents - companion ad event observer setup complete");
        }
    }

    @Override // com.inmobi.media.G2
    public final Object a(FrameLayout frameLayout, C3849kd c3849kd) {
        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new C3946no(this, frameLayout, null), c3849kd);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    @Override // com.inmobi.media.G2
    public final void a(MutableStateFlow windowFlow) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(windowFlow, "windowFlow");
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new C3890lo(windowFlow, null, this), 3, null);
        ArrayList activeJobs = this.g;
        Intrinsics.checkNotNullParameter(launch$default, "<this>");
        Intrinsics.checkNotNullParameter(activeJobs, "activeJobs");
        activeJobs.add(launch$default);
    }

    @Override // com.inmobi.media.G2
    public final void a() {
        Z9 z9 = this.e;
        if (z9 != null) {
            z9.a("VideoExperienceManager", "destroy");
        }
        b();
        InterfaceC3679ed interfaceC3679ed = this.h;
        if (interfaceC3679ed != null) {
            ((Te) interfaceC3679ed).a();
        }
        AbstractC4012q5.a(this.g);
        C3868l4 c3868l4 = this.i;
        if (c3868l4 != null) {
            c3868l4.a();
        }
    }

    @Override // com.inmobi.media.G2
    public final void b() {
        AbstractC4012q5.a(this.b, new C3918mo(this, null));
        InterfaceC3679ed interfaceC3679ed = this.h;
        if (interfaceC3679ed == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
            interfaceC3679ed = null;
        }
        Te te = (Te) interfaceC3679ed;
        te.l.c();
        Dp dp = te.m;
        InterfaceC4141ul interfaceC4141ul = dp.h;
        if (interfaceC4141ul != null) {
            interfaceC4141ul.b();
        }
        dp.d.set(false);
        Oh oh = (Oh) dp.i.d.getValue();
        oh.f.set(true);
        AbstractC3787i7.a(oh.e);
        oh.e = null;
        AbstractC4012q5.a(dp.e);
        AbstractC4012q5.a(te.d);
        AbstractC4012q5.a(this.f);
    }
}
