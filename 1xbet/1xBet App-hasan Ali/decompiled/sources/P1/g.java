package P1;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import b4.EnumC0510a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;
import p4.C2268h;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final TopicsManager f4711a;

    public g(TopicsManager topicsManager) {
        l.f("mTopicsManager", topicsManager);
        this.f4711a = topicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007e A[LOOP:0: B:11:0x0078->B:13:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object c(g gVar, a aVar, a4.c<? super b> cVar) {
        f fVar;
        int i;
        List topics;
        Iterator it;
        long taxonomyVersion;
        long modelVersion;
        int topicId;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i5 = fVar.f4710n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                fVar.f4710n = i5 - Integer.MIN_VALUE;
                Object obj = fVar.f4708l;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = fVar.f4710n;
                if (i != 0) {
                    G4.l.N(obj);
                    GetTopicsRequest a5 = gVar.a(aVar);
                    fVar.f4707k = gVar;
                    fVar.f4710n = 1;
                    C2268h c2268h = new C2268h(1, AbstractC2346c.v(fVar));
                    c2268h.r();
                    gVar.f4711a.getTopics(a5, new O1.b(0), new j1.b(c2268h));
                    obj = c2268h.q();
                    if (obj == enumC0510a) {
                        return enumC0510a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = fVar.f4707k;
                    G4.l.N(obj);
                }
                GetTopicsResponse h3 = d.h(obj);
                gVar.getClass();
                l.f("response", h3);
                ArrayList arrayList = new ArrayList();
                topics = h3.getTopics();
                it = topics.iterator();
                while (it.hasNext()) {
                    Topic i6 = d.i(it.next());
                    taxonomyVersion = i6.getTaxonomyVersion();
                    modelVersion = i6.getModelVersion();
                    topicId = i6.getTopicId();
                    arrayList.add(new c(topicId, taxonomyVersion, modelVersion));
                }
                return new b(arrayList);
            }
        }
        fVar = new f(gVar, cVar);
        Object obj2 = fVar.f4708l;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = fVar.f4710n;
        if (i != 0) {
        }
        GetTopicsResponse h32 = d.h(obj2);
        gVar.getClass();
        l.f("response", h32);
        ArrayList arrayList2 = new ArrayList();
        topics = h32.getTopics();
        it = topics.iterator();
        while (it.hasNext()) {
        }
        return new b(arrayList2);
    }

    public GetTopicsRequest a(a aVar) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest build;
        l.f("request", aVar);
        adsSdkName = d.d().setAdsSdkName("com.google.android.gms.ads");
        build = adsSdkName.build();
        l.e("Builder()\n            .s…ame)\n            .build()", build);
        return build;
    }

    public Object b(a aVar, a4.c<? super b> cVar) {
        return c(this, aVar, cVar);
    }
}
