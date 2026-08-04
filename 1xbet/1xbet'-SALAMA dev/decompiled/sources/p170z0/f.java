package p170z0;

import D6.C0130m;
import L.e;
import P6.b;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import io.sentry.SentryBaseEvent;
import io.sentry.protocol.Response;
import j6.a;
import java.util.ArrayList;
import java.util.Iterator;
import p065i6.d;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopicsManager f18443a;

    public f(TopicsManager topicsManager) {
        h.e(topicsManager, "mTopicsManager");
        this.f18443a = topicsManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object c(f fVar, a aVar, d dVar) {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i7 = eVar.f18442d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                eVar.f18442d = i7 - Integer.MIN_VALUE;
            } else {
                eVar = new e(fVar, dVar);
            }
        } else {
            eVar = new e(fVar, dVar);
        }
        Object objR = eVar.f18440b;
        a aVar2 = a.f14648a;
        int i8 = eVar.f18442d;
        if (i8 == 0) {
            p003a.a.p0(objR);
            GetTopicsRequest getTopicsRequestA = fVar.a(aVar);
            eVar.f18439a = fVar;
            eVar.f18442d = 1;
            C0130m c0130m = new C0130m(1, b.v(eVar));
            c0130m.s();
            fVar.f18443a.getTopics(getTopicsRequestA, new p094n.a(1), new e(c0130m));
            objR = c0130m.r();
            if (objR == aVar2) {
                return aVar2;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = eVar.f18439a;
            p003a.a.p0(objR);
        }
        GetTopicsResponse getTopicsResponseJ = io.flutter.plugin.editing.a.j(objR);
        fVar.getClass();
        h.e(getTopicsResponseJ, Response.TYPE);
        ArrayList arrayList = new ArrayList();
        Iterator it = getTopicsResponseJ.getTopics().iterator();
        while (it.hasNext()) {
            Topic topicK = io.flutter.plugin.editing.a.k(it.next());
            arrayList.add(new c(topicK.getTaxonomyVersion(), topicK.getModelVersion(), topicK.getTopicId()));
        }
        return new b(arrayList);
    }

    public GetTopicsRequest a(a aVar) {
        h.e(aVar, SentryBaseEvent.JsonKeys.REQUEST);
        GetTopicsRequest getTopicsRequestBuild = io.flutter.plugin.editing.a.f().setAdsSdkName("com.google.android.gms.ads").build();
        h.d(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }

    public Object b(a aVar, d dVar) {
        return c(this, aVar, dVar);
    }
}
