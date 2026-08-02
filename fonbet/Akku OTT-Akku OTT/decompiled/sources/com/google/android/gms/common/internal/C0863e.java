package com.google.android.gms.common.internal;

import android.accounts.Account;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0863e {
    public final Account a;
    public final Set b;
    public final Set c;
    public final Map d;
    public final String e;
    public final String f;
    public final com.google.android.gms.signin.a g;
    public Integer h;

    /* renamed from: com.google.android.gms.common.internal.e$a */
    public static final class a {
        public Account a;
        public ArraySet b;
        public String c;
        public String d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.Map] */
    public C0863e(Account account, @NonNull Set set, @NonNull ArrayMap arrayMap, @NonNull String str, @NonNull String str2, com.google.android.gms.signin.a aVar) {
        this.a = account;
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.b = unmodifiableSet;
        ArrayMap arrayMap2 = arrayMap == null ? Collections.EMPTY_MAP : arrayMap;
        this.d = arrayMap2;
        this.e = str;
        this.f = str2;
        this.g = aVar == null ? com.google.android.gms.signin.a.a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = arrayMap2.values().iterator();
        while (it.hasNext()) {
            ((C0883z) it.next()).getClass();
            hashSet.addAll(null);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }
}
