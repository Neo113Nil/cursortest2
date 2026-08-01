package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.e0;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes5.dex */
public class d0 extends c0 {
    private final String f;
    private final com.applovin.impl.sdk.ad.b g;
    private final List h;
    private final d i;
    private StringBuffer j;
    private final Object k;
    private final ExecutorService l;
    private final String m;
    private List n;
    private List o;

    class a implements e0.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4165a;

        a(String str) {
            this.f4165a = str;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) d0.this.f4150a.a(c5.U0)).booleanValue()) {
                    synchronized (d0.this.k) {
                        StringUtils.replaceAll(d0.this.j, this.f4165a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(d0.this.j, this.f4165a, uri.toString());
                }
                d0.this.g.a(uri.toString(), this.f4165a);
                return;
            }
            com.applovin.impl.sdk.p pVar = d0.this.c;
            if (com.applovin.impl.sdk.p.a()) {
                d0 d0Var = d0.this;
                d0Var.c.a(d0Var.b, "Failed to cache JavaScript resource " + this.f4165a);
            }
            if (d0.this.i != null) {
                d0.this.i.a(d0.this.f, true);
            }
        }
    }

    class b implements e0.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4166a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        b(String str, String str2, String str3) {
            this.f4166a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri == null) {
                if (!d0.this.g.S().contains(this.b + this.c) || d0.this.i == null) {
                    return;
                }
                d0.this.i.a(d0.this.f, true);
                return;
            }
            if (((Boolean) d0.this.f4150a.a(c5.U0)).booleanValue()) {
                synchronized (d0.this.k) {
                    StringUtils.replaceAll(d0.this.j, this.f4166a, uri.toString());
                }
            } else {
                StringUtils.replaceAll(d0.this.j, this.f4166a, uri.toString());
            }
            d0.this.g.a(uri.toString(), this.f4166a);
        }
    }

    class c implements e0.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4167a;

        c(String str) {
            this.f4167a = str;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri == null) {
                if (d0.this.i != null) {
                    d0.this.i.a(d0.this.f, true);
                }
            } else {
                if (((Boolean) d0.this.f4150a.a(c5.U0)).booleanValue()) {
                    synchronized (d0.this.k) {
                        StringUtils.replaceAll(d0.this.j, this.f4167a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(d0.this.j, this.f4167a, uri.toString());
                }
                d0.this.g.a(uri.toString(), this.f4167a);
            }
        }
    }

    public interface d {
        void a(String str, boolean z);
    }

    public d0(String str, com.applovin.impl.sdk.ad.b bVar, List list, ExecutorService executorService, String str2, com.applovin.impl.sdk.l lVar, d dVar) {
        super("AsyncTaskCacheHTMLResources", lVar);
        this.f = str;
        this.g = bVar;
        this.h = list;
        this.l = executorService;
        this.m = str2;
        this.i = dVar;
        this.j = new StringBuffer(str);
        this.k = new Object();
    }

    private HashSet f() {
        HashSet hashSet = new HashSet();
        for (String str : StringUtils.getRegexMatches(StringUtils.match(this.f, (String) this.f4150a.a(c5.r5)), 1)) {
            if (this.e.get()) {
                return null;
            }
            if (StringUtils.isValidString(str)) {
                hashSet.add(new e0(str, this.g, Collections.emptyList(), false, this.m, this.f4150a, new a(str)));
            } else if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Skip caching of non-resource " + str);
            }
        }
        return hashSet;
    }

    private Collection g() {
        HashSet hashSet = new HashSet();
        for (char c2 : ((String) this.f4150a.a(c5.E0)).toCharArray()) {
            hashSet.add(Character.valueOf(c2));
        }
        hashSet.add('\"');
        return hashSet;
    }

    private void a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.l.submit((e0) it.next()));
        }
        this.o = arrayList;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((Future) it2.next()).get();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0017, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private HashSet d() {
        HashSet hashSet = new HashSet();
        List J = this.g.J();
        Collection g = g();
        for (String str : this.h) {
            char c2 = 0;
            int i = 0;
            int i2 = 0;
            while (i < this.f.length()) {
                if (this.e.get()) {
                    return null;
                }
                i = this.f.indexOf(str, i2);
                if (i == -1) {
                    break;
                }
                int length = this.f.length();
                int i3 = i;
                while (!g.contains(Character.valueOf(this.f.charAt(i3))) && i3 < length) {
                    i3++;
                }
                if (i3 <= i || i3 == length) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.c.b(this.b, "Unable to cache resource; ad HTML is invalid.");
                    }
                    return null;
                }
                String substring = this.f.substring(str.length() + i, i3);
                String str2 = str + substring;
                if (StringUtils.isValidString(substring) && !J.contains(str2)) {
                    com.applovin.impl.sdk.ad.b bVar = this.g;
                    String[] strArr = new String[1];
                    strArr[c2] = str;
                    hashSet.add(new e0(str2, bVar, Arrays.asList(strArr), true, this.m, this.f4150a, new b(str2, str, substring)));
                } else if (com.applovin.impl.sdk.p.a()) {
                    this.c.a(this.b, "Skip caching of optional or non-resource " + substring);
                }
                i2 = i3;
                c2 = 0;
            }
        }
        return hashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0022, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private HashSet e() {
        HashSet hashSet = new HashSet();
        List S = this.g.S();
        List J = this.g.J();
        ArrayList arrayList = new ArrayList();
        Collection g = g();
        for (String str : this.h) {
            char c2 = 0;
            int i = 0;
            int i2 = 0;
            while (i < this.f.length()) {
                if (this.e.get()) {
                    return null;
                }
                i = this.f.indexOf(str, i2);
                if (i == -1) {
                    break;
                }
                int length = this.f.length();
                int i3 = i;
                while (!g.contains(Character.valueOf(this.f.charAt(i3))) && i3 < length) {
                    i3++;
                }
                if (i3 <= i || i3 == length) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.c.b(this.b, "Unable to cache resource; ad HTML is invalid.");
                    }
                    return null;
                }
                String substring = this.f.substring(str.length() + i, i3);
                String str2 = str + substring;
                if (!StringUtils.isValidString(substring) || J.contains(str2)) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.c.a(this.b, "Skip caching of optional or non-resource " + substring);
                    }
                } else if (S.contains(str2)) {
                    com.applovin.impl.sdk.ad.b bVar = this.g;
                    String[] strArr = new String[1];
                    strArr[c2] = str;
                    hashSet.add(new e0(str2, bVar, Arrays.asList(strArr), true, this.m, this.f4150a, new c(str2)));
                } else {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.c.a(this.b, "Skip caching of uncategorized resource: " + substring);
                    }
                    arrayList.add(str2);
                }
                i2 = i3;
                c2 = 0;
            }
        }
        this.g.a(arrayList);
        return hashSet;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() {
        HashSet f;
        if (this.e.get()) {
            return Boolean.FALSE;
        }
        if (TextUtils.isEmpty(this.f)) {
            a(this.f);
            return Boolean.FALSE;
        }
        if (!((Boolean) this.f4150a.a(c5.F0)).booleanValue()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Resource caching is disabled, skipping cache...");
            }
            a(this.f);
            return Boolean.FALSE;
        }
        HashSet hashSet = new HashSet();
        HashSet e = ((Boolean) this.f4150a.a(c5.Z0)).booleanValue() ? e() : d();
        if (e != null) {
            hashSet.addAll(e);
        }
        if (((Boolean) this.f4150a.a(c5.q5)).booleanValue() && (f = f()) != null) {
            hashSet.addAll(f);
        }
        this.n = new ArrayList(hashSet);
        if (this.e.get()) {
            return Boolean.FALSE;
        }
        List list = this.n;
        if (list == null || list.isEmpty()) {
            a(this.f);
            return Boolean.FALSE;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Executing " + this.n.size() + " caching operations...");
        }
        if (this.f4150a.s0().e()) {
            a(this.n);
        } else {
            this.l.invokeAll(this.n);
        }
        if (((Boolean) this.f4150a.a(c5.U0)).booleanValue()) {
            synchronized (this.k) {
                a(this.j.toString());
            }
        } else {
            a(this.j.toString());
        }
        return Boolean.TRUE;
    }

    public void c() {
        List list = this.n;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e0) it.next()).a(true);
            }
        }
        List<Future> list2 = this.o;
        if (list2 != null) {
            for (Future future : list2) {
                if (!future.isDone()) {
                    future.cancel(true);
                }
            }
        }
    }

    private void a(String str) {
        d dVar;
        if (this.e.get() || (dVar = this.i) == null) {
            return;
        }
        dVar.a(str, false);
    }
}
