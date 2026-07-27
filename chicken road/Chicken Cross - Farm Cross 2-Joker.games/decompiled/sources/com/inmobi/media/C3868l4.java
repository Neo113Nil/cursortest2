package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* renamed from: com.inmobi.media.l4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3868l4 {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f7215a;
    public final C4178w4 b;
    public final Z9 c;
    public final MutableSharedFlow d;
    public Job e;
    public View f;
    public C4251yn g;
    public Zk h;
    public AbstractC4011q4 i;
    public final C4151v4 j;

    public C3868l4(Context context, CoroutineScope coroutineScope, C4178w4 companionTelemetryHelper, Z9 z9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(companionTelemetryHelper, "companionTelemetryHelper");
        this.f7215a = coroutineScope;
        this.b = companionTelemetryHelper;
        this.c = z9;
        this.d = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.i = C3926n4.f7259a;
        this.j = new C4151v4(context, z9);
    }

    public final void a(ArrayList companionAds) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(companionAds, "companionAds");
        if (companionAds.isEmpty()) {
            return;
        }
        if (!Intrinsics.areEqual(this.i, C3926n4.f7259a)) {
            String str = "Calling Inflate on Invalid State: " + this.i;
            return;
        }
        Map a2 = AbstractC4169vm.a(this.b.f7451a);
        C3829jm c3829jm = C3829jm.f7187a;
        C3829jm.b("CompanionAdAvailable", a2, EnumC3944nm.f7271a);
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.f7215a, null, null, new C3839k4(this, companionAds, null), 3, null);
        this.e = launch$default;
    }

    public final void b() {
        View view = this.f;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.l4$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C3868l4.a(C3868l4.this, view2);
                }
            });
        }
    }

    public static final void a(C3868l4 c3868l4, View view) {
        C4251yn c4251yn = c3868l4.g;
        if (c4251yn != null) {
            List plus = CollectionsKt.plus((Collection) c4251yn.b, (Iterable) c4251yn.c);
            ArrayList arrayList = new ArrayList();
            for (Object obj : plus) {
                if (Intrinsics.areEqual(((C4189wf) obj).b, "click")) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C4189wf) it.next()).f7460a);
            }
            AbstractC4012q5.a(c3868l4.d, c3868l4.f7215a, new C4039r4(arrayList2));
        }
    }

    public final void a() {
        ViewParent parent;
        Z9 z9 = this.c;
        if (z9 != null) {
            z9.a("CompanionAdManager", "destroy");
        }
        Zk zk = this.h;
        if (zk != null) {
            Picasso picasso = Ug.f6893a;
            Ug.b(zk.f6996a).cancelTag(zk.c);
        }
        AbstractC3787i7.a(this.e);
        View view = this.f;
        if (view != null && (parent = view.getParent()) != null) {
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.f);
            }
        }
        this.e = null;
        this.h = null;
        this.f = null;
        this.i = C3926n4.f7259a;
    }
}
