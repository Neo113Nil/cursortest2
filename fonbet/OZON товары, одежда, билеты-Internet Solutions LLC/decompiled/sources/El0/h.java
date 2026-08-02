package El0;

import Sc.r;
import Sc.s;
import Sl0.a;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Zl0.f f8070a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Pl0.b f8071b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Za.d f8072c;

    public h(@NotNull Zl0.f clientDispatcher, @NotNull Pl0.b authIPCClientInitializer, @NotNull Za.d logger) {
        Intrinsics.checkNotNullParameter(clientDispatcher, "clientDispatcher");
        Intrinsics.checkNotNullParameter(authIPCClientInitializer, "authIPCClientInitializer");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f8070a = clientDispatcher;
        this.f8071b = authIPCClientInitializer;
        this.f8072c = logger.c("ValidationComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x01e0, code lost:
    
        if (r6.invoke(r2) != r3) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01ac, code lost:
    
        if (r7.f8070a.c(r4, r2) == r3) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x020a, code lost:
    
        if (r7.f8070a.c(r4, r2) == r3) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x022f, code lost:
    
        if (r8.f8070a.c(r9, r2) == r3) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0210  */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull Application application, @NotNull Function1 function1, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        g gVar;
        Application application2;
        Function1 function12;
        h hVar;
        Iterator it;
        Object obj;
        boolean z11;
        Object a11;
        Function1 function13;
        h hVar2;
        List list;
        boolean contains;
        Throwable b11;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i11 = gVar.f8069i;
            if ((i11 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                gVar.f8069i = i11 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = gVar.f8067g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                switch (gVar.f8069i) {
                    case 0:
                        s.b(obj2);
                        Pl0.b bVar = this.f8071b;
                        gVar.f8064d = this;
                        application2 = application;
                        gVar.f8065e = application2;
                        function12 = function1;
                        gVar.f8066f = function12;
                        gVar.f8069i = 1;
                        obj2 = bVar.invoke(gVar);
                        if (obj2 != aVar) {
                            hVar = this;
                            Kl0.a aVar2 = (Kl0.a) obj2;
                            ArrayList arrayList = new ArrayList();
                            PackageManager packageManager = application2.getPackageManager();
                            Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
                            hVar.getClass();
                            it = aVar2.a().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = null;
                                } else {
                                    obj = it.next();
                                    String packageName = ((Za.a) obj).a();
                                    Intrinsics.checkNotNullParameter(packageManager, "<this>");
                                    Intrinsics.checkNotNullParameter(packageName, "packageName");
                                    List<String> c11 = Eb.h.c(packageManager);
                                    if (c11.isEmpty()) {
                                        Intrinsics.checkNotNullParameter(packageManager, "<this>");
                                        Intrinsics.checkNotNullParameter(packageName, "packageName");
                                        try {
                                            packageManager.getPackageInfo(packageName, 0);
                                            contains = true;
                                        } catch (PackageManager.NameNotFoundException unused) {
                                            contains = false;
                                        }
                                    } else {
                                        contains = c11.contains(packageName);
                                    }
                                    if (contains) {
                                    }
                                }
                            }
                            Za.d dVar = hVar.f8072c;
                            if (obj != null) {
                                dVar.error("Host push app is not installed!", null);
                                arrayList.add(new a.b("Need to install host push app"));
                                gVar.f8064d = null;
                                gVar.f8065e = null;
                                gVar.f8066f = null;
                                gVar.f8069i = 2;
                                break;
                            } else {
                                List<Za.a> a12 = aVar2.a();
                                if (!(a12 instanceof Collection) || !a12.isEmpty()) {
                                    for (Za.a aVar3 : a12) {
                                        if (Intrinsics.d(aVar3.a(), "ru.vk.store.qa") || Intrinsics.d(aVar3.a(), "ru.vk.store")) {
                                            String packageName2 = aVar3.a();
                                            Intrinsics.checkNotNullParameter(application2, "<this>");
                                            Intrinsics.checkNotNullParameter(packageName2, "packageName");
                                            Object systemService = application2.getSystemService("power");
                                            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
                                            if (powerManager != null && powerManager.isIgnoringBatteryOptimizations(packageName2)) {
                                                z11 = true;
                                                if (!z11) {
                                                    gVar.f8064d = hVar;
                                                    gVar.f8065e = function12;
                                                    gVar.f8066f = arrayList;
                                                    gVar.f8069i = 3;
                                                    a11 = aVar2.a(gVar);
                                                    if (a11 != aVar) {
                                                        function13 = function12;
                                                        hVar2 = hVar;
                                                        list = arrayList;
                                                        b11 = r.b(a11);
                                                        if (b11 != null) {
                                                            boolean booleanValue = ((Boolean) a11).booleanValue();
                                                            hVar2.f8072c.info("User is authorized: " + booleanValue);
                                                            if (!booleanValue) {
                                                                list.add(new a.c("User is not authorized!"));
                                                            }
                                                            if (!list.isEmpty()) {
                                                                gVar.f8064d = function13;
                                                                gVar.f8065e = list;
                                                                gVar.f8066f = null;
                                                                gVar.f8069i = 4;
                                                                break;
                                                            }
                                                            gVar.f8064d = null;
                                                            gVar.f8065e = null;
                                                            gVar.f8066f = null;
                                                            gVar.f8069i = 5;
                                                            break;
                                                        } else {
                                                            hVar2.f8072c.b("Request of user's authorization is failed", b11);
                                                            String message = b11.getMessage();
                                                            if (message == null) {
                                                                message = "";
                                                            }
                                                            list.add(new a.c(message));
                                                            gVar.f8064d = null;
                                                            gVar.f8065e = null;
                                                            gVar.f8066f = null;
                                                            gVar.f8069i = 6;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            z11 = false;
                                            if (!z11) {
                                            }
                                        }
                                    }
                                }
                                dVar.error("Work in background is not allowed!", null);
                                arrayList.add(new a.C0529a());
                                gVar.f8064d = hVar;
                                gVar.f8065e = function12;
                                gVar.f8066f = arrayList;
                                gVar.f8069i = 3;
                                a11 = aVar2.a(gVar);
                                if (a11 != aVar) {
                                }
                            }
                        }
                        return aVar;
                    case 1:
                        Function1 function14 = (Function1) gVar.f8066f;
                        ?? r72 = (Context) gVar.f8065e;
                        hVar = (h) gVar.f8064d;
                        s.b(obj2);
                        function12 = function14;
                        application2 = r72;
                        Kl0.a aVar22 = (Kl0.a) obj2;
                        ArrayList arrayList2 = new ArrayList();
                        PackageManager packageManager2 = application2.getPackageManager();
                        Intrinsics.checkNotNullExpressionValue(packageManager2, "context.packageManager");
                        hVar.getClass();
                        it = aVar22.a().iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        Za.d dVar2 = hVar.f8072c;
                        if (obj != null) {
                        }
                        return aVar;
                    case 2:
                        s.b(obj2);
                        return Unit.f71690a;
                    case 3:
                        list = (List) gVar.f8066f;
                        function13 = (Function1) gVar.f8065e;
                        hVar2 = (h) gVar.f8064d;
                        s.b(obj2);
                        a11 = ((r) obj2).getF26106a();
                        b11 = r.b(a11);
                        if (b11 != null) {
                        }
                        return aVar;
                    case 4:
                        list = (List) gVar.f8065e;
                        function13 = (Function1) gVar.f8064d;
                        s.b(obj2);
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (((Sl0.a) it2.next()).a()) {
                                    return Unit.f71690a;
                                }
                            }
                        }
                        gVar.f8064d = null;
                        gVar.f8065e = null;
                        gVar.f8066f = null;
                        gVar.f8069i = 5;
                        break;
                    case 5:
                    case 6:
                        s.b(obj2);
                        return Unit.f71690a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        gVar = new g(this, cVar);
        Object obj22 = gVar.f8067g;
        Wc.a aVar4 = Wc.a.COROUTINE_SUSPENDED;
        switch (gVar.f8069i) {
        }
    }
}
