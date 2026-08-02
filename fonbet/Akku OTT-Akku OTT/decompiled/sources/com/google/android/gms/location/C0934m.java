package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.C0855e;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.C0863e;
import com.google.android.gms.internal.location.zzaz;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.google.android.gms.location.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0934m extends a.AbstractC0110a<zzaz, a.d.c> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.a.AbstractC0110a
    public final zzaz buildClient(Context context, Looper looper, C0863e c0863e, a.d.c cVar, h.a aVar, h.b bVar) {
        HashSet hashSet = new HashSet();
        new HashSet();
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        Object obj = C0855e.c;
        com.google.android.gms.signin.b bVar2 = com.google.android.gms.signin.e.a;
        new ArrayList();
        new ArrayList();
        context.getMainLooper();
        String packageName = context.getPackageName();
        String name = context.getClass().getName();
        com.google.android.gms.common.api.a aVar2 = com.google.android.gms.signin.e.b;
        return new zzaz(context, looper, aVar, bVar, "activity_recognition", new C0863e(null, hashSet, arrayMap, packageName, name, arrayMap2.containsKey(aVar2) ? (com.google.android.gms.signin.a) arrayMap2.get(aVar2) : com.google.android.gms.signin.a.a));
    }
}
