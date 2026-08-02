package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.cl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0855cl {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f13034a = new HashMap();

    public final synchronized C0811bl a(String str) {
        return (C0811bl) this.f13034a.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void b(String str, C0950er c0950er) {
        Yq yq;
        C1651ub o5;
        if (this.f13034a.containsKey(str)) {
            return;
        }
        C1651ub c1651ub = null;
        if (c0950er != null) {
            try {
                o5 = c0950er.f13363a.o();
                if (c0950er != null) {
                    try {
                        c1651ub = c0950er.f13363a.l();
                    } finally {
                        try {
                        } catch (Yq unused) {
                        }
                    }
                }
                boolean z3 = true;
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.W8)).booleanValue()) {
                    if (c0950er != null) {
                        try {
                            c0950er.a();
                        } catch (Yq unused2) {
                        }
                    }
                    z3 = false;
                }
                this.f13034a.put(str, new C0811bl(str, o5, c1651ub, z3));
            } finally {
                try {
                } catch (Yq unused3) {
                }
            }
        }
        o5 = null;
        if (c0950er != null) {
        }
        boolean z32 = true;
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.W8)).booleanValue()) {
        }
        this.f13034a.put(str, new C0811bl(str, o5, c1651ub, z32));
    }
}
