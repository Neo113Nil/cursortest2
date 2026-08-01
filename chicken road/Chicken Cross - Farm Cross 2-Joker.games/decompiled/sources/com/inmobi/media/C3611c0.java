package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* renamed from: com.inmobi.media.c0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3611c0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f7036a;
    public final String b;
    public final boolean c;
    public final AtomicBoolean d;
    public final String e;
    public Z9 f;

    public C3611c0(WeakReference adUnitEventListener, String adtype, boolean z) {
        Intrinsics.checkNotNullParameter(adUnitEventListener, "adUnitEventListener");
        Intrinsics.checkNotNullParameter(adtype, "adtype");
        this.f7036a = adUnitEventListener;
        this.b = adtype;
        this.c = z;
        this.d = new AtomicBoolean(false);
        this.e = String.valueOf(Reflection.getOrCreateKotlinClass(C3611c0.class).getSimpleName());
    }

    public final void a(C4113tm c4113tm) {
        C3685ej c3685ej;
        C4142um c4142um;
        AtomicBoolean atomicBoolean;
        if (!this.d.getAndSet(true)) {
            C4276zk c4276zk = C4276zk.f7528a;
            String str = this.b;
            Boolean valueOf = Boolean.valueOf(this.c);
            c4276zk.getClass();
            C4276zk.a(str, valueOf);
            AbstractC3781i1 abstractC3781i1 = (AbstractC3781i1) this.f7036a.get();
            if (abstractC3781i1 != null) {
                abstractC3781i1.a(c4113tm);
            } else if (c4113tm != null) {
                c4113tm.b();
            }
            Z9 z9 = this.f;
            if (z9 != null) {
                z9.a(this.e, "==== CHECKPOINT REACHED - IMPRESSION FIRED ====");
            }
            Z9 z92 = this.f;
            if (z92 == null || (c3685ej = z92.f6988a) == null) {
                return;
            }
            c3685ej.a();
            return;
        }
        Z9 z93 = this.f;
        if (z93 != null) {
            z93.c(this.e, "skipping as Impression is already Called");
        }
        if (c4113tm != null) {
            C4092t1 c4092t1 = c4113tm.f7400a;
            if (c4092t1 == null || (c4142um = c4092t1.b) == null || (atomicBoolean = c4142um.f7419a) == null || !atomicBoolean.getAndSet(true)) {
                LinkedHashMap a2 = c4113tm.a();
                a2.put("networkType", Y5.g());
                a2.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2179);
                String str2 = c4113tm.d;
                if (str2 == null) {
                    str2 = "";
                }
                a2.put("impressionId", str2);
                C3829jm c3829jm = C3829jm.f7187a;
                C3829jm.b("AdImpressionSuccessful", a2, EnumC3944nm.f7271a);
            }
        }
    }
}
