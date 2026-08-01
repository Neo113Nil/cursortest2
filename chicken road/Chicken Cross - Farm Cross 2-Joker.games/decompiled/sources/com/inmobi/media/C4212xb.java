package com.inmobi.media;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* renamed from: com.inmobi.media.xb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4212xb {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f7475a;
    public final String b;
    public final Map c;

    public C4212xb(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f7475a = coroutineScope;
        this.b = "xb";
        this.c = Collections.synchronizedMap(new LinkedHashMap());
    }

    public final void a(final String id, Function2 block) {
        final Job launch$default;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(block, "block");
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.f7475a, null, null, new C4185wb(block, null), 3, null);
        Map jobMap = this.c;
        Intrinsics.checkNotNullExpressionValue(jobMap, "jobMap");
        Object obj = jobMap.get(id);
        if (obj == null) {
            obj = new CopyOnWriteArrayList();
            jobMap.put(id, obj);
        }
        ((List) obj).add(launch$default);
        launch$default.invokeOnCompletion(new Function1() { // from class: com.inmobi.media.xb$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return C4212xb.a(C4212xb.this, id, launch$default, (Throwable) obj2);
            }
        });
    }

    public static final Unit a(C4212xb c4212xb, String str, Job job, Throwable th) {
        String tag = c4212xb.b;
        Intrinsics.checkNotNullExpressionValue(tag, "tag");
        List list = (List) c4212xb.c.get(str);
        if (list != null) {
            list.remove(job);
        }
        return Unit.INSTANCE;
    }
}
