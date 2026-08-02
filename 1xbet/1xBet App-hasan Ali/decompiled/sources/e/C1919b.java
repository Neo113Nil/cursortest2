package e;

import A0.AbstractC0015c;
import A0.V;
import G1.C0145p;
import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import c.C0514A;
import c.C0515B;
import c.C0519F;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.l;
import m2.g;

/* renamed from: e.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1919b {

    /* renamed from: a, reason: collision with root package name */
    public final g f16887a;

    /* renamed from: b, reason: collision with root package name */
    public final C0519F f16888b;

    /* JADX WARN: Multi-variable type inference failed */
    public C1919b(g gVar, C0519F c0519f) {
        this.f16887a = gVar;
        this.f16888b = c0519f;
        if ((gVar == null ? c0519f : gVar) == null) {
            throw new IllegalArgumentException("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        }
    }

    public final void a(AbstractC0015c abstractC0015c) {
        g gVar = this.f16887a;
        if (gVar != null) {
            g.d(gVar, (C1918a) abstractC0015c.f475b);
            return;
        }
        C0519F c0519f = this.f16888b;
        if (c0519f == null) {
            throw new IllegalStateException("Unreachable");
        }
        C0145p c0145p = (C0145p) abstractC0015c.f474a;
        l.f("onBackPressedCallback", c0145p);
        C0514A c0514a = new C0514A(c0145p, new C0515B(c0145p, null));
        c0145p.f1925a.add(c0514a);
        g.d(c0519f.a().f7304c, c0514a);
    }

    public final void b(AbstractC0015c abstractC0015c) {
        if (this.f16887a != null) {
            ((C1918a) abstractC0015c.f475b).e();
            return;
        }
        if (this.f16888b == null) {
            throw new IllegalStateException("Unreachable");
        }
        C0145p c0145p = (C0145p) abstractC0015c.f474a;
        CopyOnWriteArrayList copyOnWriteArrayList = c0145p.f1927c;
        Iterator it = copyOnWriteArrayList.iterator();
        l.e("iterator(...)", it);
        while (it.hasNext()) {
            AutoCloseable autoCloseable = (AutoCloseable) it.next();
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                V.v((ExecutorService) autoCloseable);
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
            } else if (autoCloseable instanceof DrmManagerClient) {
                ((DrmManagerClient) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof ContentProviderClient)) {
                    throw new IllegalArgumentException();
                }
                ((ContentProviderClient) autoCloseable).release();
            }
        }
        copyOnWriteArrayList.clear();
        ArrayList arrayList = c0145p.f1925a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C0514A) obj).e();
        }
        arrayList.clear();
    }
}
