package p000;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: gq */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0258gq {

    /* JADX INFO: renamed from: c */
    public static final g72 f2842c = new g72(String.valueOf(','));

    /* JADX INFO: renamed from: d */
    public static final C0258gq f2843d = new C0258gq(wa0.f8471k, false, new C0258gq(new nc1(16), true, new C0258gq()));

    /* JADX INFO: renamed from: a */
    public final Map f2844a;

    /* JADX INFO: renamed from: b */
    public final byte[] f2845b;

    public C0258gq(InterfaceC0951zh interfaceC0951zh, boolean z, C0258gq c0258gq) {
        String strMo3520v = interfaceC0951zh.mo3520v();
        a90.m122f("Comma is currently not allowed in message encoding", !strMo3520v.contains(","));
        int size = c0258gq.f2844a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c0258gq.f2844a.containsKey(interfaceC0951zh.mo3520v()) ? size : size + 1);
        for (C0220fq c0220fq : c0258gq.f2844a.values()) {
            String strMo3520v2 = c0220fq.f2471a.mo3520v();
            if (!strMo3520v2.equals(strMo3520v)) {
                linkedHashMap.put(strMo3520v2, new C0220fq(c0220fq.f2471a, c0220fq.f2472b));
            }
        }
        linkedHashMap.put(strMo3520v, new C0220fq(interfaceC0951zh, z));
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.f2844a = mapUnmodifiableMap;
        HashSet hashSet = new HashSet(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            if (((C0220fq) entry.getValue()).f2472b) {
                hashSet.add((String) entry.getKey());
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        g72 g72Var = f2842c;
        g72Var.getClass();
        Iterator it = setUnmodifiableSet.iterator();
        StringBuilder sb = new StringBuilder();
        g72Var.m1993a(sb, it);
        this.f2845b = sb.toString().getBytes(Charset.forName("US-ASCII"));
    }

    public C0258gq() {
        this.f2844a = new LinkedHashMap(0);
        this.f2845b = new byte[0];
    }
}
