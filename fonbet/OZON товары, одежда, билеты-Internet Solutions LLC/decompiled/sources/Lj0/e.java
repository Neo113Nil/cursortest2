package Lj0;

import Sc.r;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import fi0.x;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.logging.business.LogSource;
import ru.ozon.tracker.sendEvent.repository.EventRepository;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ib.a<sj.d> f17125a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Ib.a<EventRepository> f17126b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Ib.a<g> f17127c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final x f17128d;

    public e(@NotNull Ib.a<sj.d> ozonLoggerLazy, @NotNull Ib.a<EventRepository> repositoryLazy, @NotNull Ib.a<g> loggerEnabledHandler, @NotNull x settings) {
        Intrinsics.checkNotNullParameter(ozonLoggerLazy, "ozonLoggerLazy");
        Intrinsics.checkNotNullParameter(repositoryLazy, "repositoryLazy");
        Intrinsics.checkNotNullParameter(loggerEnabledHandler, "loggerEnabledHandler");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f17125a = ozonLoggerLazy;
        this.f17126b = repositoryLazy;
        this.f17127c = loggerEnabledHandler;
        this.f17128d = settings;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(2:3|(10:5|6|7|(1:(4:10|11|12|13)(2:28|29))(2:30|(2:32|33)(4:34|35|36|(1:38)(1:39)))|14|15|16|(1:18)|19|20))|7|(0)(0)|14|15|16|(0)|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull String method, String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        a aVar;
        int i11;
        LogSource logSource;
        String str2;
        e context_receiver_0;
        e eVar;
        Object countNotPendingEvents;
        Object a11;
        try {
            if (cVar instanceof a) {
                aVar = (a) cVar;
                int i12 = aVar.f17101l;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    aVar.f17101l = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = aVar.f17099j;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = aVar.f17101l;
                    if (i11 != 0) {
                        s.b(obj);
                        if (!this.f17127c.get().b()) {
                            return Unit.f71690a;
                        }
                        logSource = LogSource.Database;
                        str2 = "Internal database error";
                        try {
                            EventRepository eventRepository = this.f17126b.get();
                            aVar.f17093d = this;
                            aVar.f17094e = method;
                            aVar.f17095f = str;
                            aVar.f17096g = this;
                            aVar.f17097h = logSource;
                            aVar.f17098i = "Internal database error";
                            aVar.f17101l = 1;
                            countNotPendingEvents = eventRepository.getCountNotPendingEvents(aVar);
                            if (countNotPendingEvents == aVar2) {
                                return aVar2;
                            }
                            context_receiver_0 = this;
                            eVar = context_receiver_0;
                        } catch (Throwable th2) {
                            th = th2;
                            context_receiver_0 = this;
                            eVar = context_receiver_0;
                            r.Companion companion = r.INSTANCE;
                            a11 = s.a(th);
                            if (a11 instanceof r.b) {
                            }
                            Tc.d builder = new Tc.d();
                            i.c(eVar, builder, logSource);
                            i.d(eVar, builder, eVar.f17128d.B());
                            i.a(eVar, builder, (Long) a11);
                            i.b(eVar, builder, str);
                            Intrinsics.checkNotNullParameter(builder, "<this>");
                            Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
                            Intrinsics.checkNotNullParameter(method, "method");
                            String lowerCase = method.toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            builder.put("database_method", lowerCase);
                            Intrinsics.checkNotNullParameter(builder, "builder");
                            eVar.f17125a.get().f(ru.ozon.android.ozonLogger.core.c.ERROR, str2, sj.f.a(builder.u()), Boolean.FALSE);
                            return Unit.f71690a;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str3 = aVar.f17098i;
                        LogSource logSource2 = aVar.f17097h;
                        e eVar2 = aVar.f17096g;
                        String str4 = aVar.f17095f;
                        String str5 = aVar.f17094e;
                        e eVar3 = aVar.f17093d;
                        try {
                            s.b(obj);
                            str2 = str3;
                            method = str5;
                            eVar = eVar2;
                            context_receiver_0 = eVar3;
                            countNotPendingEvents = obj;
                            logSource = logSource2;
                            str = str4;
                        } catch (Throwable th3) {
                            str2 = str3;
                            method = str5;
                            eVar = eVar2;
                            context_receiver_0 = eVar3;
                            th = th3;
                            logSource = logSource2;
                            str = str4;
                            r.Companion companion2 = r.INSTANCE;
                            a11 = s.a(th);
                            if (a11 instanceof r.b) {
                            }
                            Tc.d builder2 = new Tc.d();
                            i.c(eVar, builder2, logSource);
                            i.d(eVar, builder2, eVar.f17128d.B());
                            i.a(eVar, builder2, (Long) a11);
                            i.b(eVar, builder2, str);
                            Intrinsics.checkNotNullParameter(builder2, "<this>");
                            Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
                            Intrinsics.checkNotNullParameter(method, "method");
                            String lowerCase2 = method.toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                            builder2.put("database_method", lowerCase2);
                            Intrinsics.checkNotNullParameter(builder2, "builder");
                            eVar.f17125a.get().f(ru.ozon.android.ozonLogger.core.c.ERROR, str2, sj.f.a(builder2.u()), Boolean.FALSE);
                            return Unit.f71690a;
                        }
                    }
                    a11 = new Long(((Number) countNotPendingEvents).longValue());
                    r.Companion companion3 = r.INSTANCE;
                    if (a11 instanceof r.b) {
                        a11 = null;
                    }
                    Tc.d builder22 = new Tc.d();
                    i.c(eVar, builder22, logSource);
                    i.d(eVar, builder22, eVar.f17128d.B());
                    i.a(eVar, builder22, (Long) a11);
                    i.b(eVar, builder22, str);
                    Intrinsics.checkNotNullParameter(builder22, "<this>");
                    Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
                    Intrinsics.checkNotNullParameter(method, "method");
                    String lowerCase22 = method.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase22, "toLowerCase(...)");
                    builder22.put("database_method", lowerCase22);
                    Intrinsics.checkNotNullParameter(builder22, "builder");
                    eVar.f17125a.get().f(ru.ozon.android.ozonLogger.core.c.ERROR, str2, sj.f.a(builder22.u()), Boolean.FALSE);
                    return Unit.f71690a;
                }
            }
            if (i11 != 0) {
            }
            a11 = new Long(((Number) countNotPendingEvents).longValue());
            r.Companion companion32 = r.INSTANCE;
            if (a11 instanceof r.b) {
            }
            Tc.d builder222 = new Tc.d();
            i.c(eVar, builder222, logSource);
            i.d(eVar, builder222, eVar.f17128d.B());
            i.a(eVar, builder222, (Long) a11);
            i.b(eVar, builder222, str);
            Intrinsics.checkNotNullParameter(builder222, "<this>");
            Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
            Intrinsics.checkNotNullParameter(method, "method");
            String lowerCase222 = method.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase222, "toLowerCase(...)");
            builder222.put("database_method", lowerCase222);
            Intrinsics.checkNotNullParameter(builder222, "builder");
            eVar.f17125a.get().f(ru.ozon.android.ozonLogger.core.c.ERROR, str2, sj.f.a(builder222.u()), Boolean.FALSE);
            return Unit.f71690a;
        } catch (CancellationException e11) {
            throw e11;
        }
        aVar = new a(this, cVar);
        Object obj2 = aVar.f17099j;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f17101l;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(2:3|(10:5|6|7|(1:(4:10|11|12|13)(2:28|29))(2:30|(2:32|33)(4:34|35|36|(1:38)(1:39)))|14|15|16|(1:18)|19|20))|7|(0)(0)|14|15|16|(0)|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        b bVar;
        int i11;
        String str2;
        LogSource logSource;
        Throwable th2;
        e eVar;
        Object a11;
        try {
            if (cVar instanceof b) {
                bVar = (b) cVar;
                int i12 = bVar.f17108j;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    bVar.f17108j = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = bVar.f17106h;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = bVar.f17108j;
                    if (i11 != 0) {
                        s.b(obj);
                        if (!this.f17127c.get().c()) {
                            return Unit.f71690a;
                        }
                        LogSource logSource2 = LogSource.Database;
                        str2 = "Deserialization error";
                        try {
                            EventRepository eventRepository = this.f17126b.get();
                            bVar.f17102d = this;
                            bVar.f17103e = str;
                            bVar.f17104f = logSource2;
                            bVar.f17105g = "Deserialization error";
                            bVar.f17108j = 1;
                            Object countNotPendingEvents = eventRepository.getCountNotPendingEvents(bVar);
                            if (countNotPendingEvents == aVar) {
                                return aVar;
                            }
                            logSource = logSource2;
                            obj = countNotPendingEvents;
                            eVar = this;
                        } catch (Throwable th3) {
                            logSource = logSource2;
                            th2 = th3;
                            eVar = this;
                            r.Companion companion = r.INSTANCE;
                            a11 = s.a(th2);
                            if (a11 instanceof r.b) {
                            }
                            Tc.d builder = new Tc.d();
                            i.c(eVar, builder, logSource);
                            i.d(eVar, builder, eVar.f17128d.B());
                            i.a(eVar, builder, (Long) a11);
                            i.b(eVar, builder, str);
                            Intrinsics.checkNotNullParameter(builder, "builder");
                            eVar.f17125a.get().f(ru.ozon.android.ozonLogger.core.c.ERROR, str2, sj.f.a(builder.u()), Boolean.FALSE);
                            return Unit.f71690a;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str3 = bVar.f17105g;
                        logSource = bVar.f17104f;
                        String str4 = bVar.f17103e;
                        eVar = bVar.f17102d;
                        try {
                            s.b(obj);
                            str2 = str3;
                            str = str4;
                        } catch (Throwable th4) {
                            th2 = th4;
                            str2 = str3;
                            str = str4;
                            r.Companion companion2 = r.INSTANCE;
                            a11 = s.a(th2);
                            if (a11 instanceof r.b) {
                            }
                            Tc.d builder2 = new Tc.d();
                            i.c(eVar, builder2, logSource);
                            i.d(eVar, builder2, eVar.f17128d.B());
                            i.a(eVar, builder2, (Long) a11);
                            i.b(eVar, builder2, str);
                            Intrinsics.checkNotNullParameter(builder2, "builder");
                            eVar.f17125a.get().f(ru.ozon.android.ozonLogger.core.c.ERROR, str2, sj.f.a(builder2.u()), Boolean.FALSE);
                            return Unit.f71690a;
                        }
                    }
                    a11 = new Long(((Number) obj).longValue());
                    r.Companion companion3 = r.INSTANCE;
                    if (a11 instanceof r.b) {
                        a11 = null;
                    }
                    Tc.d builder22 = new Tc.d();
                    i.c(eVar, builder22, logSource);
                    i.d(eVar, builder22, eVar.f17128d.B());
                    i.a(eVar, builder22, (Long) a11);
                    i.b(eVar, builder22, str);
                    Intrinsics.checkNotNullParameter(builder22, "builder");
                    eVar.f17125a.get().f(ru.ozon.android.ozonLogger.core.c.ERROR, str2, sj.f.a(builder22.u()), Boolean.FALSE);
                    return Unit.f71690a;
                }
            }
            if (i11 != 0) {
            }
            a11 = new Long(((Number) obj).longValue());
            r.Companion companion32 = r.INSTANCE;
            if (a11 instanceof r.b) {
            }
            Tc.d builder222 = new Tc.d();
            i.c(eVar, builder222, logSource);
            i.d(eVar, builder222, eVar.f17128d.B());
            i.a(eVar, builder222, (Long) a11);
            i.b(eVar, builder222, str);
            Intrinsics.checkNotNullParameter(builder222, "builder");
            eVar.f17125a.get().f(ru.ozon.android.ozonLogger.core.c.ERROR, str2, sj.f.a(builder222.u()), Boolean.FALSE);
            return Unit.f71690a;
        } catch (CancellationException e11) {
            throw e11;
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f17106h;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f17108j;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(1:(4:10|11|12|13)(2:28|29))(2:30|(2:32|33)(4:34|35|36|(1:38)(1:39)))|14|15|16|(1:18)|19|20))|45|6|7|(0)(0)|14|15|16|(0)|19|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i11, String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        c cVar2;
        int i12;
        String str2;
        e eVar;
        LogSource logSource;
        Throwable th2;
        e context_receiver_0;
        Object a11;
        try {
            if (cVar instanceof c) {
                cVar2 = (c) cVar;
                int i13 = cVar2.f17117l;
                if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    cVar2.f17117l = i13 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = cVar2.f17115j;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i12 = cVar2.f17117l;
                    if (i12 != 0) {
                        s.b(obj);
                        if (!this.f17127c.get().d()) {
                            return Unit.f71690a;
                        }
                        LogSource logSource2 = LogSource.Networking;
                        str2 = "Networking error";
                        try {
                            EventRepository eventRepository = this.f17126b.get();
                            cVar2.f17109d = this;
                            cVar2.f17110e = str;
                            cVar2.f17111f = this;
                            cVar2.f17112g = logSource2;
                            cVar2.f17113h = "Networking error";
                            cVar2.f17114i = i11;
                            cVar2.f17117l = 1;
                            Object countNotPendingEvents = eventRepository.getCountNotPendingEvents(cVar2);
                            if (countNotPendingEvents == aVar) {
                                return aVar;
                            }
                            eVar = this;
                            logSource = logSource2;
                            obj = countNotPendingEvents;
                            context_receiver_0 = eVar;
                        } catch (Throwable th3) {
                            eVar = this;
                            logSource = logSource2;
                            th2 = th3;
                            context_receiver_0 = eVar;
                            r.Companion companion = r.INSTANCE;
                            a11 = s.a(th2);
                            if (a11 instanceof r.b) {
                            }
                            Tc.d builder = new Tc.d();
                            i.c(eVar, builder, logSource);
                            i.d(eVar, builder, eVar.f17128d.B());
                            i.a(eVar, builder, (Long) a11);
                            i.b(eVar, builder, str);
                            Intrinsics.checkNotNullParameter(builder, "<this>");
                            Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
                            builder.put("response_code", Integer.valueOf(i11));
                            Intrinsics.checkNotNullParameter(builder, "builder");
                            eVar.f17125a.get().f(ru.ozon.android.ozonLogger.core.c.ERROR, str2, sj.f.a(builder.u()), Boolean.FALSE);
                            return Unit.f71690a;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i11 = cVar2.f17114i;
                        String str3 = cVar2.f17113h;
                        logSource = cVar2.f17112g;
                        e eVar2 = cVar2.f17111f;
                        String str4 = cVar2.f17110e;
                        context_receiver_0 = cVar2.f17109d;
                        try {
                            s.b(obj);
                            str2 = str3;
                            str = str4;
                            eVar = eVar2;
                        } catch (Throwable th4) {
                            th2 = th4;
                            str2 = str3;
                            str = str4;
                            eVar = eVar2;
                            r.Companion companion2 = r.INSTANCE;
                            a11 = s.a(th2);
                            if (a11 instanceof r.b) {
                            }
                            Tc.d builder2 = new Tc.d();
                            i.c(eVar, builder2, logSource);
                            i.d(eVar, builder2, eVar.f17128d.B());
                            i.a(eVar, builder2, (Long) a11);
                            i.b(eVar, builder2, str);
                            Intrinsics.checkNotNullParameter(builder2, "<this>");
                            Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
                            builder2.put("response_code", Integer.valueOf(i11));
                            Intrinsics.checkNotNullParameter(builder2, "builder");
                            eVar.f17125a.get().f(ru.ozon.android.ozonLogger.core.c.ERROR, str2, sj.f.a(builder2.u()), Boolean.FALSE);
                            return Unit.f71690a;
                        }
                    }
                    a11 = new Long(((Number) obj).longValue());
                    r.Companion companion3 = r.INSTANCE;
                    if (a11 instanceof r.b) {
                        a11 = null;
                    }
                    Tc.d builder22 = new Tc.d();
                    i.c(eVar, builder22, logSource);
                    i.d(eVar, builder22, eVar.f17128d.B());
                    i.a(eVar, builder22, (Long) a11);
                    i.b(eVar, builder22, str);
                    Intrinsics.checkNotNullParameter(builder22, "<this>");
                    Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
                    builder22.put("response_code", Integer.valueOf(i11));
                    Intrinsics.checkNotNullParameter(builder22, "builder");
                    eVar.f17125a.get().f(ru.ozon.android.ozonLogger.core.c.ERROR, str2, sj.f.a(builder22.u()), Boolean.FALSE);
                    return Unit.f71690a;
                }
            }
            if (i12 != 0) {
            }
            a11 = new Long(((Number) obj).longValue());
            r.Companion companion32 = r.INSTANCE;
            if (a11 instanceof r.b) {
            }
            Tc.d builder222 = new Tc.d();
            i.c(eVar, builder222, logSource);
            i.d(eVar, builder222, eVar.f17128d.B());
            i.a(eVar, builder222, (Long) a11);
            i.b(eVar, builder222, str);
            Intrinsics.checkNotNullParameter(builder222, "<this>");
            Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
            builder222.put("response_code", Integer.valueOf(i11));
            Intrinsics.checkNotNullParameter(builder222, "builder");
            eVar.f17125a.get().f(ru.ozon.android.ozonLogger.core.c.ERROR, str2, sj.f.a(builder222.u()), Boolean.FALSE);
            return Unit.f71690a;
        } catch (CancellationException e11) {
            throw e11;
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f17115j;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i12 = cVar2.f17117l;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(2:3|(10:5|6|7|(1:(4:10|11|12|13)(2:28|29))(2:30|(2:32|33)(4:34|35|36|(1:38)(1:39)))|14|15|16|(1:18)|19|20))|7|(0)(0)|14|15|16|(0)|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        int i11;
        String str2;
        LogSource logSource;
        Throwable th2;
        e eVar;
        Object a11;
        try {
            if (cVar instanceof d) {
                dVar = (d) cVar;
                int i12 = dVar.f17124j;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    dVar.f17124j = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = dVar.f17122h;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = dVar.f17124j;
                    if (i11 != 0) {
                        s.b(obj);
                        if (!this.f17127c.get().d()) {
                            return Unit.f71690a;
                        }
                        LogSource logSource2 = LogSource.Networking;
                        str2 = "Unknown sending error";
                        try {
                            EventRepository eventRepository = this.f17126b.get();
                            dVar.f17118d = this;
                            dVar.f17119e = str;
                            dVar.f17120f = logSource2;
                            dVar.f17121g = "Unknown sending error";
                            dVar.f17124j = 1;
                            Object countNotPendingEvents = eventRepository.getCountNotPendingEvents(dVar);
                            if (countNotPendingEvents == aVar) {
                                return aVar;
                            }
                            logSource = logSource2;
                            obj = countNotPendingEvents;
                            eVar = this;
                        } catch (Throwable th3) {
                            logSource = logSource2;
                            th2 = th3;
                            eVar = this;
                            r.Companion companion = r.INSTANCE;
                            a11 = s.a(th2);
                            if (a11 instanceof r.b) {
                            }
                            Tc.d builder = new Tc.d();
                            i.c(eVar, builder, logSource);
                            i.d(eVar, builder, eVar.f17128d.B());
                            i.a(eVar, builder, (Long) a11);
                            i.b(eVar, builder, str);
                            Intrinsics.checkNotNullParameter(builder, "builder");
                            eVar.f17125a.get().f(ru.ozon.android.ozonLogger.core.c.ERROR, str2, sj.f.a(builder.u()), Boolean.FALSE);
                            return Unit.f71690a;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str3 = dVar.f17121g;
                        logSource = dVar.f17120f;
                        String str4 = dVar.f17119e;
                        eVar = dVar.f17118d;
                        try {
                            s.b(obj);
                            str2 = str3;
                            str = str4;
                        } catch (Throwable th4) {
                            th2 = th4;
                            str2 = str3;
                            str = str4;
                            r.Companion companion2 = r.INSTANCE;
                            a11 = s.a(th2);
                            if (a11 instanceof r.b) {
                            }
                            Tc.d builder2 = new Tc.d();
                            i.c(eVar, builder2, logSource);
                            i.d(eVar, builder2, eVar.f17128d.B());
                            i.a(eVar, builder2, (Long) a11);
                            i.b(eVar, builder2, str);
                            Intrinsics.checkNotNullParameter(builder2, "builder");
                            eVar.f17125a.get().f(ru.ozon.android.ozonLogger.core.c.ERROR, str2, sj.f.a(builder2.u()), Boolean.FALSE);
                            return Unit.f71690a;
                        }
                    }
                    a11 = new Long(((Number) obj).longValue());
                    r.Companion companion3 = r.INSTANCE;
                    if (a11 instanceof r.b) {
                        a11 = null;
                    }
                    Tc.d builder22 = new Tc.d();
                    i.c(eVar, builder22, logSource);
                    i.d(eVar, builder22, eVar.f17128d.B());
                    i.a(eVar, builder22, (Long) a11);
                    i.b(eVar, builder22, str);
                    Intrinsics.checkNotNullParameter(builder22, "builder");
                    eVar.f17125a.get().f(ru.ozon.android.ozonLogger.core.c.ERROR, str2, sj.f.a(builder22.u()), Boolean.FALSE);
                    return Unit.f71690a;
                }
            }
            if (i11 != 0) {
            }
            a11 = new Long(((Number) obj).longValue());
            r.Companion companion32 = r.INSTANCE;
            if (a11 instanceof r.b) {
            }
            Tc.d builder222 = new Tc.d();
            i.c(eVar, builder222, logSource);
            i.d(eVar, builder222, eVar.f17128d.B());
            i.a(eVar, builder222, (Long) a11);
            i.b(eVar, builder222, str);
            Intrinsics.checkNotNullParameter(builder222, "builder");
            eVar.f17125a.get().f(ru.ozon.android.ozonLogger.core.c.ERROR, str2, sj.f.a(builder222.u()), Boolean.FALSE);
            return Unit.f71690a;
        } catch (CancellationException e11) {
            throw e11;
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f17122h;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dVar.f17124j;
    }
}
