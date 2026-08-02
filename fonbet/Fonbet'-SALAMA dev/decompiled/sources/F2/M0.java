package F2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class M0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2601a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2602b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f2603c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f2604d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2605e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2606f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2607g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f2608h;

    /* renamed from: i, reason: collision with root package name */
    public final Bundle f2609i;
    public final Set j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2610k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2611l;

    /* renamed from: m, reason: collision with root package name */
    public long f2612m = 0;

    public M0(L0 l02) {
        this.f2601a = (String) l02.j;
        this.f2602b = (ArrayList) l02.f2600m;
        this.f2603c = Collections.unmodifiableSet((HashSet) l02.f2592d);
        this.f2604d = (Bundle) l02.f2595g;
        Collections.unmodifiableMap((HashMap) l02.f2597i);
        this.f2605e = (String) l02.f2598k;
        this.f2606f = (String) l02.f2599l;
        this.f2607g = l02.f2589a;
        this.f2608h = Collections.unmodifiableSet((HashSet) l02.f2593e);
        this.f2609i = (Bundle) l02.f2596h;
        this.j = Collections.unmodifiableSet((HashSet) l02.f2594f);
        this.f2610k = l02.f2591c;
        this.f2611l = l02.f2590b;
    }
}
