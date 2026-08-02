package game.betting133.sports1xbet.aqua_network;

import D4.f;
import F3.m;
import O4.C0256b;
import O4.C0257c;
import O4.ExecutorC0255a;
import O4.L;
import O4.T;
import Q2.C0375o;
import a4.c;
import com.google.android.gms.internal.ads.C1234l6;
import java.lang.reflect.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.l;
import o4.AbstractC2234l;
import y4.n;
import y4.o;
import y4.t;
import y4.u;
import y4.z;

/* loaded from: classes.dex */
public interface AquaSportsApiService {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static volatile AquaSportsApiService live_par_Wire;

        private Companion() {
        }

        private final AquaSportsApiService buildWiremethod() {
            int i = 0;
            a aVar = new a();
            t tVar = new t();
            tVar.f21386c.add(aVar);
            u uVar = new u(tVar);
            String apiBa_par_seUrl = AquaSportsDefaults.INSTANCE.getApiBa_par_seUrl();
            if (!AbstractC2234l.r0(apiBa_par_seUrl, "/", false)) {
                apiBa_par_seUrl = apiBa_par_seUrl.concat("/");
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Objects.requireNonNull(apiBa_par_seUrl, "baseUrl == null");
            C1234l6 c1234l6 = new C1234l6();
            c1234l6.c(null, apiBa_par_seUrl);
            n a5 = c1234l6.a();
            ArrayList arrayList3 = a5.f;
            if (!"".equals(arrayList3.get(arrayList3.size() - 1))) {
                throw new IllegalArgumentException("baseUrl must end in /: " + a5);
            }
            arrayList.add(new P4.a(new m()));
            ExecutorC0255a executorC0255a = L.f4138a;
            C0256b c0256b = L.f4140c;
            ArrayList arrayList4 = new ArrayList(arrayList2);
            List a6 = c0256b.a(executorC0255a);
            arrayList4.addAll(a6);
            List b3 = c0256b.b();
            ArrayList arrayList5 = new ArrayList(arrayList.size() + 1 + b3.size());
            arrayList5.add(new C0257c(i));
            arrayList5.addAll(arrayList);
            arrayList5.addAll(b3);
            List unmodifiableList = Collections.unmodifiableList(arrayList5);
            List unmodifiableList2 = Collections.unmodifiableList(arrayList4);
            a6.size();
            C0375o c0375o = new C0375o(uVar, a5, unmodifiableList, unmodifiableList2, executorC0255a);
            if (!AquaSportsApiService.class.isInterface()) {
                throw new IllegalArgumentException("API declarations must be interfaces.");
            }
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(AquaSportsApiService.class);
            while (!arrayDeque.isEmpty()) {
                Class cls = (Class) arrayDeque.removeFirst();
                if (cls.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls.getName());
                    if (cls != AquaSportsApiService.class) {
                        sb.append(" which is an interface of ");
                        sb.append(AquaSportsApiService.class.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls.getInterfaces());
            }
            Object newProxyInstance = Proxy.newProxyInstance(AquaSportsApiService.class.getClassLoader(), new Class[]{AquaSportsApiService.class}, new T(c0375o));
            l.e("create(...)", newProxyInstance);
            return (AquaSportsApiService) newProxyInstance;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final z buildWiremethod$lambda$3(o oVar) {
            l.f("relay", oVar);
            f fVar = (f) oVar;
            C0375o h3 = fVar.f980e.h();
            h3.j("Accept", "application/json");
            AquaSportsDefaults aquaSportsDefaults = AquaSportsDefaults.INSTANCE;
            h3.j("X-RapidAPI-Key", aquaSportsDefaults.getApiS_par_ecret());
            h3.j("X-RapidAPI-Host", aquaSportsDefaults.getApiAut_par_hority());
            return fVar.b(h3.m());
        }

        public final void forgetLmeansiveWire() {
            synchronized (this) {
                live_par_Wire = null;
            }
        }

        public final AquaSportsApiService getLive_arg() {
            AquaSportsApiService aquaSportsApiService = live_par_Wire;
            if (aquaSportsApiService != null) {
                return aquaSportsApiService;
            }
            synchronized (this) {
                AquaSportsApiService aquaSportsApiService2 = live_par_Wire;
                if (aquaSportsApiService2 != null) {
                    return aquaSportsApiService2;
                }
                AquaSportsApiService buildWiremethod = $$INSTANCE.buildWiremethod();
                live_par_Wire = buildWiremethod;
                return buildWiremethod;
            }
        }
    }

    public static final class DefaultImpls {
        public static /* synthetic */ Object requestCmeanslubRoster$default(AquaSportsApiService aquaSportsApiService, int i, int i5, int i6, c cVar, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestCmeanslubRoster");
            }
            if ((i7 & 4) != 0) {
                i6 = 1;
            }
            return aquaSportsApiService.requestCmeanslubRoster(i, i5, i6, cVar);
        }
    }

    @Q4.f("players")
    Object requestCmeanslubRoster(@Q4.t("team") int i, @Q4.t("season") int i5, @Q4.t("page") int i6, c<? super AquaSignalEnvelope<AquaPlayerSheet>> cVar);

    @Q4.f("teams")
    Object requestCmeanslubSheet(@Q4.t("id") int i, c<? super AquaSignalEnvelope<AquaClubSheet>> cVar);

    @Q4.f("leagues")
    Object requestCompmeansetitionCard(@Q4.t("id") int i, c<? super AquaSignalEnvelope<AquaCompetitionBundle>> cVar);

    @Q4.f("leagues")
    Object requestCompmeansetitionShelf(c<? super AquaSignalEnvelope<AquaCompetitionBundle>> cVar);

    @Q4.f("fixtures/events")
    Object requestMameanstchMoments(@Q4.t("fixture") int i, c<? super AquaSignalEnvelope<AquaMatchMoment>> cVar);

    @Q4.f("fixtures")
    Object requestMmeansatchCard(@Q4.t("id") int i, c<? super AquaSignalEnvelope<AquaMatchTicket>> cVar);

    @Q4.f("fixtures/statistics")
    Object requestMmeansatchStats(@Q4.t("fixture") int i, c<? super AquaSignalEnvelope<AquaStatBundle>> cVar);

    @Q4.f("players")
    Object requestPlmeansayerSheet(@Q4.t("id") int i, @Q4.t("season") int i5, c<? super AquaSignalEnvelope<AquaPlayerSheet>> cVar);

    @Q4.f("fixtures")
    Object requestSemeansasonBoard(@Q4.t("league") int i, @Q4.t("season") int i5, c<? super AquaSignalEnvelope<AquaMatchTicket>> cVar);

    @Q4.f("fixtures/lineups")
    Object requestSmeanshapeCards(@Q4.t("fixture") int i, c<? super AquaSignalEnvelope<AquaShapeBundle>> cVar);
}
