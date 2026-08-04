package U5;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: U5.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0452t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D3.h f6587c = new D3.h(String.valueOf(','), 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0452t f6588d = new C0452t(C0443j.f6510b, false, new C0452t(new C0443j(2), true, new C0452t()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f6589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f6590b;

    public C0452t(InterfaceC0444k interfaceC0444k, boolean z4, C0452t c0452t) {
        String strD = interfaceC0444k.d();
        p113p3.f.d("Comma is currently not allowed in message encoding", !strD.contains(","));
        int size = c0452t.f6589a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c0452t.f6589a.containsKey(interfaceC0444k.d()) ? size : size + 1);
        for (C0451s c0451s : c0452t.f6589a.values()) {
            String strD2 = c0451s.f6585a.d();
            if (!strD2.equals(strD)) {
                linkedHashMap.put(strD2, new C0451s(c0451s.f6585a, c0451s.f6586b));
            }
        }
        linkedHashMap.put(strD, new C0451s(interfaceC0444k, z4));
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.f6589a = mapUnmodifiableMap;
        HashSet hashSet = new HashSet(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            if (((C0451s) entry.getValue()).f6586b) {
                hashSet.add((String) entry.getKey());
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        D3.h hVar = f6587c;
        hVar.getClass();
        Iterator it = setUnmodifiableSet.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) hVar.f1721a);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
            this.f6590b = sb.toString().getBytes(Charset.forName("US-ASCII"));
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    public C0452t() {
        this.f6589a = new LinkedHashMap(0);
        this.f6590b = new byte[0];
    }
}
