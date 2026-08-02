package A;

import B.h;
import C.InterfaceC2694n;
import C.P;
import C.S;
import D.a;
import V.e;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.M;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import v.L0;
import w.C10340H;
import w.C10348a;

/* loaded from: classes8.dex */
public final class a implements D.a {

    /* renamed from: e, reason: collision with root package name */
    private int f157e = 0;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final HashMap f154b = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private HashSet f156d = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ArrayList f153a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private ArrayList f155c = new ArrayList();

    public a(@NonNull C10340H c10340h) {
        Set<Set<String>> hashSet = new HashSet<>();
        try {
            hashSet = c10340h.d();
        } catch (C10348a unused) {
            S.c("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
        }
        Iterator<Set<String>> it = hashSet.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList(it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                try {
                    if (L0.a(str, c10340h) && L0.a(str2, c10340h)) {
                        this.f156d.add(new HashSet(Arrays.asList(str, str2)));
                        HashMap hashMap = this.f154b;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, new ArrayList());
                        }
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        ((List) hashMap.get(str)).add((String) arrayList.get(1));
                        ((List) hashMap.get(str2)).add((String) arrayList.get(0));
                    }
                } catch (P unused2) {
                    S.a("Camera2CameraCoordinator", e.a("Concurrent camera id pair: (", str, ", ", str2, ") is not backward compatible"));
                }
            }
        }
    }

    public final void a(@NonNull M m11) {
        this.f153a.add(m11);
    }

    public final int b() {
        return this.f157e;
    }

    public final String c(@NonNull String str) {
        HashMap hashMap = this.f154b;
        if (!hashMap.containsKey(str)) {
            return null;
        }
        for (String str2 : (List) hashMap.get(str)) {
            Iterator it = this.f155c.iterator();
            while (it.hasNext()) {
                if (str2.equals(h.a((InterfaceC2694n) it.next()).c())) {
                    return str2;
                }
            }
        }
        return null;
    }

    public final void d(int i11) {
        if (i11 != this.f157e) {
            Iterator it = this.f153a.iterator();
            while (it.hasNext()) {
                ((a.InterfaceC0122a) it.next()).a(this.f157e, i11);
            }
        }
        if (this.f157e == 2 && i11 != 2) {
            this.f155c.clear();
        }
        this.f157e = i11;
    }
}
