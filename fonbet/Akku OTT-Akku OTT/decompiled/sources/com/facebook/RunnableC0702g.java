package com.facebook;

import com.facebook.C0717k;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.facebook.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0702g implements Runnable {
    public final /* synthetic */ C0717k.d a;
    public final /* synthetic */ C0688a b;
    public final /* synthetic */ AtomicBoolean c;
    public final /* synthetic */ HashSet d;
    public final /* synthetic */ HashSet e;
    public final /* synthetic */ HashSet f;
    public final /* synthetic */ C0717k i;

    public /* synthetic */ RunnableC0702g(C0717k.d dVar, C0688a c0688a, AtomicBoolean atomicBoolean, HashSet hashSet, HashSet hashSet2, HashSet hashSet3, C0717k c0717k) {
        this.a = dVar;
        this.b = c0688a;
        this.c = atomicBoolean;
        this.d = hashSet;
        this.e = hashSet2;
        this.f = hashSet3;
        this.i = c0717k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        C0717k.a aVar;
        long j;
        Date date;
        String str;
        Date date2;
        String str2;
        Date date3;
        C0688a c0688a = this.b;
        C0717k this$0 = this.i;
        AtomicBoolean atomicBoolean = this$0.d;
        C0717k.d refreshResult = this.a;
        Intrinsics.checkNotNullParameter(refreshResult, "$refreshResult");
        AtomicBoolean permissionsCallSucceeded = this.c;
        Intrinsics.checkNotNullParameter(permissionsCallSucceeded, "$permissionsCallSucceeded");
        HashSet permissions = this.d;
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        Collection declinedPermissions = this.e;
        Intrinsics.checkNotNullParameter(declinedPermissions, "$declinedPermissions");
        Collection expiredPermissions = this.f;
        Intrinsics.checkNotNullParameter(expiredPermissions, "$expiredPermissions");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str3 = refreshResult.a;
        int i = refreshResult.b;
        Long l = refreshResult.d;
        String str4 = refreshResult.e;
        try {
            C0717k.a aVar2 = C0717k.Companion;
            if (aVar2.a().c != null) {
                try {
                    C0688a c0688a2 = aVar2.a().c;
                    if ((c0688a2 != null ? c0688a2.k : null) == c0688a.k) {
                        if (!permissionsCallSucceeded.get() && str3 == null && i == 0) {
                            atomicBoolean.set(false);
                            return;
                        }
                        Date date4 = c0688a.a;
                        if (refreshResult.b != 0) {
                            aVar = aVar2;
                            date = new Date(refreshResult.b * 1000);
                            j = 1000;
                        } else {
                            aVar = aVar2;
                            if (refreshResult.c != 0) {
                                j = 1000;
                                date4 = new Date((refreshResult.c * 1000) + new Date().getTime());
                            } else {
                                j = 1000;
                            }
                            date = date4;
                        }
                        if (str3 == null) {
                            str3 = c0688a.e;
                        }
                        String str5 = str3;
                        String str6 = c0688a.j;
                        Set<String> set = permissions;
                        String str7 = c0688a.k;
                        if (!permissionsCallSucceeded.get()) {
                            set = c0688a.b;
                        }
                        Set<String> set2 = set;
                        if (!permissionsCallSucceeded.get()) {
                            declinedPermissions = c0688a.c;
                        }
                        Collection collection = declinedPermissions;
                        if (!permissionsCallSucceeded.get()) {
                            expiredPermissions = c0688a.d;
                        }
                        Collection collection2 = expiredPermissions;
                        EnumC0718l enumC0718l = c0688a.f;
                        Date date5 = new Date();
                        if (l != null) {
                            str = str4;
                            date2 = new Date(l.longValue() * j);
                        } else {
                            str = str4;
                            date2 = c0688a.l;
                        }
                        if (str == null) {
                            date3 = date2;
                            str2 = c0688a.m;
                        } else {
                            Date date6 = date2;
                            str2 = str;
                            date3 = date6;
                        }
                        aVar.a().c(new C0688a(str5, str6, str7, set2, collection, collection2, enumC0718l, date, date5, date3, str2), true);
                        atomicBoolean.set(false);
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    z = false;
                    atomicBoolean.set(z);
                    throw th;
                }
            }
            atomicBoolean.set(false);
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }
}
