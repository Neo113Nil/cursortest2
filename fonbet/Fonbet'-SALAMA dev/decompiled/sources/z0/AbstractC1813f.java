package z0;

import D6.C0130m;
import a.AbstractC0603a;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import i6.InterfaceC1287d;
import io.sentry.SentryBaseEvent;
import io.sentry.protocol.Response;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n.ExecutorC1441a;
import t6.h;

/* renamed from: z0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1813f {

    /* renamed from: a, reason: collision with root package name */
    public final TopicsManager f18437a;

    public AbstractC1813f(TopicsManager topicsManager) {
        h.e(topicsManager, "mTopicsManager");
        this.f18437a = topicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007e A[LOOP:0: B:11:0x0078->B:13:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object c(AbstractC1813f abstractC1813f, C1808a c1808a, InterfaceC1287d interfaceC1287d) {
        C1812e c1812e;
        int i7;
        List topics;
        Iterator it;
        long taxonomyVersion;
        long modelVersion;
        int topicId;
        if (interfaceC1287d instanceof C1812e) {
            c1812e = (C1812e) interfaceC1287d;
            int i8 = c1812e.f18436d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c1812e.f18436d = i8 - Integer.MIN_VALUE;
                Object obj = c1812e.f18434b;
                j6.a aVar = j6.a.f14642a;
                i7 = c1812e.f18436d;
                if (i7 != 0) {
                    AbstractC0603a.p0(obj);
                    GetTopicsRequest a2 = abstractC1813f.a(c1808a);
                    c1812e.f18433a = abstractC1813f;
                    c1812e.f18436d = 1;
                    C0130m c0130m = new C0130m(1, P6.b.v(c1812e));
                    c0130m.s();
                    abstractC1813f.f18437a.getTopics(a2, new ExecutorC1441a(1), new L.e(c0130m));
                    obj = c0130m.r();
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC1813f = c1812e.f18433a;
                    AbstractC0603a.p0(obj);
                }
                GetTopicsResponse j = io.flutter.plugin.editing.a.j(obj);
                abstractC1813f.getClass();
                h.e(j, Response.TYPE);
                ArrayList arrayList = new ArrayList();
                topics = j.getTopics();
                it = topics.iterator();
                while (it.hasNext()) {
                    Topic k7 = io.flutter.plugin.editing.a.k(it.next());
                    taxonomyVersion = k7.getTaxonomyVersion();
                    modelVersion = k7.getModelVersion();
                    topicId = k7.getTopicId();
                    arrayList.add(new C1810c(taxonomyVersion, modelVersion, topicId));
                }
                return new C1809b(arrayList);
            }
        }
        c1812e = new C1812e(abstractC1813f, interfaceC1287d);
        Object obj2 = c1812e.f18434b;
        j6.a aVar2 = j6.a.f14642a;
        i7 = c1812e.f18436d;
        if (i7 != 0) {
        }
        GetTopicsResponse j3 = io.flutter.plugin.editing.a.j(obj2);
        abstractC1813f.getClass();
        h.e(j3, Response.TYPE);
        ArrayList arrayList2 = new ArrayList();
        topics = j3.getTopics();
        it = topics.iterator();
        while (it.hasNext()) {
        }
        return new C1809b(arrayList2);
    }

    public GetTopicsRequest a(C1808a c1808a) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest build;
        h.e(c1808a, SentryBaseEvent.JsonKeys.REQUEST);
        adsSdkName = io.flutter.plugin.editing.a.f().setAdsSdkName("com.google.android.gms.ads");
        build = adsSdkName.build();
        h.d(build, "Builder()\n            .s…ame)\n            .build()");
        return build;
    }

    public Object b(C1808a c1808a, InterfaceC1287d interfaceC1287d) {
        return c(this, c1808a, interfaceC1287d);
    }
}
