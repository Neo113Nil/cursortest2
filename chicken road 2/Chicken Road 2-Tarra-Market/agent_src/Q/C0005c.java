package Q;

import android.content.Intent;
import c0.C0040a;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: Q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0005c implements A0.b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f400a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f401b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f402c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f403d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f404e;

    /* renamed from: f, reason: collision with root package name */
    public Serializable f405f;

    public C0005c(Set set, String str, String str2) {
        C0040a c0040a = C0040a.f699b;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f400a = emptySet;
        Map emptyMap = Collections.emptyMap();
        this.f402c = str;
        this.f403d = str2;
        this.f404e = c0040a;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = emptyMap.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f401b = Collections.unmodifiableSet(hashSet);
    }

    public boolean a(int i2, int i3, Intent intent) {
        Iterator it = new HashSet((HashSet) this.f402c).iterator();
        while (true) {
            boolean z2 = false;
            while (it.hasNext()) {
                HashMap hashMap = ((G0.b) it.next()).f177d;
                if (hashMap.containsKey(Integer.valueOf(i2))) {
                    ((C0.p) hashMap.remove(Integer.valueOf(i2))).c(i3 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
                } else if (z2) {
                }
                z2 = true;
            }
            return z2;
        }
    }

    public C0005c(s0.d dVar, androidx.lifecycle.l lVar) {
        this.f401b = new HashSet();
        this.f402c = new HashSet();
        this.f403d = new HashSet();
        this.f404e = new HashSet();
        new HashSet();
        this.f405f = new HashSet();
        this.f400a = dVar;
        new HiddenLifecycleReference(lVar);
    }
}
