package F2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f2603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f2604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f2608h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bundle f2609i;
    public final Set j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f2610k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2611l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f2612m = 0;

    public M0(L0 l7) {
        this.f2601a = (String) l7.j;
        this.f2602b = (ArrayList) l7.f2600m;
        this.f2603c = Collections.unmodifiableSet((HashSet) l7.f2592d);
        this.f2604d = (Bundle) l7.f2595g;
        Collections.unmodifiableMap((HashMap) l7.f2597i);
        this.f2605e = (String) l7.f2598k;
        this.f2606f = (String) l7.f2599l;
        this.f2607g = l7.f2589a;
        this.f2608h = Collections.unmodifiableSet((HashSet) l7.f2593e);
        this.f2609i = (Bundle) l7.f2596h;
        this.j = Collections.unmodifiableSet((HashSet) l7.f2594f);
        this.f2610k = l7.f2591c;
        this.f2611l = l7.f2590b;
    }
}
